public class Triangles{
  private Point v1,v2,v3;
  public Triangles(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangles(double x1, double y1,double x2, double y2,double x3, double y3){
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
  }
}