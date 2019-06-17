package com.yc.netty.rpcnetty.consumer;


import com.yc.netty.rpcnetty.api.IRpcHelloService;
import com.yc.netty.rpcnetty.api.IRpcService;
import com.yc.netty.rpcnetty.consumer.proxy.RpcProxy;
import com.yc.netty.rpcnetty.provider.RpcHelloServiceImpl;

public class RpcConsumer {
	
    public static void main(String [] args){  
        IRpcHelloService rpcHello = new RpcHelloServiceImpl();
        
        System.out.println(rpcHello.hello("YC"));

        IRpcService service = RpcProxy.create(IRpcService.class);
        
        System.out.println("8 + 2 = " + service.add(8, 2));
        System.out.println("8 - 2 = " + service.sub(8, 2));
        System.out.println("8 * 2 = " + service.mult(8, 2));
        System.out.println("8 / 2 = " + service.div(8, 2));
    }
    
}
