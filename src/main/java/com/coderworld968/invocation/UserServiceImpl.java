package com.coderworld968.invocation;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }

    public void addUser() {
        System.out.println("this is addUser() method!");
    }

    @Override
    public String toString() {
        return "UserServiceImpl{}";
    }
}