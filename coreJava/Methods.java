

public class Methods {
    public static void addition() {
        int n1 = 12;
        int n2 = 20;
        int result = n1 + n2;
        System.err.println(result);
    }
    public void subtraction() {
        int n1 = 12;
        int n2 = 20;
        int result = n2 - n1;
        System.err.println(result);
    }
    public static void name(String name){
        System.err.println("My name is "+name);
    }
    public void nameAge(String name, int age) {
        System.err.println("Name :"+name);
        System.err.println("Age :"+age);

    }
    public static void main(String[] args) {
        Methods.addition();
        Methods obj = new Methods();
        obj.subtraction();
        name("Jac");
        obj.nameAge("Jack", 3);
    }
}