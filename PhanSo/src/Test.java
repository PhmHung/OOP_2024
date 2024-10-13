public class Test {
    public static void main(String[] args) {
        Solution s1 = new Solution(2,4);

        Solution s2 = new Solution(0,8);
        Solution s3 = new Solution(4,0);
        Solution s4 = new Solution(0,1);

        s1.print(s1.subtract(s2));
        s1.print(s1.subtract(s3));
        s1.print(s1.subtract(s4));
        s1.print(s1.multiply(s2));
    }
}
