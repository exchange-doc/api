### url:wss://ws.***.com/kline-api/ws(例)

## 请求-K线历史数据

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