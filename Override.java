package Demo;
import java.util.*;
class A{
	int i,j;
	void printdetails() {
		System.out.println("i is "+i);
		System.out.println("j is "+j);
	}
}
class B extends A{
	int k;
	void printdetails() {
		System.out.println("i is "+i);
		System.out.println("j is "+j);
		System.out.println("k is "+k);
	}
}
public class Override {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     A ar;
     A obj=new A();
     obj.i=10;
     obj.j=5;
     ar=obj;
     ar.printdetails();
     B o=new B();
     o.i=15;
     o.j=10;
     o.k=5;
     ar=o;
    ar.printdetails();
     }
}
