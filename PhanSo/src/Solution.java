public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Constructs a Solution object with the specified numerator and denominator.
     * If the denominator is zero, it is set to 1 to avoid division by zero.
     * The fraction is automatically reduced upon initialization.
     *
     * @param numerator   the numerator of the fraction.
     * @param denominator the denominator of the fraction. If zero, it is set to 1.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
        reduce(); // Always reduce the fraction upon initialization
    }

    /**
     * Gets the numerator of the fraction.
     *
     * @return the numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Sets the numerator of the fraction.
     *
     * @param numerator the new value for the numerator.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Gets the denominator of the fraction.
     *
     * @return the denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * set the denominators.
     *
     * @param denominator la mau so.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
        //
    }

    /**
     * tinh uoc chung lon nhat.
     *
     * @param a la so thu nhat.
     * @param b la so thu hai.
     */
    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    /**
     * Reduces the fraction to its simplest form by dividing both numerator and denominator
     * by their greatest common divisor (GCD). If the denominator is negative, the sign is
     * adjusted to the numerator.
     *
     * @return this fraction in reduced form.
     */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return this;
    }

    /**
     * Adds this fraction to another fraction.
     *
     * @param other the fraction to be added.
     * @return a new Solution object representing the sum of the two fractions, reduced to its simplest form.
     */
    public Solution add(Solution other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        return this.reduce();
    }

    /**
     * Subtracts another fraction from this fraction.
     *
     * @param other the fraction to be subtracted.
     * @return a new Solution object representing the difference of the two fractions, reduced to its simplest form.
     */
    public Solution subtract(Solution other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        return this.reduce();
    }

    /**
     * Multiplies this fraction by another fraction.
     *
     * @param other the fraction to be multiplied.
     * @return a new Solution object representing the product of the two fractions, reduced to its simplest form.
     */
    public Solution multiply(Solution other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        return this.reduce();
    }

    /**
     * Divides this fraction by another fraction. If the numerator of the other fraction is zero,
     * an error message is printed, and the current fraction is returned unchanged.
     *
     * @param other the fraction to divide by.
     * @return a new Solution object representing the quotient of the two fractions, reduced to its simplest form.
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            this.numerator *= other.denominator;
            this.denominator *= other.numerator;
            return this.reduce();
        } else {
            // Optionally handle division by zero here
            System.out.println("Error: Cannot divide by zero.");
            return this;
        }
    }

    /**
     * Checks if this fraction is equal to another object.
     * Two fractions are considered equal if they are equivalent after being reduced to their simplest form.
     *
     * @param obj the object to compare with.
     * @return true if the object is a Solution object and the fractions are equivalent, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            // Compare reduced forms
            Solution thisReduced = this.reduce();
            Solution otherReduced = other.reduce();
            return thisReduced.numerator == otherReduced.numerator &&
                    thisReduced.denominator == otherReduced.denominator;
        }
        return false;
    }
    public void print(Solution s) {
        System.out.println(s.getNumerator()+"/"+s.getDenominator()+'\n');
    }
}