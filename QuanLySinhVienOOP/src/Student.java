import java.util.Objects;

public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student

    /**
     * Ham GetName.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Ham SetName.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ham GetId.
     */
    public String getId() {
        return id;
    }

    /**
     * Ham SetId.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Ham GetGroup.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Ham SetGroup.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Ham GetEmail.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Ham SetEmail.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor 0.
    */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    /**
     * Constructor 1.
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;

    }

    /**
     * Constructor 3.
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Get student info.
     */
    String getInfo() {
        // TODO:
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}