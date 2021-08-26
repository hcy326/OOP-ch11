
abstract class CShape               // �w�q��H���OCShape
{
   
   protected String color;       // ��Ʀ���

   public CShape(String str) {
	   color=str;
   }
   public abstract void show(); // ��H��ơA�u���w�q�W�١A�S���w�q�B�z�覡
}



class CRectangle extends CShape    // �w�q�l���OCRectangle
{
   protected int width,height;
   public CRectangle(int w,int h)
   {
	  super("Yellow");
      width=w;
      height=h;
   }
   public void show()      // ���T�w�q�~�Ӧ۩�H���O��show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+width*height);
   }
}
class CCircle extends CShape     // �w�q�l���OCCircle
{
   protected double radius;
   public CCircle(double r)
   {
	   super("Green");
	   radius=r;
   }
   public void show()     // ���T�w�q�~�Ӧ۩�H���O��show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+3.14*radius*radius);
   }
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CRectangle rect=new CRectangle(5,10);

	      rect.show();         // �I�sCRectangle���O�̪�show() method

	      CCircle cir=new CCircle(2.0);

	      cir.show();             // �I�sCCircl���O�̪�show() method
	}

}
