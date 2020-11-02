public class Triangles{
  private Point v1,v2,v3;
  public Triangles(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangles(double x1, double y1,double x2, double y2,double x3, double y3){
    Point v1 = new Point(x1, y1);
    Point v2 = new Point(x2, y2);
    Point v3 = new Point(x3, y3);
  }
  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public double getArea(){
    double semi = (getPerimeter())/2;
    return Math.sqrt(semi * (semi - v1.distanceTo(v2)) * (semi - v2.distanceTo(v3)) * (semi - v3.distanceTo(v1)));
  }
  public String classify(){
    double length1 = Math.round(v1.distanceTo(v2) * 10000.0)/10000.0;
    double length2 = Math.round(v2.distanceTo(v3) * 10000.0)/10000.0;
    double length3 = Math.round(v3.distanceTo(v1) * 10000.0)/10000.0;
    if (length1 == length2 && length2 == length3 && length3 == length1){
      return "equilateral";
    }
    else if(length1 == length2 || length2 == length3){
      return "isosceles";
    }
    return "scalene";
  }
  public String toString(){
    return "v1(" + v1.getX() + v1.getY() + ") " + "v2(" + v2.getX() + v2.getY() + ") " + "v3(" + v3.getX() + v3.getY() + ") ";
  }
  public void setVertex(int index, Point newP){
  }
}
