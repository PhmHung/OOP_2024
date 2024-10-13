public class Test {
        public static void main(String[] args) {
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
    }
}
