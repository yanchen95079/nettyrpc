package com.yc.netty.rpcnetty.provider;


import com.yc.netty.rpcnetty.api.IRpcHelloService;

public class RpcHelloServiceImpl implements IRpcHelloService {
    @Override
    public String hello(String name) {  
        return "Hello " + name + "!";  
    }  
  
}  
