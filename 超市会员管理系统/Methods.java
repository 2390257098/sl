package 超市会员管理系统;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {
    Scanner input=new Scanner(System.in);
    Map<String,Users> map=new HashMap();
    Users users1=new Users("12345","1234lhb",100);


    String user=null;
    public void denglu(){//登录方法
        map.put("12345",users1);

        System.out.println("请选择：1.登陆/2.注册");
        int num=input.nextInt();
        switch (num) {
            case 1:
                boolean y = false;
                while (!y) {
                    System.out.println("输入您的账号：");
                     user= input.next();
                    if (user.equals(map.get(user).getId())) {
                        System.out.println("输入密码：");
                        String password = input.next();
                        if (password.equals(map.get(user).getPassword())) {
                            System.out.println("登陆成功");
                            System.out.println("当前登陆账号为："+map.get(user).getId());
                            y= true;
                            break;
                        } else {
                            System.out.println("密码错误，请重新输入");
                            continue;
                        }
                    } else {
                        System.out.println("此用户不存在,请先注册后登陆");
                        continue;
                    }
                }

                break;
            case 2:
                System.out.println("编写用户名：");
                String ID=input.next();
                System.out.println("输入密码");
                String password1=input.next();
                System.out.println("请再次输入密码：");
                String password2=input.next();
                if (password1.equals(password2)){
                    /*cunfang();*/
                    Users users2=new Users(ID,password2,0);
                    map.put(ID,users2);
                    System.out.println("注册成功！"+
                    "\n您的账号为"+ID+",密码是"+password2);
                    denglu();
                }else {
                    System.out.println("注册不成功，请重新注册");
                    denglu();
                }
                break;

        }
        }

    public void choose(){//选择操作

        boolean exit=false;
        do {
            System.out.println("当前登陆账号为："+map.get(user).getId());
                System.out.println("请选择：" +
                        "\n1.查询积分" +
                        "\n2.积分兑换" +
                        "\n3.查询剩余积分" +
                        "\n4.修改密码" +
                        "\n5.开卡" +
                        "\n6.退出");
                int choosenum = input.nextInt();
                switch (choosenum) {
                    case 1:
                        System.out.println("当前登陆账号为："+map.get(user).getId());
                        for (String m:map.keySet()){
                            System.out.println("消费金额和积分比例为10:1");
                            System.out.println("输入此次消费总金额：");
                            int sum=input.nextInt();
                            map.get(m).setJifen(map.get(m).getJifen()+sum/10);
                            System.out.println("您的积分剩余为：" +map.get(m).getJifen() );
                        }
                        break;
                    case 2:
                        System.out.println("当前登陆账号为："+map.get(user).getId());
                        if (map.get(user).getJifen()>40){
                            System.out.println("您的积分可兑换商品如下：请选择" +
                                    "\n1.汰渍洗衣液2L袋装-------------50积分" +
                                    "\n2.开水壶--------------80积分" +
                                    "\n3.沙琪玛10块-------------40积分"+
                                    "\n0.不兑换");
                            int choosenum2 = input.nextInt();
                            switch (choosenum2) {
                                case 1:
                                    System.out.println("兑换成功");
                                    map.get(user).setJifen(map.get(user).getJifen()-50);
                                    break;
                                case 2:
                                    System.out.println("兑换成功");
                                    map.get(user).setJifen(map.get(user).getJifen()-80);
                                    break;
                                case 3:
                                    System.out.println("兑换成功");
                                    map.get(user).setJifen(map.get(user).getJifen()-40);
                                    break;
                                case 0:
                                    System.out.println("未兑换");
                                    break;
                            }
                        }else{
                            System.out.println("您的积分不足，无法兑换，请继续努力");
                        }

                        break;
                    case 3:
                        System.out.println("当前登陆账号为："+map.get(user).getId());
                        System.out.println("剩余积分为：" + map.get(user).getJifen());
                        break;
                    case 4:
                        System.out.println("当前登陆账号为："+map.get(user).getId());
                        System.out.println("当前账号密码为："+map.get(user).getPassword());
                        System.out.println("请输入旧密码：");
                        String old = input.next();
                        System.out.println("旧密码："+map.get(user).getPassword());
                        if (old.equals(map.get(user).getPassword())) {
                            System.out.println("输入新密码:");
                            String new1 = input.next();
                            System.out.println("请再次输入新密码：");
                            String new2 = input.next();
                            if (new1.equals(new2)) {
                                map.get(user).setPassword(new1);
                                System.out.println("密码修改成功，请牢记新密码，新密码为"+map.get(user).getPassword());
                            } else {
                                System.out.println("请重新输入");
                            }
                        } else {
                            System.out.println("无权限修改密码");
                        }
                        break;
                    case 5:
                        System.out.println("当前登陆账号为："+map.get(user).getId());
                        System.out.println();
                        break;
                    case 6:
                        exit=true;
                        System.out.println("已退出，谢谢使用");
                        break;
                }
        }while (!exit);
    }
    }

