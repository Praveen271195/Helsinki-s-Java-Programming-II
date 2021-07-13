
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Loop to keep asking till the enters the"end"
        while(true){
            String command = scanner.nextLine().toLowerCase();
            if (command.equals("end")){
                break;
            }else{
                int inputNumber = Integer.parseInt(command);
                System.out.println(inputNumber*inputNumber*inputNumber);
            }
        }
        
        

    }
}
