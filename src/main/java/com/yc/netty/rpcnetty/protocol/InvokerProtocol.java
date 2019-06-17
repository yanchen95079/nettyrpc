package com.yc.netty.rpcnetty.protocol;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 自定义传输协议
 */
@Setter
@Getter
public class InvokerProtocol implements Serializable {

    private static final long serialVersionUID = 755035515317181200L;
    private String className;//类名
    private String methodName;//函数名称 
    private Class<?>[] parames;//形参列表
    private Object[] values;//实参列表

}
