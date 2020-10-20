package com.coderworld968.invocation;

import java.lang.reflect.Proxy;

public class MAIN {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		InterceptorChain chain = new InterceptorChain();
		chain.addInterceptor(new LogInterceptor());
		chain.addInterceptor(new Log2Interceptor());
		UserService service = new UserServiceImpl();
		UserService object = (UserService) chain.pluginAll(service);
		object.addUser();
	}

	private static void test1() {
		UserService targetObject = new UserServiceImpl();
		UserServiceInvocationHandler proxy = new UserServiceInvocationHandler(targetObject);
		UserService object = (UserService) Proxy.newProxyInstance(targetObject
				.getClass().getClassLoader(), targetObject.getClass()
				.getInterfaces(), proxy);
		object.addUser();
	}
}