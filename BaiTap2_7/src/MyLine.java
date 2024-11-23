import java.awt.*;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public void getBegin() {

    }
    public void getEnd() {

    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return this.begin.getX();
    }
    public int getBeginY() {
        return this.begin.getY();
    }
    public int getEndX() {
        return this.end.getX();
    }
    public int getEndY() {
        return this.end.getY();
    }
    public void setBeginX(int x) {
        this.begin.setX(x);
    }
    public void setBeginY(int y) {
        this.begin.setY(y);
    }
    public void setEndX(int x) {
        this.end.setX(x);
    }
    public void setEndY(int y) {
        this.end.setY(y);
    }
    public int[] getBeginXY(){
        int[] xy = new int[2];
        xy[0] = this.begin.getX();
        xy[1] = this.begin.getY();
        return new int[]{xy[0], xy[1]};
    }
    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public int[] getEndXY(){
        int[] xy = new int[2];
        xy[0] = this.end.getX();
        xy[1] = this.end.getY();
        return new int[]{xy[0], xy[1]};
    }
    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }
    public double getLength(){
        return begin.distance(this.end);
    }
    public double getGradient(){
        return Math.atan2(this.end.getY() - this.begin.getY(), this.end.getX() - this.begin.getX());
    }
    public String toString() {
        return "MyLine[begin=" + this.begin + ", end=" + this.end + "]";
    }
}