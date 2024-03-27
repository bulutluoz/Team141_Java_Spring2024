package day27_constructorCall;

public class C01_ConstructorCall {

    C01_ConstructorCall(){ // Cons 1
        // Const 2 yi cagiralim
        System.out.println("ali");
        // this("java"); // constructor call ilk satirda olmalidir
    }

    void C01_ConstructorCall(){ // Method1

    }

    C01_ConstructorCall(String str){ // Cons 2

    }

    C01_ConstructorCall(int a){ // Cons 3
        // C01_ConstructorCall("Java");
        // isim() : bu syntax method call icindir
        this();// constructor call bu syntax ile calisir
        // this("a"); // Call to 'this()' must be first statement in constructor body


    }

    int C01_ConstructorCall(double d){ // Method 2
        C01_ConstructorCall();

        return 0;
    }


    public static void main(String[] args) {


    }
}
