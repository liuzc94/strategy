package com.strategy.payPort;

/**
 * 支付渠道
 */
public interface Payment {
    //支付渠道
//    public final static Payment Alipay = new Alipay();
//    public final static Payment JDpay = new JDpay();
    public Paystate pay(String uid,String orderId,double mount);
}
