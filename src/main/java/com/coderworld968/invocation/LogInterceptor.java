package com.coderworld968.invocation;

public class LogInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println(Thread.currentThread().getName()+ "\tlog intercept..."+ invocation.toString());
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
}
