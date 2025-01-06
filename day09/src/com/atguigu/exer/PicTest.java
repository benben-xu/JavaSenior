package com.atguigu.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author JiaMing_Xu
 * @create 2025-01-06-15:04
 */
public class PicTest {

    //图片的加密
    @Test
    public void test1() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("test.png");
            fos = new FileOutputStream("test_secret.png");

            byte[] buf = new byte[1024];
            int len;
            while((len = fis.read(buf)) != -1){
                //字节数组进行修改
                for (int i = 0; i < len; i++) {
                    buf[i] = (byte) (buf[i] ^ 5);
                }
                fos.write(buf,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //图片的解密
    @Test
    public void test2() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("test_secret.png");
            fos = new FileOutputStream("test_secret1.png");

            byte[] buf = new byte[1024];
            int len;
            while((len = fis.read(buf)) != -1){
                //字节数组进行修改
                for (int i = 0; i < len; i++) {
                    buf[i] = (byte) (buf[i] ^ 5);
                }
                fos.write(buf,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
