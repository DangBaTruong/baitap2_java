public class Main {
    public static void main(String[] args) {
        Author author = new Author("Truong", "dbtruong57@gmail.com",'m');
        System.out.println(author);

        Book book = new Book("Sach Hay", author, 20.15, 99);
        System.out.println(book);

        book.setPrice(25.15);
        book.setQty(27);
        System.out.println("Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Qty : " + book.getQty());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Name author : " + book.getAuthor().getName());
        System.out.println("Email author : " + book.getAuthor().getEmail());

        Book booknew = new Book("Sach Do", new Author("Ba Truong", "truongdb.24itb@vku.udn.vn", 'm'), 20.15, 99);
        System.out.println(booknew);
        System.out.println("Name : " + booknew.getName());
        System.out.println("Price : " + booknew.getPrice());
        System.out.println("Qty : " + booknew.getQty());
        System.out.println("Author : " + booknew.getAuthor());
        System.out.println("Name author : " + booknew.getAuthor().getName());
        System.out.println("Email author : " + booknew.getAuthor().getEmail());
    }
}