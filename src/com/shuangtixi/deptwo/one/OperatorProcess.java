package com.shuangtixi.deptwo.one;
import java.util.*;
public class OperatorProcess {
    private Scanner sc = new Scanner(System.in);
    /**
     * 登录流程
     */
    public void login() {
        System.out.println("用户名：");
        String userName = sc.next();
        System.out.println("密码：");
        String password = sc.next();
        TUser u = new TUser(userName, password);
        // 调用判断用户是否存在的方法
        UserOpertor o = new UserOpertor();
        if(o.judgeUserExist(u)) {
            System.out.println("登录成功...");
        } else {
            System.out.println("登录失败...");
        }
    }
    /**
     * 注册流程
     */
    public void regist() {
        System.out.println("用户名：");
        String userName = sc.next();
        System.out.println("密码：");
        String password = sc.next();
        // 判断用户名是否可用
        UserOpertor o = new UserOpertor();
        if (o.judgeUserNameExist(userName)) {
            System.out.println("用户名已存在，不能注册...");
        } else {
            TUser user = new TUser(userName, password);
            // 可以做是否成功的判断
            o.addUser(user);
            System.out.println("用户注册成功...");
        }

    }
}


