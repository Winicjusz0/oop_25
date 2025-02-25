public class Point {
    public double x;
    public double y;

    public String toSvg(){
        return "<circle r=\"5\" cx=\""+x+"\" cy=\""+y+"\" fill=\"red\" />";
    }
}
