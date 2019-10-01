
public class Foo {
	
	int x;
	String y;
	
	static int count = 0;
	static int count1 = 0;
	static int count2 = 0;
	
	
	public Foo(int x) {
		
		this.x = x;
		
		count1++;
		
	}
	public Foo(String y) {
		
		this.y = y;
		
		count2++;
	}
	
	
	
	static void howmanyObject() {
		
		System.out.println("Integer Constructor : "+count); 
		System.out.println("Integer Constructor : "+count1); 
		System.out.println("Parameterize Constructor : "+count2);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Foo f1=new Foo(23);
		Foo f2=new Foo("Asdf");
		Foo f3=new Foo(12);
		Foo f4=new Foo("Ahjgjhg");
		Foo f5=new Foo(27);
		Foo f6=new Foo(76);
		
		howmanyObject();
	}
	
	

}
