package sync;

import java.util.Scanner;

public class book {

 public int sNo;
 public String bookName;
 public String authorName;
 public int bookQty;
 public int bookQtyCopy;

 Scanner input = new Scanner(System.in);

 public book()

 {
     System.out.println("Enter Serial No of Book:");
     Scanner sc = new Scanner(System.in);
     sc.nextLine();
     System.out.println("Enter Book Name:");
     this.bookName = sc.nextLine();
     System.out.println("Enter Author Name:");
     this.authorName = sc.nextLine();
     System.out.println("Enter Quantity of Books:");
     this.bookQty = sc.nextInt();
     bookQtyCopy = this.bookQty;

 }
}




