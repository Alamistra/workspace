
public class TestMyPoint {
	public static void main(String[] args) {
		//step a
	    MyPoint start = new MyPoint();
	    MyPoint end = new MyPoint();
	    //step b
	    start.x = 10;
	    start.y = 10;
	    end.x = 20;
	    end.y = 30;
	    //step c
	    System.out.println("Start point is " + start);
	    System.out.println("End point is " + end);
	    System.out.println();
	    //step e
	    MyPoint stray = end;

	    //step f
	    System.out.println("Stray point is " + stray);
	    System.out.println("End point is " + end);
	    System.out.println();
	    //step g
	    stray.x = 47;
	    stray.y = 50;
	    //step h
	    System.out.println("Stray point is " + stray);
	    System.out.println("End point is " + end);
	    System.out.println("Start point is " + start);
	  }
}
