package org.xjc.demo.starter.service;

/**
 * 需要自动装配的服务类,对外提供服务
 * <p>
 *
 * @author xjc
 * @date 2018-12-20
 */
public class StarterService {

    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return config.split(separatorChar);
    }

}
