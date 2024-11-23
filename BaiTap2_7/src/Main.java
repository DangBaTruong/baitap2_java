import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);

        MyLine line = new MyLine(begin, end);

        System.out.println("Đường thẳng: " + line);
        System.out.println("Độ dài của đường thẳng: " + line.getLength());
        System.out.println("Góc nghiêng của đường thẳng: " + Math.toDegrees(line.getGradient()) + " độ");

        begin.setX(0);
        begin.setY(0);
        System.out.println("Đường thẳng mới: " + line);


    }
}
