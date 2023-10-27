public class fraction {
    private double numerator, denominator;

    fraction(){
        this.numerator = 1;
        this.denominator = 1;

    }

    fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator(){
        return this.numerator;
    }

    public double getDenominator(){
        return this.denominator;
    }

    public boolean divisionByZero(){

        if((numerator / denominator) == 0 ){
            System.out.println("Operation undefined");
            return true;

        }

        else{
            System.out.printf("Division by zero not detected:");
            return false;
        }

    }

    public String toString(){
        return "The numerator is " + numerator +  " " + "The denominator is: " + denominator;
    }
}
