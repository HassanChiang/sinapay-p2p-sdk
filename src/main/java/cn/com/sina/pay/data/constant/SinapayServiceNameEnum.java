package cn.com.sina.pay.data.constant;

public enum SinapayServiceNameEnum {
    //------------------------------------会员类服务----------------------------------
    /**
     * 创建激活用户
     */
    CREATE_ACTIVATE_MEMBER("create_activate_member", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 设置实名信息
     */
    SET_REAL_NAME("set_real_name", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 绑定认证信息
     */
    BINDING_VERIFY("binding_verify", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 查询认证信息
     */
    QUERY_VERIFY("query_verify", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 绑定银行卡信息
     */
    BINDING_BANK_CARD("binding_bank_card", SinapayServiceTypeEnum.MEMBER),
    /**
     * 查询银行卡
     */
    QUERY_BANK_CARD("query_bank_card", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 冻结余额
     */
    BALANCE_FREEZE("balance_freeze", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 冻结余额
     */
    BALANCE_UNFREEZE("balance_unfreeze", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 查询企业会员审核结果
     */
    QUERY_AUDIT_RESULT("query_audit_result", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 查托管退款
     */
    CREATE_HOSTING_REFUND("create_hosting_refund", SinapayServiceTypeEnum.MEMBER),
    
    /**
     * 托管退款查询
     */
    QUERY_HOSTING_REFUND("query_hosting_refund", SinapayServiceTypeEnum.ORDER),
    
    //------------------------------------订单类服务----------------------------------
    /**
     * 托管充值
     */
    CREATE_HOSTING_DEPOSIT("create_hosting_deposit", SinapayServiceTypeEnum.ORDER),
    /**
     * 托管提现
     */
    CREATE_HOSTING_WITHDRAW("create_hosting_withdraw", SinapayServiceTypeEnum.ORDER),
    /**
     * 托管提现查询
     */
    QUERY_HOSTING_WITHDRAW("query_hosting_withdraw", SinapayServiceTypeEnum.ORDER);
    
    private String name;
    private SinapayServiceTypeEnum type;
    
    SinapayServiceNameEnum(String name,SinapayServiceTypeEnum type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    
    public String getRequestUrl(){
        switch (this.type) {
        case MEMBER:
            return SinapayProperties.getMemberGateway();
        case ORDER:
            return SinapayProperties.getOrderGateway();
        default:
            return "";
        }
    }
}
