	//implement library using java class library
		//Methods :issueBool,returnBook,addBook,showAvailableBook
		//properties:Array to store available book
        //Array to store issue book


class OnlineLibrary{
    public String[] availableBooks = new String[100];
    public String[] issuedBooks = new String[100];

    public void showAvailableBooks(){
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i]==null) {
                continue;
            } else {
                System.out.println(availableBooks[i]);
            }
        }
    }
    public void addBooks(String bookName){
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i]==bookName) {
                System.out.println("This book is already present in the library");
                return;
            } else if(availableBooks[i]==null){
                availableBooks[i] = bookName;
                System.out.println("Book added successfully");
                return;
            }
        }
    }
    public void issueBook(String bookName){
        boolean flag = true;
        for (int i = 0; i < availableBooks.length; i++) {
            if (bookName==availableBooks[i]) {
                availableBooks[i] = null;
                for (int j = 0; j < issuedBooks.length; j++) {
                    if (issuedBooks[i]==null) {
                        issuedBooks[i]=bookName;
                        break;
                    }
                }
                System.out.println("Book issued successfully");
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag==false) {
            System.out.println("This book is not available. Sorry");
        }
    }

    public void returnBook(String bookName){
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i]==bookName) {
                issuedBooks[i]=null;
                for (int j = 0; j < availableBooks.length; j++) {
                    if (availableBooks[i]==null) {
                        availableBooks[i]=bookName;
                        break;
                    }
                }
                System.out.println("Thank you for returning");
                return;
            } else {
                System.out.println("This book has not been issued");
                return;
            }
        }
    }
    public void ShowIssuedBooks(){
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i]==null) {
                continue;
            } else {
                System.out.println(issuedBooks[i]);
            }
        }
    }

}
public class gameOnlineLibrary {
    public static void main(String[] args) {
        OnlineLibrary aec = new OnlineLibrary();
        aec.addBooks("Hindi");
        aec.addBooks("English");
        aec.addBooks("Math");
        aec.addBooks("Physics");
        aec.addBooks("Biology");
        aec.addBooks("Chemistry");
        aec.addBooks("Economics");
        aec.issueBook("Math");
        aec.issueBook("Economics");
        aec.ShowIssuedBooks();
    }
}