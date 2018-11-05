package com.strategy;

import com.strategy.payPort.PayType;
import com.strategy.payPort.Payment;
import com.strategy.payPort.Paystate;

public class Order {
    //用户id
    private String uid;
    //订单id
    private String orderId;
    //交易金额
    private double mount;

    public Order(String uid, String orderId, double mount) {
        this.uid = uid;
        this.orderId = orderId;
        this.mount = mount;
    }

//    public Payment pay(Payment payment){
//        return  payment.pay(uid,orderId,mount);
//    }


    public Paystate pay(PayType payType) {
        Payment payment = payType.get();
        return payment.pay(uid, orderId, mount);
    }
}
