package jw.usejni;

public class JniSample {
    public native int sum(int num1, int num2);

    /**
     * 1. 编写Java代码，注意native函数
     * 2. 产生头文件
     * cd /D D:\java-works\Mixed\src\main\java
     * javah -encoding utf-8 jw.usejni.JniSample get jw_usejni_JniSample.h
     *
     * 3.implements jw_usejni_JniSample.h using jw_usejni_JniSample.c
     *#javah -encoding utf-8 jw.usejni.JniSample
     * gcc  -I"C:\Program Files\Java\jdk-15.0.1\include" -I"C:\Program Files\Java\jdk-15.0.1\include\win32" jw_usejni_JniSample.c -o JniSample.dll
     *
     * @param args
     */
    public static void main(String[] args) {
        System.loadLibrary("JniSample");  //dll名字
        JniSample sample = new JniSample();
        int sum = sample.sum(5, 5);

        System.out.println("和: " + sum);

    }
}
