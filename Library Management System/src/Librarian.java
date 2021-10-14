public class Librarian extends SystemUser{

    Search searchObj;
    BookIssueService bookIssueService;

    public boolean addBook(BookItem bookItem) {
        return false;
    }

    public BookItem deleteBook(String barcode) {
        return null;
    }

    public BookItem editBookItem(BookItem bookItem) {
        return null;
    }


}
