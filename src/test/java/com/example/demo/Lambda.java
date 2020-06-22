package com.example.demo;

/**
 * @ClassName Lambda
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/22 11:28
 * @Version 1.0
 */

public class Lambda {
    /** 多参数无返回 */
    @FunctionalInterface
    public interface NoReturnMultiParam {
        void method(int a, int b);
    }

    /** 无参无返回值 */
    @FunctionalInterface
    public interface NoReturnNoParam {
        void method();
    }

    /** 一个参数无返回 */
    @FunctionalInterface
    public interface NoReturnOneParam {
        void method(int a);
    }

    /** 多个参数有返回值 */
    @FunctionalInterface
    public interface ReturnMultiParam {
        int method(int a, int b);
    }

    /*** 无参有返回 */
    @FunctionalInterface
    public interface ReturnNoParam {
        int method();
    }

    /** 一个参数有返回值 */
    @FunctionalInterface
    public interface ReturnOneParam {
        int method(int a);
    }

    public static void main(String[] args) {

        // 1.简化参数类型，可以不写参数类型，但是必须所有参数都不写
        NoReturnMultiParam lamdba1 = (a, b) -> {
            System.out.println("简化参数类型");
        };
        lamdba1.method(1, 2);

        // 2.简化参数小括号，如果只有一个参数则可以省略参数小括号
        NoReturnOneParam lambda2 = a -> {
            System.out.println("简化参数小括号");
        };
        lambda2.method(1);

        // 3.简化方法体大括号，如果方法条只有一条语句，则可以胜率方法体大括号
        NoReturnNoParam lambda3 = () -> System.out.println("简化方法体大括号");
        lambda3.method();

        // 4.如果方法体只有一条语句，并且是 return 语句，则可以省略方法体大括号
        ReturnOneParam lambda4 = a -> a + 3;
        System.out.println(lambda4.method(5));

        ReturnMultiParam lambda5 = (a, b) -> a + b;
        System.out.println(lambda5.method(1, 1));
    }
}