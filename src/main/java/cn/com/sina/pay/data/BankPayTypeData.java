package cn.com.sina.pay.data;

import java.text.DecimalFormat;

import cn.com.sina.pay.data.bank.BankCardTypeEnum;
import cn.com.sina.pay.data.bank.BankCodeEnum;
import cn.com.sina.pay.data.bank.BankCardPropertiesEnum;

public class BankPayTypeData {
    private BankCodeEnum bankCode;
    private BankCardTypeEnum bankCardType;
    private BankCardPropertiesEnum bankCardProperties;
    private Double money;
    
    public BankPayTypeData(BankCodeEnum bankCode, BankCardTypeEnum bankCardType, BankCardPropertiesEnum bankCardProperties,Double money){
        this.bankCode = bankCode;
        this.bankCardType = bankCardType;
        this.bankCardProperties = bankCardProperties;
        this.money = money;
    }
    
    public String toString(){
        DecimalFormat format = new DecimalFormat("##.00");
        return "online_bank^" + format.format(money) + "^" + bankCode.name() + "," + bankCardType.name() + "," + bankCardProperties.name();
    }
}
