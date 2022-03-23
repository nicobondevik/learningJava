import java.util.EnumSet;

public class BookTest{
	public static void main(String[] args){
		for (Book book : Book.values()){
			System.out.printf("%-10s%-45s%s%n", 
			book, book.getTitle(), book.getCopyrightYear());
		}

		System.out.printf(
		"%nDisplay a range of enum constants:%n");

		// print first four books
		for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)){
			System.out.printf("%-10s%-45s%s%n",
			book, book.getTitle(), book.getCopyrightYear());
		}
	} // end main
} // end class EnumTest
