package kw.jdk.test.refl;

public class Fanshe {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        System.out.println(String.format("类名：%s%n",stringClass.getName()));
        System.out.println(String.format("是否是接口：%s%n",stringClass.isInterface()));
        System.out.println(String.format("是否是基本数据类型：%s%n",stringClass.isPrimitive()));
        System.out.println(String.format("是否为数组：%s%n",stringClass.isArray()));
        System.out.println(String.format("父类名称：%s%n",stringClass.getSuperclass().getName()));
//        System.out.println(String.format("所在模块名：%s%n",stringClass.getModule().getName())); //jdk9加的

    }
}
