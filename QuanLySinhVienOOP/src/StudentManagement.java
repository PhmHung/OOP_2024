import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    private static Student[] students;
    private static final int MAX_COUNT = 100;
    private int cnt = 0;

    public StudentManagement() {
        students = new Student[MAX_COUNT];
    }

    public int getCnt() {
        return this.cnt;
    }

    /**
     * Ham so sanh 2 lop cua 2 Student.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Ham them addStudent.
     */
    public void addStudent(Student newStudent) {
        // TODO:
        boolean check = false;
        for (int i = 0; i < cnt; i++) {
            if (newStudent.equals(students[i])) {
                check = true;
                break;
            }
        }

        if (!check) {
            if (cnt < MAX_COUNT) {
                students[cnt++] = newStudent;
            }
        }
    }

    /**
     * Ham in Student theo group.
     */
    public String studentsByGroup() {
        // TODO:
        StringBuilder res = new StringBuilder();
        boolean[] checked = new boolean[cnt];
        for (int i = 0; i < cnt; i++) {
            if (checked[i] == false) {
                String tmp = students[i].getGroup();
                res.append(tmp).append("\n");

                for (int j = i; j < cnt; j++) {
                    if (students[j].getGroup().equals(tmp)) {
                        res.append(students[j].getInfo()).append("\n");
                        checked[j] = true;
                    }
                }
            }
        }

        return res.toString();
    }

    /**
     * Ham removeStudent xoa sinh vien co MSV la id.
     *
     */
    public void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < cnt; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < cnt - 1; j++) {
                    students[j] = students[j + 1];
                }
                cnt--;
                return;
            }
        }
    }
}

