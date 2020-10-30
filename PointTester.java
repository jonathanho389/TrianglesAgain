public class PointTester{
  public static void main(String[] args) {
    Point pain = new Point(0,0);
    Point pain2 = new Point(3,4);
    System.out.println(pain.getX());
    System.out.println(pain.getY());
    System.out.println(pain.distanceTo(pain2));
  }
}
