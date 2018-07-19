package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //101至200之间有多少素数，并打印
        List<Integer> sushu = new ArrayList<>();
        int count=0;
        for (int i=101;i<=200;i++){
            if(i%2!=0 && i/2!=1)
                if(i%3!=0 && i/3!=1)
                    if (i%5!=0 && i/5!=1)
                        if (i%7!=0 && i/7!=1){
                            sushu.add(i);
                            count++;
                        }

        }
        System.out.print("101至200之间总共有"+count+"个素数，分别是：");
        for (int i=0;i<sushu.size()-1;i++){
            System.out.print(sushu.get(i)+"，");
        }
        System.out.print(sushu.get(sushu.size()-1));
    }
}
