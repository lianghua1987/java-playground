package com.hua.test;


class ServiceA {

    public static final String MSG = "hua test";

    ServiceB b;
    ServiceC c;
    ServiceD d;

    public ServiceA(ServiceB b, ServiceC c, ServiceD d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String callMethodB() {
        return b.method(MSG);
    }

    public String callMethodC() {
        return c.method();
    }

    public String callMethodD(String str) {
        return ServiceD.method(str);
    }
}

