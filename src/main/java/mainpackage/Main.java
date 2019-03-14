package mainpackage;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    DataBaseConnection database = new DataBaseConnection();
    TestingInterface testInterface = new TestingInterface();
    InputValidation validate = new InputValidation();
    public static void main(String args[]) throws ParseException, IOException, ClassNotFoundException {

        Main main = new Main();
        main.login();
//        main.makeConnection();

    }
    public void makeConnection(){
        database.connection();
}
    public void login(){

        int choosse = 0;
    //   while (choosse != 4){
        testInterface.loginAs();
        Scanner sc = new Scanner(System.in);
//        choosse = validate.validateInputs();
        choosse = sc.nextInt();
            if (choosse == 1){
                testInterface.clientInterface();
                clientOptions();
            }else if(choosse == 2 ){
                testInterface.employeeInterface();
                employeeOptions();
            }else if (choosse == 3){
                testInterface.consultantInterface();
                consultantOptions();
            }else if (choosse == 4 ){
                System.out.println("Exiting Program");
                System.exit(0);

            }else{
                System.out.println(" Wrong Input Please Choose Again");
//                testInterface.loginAs();
            }
//        }
   }
   public void clientOptions(){
       Scanner sc = new Scanner(System.in);
       int option = 0;
       option = sc.nextInt();

       if(option == 1){
           System.out.println(" Request Number of clients ");
       }else if(option == 2 ){
           System.out.println("View all workers working for client from Agency ");
       }else if (option == 3 ){
           System.out.println("View hours Worked by the agency employees ");
       }else if (option == 4){
           System.out.println("View all Agency standby workers0");
       }else if (option == 5) {
           System.out.println("Back to LogIn ");
           System.exit(0);
           testInterface.loginAs();
       }

   }
    public void employeeOptions(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        option = sc.nextInt();

        if(option == 1){
            System.out.println(" Add availability  ");
        }else if(option == 2 ){
            System.out.println("View all Clients Working for  ");
        }else if (option == 3 ){
            System.out.println("View working Days  ");
        }else if (option == 4){
             System.out.println("View all standby Days");
        }else if (option == 5) {
            System.out.println("View Hours worked");
        }else if (option == 6){
            System.out.println("Back to LogIn ");
//            System.exit(0);
            testInterface.loginAs();
        }else {
            System.out.println("Bad choice");

        }

    }
    public void consultantOptions(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        option = sc.nextInt();

        if(option == 1){
            System.out.println(" View Available Employees ");
        }else if(option == 2 ){
            System.out.println("View Employees working Days  ");
        }else if (option == 3 ){
            System.out.println("View Employees working hours ");
        }else if (option == 4){
            System.out.println("View All StandBy Employees ");
        }else if (option == 5) {
            System.out.println("Back to LogIn ");
            System.exit(0);
            testInterface.loginAs();
        }

    }

}
