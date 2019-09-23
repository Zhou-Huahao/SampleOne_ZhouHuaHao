/*package com.shuangtixi.deptwo.one;
import java.util.*;
public class SampleOne_ZhouHuaHao {
            public static void main(String[] args) {
                List<Integer> list = new ArrayList<>();
                int username;
                Scanner sc = new Scanner(System.in);
                boolean canContinue = true;

                while (canContinue) {

                    System.out.println("1.注册 2.登录 3.退出");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("请输入要注册的用户名");
                            username = sc.nextInt();
                            list.add(username);
                            System.out.println("注册成功");
                            break;
                            case 2:
                            System.out.println("请输入用户名");
                            username = sc.nextInt();
                            for (int i = 0; i < list.size(); i++) {
                                if (username == list.get(i)) {
                                    System.out.println("登陆成功！");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("退出成功");
                            canContinue = false;
                            break;

                    }
                }
            }
        }
        /*模拟微信发红包过程，首先让用户输入红包个数n，输入红包总金额totalMoney，
        然后程序开始提示用户抢红包，每次 输入1则表示抢一个红包，红包金额随机，
        不能超过总金额，将抢到的金额存入数组记录。抢完最后一个红包之后，提示红包已经抢完，
        并且打印出每次抢到的红包金额，并提示第几个人为手气最佳。 */
  /*  Scanner in = new Scanner(System.in);
    System.out.println("请输入红包个数");
    double Number = in.nextDouble();
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入红包总金额");
    double Money = sc.nextDouble();
    System.out.println("请开始抢红包");
    int a = in.nextInt();
    if (a == 1) {
        for (int y = 0; y <= Number; y++) {
          for (Number){
              Random ran = new Random  ();
              // 3. 变量. 调用Random类中的功能,产生随机数
              // Random类中的,产生随机数的功能
              int i = ran.nextInt(200);
              System.out.println(i);
              //问题? 产生随机数,范围 1-200之间

              double d = ran.nextDouble();
              System.out.println(d);
          }
          int i=0;
          if (i <= Number)
                System.out.println(i);
            else
                y--;
        }
    }


}}


*/


       /* public static void register() {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入个人信息进行注册");
            for (int i = 0; i <= n; i++) {
                name[i] = sc.nextInt();
            }
            System.out.println("注册成功");
    }


}























       /* String[] nameMemory = new String[10];
        String[] passwordMemory = new String[nameMemory.length];
        boolean canContinue = true;
        int index = 0;
        while (canContinue) {
            System.out.println("1.注册\t2.登录\t3.退出");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    nameMemory = register(nameMemory, index);
                    passwordMemory = password(passwordMemory, index);
                    index++;
                    break;
                case 2:
                    System.out.println("请输入您的用户名称");
                    String name = sc.next();
                    int newIndex = 0;
                    while (newIndex < nameMemory.length) {
                        if (name.equals(nameMemory[newIndex])) {
                            System.out.println("请输入您的密码");
                            String password = sc.next();
                            if (password.equals(passwordMemory[newIndex])) {
                                System.out.println("登陆成功");
                                System.out.println("1.注销系统");
                                int newChoice = sc.nextInt();
                                if (newChoice == 1) {
                                    System.out.println("系统注销成功");
                                    break;
                                } else {
                                    System.out.println("您的输入出现错误，系统自动为您注销系统");
                                    System.out.println("系统注销成功");
                                    break;
                                }
                            } else {
                                System.out.println("密码输入错误");
                                break;
                            }
                        } else {
                            if (newIndex == nameMemory.length - 1) {
                                System.out.println("用户名称输入错误");
                                newIndex++;
                            } else
                                newIndex++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("系统已成功退出");
                    canContinue = false;
                    break;
                default:
                    System.out.println("您的输入出现错误，请重新输入：");
                    break;
            }
        }
    }

    public static String[] register(String[] nameMemory, int index) {
        System.out.println("请输入你的新用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        nameMemory[index] = name;
        return nameMemory;
    }

    public static String[] password(String[] passwordMemory, int index) {
        System.out.println("请输入你的新密码：");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        passwordMemory[index] = password;
        System.out.println("注册成功");
        return passwordMemory;
    }
    }
/*import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class SampleOne_ZhouHuaHao {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        startMean();
        list=secondMean();
    }

    public static ArrayList secondMean() {
        Scanner sc = new Scanner(System.in);
        //boolean canContinue = true;
        ArrayList list = new ArrayList();
       // while (canContinue) {
            System.out.println("请输入你想注册的用户信息");
            int choice = sc.nextInt();
            System.out.println("注册成功");
            list.add(choice);
         //   break;
      //  }
        return list;
    }


    public static void startMean() {
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        boolean conContinue = true;
        while (conContinue) {
            System.out.println("1.注册\n2.登录\n3.退出");
            int zero = sc.nextInt();
            switch (zero) {
                case 1:
                    secondMean();
                    break;
                case 2:
                    System.out.println("请输入账号信息");
                    String name=sc.next();
                    for (int i = 0; i < list.size(); i++) {
                        if (name.equals(list))
                            System.out.println("登陆成功");
                         else
                            System.out.println("信息错误，请重新登录");
                    }
            }

        }
    }
}



   /* writeArticle();
}
public static void writeArticle() {
        System.out.println("请输入你要输入几个标题");
        Scanner sc = new Scanner(System.in);
        int amout = sc.nextInt();
        String[] article = new String[amout];
        for (int i = 0; i < amout; i++){


        System.out.println("请输入标题");
        String title = sc.next();
        article[i] = title;
        }
        for (int i = 0; i < amout; i++){
        String title = article[i];
        if (title.length() > 10) {
        title = title.substring(0, 10);
        }
        System.out.println(title);
        }
        }
*/









































    /*   double[] result = new double[5];
    System.out.println("请输入五位同学的成绩");
    for (int i = 0; i <5; i++) {
        Scanner in = new Scanner(System.in);

    result[i]= in.nextDouble();
}


    int max=0;

     for (int i=0;i<result.length;i++) {
     if (result[max]<result[i])
        max=i;

    }
         System.out.println("最大值为"+result[max]);
         double sum=0;
         for(int index=0;index<result.length;index++)
         sum=sum+result[index];
         double average=sum/result.length;
         System.out.println();
    }


}
*/




    /*
        for(int i=0;i<10;i++){
        int sum=3;
        }

        System.out.println(i+"  "+sum);


        }}
*/


/*
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import javax.print.DocFlavor;
import java.util.Scanner;

public class SampleOne_ZhouHuaHao {
    public static void main(String[] args) {*/

   /*
    身高体重指数（又称身体质量指数，英文为Body Mass Index，简称BMI）是一个计算值，主要用于统计用途。
当我们需要比较及分析一个人的体重对于不同高度的人所带来的健康影响时，BMI值是一个中立而可靠的指标。
BMI指数是一个用高度及重量，计算出是否正常、超重及肥胖。
体质指数（BMI）=体重（kg）÷ 身高^2（m）
成人BMI数值
轻体重：BMI<18.5
健康体重：18.5<=BMI<24
超重：24<=BMI<28
肥胖：28<=BMI
最理想的体重指数是22
要求：
1.画出流程图；
2.用户从键盘输入体重和身高，程序输出轻体重、健康体重、超重和肥胖中的一个结果；
3.作业小组内部评审，都做好了组长通知我随机检查。

    */

/*

         Scanner in =new Scanner(System.in);//输入方法
         System.out.print("请输入体重");
         double weight=in.nextDouble();//输入体重
         System.out.print("请输入身高");
         double height=in.nextDouble();//输入升高
         double BMI=weight/Math.pow(height,2);//进行运算，计算出BMI
         if (BMI<18.5)//进行循环，输出结果
         System.out.println("您的体重为：轻体重");
         else if(BMI>=18.5 && BMI<24)
             System.out.println("您的体重为；健康体重");
         else if(BMI>=24&&BMI<28)
             System.out.println("你的体重为；超重");
             else if (BMI>=28)
             System.out.println("您的体重为：肥胖");


*/
/*import java.util.Scanner;
        public class SampleOne_ZhouHuaHao {
            public static void main(String[] args) {
                show1Menu();
            }
            public static void show1Menu()
            {
                Scanner sc = new Scanner(System.in);
                boolean canContinue = true;
                while (canContinue)
                {
                    System.out.println("1：登录\t2：退出\t3：注册");
                    int choice = sc.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("登录成功");
                            show2Menu();
                            break;
                        case 2:
                            canContinue = false;
                            System.out.println("你已经退出程序...");
                            break;
                        case 3:
                            System.out.println("注册成功");
                            break;
                        default:
                            System.out.println("你输入的不正确...");
                            break;
                    }                }

            }
            public static void show2Menu()
            {
                Scanner sc = new Scanner(System.in);
                double money = 5000;
                boolean canContinue = true;
                while (canContinue) {
                    System.out.println("1：取款\t2：存款\t3：查看余额\t4：退出");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("请输入你要取款的金额:");
                            double withdrawMoney = sc.nextDouble();
                            if (money >= withdrawMoney) {
                                money -= withdrawMoney;
                                System.out.println("取款成功...");
                            } else {
                                System.out.println("余额不足");
                            }
                            break;
                        case 2:
                            System.out.println("请输入你要存的金额：");
                            double depositMoney = sc.nextDouble();
                            money += depositMoney;
                            System.out.println("存款成功...");
                            break;
                        case 3:
                            System.out.println("你的余额为：" + money);
                            break;
                        case 4:
                            canContinue = false;
                            System.out.println("你已经退出程序...");
                            break;
                        default:
                            System.out.println("你输入的不正确...");
                            break;
                    }
                }
            }
        */