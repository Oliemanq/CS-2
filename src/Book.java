public class Book {

    /**
     *  default constructor
     */
    public Book(String name,String author) {
        this.name = name;
        this.author = author;

    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public void print(){
        System.out.println("Book name: " + this.name);
        System.out.println("Author: " + this.author);
    }

    private String name;
    private String author;

}