package com.step.dubbo.server;

import org.springframework.stereotype.Service;

@Service("MyServiceImpl")
public class MyServiceImpl implements MyService {

	public String doMyTest(String field1, String field2) {
		System.out.println(field1+","+field2);
		return field1 + field2;
	}


}
