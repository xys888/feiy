package other;

import java.util.Scanner;

public class Student {
    private String name;
    private Integer math;
    private Integer english;
    private Integer java;

    public Student() {
    }

    public Student(String name, Integer math, Integer english, Integer java) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.java = java;
    }

    private Integer avgTest(Integer math, Integer english, Integer java) {
        return (math + english + java) / 3;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生姓名：");
            String ss = sc.nextLine();
            System.out.println("请输入数学成绩：");
            int i1 = sc.nextInt();
            System.out.println("请输入语文成绩：");
            int i2 = sc.nextInt();
            System.out.println("请输入英语成绩：");
            int i3 = sc.nextInt();
            Student student = new Student();
            if (ss != null && ss.length() > 0) {
                System.out.println("该学生： " + ss + "的平均成绩为：" + student.avgTest(i1, i2, i3));
            } else {
                System.out.println("学生姓名不能为空，请输入学生姓名：");
            }

        }
    }
}
