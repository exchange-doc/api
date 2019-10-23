<?php
    class  Api
    {
        //private $Api_Key = 'ce31a01b20911f3794802e6fa507989e';
        private $Api_Key = 'dfcdd70254098c29aedc73633221292e';
        private $Secret_Key = '7a182d7c6dab3c80c3af1c7569e16916';
        //正式环境
        //public $Url = "https://openapi.wbfex.com/open/api/";
        //预发环境
        public $Url = "https://openapi.wbfex.info/open/api/";
        private $sign = '';
        public $params = array();

        //生成令牌
        public function create_sign($data){
            $text = '';
            if(empty($data)){
                return false;
            }
            ksort($data);
            foreach ($data as $key => $value){
                $text .= $key . strval($value);
            }
            $text .= $this->Secret_Key;
            $sign = md5($text);
            return $sign;
        }
        //获取资产余额
        public function user_account(){
            $this->Url .= 'user/account';
            $params = "api_key=" . $this->Api_Key . "&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //获取全部委托
        public function v2_all_order(){
            $this->Url .= 'v2/all_order';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //获取全部成交记录
        public function all_trade(){
            $this->Url .= 'all_trade';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //取消委托单
        public function cancel_order(){
            $this->Url .= 'cancel_order';
            $params = "api_key=" . $this->Api_Key . "&order_id=48755&symbol=wtusdt&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //根据币对取消全部委托单
        public function cancel_order_all(){
            $this->Url .= 'cancel_order_all';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //创建订单
        public function create_order(){
            $this->Url .= 'create_order';
            //$params = "api_key=" . $this->Api_Key . "&time=1564124760170";
            $params = "api_key=" . $this->Api_Key . "&price=2.439577&side=BUY&symbol=wtusdt&time=1564124760170&volume=0.22&type=1";
            parse_str($params,$post);
            return $post;
        }

        //获取所有交易对行情
        public function get_allticker(){
            $this->Url .= 'get_allticker';
            $params = "api_key=" . $this->Api_Key . "&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //获取K线数据
        public function get_records(){
            $this->Url .= 'get_records';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt&period=1";
            parse_str($params,$post);
            return $post;
        }

        //获取当前行情
        public function get_ticker(){
            $this->Url .= 'get_ticker';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt";
            parse_str($params,$post);
            return $post;
        }

        //获取行情成交记录
        public function get_trades(){
            $this->Url .= 'get_trades';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt";
            parse_str($params,$post);
            return $post;
        }

        //获取各个币对的最新成交价
        public function market(){
            $this->Url .= 'market';
            $params = "api_key=" . $this->Api_Key . "&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //查询买卖盘深度
        public function market_dept(){
            $this->Url .= 'market_dept';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt&type=step0";
            parse_str($params,$post);
            return $post;
        }

        //批量下单，同时批量撤回指定订单
        public function mass_replace(){
            $this->Url .= 'mass_replace';

            $params = "api_key=" . $this->Api_Key . "&time=1564124760170&symbol=wtusdt";
            parse_str($params,$post);
            return $post;
        }

        //批量下单，同时批量撤回指定订单-V2
        public function mass_replaceV2(){
            $this->Url .= 'mass_replaceV2';
            $params = "api_key=" . $this->Api_Key . "&time=1564124760170&symbol=wtusdt";
            parse_str($params,$post);
            return $post;
        }

        //获取当前委托
        public function v2_new_order(){
            $this->Url .= 'v2/new_order';
            $params = "api_key=" . $this->Api_Key . "&symbol=wtusdt&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //获取订单详情
        public function order_info(){
            $this->Url .= 'order_info';
            $params = "api_key=" . $this->Api_Key . "&order_id=48756&symbol=wtusdt&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //查询系统支持的所有交易对及精度
        public function common_symbols(){
            $this->Url .= 'common/symbols';
            $params = "api_key=" . $this->Api_Key . "&time=1564124760170";
            parse_str($params,$post);
            return $post;
        }

        //获取用户资产以及充值记录
        public function user_balance_info(){
            $this->Url .= 'user_balance_info';
            $params = "api_key=" . $this->Api_Key . "&time=1564124760170&email=dupeisheng@wbfex.com";
            parse_str($params,$post);
            return $post;
        }









        //发请求
        public function request_curl($url,$data,$method = 'GET',$type='json'){
            //初始化
            $ch = curl_init();
            $headers = [
                'form-data' => ['Content-Type: multipart/form-data'],
                'json'      => ['Content-Type: application/json'],
            ];
            if($method == 'GET'){
                if($data){
                    $querystring = http_build_query($data);
                    $url = $url.'?'.$querystring;
                }
            }
            // 请求头，可以传数组
            curl_setopt($ch, CURLOPT_URL,$url);
            curl_setopt($ch, CURLOPT_HTTPHEADER,$headers[$type]);
            curl_setopt($ch, CURLOPT_HEADER, false);
            curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);         // 执行后不直接打印出来
            if($method == 'POST'){
                curl_setopt($ch, CURLOPT_CUSTOMREQUEST,'POST');     // 请求方式
                curl_setopt($ch, CURLOPT_POST, true);               // post提交
                curl_setopt($ch, CURLOPT_POSTFIELDS, $data);              // post的变量
            }
            if($method == 'PUT'){
                curl_setopt ($ch, CURLOPT_CUSTOMREQUEST, "PUT");
                curl_setopt($ch, CURLOPT_POSTFIELDS,$data);
            }
            if($method == 'DELETE'){
                curl_setopt ($ch, CURLOPT_CUSTOMREQUEST, "DELETE");
                curl_setopt($ch, CURLOPT_POSTFIELDS,$data);
            }
            curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false); // 跳过证书检查
            curl_setopt($ch, CURLOPT_SSL_VERIFYHOST, false); // 不从证书中检查SSL加密算法是否存在
            $output = curl_exec($ch); //执行并获取HTML文档内容

            if (curl_errno($ch)) {
                echo 'Errno'.curl_error($ch);//捕抓异常
            }
            curl_close($ch); // 关闭CURL会话
            return $output; // 返回数据，json格式
        }

        public function request_q($url,$data,$method = 'GET',$type='json'){
            $curl = curl_init(); // 启动一个CURL会话
            $headers = [
                'form-data' => ['Content-Type: multipart/form-data'],
                'json'      => ['Content-Type: application/json'],
            ];
            if($method == 'GET'){
                if($data){
                    $querystring = http_build_query($data);
                    $url = $url.'?'.$querystring;
                }
            }
            // 请求头，可以传数组
            curl_setopt($curl, CURLOPT_URL, $url); // 要访问的地址
            //curl_setopt($curl, CURLOPT_HTTPHEADER,$headers[$type]);
            curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, 0); // 对认证证书来源的检查
            //curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, 1); // 从证书中检查SSL加密算法是否存在
            curl_setopt($curl, CURLOPT_USERAGENT, $_SERVER['HTTP_USER_AGENT']); // 模拟用户使用的浏览器
            curl_setopt($curl, CURLOPT_FOLLOWLOCATION, 1); // 使用自动跳转
            curl_setopt($curl, CURLOPT_AUTOREFERER, 1); // 自动设置Referer
            if($method == 'POST'){
                curl_setopt($curl, CURLOPT_POST, 1); // 发送一个常规的Post请求
                curl_setopt($curl, CURLOPT_POSTFIELDS, $data); // Post提交的数据包
            }
            curl_setopt($curl, CURLOPT_TIMEOUT, 30); // 设置超时限制防止死循环
            curl_setopt($curl, CURLOPT_HEADER, 0); // 显示返回的Header区域内容
            curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1); // 获取的信息以文件流的形式返回
            $res = curl_exec($curl); // 执行操作
            if (curl_errno($curl)) {
                echo 'Errno'.curl_error($curl);//捕抓异常
            }
            curl_close($curl); // 关闭CURL会话
            return $res; // 返回数据，json格式
        }
    }

    if(empty($_GET['params'])){
        echo '参数错误';
        die();
    }
    $function = $_GET['params'];
    if(!empty($_GET['method'])){
        $method = $_GET['method'];
    }else{
        $method = 'GET';
    }

    //for($i =1; $i<15; $i++){
        $api = new Api();
        $api->params = $api->$function();

        /*if($api->params['price']){
            $api->params['price'] = mt_rand(2156201, 2456201)/1000000;
        }

        if($api->params['volume']){
            $api->params['volume'] = mt_rand(10, 100)/100;
        }*/
        //print_r($data);die();


        $api->params['sign'] = $api->create_sign($api->params);
        //print_r($api->params);die();
        //print_r($api->Url);die();
        //print_r($method);die();



        $re = $api->request_q($api->Url, $api->params, $method);
        echo "<pre>";
        print_r(json_decode($re, true));
    //}














