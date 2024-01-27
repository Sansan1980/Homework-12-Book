public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoi");
        //System.out.print(author.getName()+" ");
        // System.out.println(author.getSurname());

        Book book = new Book("Voina i mir", 2025, author.getName() + " " + author.getSurname());
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getYearIssue());
        book.setYearIssue(2000);
        System.out.println(book.getYearIssue());


        author = new Author("Gabriel", "Marquez");
        //System.out.print(author.getName() + " ");
        //System.out.println(author.getSurname());

        book = new Book("Stolet odinochestva", 2023, author.getName() + " " + author.getSurname());

        System.out.println(book.getAuthor());
        System.out.println(book.getYearIssue());
        System.out.println(book.getName());
    }
}