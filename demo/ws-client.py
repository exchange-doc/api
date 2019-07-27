import websocket
import json
import gzip


if __name__ == "__main__":

    websocket.enableTrace(True)
    WEBSOCKET_MARKET_HOST = 'wss://ws.wbfex.com/kline-api/ws'  # 市场api
    #ws = websocket.create_connection("ws://echo.websocket.org/")
    ws = websocket.create_connection(WEBSOCKET_MARKET_HOST)
    print("Sending 'Hello, World'...")
    params = {
        "channel": "market_" + "ethusdt" + "_ticker",
        "cb_id": 150
    }
    req = {
        "event": "sub",
        'params': params
    }
    #ws.send("Hello, World")
    #print(json.dumps(req))
    ws.send(json.dumps(req))
    #exit(0)
    print("Sent")
    print("Receiving...")
    while 1:
        result = ws.recv()
        if isinstance(result, bytes):
            print('bytes')
        data = gzip.decompress(result)
        #recv = str(result, encoding = "utf-8")
        print(data)
    print("Received '%s'" % result)
    ws.close()