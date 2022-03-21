package com.company;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Test {
    public static void main(String[] args) {
        String s1="sdfsaf";
        String s2="fsdafsdafsa";
        BASE64Decoder decoder=new BASE64Decoder();
        BASE64Encoder encoder=new BASE64Encoder();
        System.out.println(encoder.encode(s1.getBytes()));
        System.out.println(encoder.encode(s2.getBytes()));
    }
}
