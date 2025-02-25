public class Point {
    public double x;
    public double y;

    public String toSvg(){
        return "<circle r=\"5\" cx=\""+x+"\" cy=\""+y+"\" fill=\"red\" />";
    }

    public void translate(double dx, double dy){
        this.x += dx;
        y +=dy;
    }

    public Point translated(double dx, double dy){
        Point newPoint = new Point();
        newPoint.x = x + dx;
        newPoint.y = y + dy;
        return newPoint;
    }
}
