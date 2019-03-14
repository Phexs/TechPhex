package mainpackage;

public class TestingInterface {

     void loginAs(){
         System.out.println("+-------------------------------------------+");
         System.out.println("|             LOGIN AS                      |");
         System.out.println("+-------------------------------------------+");
         System.out.println("|     1. Client                             |");
         System.out.println("|     2. Employees                          |");
         System.out.println("|     3. Consultant                         |");
         System.out.println("|     4. EXIT                               |");
         System.out.println("+-------------------------------------------+");
         System.out.println("Please, make a selection [1-4]");
     }
     void clientInterface(){
         System.out.println("+-------------------------------------------+");
         System.out.println("|             CLIENT MENU OPTIONS           |");
         System.out.println("+-------------------------------------------+");
         System.out.println("|     1. Request Client                     |");
         System.out.println("|     2. View employees                     |");
         System.out.println("|     3. View hours worked                  |");
         System.out.println("|     4. View standby employees             |");
         System.out.println("|     5. EXIT                               |");
         System.out.println("+-------------------------------------------+");
         System.out.println("Please, make a selection [1-5]");

     }
    void employeeInterface(){
        System.out.println("+-------------------------------------------+");
        System.out.println("|            EMPLOYEE MENU OPTIONS          |");
        System.out.println("+-------------------------------------------+");
        System.out.println("|     1. Add Availability                   |");
        System.out.println("|     2. View Clients                       |");
        System.out.println("|     3. View working Days                  |");
        System.out.println("|     4. View Standby Days                  |");
        System.out.println("|     5. View Hours Worked                  |");
        System.out.println("|     6. EXIT                               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("Please, make a selection [1-6]");

    }
    void consultantInterface(){
        System.out.println("+-------------------------------------------+");
        System.out.println("|         CONSULTANT MENU OPTIONS           |");
        System.out.println("+-------------------------------------------+");
        System.out.println("|     1. View Available Employees           |");
        System.out.println("|     2. View Hours worked                  |");
        System.out.println("|     3. View Working hours                 |");
        System.out.println("|     4. View Standby Employees             |");
        System.out.println("|     5. EXIT                               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("Please, make a selection [1-5]");

    }
}
