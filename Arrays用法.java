import java.util.Arrays;
public class Arrays用法 {
    public static void main(String[] args) {

        int[] score1 = {78, 78, 46, 56, 87, 96};
        int[] score2 = {8, 4, 2, 1, 12, 344, 23};
        int[] score3={1,23,3};

        //数组间互相赋值
        score3=score1;
        for (int i:score3){
            System.out.print(i+"\t");
        }
        System.out.println();

        //数组内数据排序
        Arrays.sort(score1);
        for (int a : score1) {
            System.out.print("\t" + a);
        }

        //比较两个数组是否相等
        boolean b = Arrays.equals(score1, score2);
        System.out.println("\n"+b);

        //数组转化字符串
        String c = Arrays.toString(score1);
        System.out.println(c);

        //把数组中元素全部赋值为另一个数
        Arrays.fill(score1,90);
        for (int d:score1){
            System.out.print("\t"+d);
        }
        //查询元素值*在数组中的下标
        int e=Arrays.binarySearch(score1,90);
        System.out.println("\n"+e);

        //把数组复制成一个长度为length的新数组，返回类型与复制的数组一致
        int asd[];
        asd=Arrays.copyOf(score2,6);
        for(int f:asd){
            System.out.print("\t"+f);
        }

    }
}

