package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = new ArrayList<>();
        int temp;
        for (int i=0;i<50;i++){
            temp=(int)Math.random()*99+0;
            list.add(temp);
        }
        Map<Integer,Integer[]> hashMap = new HashMap<>();
        for (int i=0;i<list.size();i++){
            if(list.get(i)/10==1){

            }
        }
    }
}