package secondproject;

public class Cember extends Sekil {
	int r;

	public Cember(int r){
		this.r = r;
	}
	
	@Override
	public int cevre() {
		return (int) (2 * Math.PI * r);
	}

	@Override
	public int alan() {
		return (int) (Math.PI * r * r);
	}
	public String toString(){
		return "gercek sekıl";
	}
}