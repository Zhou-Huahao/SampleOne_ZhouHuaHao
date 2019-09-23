package com.shuangtixi.deptwo.one;

import java.util.*;
class UserSystem {
    public static void main(String[] args) {
         UserSystem us = new UserSystem();
            us.startSystem();
        }

        public void startSystem() {
            boolean canContinue = true;
            Scanner sc = new Scanner(System.in);
            // 创建对象，调用登录、注册流程
            OperatorProcess op = new OperatorProcess();
            while (canContinue) {
                Menu.showMainMenu();
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        op.login();
                        break;
                    case 2:
                        op.regist();
                        break;
                    case 3:
                        canContinue = false;
                        System.out.println("你已经退出系统了...");
                        break;
                    default:
                        System.out.println("你输入的不正确...");
                        break;
                }
            }
        }

    }











