import java.util.Scanner;

public class 菱形 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        do {
            System.out.println("输入菱形的高度：");
            num=input.nextInt();
            if (num%2==0){
                System.out.println("请输入奇数：");
            }
        }while (num%2==0);
        for (int i=1;i<=num/2+1;i++){
            for (int j=(num/2+1)-i;j>0;j--){
                System.out.print(" ");
            }
            for (int z=1;z<=2*i-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=num/2;i>=1;i--){
            for (int j=0;j<(num/2+1)-i;j++){
                System.out.print(" ");
            }
            for (int z=2*i-1;z>=1;z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
