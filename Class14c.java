package Class14;


interface iVolume{
	public void showData();
	public double vol();
}
abstract class CSphere implements iVolume{
	final double PI=3.14;
	protected int x;
	protected int y;
	protected int radius;
	public void showData() {
		System.out.println("�y�� : "+"("+x+","+y+")");
		System.out.println("�b�| : "+radius);
		System.out.println("�D��n : "+vol());
	}
	public double vol() {
		return (4.0/3.0)*PI*radius*radius*radius;
	}
	public void show() {
		showData();
	}
}
class CCircle extends CSphere{
	public CCircle(int a,int b,int r) {
		x=a;
		y=b;
		radius=r;
	}
}
public class Class14c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir =new CCircle(8, 6, 2);
		cir.show();
	}

}