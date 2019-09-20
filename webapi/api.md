
 <h1 class="curproject-name"> web-api </h1> 
 


# 公共

## user_info
<a id=user_info> </a>
### 基本信息

**Path：** /common/user_info

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3>0</td><td key=4><span style="white-space: pre-wrap">0 发送成功，110032发送失败</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">suc</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> googleStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否开启googel验证</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>13520657789</span></p></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otc_save_ad_on_off</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外发布广告按钮开关</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> feeCoinRate</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费折扣半分比</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.00</span></p></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userCompanyInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcCompanyMarginNum</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账户金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100.0000000000</span></p></td></tr><tr key=0-3-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> applyStatus</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户场外商户申请状态，0：未申请，1：申请中，2：拒绝，3：通过</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户场外商户状态， 0：未认证，1：普通商户，2：普通商户释放，3：超级商户，4：超级商户释放</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fee_coin_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台币手续费开关</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lastLoginIp</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录ip</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@ip</span></p></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> accountStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 账户状态 0.正常 1.冻结交易，冻结提现 2冻结交易 3冻结提现</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isOpenMobileCheck</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否开启手机验证</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> countryCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号码对应的国家编号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>+86</span></p></td></tr><tr key=0-3-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> inviteUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请链接</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://www.hiex.pro/register?inviteCode=LVBAHA</span></p></td></tr><tr key=0-3-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> exportExcelAuth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">经纪人导出返利详情excel加密参数</span></td><td key=5></td></tr><tr key=0-3-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10027</span></p></td></tr><tr key=0-3-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@email</span></p></td></tr><tr key=0-3-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcCompanyInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-14-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> marginCoinSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">保证金币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-3-14-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> docAddr</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">文档地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://saas-oss.oss-cn-hongkong.aliyuncs.com/upload/20190711121000447.pdf</span></p></td></tr><tr key=0-3-14-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> superCompanyMarginNum</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">超级商户保证金数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-3-14-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcCompanyApplyEmail</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">申请商户邮箱地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@email</span></p></td></tr><tr key=0-3-14-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> normalTradeLimit</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">普通交易最大值</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>300000</span></p></td></tr><tr key=0-3-14-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> normalCompanyMarginNum</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">普通商户保证金数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-14-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外商户状态，0：未开启，1：开启普通商户，2：开启超级商户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> nickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-3-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isCapitalPwordSet</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否设置资金密码，0：未设置，1：已设置</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-17><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">经纪人状态： 0.无效 1.有效 2.非经纪人</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-18><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> useFeeCoinOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否开启优先支付手续费 0： 未开启 1：开启</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-19><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lastLoginTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最后登录时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1565687300000</span></p></td></tr><tr key=0-3-20><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> realName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户真实姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-3-21><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> feeCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">优先支付手续费的</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>FUN</span></p></td></tr><tr key=0-3-22><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userAccount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账户（手机不存在取邮箱）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@email</span></p></td></tr><tr key=0-3-23><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> inviteCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>LVWAHB</span></p></td></tr><tr key=0-3-24><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> roleName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">真实姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-3-25><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> inviteQECode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">二维码 base64</span></td><td key=5></td></tr><tr key=0-3-26><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> notPassReason</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">test</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>test</span></p></td></tr><tr key=0-3-27><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">认证状态 0、未审核，1、通过，2、未通过  3未认证</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
## 全站公共接口
<a id=全站公共接口> </a>
### 基本信息

**Path：** /common/public_info_v4

**Method：** POST

**接口描述：**
<p>全站级别接口，非常重要</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> msg</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所基本信息</span></td><td key=5></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> footer_logo_path</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页面尾部交易所Logo</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20190319191422282.png</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> index_international_logo</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国际版正方形Logo</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20190319191422282.png</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> company_name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>chainup</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> company_hash</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所Hash</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>d41d8cd98f00b204e9800998ecf8427e</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> default_country_code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">默认国家编码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>+86</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> iconUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">浏览器Tab标签Icon</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20190319191422282.png</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> h5LoginImg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">H5登录页面正方形图片</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20190319191422282.png</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contact_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所电话</span></td><td key=5></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> logoUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所Logo</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20190319191422282.png</span></p></td></tr><tr key=0-2-0-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contact_email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>aaa@qq.com</span></p></td></tr><tr key=0-2-0-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> config_footer_js</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">添加js脚本（在线客服、统计代码等）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>var _hmt = _hmt || [];↵(function() {↵  var hm = document.createElement("script");↵  hm.src = "https://hm.baidu.com/hm.js?3b2662822710509b7388810cb29f01b7";↵  var s = document.getElementsByTagName("script")[0]; ↵  s.parentNode.insertBefore(hm, s);})();</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> open_api_url</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未使用</span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> skin</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所皮肤数据</span></td><td key=5></td></tr><tr key=0-2-2-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> default</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">默认模板id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> listist</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">皮肤列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-2-1-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> mainClor</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">皮肤名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>默认</span></p></td></tr><tr key=0-2-2-1-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> imgPath</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://chaindown-oss.oss-cn-hongkong.aliyuncs.com/static/1/images/</span></p></td></tr><tr key=0-2-2-1-2><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> skinId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">皮肤Id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-1-3><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> iconUrl</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">icon地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://chaindown-oss.oss-cn-hongkong.aliyuncs.com/static/1/ca94518d1d19b373cf7a07c430def836.js</span></p></td></tr><tr key=0-2-2-1-4><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> colorList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">颜色列表-详见文档</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-2-1-4-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> rgba</span></td><td key=1><span>string []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>string</span></p></td></tr><tr key=array-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-1-4-1><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-1-5><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> imgList</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片名称</span></td><td key=5></td></tr><tr key=0-2-2-1-5-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> kyc_passport_b</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-1><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> download_ios_03_en_US</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-2><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> kyc_idcard_a</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-3><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> home_edit_imgb</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-4><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> appdownload_bg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-5><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> interAppBg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-6><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> default_icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-7><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> banner-1</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-8><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> footer_logo</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-2-1-5-9><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> photo_1</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ba12525027c1363760ac13652c462d99.png</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> indexHeaderTitle</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">浏览器Tab标签默认显示内容，区分语言</span></td><td key=5></td></tr><tr key=0-2-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> el_GR</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特蔽交易平臺</span></p></td></tr><tr key=0-2-3-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ko_KR</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特蔽交易平臺</span></p></td></tr><tr key=0-2-3-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> en_US</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特蔽交易平臺</span></p></td></tr><tr key=0-2-3-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> zh_CN</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特蔽交易平臺</span></p></td></tr><tr key=0-2-3-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ja_JP</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特蔽交易平臺</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> url</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所各站点Url</span></td><td key=5></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mcoUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">H5-合约Url</span></td><td key=5></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">PC-合约Url</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://co.chaindown.com/contract</span></p></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mexUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">H5-交易所Url</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://m.chaindown.com</span></p></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> exUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">PC-交易所Url</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://www.chaindown.com</span></p></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">PC-场外交易URl</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://otc.chaindown.com</span></p></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> motcUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">H5-场外交易URl</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://motc.chaindown.com</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> switch</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">各个功能开关，关闭：0，开启：1</span></td><td key=5></td></tr><tr key=0-2-5-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> is_deposit_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> is_return_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> config_header_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lock_position_v2_status</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> index_international_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coins_krw_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> login_regist_type</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> is_invitationCode_required</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> newcoinOpen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> regist_must_check_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> config_footer_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fiat_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> openLoginVerificationMode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> is_invite_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol_profile</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> is_open_upload_img</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> agentUserOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-17><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> verificationType</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-18><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> register_cms_style</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-19><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> index_layer_open</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-20><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> trade_depth_is_flash</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5-21><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> open_txid_addr</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> market</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所货币、货币对信息</span></td><td key=5></td></tr><tr key=0-2-6-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> market</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">货币对信息</span></td><td key=5></td></tr><tr key=0-2-6-0-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> USDT</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">Usdt市场货币对信息</span></td><td key=5></td></tr><tr key=0-2-6-0-0-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> BTC/USDT</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">BTC/USDT  货币对名称</span></td><td key=5></td></tr><tr key=0-2-6-0-0-0-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitVolumeMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-2-6-0-0-0-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">ws请求参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btcusdt</span></p></td></tr><tr key=0-2-6-0-0-0-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketBuyMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.000001</span></p></td></tr><tr key=0-2-6-0-0-0-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsST</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">ST</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-6-0-0-0-4><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketSellMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-2-6-0-0-0-5><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">排序</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-6-0-0-0-6><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> newcoinFlag</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-6-0-0-0-7><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> isShow</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否显示</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-6-0-0-0-8><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>6</span></p></td></tr><tr key=0-2-6-0-0-0-9><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> depth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">深度维度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.000001,0.0001,0.01</span></p></td></tr><tr key=0-2-6-0-0-0-10><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>4</span></p></td></tr><tr key=0-2-6-0-0-0-11><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsMine</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-6-0-0-0-12><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">name</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr><tr key=0-2-6-0-0-0-13><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitPriceMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.000001</span></p></td></tr><tr key=0-2-6-0-0-0-14><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsLimitPlat</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-6-0-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> ETH/BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitVolumeMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketBuyMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsST</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-4><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketSellMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-5><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-6><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> newcoinFlag</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-7><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> isShow</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-8><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-9><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> depth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-10><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-11><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsMine</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-12><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-13><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitPriceMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-0-14><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsLimitPlat</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> BCH/BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitVolumeMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketBuyMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsST</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-4><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketSellMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-5><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-6><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> newcoinFlag</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-7><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> isShow</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-8><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-9><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> depth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-10><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-11><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsMine</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-12><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-13><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitPriceMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-1-14><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsLimitPlat</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> LTC/BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitVolumeMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketBuyMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsST</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-4><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketSellMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-5><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-6><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> newcoinFlag</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-7><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> isShow</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-8><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-9><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> depth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-10><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-11><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsMine</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-12><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-13><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitPriceMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-2-14><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsLimitPlat</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> NOB/BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitVolumeMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketBuyMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsST</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-4><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketSellMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-5><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-6><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> newcoinFlag</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-7><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> isShow</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-8><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-9><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> depth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-10><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-11><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsMine</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-12><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-13><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitPriceMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-3-14><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsLimitPlat</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> VEC/BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitVolumeMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketBuyMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsST</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-4><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> marketSellMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-5><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-6><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> newcoinFlag</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-7><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> isShow</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-8><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-9><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> depth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-10><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-11><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsMine</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-12><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-13><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> limitPriceMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-0-1-4-14><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> IsLimitPlat</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> wsUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">ws请求接口</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>wss://ws.chaindown.com/kline-api/ws</span></p></td></tr><tr key=0-2-6-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rate</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">汇率</span></td><td key=5></td></tr><tr key=0-2-6-2-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> ko_KR</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-2-0-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> ASCS</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">对韩元汇率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.509321433104</span></p></td></tr><tr key=0-2-6-2-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> zh_CN</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-2-1-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> ASCS</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">对人民币汇率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.509321433104</span></p></td></tr><tr key=0-2-6-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> headerSymbol</span></td><td key=1><span>string []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">首页推荐位货币对</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>string</span></p></td></tr><tr key=array-2><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> maket_index</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">默认显示市场</span></td><td key=5></td></tr><tr key=0-2-6-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinList</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">货币信息</span></td><td key=5></td></tr><tr key=0-2-6-5-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> EOS</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-0-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> isFiat</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0</span></td><td key=5></td></tr><tr key=0-2-6-5-0-1><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> fiatPrecision</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-0-1-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> krw</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-6-5-0-1-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> jpy</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-6-5-0-1-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> usd</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-6-5-0-1-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> cny</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-6-5-0-2><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> otcOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否显示在场外交易市场列表</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-6-5-0-3><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> symbolPrecision</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">货币精度</span></td><td key=5></td></tr><tr key=0-2-6-5-0-3-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> krw</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>4</span></p></td></tr><tr key=0-2-6-5-0-3-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> jpy</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-6-5-0-3-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> usd</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-6-5-0-3-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> cny</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5</span></p></td></tr><tr key=0-2-6-5-0-4><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">货币名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>EOS</span></p></td></tr><tr key=0-2-6-5-0-5><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">货币Icon</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20180615161844174.png</span></p></td></tr><tr key=0-2-6-5-0-6><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> tagType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-6-5-0-7><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">排序</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-6-5-0-8><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> tokenBase</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">区分主链币或者token币，如果是token币，则显示基于哪个币发行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>EOS</span></p></td></tr><tr key=0-2-6-5-0-9><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">显示精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8</span></p></td></tr><tr key=0-2-6-5-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> BTC</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> isFiat</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-1><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> fiatPrecision</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-1-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> krw</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-1-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> jpy</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-1-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> usd</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-1-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> cny</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-2><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> otcOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-3><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> symbolPrecision</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-3-0><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> krw</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-3-1><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> jpy</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-3-2><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> usd</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-3-3><td key=0><span style="padding-left: 100px"><span style="color: #8c8a8a">├─</span> cny</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-4><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-5><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-6><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> tagType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-7><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-8><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> tokenBase</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-5-1-9><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> klineScale</span></td><td key=1><span>string []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>string</span></p></td></tr><tr key=array-3><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> marketSort</span></td><td key=1><span>string []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>string</span></p></td></tr><tr key=array-4><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> HIT</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> klineColor</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">废弃</span></td><td key=5></td></tr><tr key=0-2-8-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> up</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-8-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> down</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> nc</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里云必要参数</span></td><td key=5></td></tr><tr key=0-2-9-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> nc_lang</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-9-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> nc_appkey</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-9-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> nc_prefix</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lan</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">语言</span></td><td key=5></td></tr><tr key=0-2-10-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> defLan</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">默认显示语言</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh_CN</span></p></td></tr><tr key=0-2-10-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lanList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-10-1-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>简体中文</span></p></td></tr><tr key=0-2-10-1-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh_CN</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> h5_mining_style</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> seo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-12-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> keywords</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">搜索关键字</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc,eth</span></p></td></tr><tr key=0-2-12-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易所描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特币交易平台</span></p></td></tr><tr key=0-2-12-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> pageContent</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">分享图片</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/upload/20190319191422282.png</span></p></td></tr><tr key=0-2-12-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">浏览器Tab标签内容</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>比特币交易平台</span></p></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> footer_style</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
# 交易挖矿

## 交易挖矿页面
<a id=交易挖矿页面> </a>
### 基本信息

**Path：** /return/return_info_list

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page | 否  |  1 |  页码 |
| pageSize | 否  |  10 |  每页数据条数 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台币币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BNB</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> total_return_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台币总流通量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11345.28976509</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> today_return_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">今天待分配挖矿累计产出</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11345.28976509</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> today_dividend_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">今天待分红收入累计折合BTC</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.2</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> yesterday_return_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">昨日挖矿产出</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> yesterday_dividend_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">昨日分配收入累计折合BTC</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>312</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> return_count</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">今日挖矿明细列表数据总量，用于分页</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> dividend_count</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">今日待分红收入列表数据总量，用于分页</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> yesterday_dividend_count</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">昨日分红列表数据总量，用于分页</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-9><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> return_list</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">今日挖矿明细列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-9-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dtime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-07-30 11:00:00</span></p></td></tr><tr key=0-9-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> return_number_btc</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易量折合 BTC 的数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>21.50634442</span></p></td></tr><tr key=0-9-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> return_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">产出平台币的数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12312</span></p></td></tr><tr key=0-9-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态：0--待返还 1--返还</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-10><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> dividend_list</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">今日待分红收入列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-10-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ETH</span></p></td></tr><tr key=0-10-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台总手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12</span></p></td></tr><tr key=0-10-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dividend_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">待分红</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22</span></p></td></tr><tr key=0-11><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> yesterday_dividend_list</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">昨日分红列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-11-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ETH</span></p></td></tr><tr key=0-11-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台总手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12</span></p></td></tr><tr key=0-11-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dividend_number</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已分配</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>21</span></p></td></tr><tr key=0-12><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-13><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mag</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-14><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 邀请明细
<a id=邀请明细> </a>
### 基本信息

**Path：** /return/invite_info_list

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page | 是  |  1 |   |
| pageSize | 是  |  10 |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> invite_number</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已邀请人数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> inviteUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请链接</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://www.hiex.pro//register?inviteCode=EVGWZGA</span></p></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> inviteCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>EVGWZGA</span></p></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> invite_list</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请记录</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> invitee</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>183****2563</span></p></td></tr><tr key=0-3-3-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> register_time</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-07-30 08:00:00"</span></p></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> inviteQECode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请链接二维码</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> invite_return_number</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已获得返还金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台币币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BNB</span></p></td></tr>
               </tbody>
              </table>
            
# 账户（登录注册找回密码）

## 找回密码
<a id=找回密码> </a>
### 基本信息

**Path：** /user/reset_password

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| countryCode | text  |  否 |    |  国家编号 |
| csessionid | text  |  是 |  e9c590441a1fc37201f5465e8a0aa73e  |  阿里滑动验证码相关 |
| token | text  |  是 |  bf5840eec1c7ac94516faed584ef5bb37a085a9e409e453a83686280bfe11e14  |  阿里滑动验证码相关 |
| sig | text  |  是 |  87d549d9ed44b765a2cce71b5d166d04  |  阿里滑动验证码相关 |
| scene | text  |  是 |  7fc784f52fa11bdcbb0e3a97b21e0bd5  |  阿里滑动验证码相关 |
| smsAuthCode | text  |  是 |  998008  |  短信验证码 |
| mobileNumber | text  |  否 |  ******  |  手机号码 |
| email | text  |  否 |    |  邮箱地址 |
| time | text  |  否 |    |  时间戳 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 发送短信
<a id=发送短信> </a>
### 基本信息

**Path：** /common/smsValidCode

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countryCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家编号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mobile</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">在登陆的二次验证
找回密码二次验证时使用
填编号和手机号时必填</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> operationType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">模板编号

1-手机号码注册

2-绑定手机号码

3-修改手机号码

4-绑定邮箱

5-修改登录密码

6-设置资金密码

7-修改资金密码

8-设置交易验证

9-修改密码

10-提币

11-添加数字货币地址

12-修改数字货币地址

13-数字货币提现

14-关闭手机验证

15-修改邮箱

16-操作OpenApi

24-找回密码

25-手机登录

26-关闭谷歌认证

27-操作手势密码

28-操作支付方式

29-绑定钱包</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>24</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sig</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填编号和手机号时必填</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> scene</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填编号和手机号时必填</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> csessionid</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填编号和手机号时必填</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 忘记密码_第一步
<a id=忘记密码_第一步> </a>
### 基本信息

**Path：** /user/reset_password_step_one

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| geetest_challenge | text  |  是 |  87d549d9ed44b765a2cce71b5d166d04  |  极验 |
| geetest_seccode | text  |  是 |  e9c590441a1fc37201f5465e8a0aa73e|jordan  |  极验 |
| geetest_validate | text  |  是 |  e9c590441a1fc37201f5465e8a0aa73e  |  极验 |
| mobileNumber | text  |  否 |  1352068****  |  与邮箱二选一 |
| verificationType | text  |  是 |  2  |   |
| email | text  |  否 |  ""  |  与手机号二选一 |
| countryCode | text  |  否 |  ""  |  国家编号 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isCertificateNumber</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">//下一步是否身份证验证，0表示不需要</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isGoogleAuth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下一步是否进行google验证， 0不需要</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>9daf246e61a0393434822fe7601c5d94fc3abf31e40743df901323ec7ac150a7</span></p></td></tr>
               </tbody>
              </table>
            
## 忘记密码_第三步
<a id=忘记密码_第三步> </a>
### 基本信息

**Path：** /user/reset_password_step_three

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| token | text  |  是 |  bf5840eec1c7ac94516faed584ef5bb37a085a9e409e453a83686280bfe11e14  |   |
| loginPword | text  |  是 |  ******  |  	密码 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 忘记密码_第二步
<a id=忘记密码_第二步> </a>
### 基本信息

**Path：** /user/reset_password_step_two

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| smsCode | text  |  否 |  535271  |  短信验证码 |
| mobileNumber | text  |  否 |    |  mobileNumber |
| emial | text  |  否 |    |  emial |
| emailCode | text  |  否 |    |  emailCode |
| certifcateNumber | text  |  否 |  ""  |  证件号 |
| googleCode | text  |  否 |  ""  |  google验证码相关 |
| token | text  |  是 |  9daf246e61a0393434822fe7601c5d94fc3abf31e40743df901323ec7ac150a7  |   |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">suc</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 手机号注册-校验短信验证码并注册
<a id=手机号注册-校验短信验证码并注册> </a>
### 基本信息

**Path：** /user/reg_mobile_confirm

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户输入的短信验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>882097</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">reg_mobile_chk_info 接口返回的验证token</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>76b20ff115677377686883627e2b55172d8c03a96cf64ae534cb2037c654d4</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 手机号注册-验证基础参数
<a id=手机号注册-验证基础参数> </a>
### 基本信息

**Path：** /user/reg_mobile_chk_info

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countryCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家编号(手机注册时必填)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>+86</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">	手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1761005****</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>******</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> newPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">校验密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>******</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> invitedCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>""</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> verificationType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">使用验证码类型,0-不验证,1-阿里云 2-极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_challenge</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>253dd8af5b7c954dde0b8e20128f533e</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_seccode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8c1780bf24cea0c9d4d427d45a2a560c|jordan</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_validate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8c1780bf24cea0c9d4d427d45a2a560c</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">非0情况内容为空  验证通过, 返回token, 内容为入参按顺序拼接后的加密字符串</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>76b20ff115677377686883627e2b55172d8c03a96cf64ae534cb2037c654d4</span></p></td></tr>
               </tbody>
              </table>
            
## 手机注册
<a id=手机注册> </a>
### 基本信息

**Path：** /user/reg_mobile

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countryCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家编号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> newPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机或者邮件验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> invitedCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> numberCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家数字编码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 发送邮箱验证码
<a id=发送邮箱验证码> </a>
### 基本信息

**Path：** /common/emailValidCode

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> operationType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">模板编号  1-邮箱注册  2-绑定邮箱  3-找回密码  4-邮箱登录</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱地址</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> aliyuntoken</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填邮箱时必填</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sig</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填邮箱时必填</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> scene</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填邮箱时必填</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> csessionid</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">阿里滑动验证码相关
填邮箱时必填</span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">在登陆的二次验证  找回密码二次验证时使用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 极验初始化
<a id=极验初始化> </a>
### 基本信息

**Path：** /common/tartCaptcha

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回的数据内容</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> captcha</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> success</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> challenge</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>45a31e19e9c2b36c51f1105e32b812a7</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> gt</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5eda313da3c91594392432f3f1742c93</span></p></td></tr>
               </tbody>
              </table>
            
## 登录
<a id=登录> </a>
### 基本信息

**Path：** /user/login_in

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_challenge</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>45a31e19e9c2b36c51f1105e32b812a7</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_seccode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>27434608acf10169fb45b3195bcef327|jordan</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_validate</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>27434608acf10169fb45b3195bcef327</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>******</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>*****</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> nc</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> token</span></td><td key=1><span>boolean</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> verificationType</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：登录成功；非0：登录失败</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">二次登陆校验使用的token值</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>c748b8192bd2ac8bffec94d85bb32c7cf09bd1f6a90a40bebe5285164f94f8d2</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1. google验证，2. 短信验证，3. 邮箱验证</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 登陆二次确认
<a id=登陆二次确认> </a>
### 基本信息

**Path：** /user/confirm_login

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> authCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">google验证码/短信验证码/邮箱验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>315883</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>c748b8192bd2ac8bffec94d85bb32c7cf09bd1f6a90a40bebe5285164f94f8d2</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> type</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>google</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentLevel</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentPid</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentRoleId</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentSource</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentUserAuditStatus</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentUserId</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentUserRoleName</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> agentUserStatus</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authPhoneStatus</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authRealnamemtime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bindEmail</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bindTel</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> birthDate</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> capital</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-17><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> capitalPword</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-18><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> certificateTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-19><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> countryCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-20><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-21><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> deposit</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-22><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-23><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-24><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> excOtcStatus</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-25><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> excStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-26><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> excexpireTime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-27><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> exchangeVerify</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-28><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> familyName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-29><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> googleAuthenticatorKey</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-30><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> googleAuthenticatorStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-31><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> hideMobileNumber</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-32><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-33><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lastLoginTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-34><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lasttimeExchangeVerify</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-35><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lockexpireTime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-36><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginPword</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-37><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-38><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginVerify</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-39><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginexpireTime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-40><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mobileAuthenticatorStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-41><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-42><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-43><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-44><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> nickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>mujin</span></p></td></tr><tr key=0-2-45><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-46><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> realName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-47><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> realnameTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-48><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> register</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-49><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> settingVerify</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-50><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> showMobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-51><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-52><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> withdrawStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-53><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> withdrawVerify</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-54><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> withdrawexpireTime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 获取登录状态
<a id=获取登录状态> </a>
### 基本信息

**Path：** /user/token/verify

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>212</span></p></td></tr>
               </tbody>
              </table>
            
## 退出
<a id=退出> </a>
### 基本信息

**Path：** /user/login_out

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@string</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 邮箱注册
<a id=邮箱注册> </a>
### 基本信息

**Path：** /user/reg_email

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> email</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> newPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">校验密码</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> invitedCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请码</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> emailAuthCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮件验证码</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> numberCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家数字编码</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 邮箱注册-校验短信验证码并注册
<a id=邮箱注册-校验短信验证码并注册> </a>
### 基本信息

**Path：** /user/reg_email_confirm

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> emailCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户输入的邮箱验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>659699</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">reg_email_chk_info 接口返回的验证token</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>7fc784f52fa11bdcbb0e3a97b21e0bd5</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 邮箱注册-验证基础参数
<a id=邮箱注册-验证基础参数> </a>
### 基本信息

**Path：** /user/reg_email_chk_info

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>*****@126.com</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_challenge</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>c1cef05c1013d0c3b250f5781e052579</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_seccode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>06e69008e5402ea152544322c9ba2d0a|jordan</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> geetest_validate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>06e69008e5402ea152544322c9ba2d0a</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> invitedCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邀请码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>""</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>******</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> newPassword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">校验密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>******</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> verificationType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">使用验证码类型,0-不验证,1-阿里云 2-极验</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">非0情况内容为空  验证通过, 返回token, 内容为入参按顺序拼接后的加密字符串;</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>c993f33a6adbbca3e5024557709a8035</span></p></td></tr>
               </tbody>
              </table>
            
# 经纪人

## 导出下级交易返佣
<a id=导出下级交易返佣> </a>
### 基本信息

**Path：** /agentV2/agent_data_export

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| pageNum | 是  |  1 |  页数 |
| coinName | 是  |  BTC |  币种（必填） |
| keyword | 是  |  b |  关键字 |
| keyword_type | 是  |  1 |  1.uid，2.手机号，3.邮箱 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 获取下级交易返佣
<a id=获取下级交易返佣> </a>
### 基本信息

**Path：** /agentV2/agent_data_query

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| pageNum | 是  |  1 |  页数 |
| coinName | 是  |  BTC |  币种（必填） |
| keyword | 是  |  b |  关键字 |
| keyword_type | 是  |  1 |  1.uid，2.手机号，3.邮箱 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userCount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总人数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> allBonusAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总获得返佣</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>9999</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> allBonusCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返佣币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mapList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>187102718881</span></p></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22@22.com，</span></p></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> level</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">层级</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>222.22</span></p></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> bonusAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返佣数额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22.22</span></p></td></tr>
               </tbody>
              </table>
            
## 经纪人返利详情excel导出
<a id=经纪人返利详情excel导出> </a>
### 基本信息

**Path：** /agent/agent_branch_bonus_export

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| timeStr | 是  |  2018-09-07 |  时间（例如：2018-09-07） |
| type | 是  |  1 |  1.年 2.月 3.日 （默认为年） |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 获取下级交易返佣详情
<a id=获取下级交易返佣详情> </a>
### 基本信息

**Path：** /agentV2/agent_data_info_query

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| pageNum | 是  |  1 |  页数 |
| uid | 是  |  1 |  UID（必填） |
| startTime | 是  |  2019-12-12 12:12:12 |  开始时间(yyyy-MM-dd HH:mm:ss) |
| endTime | 是  |  2019-12-18 12:12:12 |  结束时间(yyyy-MM-dd HH:mm:ss) |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bonusAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总收入</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bonusCoinName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> info</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>187282828282</span></p></td></tr><tr key=0-2-3-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123@22.com</span></p></td></tr><tr key=0-2-3-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mapList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> time</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间  时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>15351518545451</span></p></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是续费数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>99</span></p></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> scale</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返佣比例</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3%</span></p></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> bonus</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返佣数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>6.66</span></p></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> bonusCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返佣币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SBS</span></p></td></tr>
               </tbody>
              </table>
            
## 导出下级交易返佣详情
<a id=导出下级交易返佣详情> </a>
### 基本信息

**Path：** /agentV2/agent_data_info_export

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| pageNum | 是  |  1 |  页数 |
| uid | 是  |  1 |  UID（必填） |
| startTime | 是  |  2019-12-12 12:12:12 |  开始时间(yyyy-MM-dd HH:mm:ss) |
| endTime | 是  |  2019-12-18 12:12:12 |  结束时间(yyyy-MM-dd HH:mm:ss) |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 获取下级持币信息
<a id=获取下级持币信息> </a>
### 基本信息

**Path：** /agentV2/agent_account_query

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| pageNum | 是  |  1 |  页数 |
| coinName | 是  |  BTC |  币种（必填） |
| keyword | 是  |  b |  关键字 |
| keyword_type | 是  |  1 |  1.uid，2.手机号，3.邮箱 |
| dayTime | 是  |  2018-20-12 |  时间（yyyy-MM-dd） |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mapList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>187102728282</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123@qq.com</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> level</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">层级</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> amount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">持仓量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>666</span></p></td></tr>
               </tbody>
              </table>
            
## 导出下级持币信息
<a id=导出下级持币信息> </a>
### 基本信息

**Path：** /agentV2/agent_account_export

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| pageNum | 是  |  1 |  页数 |
| coinName | 是  |  BTC |  币种（必填） |
| keyword | 是  |  b |  关键字 |
| keyword_type | 是  |  1 |  1.uid，2.手机号，3.邮箱 |
| dayTime | 是  |  2018-20-12 |  时间（yyyy-MM-dd） |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
# 首页

## footer列表
<a id=footer列表> </a>
### 基本信息

**Path：** /cms/footer/list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">#文章id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>23</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">文章名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>关于BIKI</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fileName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">#url名称，例如url为：https://staging.365os.com/exchange-web/cms/footer/terms.html,这个name为terms</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>关于BIKI</span></p></td></tr>
               </tbody>
              </table>
            
## footer和header的后台编辑文案
<a id=footer和header的后台编辑文案> </a>
### 基本信息

**Path：** /common/footer_and_header

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> footer</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span><section class="foot-min-top y-1-bg">  <div class="footer-bar">  <div class="footer-menu clearfix">  <div class="footer-logo">  <img src="https://bikicoin.oss-cn-hangzhou.aliyuncs.com/web_doc/Footerimage/4-logo_footer@2x.png" alt=""></div>  <div class="footer-template">  <div class="footer-menu-nav clearfix">  <ul class="menu-ul">  <li class="tit z-1-cl font-18">我们</li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360015039212-%E5%85%B3%E4%BA%8E%E6%88%91%E4%BB%AC">  <span class="z-2-cl z-1-f-h">关于我们</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360015039292-%E8%81%94%E7%B3%BB%E6%88%91%E4%BB%AC">  <span class="z-2-cl z-1-f-h">联系我们</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360015039232-%E5%85%B3%E4%BA%8EBIKI">  <span class="z-2-cl z-1-f-h">关于BIKI</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360014743511-%E5%85%B3%E4%BA%8E%E6%8C%96%E7%9F%BF">  <span class="z-2-cl z-1-f-h">关于挖矿</span>  </a>  </li>  </ul>  <ul class="menu-ul">  <li class="tit z-1-cl font-18">条款说明</li>  <li class="item font-14">  <a target="_blank" href="https://bikiuser.zendesk.com/hc/zh-cn/articles/360015039332-BikiCoin%E7%94%A8%E6%88%B7%E6%9C%8D%E5%8A%A1%E5%8D%8F%E8%AE%AE%E6%9D%A1%E6%AC%BE">  <span class="z-2-cl z-1-f-h">服务条款</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://bikiuser.zendesk.com/hc/zh-cn/articles/360015254371-%E5%85%8D%E8%B4%A3%E5%A3%B0%E6%98%8E">  <span class="z-2-cl z-1-f-h">免责声明</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360027111471-%E9%9A%90%E7%A7%81%E6%9D%A1%E6%AC%BE">  <span class="z-2-cl z-1-f-h">隐私条款</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360019543671-BikiCoin%E8%B4%B9%E7%8E%87%E8%AF%B4%E6%98%8E">  <span class="z-2-cl z-1-f-h">费率说明</span>  </a>  </li>  </ul>  <ul class="menu-ul">  <li class="tit z-1-cl font-18">商务对接</li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/articles/360015040492-%E7%94%B3%E8%AF%B7%E4%B8%8A%E5%B8%81">  <span class="z-2-cl z-1-f-h">申请上币</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://github.com/code-biki/open-api">  <span class="z-2-cl z-1-f-h">API文档</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn">  <span class="z-2-cl z-1-f-h">帮助中心</span>  </a>  </li>  <li class="item font-14">  <a target="_blank" href="https://support.biki.com/hc/zh-cn/categories/360000876151-BikiCoin%E5%85%AC%E5%91%8A">  <span class="z-2-cl z-1-f-h">重要公告</span>  </a>  </li>  </ul>  </div>  <div class="media">  <h4 class="tit z-1-cl font-18">社交媒体</h4>  <a class="media-item" target="_blank" href="https://t.me/bikicoin">  <svg class="icon icon-24" aria-hidden="true">  <use xlink:href="#icon-k_4"></use>  </svg>  <svg class="icon icon-24 hover" aria-hidden="true">  <use xlink:href="#icon-k_4_1"></use>  </svg>   </a>  <a class="media-item" target="_blank" href="">  <svg class="icon icon-24" aria-hidden="true">  <use xlink:href="#icon-k_5"></use>  </svg>  <svg class="icon icon-24 hover" aria-hidden="true">  <use xlink:href="#icon-k_5_1"></use>  </svg>  </a>  <a class="media-item" target="_blank" href="https://0.plus/#/bikicoin">  <svg class="icon icon-24" aria-hidden="true">  <use xlink:href="#icon-k_6"></use>  </svg>  <svg class="icon icon-24 hover" aria-hidden="true">  <use xlink:href="#icon-k_6_1"></use>  </svg>  </a>  <a class="media-item" target="_blank" href="https://twitter.com/bikiexchange">  <svg class="icon icon-24" aria-hidden="true">  <use xlink:href="#icon-k_7"></use>  </svg>  <svg class="icon icon-24 hover" aria-hidden="true">  <use xlink:href="#icon-k_7_1"></use>  </svg>  </a>  <a class="media-item" target="_blank" href="https://www.instagram.com/bikicoin/">  <svg class="icon icon-24" aria-hidden="true">  <use xlink:href="#icon-k_8"></use>  </svg>  <svg class="icon icon-24 hover" aria-hidden="true">  <use xlink:href="#icon-k_8_1"></use>  </svg>  </a>  <a class="media-item" target="_blank" href="https://www.facebook.com/bikiexchange/">    <svg class="icon icon-24" aria-hidden="true">      <use xlink:href="#icon-k_9"></use>      </svg>      <svg class="icon icon-24 hover" aria-hidden="true">      <use xlink:href="#icon-k_9_1"></use>      </svg>  </a>  <a class="media-item" target="_blank" href="https://medium.com/@bikicoin">    <svg class="icon icon-24" aria-hidden="true">      <use xlink:href="#icon-k_10"></use>      </svg>      <svg class="icon icon-24 hover" aria-hidden="true">      <use xlink:href="#icon-k_10_1"></use>      </svg>  </a>  <a class="media-item" target="_blank" href="https://www.reddit.com/r/biki">    <svg class="icon icon-24" aria-hidden="true">      <use xlink:href="#icon-k_11"></use>      </svg>      <svg class="icon icon-24 hover" aria-hidden="true">      <use xlink:href="#icon-k_11_1"></use>      </svg>  </a>  <p class="footer-eamil">Email：contact@biki.com</p>  </div>  </div>  </div>  </div>  <div class="Partners y-4-bd">  <ul class="clearfix">  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808150738487.png" alt=""></li>  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808150807632.png" alt=""></li>  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808150830518.png" alt=""></li>  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808150851997.png" alt=""></li>  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808150920336.png" alt=""></li>  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808161145460.png" alt=""></li>  <li><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808161214432.png" alt=""></li>  </ul>  </div>  <div class="Partners-bot z-2-cl">Copyright 2018-2019 Biki. All rights reserved </div>  </section>  <style>  .footer-bar {  padding-bottom: 30px;  }  .footer-eamil {  margin-top: 20px;  font-size: 12px;  }  .Partners {  border-top-style: solid;  border-top-width: 1px;  width: 100%;  padding: 40px 0;  }  .Partners-bot {  text-align: center;  padding-bottom: 40px;  }  .Partners ul {  margin: 0 auto;  width: 1335px;  }  .Partners li {  float: left;  margin: 0 25px;  line-height: 50px;  height: 50px;  }  .Partners li img {  width: 140px;  line-height: 50px;  /* height: 50px; */  vertical-align: middle  }  .footer-logo img {  width: 120px;  height: 22px;  }  .menu-ul {  width: 180px;  float: left;  padding-right: 40px;  }  .menu-ul li {  line-height: 26px;  }  .menu-ul li .hoverShow {  display: none;  }  .menu-ul li:hover .hoverShow {  display: inline-block;  }  .menu-ul li:hover .hoverHide {  display: none;  }  .menu-ul .tit {  margin-bottom: 15px;  }  .media {  position: absolute;  top: 40px;  right: 0;  }  .media .tit {  line-height: 26px;  margin-bottom: 15px;  margin-top: 0!important;  }  .media-item {  margin-right: 10px;  }  .media-item .img-icon{    width: 24px;    height: 24px;  }  .media-item .hover {  display: none;  }  .media-item:hover .icon {  display: none;  }  .media-item:hover .hover {  display: inline;  }  .footer-template .contact {  width: 300px;  padding-top: 8px;  }  .footer-template .contact a {  color: #5a6679;  }  .footer-template .menu-ul {  width: 120px;  float: left;  padding-left: 40px  }  .footer-template .menu-ul li {  line-height: 26px;  }  .footer-template .menu-ul li .hoverShow {  display: none;  }  .footer-template .menu-ul li:hover .hoverShow {  display: inline-block;  }  .footer-template .menu-ul li:hover .hoverHide {  display: none;  }  .footer-template .menu-ul .tit {  margin-bottom: 15px;  }  .footer-template .media {  width: 206px;  position: absolute;  top: 40px;  right: 0;  box-sizing: border-box;  padding-right: 40px;  }  .footer-template .media .tit {  margin-top: 4px;  margin-bottom: 20px;  }  .footer-template .media-item {  line-height: 3;  margin-right: 10px;  }  .footer-template .media-item .hover {  display: none;  }  .footer-template .media-item:hover .icon {  display: none;  }  .footer-template .media-item:hover .hover {  display: inline;  }  .left {  float: left  }  .right {  float: right  }  </style></span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> header</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>[{"text": "BiKiLab","link": "https://www.biki.com/innovation","target":"black"},{"text": "关于BIKI","link": "https://support.biki.com/hc/zh-cn/articles/360015039212-%E5%85%B3%E4%BA%8E%E6%88%91%E4%BB%AC","target":"black"},{"text": "申请上币","link": "https://support.biki.com/hc/zh-cn/articles/360015040492-%E7%94%B3%E8%AF%B7%E4%B8%8A%E5%B8%81","target":"black"},{"text": "APP下载","link": "https://www.biki.com/appDownload","target":"black"},{"text": "合伙人计划","link": "https://www.biki.com/noticeInfo/289","target":"black"},{"text": "新手指南","link": "https://support.biki.com/hc/zh-cn/articles/360031582771--史上最全-BiKi交易所最新新手帮助-值得收藏-","target":"black"}]</span></p></td></tr>
               </tbody>
              </table>
            
## 下载页面
<a id=下载页面> </a>
### 基本信息

**Path：** /common/app_download

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ios_download_url</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>itms-services://?action=download-manifest&url=https://bikicoin.oss-cn-hangzhou.aliyuncs.com/APP/BiKi_4.0.11.plist</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ios_ipa_download_url</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://bikicoin.oss-cn-hangzhou.aliyuncs.com/APP/BiKi_4.0.11.ipa</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> android_download_url</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://app-build.oss-cn-hangzhou.aliyuncs.com/BikiCoin/BiKi_4.0.22.apk</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> app_page_url</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAADICAIAAAAiOjnJAAADfUlEQVR42u3bUZLiMAxFUfa/6e4t↵kEJPUuxzP6kZoJOTKkcOnz8p0MchEFgCS2BJYAksgSWBJbAElgSWwBJYElgCS2BJYAksgSWBJbAE↵lgSWwBJYElgCS2BJYAksgSWBJbAEVs3HBHr6ud+8/s13rvq7nn7PzuMGFlhggQUWWGC9D1b6fX45↵kVWwqqB3HjewwAILLLDAAuscWOlFbhW4zvfsPG5ggQUWWGCBBRZYlYPExI1CYmALFlhggQUWWGCB↵tR1W+n2q3hMssMACCyywwALrV1gJoE/fJ72RvAEEWGCBBRZYYIHlxxSpHyO8/XU/pgALLLDAAgss↵sLpLoJxasB9yRsACCyywwAILrMEBaWIRmn5Ar2pzeur4gAUWWGCBBRZYZy7eExuumzeG0w8JggUW↵WGCBBRZYFu/di/dOWFUXxtQNClhggQUWWGCBdSasXxa2idcTF0D6ItmDDCywwAILLLDAGh2jFQ0J↵qw5uYvCYGGBWwQULLLDAAgsssM6BNbWBOgWxc1G/Z3MaLLDAAgsssMB604A0vQCvwlF1HHYuzMEC↵CyywwAILrBMGpFND18QGeee/ue6uECywwAILLLAuhzU1AJxC88tgdv9mM1hggQUWWGCBtWVA2vkj↵iKoFb+ciuupm4rpNaLDAAgsssMACq2RDemqIWoUmge+6ASlYYIEFFlhggVX+ENzUiew82YnPBQss↵sMACCyyw7lq8pweGiaFi1YnsfHgQLLDAAgsssMA6f/Ge2EDtHKImkCUuNrDAAgsssMAC6y5YVfg6↵T/YGuDuHomCBBRZYYIEF1nZYiQcDqwaPncNMm9BggQUWWGCBBdbkgrfqBFR9/8TFkLiJAQsssMAC↵Cyyw3g1rCm7nDzSqBr9VF9js5jRYYIEFFlhggdV94jsXqum2DYEXXepggQUWWGCBBdZLB6SJBXXn↵Yjm9eDd5BwsssMACC6x7YXU+3Fd18hL/N3EDcfWPKcACCyywwAILrHJYieFtFYj0MQELLLDAAgss↵sMDqXrw/hZjeqN7/sB5YYIEFFlhggfVWWJ3v0/mQXXpjeP+wFCywwAILLLDA6oaVXhR3frfOG5qp↵ixkssMACCyywwNoLS7cFlsASWAJLAktgCSwJLIElsCSwBJbAksASWAJLAktgCSwJLIElsCSwBJbA↵ksASWAJLAktgCSwJLIGl4/sHvyu7CXxMG7kAAAAASUVORK5CYII=</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> logo</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808144606743.png</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>""</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> company_name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BiKi</span></p></td></tr>
               </tbody>
              </table>
            
## 修改语言，保存到数据库
<a id=修改语言，保存到数据库> </a>
### 基本信息

**Path：** /common/change_language

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> language</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 消息中心
<a id=消息中心> </a>
### 基本信息

**Path：** /message/user_message

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">起始页</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> messageType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：全部，1-系统消息 2-充值提现 3-安全消息 4-认证消息 7-场外消息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> messageType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userMessageList</span></td><td key=1><span>string []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>string</span></p></td></tr><tr key=array-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> typeList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-4-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> tid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-4-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>全部消息</span></p></td></tr>
               </tbody>
              </table>
            
## 获取币种简介
<a id=获取币种简介> </a>
### 基本信息

**Path：** /common/coinSymbol_introduce

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>7</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> shortName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> longName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>泰达币</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> langKey</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh_CN</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> publishTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1402329600000</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> publishTimeStr</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2014/06/10</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> publishAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3.62B</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> currencyAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3.42B</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> officialUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://tether.to/</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> blockchainUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://www.omniexplorer.info/</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> introduction</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT是Tether公司推出的基于稳定价值货币美元（USD）的代币Tether USD（下称USDT），1USDT=1美元，用户可以随时使用USDT与USD进行1:1兑换。Tether公司严格遵守1:1准备金保证，即每发行1个 USDT代币，其银行账户都会有1美元的资金保障。用户可以在Tether平台进行资金查询，以保障透明度。用户可以通过SWIFT电汇美元至Tether公司提供的银行帐户，或通过交易所换取USDT；赎回美元时，反向操作即可。用户也可在交易平台用比特币换取USDT。USDT是在比特币区块链上发布的基于Omni Layer协议的数字资产。USDT最大的特点是，它与同数量的美元是等值的，在交易平台上可以互相赎买。USDT可以看成与比特币类似的代币，人们能够通过钱包转移、贮存和消费。USDT作为美元在数字网络上的复制品的设计，使之成为波动剧烈的加密货币市场中良好的保值代币。CoinGecko：https://www.coingecko.com/zh/%E6%95%B0%E5%AD%97%E8%B4%A7%E5%B8%81/%E6%B3%B0%E8%BE%BE%E5%B8%81CoinMarketCap：https://coinmarketcap.com/zh/currencies/tether/"</span></p></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1563951465000</span></p></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1563951465000</span></p></td></tr>
               </tbody>
              </table>
            
## 获取当前用户未读信息数
<a id=获取当前用户未读信息数> </a>
### 基本信息

**Path：** /get_no_read_message_count

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> noReadMsgCount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userMessageList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> messageContent</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> messageType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> receiveUid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 首页
<a id=首页> </a>
### 基本信息

**Path：** /common/index

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> cmsAdvertList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">轮播图</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>439</span></p></td></tr><tr key=0-0-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>合伙人中文</span></p></td></tr><tr key=0-0-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/2019082910562138774.jpg</span></p></td></tr><tr key=0-0-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> httpUrl</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://www.biki.com/noticeInfo/851</span></p></td></tr><tr key=0-0-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-0-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lang</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh</span></p></td></tr><tr key=0-0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> cmsAppAdvertList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">h5和app轮播图</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1012</span></p></td></tr><tr key=0-0-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>合伙人</span></p></td></tr><tr key=0-0-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chainup-oss.oss-cn-beijing.aliyuncs.com/app_advert/1567047441024.jpg</span></p></td></tr><tr key=0-0-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> httpUrl</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>https://m.biki.com/noticeDetail?id=851</span></p></td></tr><tr key=0-0-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-0-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lang</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh</span></p></td></tr><tr key=0-0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> noticeInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最新的一条公告</span></td><td key=5></td></tr><tr key=0-0-2-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1367</span></p></td></tr><tr key=0-0-2-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BiKi平台关于上线DTC的公告（0906）</span></p></td></tr><tr key=0-0-2-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> content</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span><p>尊敬的用户：<br />↵BiKi平台即将开放DTC的充值、提现，并开放DTC/USDT交易对，具体时间如下：</p>↵↵<p>&nbsp;</p>↵↵<p>1、开放充值时间：9月9日&nbsp;16：00&nbsp;（GMT+8）；</p>↵↵<p>2、开放提现时间：9月9日&nbsp;16：00&nbsp;（GMT+8）；</p>↵↵<p>3、开放交易时间：9月10日&nbsp;16：00&nbsp;（GMT+8）；</p>↵↵<p>&nbsp;</p>↵↵<p>币种介绍：</p>↵↵<p>代币名称：Data Transaction</p>↵↵<p>英文缩写：DTC</p>↵↵<p>发行总量：1,776,000,000&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>↵↵<p>流通量：115,440,000&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>↵↵<p>官方网站：<a href="http://www.dtcoin.vip/">www.dtcoin.vip</a></p>↵↵<p>白皮书：&nbsp;<a href="http://www.dtcoin.vip/">www.dtcoin.vip</a></p>↵↵<p>区块浏览：&nbsp;https://etherscan.io/token/0xb0a181A1154D622DDec62524aB6469E62f84031a</p>↵↵<p>&nbsp;</p>↵↵<p>项目介绍：</p>↵↵<p>Data Transaction（DTC)，是一种构建于区块链闪电网络上的点对点数据交易系统，是人类经济学第一定律DT&gt;0和区块链技术的完美结合。它具备数据交易、数据储存、数字资产交易等多种应用功能，通过内置的广义经济学模型，让数据在DTC网络中不断地被交易，从而让DTC产生更广泛的流通和应用价值。</p>↵↵<p>注：以上信息为项目方提供，仅供参考。</p>↵↵<p>&nbsp;</p>↵↵<p>BiKi.com group：</p>↵↵<p>微信福利群：添加微信号&ldquo;bnmj13309&rdquo;进官方微信群</p>↵↵<p>微博：https://www.weibo.com/u/6790213530</p>↵↵<p>中文电报群：https://t.me/bikicoin</p>↵↵<p>English Telegram：https://t.me/BikiEnglish</p>↵↵<p>Vietnam Telegram：https://t.me/BikiVietnam</p>↵↵<p>Twitter：https://twitter.com/BiKiEnglish</p>↵↵<p>Facebook：https://www.facebook.com/bikiexchange/</p>↵↵<p>Reddit：https://www.reddit.com/r/biki</p>↵↵<p>Medium: https://medium.com/@bikicoin</p>↵↵<p>&nbsp;</p>↵↵<p>感谢您对BiKi平台的支持，BiKi团队期待您的宝贵意见。</p>↵↵<p>BiKi团队</p>↵↵<p>2019-09-06</p></span></p></td></tr><tr key=0-0-2-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567784565000</span></p></td></tr><tr key=0-0-2-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567784565000</span></p></td></tr><tr key=0-0-2-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> stime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567784565000</span></p></td></tr><tr key=0-0-2-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lang</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh</span></p></td></tr><tr key=0-0-2-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> httpUrl</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> noticeInfoList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最新的五条公告（新增）</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1367</span></p></td></tr><tr key=0-0-3-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BiKi平台关于上线DTC的公告（0906）</span></p></td></tr><tr key=0-0-3-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> content</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span><p>尊敬的用户：<br />↵BiKi平台即将开放DTC的充值、提现，并开放DTC/USDT交易对，具体时间如下：</p>↵↵<p>&nbsp;</p>↵↵<p>1、开放充值时间：9月9日&nbsp;16：00&nbsp;（GMT+8）；</p>↵↵<p>2、开放提现时间：9月9日&nbsp;16：00&nbsp;（GMT+8）；</p>↵↵<p>3、开放交易时间：9月10日&nbsp;16：00&nbsp;（GMT+8）；</p>↵↵<p>&nbsp;</p>↵↵<p>币种介绍：</p>↵↵<p>代币名称：Data Transaction</p>↵↵<p>英文缩写：DTC</p>↵↵<p>发行总量：1,776,000,000&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>↵↵<p>流通量：115,440,000&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>↵↵<p>官方网站：<a href="http://www.dtcoin.vip/">www.dtcoin.vip</a></p>↵↵<p>白皮书：&nbsp;<a href="http://www.dtcoin.vip/">www.dtcoin.vip</a></p>↵↵<p>区块浏览：&nbsp;https://etherscan.io/token/0xb0a181A1154D622DDec62524aB6469E62f84031a</p>↵↵<p>&nbsp;</p>↵↵<p>项目介绍：</p>↵↵<p>Data Transaction（DTC)，是一种构建于区块链闪电网络上的点对点数据交易系统，是人类经济学第一定律DT&gt;0和区块链技术的完美结合。它具备数据交易、数据储存、数字资产交易等多种应用功能，通过内置的广义经济学模型，让数据在DTC网络中不断地被交易，从而让DTC产生更广泛的流通和应用价值。</p>↵↵<p>注：以上信息为项目方提供，仅供参考。</p>↵↵<p>&nbsp;</p>↵↵<p>BiKi.com group：</p>↵↵<p>微信福利群：添加微信号&ldquo;bnmj13309&rdquo;进官方微信群</p>↵↵<p>微博：https://www.weibo.com/u/6790213530</p>↵↵<p>中文电报群：https://t.me/bikicoin</p>↵↵<p>English Telegram：https://t.me/BikiEnglish</p>↵↵<p>Vietnam Telegram：https://t.me/BikiVietnam</p>↵↵<p>Twitter：https://twitter.com/BiKiEnglish</p>↵↵<p>Facebook：https://www.facebook.com/bikiexchange/</p>↵↵<p>Reddit：https://www.reddit.com/r/biki</p>↵↵<p>Medium: https://medium.com/@bikicoin</p>↵↵<p>&nbsp;</p>↵↵<p>感谢您对BiKi平台的支持，BiKi团队期待您的宝贵意见。</p>↵↵<p>BiKi团队</p>↵↵<p>2019-09-06</p></span></p></td></tr><tr key=0-0-3-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567784565000</span></p></td></tr><tr key=0-0-3-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567784565000</span></p></td></tr><tr key=0-0-3-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> stime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567784565000</span></p></td></tr><tr key=0-0-3-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lang</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>zh</span></p></td></tr><tr key=0-0-3-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> httpUrl</span></td><td key=1><span>null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> footer_warm_prompt</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">首页底部温馨提示</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span><div class="navs c-5-bd"><div class="title f-1-cl">全球领先的数字货币交易平台</div><div class="mess">为全球100多个国家/地区的百万用户提供安全，可信赖的数字资产交易和资产管理服务</div><ul class="custom"><li class="custom-even"><div class="custom-even-rp custom-even-text"><div class="custom-title f-1-cl">银行级安全保障</div><div class="custom-mess">多级防⽕墙、多重签名、冷热隔离钱包、多维度降低用户资产风险</div></div><div class="custom-even-rp custom-even-imgBox"><img class="custom-even-img" id="interImg1" src="" alt=""></div></li><li class="custom-even"><div class="custom-even-rp custom-even-text"><div class="custom-title f-1-cl">极致的交易体验</div><div class="custom-mess">良好的流动性、活跃的社群、客服7*24小时响应</div></div><div class="custom-even-rp custom-even-imgBox"><img class="custom-even-img" id="interImg2" src="" alt=""></div></li><li class="custom-even"><div class="custom-even-rp custom-even-text"><div class="custom-title f-1-cl">全球化布局</div><div class="custom-mess">全球化的币种拓展能力和全球化的用户服务能力</div></div><div class="custom-even-rp custom-even-imgBox"><img class="custom-even-img" id="interImg3" src="" alt=""></div></li><li class="custom-even"><div class="custom-even-rp custom-even-text"><div class="custom-title f-1-cl">国际化专业团队</div><div class="custom-mess">团队成员均为数字货币领域早期的投资者和区块链研究者，在数字货币领域具有丰富的研发和运营经验</div></div><div class="custom-even-rp custom-even-imgBox"><img class="custom-even-img" id="interImg4" src="" alt=""></div></li></ul></div><div class="appDown" style="background: url('https://chaindown-oss.oss-cn-hongkong.aliyuncs.com/static/2/images/194875e87c0688d571ace6cbaea0baa8.png') rgb(14, 26, 45);"><div class="appDown-center"><div class="appDown-imgBox"><img src="https://bikicoin.oss-cn-hangzhou.aliyuncs.com/web_doc/Footerimage/%E6%89%8B%E6%9C%BA@2x.png" alt=""></div><div class="appDown-mess" v-if="flag"><div class="appDown-logo"><img src="https://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190808144606743.png" alt=""></div><p class="appDown-name f-8-cl">下载APP客户端</p><!-- 随时随地 多平台终端交易 --><p class="appDown-text">随时随地 多平台终端交易</p><p class="appDown-type">iOS | Android</p><div class="appDown-button"><a class="f-8-bd f-8-cl appDown-but"href="/appDownload">下载客户端</a></div></div></div></div><script>setTimeout(() => {if(window.imgMap) {var img1 = document.getElementById('interImg1');img1.src = window.imgMap.interCcustom1;var img2 = document.getElementById('interImg2');img2.src = window.imgMap.interCcustom2;var img3 = document.getElementById('interImg3');img3.src = window.imgMap.interCcustom3;var img4 = document.getElementById('interImg4');img4.src = window.imgMap.interCcustom4;}})</script></span></p></td></tr><tr key=0-0-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> index_international_title1</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>让数字货币成为主流</span></p></td></tr><tr key=0-0-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> index_international_title2</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BiKi.com</span></p></td></tr><tr key=0-0-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> risingListIsOpen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">	涨幅榜开关，1：开启，0：关闭</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-0-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fallingListIsOpen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">	跌幅榜开关</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-0-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealListIsOpen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">	成交榜开关</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
# 币币交易

## 交易下单
<a id=交易下单> </a>
### 基本信息

**Path：** /order/create

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| price | 是  |   "0.00984983" |  价格 |
| side | 是  |   "BUY" |  卖出SELL  买入BUY |
| symbol | 是  |   "mmusdt" |  交易币对 |
| type | 是  |   1 |  1: 限价交易  2：市价交易 |
| volume | 是  |   "1.0000" |  数量 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>操作成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 历史委托(订单重复)
<a id=历史委托(订单重复)> </a>
### 基本信息

**Path：** /order/entrust_history

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page | 是  |   1 |  当前分页 |
| pageSize | 是  |   10 |  分页数量 |
| symbol | 是  |   "bchbtc" |  币对 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总数量</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.3600000000</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1558946427357</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类别 文字</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>卖出</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> created_at</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2019-05-27 16:40:27</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.0000000000"</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>WEB</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3.0000000000</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.123</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态,文字</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>未成交</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3.0000000000</span></p></td></tr><tr key=0-2-1-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BCH</span></p></td></tr><tr key=0-2-1-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 取消订单
<a id=取消订单> </a>
### 基本信息

**Path：** /order/cancel

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| orderId | 是  |   44093984 |  订单ID |
| symbol | 是  |   "bchbtc" |  币对 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功过</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 当前委托(订单重复)
<a id=当前委托(订单重复)> </a>
### 基本信息

**Path：** /order/list/new

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page | 是  |   1 |  当前分页 |
| pageSize | 是  |   10 |  分页数量 |
| symbol | 是  |   "bchbtc" |  币对 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总数量</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.3600000000</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1558946427357</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类别 文字</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>卖出</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> created_at</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2019-05-27 16:40:27</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.0000000000"</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>WEB</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3.0000000000</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.123</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态,文字</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>未成交</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3.0000000000</span></p></td></tr><tr key=0-2-1-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BCH</span></p></td></tr><tr key=0-2-1-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 订单详情
<a id=订单详情> </a>
### 基本信息

**Path：** /trade/list_by_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| order_id | 是  |   44094068 |  订单ID |
| pageSize | 是  |   10 |  分页数量 |
| symbol | 是  |   "bchbtc" |  币对 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> trade_list</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.00000000</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类别</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>usdt</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1525509694330</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.00000000</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side_text</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类别</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>卖出</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.01</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-05-05 16:41:34</span></p></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> deal_price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.0</span></p></td></tr><tr key=0-2-0-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12</span></p></td></tr>
               </tbody>
              </table>
            
# 资产

## 划转记录
<a id=划转记录> </a>
### 基本信息

**Path：** /lever/finance/transfer/list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对btcusdt(不带"/")</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btcusdt</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> transactionType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.转入杠杆，2. 转出杠杆</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btcusdt</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> showName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种展示名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"2018-04-16 20:35:01"</span></p></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> transferType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.转入杠杆，2. 转出杠杆</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 法币-法币账户
<a id=法币-法币账户> </a>
### 基本信息

**Path：** /finance/v4/otc_account_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> totalBalanceSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">折合币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> totalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外总资产</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.22</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> allCoinMap</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-2-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> total_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总资产</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.1</span></p></td></tr><tr key=0-2-2-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> normal</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">正常余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-2-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> exchangeNormal</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">现货余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lock</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">冻结余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> checked</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> btcValuation</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">资产折合</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
## 合约-合约资产
<a id=合约-合约资产> </a>
### 基本信息

**Path：** /account_blance

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> margin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约账户余额（合约保证金余额)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> unrealisedAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未实现盈亏</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> useMarginRate</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">保证金使用百分比</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> walletBalance</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">钱包余额（币币账户余额）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> openPositionFee</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> walletAccountType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币币accountType</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> positionMargin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">仓位保证金(持仓保证金+未盈)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderMargin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托保证金</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractAccountType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约accountType</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> canUseBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">可用余额(合约)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> accountRight</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账户权益</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价币种(保证金币种)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>usdt</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 合约-未平仓合约
<a id=合约-未平仓合约> </a>
### 基本信息

**Path：** /hold_contract_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">BUY 多   SELL空</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> settleTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> multiplier</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> avgPrice</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> unrealisedAmount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未实现盈亏</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未平合约数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractSeries</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约名称</span></td><td key=5></td></tr><tr key=0-1-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> realisedAmount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已实现盈亏</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 合约-资金流水
<a id=合约-资金流水> </a>
### 基本信息

**Path：** /business_transation_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> size</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> transactionsList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctimeL</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12321323</span></p></td></tr><tr key=0-0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sceneStr</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场景类型</span></td><td key=5></td></tr><tr key=0-0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> amountStr</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">发生金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> accountBalance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>213123</span></p></td></tr><tr key=0-0-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> address</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr>
               </tbody>
              </table>
            
## 场外-场外资金划转
<a id=场外-场外资金划转> </a>
### 基本信息

**Path：** /finance/otc_transfer

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fromAccount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.交易账户，2.场外账户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> toAccount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.交易账户，2.场外账户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{  
    'code':0,
    'msg':'suc',
    'data':{
         
    }
}
```
## 场外-资金流水
<a id=场外-资金流水> </a>
### 基本信息

**Path：** /record/otc_transfer_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> transactionType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">	1.转入场外，2. 转出场外</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> transactionType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.转入场外，2. 转出场外</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018:1:1</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> transactionType_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createdAtTime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 杠杆-资产划转
<a id=杠杆-资产划转> </a>
### 基本信息

**Path：** /lever/finance/transfer

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fromAccount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.交易账户，2杠杆账户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> toAccount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1.交易账户，2.杠杆账户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{  
    'code':0,
    'msg':'suc',
    'data':{
         
    }
}
```
## 杠杆-根据币对获取信息
<a id=杠杆-根据币对获取信息> </a>
### 基本信息

**Path：** /lever/finance/symbol/balance

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ethusdt</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseExNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseBorrowBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-已借</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteLockBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-冻结</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteCanBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseTotalBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteMinPayment</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-最小还款数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> rate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">利率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseMinPayment</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-最小还款数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseReturnPrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-归还精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseCanBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseTotalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-总资产</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> multiple</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">倍数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseMinBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-最小借贷数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> burstPrice</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">爆仓价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-17><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteReturnPrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-归还精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-18><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseLockBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-冻结</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-19><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteBorrowBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-已借</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-20><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteTotalBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-21><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteMinBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-最小借贷数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-22><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> riskRate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">风险率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-23><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteEXNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-24><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteTotalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-总资产</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-25><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr><tr key=0-2-26><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基础货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-27><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr>
               </tbody>
              </table>
            
## 杠杆-查询归还明细
<a id=杠杆-查询归还明细> </a>
### 基本信息

**Path：** /lever/return/info

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> id</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">借贷订单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> financeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> repaymentTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">归还时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123</span></p></td></tr><tr key=0-0-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-0-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> returnMoney</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">归还金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-0-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 归还类型：1本金，2利息，3本金+利息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 杠杆-杠杆账户
<a id=杠杆-杠杆账户> </a>
### 基本信息

**Path：** /lever/finance/balance

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> totalBalanceSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">折合币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> totalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">资产折合</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> leverMap</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ETH/USDT</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-0-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>ethusdt</span></p></td></tr><tr key=0-2-2-0-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseExNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2-0-2><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseBorrowBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-已借</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-3><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteLockBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-冻结</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-4><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteCanBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-5><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseTotalBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-6><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteMinPayment</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-最小还款数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-7><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> rate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">利率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-8><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseMinPayment</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-最小还款数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-9><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseReturnPrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-归还精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-10><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseCanBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-11><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-12><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseTotalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-总资产</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-13><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> multiple</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">倍数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-14><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-15><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseMinBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-最小借贷数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-16><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> burstPrice</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">爆仓价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-17><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteReturnPrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-归还精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-18><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseLockBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币-冻结</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-19><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteBorrowBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-已借</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-20><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteTotalBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-21><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteMinBorrow</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-最小借贷数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-22><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> riskRate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">风险率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-23><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteEXNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-24><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteTotalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币-总资产</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-25><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr><tr key=0-2-2-0-26><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> baseNormalBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基础货币-可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-0-27><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr>
               </tbody>
              </table>
            
## 杠杆-未归还记录
<a id=杠杆-未归还记录> </a>
### 基本信息

**Path：** /lever/borrow/new

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> startTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开始时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> endTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">结束时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12321323</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> interestRate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">利率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> oweInterest</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未还利息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc/usdt</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> borrowMoney</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">借贷金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> showName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">展示币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">申请时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>15900000</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> oweAmount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未还数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-2-0-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态：1借贷 2部分归还 3全部归还 4爆仓 5穿仓</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 币币-币币账户
<a id=币币-币币账户> </a>
### 基本信息

**Path：** /finance/v4/account_balance

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"suc"</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> platformCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台币币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'NOB'</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> totalBalanceSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总资产折合单位</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BTC'</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> field_6</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总资产折合</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1.00000000'</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> allCoinMap</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种MAP</span></td><td key=5></td></tr><tr key=0-2-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> BTC</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种信息</span></td><td key=5></td></tr><tr key=0-2-3-0-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> total_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币币交易总额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8.89800000</span></p></td></tr><tr key=0-2-3-0-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> normal_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">可用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8.89800000</span></p></td></tr><tr key=0-2-3-0-2><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> lock_grant_divided_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">锁仓（403新增：用户代币锁仓+挖矿锁仓账户余额）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8.88</span></p></td></tr><tr key=0-2-3-0-3><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> present_coin_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">赠币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.00000000</span></p></td></tr><tr key=0-2-3-0-4><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> btcValuatin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">资金折合</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-5><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> coinName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-3-0-6><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> lock_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">冻结金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-7><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> lock_position_balance</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">锁仓余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-8><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> lock_position_v2_amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">锁仓代币余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-9><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> walletTransactionOpen</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否开启心钱包划转 0.否 1.是</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-0-10><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> depositConfirm</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">充值确认数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-11><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> depositOpen</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">充值开启</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-12><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> withdrawOpen</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提现开启</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-13><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> otcOpen</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">otc开启</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-3-0-14><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> withdraw_min</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最小提现额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-0-15><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> withdraw_max</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最大提现额（新增--3.4.0.6_bugfix_1030）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-0-16><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> defaultFee</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">默认提现手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.1</span></p></td></tr><tr key=0-2-3-0-17><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> feeMin</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最小提现手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.1</span></p></td></tr><tr key=0-2-3-0-18><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> feeMax</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最大提现手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.1</span></p></td></tr><tr key=0-2-3-0-19><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> checked</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">隐藏零资产</span></td><td key=5><p key=1><span style="font-weight: '700'">mock: </span><span>true</span></p></td></tr><tr key=0-2-3-0-20><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> sort</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">排序</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-0-21><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> isAuth</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1需要实名，0不需要实名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-0-22><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> exchange_symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">如果返回值不包含这个字段，或者字段中没有“/”，认为该币种没有可交易的币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr><tr key=0-2-3-0-23><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> withdrawAddressMap</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址列表</span></td><td key=5></td></tr><tr key=0-2-3-0-23-0><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> address</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>16VEpBhredSdA64Fs1xp9RTBpdKEzL6g1q</span></p></td></tr><tr key=0-2-3-0-23-1><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> label</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">标签</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>哈哈</span></p></td></tr><tr key=0-2-3-0-23-2><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-2-3-0-23-3><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">uid</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>99</span></p></td></tr><tr key=0-2-3-0-23-4><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-3-0-23-5><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-0-23-6><td key=0><span style="padding-left: 80px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1525691067000</span></p></td></tr>
               </tbody>
              </table>
            
## 合约-合约划转
<a id=合约-合约划转> </a>
### 基本信息

**Path：** /capital_transfer

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fromType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">转出账户type</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> toType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">转入账户type</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">划转金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> bond</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">保证金币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{  
    'code':0,
    'msg':'suc',
    'data':{
         
    }
}
```
## 杠杆-归还
<a id=杠杆-归还> </a>
### 基本信息

**Path：** /lever/finance/return

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> id	</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">借贷id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">归还数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{  
    'code':0,
    'msg':'suc',
    'data':{
         
    }
}
```
## 杠杆-已归还记录
<a id=杠杆-已归还记录> </a>
### 基本信息

**Path：** /lever/borrow/history

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC/USDT</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> startTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开始时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> endTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">结束时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12321323</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> interestRate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">利率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc/usdt</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> borrowMoney</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">借贷金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">申请时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>15900000</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态：1借贷 2部分归还 3全部归还 4爆仓 5穿仓</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> interest</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">利息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 杠杆-借贷
<a id=杠杆-借贷> </a>
### 基本信息

**Path：** /lever/finance/borrow

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">杠杆账户币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc/usdt</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">杠杆账户借贷币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">借贷数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{  
    'code':0,
    'msg':'suc',
    'data':{
         
    }
}
```
## 币币-充值
<a id=币币-充值> </a>
### 基本信息

**Path：** /deposit

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contract_symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mag</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> address</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">充值地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0x123123</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> addressQRCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">二维码图片</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://www.chianup.com/aa.png</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> symbolList</span></td><td key=1><span>string []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>string</span></p></td></tr><tr key=array-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> </span></td><td key=1><span></span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 币币-提现
<a id=币币-提现> </a>
### 基本信息

**Path：** /doWithdraw

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> addressId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提币地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0x123</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提币数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.2</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fee</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提币手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payPwd</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">资金密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1234qwer</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">短信验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">google验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> emailCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time	</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 币币-充值记录
<a id=币币-充值记录> </a>
### 基本信息

**Path：** /record/deposit_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createdAt</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-04-16 20:35:01</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">充值金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>已完成</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">'充值状态: 0 未确认，1 已完成，2 异常'</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> confirmDesc</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">确认次数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1/6</span></p></td></tr><tr key=0-3-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> txid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2345fdgdhdhdoijoewrn34cvdfg</span></p></td></tr><tr key=0-3-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> updateAt</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">处理时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-04-16 21:35:01</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 币币-提现记录
<a id=币币-提现记录> </a>
### 基本信息

**Path：** /record/withdraw_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createdAt</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-04-16 20:35:01</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">到账数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>已完成</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提现状态: 0 未审核，1 已审核，2 审核拒绝，3 支付中，4 支付失败，5 已完成，6 已撤销</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费用</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12</span></p></td></tr><tr key=0-3-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> txid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2345fdgdhdhdoijoewrn34cvdfg</span></p></td></tr><tr key=0-3-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> label</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">钱包标签</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>我的钱包</span></p></td></tr><tr key=0-3-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> addressTo</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提币地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1Px8bibV3QtcPiYpJWUpkMb36u5xAxMpzs</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 币币-其他记录的场景下拉框
<a id=币币-其他记录的场景下拉框> </a>
### 基本信息

**Path：** /record/other_transfer_scene

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> cenceList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> key_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场景描述</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> key</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场景key</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 币币-其他记录
<a id=币币-其他记录> </a>
### 基本信息

**Path：** /record/other_transfer_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> transactionScene</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>present_coin</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> financeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> amount</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"2018-04-16 20:35:01"</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> transactionScene</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>transactionScene</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createdAtTime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>已完成</span></p></td></tr><tr key=0-3-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">"0,未完成","1，已完成"</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 币币-获取地址列表
<a id=币币-获取地址列表> </a>
### 基本信息

**Path：** /addr/address_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">(币种)为空的情况下返回所有数据</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> addressList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">uid</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10010</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> address</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>131nT2sZtZGz7AQ5wFKBfZTH2pjqaqwzXo</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> label</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">标签</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>aaa</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1565774304000</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> trustType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fingerprint</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> cryptoCoinList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinShow</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr>
               </tbody>
              </table>
            
## 币币-添加地址
<a id=币币-添加地址> </a>
### 基本信息

**Path：** /addr/add_withdraw_addr

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> address</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0X123</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsValidCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">短信验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> label</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">钱包标签(地址名称)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>标签</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">google验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 币币-删除钱包地址
<a id=币币-删除钱包地址> </a>
### 基本信息

**Path：** /addr/delete_withdraw_addr

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> ids</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">钱包地址id【此处在app中ids参数为单一地址id，pc和h5该参数为数组】</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>213</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsValidCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">短信验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">谷歌验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 个人中心

## 支付方式开关设置
<a id=支付方式开关设置> </a>
### 基本信息

**Path：** /otc/payment/open

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> id</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11111</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isOpen</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 从黑名单移除
<a id=从黑名单移除> </a>
### 基本信息

**Path：** /otc/user_contacts_remove

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> friendId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">uid</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 修改手机号
<a id=修改手机号> </a>
### 基本信息

**Path：** /user/mobile_update

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新手机号的验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1234455</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countryCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家编号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>+86</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新手机号码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11111111111</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">google验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>112331</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> authenticationCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">原手机号的验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>112334</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：成功；其他：失败</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 修改支付方式
<a id=修改支付方式> </a>
### 基本信息

**Path：** /otc/payment/update

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payment</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.domestic.bank.transfer</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> account</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账号信息，除西联汇款外，其他必填</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>555</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> qrcodeImg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">url</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> bankName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户银行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>招商</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> bankOfDeposit</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户支行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>上地支行</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> ifscCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">IFSC码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> remittanceInformation</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">汇款信息	</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码，短信验证码和google验证码两者选其一</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111111</span></p></td></tr><tr key=0-9><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">Google验证码，短信验证码和google验证码两者选其一</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111111</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 修改邮箱
<a id=修改邮箱> </a>
### 基本信息

**Path：** /user/email_update

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> email</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新邮箱地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@email</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsValidCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码（手机验证码与谷歌验证码至少有一个）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> emailOldValidCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">旧邮箱验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> emailNewValidCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新邮箱验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">谷歌验证码（手机验证码与谷歌验证码至少有一个）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 关闭手机认证
<a id=关闭手机认证> </a>
### 基本信息

**Path：** /user/close_mobile_verify

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123142</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">谷歌验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123421</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0:成功  10009:短信验证码错误  10010:谷歌验证码错误</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 关闭谷歌验证
<a id=关闭谷歌验证> </a>
### 基本信息

**Path：** /user/close_google_verify

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsValidCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123qwe1231</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">google验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123412</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0:成功  002_021:未开启手机认证  002_020:登录密码错误  002_013:谷歌验证码错误</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 删除支付方式
<a id=删除支付方式> </a>
### 基本信息

**Path：** /otc/v4/payment/delete

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> id</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 场外修改黑名单
<a id=场外修改黑名单> </a>
### 基本信息

**Path：** /otc/user_contacts

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> otherUid </span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">UID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12312</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> relationType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">关系类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BLACKLIST</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 开启手机验证
<a id=开启手机验证> </a>
### 基本信息

**Path：** /user/open_mobile_verify

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0:成功  10014：用户未绑定手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 手续费设置
<a id=手续费设置> </a>
### 基本信息

**Path：** /user/update_fee_coin_open

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> useFeeCoinOpen</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0: 关闭 1：开启</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0:成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 修改密码
<a id=修改密码> </a>
### 基本信息

**Path：** /user/password_update

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| loginPword | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">旧登录密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1q2w3e4r</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> newLoginPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新登录密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>q1w2e3r4</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码，短信验证码和google验证码两者选其一</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>234563</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码，短信验证码和google验证码两者选其一</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>234567</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 新增支付方式
<a id=新增支付方式> </a>
### 基本信息

**Path：** /otc/payment/add

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payment</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.domestic.bank.transfer</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> account</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账号信息，除西联汇款外，其他必填</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>555</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> qrcodeImg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">url</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> bankName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户银行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>招商</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> bankOfDeposit</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户支行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>上地支行</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> ifscCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">IFSC码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> remittanceInformation</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">汇款信息	</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码，短信验证码和google验证码两者选其一</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111111</span></p></td></tr><tr key=0-9><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">Google验证码，短信验证码和google验证码两者选其一</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111111</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 查询用户支付方式
<a id=查询用户支付方式> </a>
### 基本信息

**Path：** /otc/payment/find

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">不填查询全部，填写根据条件查询</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">json </span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回消息</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payment</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.domestic.bank.transfer</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> account</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账号信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>555</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> qrcodeImg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">base64图片</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>base64</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bankName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户银行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3334</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bankOfDeposit</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户支行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>招商</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ifscCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">IFSC码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> remittanceInformation</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">汇款信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isOpen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否开启：1开启，0：关闭；同一用户同一支付方式只能开启一种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图标</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">前台显示的值</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>银行卡</span></p></td></tr>
               </tbody>
              </table>
            
## 查询用户支付方式
<a id=查询用户支付方式> </a>
### 基本信息

**Path：** /otc/payment/find

**Method：** GET

**接口描述：**


### 请求参数

## 用户实名认证
<a id=用户实名认证> </a>
### 基本信息

**Path：** /user/v4/auth_realname

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countryCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>+86</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> certificateType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> certificateNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>370682198910264433</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>韩春霖</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> firstPhoto</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/image/oeykmt1564891994688.jpg</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> secondPhoto</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/image/zqmfwi1564891997628.jpg</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> thirdPhoto</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/image/fvfxyx1564892001168.jpg</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2019-08-04 12:13:32</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> </span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>+86</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> certificateType</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> certificateNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>370682198910264433</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> userName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>韩春霖</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> firstPhoto</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/image/oeykmt1564891994688.jpg</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> secondPhoto</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/image/zqmfwi1564891997628.jpg</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> thirdPhoto</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/image/fvfxyx1564892001168.jpg</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2019-08-04 12:13:32</span></p></td></tr>
               </tbody>
              </table>
            
## 登录历史
<a id=登录历史> </a>
### 基本信息

**Path：** /security/login_history

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页数据条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：成功；非0：失败</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> historyLoginList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录记录</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lgIp</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录IP</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@ip</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lgPlatform</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登陆平台</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>Web</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> formatLgInTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2017-10-11 15:02:43</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lgStatus</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 绑定手机
<a id=绑定手机> </a>
### 基本信息

**Path：** /user/mobile_bind_save

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countryCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家编号</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">短信验证码</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">谷歌验证码</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">002_013:谷歌验证码错误  002_011:短信验证码错误</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 绑定谷歌认证
<a id=绑定谷歌认证> </a>
### 基本信息

**Path：** /user/google_verify

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleKey</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">googleKey</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>saafaqwe1eqweqwe</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> loginPwd</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">谷歌验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0:成功；其他：失败</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 绑定邮箱
<a id=绑定邮箱> </a>
### 基本信息

**Path：** /user/email_bind_save_v4

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> email</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@email</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">短信验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">Google验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>432156</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> emailValidCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱验证码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123456</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123123123123</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：成功；其他：失败</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 设置昵称
<a id=设置昵称> </a>
### 基本信息

**Path：** /user/nickname_update

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| nickname | 是  |  'aa' |  昵称 |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> nickname</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>aaa</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 发送成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 设置资金密码
<a id=设置资金密码> </a>
### 基本信息

**Path：** /v4/capital_password/reset

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> newCapitalPwd</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新资金密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1312312</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> smsAuthCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机验证码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> googleCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">google验证码</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 谷歌验证获取验证码
<a id=谷歌验证获取验证码> </a>
### 基本信息

**Path：** /user/toopen_google_authenticator

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0:成功  002_023:已开启谷歌认证</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> googleUser</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>302667808</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> googleKey</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">新生成的key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SA6DIVGYKSFPH7AB</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> googleImg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">二维码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAIAAAD/gAIDAAACC0lEQVR42u3bQW7DMAxE0dz/0uk2\r\nQNBghkPFZPy1KoLUdp9LiaTsx5MhjwcEYIEFFlhggQUBWGCBBRZYYEEAFlhg/TjWQx7v33/95L9j\r\nvn/++RqSawNrHpb7nc9YtaMpt6F2/WBdjeVetB6etaBOrg2sbVgunDKp6+cF6x5YSlj1nhesnVgn\r\nFgGFVQntlXkWWHa5882f19eGN8XKFwQ9YLsWhzX9rFtj5UlmjuKG3rjVECxpms8/UcJWTzXcM4I1\r\nA8stdN0WYK2UcRvQYE3FqjVh3ASi9rtJOIP1vHiCP5d8uk0et1wHawNW17aou+WVN4jAmoelnLgr\r\nZVXOqCcZI1ZDsKJCWgnVEw0Zd/MCrHlYXf/2tY1+N3FpKX3AuigM3WTSLZvcRHdQ6gBWMRjPTc/6\r\nEdxUBqx5WLWyo5Y0JIlr+xYZWF8vpHu3CXQa9waMaNGA1daWSRLXJOTdrQ2wrsaqNWS6mj+1VHNE\r\npxSsIwVQ7cHJ/OWAcbs7YEVBl5Q1SXtaTyDAmod1rqXT2yZe/wDu7bC6XvvVH6V0S59aYxqsGVh5\r\nc0bfbsgfihu6YQGWtPAn4VCbyPNXYsDajFX7s93WTa1sAms/Vm0ir7WbD21egDU4dVAKb7flot+G\r\nZXnWTbFq5Y7bkHNL5TzYwZr30sDPD7DAAgsssMBigAUWWGCBBRYDLLDAAmvT+AOZfRHuf6Zm2AAA\r\nAABJRU5ErkJggg==</span></p></td></tr>
               </tbody>
              </table>
            
# kyc

## getToken（android、ios）
<a id=getToken（android、ios）> </a>
### 基本信息

**Path：** /kyc/Api/getToken

**Method：** POST

**接口描述：**
<p>1、校验是否开启身份认证、如果开启显示可以自动认证、否则不显示人工审核<br>
2、校验平台和个人当日使用次数限制~~~~</p>
<pre><code data-backticks="4">返回 1 受限：提示： 个人或者平台当日使用次数受限；
返回 0 未受限：
</code></pre>
<p>{<br>
&nbsp; "code": "0",<br>
&nbsp; "msg": "成功",<br>
&nbsp; "data": {<br>
&nbsp;&nbsp; "openAuto": "0",<br>
&nbsp; &nbsp;"language":"文案";<br>
&nbsp; &nbsp; limitFlag："0",<br>
&nbsp; &nbsp; limitMsg:"提示"，<br>
&nbsp; &nbsp;"toKenUrl": "<a href="https://api.megvii.com/faceid/lite/do">https://api.megvii.com/faceid/lite/do</a>",<br>
&nbsp;&nbsp;&nbsp; "toResultUrl": "<span class="colour" style="color:rgb(35, 149, 241)"><a href="http://yapi.chaindown.com/mock/50/kyc/get_Authentication_result">http://yapi.chaindown.com/mock/50/kyc/get_Authentication_result</a></span>"<br>
&nbsp; }<br>
}</p>
<p>"openAuto": "0", --开启自动审核&nbsp; &nbsp;0未开启 1开启<br>
&nbsp; &nbsp;"language":"文案"，未开启是能够获取文案，开启后字段不返回<br>
&nbsp; &nbsp; limitFlag："0",--当日平台、个人是否超出使用次数，0未超出，1超出<br>
&nbsp; &nbsp; limitMsg:"提示"<br>
&nbsp;&nbsp;&nbsp; "toKenUrl": "" 唤醒第三方认证流程，以上不通过，字段不返回；<br>
&nbsp; &nbsp; "toResultUrl"："回调url"&nbsp;，以上不通过，字段不返回；</p>
<p>错误编码：101141：KYC参数配置数据库中不存在<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10001：系统异常，请联系管理员</p>
<pre><code data-backticks="4">
</code></pre>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
| exchange-language  |  zh_CN | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uid</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>134456</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> forceAuto</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> platformsingled</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> expired_time</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> openAuto</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> singlepsingled</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> biz_id</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> toKen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## pc端点击获取按钮
<a id=pc端点击获取按钮> </a>
### 基本信息

**Path：** /kyc/Api/get_Database_Authentication_result

**Method：** POST

**接口描述：**
<p><span class="colour" style="color:rgb(85, 85, 85)">&nbsp; "code": "0",</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">&nbsp; "msg": "成功",</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">&nbsp; "data": {</span><br>
&nbsp; &nbsp; "authStatus":1<br>
<span class="colour" style="color:rgb(85, 85, 85)">&nbsp; }</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">}</span></p>
<pre><code>
authStatus：
认证状态：0、未审核，1、通过，2、未通过' 3、未提交认证
</code></pre>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>179922</span></p></td></tr>
               </tbody>
              </table>
            
## web前端获取有效二维码
<a id=web前端获取有效二维码> </a>
### 基本信息

**Path：** /kyc/Api/get_Valid_QRcode

**Method：** POST

**接口描述：**
<p>1、校验是否开启身份认证、如果开启显示可以自动认证、否则不显示人工审核<br>
<span class="colour" style="color:rgb(85, 85, 85)">2、校验平台和个人当日使用次数限制~~~~</span></p>
<p>返回 1 受限：提示： 个人或者平台当日使用次数受限；<br>
返回 0 未受限：返回token、二维码、倒计时（有效期）<br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;如果二维码有效数据库返回，如果二维码失效需要重新生成！（每次生成会校验受限次数是否生成）</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<pre><code data-backticks="4">{
&nbsp; "code": "0",
&nbsp; "msg": "成功",
&nbsp; "data": {
&nbsp;&nbsp;&nbsp; "openAuto": "0",
&nbsp;&nbsp;&nbsp; "forceAuto": "0",
&nbsp;&nbsp;&nbsp; "expired_time": "1098",
&nbsp;&nbsp;&nbsp;&nbsp;limitFlag："0",
&nbsp; &nbsp; limitMsg:"提示"
    "qrcode": "二进制流",
&nbsp;&nbsp;&nbsp;&nbsp;"authstatus": 0,
&nbsp;&nbsp;&nbsp; "qrcode": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAADICAIAAAAiOjnJAAAD9ElEQVR42u3bQW7DMAwEwPz/0+0L\r\nCjQgl5Ts2WPQuLI0ASha/vyIBPIxBQKWgCVgiYAlYAlYImAJWAKWCFgCloAlApaAJWCJgCVgCVgi\r\nYAlYApYIWAKWgCVyEKxPIOkx/PXd/1w/8X+/HcPWPIMFFlhggQUWWDuwJq9TmawKssr40z+AyfUC\r\nCyywwAILLLB2YHVNXGIxEoVzF/qteQYLLLDAAgsssN4LqwvNVuE/+SMBCyywwAILLLDAmgCUhpJA\r\nBhZYYIEFFlhggbXZAEwcGKzc4+Rhw631AgsssMACCyyw5mB1Jd04vf3zxDyD5XOwwAILLLDOgpVO\r\n+oFxovGY+MFcsFJggQUWWGCBBdZAgzRRVE4WtrcfEpwHChZYYIEFFlhgbRbdk5O4hbiCprKJmXyY\r\nDRZYYIEFFlhg7cOqoNkqhLvut+veE6DBAgsssMACC6znwOoq/G9EMLnwYIEFFlhggQXWc2BVDrV1\r\nPdydfFg7Oc5v4Vb+HiywwAILLLDA2oeVWLytZmnX/SbmcB4KWGCBBRZYYIF1YoM03bRMAE1/t+ua\r\nlY0RWGCBBRZYYIF1X/F+MrLKgm01Xc8pzMECCyywwAILrFOK98RLDWlMXeASxXVizGCBBRZYYIEF\r\n1h3F++QhtUrh3IW4C1ZXU3RrswUWWGCBBRZYYO3DShfv6QfPibElXqx41ENosMACCyywwHohrMmF\r\n7wLdtTBdTdSueZ58eA8WWGCBBRZYYM3Bqtz81ksHJyxM+qH4K043gAUWWGCBBdaDYXUdXktPRLoJ\r\necJBwsn5BAsssMACCyywfo59YTXx0DoBq6vROjlmsMACCyywwALrmQ3SEw7NJa5TGf/kj3ZoxcEC\r\nCyywwAILrIHiPVFgpjGd0BBO/wCu3xWCBRZYYIEF1gthdd3YZNNycnOQuMfKnIAFFlhggQUWWPcV\r\n74nrTDZFtzYriSat0w1ggQUWWGCB9UxYiSL05A1E4nDfTAEOFlhggQUWWGDdWrx3FeDporgL9OT4\r\nZ4p0sMACCyywwAJrAlZ8uIXCOf15urG5tXkCCyywwAILLLDOKt7TxWaiOE0v8BbER+0KwQILLLDA\r\nAuvlsE5b4MkGZmLMk01asMACCyywwALrDlinvRSQeGmiC2hiMzSPDyywwAILLLDAuhXWtwu8ddAv\r\ngf60xjJYYIEFFlhggfXM4j2x2JUxpA/cdQECCyywwAILLLDuhjU5cYnmYaIYT28Udg/9gQUWWGCB\r\nBRZYKVjphe9qNp7w9+mmcQI3WGCBBRZYYIE1B0sELAFLwBIBS8ASsETAErAELAFLBCwBS8ASAUvA\r\nErBEwBKwBCwRsAQsAUsELAFLwBJpyC8aAuKC+DnMkQAAAABJRU5ErkJggg==",
&nbsp;&nbsp;&nbsp; "authMsg": ""
    "toResultUrl":&lt;span class="colour" style="color: rgb(85, 85, 85);"&gt;"&lt;/span&gt;&lt;span class="colour" style="color: rgb(35, 149, 241);"&gt;[http://yapi\.chaindown\.com/mock/50/kyc/get\_Authentication\_result](http://yapi.chaindown.com/mock/50/kyc/get_Authentication_result)&lt;/span&gt;&lt;span class="colour" style="color: rgb(85, 85, 85);"&gt;"&lt;/span&gt;
&nbsp; }
}




    "openAuto": "0",       --开启自动审核0未开启 1开启
&nbsp;   "language":"文案"，未开启是能够获取文案，开启后字段不返回
&nbsp;&nbsp;&nbsp; "forceAuto": "0",      --是否强制自动审核  0 不强制  1强制
&nbsp;&nbsp;&nbsp; "limitFlag"："0",--当日平台、个人是否超出使用次数，0未超出，1超出
&nbsp; &nbsp; "limitMsg":"提示"
    "expired_time": "1098", --剩余有效秒数（可以返回剩余秒）以上不通过，字段不返回；
&nbsp;&nbsp;&nbsp;&nbsp;"qrcode": "二进制流",(具体看情况如何接收)以上不通过，字段不返回；
&nbsp;   "toResultUrl"："回调url"&nbsp;，以上不通过，字段不返回；
&nbsp;   "authstatus": 0未存在认证信息, 1已经存在认证信息
&nbsp;&nbsp;&nbsp; "authMsg": 认证信息

错误编码：101141：KYC参数配置数据库中不存在
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10001：系统异常，请联系管理员
</code></pre>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uid</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>179992</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 回调页面notify_url
<a id=回调页面notify_url> </a>
### 基本信息

**Path：** /kyc/Api/notify_url

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12345678</span></p></td></tr>
               </tbody>
              </table>
            
## 回调页面return_url
<a id=回调页面return_url> </a>
### 基本信息

**Path：** /kyc/Api/return_url

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1234324</span></p></td></tr>
               </tbody>
              </table>
            
## 携带Token开启旷世身份验证流程
<a id=携带Token开启旷世身份验证流程> </a>
### 基本信息

**Path：** https://api.megvii.com/faceid/lite/do

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| token | 是  |  50130e57b547fb0d5dc18efc0b7c1bb1 |  通过getToken获取 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 用户姓名拆分
<a id=用户姓名拆分> </a>
### 基本信息

**Path：** /v4/auth_realname

**Method：** POST

**接口描述：**


### 请求参数

## 获取人工审核文案
<a id=获取人工审核文案> </a>
### 基本信息

**Path：** /kyc/Api/getUploadImgCopywriting

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> field_10</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 获取认证结果
<a id=获取认证结果> </a>
### 基本信息

**Path：** /kyc/Api/get_Authentication_result

**Method：** POST

**接口描述：**
<p><span class="colour" style="color:rgb(85, 85, 85)">{</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">&nbsp; "code": "0",</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">&nbsp; "msg": "成功",</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">&nbsp; "data": {</span></p>
<pre><code>"authStatus":1,
"authMsg":"",
"resultFaceIdStatus":1
"resultFaceIdMsg":""
</code></pre>
<p><span class="colour" style="color:rgb(85, 85, 85)">&nbsp; }</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">}</span></p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<pre><code>authStatus：认证状态：0、未提交认证信息，1、已经存在实名认证信息
authMsg：提示
resultFaceIdStatus:0 认证成功 1、认证失败
resultFaceIdMsg:提示
</code></pre>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> biz_no</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1、通过获取Token获取2.回调Return_url获取</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>179856-165823-20190807145122310</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> field_1</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 订单

## 合约订单历史委托
<a id=合约订单历史委托> </a>
### 基本信息

**Path：** /user_history_orders

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'btcusdt'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> idList</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id集合</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'success'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> historyOrders</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-2-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-2-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约Id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-2-2-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> unitQuantity</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每张合约对应的数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>4</span></p></td></tr><tr key=0-2-2-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"SELL"</span></p></td></tr><tr key=0-2-2-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> action</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开平仓动作</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"CLOSE"</span></p></td></tr><tr key=0-2-2-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-2-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-2-2-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateMakerOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">挂单开仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateMakerClose</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">挂单平仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateTakerOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">吃单开仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateTakerClose</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">吃单平仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> dealVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-2-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">杠杆倍数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>4</span></p></td></tr><tr key=0-2-2-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avgPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交均价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-2-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态（1.新订单.2.完全成绩看3.部分成交4.已撤单5.待撤单 6.异常订单）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-2-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-2-17><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> operType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-18><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>15604003024</span></p></td></tr><tr key=0-2-2-19><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-20><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-21><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> injectBlanceNumber</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-22><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> injectBlance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-23><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> originOid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-24><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> tableName</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-25><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lockPosition</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-26><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-27><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realizedAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-28><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> trades</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contract</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易记录id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-2-29-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-2><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> quoteSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-3><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> unitQuantity</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-4><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> beginTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-5><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> settleTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-6><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-7><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> liquidationLine</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-8><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> minOrderVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-9><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> maxOrderVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-10><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> maxUserVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-11><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> pricePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-12><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> openBuyLimitRate</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-13><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> openSellLimitRate</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-14><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> feeRateMakerOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-15><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> feeRateMakerClose</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-16><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> feeRateTakerOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-17><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> feeRateTakerClose</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-18><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> settleFeeRate</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-19><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> settlementPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-20><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-21><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-29-22><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-30><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> entrustmentNumber</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-31><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-32><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> blowingUpId</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2-33><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> initPrice</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 合约订单当前委托
<a id=合约订单当前委托> </a>
### 基本信息

**Path：** /user_current_orders

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"btcusdt"</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> idList</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id集合</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'suc'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> currentSum</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageNum</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> currentOrders</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-3-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22</span></p></td></tr><tr key=0-2-3-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> unitQuantity</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每张合约对应的数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'SELL'</span></p></td></tr><tr key=0-2-3-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> action</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开平仓动作</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"CLOSE"</span></p></td></tr><tr key=0-2-3-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-3-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-3-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateMakerOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">挂单开仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateMakerClose</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">挂单平仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateTakerOpen</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">吃单开仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-3-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> feeRateTakerClose</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">吃单平仓手续费率</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-3-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> dealVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-3-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">杠杆倍数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-3-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avgPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交均价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5</span></p></td></tr><tr key=0-2-3-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态（1.新订单.2.完全成绩看3.部分成交4.已撤单5.待撤单 6.异常订单）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托类型：1 limit，2 marke</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-3-17><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> operType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-18><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1520324230652</span></p></td></tr><tr key=0-2-3-19><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-20><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-21><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> injectBlanceNumber</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-22><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> injectBlance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-23><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> originOid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-24><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> tableName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-25><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lockPosition</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">冻结保证金</span></td><td key=5></td></tr><tr key=0-2-3-26><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-27><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realizedAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-28><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> trades</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-29><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contract</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约对象</span></td><td key=5></td></tr><tr key=0-2-3-30><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> entrustmentNumber</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-31><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-32><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> blowingUpId</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3-33><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> initPrice</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 场外订单历史委托
<a id=场外订单历史委托> </a>
### 基本信息

**Path：** /order/otc/complete

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isShowCanceled</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否展示已取消的订单，0表示不展示，1表示展示，默认1</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'EOS'</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'suc'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>6</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"BUY"</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> totalPrice</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"200CNY"</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> nickName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"ssss"</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1'</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> buyerId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买方id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>212</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> adsId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1'</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sequence</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"2018120310835"</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">实名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'aaa'</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BTC'</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sellerId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">卖方id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>233</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"9CNY"</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"交易完成"</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1000</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr>
               </tbody>
              </table>
            
## 场外订单当前委托
<a id=场外订单当前委托> </a>
### 基本信息

**Path：** /order/otc/unfinished

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>‘BUY’</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> totalPrice</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1CNY'</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> nickName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>’嗷嗷‘</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'买入'</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> buyerId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买方id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1111</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> adsId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sequence</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"2019022011065"</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">实名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'sss'</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BTC'</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sellerId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">卖方id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2323</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0.1CNY'</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"待买家付款"</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>222</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 币币订单历史委托
<a id=币币订单历史委托> </a>
### 基本信息

**Path：** /order/entrust_history

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

## 币币订单当前委托
<a id=币币订单当前委托> </a>
### 基本信息

**Path：** /order/list/new

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类别buy，sell</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币对</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"bchbtc"</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"9000.0000000000"</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567853325918</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side_text</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"买入"</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> created_at</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"2019-09-07 18:48:45"</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'USDT'</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平台</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"WEB"</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1000'</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1000'</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'完全成交'</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BTC'</span></p></td></tr><tr key=0-2-1-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 杠杆订单历史委托
<a id=杠杆订单历史委托> </a>
### 基本信息

**Path：** /lever/order/history

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">市场标记</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'btcusdt'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">起始页码(从0开始计数)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">分页长度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isShowCanceled</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否展示已取消的订单，0表示不展示，1表示展示，默认1</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单买卖方向，BUY买入 SELL卖出</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"BUY"</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'suc'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BUY'</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1'</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> created_at</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"2018-02-26 10:58:12"</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0.1'</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BTC'</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1.00000'</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'5232.00'</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source_msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'WEB'</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2.0000''</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3232</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'10.000'</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'eth'</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'完全成交'</span></p></td></tr>
               </tbody>
              </table>
            
## 杠杆订单当前委托
<a id=杠杆订单当前委托> </a>
### 基本信息

**Path：** /lever/order/list/new

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">市场标记</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'btcusdt'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">起始页码(从0开始计数)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">分页长度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>15900032323</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单买卖方向，BUY买入 SELL卖出</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"BUY"</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> idList</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">自动刷新时，根据集合查询订单列表，格式：[1,2,3,4,5,6,7,8] 传id数组</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'suc'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseCoinBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1111</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> countCoinBalance</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2222</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> minVolume</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">限价最小数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>22</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> minPrice</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">限量最小价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volumePrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.00000001</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pricePrecision</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.00000001 </span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前实时价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>6500.00000000</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-8-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BUY'</span></p></td></tr><tr key=0-2-8-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1'</span></p></td></tr><tr key=0-2-8-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1399000000</span></p></td></tr><tr key=0-2-8-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0.1'</span></p></td></tr><tr key=0-2-8-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'BTC'</span></p></td></tr><tr key=0-2-8-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'H5'</span></p></td></tr><tr key=0-2-8-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-8-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'1.00000'</span></p></td></tr><tr key=0-2-8-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'5232.00'</span></p></td></tr><tr key=0-2-8-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> source_msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'WEB'</span></p></td></tr><tr key=0-2-8-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2.0000''</span></p></td></tr><tr key=0-2-8-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3232</span></p></td></tr><tr key=0-2-8-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">未完成数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'10.000'</span></p></td></tr><tr key=0-2-8-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'eth'</span></p></td></tr><tr key=0-2-8-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-8-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'完全成交'</span></p></td></tr>
               </tbody>
              </table>
            
# 其他

## CMS详情
<a id=CMS详情> </a>
### 基本信息

**Path：** /cms/info

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fileName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">底部链接名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"aboutus"</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'suc'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> articleTypeId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">文章id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> content</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">内容</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"<p>关于我们</p>"</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctimeLong</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1514272489000</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fileName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">连接名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>‘aboutus’</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">文章标题</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'adsada'</span></p></td></tr>
               </tbody>
              </table>
            
## 二维码上传（base64格式）
<a id=二维码上传（base64格式）> </a>
### 基本信息

**Path：** /common/upload_qrcode_base64

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间戳</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> imageData</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片的Base64</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> filename</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">存入数据库的路径</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>upload/2018030512475473156.jpg</span></p></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> base_image_url</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">前端回显时两个路径拼接展示</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 公告列表
<a id=公告列表> </a>
### 基本信息

**Path：** /notice/notice_info_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> keyword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">关键字</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>''</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前页面</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>9</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> noticeInfoList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> timeLong</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1563957070000</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公告id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>32</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">标题</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"54"</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lang</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">语言</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"zh,en,ko,el,ja"</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> content</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公告内容</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"<script>alert(1)</script>111</p>"</span></p></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 公告详情
<a id=公告详情> </a>
### 基本信息

**Path：** /notice/notice_info

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公告id</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">code</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'0'</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'成功'</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> noticeInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567581913000</span></p></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">标题</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'大的'</span></p></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> lang</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">语言</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'zh'</span></p></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> content</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 图片上传
<a id=图片上传> </a>
### 基本信息

**Path：** /common/upload_img

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isWaterMark</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否添加水印：1是，0否</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> file</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片文件（限制结尾，jpg、png、等等图片格式）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>file</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> filename</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">存入数据库的路径</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>upload/2018030512475473156.jpg</span></p></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> base_image_url</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">前端回显时两个路径拼接展示</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr>
               </tbody>
              </table>
            
## 图片临时token
<a id=图片临时token> </a>
### 基本信息

**Path：** /common/get_image_token

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> time</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间(app需要签名)</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> operate_type</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1：实名认证（返回加签名的token），2：其他（返回公共存储token）</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 成功</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>suc</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> AccessKeyId</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1dasdas</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> AccessKeySecret</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>dadas</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> Expiration</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">过期时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2015-04-09T11:52:19Z</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> SecurityToken</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">上传图片token</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CAESrAIIARKAAShQquMnLIlbvEcIxO6wCoqJufs8sWwieUxu45hS9AvKNEte8KRUWiJWJ6Y</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> catalog</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">上传图片二级目录</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>common/imageV2/"</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ossUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">上传图片url</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>dasdasdasdasd.com</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> bucketName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">上传图片参数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>oss-hk</span></p></td></tr>
               </tbody>
              </table>
            
# OTC

## 查看广告详情
<a id=查看广告详情> </a>
### 基本信息

**Path：** /otc/v4/wanted_detail

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> advertId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回消息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> currentUserBanlance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前登录用户场外账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告类型 SELL , BUY</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ismyself</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否是本人发布 1：是 0：否</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 用户昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> creditGrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 信用度（好评度）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payments</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-5-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> key</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.wxpay</span></p></td></tr><tr key=0-2-5-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>微信</span></p></td></tr><tr key=0-2-5-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式icon</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-2-5-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> account</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告支付账户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>{"bankName":"","payment":"otc.payment.wxpay","qrcodeImg":"http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/common/image/1543642040053.png","userName":"134124","ifscCode":"","account":"23424242","bankOfDeposit":""}</span></p></td></tr><tr key=0-2-5-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> used</span></td><td key=1><span>boolean</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否在使用</span></td><td key=5><p key=1><span style="font-weight: '700'">mock: </span><span>true</span></p></td></tr><tr key=0-2-5-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> numberCode</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111</span></p></td></tr><tr key=0-2-5-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> open</span></td><td key=1><span>boolean</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=1><span style="font-weight: '700'">mock: </span><span>true</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>备注</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> minTrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单笔最小交易额(金额)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否用户在线状态 （1在线，0离线）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司级别</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CNY</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volumeBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">剩余数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> limitTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易期限 单位分钟</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外用户头像</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-2-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> maxTrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单笔最大交易额(金额)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-17><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> tip</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提示信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-18><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>发布中</span></p></td></tr><tr key=0-2-19><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> completeOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单成交笔数（交易次数）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>14</span></p></td></tr><tr key=0-2-20><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> turnover</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">累计交易总额（历史成交）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.3137237656015</span></p></td></tr><tr key=0-2-21><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-22><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态 1发布中  2交易中 3过期 4关闭</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 个人主页用户基本信息显示
<a id=个人主页用户基本信息显示> </a>
### 基本信息

**Path：** /otc/person_home_page

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">被查看的用户id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@id</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> lastLoginTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最后登录时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1542338969000</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mobileAuthStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否开启了手机认证:0-未开启,1-开启</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> registerTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1542338969000</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> identity</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">判断此页面访问情况（如下）：  0：未登录用户查看他人的主页和登录用户查看自己的主页； 1：登录用户查看他人的主页，并且当前显示用户在登录用户黑名单中； 2：登录用户查看他人的主页，并且当前显示用户不在登录用户黑名单中</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>name</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> complainNum</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总申诉量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">在线状态 （1在线，0离线）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> completeOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户订单成交笔数（交易次数）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> authLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">认证状态 0、未审核，1、通过，2、未通过  3、未认证</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sucComplainNum</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">胜诉量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> trustScore</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信用度</span></td><td key=5></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcOrderAvePaidTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外平均放币时间</span></td><td key=5></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcLast30DaysComOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">过去三十天成单数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 发起提问
<a id=发起提问> </a>
### 基本信息

**Path：** /question/create_problem

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> rqType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">问题描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>投诉</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> rqDescribe</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">问题类型，1.意见与建议 2.充值提现 3.交易相关 4.安全相关 5.个人信息 6.实名认证,7.场外申诉,8.对方未放行,9.买方未付款,10:支付金额大于订单金额,11:订单金额大于支付金额,12:场外其他原因</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> imageDataStr</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工单上传的图片地址</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> complainId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
## 取消申诉
<a id=取消申诉> </a>
### 基本信息

**Path：** /v4/otc/complain_cancel

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sequence</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 商户申请
<a id=商户申请> </a>
### 基本信息

**Path：** /otc/company_apply

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> type</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">申请商户类型，0：普通商户，1：超级商户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 商户释放
<a id=商户释放> </a>
### 基本信息

**Path：** /otc/company_release

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr>
               </tbody>
              </table>
            
## 场外聊天历史记录
<a id=场外聊天历史记录> </a>
### 基本信息

**Path：** /chatMsg/message

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fromId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">from uid</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10639</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> toId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">to uid</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10639</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018101911916</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-10-19 11:45:13</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> chatId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fromId</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fromName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> toId</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> toName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> content</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 广告搜索
<a id=广告搜索> </a>
### 基本信息

**Path：** /otc/search

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易类型（出售 OR 求购）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> symbol </span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isBlockTrade</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否是大宗交易，默认0</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CNY</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payments</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式:"otc.payment.alipay", "支付宝"  "otc.payment.wxpay", "微信支付"  "otc.payment.international.wire.transfer", "国际电汇"</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.alipay</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sort</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">排序方式:0, "时间降序排序"  1, "价格升序排序"  2, "价格降序排序"  3, "数量升序排序"  4, "数量降序排序"  5, "信用升序排序" 3.4.5.5_bugfix_1213分支新增  6, "信用降序排序"</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> numberCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">国家数字编码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>'156'</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize </span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-9><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">目标金额，目标金额应该大于最小限额，小于最大限额 </span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.11</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总记录数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> advertList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告单</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volumeBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">剩余数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>186****2230</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>88646.1519437</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单价单位</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CNY</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> paySymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">符号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>¥</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户头像</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> creditGrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信用度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> maxTrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单笔最大交易额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payments</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-10-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> key</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付类型key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.alipay</span></p></td></tr><tr key=0-2-1-10-1><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付类型标题</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>支付宝</span></p></td></tr><tr key=0-2-1-10-2><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图标</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>alpay.png</span></p></td></tr><tr key=0-2-1-10-3><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> used</span></td><td key=1><span>boolean</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否在使用</span></td><td key=5><p key=1><span style="font-weight: '700'">mock: </span><span>true</span></p></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> minTrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单笔最小交易额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户Id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>121</span></p></td></tr><tr key=0-2-1-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> advertId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告Id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1231</span></p></td></tr><tr key=0-2-1-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> completeOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成单数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12312</span></p></td></tr><tr key=0-2-1-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> loginStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">在线状态 （1在线，0离线）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sideText</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向文案</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>备注文案</span></p></td></tr>
               </tbody>
              </table>
            
## 发布广告
<a id=发布广告> </a>
### 基本信息

**Path：** /otc/wanted_save

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告类型 'SELL', 'BUY'</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CNY</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易总数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> priceRate</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">溢价比率，固定价格时：0,写整数：80 表示80%</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> priceRateType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易价格与市场价的比率类型，0：固定价格  2：高于 ,  3：低于</span></td><td key=5></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> minTrade</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单笔最小交易额(金额)</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> maxTrade</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单笔最大交易额(金额)	</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-9><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> limitTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易期限，单位：分钟</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5</span></p></td></tr><tr key=0-10><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> dealVolume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">对方必须交易次数限制</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-11><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> days</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告开放时间，单位：日</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-12><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payments</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式	</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-12-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payment</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.alipay</span></p></td></tr><tr key=0-13><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> description</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告说明（备注）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-14><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> autoReply</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">聊天自动回复内容</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-15><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isBlockTrade</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：普通交易，1：大宗交易</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 生成出售订单
<a id=生成出售订单> </a>
### 基本信息

**Path：** /v4/otc/sell_order_save

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> advertId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volume</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> totalPrice </span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>111</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> description</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单备注</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>备注</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> capitalPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">资金密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>password</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> type</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">以价格或数量为准 price/volume</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>price</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sequence</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回消息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 申诉修改订单状态
<a id=申诉修改订单状态> </a>
### 基本信息

**Path：** /otc/complain_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sequence</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20190906324236</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> complainId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2398</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回消息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 确认打币
<a id=确认打币> </a>
### 基本信息

**Path：** /v4/otc/confirm_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sequence</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12312</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> capitalPword</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">资金密码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>adasd</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 确认支付
<a id=确认支付> </a>
### 基本信息

**Path：** /v4/otc/order_payed

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sequence</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12313</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> payment</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.wxpay</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 获取个人广告信息
<a id=获取个人广告信息> </a>
### 基本信息

**Path：** /otc/v4/person_ads

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uid</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">被查看的用户id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> adType</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告类型 buy,sell</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>buy</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>31</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> minTrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最小交易量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>31</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> maxTrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">最大交易量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>31</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payments</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式    </span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-3-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> key</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.alipay</span></p></td></tr><tr key=0-2-3-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> title</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>支付宝</span></p></td></tr><tr key=0-2-3-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> icon</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图标</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>alpay.png</span></p></td></tr><tr key=0-2-3-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> used</span></td><td key=1><span>boolean</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否在使用</span></td><td key=5><p key=1><span style="font-weight: '700'">mock: </span><span>true</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> adList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-4-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CNY</span></p></td></tr><tr key=0-2-4-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-4-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买卖方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-2-4-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1530087534000</span></p></td></tr><tr key=0-2-4-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>100</span></p></td></tr><tr key=0-2-4-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sell</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已成交量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-4-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> advertId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2141</span></p></td></tr><tr key=0-2-4-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">广告状态 1发布中  2交易中 3过期 4关闭</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-4-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-2-4-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isHaveOrder</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否有未完成订单1有0无</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
## 获取黑名单
<a id=获取黑名单> </a>
### 基本信息

**Path：** /otc/person_relationship

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> relationType</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">好友关系</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"BLACKLIST"</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页大小</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">页号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> relationshipList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">黑名单列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户昵称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>name</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> creditGrade</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信用度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> completeOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">交易次数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> image</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">头像</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>@image</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 订单详情数据
<a id=订单详情数据> </a>
### 基本信息

**Path：** /v4/otc/order_detail

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sequence</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回消息</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> seller</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">卖方</span></td><td key=5></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">真实姓名</span></td><td key=5></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外用户名</span></td><td key=5></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号</span></td><td key=5></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">头像url</span></td><td key=5></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isOnline</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否在线</span></td><td key=5></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> completeOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交订单数量</span></td><td key=5></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1  -- 商户状态，0:未认证，1：普通商户，2：超级商户</span></td><td key=5></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> complainId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">申诉id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> totalPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payTime</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">已支付时间，前端根据这个时间判断是否展示提交申诉按钮 </span></td><td key=5></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> complainCommand</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">申诉口令</span></td><td key=5></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">备注信息</span></td><td key=5></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> otcAuthnameOpen</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否显示联系方式开关 0：不开 1：开</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> paycoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CNY</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> buyer</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">买家信息</span></td><td key=5></td></tr><tr key=0-2-8-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> uid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>106617</span></p></td></tr><tr key=0-2-8-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">真实姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>张小名</span></p></td></tr><tr key=0-2-8-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> otcNickName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">场外用户名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>106617广告主9</span></p></td></tr><tr key=0-2-8-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mobileNumber</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手机号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1231231231</span></p></td></tr><tr key=0-2-8-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">头像url</span></td><td key=5></td></tr><tr key=0-2-8-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isOnline</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否在线</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-8-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> completeOrders</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交订单数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>14</span></p></td></tr><tr key=0-2-8-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1  -- 商户状态，0:未认证，1：普通商户，2：超级商户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-2-8-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> email</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">邮箱</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>912313@qq.com</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isTwoMin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否超过两分钟，0：展示2分钟文案 1：邮箱电话才会给（场外优化0709新增）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数量 </span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> limitTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单剩余时间，毫秒</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>299270</span></p></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sequence</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单号</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20190906324235</span></p></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isComplainUser</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0 当前用户不是申诉人 1 当前用户为申诉人</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-2-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567739097000</span></p></td></tr><tr key=0-2-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payment</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key和账号的数组；buy的时候是多个，sell单个</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-16-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> bankName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户银行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>招商</span></p></td></tr><tr key=0-2-16-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> payment</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">支付方式key</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>otc.payment.wxpa</span></p></td></tr><tr key=0-2-16-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> qrcodeImg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">base64图片</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chaindown-oss.oss-cn-hongkong.aliyuncs.com/common/image/1543642040053.png</span></p></td></tr><tr key=0-2-16-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">姓名</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>134124</span></p></td></tr><tr key=0-2-16-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ifscCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">IFSC码</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123123</span></p></td></tr><tr key=0-2-16-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> account</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">账号信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>23424242</span></p></td></tr><tr key=0-2-16-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> bankOfDeposit</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开户支行</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>上地支行</span></p></td></tr><tr key=0-2-17><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> payKey</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-18><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">购买币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>USDT</span></p></td></tr><tr key=0-2-19><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单状态 待支付1 已支付2 交易成功3 取消 4 申诉 5 打币中6 异常订单7 申诉处理结束8申诉取消9</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-20><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isBlockTrade</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0：普通订单，1：大宗订单</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-21><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sendCoinTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">放币时间，已完成显示</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 问题详情页
<a id=问题详情页> </a>
### 基本信息

**Path：** /question/details_problem

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> id</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提问id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回信息</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">返回数据</span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> rqInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">问题id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2398</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2131</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqTitle</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>标题</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqDescribe</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">问题描述</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>详情</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqStatus</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">提交时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1520238446000</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> mtime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567740720000</span></p></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-2-0-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqTypeName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">问题类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>对方未放行</span></p></td></tr><tr key=0-2-0-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqStatusName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">问题状态</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>等待客服回复</span></p></td></tr><tr key=0-2-0-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageData</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageDataStr</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">附件信息</span></td><td key=5></td></tr><tr key=0-2-0-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> opUid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> rqReplyList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">追问id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2398</span></p></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> rqId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">被追问的问题id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2398</span></p></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">//用户类型：1-后台用户 2-前端用户</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1231</span></p></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> replayContent</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">追问内容</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>申诉提交成功，申诉口令为062398,请确保您的联系方式畅通，以便客服人员能够尽快联系到您。</span></p></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contentType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">//1-文字内容 2-图片url （新增）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">//提交时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567740720000</span></p></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> userName</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>@name</span></p></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> imageData</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 合约-交易

## 指数/标记价格
<a id=指数/标记价格> </a>
### 基本信息

**Path：** /fe-co-api/tag_price

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">最大值: </span><span>1000</span></p><p key=1><span style="font-weight: '700'">最小值: </span><span>0</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> indexPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> tagPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 交易-下单
<a id=交易-下单> </a>
### 基本信息

**Path：** /fe-co-api/take_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> closeType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>69</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> copType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> level</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>15</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>9924.55</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>4</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
## 交易-修改杠杆倍数
<a id=交易-修改杠杆倍数> </a>
### 基本信息

**Path：** /fe-co-api/change_level

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> leverageLevel</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 交易-减仓风险排名
<a id=交易-减仓风险排名> </a>
### 基本信息

**Path：** /fe-co-api/get_liquidation_rate

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{
   "contractId": "",
   "liquidationRate": 50
}
```
## 交易-撤销订单
<a id=交易-撤销订单> </a>
### 基本信息

**Path：** /fe-co-api/cancel_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=4><span style="font-weight: '700'">format: </span><span>date-time</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

```javascript
{
   "type": "object",
   "title": "empty object",
   "properties": {}
}
```
## 交易-追加保证金
<a id=交易-追加保证金> </a>
### 基本信息

**Path：** /fe-co-api/transfer_margin

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">追加数量(转出为负数)</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> positionId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">仓位Id, 分仓模式下必传</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 持仓信息
<a id=持仓信息> </a>
### 基本信息

**Path：** /fe-co-api/user_position

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>integer</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约id不填查询的为仓位列表</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> positionCount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderCount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> positions</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-2-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> avgPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> liquidationPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> usedMargin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> baseSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> unrealisedAmountMarket</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractSeries</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> copType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realisedAmountCurr</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-13><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> unrealisedRateMarket</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-14><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> pricePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-15><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-16><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> indexPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-17><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> settleTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-18><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> multiplier</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-19><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-20><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> priceValue</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-21><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> closeFeeAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-22><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> bond</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-23><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-24><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> valuePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-25><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> maxLeverageLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-26><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> canUseMargin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-27><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> series</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-28><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> realisedAmountHistory</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-29><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> assignedMargin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-30><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-31><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> holdAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-32><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> unrealisedRateIndex</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-33><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> unrealisedAmountIndex</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-34><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> minMargin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-35><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> holdRate</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2-36><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> quoteSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 交易-下单初始化
<a id=交易-下单初始化> </a>
### 基本信息

**Path：** /fe-co-api/init_take_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> contractId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合约ID</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>69</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> level</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">杠杆倍数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderType</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单类型（限价为1，市价为2）</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>9783.12</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volume</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">仓位数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> liquidationBuyPrice</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>11632.7394500022487180</span></p></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span>  volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderPriceValue</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.0003066506390599</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> buyOrderCost</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.0000615601157912</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> canUseBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.026408719770790946</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> sellOrderCost</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.000020673363916594925004787586562504490828029446447544614784419536590576171875</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>""</span></p></td></tr>
               </tbody>
              </table>
            
## 查询合约资金流水
<a id=查询合约资金流水> </a>
### 基本信息

**Path：** /fe-co-api/business_transation_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
| exchange-token  |  ee53d3e2831bb2df79b1442fadc9d86ef4b4f05b0b974a02b06a6cc084cfe855 | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> page</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 查询合约配置
<a id=查询合约配置> </a>
### 基本信息

**Path：** /fe-co-api/contract_public_info_v2

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2019-09-02 14:47:24</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> market</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> wsUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> marketSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>E_BTCUSD</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> coinList</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> btc</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>8</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> lan</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> defLan</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"zh_CN"</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> market</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> marketSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> switch</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-6-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> is_more_position</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> wsUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>"wss://dev3ws3.chaindown.com/contract-kline-api/ws"</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>""</span></p></td></tr>
               </tbody>
              </table>
            
## 订单列表
<a id=订单列表> </a>
### 基本信息

**Path：** /fe-co-api/order_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> order_type</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1:活动委托    2:已成交委托   3：历史委托</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-0-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-0-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-0-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> orderId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-0-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-0-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 资产-未平仓合约
<a id=资产-未平仓合约> </a>
### 基本信息

**Path：** /fe-co-api/hold_contract_list

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> symbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> settleTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> multiplier</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> avgPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> leverageLevel</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> unrealisedAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractSeries</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> realisedAmount</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 资产-账户余额信息
<a id=资产-账户余额信息> </a>
### 基本信息

**Path：** /fe-co-api/account_balance

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> margin</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> unrealisedAmount</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> useMarginRate</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> reverseOrderList</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> walletBalance</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> openPositionFee</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> walletAccountType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> positionMargin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> orderMargin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contractAccountType</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> canUseBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> accountRight</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> showPrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> quoteSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 资产划转
<a id=资产划转> </a>
### 基本信息

**Path：** /fe-co-api/capital_transfer

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
| exchange-token  |  ee53d3e2831bb2df79b1442fadc9d86ef4b4f05b0b974a02b06a6cc084cfe855 | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> bond</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> fromType</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3>201101</td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>201101</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> toType</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3>2161001</td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2161001</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> uaTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=4><span style="font-weight: '700'">format: </span><span>date-time</span></p></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>200</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr>
               </tbody>
              </table>
            
# 杠杆-交易

##  历史委托
<a id= 历史委托> </a>
### 基本信息

**Path：** /lever/order/history-0001

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page	 | 是  |   1 |  默认未1 |
| pageSize	 | 是  |  10 |  默认是10 |
| symbol	 | 是  |  	ethbtc |  交易对，例如ethbtc |
| isShowCanceled	 | 是  |  	1 |  是否展示已取消的订单，0表示不展示，1表示展示，默认1 |
| side	 | 否  |  	BUY |  订单买卖方向，BUY买入 SELL卖出 (不传查全部) |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> baseCoinBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10100.00000000</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countCoinBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10100.00000000</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> minVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">限价最小数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> minPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 限量最小价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5000</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volumePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 数量精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pricePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前实时价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2322.33</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-8-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-8-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总金额=price*volume</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.10000000</span></p></td></tr><tr key=0-8-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1510993841000</span></p></td></tr><tr key=0-8-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.10000000</span></p></td></tr><tr key=0-8-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-8-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">/订单来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>H5</span></p></td></tr><tr key=0-8-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-8-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-8-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-8-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> source_msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>WEB</span></p></td></tr><tr key=0-8-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12</span></p></td></tr><tr key=0-8-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-8-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">/未成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-8-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-8-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">INIT(0,"初始订单，未成交未进入盘口"), NEW_(1,"新订单，未成交进入盘口"), FILLED(2,"完全成交"), PART_FILLED(3,"部分成交"), CANCELED(4,"已撤单"), PENDING_CANCEL(5,"待撤单"), EXPIRED(6,"异常订单");  PART_FILLED_CANCELED(7,"部分成交已撤销,vue版本前端展示使用,数据库没有此状态");</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-8-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>完全成交</span></p></td></tr>
               </tbody>
              </table>
            
##  取消订单
<a id= 取消订单> </a>
### 基本信息

**Path：** /lever/order/cancel

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| orderId | 是  |  1 |  订单ID |
| symbol | 是  |  ethbtc |  市场标记，ethbtc，详情看下面 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=1><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 交易下单
<a id=交易下单> </a>
### 基本信息

**Path：** /lever/order/create

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| price | 是  |   "0.00984983" |  价格 |
| side | 是  |   "BUY" |  卖出SELL  买入BUY |
| symbol | 是  |   "mmusdt" |  交易币对 |
| type | 是  |   1 |  1: 限价交易  2：市价交易 |
| volume | 是  |   "1.0000" |  数量 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>操作成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=0><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 当前委托
<a id=当前委托> </a>
### 基本信息

**Path：** /lever/order/list/new

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page | 是  |   1 |  当前分页 |
| pageSize | 否  |   10 |  分页数量 |
| idList | 否  |   |  自动刷新时，根据集合查询订单列表，格式：[1,2,3,4,5,6,7,8] 传id数组 |
| symbol | 是  |   "elfbtc" |  币对 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> baseCoinBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10100.00000000</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> countCoinBalance</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币账户余额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10100.00000000</span></p></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> minVolume</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">限价最小数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> minPrice</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 限量最小价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>5000</span></p></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> volumePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 数量精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-6><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> pricePrecision</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">价格精度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-7><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> price</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">当前实时价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2322.33</span></p></td></tr><tr key=0-8><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-8-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交方向</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-8-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总金额=price*volume</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.10000000</span></p></td></tr><tr key=0-8-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1510993841000</span></p></td></tr><tr key=0-8-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">平均成交价</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.10000000</span></p></td></tr><tr key=0-8-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">计价货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-8-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">/订单来源</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>H5</span></p></td></tr><tr key=0-8-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">订单类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-8-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>123</span></p></td></tr><tr key=0-8-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">委托价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-8-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> source_msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>WEB</span></p></td></tr><tr key=0-8-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>12</span></p></td></tr><tr key=0-8-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-8-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">/未成交数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-8-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">基准货币</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BTC</span></p></td></tr><tr key=0-8-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">INIT(0,"初始订单，未成交未进入盘口"), NEW_(1,"新订单，未成交进入盘口"), FILLED(2,"完全成交"), PART_FILLED(3,"部分成交"), CANCELED(4,"已撤单"), PENDING_CANCEL(5,"待撤单"), EXPIRED(6,"异常订单");  PART_FILLED_CANCELED(7,"部分成交已撤销,vue版本前端展示使用,数据库没有此状态");</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr><tr key=0-8-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status_text</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>完全成交</span></p></td></tr>
               </tbody>
              </table>
            
## 根据订单号获取成交记录
<a id=根据订单号获取成交记录> </a>
### 基本信息

**Path：** /lever/trade/list_by_order

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| orderId | 是  |  1 |  	订单号 |
| symbol | 是  |  btcusdt |  市场标记，btcusdt |
| pageSize | 是  |  10 |  页面大小 |
| page | 是  |  1 |  页码 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">20</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>20</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> trade_list</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成交量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">类型</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>SELL</span></p></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> feeCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>usdt</span></p></td></tr><tr key=0-1-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1525509694330</span></p></td></tr><tr key=0-1-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单价格</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.000</span></p></td></tr><tr key=0-1-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fee</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">手续费</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.001</span></p></td></tr><tr key=0-1-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ctime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">下单时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2018-05-05 16:41:34</span></p></td></tr><tr key=0-1-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> deal_price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">剩余数量</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1.00000000</span></p></td></tr><tr key=0-1-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> orderInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">h5调用时才有订单详情 </span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> side</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>BUY</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> total_price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.10000000</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> time_long</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1510993841000</span></p></td></tr><tr key=0-2-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> avg_price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.10000000</span></p></td></tr><tr key=0-2-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> countCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>btc</span></p></td></tr><tr key=0-2-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> source</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>H5</span></p></td></tr><tr key=0-2-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> type</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> price</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> source_msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>WEB</span></p></td></tr><tr key=0-2-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> deal_volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> remain_volume</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0.00</span></p></td></tr><tr key=0-2-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> baseCoin</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>eth</span></p></td></tr><tr key=0-2-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>2</span></p></td></tr>
               </tbody>
              </table>
            
# 创新试验区

## 用户确认申购接口
<a id=用户确认申购接口> </a>
### 基本信息

**Path：** /api/newcoin_purchase

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| projectId | 是  |  1 |  项目ID |
| amount | 是  |  10 |  购买金额 |
| smsValidCode | 是  |  292929 |  短信验证码 |
| emailValidCode | 是  |  292929 |  邮箱验证码 |
| googleCode | 是  |  292929 |  谷歌验证码 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>null</span></p></td></tr>
               </tbody>
              </table>
            
## 获取创新实验区数据列表
<a id=获取创新实验区数据列表> </a>
### 基本信息

**Path：** /newcoinV2/newcoin_project_listV2

**Method：** GET

**接口描述：**


### 请求参数
**Query**

| 参数名称  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ |
| page | 是  |   1 |  页数 |
| pageSize | 是  |   10 |  每页数量 |
| status | 是  |   0 |  项目状态0.全部 1.进行中2.兑换结束3.兑换成功 |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>0</span></p></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>成功</span></p></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> projectInfoList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">募集币种</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CXC</span></p></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> money</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">募集金额</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10000.0000000000</span></p></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">项目名称</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>CXC一号矿山节点第二期认购</span></p></td></tr><tr key=0-2-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> logo</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">logo URL</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>http://chainup-oss.oss-cn-beijing.aliyuncs.com/upload/20190903213129284.png</span></p></td></tr><tr key=0-2-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> startTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">开始时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567569600000,</span></p></td></tr><tr key=0-2-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> endTime</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">结束时间</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1567742400000</span></p></td></tr><tr key=0-2-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> projectId</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">主键id</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>156</span></p></td></tr><tr key=0-2-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> speed</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">进度</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>1</span></p></td></tr><tr key=0-2-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态2.预热中 3.进行中 4.募集完成，5.发放TOKEN 6.退还申购基金</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>3</span></p></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> count</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">总条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>120</span></p></td></tr><tr key=0-2-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> pageSize</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">每页显示条数</span></td><td key=5><p key=5><span style="font-weight: '700'">mock: </span><span>10</span></p></td></tr>
               </tbody>
              </table>
            
## 获取创新实验区数据详情
<a id=获取创新实验区数据详情> </a>
### 基本信息

**Path：** /newcoinV2/newcoin_project_detailV2

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> projectId</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创新项目id</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功 非0具体错误原因</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> msg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">具体错误描述or成功描述</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">具体错误描述or成功描述</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> singleMaxRaiseMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">单次购买上限 </span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> singleMaxCount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 单用户购买次数上限</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> raisedMoney</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">335, 已募集金额</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> banner</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> initPrice</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> grantSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">BTC", 发放币种</span></td><td key=5></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> speed</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">30.45, 募集进度</span></td><td key=5></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> singleMinRaiseMoney</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">0, 单次购买下限</span></td><td key=5></td></tr><tr key=0-3-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isAuthRealname</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"> 0, 是否需要实名认证</span></td><td key=5></td></tr><tr key=0-3-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> coinSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">募集币种</span></td><td key=5></td></tr><tr key=0-3-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> money</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">募集金额</span></td><td key=5></td></tr><tr key=0-3-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">项目名称</span></td><td key=5></td></tr><tr key=0-3-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> logo</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">logo</span></td><td key=5></td></tr><tr key=0-3-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> details</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">项目详情</span></td><td key=5></td></tr><tr key=0-3-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> startTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1550927953000, //开始时间</span></td><td key=5></td></tr><tr key=0-3-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> endTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1551014355000, //结束时间</span></td><td key=5></td></tr><tr key=0-3-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> id</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">id</span></td><td key=5></td></tr><tr key=0-3-17><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> status</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">3 // 状态 2.预热中 3.进行中 4.募集完成，5.发放TOKEN 6.退还申购基金</span></td><td key=5></td></tr><tr key=0-3-18><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> u_holdSymbol_amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">1000 //用户需持有币种余额(冻结+可用)</span></td><td key=5></td></tr><tr key=0-3-19><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> u_coinSymbol_amount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户募集币种可用余额</span></td><td key=5></td></tr><tr key=0-3-20><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> entranceAmount</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">所需门票币数额</span></td><td key=5></td></tr><tr key=0-3-21><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> entranceSymbol</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">所需门票币种</span></td><td key=5></td></tr><tr key=0-3-22><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> u_entranceSymbol_account</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">用户持有门票币种余额</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
