class Task3 {
    public static void main(String[] args) {
	
	try{
	String numberRegex = "^-?\\d*\\.?\\d+$";
	 if (args[0].matches(numberRegex)) {
               	int x =Integer.parseInt(args[0]);
        for (int i = 0; i < x; i++) {
            System.out.println(args[1]);
        }
        } else {
            System.out.println("Invalid input. Only numbers are allowed.");
	}}
	catch(Exception e){
		System.out.println("Error please enter value"+e);
	}
		
		

    }
}
