public class Main {
//    Hàm test này tham khảo OPENAI
    public static void main(String[] args) {
        // Tạo một vòng tròn
        MyCircle circle1 = new MyCircle(3, 4, 5);
        System.out.println(circle1);

        // Tạo một vòng tròn khác
        MyPoint center2 = new MyPoint(1, 1);
        MyCircle circle2 = new MyCircle(center2, 2);

        // Tính khoảng cách giữa hai tâm
        System.out.println("Khoảng cách giữa hai tâm: " + circle1.distance(circle2));

        // Tính diện tích và chu vi của circle1
        System.out.println("Diện tích: " + circle1.getArea());
        System.out.println("Chu vi: " + circle1.getCircumference());
        // Kiểm tra các trường hợp đặc biệt về khoảng cách
        // Hai vòng tròn tiếp xúc ngoài
        MyCircle circle3 = new MyCircle(10, 10, 5);
        System.out.println("Khoảng cách giữa hai vòng tròn tiếp xúc ngoài: " + circle1.distance(circle3));

        // Hai vòng tròn tiếp xúc trong
        MyCircle circle4 = new MyCircle(3, 4, 2);
        System.out.println("Khoảng cách giữa hai vòng tròn tiếp xúc trong: " + circle1.distance(circle4));

        // Hai vòng tròn cắt nhau
        MyCircle circle5 = new MyCircle(5, 5, 4);
        System.out.println("Khoảng cách giữa hai vòng tròn cắt nhau: " + circle1.distance(circle5));

        // Hai vòng tròn nằm hoàn toàn trong nhau
        MyCircle circle6 = new MyCircle(3, 4, 1);
        System.out.println("Khoảng cách giữa hai vòng tròn nằm trong nhau: " + circle1.distance(circle6));
    }
}
