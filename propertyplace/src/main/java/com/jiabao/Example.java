package com.jiabao;

import org.springframework.stereotype.Component;

/**
 * @author majiabao on 2018/1/19.
 */
@Component
public class Example {
    private String name;
    private String zkAddress = "${common.zookeeper.address}";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZkAddress() {
        return zkAddress;
    }

    public void setZkAddress(String zkAddress) {
        this.zkAddress = zkAddress;
    }
}
