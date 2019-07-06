package _4_encapsulation;

public class capsul {
    public static void main(String[] args) {
        Ring ring = new Ring(1,1,4,2,2,9);
        ring.showRingInfo();

    }
}

class Point{
    private int xPos,yPos;
    Point(int x, int y){
        xPos = x;
        yPos = y;
    }
    void showPointInfo(){
        System.out.println("["+xPos+", "+yPos+"]");
    }
}
class Circle{
    private Point point;
    private int radius;
    Circle(int x, int y, int r){
        point = new Point(x,y);
        radius = r;
    }
    void showCircleInfo(){
        System.out.println("Circle Info...");
        System.out.println("radius : "+radius);
        point.showPointInfo();
    }
}
class Ring{
    private Circle innerCircle;
    private Circle outterCircle;

    public Ring(int x1, int y1, int rad1, int x2, int y2, int rad2){
        if(rad1 < rad2){
            innerCircle = new Circle(x1,y1,rad1);
            outterCircle = new Circle(x2,y2,rad2);
        }else{
            innerCircle = new Circle(x2,y2,rad2);
            outterCircle = new Circle(x1,y1,rad1);
        }
    }
    public void showRingInfo(){
        System.out.print("Inner ");
        innerCircle.showCircleInfo();
        System.out.print("Outter ");
        outterCircle.showCircleInfo();
    }

}
