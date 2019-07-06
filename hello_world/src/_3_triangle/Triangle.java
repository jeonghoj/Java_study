package _3_triangle;

class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle(30,50);
        tri.calcArea();
        tri.setHeight(100);
        tri.calcArea();

    }
}

class Triangle {
    private int height;
    private int width;

    Triangle(int h, int w){
        height = h;
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }
    public void setWidth(int w){
        width = w;
    }

    public void calcArea(){
        System.out.println("h : "+height+" w : "+width);
        System.out.println("area : "+(height*width)/2);
    }

}
