package hot100.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HJ68_成绩排序2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int num = in.nextInt();
            Student[] students = new Student[n];
            for(int i = 0; i < n; i++){
                students[i] = new Student(in.next(), in.nextInt());
            }
            up_sort(students, num);
            for (Student v : students){
                System.out.println(v.name + " " + v.score);
            }
        }
    }
    public static void up_sort(Student[] student, int key){
        if(key == 1){
            Arrays.sort(student, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.score - o2.score;
                }
            });
        }else if(key == 0){
            Arrays.sort(student, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.score - o1.score;
                }
            });
        }
    }
}
class Student{
    String name;
    int score;
    Student(String name, int score){
        this.name = name;
        this.score = score;
    }
}
