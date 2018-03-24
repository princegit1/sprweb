/**
 * 
 */
package com.test;

abstract class aa{
	abstract void print();
}
public class Test2 {  

	private int data = 11;
	static int aa = 22;
	int t222 = 33;
	void print() {
			System.out.println("outer " + data);
	}
static class t11{
	void msg(){
		System.out.println("MSSSSg " + aa);  
	}
}
	void display(){
		class local{
			void p(){
				System.out.println("-----> Printtt");
			}
			
		}
		local l = new local();
		l.p();
	}
	public static void main(String[] args) {
		/*Test2 t = new Test2(){
			void print(){
				System.out.println("--- + print" );
			}
		};
		t.print();*/
		Test2 t2 = new Test2();
		t2.display();
		
		Test2.t11 inn = new Test2.t11();
		inn.msg();
		

	}

}
