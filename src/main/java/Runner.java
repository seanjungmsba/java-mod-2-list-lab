
import java.util.Scanner;

class Runner {

    private static String title, genre;
    private static int pageNum; 
    private static String[][] bookDescriptions = {
        {"title", "Title: "},
        {"genre","Genre: "},
        {"pageNum", "Page Number: "}};

    public static void holdBooks(){

        String input;
        int counter = 0;

        try ( Scanner scanner = new Scanner(System.in) ) {

            System.out.println("To end program, press 'ENTER' anytime");
            while (true) {
                for (String[] description: bookDescriptions) {
                    System.out.print(description[1]); // displays title, genre, or pageNum
                    input = scanner.nextLine().trim();

                    // if nothing is entered, end the program
                    if(input.equals("")) {
                        return ;
                    }

                    // correctly assign user inputs to respective book descriptions
                    if (description[0] == "title") {
                        title = input;
                    } else if (description[0] == "genre") {
                        genre = input;
                    } else if (description[0] == "pageNum") {
                        pageNum = Integer.parseInt(input);
                    }

                }
                System.out.println("(the book you entered is successfully added)");
                counter++;

                Book book = new Book(title, genre, pageNum); // initialize book
                Library.addBook(book); // adding an element in ArrayList
                
            }
        } catch (Exception e){
            System.out.println("Error probably not a number for pages");
        } finally {
            if (counter == 1)
                System.out.println("You only have " + counter + " book in your library:");
            else
                System.out.println("You have a total of " + counter + " books in your library:");
            System.out.println(Library.books);
        }

    }

}