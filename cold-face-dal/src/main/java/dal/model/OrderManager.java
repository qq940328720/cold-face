package dal.model;

import java.math.BigDecimal;

public class OrderManager {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 客户编号
     */
    private String userCode;

    /**
     * 机构编码
     */
    private String orgCode;

    /**
     * 机构名
     */
    private String orgName;

    /**
     * 商户编码
     */
    private String merchantCode;

    /**
     * 商户名
     */
    private String merchantName;

    /**
     * 门店编码
     */
    private String storeCode;

    /**
     * 门店名
     */
    private String storeName;

    /**
     * 产品编码
     */
    private String productCode;

    /**
     * 产品名
     */
    private String productName;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 级别1 对应字典表产品类目描述
     */
    private String level1Code;

    /**
     * 级别2 对应字典表产品类目描述
     */
    private String level2Code;

    /**
     * 级别3 对应字典表产品类目描述
     */
    private String level3Code;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 手机号码
     */
    private String userPhone;

    /**
     * 身份证号码
     */
    private String userNationalid;

    /**
     * 客户性别
     */
    private String userGender;

    /**
     * 住址-省code
     */
    private String provinceCode;

    /**
     * 住址-市code
     */
    private String cityCode;

    /**
     * 住址-区code
     */
    private String districtCode;

    /**
     * 详细住址
     */
    private String homeAddress;

    /**
     * 业务员
     */
    private String empNameCode;

    /**
     * 经度
     */
    private String lng;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 贷款金额
     */
    private BigDecimal loanMoney;

    /**
     * 首付金额
     */
    private BigDecimal firstPayMoney;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 计息方式 1.等额本息 2.等额本金 3.等本等息
     */
    private Integer interestType;

    /**
     * 期数
     */
    private Byte payTime;

    /**
     * 期数单位 1年 2月 3日 4季
     */
    private Boolean payTimeUnit;

    /**
     * 利率
     */
    private BigDecimal payRate;

    /**
     * 银行卡号
     */
    private String bankCard;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 订单状态 1,资料填写中 2,已提交,待信审 3,信审中 4,信审通过,待提货 5,资料待审核 6,审核中 7,审核完成,待打款 8,打款中 9,还款中 10,已取消 11,完成 12,拒绝
     */
    private Byte state;

    /**
     * 信审结果 1,待审核  2,审核通过 3,审核拒绝 4,驳回 5,审核取消
     */
    private Boolean orderAuditState;

    /**
     * 提货照审核结果  1,待审核  2,审核通过 3,审核拒绝 4,驳回 5,审核取消
     */
    private Boolean imgAuditState;

    /**
     * 打款结果 1,待放款 2,放款通过 3,放款拒绝 4,审核取消
     */
    private Boolean sendAuditState;

    /**
     * 最终放款对象 1,个人用户 2,商户用户
     */
    private Boolean finalLoanType;

    /**
     * 还款日
     */
    private Byte payDay;

    /**
     * 终端来源 1,android  2,ios
     */
    private Boolean clientResource;

    /**
     * 是否有提前还款包  0,否  1,是
     */
    private Boolean isQuickPayPackage;

    /**
     * 消费贷设备唯一识别码
     */
    private String uniqueCode;

    /**
     * 是否删除 1y  0n
     */
    private Boolean deleted;

    /**
     * 是否预警 0,否  1,是
     */
    private Boolean isWarning;

    /**
     * 是否推荐 0,否  1,是
     */
    private Boolean isRecommend;

    /**
     * 创建时间
     */
    private Long insertTime;

    /**
     * 最后更新时间
     */
    private Long updateTime;

    /**
     * 业务id
     */
    private String bizid;

    /**
     * 运营商授权编号
     */
    private String authCode;

    /**
     * 是否运营商授权 1 是 0 否
     */
    private Boolean isAuth;

    /**
     * 是否上传通讯录 1 是 0 否
     */
    private Boolean isTelephonedirectory;

    /**
     * 源IP
     */
    private String ipSrc;

    /**
     * 打款方式 1,自动打款  2.线上人工代发 3.线下人工打款
     */
    private Boolean receiveType;

    /**
     * 打款状态：１、待打款　２、打款成功　３、打款失败　４、打款中
     */
    private Boolean recieveState;

    /**
     * 同盾查询key
     */
    private String tdBlackbox;

    /**
     * 获取编号
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单编码
     * @return order_code
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 设置订单编码
     * @param orderCode
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 获取客户编号
     * @return user_code
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置客户编号
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * 获取机构编码
     * @return org_code
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置机构编码
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取机构名
     * @return org_name
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取商户编码
     * @return merchant_code
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     * 设置商户编码
     * @param merchantCode
     */
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    /**
     * 获取商户名
     * @return merchant_name
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 设置商户名
     * @param merchantName
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * 获取门店编码
     * @return store_code
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 设置门店编码
     * @param storeCode
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    /**
     * 获取门店名
     * @return store_name
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置门店名
     * @param storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 获取产品编码
     * @return product_code
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置产品编码
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * 获取产品名
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取商品编码
     * @return commodity_code
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * 设置商品编码
     * @param commodityCode
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * 获取商品名称
     * @return commodity_name
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     * @param commodityName
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * 获取级别1 对应字典表产品类目描述
     * @return level_1_code
     */
    public String getLevel1Code() {
        return level1Code;
    }

    /**
     * 设置级别1 对应字典表产品类目描述
     * @param level1Code
     */
    public void setLevel1Code(String level1Code) {
        this.level1Code = level1Code == null ? null : level1Code.trim();
    }

    /**
     * 获取级别2 对应字典表产品类目描述
     * @return level_2_code
     */
    public String getLevel2Code() {
        return level2Code;
    }

    /**
     * 设置级别2 对应字典表产品类目描述
     * @param level2Code
     */
    public void setLevel2Code(String level2Code) {
        this.level2Code = level2Code == null ? null : level2Code.trim();
    }

    /**
     * 获取级别3 对应字典表产品类目描述
     * @return level_3_code
     */
    public String getLevel3Code() {
        return level3Code;
    }

    /**
     * 设置级别3 对应字典表产品类目描述
     * @param level3Code
     */
    public void setLevel3Code(String level3Code) {
        this.level3Code = level3Code == null ? null : level3Code.trim();
    }

    /**
     * 获取姓名
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取手机号码
     * @return user_phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号码
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取身份证号码
     * @return user_nationalid
     */
    public String getUserNationalid() {
        return userNationalid;
    }

    /**
     * 设置身份证号码
     * @param userNationalid
     */
    public void setUserNationalid(String userNationalid) {
        this.userNationalid = userNationalid == null ? null : userNationalid.trim();
    }

    /**
     * 获取客户性别
     * @return user_gender
     */
    public String getUserGender() {
        return userGender;
    }

    /**
     * 设置客户性别
     * @param userGender
     */
    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    /**
     * 获取住址-省code
     * @return province_code
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置住址-省code
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * 获取住址-市code
     * @return city_code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置住址-市code
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 获取住址-区code
     * @return district_code
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * 设置住址-区code
     * @param districtCode
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    /**
     * 获取详细住址
     * @return home_address
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * 设置详细住址
     * @param homeAddress
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    /**
     * 获取业务员
     * @return emp_name_code
     */
    public String getEmpNameCode() {
        return empNameCode;
    }

    /**
     * 设置业务员
     * @param empNameCode
     */
    public void setEmpNameCode(String empNameCode) {
        this.empNameCode = empNameCode == null ? null : empNameCode.trim();
    }

    /**
     * 获取经度
     * @return lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置经度
     * @param lng
     */
    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    /**
     * 获取纬度
     * @return lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置纬度
     * @param lat
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 获取贷款金额
     * @return loan_money
     */
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**
     * 设置贷款金额
     * @param loanMoney
     */
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**
     * 获取首付金额
     * @return first_pay_money
     */
    public BigDecimal getFirstPayMoney() {
        return firstPayMoney;
    }

    /**
     * 设置首付金额
     * @param firstPayMoney
     */
    public void setFirstPayMoney(BigDecimal firstPayMoney) {
        this.firstPayMoney = firstPayMoney;
    }

    /**
     * 获取商品价格
     * @return commodity_price
     */
    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    /**
     * 设置商品价格
     * @param commodityPrice
     */
    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    /**
     * 获取计息方式 1.等额本息 2.等额本金 3.等本等息
     * @return interest_type
     */
    public Integer getInterestType() {
        return interestType;
    }

    /**
     * 设置计息方式 1.等额本息 2.等额本金 3.等本等息
     * @param interestType
     */
    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    /**
     * 获取期数
     * @return pay_time
     */
    public Byte getPayTime() {
        return payTime;
    }

    /**
     * 设置期数
     * @param payTime
     */
    public void setPayTime(Byte payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取期数单位 1年 2月 3日 4季
     * @return pay_time_unit
     */
    public Boolean getPayTimeUnit() {
        return payTimeUnit;
    }

    /**
     * 设置期数单位 1年 2月 3日 4季
     * @param payTimeUnit
     */
    public void setPayTimeUnit(Boolean payTimeUnit) {
        this.payTimeUnit = payTimeUnit;
    }

    /**
     * 获取利率
     * @return pay_rate
     */
    public BigDecimal getPayRate() {
        return payRate;
    }

    /**
     * 设置利率
     * @param payRate
     */
    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    /**
     * 获取银行卡号
     * @return bank_card
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * 设置银行卡号
     * @param bankCard
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    /**
     * 获取银行名称
     * @return bank_name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 获取订单状态 1,资料填写中 2,已提交,待信审 3,信审中 4,信审通过,待提货 5,资料待审核 6,审核中 7,审核完成,待打款 8,打款中 9,还款中 10,已取消 11,完成 12,拒绝
     * @return state
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置订单状态 1,资料填写中 2,已提交,待信审 3,信审中 4,信审通过,待提货 5,资料待审核 6,审核中 7,审核完成,待打款 8,打款中 9,还款中 10,已取消 11,完成 12,拒绝
     * @param state
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取信审结果 1,待审核  2,审核通过 3,审核拒绝 4,驳回 5,审核取消
     * @return order_audit_state
     */
    public Boolean getOrderAuditState() {
        return orderAuditState;
    }

    /**
     * 设置信审结果 1,待审核  2,审核通过 3,审核拒绝 4,驳回 5,审核取消
     * @param orderAuditState
     */
    public void setOrderAuditState(Boolean orderAuditState) {
        this.orderAuditState = orderAuditState;
    }

    /**
     * 获取提货照审核结果  1,待审核  2,审核通过 3,审核拒绝 4,驳回 5,审核取消
     * @return img_audit_state
     */
    public Boolean getImgAuditState() {
        return imgAuditState;
    }

    /**
     * 设置提货照审核结果  1,待审核  2,审核通过 3,审核拒绝 4,驳回 5,审核取消
     * @param imgAuditState
     */
    public void setImgAuditState(Boolean imgAuditState) {
        this.imgAuditState = imgAuditState;
    }

    /**
     * 获取打款结果 1,待放款 2,放款通过 3,放款拒绝 4,审核取消
     * @return send_audit_state
     */
    public Boolean getSendAuditState() {
        return sendAuditState;
    }

    /**
     * 设置打款结果 1,待放款 2,放款通过 3,放款拒绝 4,审核取消
     * @param sendAuditState
     */
    public void setSendAuditState(Boolean sendAuditState) {
        this.sendAuditState = sendAuditState;
    }

    /**
     * 获取最终放款对象 1,个人用户 2,商户用户
     * @return final_loan_type
     */
    public Boolean getFinalLoanType() {
        return finalLoanType;
    }

    /**
     * 设置最终放款对象 1,个人用户 2,商户用户
     * @param finalLoanType
     */
    public void setFinalLoanType(Boolean finalLoanType) {
        this.finalLoanType = finalLoanType;
    }

    /**
     * 获取还款日
     * @return pay_day
     */
    public Byte getPayDay() {
        return payDay;
    }

    /**
     * 设置还款日
     * @param payDay
     */
    public void setPayDay(Byte payDay) {
        this.payDay = payDay;
    }

    /**
     * 获取终端来源 1,android  2,ios
     * @return client_resource
     */
    public Boolean getClientResource() {
        return clientResource;
    }

    /**
     * 设置终端来源 1,android  2,ios
     * @param clientResource
     */
    public void setClientResource(Boolean clientResource) {
        this.clientResource = clientResource;
    }

    /**
     * 获取是否有提前还款包  0,否  1,是
     * @return is_quick_pay_package
     */
    public Boolean getIsQuickPayPackage() {
        return isQuickPayPackage;
    }

    /**
     * 设置是否有提前还款包  0,否  1,是
     * @param isQuickPayPackage
     */
    public void setIsQuickPayPackage(Boolean isQuickPayPackage) {
        this.isQuickPayPackage = isQuickPayPackage;
    }

    /**
     * 获取消费贷设备唯一识别码
     * @return unique_code
     */
    public String getUniqueCode() {
        return uniqueCode;
    }

    /**
     * 设置消费贷设备唯一识别码
     * @param uniqueCode
     */
    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode == null ? null : uniqueCode.trim();
    }

    /**
     * 获取是否删除 1y  0n
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除 1y  0n
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取是否预警 0,否  1,是
     * @return is_warning
     */
    public Boolean getIsWarning() {
        return isWarning;
    }

    /**
     * 设置是否预警 0,否  1,是
     * @param isWarning
     */
    public void setIsWarning(Boolean isWarning) {
        this.isWarning = isWarning;
    }

    /**
     * 获取是否推荐 0,否  1,是
     * @return is_recommend
     */
    public Boolean getIsRecommend() {
        return isRecommend;
    }

    /**
     * 设置是否推荐 0,否  1,是
     * @param isRecommend
     */
    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * 获取创建时间
     * @return insert_time
     */
    public Long getInsertTime() {
        return insertTime;
    }

    /**
     * 设置创建时间
     * @param insertTime
     */
    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 获取最后更新时间
     * @return update_time
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后更新时间
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取业务id
     * @return bizid
     */
    public String getBizid() {
        return bizid;
    }

    /**
     * 设置业务id
     * @param bizid
     */
    public void setBizid(String bizid) {
        this.bizid = bizid == null ? null : bizid.trim();
    }

    /**
     * 获取运营商授权编号
     * @return auth_code
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * 设置运营商授权编号
     * @param authCode
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    /**
     * 获取是否运营商授权 1 是 0 否
     * @return is_auth
     */
    public Boolean getIsAuth() {
        return isAuth;
    }

    /**
     * 设置是否运营商授权 1 是 0 否
     * @param isAuth
     */
    public void setIsAuth(Boolean isAuth) {
        this.isAuth = isAuth;
    }

    /**
     * 获取是否上传通讯录 1 是 0 否
     * @return is_telephonedirectory
     */
    public Boolean getIsTelephonedirectory() {
        return isTelephonedirectory;
    }

    /**
     * 设置是否上传通讯录 1 是 0 否
     * @param isTelephonedirectory
     */
    public void setIsTelephonedirectory(Boolean isTelephonedirectory) {
        this.isTelephonedirectory = isTelephonedirectory;
    }

    /**
     * 获取源IP
     * @return ip_src
     */
    public String getIpSrc() {
        return ipSrc;
    }

    /**
     * 设置源IP
     * @param ipSrc
     */
    public void setIpSrc(String ipSrc) {
        this.ipSrc = ipSrc == null ? null : ipSrc.trim();
    }

    /**
     * 获取打款方式 1,自动打款  2.线上人工代发 3.线下人工打款
     * @return receive_type
     */
    public Boolean getReceiveType() {
        return receiveType;
    }

    /**
     * 设置打款方式 1,自动打款  2.线上人工代发 3.线下人工打款
     * @param receiveType
     */
    public void setReceiveType(Boolean receiveType) {
        this.receiveType = receiveType;
    }

    /**
     * 获取打款状态：１、待打款　２、打款成功　３、打款失败　４、打款中
     * @return recieve_state
     */
    public Boolean getRecieveState() {
        return recieveState;
    }

    /**
     * 设置打款状态：１、待打款　２、打款成功　３、打款失败　４、打款中
     * @param recieveState
     */
    public void setRecieveState(Boolean recieveState) {
        this.recieveState = recieveState;
    }

    /**
     * 获取同盾查询key
     * @return td_blackbox
     */
    public String getTdBlackbox() {
        return tdBlackbox;
    }

    /**
     * 设置同盾查询key
     * @param tdBlackbox
     */
    public void setTdBlackbox(String tdBlackbox) {
        this.tdBlackbox = tdBlackbox == null ? null : tdBlackbox.trim();
    }
}