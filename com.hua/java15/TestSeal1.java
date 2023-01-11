package com.hua.java15;

public final class TestSeal1 extends TestSeal {

    public String method() {
        record TestRecord(String random) {
        }

        return new TestRecord("15").random();

    }
}
