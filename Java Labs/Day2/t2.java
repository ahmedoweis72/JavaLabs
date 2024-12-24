class Task2 {
    public static int binarySearch(int target,int arrx[])
    {
        int left=0;
        int right= arrx.length-1;

        while (left <= right){
            int mid=(left+right)/2;
            if (target==arrx[mid]){
            return mid;
            } else if (target<arrx[mid]) {
               right=mid-1;
            }else {

            left=mid+1;
        }

    }
    return -1;}
    public static void main(String[] args) {


        int min=0,max=0;
        int arr[]=new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }

        min= binarySearch(5,arr);
        max= binarySearch(15,arr);
        System.out.println(min+" "+max);
       


    }

}
