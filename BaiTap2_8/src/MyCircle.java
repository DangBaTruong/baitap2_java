public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius;
    public MyCircle() {
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MyPoint(x, y);
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        int[] xy = new int[2];
        xy[0] = center.getX();
        xy[1] = center.getY();
        return xy;
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }
    public String toString() {
        return "MyCircle [radius=" + radius + ", center=" + center
        + "]";
    }
}
