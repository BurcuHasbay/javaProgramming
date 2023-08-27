package day42_Exception;


class NoBreakException extends Exception{


}
public class CustomException {
    public static void main(String[] args) {


try {
    throw new NoBreakException();
}catch (NoBreakException e){
    e.printStackTrace();
}





    }
}
