public class assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("John Kerwin");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("Lagdan");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("Briñas");
        }
        // char array
        
        String[] myFirstName = {"J","O","H","N","K","E","R","W","I","N"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse

        //For loop
        char[] firstname2 = {'J', 'O', 'H', 'N', 'K', 'E', 'R', 'W', 'I', 'N'};

            for (int r = 5; r >= 0; r--){
            System.out.print(firstname2[r]);
    }
    }
}
