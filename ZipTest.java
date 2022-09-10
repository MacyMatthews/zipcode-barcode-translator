//*********************************
//
// Zip code class
//
// This is a test class for your zip code class.
// Your Zipcode class must work with this test class.
// Do not alter this class.
//
//*********************************

import java.util.Scanner;

public class ZipTest{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        //Convert from ZIP to bar code
        System.out.println("Please enter a ZIP code: ");
        int zip = input.nextInt();
        Zipcode code1 = new Zipcode(zip);
	    System.out.println("The corresponding bar code: ");
        System.out.println(code1.getBarcode());

        //Convert from bar to ZIP code
	    System.out.println("Now please provide a bar code: ");
	    String bar = input.next();
	    Zipcode code2 = new Zipcode(bar);
	    System.out.println("The corresponding ZIP code: ");
	    System.out.println(code2.getZIPcode());
    }
}
    

