package it.unical.ingsw2020.ProvaLab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyString myString = new MyString();
       System.out.println( myString.invertiStringa("gesu"));
       if(myString.isPalindroma("itopinonavevanonipoti"))
    	   System.out.println("Palindroma");
       else
    	   System.out.println("Non Palindroma");
    }
}
