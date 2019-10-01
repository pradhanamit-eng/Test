
public class TestPen {
	
	public static void main(String[] args) {
		
		Pen p1=new Pen("Ball", 5.0f, "Parker");
		Pen p2=new Pen("Gel", 5.0f, "Renold");
		Pen p3=new Pen("Gel", 5.0f, "Renold");
		System.out.println("-------PEN--------");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("-----HashCode--------");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		
	}
}
