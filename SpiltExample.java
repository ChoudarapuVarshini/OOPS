package oops;

public class SpiltExample {
	 public static void main(String[] args) {
	        String s = "apple,banana,grape,orange";
	        String[] fruits = s.split(",");
	        for(String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }


}
