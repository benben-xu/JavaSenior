package com.atguigu.java;

/**
 * 使用enum关键字定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 *
 * @author JiaMing_Xu
 * @create 2024-12-02-20:24
 */
public class SeasonTest1 {
    public static void main(String[] args) {
//        System.out.println(Season1.SUMMER.toString());
//        System.out.println(Season1.class.getSuperclass());

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);

        winter.show();



    }

}
interface Info{
    void show();
}
enum Season1 implements Info{
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("冬天到了");
        }
    };
    private final String seasonName;
    private final String seasonDesc;
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4. 其他诉求2：提供toString()
//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }


    @Override
    public void show() {
        System.out.println("实现接口");
    }
}