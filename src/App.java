
/**
* You are going to write code to store a list of book titles for a 
* classroom library. You will create an ArrayList for Strings, then accept user 
* input to add titles to that ArrayList. There will be additional modifications 
* you can make:

* B Level:
* Accept input from users and add book titles to the ArrayList.

* B+ Level:
* Accept titles from users and stop accepting input when the user enters "done". 
* After this, the full list of titles should be printed, one title per line.

* A- Level:
* Complete B and B+. Additionally, do not allow duplicates. If the user enters a 
* title that already exists, tell them that the title has already been entered, but 
* continue accepting new titles.

* A+ Level:
* Complete B and B+. Modify A- so that when a duplicate title is entered, the user 
* is asked whether they want to remove the existing title. If they enter "yes", the 
* title is removed from the list. If they type anything else, the duplicate title is 
* ignored, and no change is made to the list.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<String>();
        while (true) {
            System.out.println("Give a book ");
             String book = scanner.nextLine();
            if (book.equals ("done")) {
                break;
            } 
            if (books.contains(book)) {
                System.out.println("Do you want to remove this from the list");
                String answer = scanner.nextLine();
                if (answer.equals ("yes")) {
                    books.remove(book);
                    
                }
            }
            else {books.add(book);}
            
        }
        System.out.println("Final List:");
        for (String list:books){
            System.out.println(list);
        }
    }
}
