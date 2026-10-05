import java.util.Scanner;
Scanner sc=new Scanner(system.in);
class a{
    void getData(){
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b =sc.nextInt();
    }
    void putData(){
        int c=sc.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
class a3{
    public static void main(String[] args) {
        A aa=new A();
        aa.getData();
        aa.putData();
    }
}