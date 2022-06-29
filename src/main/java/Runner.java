
import java.util.Scanner;

class Runner {

    private static String title, genre;
    private static int pageNum; 
    private static String[][] bookDescriptions = {
        {"title", "Title: "},
        {"genre","Genre: "},
        {"pageNum", "Page Number: "}};

    public static void addBooks() {

        int counter = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("To end program, press 'ENTER' anytime");
            boolean processing = true;
            while (processing) {
                for (String[] description: bookDescriptions) {
                    System.out.print(description[1]); // displays Title, Genre, or Page Number
                    try {
                        String input = sc.nextLine().trim();
                        if(input.equals("")) { // if nothing is entered, end the program
                            return ;
                        }
                        // correctly assign user inputs to respective book descriptions
                        if (description[0].equals("title")) {
                            title = input;
                        } else if (description[0].equals("genre")) {
                            genre = input;
                        } else if (description[0].equals("pageNum")) {
                            pageNum = Integer.parseInt(input);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        sc.next();
                    }
                } // end of enhanced for-loop
                System.out.println("(the book is successfully added)");
                counter++;

                Book book = new Book(title, genre, pageNum); // initialize book
                Library.addBook(book); // adding a Book object in Library
            } // end of while-loop
        } catch (Exception e){
            System.out.println("Error probably not a number for pages");
        } finally {
            if (counter == 1)
                System.out.println("You only have " + counter + " book");
            else
                System.out.println("You have a total of " + counter + " books");
            System.out.println("Books in your library ===> " + Library.books);
        }

    }

}