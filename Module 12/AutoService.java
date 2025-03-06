package Module_12;

//Carmen Mendoza
//CSD 402 
//Module 12 
//Write a program with four methods for calculating the cost of a yearly auto service visit. 

public class AutoService {
    // Standard service charge
    static final double STANDARD_CHARGE = 100.0;
    
    // yearlyService with no parameters
    public static double yearlyService() {
        return STANDARD_CHARGE;
    }
    
    // yearlyService with one parameter (oil change fee)
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_CHARGE + oilChangeFee;
    }
    
    // yearlyService with two parameters (oil change fee and tire rotation fee)
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_CHARGE + oilChangeFee + tireRotationFee;
    }
    
    // yearlyService with three parameters (oil change fee, tire rotation fee, and coupon discount)
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        return (STANDARD_CHARGE + oilChangeFee + tireRotationFee) - couponDiscount;
    }
    
    public static void main(String[] args) {
        // Test each method twice
        System.out.println("Test 1 - No parameters: " + yearlyService());
        System.out.println("Test 2 - No parameters: " + yearlyService());
        
        System.out.println("Test 3 - One parameter (oil change fee 30.0): " + yearlyService(30.0));
        System.out.println("Test 4 - One parameter (oil change fee 40.0): " + yearlyService(40.0));
        
        System.out.println("Test 5 - Two parameters (oil change 30.0, tire rotation 20.0): " + yearlyService(30.0, 20.0));
        System.out.println("Test 6 - Two parameters (oil change 40.0, tire rotation 25.0): " + yearlyService(40.0, 25.0));
        
        System.out.println("Test 7 - Three parameters (oil change 30.0, tire rotation 20.0, coupon 15.0): " + yearlyService(30.0, 20.0, 15.0));
        System.out.println("Test 8 - Three parameters (oil change 40.0, tire rotation 25.0, coupon 20.0): " + yearlyService(40.0, 25.0, 20.0));
    }
}
