import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        //方法调用
        long result = getResult(10);
        System.out.println("result:"+result);
    }

    /**
     * 根据传入的maxN,计算1*2*..*max的值，并返回
     * @param maxN 最大累乘数
     * @return long 累乘的结果值
     *         or 0当maxN<1时，
     */
    static  long getResult(int maxN){
        if(maxN<1){
            return 0;
        }
        long result =1;
        for(int i=1;i<=maxN;i++){
            result = result*i;
        }
        return result;
    }
}


/* public static void main(String[] args) {
for (int i=1;i<=100;i++){
    System.out.println(

            i*i+1);
}

    }
}*/
  /*  for (int i=1;i<=9;i++)
    { for (int j=1;j<=i;j++)
    {        System.out.print(j+"*"+i+"="+i*j+"\t");}
        System.out.println();


    }}
   }


*/


    /*  int all = 0;
        for (int a=0;a<=100;a++){
            if (a%2==0) {
                all += a;
            }
        }
        System.out.println(all);

    }

*/
         /*    int all=0;
             int i=1;
             while (i<=100){
                 (i%2==0){
                     all+=i;
                 }
             i++;
             }
        System.out.println(all);


    }}*/
      /*  int all = 0;
        int i = 0;
        do {

            if (i % 2 == 0) {
                all += i;

            }
            i++;
        }


        while (i <= 100);

        System.out.println(all);

    }}*/