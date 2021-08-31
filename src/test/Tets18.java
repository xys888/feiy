package test;

import aes.AESUtil;

/**
 * @date 2021年08月30日17:57
 */
public class Tets18 {
    public static void main(String[] args) {
        String root = AESUtil.aesEncode("root");
        System.out.println(root);
        String s = AESUtil.aesDecode("rWd3Hb+AzNg3IXF1b5vD+g==");
        System.out.println("==============1");
        System.out.println(s);
        String passworld = AESUtil.aesEncode("123456");
        System.out.println("==============2");
        System.out.println(passworld);
    }
}
