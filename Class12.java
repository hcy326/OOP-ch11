interface Data{
	public void best();
	public void failed();
}
interface Test extends Data{
	public void showData();
	public double average();
}
class CStu implements Test{
	protected String name;
	protected int math;
	protected int english;
	public CStu(String n,int m,int eng) {
		name=n;
		math=m;
		english=eng;
	}
	public void best() {
		if (math>english)
			System.out.println(name+" ���ƾǤ�^��n");
		else
			System.out.println(name+" ���^���ƾǦn");
	}
	public void failed() {
		if (math<60)
			System.out.println(name+" ���ƾǷ��F");
		else
			System.out.println(name+" ���^����F");
	}
	public void showData() {
		System.out.println("�ƾǦ��Z : "+math);
		System.out.println("�^�妨�Z : "+english);
		System.out.println("�������Z : "+average());
	}
	public double average() {
		return (english+math)/2.0;
	}
	public void show() {
		showData();
		best();
		failed();
	}
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("Judy", 58, 91);
		stu.show();
	}

}
