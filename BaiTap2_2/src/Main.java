public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Truong", "dbtruong57@gmail.com", 'M');
        Author author2 = new Author("BaTruong", "truongdb.24itb@vku.udn.vn", 'M');


        Author[] authors = {author1, author2};


        Book book = new Book("SachNgu", authors, 19.99, 100);


        System.out.println(book);
    }
}