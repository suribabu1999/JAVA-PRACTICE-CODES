package IterationStatement;

public class DoWhileLoop {
	void meth1(int a) {
		do {
			System.out.println("------hi------");
			a++;
		}
		while(a<=5);
		
	}



		
public static void main(String[] args) {
	DoWhileLoop obj = new DoWhileLoop();
	obj.meth1(1);
}
}
