
public class Test {

	public int m(int y){
		int z = 0;
		while (y > 0){
			z = z + 1;
			y = y - 1;
		}
		z = 2;
		return z;
	}
	
	public int n(){
		int y = 0;
		return m(y);
	}
	
	public int o(){
		int y = 1;
		return m(y);
	}
	public static void main(String[] args) {
		Test t = new Test();
		int result = t.m()/t.n();

	}
	

}
