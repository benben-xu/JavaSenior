package com.atguigu.exer;

import org.junit.Test;

/**
 * @author JiaMing_Xu
 * @create 2024-11-25-21:19
 */
public class StringDemo2 {
    /*
    获取两个字符串中最大相同字串。比如：
    str1 = "abcwerthelloyuiodefabcdef";str2 = "cvhellobnmabcdf"
    提示：将短的那个字符串长度依次递减的子串与较长的串比较
     */
    //前提：两个字符串中只有一个最大相同字串
    public String getMaxSameString(String str1,String str2) {
        if (str1!=null&&str2!=null) {
            String maxString = (str1.length() >= str2.length()) ? str1 : str2;
            String minString = (str1.length() < str2.length()) ? str1 : str2;
            int lenghth = minString.length();
            for (int i = 0; i < lenghth; i++) {
                for (int x = 0, y = lenghth - i; y <= lenghth; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        return subString;
                    }
                }
            }
        }
        return null;
    }

    @Test
    public void testgetMaxSameString() {
        String str1 = "abcwerthello1yuiodefabcdef",str2 = "cvhello1bnmabcdef";
        String maxSameString = getMaxSameString(str1,str2);
        System.out.println(maxSameString);

    }
}
