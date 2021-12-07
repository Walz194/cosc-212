package lab1;

public class SubA extends A {
	final void f() { // static methods are not overridden
		System.out.println("Hide.f");
	}
	void g() {
		System.out.println("Hide.g");
	}
	public static void main(String args[]) {
		A aref = new SubA();
		// call A.f()
		aref.f();
		// call SubA.g()
		aref.g();
	}
}
//a- Can an instance method override a static method? - NO
//b- Can a static method override (hide) an instance method? - NO
//c- Can you override a final instance method? - NO
//d- Can you override an instance method and make it final?
//e- Can you override an instance method and change its return type?
//f- Can you hide a final static method ?
//g- Can an instance field hide a static field?
//h- Can a static field hide an instance field?
//i- Can an instance method with public visibility override an instance method with default visibility?
//j- Can an instance method with default visibility override an instance method with public visibility?
//k- Can an instance method with protected visibility override an instance method with default
//visibility?
//l- Can an instance method with default visibility override an instance method with protected
//visibility?