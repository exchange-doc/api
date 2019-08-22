#  Exchange官方API文档

#### Exchange交易所开发文档([English Docs](https://github.com/exchange-doc/api/blob/master/api/us_en/api_doc_en.md))
- [介绍](#Introduction)
- [开始使用](#startToUse)
- [API接口加密验证](#a1)
    - [生成API Key](#a2)
    - [发起请求](#a3)
    - [签名](#a4)
    - 选择时间戳
    - [请求交互](#a6)
        - [请求](#a7)
        - [分页](#a8)
    - [标准规范](#a9)
        - [时间戳](#b1)
        - [例子](#b2)
        - [数字](#b3)
        - [限流 - REST API](#b4)
- [业务API参考](#b5)
  - [open-api](#b6) ([调用 Demo](https://github.com/exchange-doc/api/blob/master/demo/demo.txt))
    -   [资产余额](#1)
    -   [获取全部委托](#2)
    -   [获取全部成交记录](#3)
    -   [取消委托单](#4)
    -   [根据币对取消全部委托单](#5)
    -   [创建订单](#6)
    -   [获取所有交易对行情](#7)
    -   [获取K线数据](#8)
    -   [获取当前行情](#9)
    -   [获取行情成交记录](#10)
    -   [获取各个币对的最新成交价](#11)
    -   [查询买卖盘深度](#12)
    -   [批量下单，同时批量撤回指定订单（即将废弃，推荐使用V2版本）](#13)
    -   [批量下单，同时批量撤回指定订单-V2](#27)
    -   [获取当前委托](#14)
    -   [获取订单详情](#15)
    -   [查询系统支持的所有交易对及精度](#17)
    -   [获取用户资产以及充值记录](#18)
  - [ws-api](#b7) ([Java-Demo](#ws-api-java))
    -   [订阅-K线行情](#19)
    -   [订阅-前24小时行情](#20)
    -   [订阅-深度盘口（高频）](#21)
    -   [订阅-深度盘口](#22)
    -   [订阅-实时成交信息](#23)
    -   [请求-K线历史数据](#24)
    -   [请求-成交历史数据](#25)
    -   [请求-首页24行情数据](#26)


---


# <span id="Introduction">介绍</span>

欢迎使用交易所开发者文档

本文档提供了相关API的使用方法介绍。open-api包含了资产余额，获取全部委托，获取全部成交记录等接口，ws-api则提供了K线相关功能接口。

---

# <span id="startToUse">开始使用</span>
REST，即Representational State Transfer的缩写，是一种流行的互联网传输架构。它具有结构清晰、符合标准、易于理解、扩展方便的，正得到越来越多网站的采用。其优点如下：

- 在RESTful架构中，每一个URL代表一种资源；
- 客户端和服务器之间，传递这种资源的某种表现层；
- 客户端通过四个HTTP指令，对服务器端资源进行操作，实现“表现层状态转化”。 

建议开发者使用REST API进行币币交易或者资产提现等操作。

---


# <span id="a1">API接口加密验证</span>

## <span id="a2">生成API Key</span>
在对任何请求进行签名之前，您必须通过 [交易所]【用户中心】-【API】创建一个API key。 创建key后，您将获得3个必须记住的信息：

- API Key
 
- Secret Key

API Key 和 Secret Key将由随机生成和提供
## <span id="a3">发起请求</span>
所有REST请求都必须包含以下标题：

- ACCESS-KEY API KEY作为一个字符串。
- ACCESS-SIGN 使用base64编码签名（请参阅签名消息）。
- ACCESS-TIMESTAMP 作为您的请求的时间戳。
- 所有请求都应该含有application/json类型内容，并且是有效的JSON。

## <span id="a4">签名</span>

生成待签名的字符串
    -   [open-api Demo](https://github.com/exchange-doc/api/blob/master/demo/demo.java)
    
1、先将参数以其参数名的字典序升序进行排序

2、遍历排序后的字典，将所有参数按"keyvalue"格式拼接在一起（非空参数）

3、使用MD5对待签名串求签

例：

api_key = 1234567

time = 12312312312137

secret_key = 789654

sign=md5(api_key1234567time12312312312137789654)



## <span id="a6">请求交互</span>

REST访问的根URL：``` https://openapi.domain.com ```

###  <span id="a7">请求</span>
所有请求基于Https协议，请求头信息中Content-Type 需要统一设置为:'application/x-www-form-urlencoded’。

#### 状态码

状态码    | 说明               | 备注
------ | ---------------- | ---------------------
0      | 成功               | code=0 成功， code >0 失败
5      | 下单失败             | 请检查订单价格与数量精度是否符合
6      | 数量小于最小值          |
7      | 数量大于最大值          |
8      | 订单取消失败           |
9      | 交易被冻结            |
13     | 系统错误             |
19     | 可用余额不足           |
22     | 订单不存在            |
23     | 缺少交易数量参数         |
24     | 缺少交易价格参数         |
10034  | 可用余额不足           |
10062  | 价格或数量精度超过最大限制    |
10063  | 数量小于最小值          |
10064  | 价格或金额小于最小值       |
10067  | 价格超出当日涨跌停范围，无法下单 |
10068  | 订单委托量超出最大限制      |
10069  | 超出下单频率           |
10071  | 涨跌停限制币对,不允许下市价单  |
100001 | 系统异常             |
100002 | 系统升级             |
100004 | 请求参数不合法          |
100005 | 参数签名错误           |
100007 | 非法IP             | 服务器IP不在API绑定IP列表中
110004 | 提现被冻结            |
110025 | 账户被后台管理员锁定       |
110041 | 接口访问频率过高         |


**请求交互说明**

1、请求参数：根据接口请求参数规定进行参数封装。

2、提交请求参数：将封装好的请求参数通过POST/GET/DELETE等方式提交至服务器。

3、服务器响应：服务器首先对用户请求数据进行参数安全校验，通过校验后根据业务逻辑将响应数据以JSON格式返回给用户。

4、数据处理：对服务器响应数据进行处理。

**成功**

HTTP状态码200表示成功响应，并可能包含内容。如果响应含有内容，则将显示在相应的返回内容里面。

**常见错误码**

- 400 Bad Request – Invalid request forma 请求格式无效

- 401 Unauthorized – Invalid API Key 无效的API Key

- 403 Forbidden – You do not have access to the requested resource 请求无权限

- 404 Not Found 没有找到请求

- 429 Too Many Requests 请求太频繁被系统限流

- 500 Internal Server Error – We had a problem with our server 服务器内部错误

如果失败，response body 带有错误描述信息

###  <span  id="a8">分页</span>

部分返回数据集的REST请求支持使用游标分页。 游标分页允许在结果的当前页面之前和之后获取结果，并且非常适合于实时数据。根据当前的返回结果，后续请求可以在此基础之上指定请求数据的方向，可以请求在这之前和之后的数据。before和after游标可通过响应头CB_BEFORE和CB_AFTER使用。

**例子**

```GET /orders?before=2&limit=30```


## <span id="a9">标准规范</span>

### <span id="b1">时间戳</span> 
除非另外指定，API中的所有时间戳均以微秒为单位返回。

请求签名中的ACCESS-TIMESTAMP的单位是秒，允许用小数表示更精确的时间。请求的时间戳必须在API服务时间的30秒内，否则请求将被视为过期并被拒绝。如果本地服务器时间和API服务器时间之间存在较大的偏差，那么我们建议您使用通过查询API服务器时间来更新http header。

###  <span id="b2">例子</span> 
1524801032573

###  <span id="b3">数字</span> 
为了保持跨平台时精度的完整性，十进制数字作为字符串返回。建议您在发起请求时也将数字转换为字符串以避免截断和精度错误。

整数（如交易编号和顺序）不加引号。

###  <span id="b4">限流</span>  
如果请求过于频繁系统将自动限制请求，并在http header中返回429 too many requests状态码。

REST API

- 公共接口：我们通过IP限制公共接口的调用：每2秒最多6个请求。

- 私人接口：我们通过用户ID限制私人接口的调用：每2秒最多6个请求。

- 某些接口的特殊限制在具体的接口上注明

---

# <span id="b5">业务API参考</span>

##  <span id="b6">open-api</span>


### <span id="1">资产余额</span>

1. 接口地址: /open/api/user/account
2. 接口说明: (get请求)资产余额

|参数|    填写类型|   说明|
|--------|--------|--------|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|--------|--------|--------|
|code|  0|   |
|msg|   "suc"|  code>0失败|
|data|  {<br>"total_asset":432323.23,<br>"coin_list":[<br>{"coin":"btc","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>{"coin":"ltc","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>{"coin":"bch","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>]<br>}<br>|total_asset:总资产<br>normal:余额账户<br>locked：冻结账户<br>btcValuatin：BTC估值|
---
### <span id="2">获取全部委托</span>

1. 接口地址:/open/api/v2/all_order
2. 接口说明:(get请求)获取全部委托
3、开始时间，结束时间不能相差10分钟，
4、没有开始时间，结束时间时，默认前10分钟数据

* 旧接口 /open/api/all_order 仍保留,但已经不建议使用

* v2版本变化: 去掉了结果返回值中的tradeList成交记录,提升效率;如果需要单一订单的成交信息,可以使用 /open/api/order_info 接口单独去查

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol|    必填| 市场标记，btcusdt，详情看下面|
|startDate| 选填| （新增）开始时间，精确到秒“yyyy-MM-dd mm:hh:ss”|
|endDate|   选填| （新增）结束时间，精确到秒“yyyy-MM-dd mm:hh:ss”|
|pageSize|  选填| 页面大小|
|page|  选填| 页码|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|-----|------|---------|
|code|  0|   |
|msg|   "suc"|  code>0失败|
|data|  如下:|
```
{
    "count":10,
    "orderList":[
        {
            "side":"BUY",
            "total_price":"0.10000000",
            "created_at":1510993841000,
            "avg_price":"0.10000000",
            "countCoin":"btc",
            "source":1,
            "type":1,
            "side_msg":"买入",
            "volume":"1.000",
            "price":"0.10000000",
            "source_msg":"WEB",
            "status_msg":"完全成交",
            "deal_volume":"1.00000000",
            "id":424,
            "remain_volume":"0.00000000",
            "baseCoin":"eth",
            "status":2
        },
        {
            "side":"SELL",
            "total_price":"0.09900000",
            "created_at":1510993715000,
            "avg_price":"0.10000000",
            "countCoin":"btc",
            "source":1,
            "type":1,
            "side_msg":"卖出",
            "volume":"1.000",
            "price":"0.09900000",
            "source_msg":"WEB",
            "status_msg":"完全成交",
            "deal_volume":"1.00000000",
            "id":423,
            "remain_volume":"0.00000000",
            "baseCoin":"eth",
            "status":2
        }
    ]
}
```

|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|----------|-------|-------|-------|
|btc|   btccny| -|  btcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|
|bcc|   bcccny| bccbtc| bccusdt|
|etc|   etccny| etcbtc| etcusdt|
|usdt|  usdtcny|    -|  -|

---
### <span id="3">获取全部成交记录</span>

1. 接口地址:/open/api/all_trade
2. 接口说明:(get请求)获取全部成交记录

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol|    必填| 市场标记，btcusdt，详情看下面|
|startDate| 选填| （新增）开始时间，精确到秒“yyyy-MM-dd HH:mm:ss”|
|endDate|   选填| （新增）结束时间，精确到秒“yyyy-MM-dd HH:mm:ss”|
|pageSize|  选填| 页面大小|
|page|  选填| 页码|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sort|  选填| 1表示倒序|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|-----|------|---------|
|code|  0|   |
|msg|   "suc"|  code>0失败|
| data| 如下:|
```
{
    "count":22,
    "resultList":[
        {
            "volume":"1.000",
            "side":"BUY",
            "feeCoin":"YLB",
            "price":"0.10000000",
            "fee":"0.16431104",
            "ctime":1510996571195,
            "deal_price":"0.10000000",
            "id":306,
            "type":"买入",
            "bid_id":1001,
            "ask_id":1002,
            "bid_user_id":10001,
            "ask_user_id":10001
 
        },
        {
            "volume":"0.850",
            "side":"BUY",
            "feeCoin":"YLB",
            "price":"0.10000000",
            "fee":"0.13966438",
            "ctime":1510996571190,
            "deal_price":"0.08500000",
            "id":305,
            "type":"买入",
            "bid_id":1001,
            "ask_id":1002,
            "bid_user_id":10001,
            "ask_user_id":10001
        },
        {
            "volume":"0.010",
            "side":"BUY",
            "feeCoin":"YLB",
            "price":"0.10000000",
            "fee":"0.00164311",
            "ctime":1510995560344,
            "deal_price":"0.00100000",
            "id":291,
            "type":"买入",
            "bid_id":1001,
            "ask_id":1002,
            "bid_user_id":10001,
            "ask_user_id":10001
        }
    ]
}
```
|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|----------|-------|-------|-------|
|btc|   btccny| -|  btcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|
|bcc|   bcccny| bccbtc| bccusdt|
|etc|   etccny| etcbtc| etcusdt|
|usdt|  usdtcny|    -|  -|


---
###  <span id="4">取消委托单</span>

1. 接口地址:/open/api/cancel_order
2. 接口说明:(post请求)取消委托单

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|order_id|  必填| 订单ID|
|symbol|    必填| 市场标记，ethbtc，详情看下面|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|------------|--------|------------------|
|code   |0   |
|msg|   "suc"|  code>0失败|
|data|  “”|

|虚拟币编号|xxx-cny（xxx101）|xxx-btc（xxx201）|
|------------|--------|----------|
|btc|   btccny| -|
|eth|   ethcny| ethbtc|
|ltc|   ltccny| ltcbtc|
|bcc|   bcccny| bccbtc|
|etc|   etccny| etcbtc|

---
###  <span id="5">根据币对取消全部委托单</span>

1. 接口地址:/open/api/cancel_order_all
2. 接口说明:(post请求)根据币对取消全部委托单（最多取消两千条，多余两千请循环撤销）

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol|    必填| 市场标记，ethbtc，详情看下面|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段 |实例 |解释|
|------------|--------|--------------|
|code   |0  |
|msg    |"suc"  |code>0失败|
|data   |“”|

 
|虚拟币编号|xxx-cny（xxx101）|xxx-btc（xxx201）|
|------------|-----------|------------|
|btc|   btccny| -|
|eth|   ethcny| ethbtc|
|ltc|   ltccny| ltcbtc|
|bcc|   bcccny| bccbtc|
|etc|   etccny| etcbtc|

---
### <span id="6">创建订单</span>


1. 接口地址:/open/api/create_order
2. 接口说明:(post请求)创建订单

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|side|  必填| 买卖方向BUY、SELL|
|type|  必填| 挂单类型，1:限价委托、2:市价委托|
|volume|    必填| 购买数量（多义，复用字段）<br>type=1:表示买卖数量<br>type=2:买则表示总价格，卖表示总个数<br>买卖限制user/me-用户信息|
|price| 选填| 委托单价：type=2：不需要此参数|
|symbol|    必填| 市场标记，ethbtc|
|fee_is_user_exchange_coin| 选填| （冗余字段，忽略）0，当交易所有平台币时，此参数表示是否使用用平台币支付手续费，0否，1是|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|-----|------|---------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  {"order_id":34343}|成功返回交易ID|

|虚拟币编号|xxx-cny（xxx101）|xxx-btc（xxx201）|
|------------|------------|------------|
|btc|   btccny| -|
|eth|   ethcny| ethbtc|
|ltc|   ltccny| ltcbtc|
|bcc|   bcccny| bccbtc|
|etc|   etccny| etcbtc|

---
###  <span id="7">获取所有交易对行情</span>
1. 接口地址:/open/api/get_allticker
2. 接口说明:(get请求)获取所有交易对行情

* 该接口不进行签名校验
* 参数:无

|字段|    实例| 解释|
|------------|--------|-----------------------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  如下：|返回值说明<br>date: 返回数据时服务器时间 <br>symbol: 交易对（交易对1(base)简称_交易对2(quote)简称） <br>buy: 买一价 <br>high: 最高价 <br>last: 最新成交价 <br>low: 最低价 <br>sell: 卖一价 <br>vol: 成交量(最近的24小时)<br>rose:涨跌幅|
```
{
   "date": 1534335607859,
   "ticker": [
     {
       "symbol": "btcusdt",
       "high": 7408.35984546,
       "vol": 0.01,
       "last": 1,
       "low": 7408.35984546,
       "buy": "3700.00000000",
       "sell": "7408.35984546",
       "rose": 0
     },
     {
       "symbol": "ethusdt",
       "high": 535.96,
       "vol": 6366.8591,
       "last": 20,
       "low": 279.57,
       "rose": -0.44564773
     },
     {
       "symbol": "bchusdt",
       "high": 12,
       "vol": 100,
       "last": 1,
       "low": 12,
       "buy": "11.00",
       "sell": "9.00",
       "rose": 0
     },
     {
       "symbol": "ethbtc",
       "high": 1,
       "vol": 281261,
       "last": 0.1,
       "low": 0.044039,
       "buy": "0.044049",
       "sell": "0.044049",
       "rose": -0.00022701
     },
     {
       "symbol": "nobbtc",
       "high": 0.007419,
       "vol": 1998,
       "last": 1,
       "low": 0.007419,
       "sell": "0.00741900",
       "rose": 0
     },
     {
       "symbol": "ltceth",
       "last": 0.18519949,
       "buy": "1.00000000",
       "sell": "0.18328001"
     }
   ]
 }
```

---
### <span id="8">获取K线数据</span>


1. 接口地址:/open/api/get_records
2. 接口说明:(get请求)获取K线数据

* 该接口不进行签名校验

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol|    必填| 市场标记，bchbtc，详情看下面|
|period|    必填| 单位为分钟，比喻1分钟则为1，一天则为1440|

|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|------------|-----------|----------|----------|
|bch|   bcccny| bchbtc| bchusdt|
|btc|   btccny| -|  btcusdt|
|etc|   etccny| etcbtc| etcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|

返回值:

|字段|    实例| 解释|
|------------|-----------|----------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  如下：|

```
[
        [
            1514445780,  //时间戳
            1.12,        //开盘价
            1.12,        //最高
            1.12,        //最低
            1.12,        //收盘价
            0            //成交量
        ],
        [
            1514445840,
            1.12,
            1.12,
            1.12,
            1.12,
            0
        ],
        [
            1514445900,
            1.12,
            1.12,
            1.12,
            1.12,
            0
        ]
]
```


---
###  <span id="9">获取当前行情</span>


1. 接口地址:/open/api/get_ticker
2. 接口说明:(get请求)获取当前行情

* 该接口不进行签名校验

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol|    必填| 市场标记，btcusdt，详情看下面|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0   | 
|msg|   "suc"|  code>0失败|
|data|  如下：|
```
{
    "high": 1,//最高值
    "vol": 10232.26315789,//交易量
    "last": 173.60263169,//最新成交价
    "low": 0.01,//最低值
    "buy": "0.01000000",//买一价
    "sell": "1.12345680",//卖一价
    "rose": -0.44564773,//涨跌幅
    "time": 1514448473626
}
```
|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|----------|----------|
|bcc|   bcccny| bccbtc| bccusdt|
|btc|   btccny| -|  btcusdt|
|etc|   etccny| etcbtc| etcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|





---
### <span id="10">获取行情成交记录</span>

1. 接口地址:/open/api/get_trades
2. 接口说明:(get请求)获取行情成交记录

* 该接口不进行签名校验

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol|    必填| 市场标记，bchbtc，详情看下面|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0   | 
|msg|   "suc"|  code>0失败|
|data|  如下：|
```
[
        {
            "amount": 0.55,//成交量
            "price": 0.18519949,//成交价
            "id": 447121,
            "type": "buy"//买卖type，买为buy，买sell
        },
        {
            "amount": 16.45,
            "price": 0.18335468,
            "id": 447120,
            "type": "buy"
        },
        {
            "amount": 2,
            "price": 0.18335468,
            "id": 447119,
            "type": "buy"
        },
        {
            "amount": 2.92,
            "price": 0.183324003,
            "id": 447118,
            "type": "sell"
        }
]
```
|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|-----------|----------|
|bch|   bcccny| bchbtc| bchusdt|
|btc|   btccny| -|  btcusdt|
|etc|   etccny| etcbtc| etcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|






---
###  <span id="11">获取各个币对的最新成交价</span>


1. 接口地址:/open/api/market
2. 接口说明:(get请求)获取各个币对的最新成交价

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  {"btcusdt":15000,"ethusdt":800}|

|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|----------|----------|
|btc|   btccny| -|  btcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|
|bcc|   bcccny| bccbtc| bccusdt|
|etc|   etccny| etcbtc| etcusdt|


---
###  <span id="12">查询买卖盘深度</span>


1. 接口地址:/open/api/market_dept
2. 接口说明:(get请求)查询买卖盘深度

* 该接口不进行签名校验

|参数|    填写类型|   说明|
|------------|--------|-----------------------------|
|symbol |必填|    市场标记，ethbtc，详情看下面|
|type|  必填| 深度类型，step0, step1, step2（合并深度0-2）；step0时，精度最高|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  如下：|
```
{  
    "tick":{
        "asks":[//卖盘
            {22112.22,0.9332},
            {22112.21,0.2},
            {22112.21,0.2},
            {22112.21,0.2},
            {22112.21,0.2},
        ],
        "bids":[//买盘
            {22111.22,0.9332},
            {22111.21,0.2},
            {22112.21,0.2},
            {22112.21,0.2},
            {22112.21,0.2},
        ]
    }
}
```




---
### <span id="13">批量下单，同时批量撤回指定订单</span>


1. 接口地址:/open/api/mass_replace
2. 接口说明:(post请求)批量下单，同时批量撤回指定订单

* mass_place是需要发送到系统的一批限价订单，每次最多100条
* mass_cancel是需要撤回的一批订单,每次最多100条

|参数|    填写类型|   说明|
|------------|--------|--------------------------------------|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|
|symbol|    必填| 币种 ，例 btcusdt|
|mass_cancel|   选填| [1234,234....] 撤单参数，订单id|
|mass_place|    选填| [{side:"BUY",type:"1",volume:"0.01",price:"6400",fee_is_user_exchange_coin:"0"}, {}, …]<br>含义：<br>symbol:币种，例btcusdt<br>mass_place:下单参数。side：方向（买卖方向BUY、SELL），<br>--------------------------------type：类型（1:限价委托、2:市价委托）<br>--------------------------------volume：购买数量（多义，复用字段） type=1:表示买卖数量type=2:买则表示总价格，卖表示总个数<br>--------------------------------price：委托单价：type=2：不需要此参数<br>--------------------------------fee_is_user_exchange_coin：(冗余字段)当交易所有平台币时，此参数表示是否使用用平台币支付手续费，0否，1是|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  "mass_place": [{"order_id":"1234","code":"0", "msg":"suc"}，...]<br>"mass_cancel": [{"order_id":"1234","code":"0", "msg":"suc"}，.......]|下单返回：订单id，状态码，成功或失败信息。<br>撤单返回：订单id，状态码，成功或失败信息<br>0表示成功。|


---
### <span id="27">批量下单，同时批量撤回指定订单-V2</span>
1. 接口地址:/open/api/mass_replaceV2
2. 接口说明:(post请求)批量下单，同时批量撤回指定订单

* mass_place是需要发送到系统的一批限价订单，每次最多1000条

* mass_cancel是需要撤回的一批订单,每次最多1000条

|参数|	填写类型|	说明|
|------------|--------|--------------------------------------|
|api_key|	必填|	api_key|
|time|	必填|	时间戳|
|sign|	必填|	签名|
|symbol|	必填|	币种 ，例 btcusdt|
|mass_cancel|	选填|	[1234,234....] 撤单参数，订单id|
|mass_place|	选填|	[{side:"BUY",type:"1",volume:"0.01",price:"6400",fee_is_user_exchange_coin:"0"}, {}, …]<br>含义：<br>symbol:币种，例btcusdt<br>mass_place:下单参数-->side：方向（买卖方向BUY、SELL），<br>--------------------------------type：类型（1:限价委托、2:市价委托）<br>--------------------------------volume：购买数量（多义，复用字段） type=1:表示买卖数量type=2:买则表示总价格，卖表示总个数<br>--------------------------------price：委托单价：type=2：不需要此参数<br>--------------------------------fee_is_user_exchange_coin：(冗余字段)当交易所有平台币时，此参数表示是否使用用平台币支付手续费，0否，1是|

返回值:

|字段|	实例|	解释|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0失败|
|data|	"mass_place": [{"msg": "Success","code": "0","order_id": [504,505]},{"msg": "Order cancellation failed","code": "8","order_id": [504,505]}]<br>"mass_cancel": [{"msg": "Success","code": "0","order_id": [572,573,574,626,629]}]|下单返回：订单id，状态码，成功或失败信息。<br>撤单返回：订单id，状态码，成功或失败信息<br>0表示成功。|

---
### <span id="14">获取当前委托</span>


1. 接口地址:/open/api/v2/new_order
2. 接口说明:(get请求)获取当前委托（包括未成交和正在成交的委托）

* 旧接口 /open/api/new_order 仍保留,但已经不建议使用

* v2版本变化: 去掉了结果返回值中的tradeList成交记录,提升效率;如果需要单一订单的成交信息,可以使用 /open/api/order_info 接口单独去查

|参数|    填写类型|   说明|
|------------|--------|--------------------------------------|
|symbo|l    必填| 市场标记，btcusdt，详情看下面|
|pageSize|  选填| 页面大小|
|page|  选填| 页码|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  如下:|订单状态(status)说明：<br>INIT(0,"初始订单，未成交未进入盘口"),<br>NEW_(1,"新订单，未成交进入盘口"),<br>FILLED(2,"完全成交"),<br>PART_FILLED(3,"部分成交"),<br>CANCELED(4,"已撤单"),<br>PENDING_CANCEL(5,"待撤单"),<br>EXPIRED(6,"异常订单");|
```
{
    "count":10,
    "resultList":[
        {
            "side":"BUY",
            "total_price":"0.10000000",
            "created_at":1510993841000,
            "avg_price":"0.10000000",
            "countCoin":"btc",
            "source":1,
            "type":1,
            "side_msg":"买入",
            "volume":"1.000",
            "price":"0.10000000",
            "source_msg":"WEB",
            "status_msg":"完全成交",
            "deal_volume":"1.00000000",
            "id":424,
            "remain_volume":"0.00000000",
            "baseCoin":"eth",
            "status":2
        },
        {
            "side":"SELL",
            "total_price":"0.09900000",
            "created_at":1510993715000,
            "avg_price":"0.10000000",
            "countCoin":"btc",
            "source":1,
            "type":1,
            "side_msg":"卖出",
            "volume":"1.000",
            "price":"0.09900000",
            "source_msg":"WEB",
            "status_msg":"完全成交",
            "deal_volume":"1.00000000",
            "id":423,
            "remain_volume":"0.00000000",
            "baseCoin":"eth",
            "status":2
        }
    ]
}
```
|虚拟币编号|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|----------|----------|
|btc|   btccny| -|  btcusdt|
|eth|   ethcny| ethbtc| ethusdt|
|ltc|   ltccny| ltcbtc| ltcusdt|
|bcc|   bcccny| bccbtc| bccusdt|
|etc|   etccny| etcbtc| etcusdt|
|usdt|  usdtcny|    -|  -/web/new_order-获取当前委托|



---
###  <span id="15">获取订单详情</span>

1. 接口地址:/open/api/order_info
2. 接口说明:(get请求)获取订单详情

|参数|    填写类型|   说明|
|------------|--------|--------------------------------------|
|order_id|  必填| 订单ID|
|symbol|    必填| 市场标记，ethbtc，详情看下面|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  如下:|
```
{
    "order_info":{
        "id":343,
        "side":"sell",
        "side_msg":"卖出",
        "created_at":"09-22 12:22",
        "price":222.33,
        "volume":222.33,
        "deal_volume":222.33,
        "total_price":222.33,
        "fee":222.33,
        "avg_price":222.33}
    }
    "trade_list":[
        {
            "id":343,
            "created_at":"09-22 12:22",
            "price":222.33,
            "volume":222.33,
            "deal_price":222.33,
            "fee":222.33
        },
        {
            "id":345,
            "created_at":"09-22 12:22",
            "price":222.33,
            "volume":222.33,
            "deal_price":222.33,
            "fee":222.33
        }
    ]
}
```


---
### <span id="17">查询系统支持的所有交易对及精度</span>


1. 接口地址:/open/api/common/symbols
2. 接口说明:(get请求)查询系统支持的所有交易对及精度

* 参数:无

返回值:

|字段|    实例| 解释|
|------------|--------|---------------|
|code|  0|   
|msg|   "suc"|  code>0失败|
|data|  如下：|symbol 交易对<br>base_coin 基础币种<br>count_coin 计价货币<br>price_precision 价格精度位数（0为个位）<br>amount_precision 数量精度位数（0为个位）|
```
{
"code": "0",
"msg": "suc",
"data": [
{
"symbol": "ethbtc",
"count_coin": "btc",
"amount_precision": 3,
"base_coin": "eth",
"price_precision": 8
},
{
"symbol": "ltcbtc",
"count_coin": "btc",
"amount_precision": 2,
"base_coin": "ltc",
"price_precision": 8
},
{
"symbol": "bchbtc",
"count_coin": "btc",
"amount_precision": 3,
"base_coin": "bch",
"price_precision": 8
},
{
"symbol": "etcbtc",
"count_coin": "btc",
"amount_precision": 2,
"base_coin": "etc",
"price_precision": 8
},
{
"symbol": "ltceth",
"count_coin": "eth",
"amount_precision": 2,
"base_coin": "ltc",
"price_precision": 8
},
{
"symbol": "etceth",
"count_coin": "eth",
"amount_precision": 2,
"base_coin": "etc",
"price_precision": 8
}
]
}
```


---
###  <span id="18">获取用户资产以及充值记录</span>


1. 接口地址:/open/api/user_balance_info
2. 接口说明:(post请求)获取用户资产以及充值记录

|参数|    填写类型|   说明|
|------------|--------|--------------------------------------|
|uid|   选填| 用户uid（用户uid,mobile_number,email三者必须填其中一个）|
|mobile_number| 选填| 查询的用户号码，手机号码或者邮箱|
|email| 选填| 用户邮箱|
|api_key|   必填| api_key|
|time|  必填| 时间戳|
|sign|  必填| 签名|

返回值:

|字段|    实例| 解释|
|------------|--------|--------------------------------------------|
|code|  0|“0” - > 成功<br>“100004” ->参数不合法<br>“100005” -> 签名错误<br>“100007” -> 非法IP<br>"110032" -> 用户无查询权限<br>“110020” -> 要查询的用户不存在|
|msg|   "suc"|  code>0失败|
|data|  如下：|balance_info 各个币种的资产信息<br>deposit_list 充值的流水信息|
```
{
"balance_info":[
    {
        "symbol":"BTC",
        "balance":124.12
    },...
],
"deposit_list":[
    {
        "uid":17203,
        "symbol":"BTC",
        "fee":0.00005,
        "amount":12.02,
        "created_at":"2018-11-14 15:37:51"
    },...
]
}
```

## <span id="b7">ws-api</span>

---
###  <span id="19">订阅-K线行情</span>

* 请求:
```
{"event":"sub","params":{"channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"自定义"}}
```
* 返回订阅状态1次:
```
{"event_rep":"subed","channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"原路返回","ts":1506584998239,"status":"ok"}
```
* 持续返回订阅消息:
```
{
    "channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]",//订阅的交易对行情$base$quote表示btckrw等
    "ts":1506584998239,//请求时间
    "tick":{
        "id":1506602880,//时间刻度起始值
        "amount":123.1221,//交易额
        "vol":1212.12211,//交易量
        "open":2233.22,//开盘价
        "close":1221.11,//收盘价
        "high":22322.22,//最高价
        "low":2321.22//最低价
    }
}
```


---
### <span id="20">订阅-前24小时行情</span>


* 请求:
```
{"event":"sub","params":{"channel":"market_$base$quote_ticker","cb_id":"自定义"}}
```
* 返回订阅状态1次:
```
{"event_rep":"subed","channel":"market_$base$quote_ticker","cb_id":"原路返回","ts":1506584998239,"status":"ok","lower_frame":"0"} // lower_frame: 0 币对没下架、 1 币对下架

```
* 持续返回订阅消息:
```
{
    "channel":"market_$base$quote_ticker",//订阅的交易对行情$base$quote表示btckrw等
    "ts":1506584998239,//请求时间
    "tick":{
        "id":1506584998,//冗余，无实际意义，时间戳
        "amount":123.1221,//交易额
        "vol":1212.12211,//交易量
        "open":2233.22,//开盘价
        "close":1221.11,//收盘价
        "high":22322.22,//最高价
        "low":2321.22,//最低价
        "rose":-0.2922,//涨幅
        "ts":1506584998239,//数据产生时间
        "lower_frame":"0"
    }
}
```


---
###  <span id="21">订阅-深度盘口（高频）</span>


* 请求:
```
{"event":"sub","params":{"channel":"market_$base$quote_depth_step[0-2]","cb_id":"自定义","asks":150,"bids":150}}
```
* 返回订阅状态1次:
```
{"event_rep":"subed","channel":"market_$base$quote_depth_step[0-2]","cb_id":"原路返回","asks":150,"bids":150,"ts":1506584998239,"status":"ok"}
```

* 注：第一次订阅成功会立刻返回一次全量数据， 另外server也会定期推个全量数据给前端  避免数据出问题

* 全量：前端直接替换原有盘口
```
{
    "channel":"market_$base$quote_depth_step[0-2]",//$base$quote表示btckrw等,深度有3个维度，0、1、2
    "ts":1506584998239,//请求时间
    "tick":{
        "asks":[//卖盘
            [22112.22,0.9332],
            [22112.21,0.2],
        ],
        "buys":[//买盘
            [22111.22,0.9332],
            [22111.21,0.2],
        ]
    }
}
```

* 注： 增量盘口信息 前端只需要替换价格对应的数量即可， volume=0时删除， price与原有盘口某个价格段的price相等时更新volume,  新的price直接新增

* 增量盘口信息（该盘口变化的价格段）
```
{
    "channel":"market_$base$quote_depth_step[0-2]",//$base$quote表示btckrw等,深度有3个维度，0、1、2
    "ts":1506584998239,//请求时间
    "tick":{
        "side": "asks", 买卖盘方向  asks： 卖盘  buys: 买盘  
        "price" : 133.55,  盘口对应的某个价格段
        "volume" : 44.22   价格段对应的数量
    }
}
```


---
###  <span id="22">订阅-深度盘口</span>

* 请求:
```
{"event":"sub","params":{"channel":"market_$base$quote_depth_step[0-2]","cb_id":"自定义","asks":150,"bids":150}}
```
* 返回订阅状态1次:
```
{"event_rep":"subed","channel":"market_$base$quote_depth_step[0-2]","cb_id":"原路返回","asks":150,"bids":150,"ts":1506584998239,"status":"ok"}
```
* 持续返回订阅消息:
```
{
    "channel":"market_$base$quote_depth_step[0-2]",//$base$quote表示btckrw等,深度有3个维度，0、1、2
    "ts":1506584998239,//请求时间
    "tick":{
        "asks":[//卖盘
            [22112.22,0.9332],
            [22112.21,0.2]
        ],
        "buys":[//买盘
            [22111.22,0.9332],
            [22111.21,0.2]
        ]
    }
}
```

---
### <span id="23">订阅-实时成交信息 </span>

* 请求:
```
{"event":"sub","params":{"channel":"market_$base$quote_trade_ticker","cb_id":"自定义"}}
```
* 返回订阅状态1次:
```
{"event_rep":"subed","channel":"market_$base$quote_trade_ticker","cb_id":"原路返回","ts":1506584998239,"status":"ok"}
```
* 持续返回订阅消息:
```
{
    "channel":"market_$base$quote_trade_ticker",//订阅的交易对行情$base$quote表示btckrw等
    "ts":1506584998239,//请求时间
    "tick":{
        "id":12121,//data中最大交易ID
        "ts":1506584998239,//data中最大时间
        "data":[
            {
                "id":12121,//交易ID
                "side":"buy",//买卖方向buy,sell
                "price":32.233,//单价
                "vol":232,//数量
                "amount":323,//总额
                "ts":1506584998239,//数据产生时间
                "ds":'2017-09-10 23:12:21'
            },
            {
                "id":12120,//交易ID
                "side":"buy",//买卖方向buy,sell
                "price":32.233,//单价
                "vol":232,//数量
                "amount":323,//总额
                "ts":1506584998239,//数据产生时间
                "ds":'2017-09-10 23:12:21'
            }
        ]
    }
}
```



---
### <span id="24">请求-K线历史数据</span>

* 增加请求参数endIdx，pageSize（最多300，默认300条数据）,如果endIdx为空，则返回最近300条历史数据

* 请求:
```
{"event":"req","params":{"channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"自定义","since":"1506602880"}}//since缺省时返回最新300条，有值时返回大于since的最多1小时数据，since有强校验，不能早于当前1小时  since取到59
```
* 返回一次历史数据:
```
{
    "event_rep":"rep","channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"原路返回",
    "since":"1506602880",//since缺省时返回最新300条，有值时返回大于since的最多1小时数据，since有强校验，不能早于当前1小时
    "ts":1506584998239,//请求时间
    "data":[//300条
        {
            "id":1506602880,//时间刻度起始值
            "amount":123.1221,//交易额
            "vol":1212.12211,//交易量
            "open":2233.22,//开盘价
            "close":1221.11,//收盘价
            "high":22322.22,//最高价
            "low":2321.22//最低价
        },
        {
            "id":1506602880,//时间刻度起始值
            "amount":123.1221,//交易额
            "vol":1212.12211,//交易量
            "open":2233.22,//开盘价
            "close":1221.11,//收盘价
            "high":22322.22,//最高价
            "low":2321.22//最低价
        }
    ]
}
```

---
### <span id="25">请求-成交历史数据 </span>

* 请求:
```
{"event":"req","params":{"channel":"market_$base$quote_trade_ticker","cb_id":"自定义","top":200}}
```
* 直接返回成交信息:
```
{
    "event_rep":"rep","channel":"market_$base$quote_trade_ticker","cb_id":"原路返回","ts":1506584998239,"status":"ok",
    "top":200,//最大支持200
    "data":[
        {
            "id":12121,//交易ID
            "side":"buy",//买卖方向buy,sell
            "price":32.233,//单价
            "vol":232,//数量
            "amount":323,//总额
            "ts":1506584998239//数据产生时间
        },
        {
            "id":12120,//交易ID
            "side":"buy",//买卖方向buy,sell
            "price":32.233,//单价
            "vol":232,//数量
            "amount":323,//总额
            "ts":1506584998239,//数据产生时间
            "ds":'2017-09-10 23:12:21'
        }
    ]
}
```


---
### <span id="26">请求-首页24行情数据</span>

* 请求方式:
```
{"event":"req","params":{"channel":"review"}}
```
* 返回数据示例:
```
{
   event_rep: "rep",
   channel: "review",
   data: {
          bchbtc:  {amount: "115.968833484"close: "0.07956"high: "0.086323"low: "0.079251"open: "0.086323"rose: "-0.07834528"vol: "1393.247"}
          bchusdt: {amount: "416316.164145661", close: "513.56", high: "556.42", low: "510.85", open: "555.71", …}
          btcusdt: {amount: "999341.34124", close: "6450.18", high: "6486.39", low: "6359.63", open: "6435.79", …}
   }
}
```

---
## <span id="ws-api-java">ws-api Demo (java) </span>


```

package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.java_websocket.client.DefaultSSLWebSocketClientFactory;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

/**
 * @author 鲫鱼哥 DateTime:2018年11月22日 下午9:25:20 
 * 建议使用的websocket client版本 
 * <dependency> 
 * <groupId>org.java-websocket</groupId> 
 * <artifactId>Java-WebSocket</artifactId> 
 * <version>1.3.0</version> 
 * </dependency> 
 *
 */
public class WsTest {

    public static void main(String[] args) {
        try {
//wsurl 
            String url = "wss://ws.domain.com/kline-api/ws";
//历史数据请求参数 
            String reqParam = "{"event":"req","params":{"channel":"market_btcusdt_trade_ticker","cb_id":"btcusdt","top":150}}";
//订阅参数 
            String subParam = "{"event":"sub","params":{"channel":"market_btcusdt_trade_ticker","cb_id":"btcusdt","top":150}}";

//初始化请求历史数据 
            WebSocketUtils wsc = WebSocketUtils.executeWebSocket(url, reqParam);

//订阅实时数据 
            wsc.send(subParam);

//线程不结束，等待新的消息，一般一分钟左右会有新的成交返回
            while (true) {
                Thread.sleep(1000);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class WebSocketUtils extends WebSocketClient {
        private static WebSocketUtils wsclient = null;
        private String msg = "";

        public WebSocketUtils(URI serverURI) {
            super(serverURI);
        }

        public WebSocketUtils(URI serverUri, Draft draft) {
            super(serverUri, draft);
        }

        public WebSocketUtils(URI serverUri, Map<String, String> headers, int connecttimeout) {
            super(serverUri, new Draft_17(), headers, connecttimeout);
        }

        @Override
        public void onOpen(ServerHandshake serverHandshake) {
            System.out.println("链接已建立");

        }

        @Override
        public void onMessage(String s) {
            System.out.println("收到字符串消息");
        }

        @Override
        public void onClose(int i, String s, boolean b) {
            System.out.println("链接已关闭");
        }

        @Override
        public void onError(Exception e) {
            System.out.println("报错啦");
        }

        @Override
        public void onMessage(ByteBuffer socketBuffer) {
            try {
                String marketStr = byteBufferToString(socketBuffer);
                String market = uncompress(marketStr).toLowerCase();
                if (market.contains("ping")) {
                    System.out.println("收到消息ping："+market);
                    String tmp = market.replace("ping", "pong");
                    wsclient.send(market.replace("ping", "pong"));
                } else {
                    msg = market;
                    System.out.println("收到消息："+msg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static Map<String, String> getWebSocketHeaders() throws IOException {
            Map<String, String> headers = new HashMap<String, String>();
            return headers;
        }

        private static void trustAllHosts(WebSocketUtils appClient) {
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[] {};
                }

                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
            } };

            try {
                SSLContext sc = SSLContext.getInstance("TLS");
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                appClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(sc));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static WebSocketUtils executeWebSocket(String url,String sendMsg) throws Exception {
            wsclient = new WebSocketUtils(new URI(url), getWebSocketHeaders(), 1000);
            trustAllHosts(wsclient);
            wsclient.connectBlocking();
            wsclient.send(sendMsg);
            return wsclient;
        }

        // buffer 转String 
        public String byteBufferToString(ByteBuffer buffer) {
            CharBuffer charBuffer = null;
            try {
                Charset charset = Charset.forName("ISO-8859-1");
                CharsetDecoder decoder = charset.newDecoder();
                charBuffer = decoder.decode(buffer);
                buffer.flip();
                return charBuffer.toString();
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }

        // 解压缩 
        public String uncompress(String str) throws IOException {
            if (str == null || str.length() == 0) {
                return str;
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
            GZIPInputStream gunzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while ((n = gunzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
            return out.toString();
        }

    }
}

```
