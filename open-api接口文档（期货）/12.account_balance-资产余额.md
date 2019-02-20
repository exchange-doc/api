### url:www.***.com(例)

## 接口地址:/api/account_balance

## 接口说明:(post请求)资产余额

|参数|	填写类型|	说明|
|--------|--------|--------|
|api_key|	必填|	api_key|
|time|	必填|	时间戳|
|sign|	必填|	签名|

返回值:

	{
	    "code":"0",
	    "data":[
	        {
	            "margin":9033826.568145819, //保证金余额
	            "unrealisedAmount":"0.00144095", //未实现盈亏
	            "openPositionFee":12488.600070562843,
	            "positionMargin":"0.64343890", //仓位保证金
	            "orderMargin":"5007928.53311728", //委托保证金
	            "canUseBalance":4025897.39303059, //可用余额
	            "accountRight":"9033826.56958677", //账户权益
	            "quoteSymbol":"BTC"
	        }
	    ],
	    "msg":""
	}
