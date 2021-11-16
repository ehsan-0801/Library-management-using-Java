package package2;
import package1.*;


public interface BookOperations{

	void insertBook(Book[] b);
	void removeBook(int b);
	Book getBook(int bookId);
	void showAllBooks();

}