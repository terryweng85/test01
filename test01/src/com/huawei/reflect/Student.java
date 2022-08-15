package com.huawei.reflect;

public class Student {
    private String name;
    private int age;
    private long studentid;
    private String School;
    private String classRoom;

    public Student() {
    }

    private Student(String name, int age, long studentid, String school, String classRoom) {
        this.name = name;
        this.age = age;
        this.studentid = studentid;
        School = school;
        this.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentid=" + studentid +
                ", School='" + School + '\'' +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }

    public String exam(){
        return "学生要参加考试";
    }

    public String homework(){
        return "学生要做作业";
    }

}
