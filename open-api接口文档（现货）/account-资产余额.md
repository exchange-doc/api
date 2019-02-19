### url:www.***.com/exchange-open-api(例)

## 接口地址:/open/api/user/account

## 接口说明:(get请求)资产余额

|参数|	填写类型|	说明|
|--------|--------|--------|
|api_key|	必填|	api_key|
|time|	必填|	时间戳|
|sign|	必填|	签名|

返回值:

|字段|	实例|	解释|
|--------|--------|--------|
|code|	0|	 |
|msg|	"suc"|	code>0失败|
|data|	{<br>"total_asset":432323.23,<br>"coin_list":[<br>{"coin":"btc","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>{"coin":"ltc","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>{"coin":"bch","normal":32323.233,"locked":32323.233,"btcValuatin":112.33},<br>]<br>}<br>|total_asset:总资产<br>normal:余额账户<br>locked：冻结账户<br>btcValuatin：BTC估值|
