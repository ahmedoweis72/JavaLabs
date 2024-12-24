import java.util.Random;

class Task1 {
    public static void main(String[] args) {
        int min=0,max=0;
        int arr[]=new int[1000];
        Random rand=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(100);

        }
        long startTime = System. nanoTime();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        long elapsedNanos = System. nanoTime() - startTime;
        System.out.println("Elapsed time: "+elapsedNanos+" ns");

    }
}
