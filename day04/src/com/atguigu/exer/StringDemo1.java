package com.atguigu.exer;

import org.junit.Test;

/**
 * @author JiaMing_Xu
 * @create 2024-11-25-20:43
 */
public class StringDemo1 {
    /*
    获取一个字符串在另一个字符串中出现的次数。
        比如：获取“ab”在“abkkcadkakebfkabkskab”中出现的次数。
     */

    /**
     * 获取subStr在mainStr中出现的次数
     * @param mainstr
     * @param subStr
     * @return
     */
    public int getCount(String mainstr,String subStr){
        int mainLength = mainstr.length();
        int subLength = subStr.length();
        int count = 0;
        int index=0;
        if(mainLength >= subLength){
            //方式一：
//            while ((index = mainstr.indexOf(subStr)) != -1){
//                count++;
//                mainstr = mainstr.substring(index + subStr.length());
//            }
            //方式二：对方式一的改进
            while ((index = mainstr.indexOf(subStr,index)) != -1){
                count++;
                index+=subLength;
            }

                return count;
        }else{
            return 0;
        }
    }

    @Test
    public void testGetCount(){
        String mainstr = "abkkcadkakebfkabkskab";
        String subStr = "ab";
        System.out.println(getCount(mainstr,subStr));
    }


}
