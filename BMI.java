public class BMI {
    static final double POUNDS = 0.45359237;
    static final double INCHES = 0.0254;

    private double weightInPounds;
    private double heightInInches;
    private double bmi;
    private String bmiClass;

    public BMI(double weight, double height){
        weightInPounds = weight;
        heightInInches = height;
        bmi = Calculate();
        bmiClass = classify();
    }

    private double Calculate(){
        bmi = (weightInPounds*POUNDS)/Math.pow(heightInInches*INCHES, 2);
        return bmi;
    }

    private String classify(){
        String ans;
        if(bmi >= 30){
            ans = "Obese";
        }
        else if (bmi >= 25){
            ans = "Overweight";
        }
        else if (bmi >= 18.5){
            ans = "Normal";
        }
        else{
            ans = "Underweight";
        }
        return ans;
    }

    public double getBmi(){
        return this.bmi;
    }

    public String getBmiclass(){
        return bmiClass;
    }
}

