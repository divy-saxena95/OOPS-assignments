 //custom exception
class IllegalArgumentException extends Exception {
 
   
    }


public class SetText {
    public static void main(String[] args) {
       
 
        try {
 
            throw new IllegalArgumentException();
 
        } catch (IllegalArgumentException ex) {
            System.err.print(ex);
        }
    }
}
