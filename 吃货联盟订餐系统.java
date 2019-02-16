

import java.util.Scanner;

public class 吃货联盟订餐系统 {
    public static void main(String[] args) {

        String[] names=new String[4];//保存姓名
        String[] dishMegs=new String[4];//菜品信息
        int[] times=new int[4];//时间
        String[] addresses=new String[4];//地址
        int[] states=new int[4];//状态
        double[] sumPrices=new double[4];//总价

        String[] dishNames={"红烧带鱼","鱼香肉丝","时令鲜蔬"};//菜品
        double[] prices=new double[]{38.0,20.0,10.0};//单价
        int[] praiseNums=new int[3];//点赞编号

        Scanner input = new Scanner(System.in);
        int num=1;
        boolean isExit=false;//标记是否退出系统，ture为退出系统
        System.out.println("\n欢迎使用“吃货联盟定餐系统”");
        do{
            System.out.println("********************************");
            System.out.println("1、我要定餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("*********************************");
            System.out.println("请选择：");
            int choose=input.nextInt();
            switch (choose){
                case 1:
                    for (int i=0;i<names.length;i++){
                    System.out.println("我要订餐");
                    System.out.println("请输入订餐人姓名：");
                    String name=input.next();
                    System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
                    for(int j=0;j<dishNames.length;j++) {
                        String price = prices[j] + "元";
                        String priaiseNum = (praiseNums[j]) > 0 ? praiseNums[j] + "赞" : "0";
                        System.out.println((j + 1) + "\t" + dishNames[j] + "\t" + price + "\t" + priaiseNum);
                    }

                        System.out.println("请选择您要点的菜品编号：");
                        int chooseDish=input.nextInt();
                        System.out.println("请选择您需要的份数：");
                        int number=input.nextInt();
                        String dishMeg=dishNames[chooseDish-1]+" "+number+"份";
                        double sumPrice=prices[chooseDish-1]*number;
                        double extraprice=(sumPrice>=50)?0:6;//判断是否需要送餐费
                        System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
                        int time=input.nextInt();
                        while (time<10||time>20) {
                            System.out.println("您的输入有误，请输入10——20间的整数！");
                            time=input.nextInt();
                        }
                        System.out.println("请输入送餐地址：");
                        String address=input.next();
                        //无需添加状态，默认为0，已预订
                        System.out.println("订餐成功！");
                        System.out.println("您订购的是："+dishMeg);
                        System.out.println("送餐时间："+time+"点'");
                        System.out.println("餐费："+sumPrice+"元，送餐费"+extraprice+"元，总计："+(sumPrice+extraprice)+"元");
                        //赋值
                        names[i]=name;
                        dishMegs[i]=dishMeg;
                        times[i]=time;
                        addresses[i]=address;
                        sumPrices[i]=sumPrice+extraprice;
                        break;
                    }
                    break;
                case 2:
                    System.out.println("查看餐袋");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t\t送餐地址\t\t总金额\t订单状态");
                    //遍历输出
                    for(int i=0;i<names.length;i++){
                        if(names[i]!=null){
                            String state=(states[i]==0)?"已预订":"已完成";//判断状态
                            String time=times[i]+"：00";
                            String sumPrice=sumPrices[i]+"元";
                            System.out.println((i+1)+"\t"+names[i]+"\t\t"+dishMegs[i]+"\t\t"+time+"\t\t"+addresses[i]+"\t\t"+sumPrice+"\t\t"+state);
                        }
                    }
                    break;
                case 3:
                    System.out.println("签收订单");
                    boolean isSign =false;//找到要签收的订单
                    System.out.println("请选择要签收的订单序号：");
                    int signOrderNo=input.nextInt();
                    for(int i=0;i<names.length;i++){
                        //状态为已预订，序号为用户输入的订单序号-1，可以签收
                        //状态为已签收，序号为用户输入的订单序号-1，不可签收
                        if(names[i]!=null&&states[i]==0&&signOrderNo==i+1){
                            states[i]=1;
                            System.out.println("订单签收成功！");
                            isSign=true;//标记已经找到此订单
                        }else if(names[i]!=null&&states[i]==1&&signOrderNo==i+1){
                            System.out.println("您选择的订单已完成签收，不能再次签收！");
                            isSign=true;//标记已经找到此订单
                        }
                    }
                    //未找到的订单序号，不可签收
                    if(!isSign){
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    System.out.println("删除订单");
                    boolean isDelFind=false;//标记是否找到要删除的订单
                    System.out.println("请输入要删除的订单序号：");
                    int delNo=input.nextInt();
                    for(int i=0;i<names.length;i++){
                        //状态值为已完成，序号值为用户输入的序号-1,：可删除
                        //状态值为已预订：不可删除
                        if(names[i]!=null&&states[i]==1&&delNo==i+1){
                            isDelFind=true;//标记找到此订单
                            //执行删除操作：元素前移
                            for(int j=delNo-1;j<names.length-1;j++){
                                names[j]=names[j+1];
                                dishMegs[j]=dishMegs[j+1];
                                times[j]=times[j+1];
                                addresses[j]=addresses[j+1];
                                states[j]=states[j+1];
                                sumPrices[j]=sumPrices[j+1];
                            }
                            System.out.println("删除订单成功！");
                            break;
                        }else if(names[i]!=null&&states[i]==0&&delNo==i+1){
                            System.out.println("您选择的订单未签收，不能删除！");
                            isDelFind=true;
                            break;
                        }
                    }
                    //未找到该序号的订单，不能删除
                    if(!isDelFind){
                        System.out.println("您要删除的订单不存在！");
                    }
                    break;
                case 5:
                    System.out.println("我要点赞");
                    System.out.println("序号"+"\t"+"菜品"+"\t"+"单价");
                    for(int i=0;i<dishNames.length;i++){
                        String price=prices[i]+"元";
                        String priaiseNum=(praiseNums[i])>0?praiseNums[i]+"赞":"";
                        System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t");
                    }
                    System.out.println("请选择您要点赞的菜品序号：");
                    int priaiseNum=input.nextInt();
                    praiseNums[priaiseNum-1]++;//点赞数+1
                    System.out.println("点赞成功！");
                    break;
                case 6:
                    //退出系统
                    isExit=true;
                    System.out.println("谢谢使用，欢迎下次光临");
                default:
                    //退出系统
                    isExit=true;
                    break;
            }
            if(!isExit){
                    System.out.println("输入0返回：");
                    num=input.nextInt();
                }else{
                    break;
            }
        }while (num==0);
    }
}
