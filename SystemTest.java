package practise02;

import java.util.Arrays;

public class SystemTest{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {2,3,4,5,6,7,8};
        System.arraycopy(a, 3, b, 3, 4);
        System.out.println(Arrays.toString(b));
        System.out.println("Java∞Ê±æ–≈œ¢£∫"+System.getProperty("java.version"));
    }
}