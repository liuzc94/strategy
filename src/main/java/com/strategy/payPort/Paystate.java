package com.strategy.payPort;


public class Paystate {
    private String code;
    private  double mount;
    private  String msg;

    public Paystate(String code, Object date, String msg) {
        this.code = code;
        this.mount = mount;
        this.msg = msg;
    }

    public  String toString(){
        return ("支付状态" + code + "支付数据：" + mount + "支付信息:" + msg);
    }
}
