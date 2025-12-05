class calculator {          //The class is calculator
//attributes for the caculator
 int num1,num2 ,addition_result,subtraction_result;

 //method for adding the two numbers
 public int addition(int num1,int num2)          //here we are adding two numbers
 {
  return num1+num2;          //returning num 1 and num 2
 }
 // method for sub two numbers
 public int subtraction(int num1,int num2)      //here subtraction happens
 {
  return num2-num1;
 }
 

 public double division(int num1,int num2)    //here we divide numbers
 {
       return num1 / num2;
 }

 public int multiple (int num1,int num2)          //here multiplication happens
 {
     return num1*num2 ;
 }
 // method for power of a number
 public double power(double base, double exponent) {
     return Math.pow(base, exponent);
 }
// method for square root of a number
 public double squareRoot(double number) {
     return Math.sqrt(number);
 }
}


