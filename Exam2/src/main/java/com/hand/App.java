package com.hand;

/**
 * Hello world!
 *
 */

class Calculate {

    public static Calculate Cal = new Calculate() ;

    private Calculate() {

    }

    public double CalMoney(double sumMoney){

        double shuiMoney;
        if (sumMoney<=1500&&sumMoney>0){
            shuiMoney=sumMoney*0.03;

        }else if (sumMoney<=4500){
            shuiMoney=sumMoney*0.1;

        }else if (sumMoney<=9000){
            shuiMoney=sumMoney*0.2;

        }else if (sumMoney<=35000){
            shuiMoney=sumMoney*0.25;

        }else if (sumMoney<=55000){
            shuiMoney=sumMoney*0.3;

        }else if (sumMoney<=80000){
            shuiMoney=sumMoney*0.35;

        }else {

            shuiMoney=sumMoney*0.45;
        }
        return shuiMoney;
    }

}
public class App 
{
    public static void main( String[] args )
    {
        User userA = new User("userA", 5000);
        User userB = new User("userB", 10000);
        User userC = new User("userC", 15000);
        User userD = new User("userD", 60000);
        userA.setShuiMoney(Calculate.Cal.CalMoney(userA.getSumMoney()));
        userB.setShuiMoney(Calculate.Cal.CalMoney(userB.getSumMoney()));
        userC.setShuiMoney(Calculate.Cal.CalMoney(userC.getSumMoney()));
        userD.setShuiMoney(Calculate.Cal.CalMoney(userD.getSumMoney()));
        System.out.println("userA需缴纳税费:"+userA.getShuiMoney());
        System.out.println("userB需缴纳税费:"+userB.getShuiMoney());
        System.out.println("userC需缴纳税费:"+userC.getShuiMoney());
        System.out.println("userD需缴纳税费:"+userD.getShuiMoney());

    }
}
