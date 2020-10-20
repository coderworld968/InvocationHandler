package com.coderworld968.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceInvocationHandler implements InvocationHandler {

    private Object targetObject;

    public UserServiceInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("do something");
        Object result = method.invoke(targetObject, args);
        return result;
    }
}
