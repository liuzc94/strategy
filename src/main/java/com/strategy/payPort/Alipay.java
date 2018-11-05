package com.strategy.payPort;

public class Alipay implements Payment{
    public Paystate pay(String uid, String orderId, double mount) {
        System.out.println("欢迎使用支付宝支付");
        System.out.println("查询账户余额，开始扣款");
        return new Paystate(uid,mount,"付款成功");
    }
}
