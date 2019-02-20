### url:www.***.com(例)

## 接口地址:/api/user_position

## 接口说明:(post请求)用户持仓信息


|参数|	填写类型|	说明|
|------------|--------|-----------------------------|
|contractId|	非必填|	合约ID， 不填的时候返回所有仓位|
|api_key|	必填|	api_key|
|time|	必填|	时间戳|
|sign|	必填|	签名|

返回值:

	{
	    "code":"0",
	    "data":{
	        "positionCount":1,
	        "orderCount":1,
	        "positions":[
	            {
	                "symbol":"E_BTCUSD",
	                "avgPrice":3724.4247791642265, //持仓均价
	                "liquidationPrice":1866.9733462019494, //预期强平价格
	                "usedMargin":"0.02684709", //保证金
	                "baseSymbol":"BTC",
	                "contractName":"BitCoin",
	                "id":1,
	                "realisedAmountCurr":"0.00000000",//已实现盈亏
	                "side":"BUY",
	                "indexPrice":3901.92, //标价价格
	                "leverageLevel":1, //杠杆倍数
	                "priceValue":0.026849783773171, //仓位价值
	                "volume":100, //仓位数量
	                "canUseMargin":9999.76834534, //可用保证金
	                "contractId":19, //合约ID
	                "holdAmount":0.0268470937731711, //持仓保证金
	                "unrealisedAmountIndex":"0.00122137",//未实现盈亏
	                "quoteSymbol":"USD"
	            }
	        ]
	    },
	    "msg":""
	}