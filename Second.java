@FunctionalInterface
interface MyInterface{ //* THIS IS FUNCTIONAL INTERFACE 
    public int myMethode(int a,int b);
}
class LoginSystem{
    public void login(){
        System.out.println("THE LOGIN IS SUCCESSFULL");
    }
}
public class Second {
    public static void main(String[] args) {
        MyInterface mi=(int a,int b)->{return (a+b);};
        System.out.println(mi.myMethode(5, 6));
    }
}
