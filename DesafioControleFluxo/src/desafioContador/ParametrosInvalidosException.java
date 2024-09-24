package desafioContador; 

public class ParametrosInvalidosException extends Exception {
   
    public  ParametrosInvalidosException() {
        super(); 
        
     }

    public ParametrosInvalidosException(String message){
        super(message); 
    }

    public ParametrosInvalidosException(String message, Throwable cause){
        super(message, cause);
    }

    public ParametrosInvalidosException(Throwable cause){
        super(cause); 
    }

}
