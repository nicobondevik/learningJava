// Testing the Date class

public class DateTest{
    public static void main(String[] args){
        // initialization
        Date d1 = new Date(30, 8, 1996);
        
        try{
            Date d2 = new Date(31, 6, 2020);
        }
        catch(IllegalArgumentException e){
            System.out.printf("d2 error: %s%n", e);
        }

        try{
            Date d3 = new Date(29, 2, 2022);
        }
        catch(IllegalArgumentException e){
            System.out.printf("d3 error %s%n", e);
        }

        try{
            Date d4 = new Date(29, 2, 2024);
        }
        catch(IllegalArgumentException e){
            System.out.printf("d4 error %s%n", e);
        }

        try{
            Date d5 = new Date(30, 8, 3000);
        }
        catch(IllegalArgumentException e){
            System.out.printf("d5 error %s%n", e);
        }

        Date d6 = new Date(29, 11, 22);

        System.out.printf("Date before nextDay():\t%s%n", d6);
        for (int i=0; i < 40; i++){
            d6.nextDay();
            System.out.printf("Date:\t%s%n", d6);
        }
    } // end main
} // end test
