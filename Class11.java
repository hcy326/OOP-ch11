
interface Data{
	public void showData();
}
interface Test{
	public void showScore();
	public double calcu();
}
class CStu implements Data,Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public CStu(String i,String n,int m,int f,int c) {
		id=i;
		name=n;
		mid=m;
		finl=f;
		common=c;
	}
	public void showData() {
		System.out.println("�ǥ;Ǹ� :"+ id);
		System.out.println("�ǥͩm�W :"+ name);
	}
	public void showScore() {
		System.out.println("�����Ҧ��Z :"+ mid);
		System.out.println("�����Ҧ��Z :"+ finl);
		System.out.println("���ɦ��Z :"+ common);
		System.out.println("�Ǵ����Z :"+ calcu());
	}
	public double calcu() {
		return (mid*0.3)+(finl*0.3)+(common*0.4);
	}
	public void show() {
		showData();
		showScore();
	}
}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001", "Fiona", 90, 92, 85);
		stu.show();
	}

}
