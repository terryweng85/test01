package com.huawei.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestStudent {
    @Test
    public void test() throws Exception {
       Class c = Student.class;
//       Constructor[] constructors = c.getDeclaredConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor.getName() + " 参数个数：" + constructor.getParameterCount());
//        }
        Constructor cons = c.getDeclaredConstructor(String.class,int.class,long.class,String.class,String.class);
        cons.setAccessible(true);
        Student s1 = (Student) cons.newInstance("翁语晗",3,001,"玖龙台幼儿园","小一班");
        System.out.println(s1);

//        Field[] fields = c.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println("成员变量名称：" + field.getName() + " 成员变量类型：" + field.getType());
//        }
        Field field = c.getDeclaredField("age");
        field.setAccessible(true);
        field.set(s1,4);
        System.out.println(s1);

//        Method[] methods = c.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("方法名称：" + method.getName() + " 返回值类型：" + method.getReturnType() + " 入参类型：" + method.getParameterCount());
//        }
        Method method_exam = c.getDeclaredMethod("exam");
        Method method_homework = c.getDeclaredMethod("homework");
        Object me=method_exam.invoke(s1);
        Object mh=method_homework.invoke(s1);

        System.out.println(me);
        System.out.println(mh);


    }

}
