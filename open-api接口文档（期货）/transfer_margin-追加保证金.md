### url:www.***.com(例)

## 接口地址:/api/transfer_margin

## 接口说明:(post请求)追加保证金

|参数|	填写类型|	说明|
|------------|--------|-----------------------------|
|contactId|	必填|	合约ID|
|amount|	选填|	追加数量（转出为负数）|
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


