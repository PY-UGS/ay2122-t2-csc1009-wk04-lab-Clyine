import java.util.Scanner;

class BMI {
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
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double w = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double h = input.nextDouble();
        input.close();
        
        BMI person = new BMI(w, h);
        System.out.println("BMI is " + person.getBmi());
        System.out.println(person.getBmiclass());
    }
}

class StackOfIntegers {
    private int[] element;
    private int size;

    public StackOfIntegers(){
        this.element = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int i){
        this.size = -1;
        this.element = new int[i];
    }

    public boolean empty(){
        return (this.size == -1);
    }
    public int peek(){
        return this.element[this.size];
    }

    public void push(int i){
        this.size += 1;
        this.element[this.size] = i;
    }

    public int pop(){
        int temp = this.element[this.size];
        this.element[this.size] = 0;
        this.size -= 1;
        return temp;
    }

    public int getSize(){
        return this.size;
    }

    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}