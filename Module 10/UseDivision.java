//Carmen Mendoza 
//CSD 402 
//Module 10 

public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of InternationalDivision
        InternationalDivision intlDiv1 = new InternationalDivision("Global Tech", 1001, "Germany", "German");
        InternationalDivision intlDiv2 = new InternationalDivision("Asia Expansion", 1002, "Japan", "Japanese");

        // Creating instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Operations", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Expansion", 2002, "California");

        // Displaying the details of each division
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
