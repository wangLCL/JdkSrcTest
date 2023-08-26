package kw.jdk.test;

import org.junit.Test;

public class IntergerTest {

    /**
     * 原始数据类型
     */
    @Test
    public void typeTest(){
        System.out.println(Integer.TYPE);
    }

    /**
     * 指定进制
     */
    @Test
    public void toStringTest(){
        int num = 101;
        System.out.println(Integer.toString(num, 3));
        myToString(101,3);
    }

    /**
     * 求进制的方法
     * @param num
     * @param radix
     */
    public void myToString(int num,int radix){
        StringBuilder builder = new StringBuilder();
        while (num > 0){
            int i = num % radix;
            builder.insert(0,i);
            num = num / radix;
        }
        System.out.println(builder.toString());
    }

    @Test
    public void decodeTest(){
        String num = "-0x188";
        System.out.println(Integer.decode(num));
    }

    @Test
    public void stringC(){
        Integer.parseInt("101",10);
    }
    @Test
    public void stringTest(){
        String str = "-0x188";
        System.out.println(str.startsWith("0x"));
        stringConvertNum(str);

    }

    public void stringConvertNum(String num){
        if (num.length() <= 0) {
            return;
        }
        int index = 0;
        boolean negative = false;
        int radix = 10;
        /**
         * 判断正负
         */
        char c = num.charAt(index);
        if (c == '-'){
            negative = true;
            radix = 10;
            index ++;
        }
        if (c == '+'){
            radix = 10;
            index ++;
        }
        if (num.startsWith("0x",index)){
            radix = 16;
            index+=2;
        }else if (num.startsWith("#")){
            radix = 16;
            index++;
        }
        //截取
        String substring = num.substring(index, num.length());
        System.out.println(substring);
        Integer integer = Integer.valueOf(substring,radix);
        System.out.println(integer);
    }

    @Test
    public void numSize(){
        final int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE };
        int num = 19;
        int wei = 0;
        for (int i : sizeTable) {
            wei ++;
            if (num <= i){
                break;
            }
        }
        System.out.println(wei);
    }


//    @Test
//    public void integerEquealTest(Object obj){
//        if (obj instanceof Integer) {
//            int value = ((Integer) (obj)).intValue();
////            当前值和value比较
//        }else {
//            //false
//        }
//    }

    @Test
    public void integerHashCode(){
        Integer integer = new Integer(29);
        System.out.println(integer.hashCode()); //hashcode竟然是自己的值
    }
}
