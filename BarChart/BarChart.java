// Bar chart printing program
public class BarChart{
	public static void main (String[] args){
		int[] hist = {0, 1, 4, 7, 10};
		char[] labs = {'a', 'b', 'c', 'd', 'e'};
		for (int i=0; i<hist.length; i++){
			System.out.printf("%c: ", labs[i]);
			for (int j=0; j<hist[i]; j++){
				System.out.print("*");
			} // end asterix
			System.out.println();
		} // end labels
	} // end main
} // end class
