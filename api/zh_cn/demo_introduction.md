CoinMex交易所官方API文档
==================================================
[CoinMex][]交易所开发者文档([English Docs][])。

<!-- TOC -->

- [介绍](#介绍)
- [开始使用](#开始使用)
- [API接口加密验证](#api接口加密验证)
    - [生成API Key](#生成api-key)
    - [发起请求](#发起请求)
    - [签名](#签名)
    - [选择时间戳](#选择时间戳)
    - [请求交互](#请求交互)
        - [请求](#请求)
        - [分页](#分页)
    - [标准规范](#标准规范)
        - [时间戳](#时间戳)
        - [例子](#例子)
        - [数字](#数字)
        - [限流](#限流)
                - [REST API](#rest-api)
- [现货(Spot)业务API参考](#现货spot业务api参考)
    - [币币行情API](#币币行情api)
        - [1. 获取所有币对列表](#1-获取所有币对列表)
        - [2. 获取币对交易深度](#2-获取币对交易深度)
        - [3. 获取币对Ticker](#3-获取币对ticker)
        - [4. 获取币对历史成交记录](#4-获取币对历史成交记录)
        - [5. 获取K线数据](#5-获取k线数据)
        - [6. 获取服务器时间](#6-获取服务器时间)
    - [币币账户API](#币币账户api)
        - [1. 获取账户信息](#1-获取账户信息)
        - [2. 交易委托](#2-交易委托)
        - [3. 撤销所有委托](#3-撤销所有委托)
        - [4. 按订单撤销委托](#4-按订单撤销委托)
        - [5. 查询所有订单](#5-查询所有订单)
        - [6. 按id查询订单](#6-按id查询订单)
        - [7. 获取账单](#7-获取账单)
        - [8. 提现](#8-提现)

<!-- /TOC -->

# 介绍

欢迎使用[CoinMex][]开发者文档。

本文档提供了现货(Spot)业务的账户管理、行情查询、交易功能等相关API的使用方法介绍。
行情API提供市场的公开的行情数据接口，账户和交易API需要身份验证，提供下单、撤单，查询订单和帐户信息等功能。

# 开始使用    
REST，即Representational State Transfer的缩写，是一种流行的互联网传输架构。它具有结构清晰、符合标准、易于理解、扩展方便的，正得到越来越多网站的采用。其优点如下：

+ 在RESTful架构中，每一个URL代表一种资源；
+ 客户端和服务器之间，传递这种资源的某种表现层；
+ 客户端通过四个HTTP指令，对服务器端资源进行操作，实现“表现层状态转化”。

建议开发者使用REST API进行币币交易或者资产提现等操作。

# API接口加密验证
## 生成API Key

在对任何请求进行签名之前，您必须通过 CoinMex 网站【用户中心】-【API】创建一个API key。 创建key后，您将获得3个必须记住的信息：
* API Key

* Secret Key

* Passphrase

API Key 和 Secret Key将由随机生成和提供，Passphrase由用户自己设定。

## 发起请求

所有REST请求都必须包含以下标题：

* ACCESS-KEY API KEY作为一个字符串。
* ACCESS-SIGN 使用base64编码签名（请参阅签名消息）。
* ACCESS-TIMESTAMP 作为您的请求的时间戳。
* ACCESS-PASSPHRASE 您在创建API密钥时设置的口令。
* 所有请求都应该含有application/json类型内容，并且是有效的JSON。

## 签名
ACCESS-SIGN的请求头是对 **timestamp + method + requestPath + "?" + queryString + body** 字符串(+表示字符串连接)使用 **HMAC SHA256** 方法加密，通过**BASE64** 编码输出而得到的。其中，timestamp 的值与 ACCESS-TIMESTAMP 
请求头相同。

* method 是请求方法(POST/GET/PUT/DELETE)，字母全部大写。
* requestPath 是请求接口路径。
* queryString GET请求中的查询字符串
* body 是指请求主体的字符串，如果请求没有主体(通常为GET请求)则body可省略。

**例如：对于如下的请求参数进行签名**

```bash
curl "https://www.coinmex.com/api/v1/spot/ccex/orders?limit=100"       
```
* 获取获取深度信息，以 LTC-BTC 币对为例
```java
Timestamp = 1540286290170 
Method = "GET"
requestPath = "/api/v1/spot/public/products/LTC-BTC/orderbook"
queryString= "?size=100"

```

生成待签名的字符串

```
Message = '1540286290170GET/api/v1/spot/public/products/LTC-BTC/orderbook?size=100'  
```
* 下单，以 LTC-BTC 币对为例

```java
Timestamp = 1540286476248 
Method = "POST"
requestPath = "/api/v1/spot/ccex/orders"
body = {"code":"LTC_BTC","side":"buy","type":"limit","size":"1","price":"1.001"}

```

生成待签名的字符串

```
Message = '1540286476248POST/api/v1/spot/ccex/orders{"code":"LTC-BTC","side":"buy","type":"limit","size":"1","price":"1.001"}'  
```

然后，将待签名字符串添加私钥参数生成最终待签名字符串。


例如：
```
Signature = hmac(secretkey, Message, SHA256)
```
在使用前需要对于Signature进行base64编码

```
Signature = base64.encode(Signature.digest())
```

## 请求交互  

REST访问的根URL：`https://www.coinmex.com`

### 请求

所有请求基于Https协议，请求头信息中Content-Type 需要统一设置为:'application/json’。

**请求交互说明**

1、请求参数：根据接口请求参数规定进行参数封装。

2、提交请求参数：将封装好的请求参数通过POST/GET/DELETE等方式提交至服务器。

3、服务器响应：服务器首先对用户请求数据进行参数安全校验，通过校验后根据业务逻辑将响应数据以JSON格式返回给用户。

4、数据处理：对服务器响应数据进行处理。

**成功**

HTTP状态码200表示成功响应，并可能包含内容。如果响应含有内容，则将显示在相应的返回内容里面。

**常见错误码**

* 400 Bad Request – Invalid request forma 请求格式无效

* 401 Unauthorized – Invalid API Key 无效的API Key

* 403 Forbidden – You do not have access to the requested resource 请求无权限

* 404 Not Found 没有找到请求

* 429 Too Many Requests 请求太频繁被系统限流

* 500 Internal Server Error – We had a problem with our server 服务器内部错误

* 如果失败，response body 带有错误描述信息
### 分页

部分返回数据集的REST请求支持使用游标分页。
游标分页允许在结果的当前页面之前和之后获取结果，并且非常适合于实时数据。根据当前的返回结果，后续请求可以在此基础之上指定请求数据的方向，可以请求在这之前和之后的数据。before和after游标可通过响应头CB_BEFORE和CB_AFTER使用。

**例子**

`GET /orders?before=2&limit=30`

## 标准规范

### 时间戳

除非另外指定，API中的所有时间戳均以微秒为单位返回。

请求签名中的ACCESS-TIMESTAMP的单位是秒，允许用小数表示更精确的时间。请求的时间戳必须在API服务时间的30秒内，否则请求将被视为过期并被拒绝。如果本地服务器时间和API服务器时间之间存在较大的偏差，那么我们建议您使用通过查询API服务器时间来更新http header。

### 例子

1524801032573

### 数字

为了保持跨平台时精度的完整性，十进制数字作为字符串返回。建议您在发起请求时也将数字转换为字符串以避免截断和精度错误。 

整数（如交易编号和顺序）不加引号。

### 限流

如果请求过于频繁系统将自动限制请求，并在http header中返回429 too many requests状态码。

##### REST API

* 公共接口：我们通过IP限制公共接口的调用：每2秒最多6个请求。

* 私人接口：我们通过用户ID限制私人接口的调用：每2秒最多6个请求。

* 某些接口的特殊限制在具体的接口上注明

# 现货(Spot)业务API参考

## 币币行情API

### 1. 获取所有币对列表

**HTTP请求**

```http
    # Request
    GET /api/v1/spot/public/products
```
```javascript
    # Response
    [
        {
            "baseCurrency":"LTC",
            "baseMaxSize":"100000.00",
            "baseMinSize":"0.001",
            "code":"LTC_BTC",
            "quoteCurrency":"BTC",
            "quoteIncrement":"0.00000001"
            "quotePrecision":"8",
            "volumeIncrement":"8"
        },
        {  "baseCurrency":"ETH",
            "baseMaxSize":"100000.00",
            "baseMinSize":"0.001",
            "code":"ETH_BTC",
            "quoteCurrency":"BTC",
            "quoteIncrement":"0.00000001"
            "quotePrecision":"8",
            "volumeIncrement":"8"
        },
        ...
    ]
```

**返回值说明**  


|返回字段 | 字段说明|
| ----------|:-------:|
| code            | 币对代码|
| baseCurrency   | 基础币 |
| quoteCurrency  | 计价币 |
| baseMinSize   | 最小委托量 |
| baseMaxSize   | 最大委托量 |
| quoteIncrement | 最小报价单位 |
| quotePrecision | 报价精度 |
| volumeIncrement | 委托变动单位 |

### 2. 获取币对交易深度

    获取币对盘口深度的请求列表。

**HTTP请求**

```http
    # Request
    GET /api/v1/spot/public/products/<code>/orderbook
```
```javascript
    # Response
    {
        "asks":[
            [
                "10463.3399",
                "0.0025"
            ],
            ...
        ],
        "bids":[
            [
                "7300.2456",
                "0.0022"
            ],
            ...
        ]
    }
```
**返回值说明**  


|返回字段|字段说明|  
| ------------- |----|
| asks | 卖方深度 |
| bids | 买方深度 |

**请求参数**  


| 参数名 | 参数类型  | 必填 | 描述 |
| ------------- |----|----|----|
| Code | String | 是 | 币对, 如 ltc_btc |

### 3. 获取币对Ticker

**HTTP请求**

    最新成交、24h最高、24h最低和24h成交量的快照信息。

```http
    # Request
    GET /api/v1/spot/public/products/<code>/ticker
```

```javascript
    # Response
    [
        1527066527725,
        "8275.1844",
        "7783.8063",
        "7845.2459",
        "451.8678",
        "8249.9494",
        "7845.2459"
    ]
```

**返回值说明（从上到下按顺序)**

 
|返回字段|字段说明|
|--------| :-------: |
|时间戳| 1527066527725 |
|24h 最高|8275.1844|
|24h 最低|7783.8063|
|最新成交价|7845.2459|
|24h成交量|451.8678|
|24h开盘价|8249.9494|
|24h收盘价|7845.2459|
    
    
**请求参数**

|参数名|参数类型|必填|描述|
|------|----|:---:|:---:|
|code|String|是|币对,如 btc_usdt|
    
### 4. 获取币对历史成交记录，支持分页查询

    获取所请求交易对的历史成交信息，该请求支持分页。

**HTTP请求**
```http
    # Request
    GET /api/v1/spot/public/products/<code>/fills
```
```javascript
    # Response
    [
        [
            "0.00329999",
            "10.99999999",
            "buy",
            1524801032573,
            64
        ],
        [
            "10",
            "0.02521534",
            "sell",
            1524801032573,
            62
        ]
    ]
```

**返回值说明（按顺序）**


|返回字段|字段说明|
|--------|----|
|成交价格 |0.00329999|
|成交量 |10.99999999|
|Maker成交方向|Buy|
|成交时间戳| 1524801032573|
|交易编号| 62|

**请求参数**

 |参数名|参数类型|必填|描述|
|-----|:---:|----|----|
|code|String|是|币对，如btc_usdt|
|limit|Integer|否|请求返回数据量，默认最大值 100|

**解释说明**

  + 交易方向 side 表示每一笔成交订单中 maker 下单方向,maker 是指将订单挂在订单深度列表上的交易用户，即被动成交方。

  + buy 代表行情下跌，因为 maker 是买单，maker 的买单被成交，所以价格下跌；相反的情况下，sell代表行情上涨，因为此时maker是卖单，卖单被成交，表示上涨。

### 5. 获取K线数据

**HTTP请求**

```http
    # Request
    GET  /api/v1/spot/public/products/<code>/candles?type=1min&start=start_time&end=end_time
```
    
```javascript
    # Response
    {
        [ 1415398768, 0.32, 0.42, 0.36, 0.41, 12.3 ]
        ...
    }
```

**返回值说明（按顺序）**  
    
|返回字段|字段说明|
|-----|----|
|K线开始时间戳|1415398768|
|最低价|0.32|
|最高价|0.42|
|开盘价（第一笔交易）|0.36|
|收盘价（最后一笔交易）|0.41|

**请求参数**
    
|参数名|参数类型|必填|描述|
|-----|----|----|----|
|code|String|是|币对如btc_usdt|
|type|String|是|K线周期类型如1min/1hour/day/week/month|
|start|String|是|基于ISO 8601标准的开始时间|
|end|String|是|基于ISO 8601标准的结束时间|

### 6. 获取服务器时间

    获取API服务器的时间的接口。此接口不需要身份验证。

**HTTP请求**
```http
    # Request
    
    GET /api/v1/spot/public/time
```
    
```javascript
    # Reponse

    {
        "iso": "2015-01-07T23:47:25.201Z",
        "epoch": 1524801032573
    }
```
    
**返回值说明**
    
|返回字段|字段说明|
|-----|----|
|iso|为iso 8061标准的时间字符串表达的服务器时间|
|epoch|时间戳形式表达的服务器时间|


    iso：返回值为iso 8061标准的时间字符串  
    epoch：返回值为时间戳

## 币币账户API

### 1. 获取账户信息

    获取币币交易账户余额列表，查询各币种的余额，冻结和可用情况

**HTTP请求**

```
    # Request
    GET /api/v1/spot/ccex/account/assets
```
```
    # Response
    [
        {
            "available":"0.1",
            "balance":"0.1",
            "currencyCode":"ETH",
            "hold":"0",
            "id":1
        },
        {
            "available":"1",
            "balance":"1",
            "currencyCode":"USDT",
            "hold":"0",
            "id":1
        }
    ]
```

**返回值说明**

|返回字段|字段说明|
|----|----|
|available|可用资金|
|balance|币种数量|
|currencyCode|币种代码|
|hold|冻结资金|
|id|账户ID|

### 2. 交易委托

    CoinMex 提供限价和市价两种订单类型。

**HTTP请求**
```
    # Request

    POST /api/v1/spot/ccex/orders
```

```javascript
    # Response

    {
        "result": true,
        "order_id": 123456
    }
```
    
**返回值说明**

    + orderId: 订单ID
    + result: 下单结果

**请求参数**

|参数名| 参数类型 |必填|描述|
|:----:|:----:|:---:|----|
|code|String|是|币对如btc_usdt|
|side|String|是|买入为buy，卖出为sell|
|type|String|是|限价委托为limit，市价委托为market
|size|String|否|发出限价委托以及市价卖出委托时传递，代表交易币的数量|
|price|String|否|发出限价委托时传递，代表币对价格
|funds|String|否|发出市价买入委托时传递，代表计价币的数量


### 3. 撤销所有委托

    撤销目标币对下所有未成交委托,由于是异步撤单所以该接口没有返回值。

**HTTP请求**
```
    # Request
    DELETE /api/v1/spot/ccex/orders
```
```javascript
    # Response

    { ...}
```

**请求参数**

|参数名|参数类型|必填|描述|
|----|----| ----| ----|
|code|String|是|币对, 如 btc_usdt|
|orderId|Long[]|否|订单id数组, 如 [10010L,10011L,10012L],目前只支持最多撤销50条订单，如果不填则撤销50条未完成订单|

### 4. 按订单撤销委托

    按照订单id撤销指定订单,由于是异步撤单所以该接口没有返回值。

**HTTP请求**

```http
    # Request
    DELETE /api/v1/spot/ccex/orders/{orderId}
```
```javascript
    # Response
    {...}
```

**请求参数**

|参数名|参数类型|必填|描述|
|---|----|----|----|
|code|String|是|币对,如 btc_usdt|
|orderId|String|是|需要撤销的未成交委托的id（注：url 中的 orderId，如 ：/api/v1/spot/ccex/orders/10010）

### 5. 查询所有订单，支持分页查询

    按照订单状态查询所有订单。
    
**HTTP请求**

```http   
    # Request
    GET /api/v1/spot/ccex/orders?code=eth_btc&status=open
```
```javascript
    # Response
    {
        "averagePrice": "0",
        "code": "chp_eth",
        "createdDate": 1526299182000,
        "filledVolume": "0",
        "funds": "0",
        "orderId": 9865872,
        "orderType": "limit",
        "price": "0.00001",
        "side": "buy",
        "status": "canceled",
        "volume": "1"
    }
```

**返回值说明**

|返回字段|字段说明|
|----|----|
|averagePrice|订单已成交部分均价，如果未成交则为0|
|code|币对如btc_usdt|
|createDate|创建订单的时间戳|
|filledVolume|订单已成交数量|
|funds|订单已成交金额|
|orderId|订单代码|
|price|订单委托价|
|side|订单交易方向|
|status|订单状态|
|volume|订单委托数量|

**请求参数**

|参数名 | 参数类型 | 必填 | 描述 |
|---|----|----|----|
| code|String|是|币对如btc_usdt|
|status|String|是| 订单状态，﻿open（未成交）、filled（已完成）、canceled（已撤销）、cancel（撤销中）、partially-filled（部分成交）|
|limit|Integer|否|请求返回数据量，默认最大值 100|

### 6. 按id查询订单

    按照订单id查询指定订单。

**HTTP请求**
```http
    # Request
    GET /api/v1/spot/ccex/orders/﻿9887828?code=chp_eth
```
```javascript
    # Response 
    {
        "averagePrice":"0",
        "code":"chp_eth",
        "createdDate":9887828,
        "filledVolume":"0",
        "funds":"0",
        "orderId":9865872,
        "orderType":"limit",
        "price":"0.00001",
        "side":"buy",
        "status":"canceled",
        "volume":"1"
    }
```

**返回值说明**
    
|返回字段|字段说明|
|-----|----|
|averagePrice|订单已成交部分均价，如果未成交则为0|
|code|币对如btc_usdt|
|createDate|创建订单的时间戳|
|filledVolume|订单已成交数量|
|funds|订单已成交金额|
|orderId|订单代码|
|price|订单委托价|
|side|订单交易方向|
|status|订单状态|
|volume|订单委托数量|

**请求参数**  
    
|参数名|参数类型|必填|描述|
|-----|----|----|----|
|code|String|是|币对，如 btc_usdt|
|orderId|String|是|订单Id|

### 7. 获取账单，支持分页查询

    获取币币交易账户账单

**HTTP请求**
```http
    # Request
    GET /api/v1/spot/ccex/account/eth/ledger
```
```javascript
    # Response
    {
        "amount": "0.00106415",
        "balance": "0.65106415",
        "createdDate": 1526290483000,
        "details": {
            "orderId":9772566,
            "productId":"ETH_BTC"
        },
        "id": 27826010,
        "type": "buy"
    }
```

**返回值说明**

|返回字段 | 字段说明 |
|----|----|
|amount|账单发生数量|
|balance|账单资产余额|
|createdDate|账单发生时间戳|
|details|账单详情|
|orderId|账单对应订单代码|
|productId|账单对应交易产品代码|
|id|账单代码|
|type|交易类型|

**请求参数**  
    
|参数名|参数类型|必填|描述|
|----|---|---|---|
|currencyCode|String|是| 币种代码，如btc|
|limit|Integer|否|请求返回数据量，默认最大值 100|

### 8. 提现

提现到钱包地址

**HTTP请求**

```http
    # Request
    POST /api/v1/spot/ccex/account/withdraw
```
    
```javascript
    # Response
    { ... }
```

**请求参数** 

|参数名|参数类型|必填|描述  
|---|----|----|----|
|currencyCode|String|是|提现币种名称如BTC|
|amount|String|是|提现数量|
|address|String|是|提现地址|
  

[CoinMex]: https://www.coinmex.com 
[English Docs]: https://github.com/coinmex/coinmex-official-api-docs/blob/master/README_EN.md
[Unix Epoch]: https://en.wikipedia.org/wiki/Unix_time
