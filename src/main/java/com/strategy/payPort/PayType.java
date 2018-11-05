package com.strategy.payPort;

/**
 * 选择渠道类
 */
public enum  PayType {
    ALI_PAY(new Alipay()),
    JD_PAY(new JDpay());
    private Payment payment;

    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment get() {
        return this.payment;
    }
}
