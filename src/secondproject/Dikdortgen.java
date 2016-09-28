package secondproject;

public class Dikdortgen extends Sekil {
	int uk, kk;

	public Dikdortgen(int uk, int kk) {
		this.uk = uk;
		this.kk = kk;
	}
	
	@Override
	public int alan() {
		return uk * kk;
	}

	@Override
	public int cevre() {
		return 2 * (uk * kk);
	}
	public String toString(){
		return "dolu sekýl";
	}
}
