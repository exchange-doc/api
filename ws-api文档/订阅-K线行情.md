### url:wss://ws.***.com/kline-api/ws(例)

## 订阅-K线行情

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