import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    private Student[] students;
    private int cnt;

    public StudentManagement() {
        students = new Student[100];
        int cnt = 0;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        // TODO:
        students[cnt] = newStudent;
        cnt++;
    }

    public String studentsByGroup() {
        // TODO:
        StringBuilder res = new StringBuilder();
        boolean[] checked = new boolean[cnt];
        for(int i = 0; i < cnt; i ++) {
            if(checked[i] == false) {
                String tmp = students[i].getGroup();
                res.append(tmp).append("\n");

                for(int j = i ; j < cnt ; j++) {
                    if(students[j].getGroup().equals(tmp)) {
                        res.append(students[j].getInfo()).append("\n");
                        checked[j] = true;
                    }
                }
                //res.append("\n");
            }
        }
        return res.toString();
    }

    public void removeStudent(String id) {
        // TODO:
        for(int i = 0 ; i < cnt ; i++) {
            if(students[i].getId().equals(id)) {
                for(int j = i ; j < cnt ; j++) {
                    students[j] = students[j+1];
                }
                students[cnt-1] = null;
                cnt--;
            }
        }

    }

    /*public static void main(String[] args) {
        // TODO:
        StudentManagement stm=new StudentManagement();
        Student st1=new Student("Nguyen Van An","17020001","K62CC","17020001@vnu.edu.vn");
        Student st2=new Student("Nguyen Van C","17020003","K62CB","17020003@vnu.edu.vn");
        Student st3=new Student("Nguyen Van B","17020002","K62CC","17020002@vnu.edu.vn");
        Student st4=new Student("Nguyen Van D","17020004","K62CB","17020004@vnu.edu.vn");
        stm.addStudent(st1);
        stm.addStudent(st2);
        stm.addStudent(st3);
        stm.addStudent(st4);
        System.out.println(stm.studentsByGroup());

        if(stm.sameGroup(st1,st2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        if(stm.sameGroup(st1,st3)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        stm.removeStudent("17020004");
        System.out.println(stm.studentsByGroup());
    }*/
}

