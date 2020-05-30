package designPrinciple;

public class open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imp imp=new imp();
		imp.drow(new round());
		imp.drow(new three());
	}
}
//功能实现，有图形，图形可以实现画画的功能
interface drow{
	public void drow1();
}

class round implements drow{
	public void drow1() {
		System.out.println("画圆");
	}	
}
class imp{
	public void drow(drow d) {
		d.drow1();
	}
}

//新添加图形的操作
class three implements drow{
	public void drow1() {
		System.out.println("画三角形");
	}
	
}
