package com.step.dubbo.client;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.step.dubbo.server.MyService;

public class ClientMain {
	
	//Log4j的日志基本配置（要使用这种方式首先引入log4j的支持）
    static {
        BasicConfigurator.configure();
    }
    
    public static String path="application-client.xml";

    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
    	ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{path});
        // 开始RPC调用
       MyService myService = (MyService)app.getBean("MyServiceImpl");
       System.out.println(myService.doMyTest("123rrr", "345"));
       while(true){
			if(!app.isActive()){
				app.start();
			}
		}
    }

}
