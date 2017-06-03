package com.ayd.criss.slg.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public class Test {

    public static String testStr = "aa a";

    public static String test1(String str) {
        ArrayList<Integer> indexs = new ArrayList<Integer>();

        String[] split = testStr.split(" ");
        List<String> strs = Arrays.asList(split);
        for (int i = 0; i < strs.size(); i++) {
            for (int j = strs.size()-1; j > i; j--) {
                if (strs.get(i).equals(strs.get(j))) {
                    indexs.add(i);
                    indexs.add(j);
                }
            }
        }

        for(Integer i : indexs) {
            if(i != null){
                if(strs.get(i) != null && strs.get(i) != ""){
                    strs.set(i, "");
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(String s : strs ){
            stringBuffer.append(s + " ");

        }
        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        System.out.println(test1(testStr));
    }


}
