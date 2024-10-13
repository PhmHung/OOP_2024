//// Import your library
//// Do not change the name of the Solution class
//public class Solution {
//    // Type your main code here
//    private int numerator;
//    private int denominator;
//
//    /**
//     * Ham getNumerator.
//     */
//    public int getNumerator() {
//        return numerator;
//    }
//
//    /**
//     * Ham setNumerator.
//     */
//    public void setNumerator(int numerator) {
//        this.numerator = numerator;
//    }
//
//    /**
//     * Ham getDenominator.
//     */
//    public int getDenominator() {
//        return denominator;
//    }
//
//    /**
//     * Ham setDenominator.
//     */
//    public void setDenominator(int denominator) {
//        if (denominator != 0) {
//            this.denominator = denominator;
//        }
//    }
//
//    /**
//     * Ham khoi tao co tham so.
//     */
//    public Solution(int numerator, int denominator) {
//        if (denominator != 0) {
//            setNumerator(numerator);
//            setDenominator(denominator);
//        } else {
//            setNumerator(numerator);
//            setDenominator(1);
//        }
//    }
//
//    /**
//     * Ham lay GCD.
//     */
//    public static int gcd(int a, int b) {
//        //Tim min a,b.
//        a = Math.abs(a);
//        b = Math.abs(b);
//
//        //Neu b=0 GCD=a
//        if (b == 0) {
//            return a;
//        }
//
//        //Goi de quy tinh GCD
//        return gcd(b, a % b);
//    }
//
//    /**
//     * Ham rut gon phan so.
//     */
//    public Solution reduce() {
//        int gcd = gcd(numerator, denominator);
//        return new Solution(numerator / gcd, denominator / gcd);
//    }
//
//    /**
//     * Phuong thuc cong Add.
//     */
//    public Solution add(Solution s) {
//        if (s.getDenominator() != 0) {
//            this.numerator = this.numerator * s.getDenominator()
//                    + s.getNumerator() * this.denominator;
//            this.denominator = this.denominator * s.getDenominator();
//        }
//        return this.reduce();
//    }
//
//    /**
//     * Phuong thuc tru Subtract .
//     */
//    public Solution subtract(Solution s) {
//        if (s.getDenominator() != 0) {
//            this.numerator = this.numerator * s.getDenominator()
//                    - s.getNumerator() * this.denominator;
//            this.denominator = this.denominator * s.getDenominator();
//        }
//        return this.reduce();
//    }
//
//    /**
//     * Phuong thuc nhan Multiply.
//     */
//    public Solution multiply(Solution s) {
//        if (s.getDenominator() != 0) {
//            this.numerator = this.numerator * s.getNumerator();
//            this.denominator = this.denominator * s.getDenominator();
//        }
//        return this.reduce();
//    }
//
//    /**
//     * Phuong thuc chia Divide.
//     */
//    public Solution divide(Solution s) {
//        if (s.getDenominator() != 0 && s.getNumerator() != 0) {
//            this.numerator = this.numerator * s.getDenominator();
//            this.denominator = this.denominator * s.getNumerator();
//        }
//        return this.reduce();
//    }
//
//    /**
//     * Ham so sanh 2 phan so.
//     */
//    public boolean equals(Object obj) {
//        if (obj instanceof Solution) {
//            Solution s = (Solution) obj;
//
//            s = s.reduce();
//            return s.getNumerator() == this.reduce().getNumerator()
//                    && s.getDenominator() == this.reduce().getDenominator();
//        }
//        return false;
//    }
//    public void print(Solution s) {
//        System.out.println(s.getNumerator()+"/"+s.getDenominator()+'\n');
//    }
//}