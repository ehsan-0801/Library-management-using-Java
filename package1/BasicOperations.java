package package1;

	public interface BasicOperations{

	void borrow(Patron p, Book b);

	void ret(Patron p, Book b);

	void fine(Patron p,double amount);
}