public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Contructor 1 Staff(String,String,String,double).
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Getter n Setter for School n Pay.
     */
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * toString for Staff.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
