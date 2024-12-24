public class Logic {

    public int division(int x, int y) throws ArithmeticException {
        return y / x;
        
    }
    public void stringException(String x,int y)throws ArrayIndexOutOfBoundsException{
        
    for (int i = 0; i < y; i++) {
        System.out.print(x.charAt(i)+"\t"); 
    }
    System.out.println(" ");
}

public int sum(int x, int y) throws CustomException {
    if (x<=0) {
        throw new CustomException("Invalid Values");
    }
    else
    return y / x;

}
}
