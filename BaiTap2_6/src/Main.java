public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(0, 0);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Khoang cach tu p1 den p2: " + p1.distance(p2));
        System.out.println("Khoang cach tu p1 den goc toa do: " + p1.distance());
    }
}
