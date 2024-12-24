public class Main {
    public static void main(String args[]) {

        try {
            Logic l = new Logic();
            l.sum(0, 5);
            // l.sum(-5, 10);
            // l.stringException("Ahmed",20);
        } catch (CustomException e) {

            e.printStackTrace();
            System.out.println("errrrrrrror =>" +
                    e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException =>" +
                    e.getMessage());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("IllegalArgumentException =>" +
                    e.getMessage());
        }finally{
            System.out.println("End of Main");
        }

    }
}