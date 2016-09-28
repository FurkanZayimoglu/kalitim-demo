package secondproject;

public class SecondProject {

	public static void main(String[] args) {
		Sekil c = new Cember(2);
		int sonuc = c.alan();
		System.out.println(sonuc);
		c=new Kare(5);
		
		System.out.println(c.alan());
		System.out.println(c);

	}

}
