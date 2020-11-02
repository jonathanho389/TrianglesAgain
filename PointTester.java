public class PointTester{
  public static void main(String[] args) {
    Point pain = new Point(0,0);
    Point pain2 = new Point(0,3);
    Point pain3 = new Point(4,0);
    Triangles pain4 = new Triangles(pain, pain2, pain3);
    System.out.println(pain.getX());
    System.out.println(pain.getY());
    System.out.println(pain.distanceTo(pain2));
    System.out.println(pain.equals(pain2));
    System.out.println(pain4.getPerimeter());
    System.out.println(pain4.getArea());
    System.out.println(pain4.classify());
    System.out.println(pain4.toString());
  }
}
