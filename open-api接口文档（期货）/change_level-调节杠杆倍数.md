### url:www.***.com(例)

## 接口地址:/api/change_level

## 接口说明:(post请求)调节杠杆倍数

|参数|	填写类型|	说明|
|------------|--------|-----------------------------|
|contractId|	必填|	合约ID|
|leverageLevel|	必填|	杠杆倍数|
|positionId| 必填|  仓位ID|
|api_key|	必填|	api_key|
|time|	必填|	时间戳|
|sign|	必填|	签名|

返回值:

    {
	    "code":"0",
	    "data":null,
	    "msg":""
    }


