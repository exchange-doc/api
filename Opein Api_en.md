#   Api Docs(Chinese simplified document)

## 1. open-api Catalog (example：openapi.***.com/exchange-open-api)
-   [invoking demo](#open-api)
-   [Balance of the assets](#1)
-	[Acquire full delegation](#2)
-	[Obtain all transaction records](#3)
-	[Cancellation of the order](#4)
-	[Cancellation of all orders of attorney according to currency pair](#5)
-	[Create order](#6)
-	[Get all trading pairs quotations on the market](#7)
-	[Getting K-line data](#8)
-	[Get the current market quotations](#9)
-	[Acquisition of Trading Records](#10)
-	[Get the latest transaction price of each pair of currencies](#11)
-	[Search the depth of buying and selling](#12)
-	[Place orders in batches and withdraw designated orders in batches](#13)
-	[Get the current delegation](#14)
-	[Obtain order details](#15)
-	[All Transaction Pairs and Accuracy Supported by Query System](#17)
-	[Get user assets and recharge records](#18)
## 2. ws-api Catalog  (example：wss://ws.***.com/kline-api/ws)
-   [invoking demo](#ws-api)
-   [Subscription - K Line Market](#19)
-   [Subscription - market quotations in the last 24 hours](#20)
-   [Subscription - Deep Port (High Frequency)](#21)
-   [Subscription - Deep Port](#22)
-   [Subscription-Real-time Transaction Information](#23)
-   [Request-K Line History Data](#24)
-   [Request-transaction history data](#25)
-   [Request - 24 Market Data on Home Page](#26)


---
### <span id="1">Balance of assets</span>

1. Interface address: /open/api/user/account
2. Interface specification: (get request)Balance of the assets


|parameter|	Fill in type|	Explain|
|--------|--------|--------|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|--------|--------|--------|
|code|	0|	 |
|msg|	"suc"|	code>0fail|
|data|	{<br>"total_asset":432323.23,<br>"coin_list":[<br>{"coin":"btc","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>{"coin":"ltc","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>{"coin":"bch","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>]<br>}<br>|total_asset:total assets<br>normal:Balance account<br>locked：Frozen accounts<br>btcValuatin：BTCValuation|
---
### <span id="2">Acquire full delegation</span>

1. Interface address:/open/api/v2/all_order
2. Interface specification:(getrequest)Acquire full delegation

* Old interface/open/api/all_order It is still reserved, but not recommended

* v2Version change: Remove from the result return value tradeListTransaction record,Enhance efficiency;If transaction information for a single order is required

,you can use /open/api/order_info interface and check it

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol|	Must fill|	Market mark，btcusdt，See below for details|
|startDate|	Selective filling|	（Added) Start time, accurate to seconds“yyyy-MM-dd mm:hh:ss”|
|endDate|	Selective filling|	（Added) End time, accurate to seconds“yyyy-MM-dd mm:hh:ss”|
|pageSize|	Selective filling|	Page size|
|page|	Selective filling|	Page number|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|


Return value:

|field|	Example|	explain|
|-----|------|---------|
|code|	0|	 |
|msg|	"suc"|	code>0fail|
|data|	as follows:|
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
            "side_msg":"Purchase",
            "volume":"1.000",
            "price":"0.10000000",
            "source_msg":"WEB",
            "status_msg":"Full deal",
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
            "side_msg":"Sell out",
            "volume":"1.000",
            "price":"0.09900000",
            "source_msg":"WEB",
            "status_msg":"Full deal",
            "deal_volume":"1.00000000",
            "id":423,
            "remain_volume":"0.00000000",
            "baseCoin":"eth",
            "status":2
        }
    ]
}
```

|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|----------|-------|-------|-------|
|btc|	btccny|	-|	btcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|
|bcc|	bcccny|	bccbtc|	bccusdt|
|etc|	etccny|	etcbtc|	etcusdt|
|usdt|	usdtcny|	-|	-|

---
### <span id="3">Obtain all transaction records</span>

1. Interface address:/open/api/all_trade
2. Interface Description: (get request) Get all transaction records

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol|	Must fill|	Market mark，btcusdt，See below for details|
|startDate|	Selective filling|	(Added) Start time, accurate to seconds“yyyy-MM-dd HH:mm:ss”|
|endDate|	Selective filling|	(Added) End time, accurate to seconds“yyyy-MM-dd HH:mm:ss”|
|pageSize|	Selective filling|	Page size|
|page|	Selective filling|	Page number|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sort|	Selective filling|	1Representing reverse order|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|-----|------|---------|
|code|	0|	 |
|msg|	"suc"|	code>0fail|
| data|	as follows:|
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
            "type":"Purchase",
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
            "type":"Purchase",
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
            "type":"Purchase",
            "bid_id":1001,
            "ask_id":1002,
            "bid_user_id":10001,
            "ask_user_id":10001
        }
    ]
}
```
|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|----------|-------|-------|-------|
|btc|	btccny|	-|	btcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|
|bcc|	bcccny|	bccbtc|	bccusdt|
|etc|	etccny|	etcbtc|	etcusdt|
|usdt|	usdtcny|	-|	-|


---
###  <span id="4">Cancellation of the order</span>

1. Interface address:/open/api/cancel_order
2. Interface specification:(post Request) Cancellation of the Power of Attorney

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|order_id|	Must fill|	OrderID|
|symbol|	Must fill|	Market mark，ethbtc，See below for details|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|------------|--------|------------------|
|code	|0	 |
|msg|	"suc"|	code>0fail|
|data|	“”|

|Virtual Currency Number|xxx-cny（xxx101）|xxx-btc（xxx201）|
|------------|--------|----------|
|btc|	btccny|	-|
|eth|	ethcny|	ethbtc|
|ltc|	ltccny|	ltcbtc|
|bcc|	bcccny|	bccbtc|
|etc|	etccny|	etcbtc|

---
###  <span id="5">Cancellation of all orders of attorney according to currency pair</span>

1. Interface address:/open/api/cancel_order_all
2. Interface specification:(postrequest)Cancellation of all orders of attorney according to currency pair（Up to 2,000 cancellations, more than 2,000 please revoke）

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol|	Must fill|	Market mark，ethbtc，See below for details|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field	|Example	|explain|
|------------|--------|--------------|
|code	|0	|
|msg	|"suc"	|code>0fail|
|data	|“”|

 
|Virtual Currency Number|xxx-cny（xxx101）|xxx-btc（xxx201）|
|------------|-----------|------------|
|btc|	btccny|	-|
|eth|	ethcny|	ethbtc|
|ltc|	ltccny|	ltcbtc|
|bcc|	bcccny|	bccbtc|
|etc|	etccny|	etcbtc|

---
### <span id="6">Create order</span>


1. Interface address:/open/api/create_order
2. Interface specification:(post Request) Create an order

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|side|	Must fill|	Direction of businessBUY、SELL|
|type|	Must fill|	Type of list，1:limit order、2:market order|
|volume| 	Must fill|	Purchase quantity（Polysemy, multiplexing fields）<br>type=1:Represents the quantity of sales and purchases<br>type=2:Buy means the total price，Selling represents the total number<br>Trading restrictions user/me-User information|
|price|	Selective filling|	Authorized unit price：type=2：No need for this parameter|
|symbol|	Must fill|	Market mark，ethbtc|
|fee_is_user_exchange_coin|	Selective filling|	（Redundant fields, ignored）0，When the exchange has the platform currency, this parameter indicates whether to use the platform currency to pay the handling fee, 0 no, 1 yes.|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|-----|------|---------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	{"order_id":34343}|Successful return to the transactionID|

|Virtual Currency Number|xxx-cny（xxx101）|xxx-btc（xxx201）|
|------------|------------|------------|
|btc|	btccny|	-|
|eth|	ethcny|	ethbtc|
|ltc|	ltccny|	ltcbtc|
|bcc|	bcccny|	bccbtc|
|etc|	etccny|	etcbtc|

---
###  <span id="7">Get all trading pairs quotations on the market</span>
1. Interface address:/open/api/get_allticker
2. Interface specification:(get Request) Get all trading pairs quotations on the market 

* This interface does not perform signature verification
* Parameter: None

|field|	Example|	explain|
|------------|--------|-----------------------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	as follows：|Return Value Description<br>date: Server time when data is returned <br>symbol: Transaction pairs（Transaction pairs1(base)Abbreviation_Transaction pairs2(quote)Abbreviation） <br>buy: Buy one price <br>high: Highest price <br>last: Latest Transaction Price <br>low: Minimum price <br>sell: Selling price <br>vol: Volume (latest 24 hours)<br>rose:Ups and downs|
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
### <span id="8">Getting K-line data</span>


1. Interface address:/open/api/get_records
2. Interface specification:(get request)Getting K-line data

* This interface does not perform signature verification

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol|	Must fill|	Market mark，bchbtc，See below for details|
|period|	Must fill|	In minutes，The analogy is 1 in a minute，One day is1440|

|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|------------|-----------|----------|----------|
|bch|	bcccny|	bchbtc|	bchusdt|
|btc|	btccny|	-|	btcusdt|
|etc|	etccny|	etcbtc|	etcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|

Return value:

|field|	Example|	explain|
|------------|-----------|----------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	as follows：|

```
[
        [
            1514445780,  //time stamp
            1.12,        //Opening price
            1.12,        //Highest
            1.12,        //minimum
            1.12,        //Closing price
            0            //volume

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
###  <span id="9">Get the current market quotations</span>


1. Interface address:/open/api/get_ticker
2. Interface specification:(get Request) to get the current market quotations 

* This interface does not perform signature verification

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol|	Must fill|	Market mark，btcusdt，See below for details|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0	| 
|msg|	"suc"|	code>0fail|
|data|	as follows：|
```
{
    "high": 1,//Maximum value
    "vol": 10232.26315789,//Trading volume
    "last": 173.60263169,//Latest Transaction Price
    "low": 0.01,//Minimum value
    "buy": "0.01000000",//Buy one price
    "sell": "1.12345680",//Selling price
    "rose": -0.44564773,//Ups and downs
    "time": 1514448473626
}
```
|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|----------|----------|
|bcc|	bcccny|	bccbtc|	bccusdt|
|btc|	btccny|	-|	btcusdt|
|etc|	etccny|	etcbtc|	etcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|





---
### <span id="10">Acquisition of Trading Records</span>

1. Interface address:/open/api/get_trades
2. Interface specification:(get Request) to obtain market transaction records

* This interface does not perform signature verification

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol|	Must fill|	Market mark，bchbtc，See below for details|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0	| 
|msg|	"suc"|	code>0fail|
|data|	as follows：|
```
[
        {
            "amount": 0.55,//volume
            "price": 0.18519949,//Transaction price
            "id": 447121,
            "type": "buy"//Businesstype，Buy asbuy，buysell
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
|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|-----------|----------|
|bch|	bcccny|	bchbtc|	bchusdt|
|btc|	btccny|	-|	btcusdt|
|etc|	etccny|	etcbtc|	etcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|






---
###  <span id="11">Get the latest transaction price of each pair of currencies</span>


1. Interface address:/open/api/market
2. Interface specification:(getRequest) Get the latest transaction price of each pair of currencies

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	{"btcusdt":15000,"ethusdt":800}|

|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|----------|----------|
|btc|	btccny|	-|	btcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|
|bcc|	bcccny|	bccbtc|	bccusdt|
|etc|	etccny|	etcbtc|	etcusdt|


---
###  <span id="12">Search the depth of buying and selling</span>


1. Interface address:/open/api/market_dept
2. Interface specification:(getrequest)Search the depth of buying and selling

* This interface does not perform signature verification

|parameter|	Fill in type|	Explain|
|------------|--------|-----------------------------|
|symbol	|Must fill|	Market mark，ethbtc，See below for details|
|type|	Must fill|	Depth type，step0, step1, step2（Merger depth0-2）；step0time，The highest accuracy|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	as follows：|
```
{  
    "tick":{
        "asks":[//Selling
            {22112.22,0.9332},
            {22112.21,0.2},
            {22112.21,0.2},
            {22112.21,0.2},
            {22112.21,0.2},
        ],
        "bids":[//Bid
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
### <span id="13">Batch order，Simultaneous bulk withdrawal of designated orders</span>


1. Interface address:/open/api/mass_replace
2. Interface specification:(postrequest)Place orders in batches and withdraw designated orders in batches

* mass_placeIt's a batch of limited price orders that need to be sent to the system, up to 100 at a time
* mass_cancelIt's a batch of orders that need to be withdrawn, up to 100 at a time

|parameter|	Fill in type|	Explain|
|------------|--------|--------------------------------------|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|
|symbol|	Must fill|	currency ，example btcusdt|
|mass_cancel|	Selective filling|	[1234,234....] Withdrawal parameters，Orderid|
|mass_place|	Selective filling|	[{side:"BUY",type:"1",volume:"0.01",price:"6400",fee_is_user_exchange_coin:"0"}, {}, …]<br>Meaning：<br>symbol:currency，example btcusdt<br>mass_place:Order parameter。side：direction（Direction of businessBUY、SELL），<br>--------------------------------type：type（1:limit order、2:market order）<br>--------------------------------volume：Purchase quantity（Polysemy，Multiplex field） type=1:Represents the quantity of sales and purchasestype=2:Buy means the total price，Selling represents the total number<br>--------------------------------price：Authorized unit price：type=2：No need for this parameter<br>--------------------------------fee_is_user_exchange_coin：(Redundant fields) When the exchange has a platform currency，This parameter indicates whether to use platform currency to pay handling fee, 0 no, 1 yes.|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	"mass_place": [{"order_id":"1234","code":"0", "msg":"suc"}，...]<br>"mass_cancel": [{"order_id":"1234","code":"0", "msg":"suc"}，.......]|Order return：Orderid，Status code，Success or Failure Information。<br>Withdrawal of returns：Orderid，Status code，c<br>0Express success。|




---
### <span id="14">Get the current delegation</span>


1. Interface address:/open/api/v2/new_order
2. Interface specification:(getrequest)Get the current delegation（Including uncompleted and ongoing commissions）

* Old interface /open/api/new_order It is still reserved, but not recommended

* v2Version change: Remove the tradeList transaction record from the result return value to improve efficiency;If you need transaction information for a single order, you can use /open/api/order_info interface and check it

|parameter|	Fill in type|	Explain|
|------------|--------|--------------------------------------|
|symbo|l	Must fill|	Market mark，btcusdt，See below for details|
|pageSize|	Selective filling|	Page size|
|page|	Selective filling|	Page number|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	as follows:|Order status(status)Explain：<br>INIT(0,"Initial order，No deal has not entered the handicap"),<br>NEW_(1,"New order，Unfinished business enters the market"),<br>FILLED(2,"Full deal"),<br>PART_FILLED(3,"Partial transaction"),<br>CANCELED(4,"Withdrawal of documents"),<br>PENDING_CANCEL(5,"Withdrawal of order"),<br>EXPIRED(6,"Abnormal order");|
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
            "side_msg":"Purchase",
            "volume":"1.000",
            "price":"0.10000000",
            "source_msg":"WEB",
            "status_msg":"Full deal",
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
            "side_msg":"Sell out",
            "volume":"1.000",
            "price":"0.09900000",
            "source_msg":"WEB",
            "status_msg":"Full deal",
            "deal_volume":"1.00000000",
            "id":423,
            "remain_volume":"0.00000000",
            "baseCoin":"eth",
            "status":2
        }
    ]
}
```
|Virtual Currency Number|xxx-cny|xxx-btc|xxx-usdt|
|------------|--------|----------|----------|
|btc|	btccny|	-|	btcusdt|
|eth|	ethcny|	ethbtc|	ethusdt|
|ltc|	ltccny|	ltcbtc|	ltcusdt|
|bcc|	bcccny|	bccbtc|	bccusdt|
|etc|	etccny|	etcbtc|	etcusdt|
|usdt|	usdtcny|	-|	-/web/new_order-Get the current delegate|



---
###  <span id="15">Obtain order details</span>

1. Interface address:/open/api/order_info
2. Interface specification:(getrequest)Obtain order details

|parameter|	Fill in type|	Explain|
|------------|--------|--------------------------------------|
|order_id|	Must fill|	Order ID|
|symbol|	Must fill|	Market mark，ethbtc，See below for details|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	as follows:|
```
{
    "order_info":{
        "id":343,
        "side":"sell",
        "side_msg":"Sell out",
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
### <span id="17">All Transaction Pairs and Accuracy Supported by Query System</span>


1. Interface address:/open/api/common/symbols
2. Interface specification:(get request) query all transaction pairs and accuracy supported by the system

* Parameter: None

Return value:

|field|	Example|	explain|
|------------|--------|---------------|
|code|	0|	 
|msg|	"suc"|	code>0fail|
|data|	as follows：|symbol Transaction pairs<br>base_coin Base currency<br>count_coin Money of Account<br>price_precision Price Precision Number（0 is a single digit）<br>amount_precision Quantitative precision digits (0 is a single digit)|
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
###  <span id="18">Get user assets and recharge records</span>


1. Interface address:/open/api/user_balance_info
2. Interface Description:(postRequest) Get user assets and recharge records

|parameter|	Fill in type|	Explain|
|------------|--------|--------------------------------------|
|uid|	Selective filling|	useruid（useruid,mobile_number,emailOne of the three must be filled in）|
|mobile_number|	Selective filling|	Inquiry user number, mobile phone number or mailbox|
|email|	Selective filling|	email|
|api_key|	Must fill|	api_key|
|time|	Must fill|	time stamp|
|sign|	Must fill|	autograph|

Return value:

|field|	Example|	explain|
|------------|--------|--------------------------------------------|
|code|	0|“0” - > Success<br>“100004” ->Illegal parameters<br>“100005” -> Signature error<br>“100007” -> illegalIP<br>"110032" -> Users do not have query privileges<br>“110020” -> The user to query does not exist|
|msg|	"suc"|	code>0fail|
|data|	as follows：|balance_info Asset information in various currencies<br>deposit_list Filling Pipeline Information|
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


---
###  <span id="19">Subscription - K Line Market</span>

* request:
```
{"event":"sub","params":{"channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"custom"}}
```
* Return to subscription status once:
```
{"event_rep":"subed","channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"Please Return by the Way You Came","ts":1506584998239,"status":"ok"}
```
* Continue to return subscription messages:
```
{
    "channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]",//Subscription transactions versus market$base$quoteExpressbtckrwetc.

    "ts":1506584998239,//Request time
    "tick":{
        "id":1506602880,//Time scale starting value
        "amount":123.1221,//A turnover
        "vol":1212.12211,//Trading volume
        "open":2233.22,//Opening price
        "close":1221.11,//Closing price
        "high":22322.22,//Highest price
        "low":2321.22//Minimum price
    }
}
```


---
### <span id="20">Subscription - market quotations in the last 24 hours</span>


* request:
```
{"event":"sub","params":{"channel":"market_$base$quote_ticker","cb_id":"custom"}}
```
* Return to subscription status once:
```
{"event_rep":"subed","channel":"market_$base$quote_ticker","cb_id":"Please Return by the Way You Came","ts":1506584998239,"status":"ok","lower_frame":"0"} // lower_frame: 0 No coin pair off the shelf、 1 Coin pair

```
* Continue to return subscription messages:
```
{
    "channel":"market_$base$quote_ticker",//Subscription transactions versus market$base$quoteExpress btckrw etc.
    "ts":1506584998239,//Request time
    "tick":{
        "id":1506584998,//Redundancy, no practical significance, timestamp
        "amount":123.1221,//A turnover
        "vol":1212.12211,//Trading volume
        "open":2233.22,//Opening price
        "close":1221.11,//Closing price
        "high":22322.22,//Highest price
        "low":2321.22,//Minimum price
        "rose":-0.2922,//Gain
        "ts":1506584998239,//Data generation time
        "lower_frame":"0"
    }
}
```


---
###  <span id="21">Subscription - Deep Port (High Frequency)</span>


* request:
```
{"event":"sub","params":{"channel":"market_$base$quote_depth_step[0-2]","cb_id":"custom","asks":150,"bids":150}}
```
* Return to subscription status once:
```
{"event_rep":"subed","channel":"market_$base$quote_depth_step[0-2]","cb_id":"Please Return by the Way You Came","asks":150,"bids":150,"ts":1506584998239,"status":"ok"}
```

* Note: The first successful subscription will immediately return a full amount of data, and the server will regularly push a full amount of data to the front-end to avoid data problems

* Full quantity: the front end directly replaces the original disk outlet
```
{
    "channel":"market_$base$quote_depth_step[0-2]",//$base$quoteExpressbtckrwetc.,Depth has three dimensions，0、1、2
    "ts":1506584998239,//Request time
    "tick":{
        "asks":[//Selling
            [22112.22,0.9332],
            [22112.21,0.2],
        ],
        "buys":[//Bid
            [22111.22,0.9332],
            [22111.21,0.2],
        ]
    }
}
```

* Note: The front end of incremental inventory information only needs to replace the quantity corresponding to the price， volume=Delete at 0 o'clock， priceWith the original opening of a price segment price Equal-time updatevolume,  Direct addition of new price

* Direct addition of new price
```
{
    "channel":"market_$base$quote_depth_step[0-2]",//$base$quoteExpressbtckrwetc.,Depth has 3 dimensions，0、1、2
    "ts":1506584998239,//Request time
    "tick":{
        "side": "asks", Trading Direction  asks：Selling  buys: Bid  
        "price" : 133.55,  A price segment corresponding to the opening
        "volume" : 44.22   Quantity corresponding to price segment
    }
}
```


---
###  <span id="22">Subscription - Deep Port</span>

* request:
```
{"event":"sub","params":{"channel":"market_$base$quote_depth_step[0-2]","cb_id":"custom","asks":150,"bids":150}}
```
* Return to subscription status once:
```
{"event_rep":"subed","channel":"market_$base$quote_depth_step[0-2]","cb_id":"Please Return by the Way You Came","asks":150,"bids":150,"ts":1506584998239,"status":"ok"}
```
* Continue to return subscription messages:
```
{
    "channel":"market_$base$quote_depth_step[0-2]",//$base$quoteRepresents btckrw, etc.,Depth has 3 dimensions，0、1、2
    "ts":1506584998239,//Request time
    "tick":{
        "asks":[//Selling
            [22112.22,0.9332],
            [22112.21,0.2]
        ],
        "buys":[//Bid
            [22111.22,0.9332],
            [22111.21,0.2]
        ]
    }
}
```

---
### <span id="23">Subscription-Real-time Transaction Information </span>

* request:
```
{"event":"sub","params":{"channel":"market_$base$quote_trade_ticker","cb_id":"custom"}}
```
* Return to subscription status once:
```
{"event_rep":"subed","channel":"market_$base$quote_trade_ticker","cb_id":"Please Return by the Way You Came","ts":1506584998239,"status":"ok"}
```
* Continue to return subscription messages:
```
{
    "channel":"market_$base$quote_trade_ticker",//Subscription transactions versus market$base$quoteExpressbtckrwetc.
    "ts":1506584998239,//Request time
    "tick":{
        "id":12121,//dataThe biggest deal ID
        "ts":1506584998239,//dataThe biggest deal
        "data":[
            {
                "id":12121,//transaction ID
                "side":"buy",//Direction of business buy,sell
                "price":32.233,//Unit Price
                "vol":232,//Number
                "amount":323,//Total
                "ts":1506584998239,//Data generation time
                "ds":'2017-09-10 23:12:21'
            },
            {
                "id":12120,//Transaction ID
                "side":"buy",//Direction of business buy,sell
                "price":32.233,//Unit Price
                "vol":232,//Number
                "amount":323,//Total
                "ts":1506584998239,//Data generation time
                "ds":'2017-09-10 23:12:21'
            }
        ]
    }
}
```



---
### <span id="24">Request-K Line History Data</span>

* Increase request parameters endIdx，pageSize（Up to 300, default 300 data）,If endIdx is empty, the last 300 historical data are returned

* request:
```
{"event":"req","params":{"channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"custom","since":"1506602880"}}//since The default is to return the latest 300, a return value greater than since for up to 1 hours of data, since has strong check, not earlier than the current 1 hours to 59 since```
* Return a historical data:
```
{
    "event_rep":"rep","channel":"market_$base$quote_kline_[1min/5min/15min/30min/60min/1day/1week/1month]","cb_id":"Please Return by the Way You Came",
    "since":"1506602880",//since Return the latest 300 items by default, return the maximum 1 hour data larger than since when it has value, and since has strong check, not earlier than the current 1 hour.
    "ts":1506584998239,//Request time
    "data":[//300 article
        {
            "id":1506602880,//Time scale starting value
            "amount":123.1221,//A turnover
            "vol":1212.12211,//Trading volume
            "open":2233.22,//Opening price
            "close":1221.11,//Closing price
            "high":22322.22,//Highest price
            "low":2321.22//Minimum price
        },
        {
            "id":1506602880,//Time scale starting value
            "amount":123.1221,//A turnover
            "vol":1212.12211,//Trading volume
            "open":2233.22,//Opening price
            "close":1221.11,//Closing price
            "high":22322.22,//Highest price
            "low":2321.22//Minimum price
        }
    ]
}
```

---
### <span id="25">Request-transaction history data </span>

* request:
```
{"event":"req","params":{"channel":"market_$base$quote_trade_ticker","cb_id":"custom","top":200}}
```
* Direct return of transaction information:
```
{
    "event_rep":"rep","channel":"market_$base$quote_trade_ticker","cb_id":"Please Return by the Way You Came","ts":1506584998239,"status":"ok",
    "top":200,//Maximum support 200
    "data":[
        {
            "id":12121,//Transaction ID
            "side":"buy",//Direction of businessbuy,sell
            "price":32.233,//Unit Price
            "vol":232,//Number
            "amount":323,//Total
            "ts":1506584998239//Data generation time
        },
        {
            "id":12120,//Transaction ID
            "side":"buy",//Direction of business buy,sell
            "price":32.233,//Unit Price
            "vol":232,//Number
            "amount":323,//Total
            "ts":1506584998239,//Data generation time
            "ds":'2017-09-10 23:12:21'
        }
    ]
}
```


---
### <span id="26">Request - 24 Market Data on Home Page-</span>

* Request mode:
```
{"event":"req","params":{"channel":"review"}}
```
* Return an example of data:
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
## <span id="open-api">open-api Demo（java） </span>


```

package com.stats.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.io.IOUtils;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
/** 4 variables，api_key,secret_key */ 
 String api_key = "9750*****************65d1";
 String secret_key = "1c16******************2982";

 /** Encapsulation of parameters requiring signature */
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("api_key", api_key);
        params.put("time", new Date().getTime() + "");
/** Splice signature string, MD5 signature */
        StringBuilder result = new StringBuilder();
        Set<Entry<String, String>> entrys = params.entrySet();
        for (Entry<String, String> param : entrys) {
/** Remove the signature field */
            if (param.getKey().equals("sign")) {
                continue;
            }

/** Empty parameters do not participate in signature */
            if (param.getValue() != null) {
                result.append(param.getKey());
                result.append(param.getValue().toString());
            }
        }
        result.append(secret_key);
        String sign = getMD5(result.toString());
        params.put("sign", sign);

/** http request */
        String resultJson = get("https://www.***.com/exchange-open-api/open/api/get_trades?symbol=btcusdt", params);
        System.out.println(resultJson);
    }

    /**
     * The method of submitting data with parameters by post
     *
     * @param url    Request address
     * @param params parameter
     * @return
     */
    public static String post(String url, Map<String, String> params) {
        String str = null;
        try {
            HttpClient client = new HttpClient();
            PostMethod method = new PostMethod(url);
//Setting the style of the request header 
            method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            if (params != null && params.size() > 0) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    method.setParameter(entry.getKey(), entry.getValue());
                }
            }
            int code = client.executeMethod(method);
            if (code >= 200 && code < 300) {
                InputStream in = method.getResponseBodyAsStream();
                str = IOUtils.toString(in);
            }
        } catch (Exception e) {
// TODO Auto-generated catch block 
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Method of submitting data with parameters by get
     *
     * @param url    Request address
     * @param params parameter
     * @return
     */
    public static String get(String url, Map<String, String> params) {
        String str = null;
        try {
            if (params != null && params.size() > 0) {
                int x = 1;
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    if (x == 1) {
                        url = url + "?";
                    } else {
                        url = url + "&";
                    }
                    url += entry.getKey() + "=" + entry.getValue();
                    x++;
                }
            }
            HttpClient client = new HttpClient();
            System.out.println("url:::" + url);
            GetMethod method = new GetMethod(url);
//Setting the style of the request header 
            method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            int code = client.executeMethod(method);
            if (code >= 200 && code < 300) {
                InputStream in = method.getResponseBodyAsStream();
                str = IOUtils.toString(in);
            }
        } catch (Exception e) {
// TODO Auto-generated catch block 
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Get String's MD5 value
     *
     * @param info Character string
     * @return The MD5 value of the string
     */
    public static String getMD5(String info) {
        try {
//Gets the MessageDigest object with a parameter of MD5 string, indicating that this is an MD5 algorithm (and other SHA1 algorithms, etc.)： 
            MessageDigest md5 = MessageDigest.getInstance("MD5");
//update(byte[])Method, input original data 
//Similar StringBuilder Object append()Method, add mode, is a cumulative change process 
            md5.update(info.getBytes("UTF-8"));
//digest()After being invoked, the MessageDigest object is reset, that means that, the method cannot be called again continuously to calculate the MD5 value of the original data.You can manually call the reset () method to reset the input source。 
//Digest () Returns a 16-bit hash value, which is accepted by byte [] 
            byte[] md5Array = md5.digest();
//byte[]Usually we convert it to a 32-bit hexadecimal string. This article introduces three common conversion methods. 
            return bytesToHex(md5Array);
        } catch (NoSuchAlgorithmException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    private static String bytesToHex(byte[] md5Array) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < md5Array.length; i++) {
            int temp = 0xff & md5Array[i];
            String hexString = Integer.toHexString(temp);
            if (hexString.length() == 1) {//If it is hexadecimal 0f, only f is displayed by default, and then 0 is added
                strBuilder.append("0").append(hexString);
            } else {
                strBuilder.append(hexString);
            }
        }
        return strBuilder.toString();
    }

}

```



---
## <span id="ws-api">ws-api Demo (java) </span>


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
 * @author Squid DateTime:November 22, 2018, 9:25:20 PM 
 * Suggested use websocket client Edition 
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
            String url = "wss://ws.***.com/kline-api/ws";
//Historical data request parameters 
            String reqParam = "{"event":"req","params":{"channel":"market_btcusdt_trade_ticker","cb_id":"btcusdt","top":150}}";
//Subscription parameters 
            String subParam = "{"event":"sub","params":{"channel":"market_btcusdt_trade_ticker","cb_id":"btcusdt","top":150}}";

//Initialization request history data 
            WebSocketUtils wsc = WebSocketUtils.executeWebSocket(url, reqParam);

//Subscribe to real-time data 
            wsc.send(subParam);

//Thread does not end, waiting for new messages，www.***.com Generally, a new deal will return in about a minute
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
            System.out.println("Links have been established");

        }

        @Override
        public void onMessage(String s) {
            System.out.println("Receive a string message");
        }

        @Override
        public void onClose(int i, String s, boolean b) {
            System.out.println("Link closed");
        }

        @Override
        public void onError(Exception e) {
            System.out.println("Wrong report");
        }

        @Override
        public void onMessage(ByteBuffer socketBuffer) {
            try {
                String marketStr = byteBufferToString(socketBuffer);
                String market = uncompress(marketStr).toLowerCase();
                if (market.contains("ping")) {
                    System.out.println("Receive messageping："+market);
                    String tmp = market.replace("ping", "pong");
                    wsclient.send(market.replace("ping", "pong"));
                } else {
                    msg = market;
                    System.out.println("Receive message："+msg);
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

        // buffer turn String 
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

        // decompression 
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
