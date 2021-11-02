/**
 * Project name(项目名称)：Boolean类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/2
 * Time(创建时间)： 13:15
 * Version(版本): 1.0
 * Description(描述)：
 * Boolean 类的构造方法:
 * Boolean(boolean boolValue);
 * Boolean(String boolString);
 * boolean 类中的常用方法
 * 方法	返回值	功能
 * booleanValue()	boolean	将 Boolean 对象的值以对应的 boolean 值返回
 * equals(Object obj)	boolean	判断调用该方法的对象与 obj 是否相等。当且仅当参数不是 null，且与调用该
 * 方法的对象一样都表示同一个 boolean 值的 Boolean 对象时，才返回 true
 * parseBoolean(String s)	boolean	将字符串参数解析为 boolean 值
 * toString()	string	返回表示该 boolean 值的 String 对象
 * valueOf(String s)	boolean	返回一个用指定的字符串表示的 boolean 值
 * Boolean 类的常用常量
 * TRUE：对应基值 true 的 Boolean 对象。
 * FALSE：对应基值 false 的 Boolean 对象。
 * TYPE：表示基本类型 boolean 的 Class 对象。
 */

public class test
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("false");
        Boolean b4 = new Boolean("123");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b1.booleanValue());
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        Boolean b5 = Boolean.parseBoolean("true");
        System.out.println(b5);
        Boolean b6 = Boolean.parseBoolean("345");
        System.out.println(b6.toString());
        Boolean b7 = Boolean.valueOf("true");
        System.out.println(b7);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------

    }
}
