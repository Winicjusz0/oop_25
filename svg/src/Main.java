public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Point p1 = new Point();
        p1.x = 5.0;
        p1.y = 4.0;
        System.out.println("P1: (" + p1.x + "," + p1.y + ")");
        System.out.println(p1.toSvg());

        Segment segment = new Segment();
        segment.a = new Point();
        segment.a.x = 0.0;
        segment.a.y = 0.0;
        segment.b = new Point();
        segment.b.x = 4.0;
        segment.b.y = 3.0;

        Segment[] arr = new Segment[2];
        arr[0] = segment;
    }

    public static Segment maxSegmenth(Segment[] arr){
        if(arr.length == 0)
            return null;

        Segment max = arr[0];
        for(int i=1)

    }
}