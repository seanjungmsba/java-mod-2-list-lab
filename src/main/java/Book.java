class Book {

    private String title, genre;
    private int numPages;

    public Book(String title, String genre, int numPages){
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    @Override
    public String toString(){
        return "[Title: " + this.title + " | Genre: " + this.genre + " | Pages: " + this.numPages + "]";
    }

}