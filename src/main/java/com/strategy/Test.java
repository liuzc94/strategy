package com.strategy;

import com.strategy.payPort.Alipay;
import com.strategy.payPort.PayType;
import com.strategy.payPort.Payment;

/**
 * 策略模式
 * 条条大路通罗马
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","20181104",245.52);
        //这种需要在客户端new 对象
        //order.pay(new Alipay());
        //每次增加支付渠道，就要去维护接口类
//        order.pay(Payment.JDpay);
          order.pay(PayType.JD_PAY);
    }

}
