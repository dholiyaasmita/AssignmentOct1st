package io.pragra.learning.oct1st;
// Method overloading:
//Write a method overloading program which would explain this concept.
// Write a method name magicPlay which would 6 different faces but would have same name every time.
// You are supposed to play with different params.
// Each method should tell, how many number of params were passed and what type of params were passed to them.
public class Example11 {
    public void magicPlay(int a){
        System.out.println("Only one parameter");
    }
    public void magicPlay(int a,int b){
        System.out.println("Two parameters with same data type : int");
    }
    public void magicPlay(int a,float b){
        System.out.println("Two parameters with different data type");
    }
    public void magicPlay(double a,double b){
        System.out.println("Two parameters with same data type : double");
    }
    public void magicPlay(String a,String b){
        System.out.println("Two parameters with same data type : String");
    }
    public void magicPlay(String a,int b, double c){
        System.out.println("Three parameters with different data type");
    }
    public static void main(String[] args) {
        Example11 E = new Example11();
        E.magicPlay(2);
        E.magicPlay(2,6);
        E.magicPlay(3,5.6f);
        E.magicPlay(6.5,9.86);
        E.magicPlay("Hi","Hello");
        E.magicPlay("Hi",50,38.95);
    }

}
