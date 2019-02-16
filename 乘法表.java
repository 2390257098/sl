import java.util.Scanner;

public class 乘法表 {
    public static void main(String[] args){
        //乘法表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
       //矩形
       /*for (int z=1;z<=5;z++){
           for (int i=1;i<=5;i++){
               System.out.print("*");
           }
           System.out.println();
       }*/
       //平行四边形
       /* for (int z=1;z<=5;z++){
            for (int i=1;i<=5-z;i++){
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
       //三角形
       /* for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }for (int z=1;z<=i*2-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }*/
       //加法表
       /* Scanner input=new Scanner(System.in);
        System.out.println("输入一个数：");
        int num=input.nextInt();
        for (int i=0,j=num;i<=num&&j>=0;i++,j--){
            System.out.println(i+"+"+j+"="+num);
        }*/


       //倒三角数列
       /*Scanner input=new Scanner(System.in);
       System.out.println("输入一个数：");
       int num=input.nextInt();
       int a=1,b=2,c=1;
       int d,e;
       for (int i=num;i>=1;i--){
           d=a;
           e=b;
           for (int j=i;j>=1;j--){
               System.out.print(d +"\t");
               d+=e;
               e++;
           }
           System.out.println();
           a+=c;
           c++;
           b++;
       }*/
    }
}
