package ClientDB;

import java.util.Scanner;

public class PromptInputFromUser {
    public static void main(String[] args) {
        PromptInputFromUser promptInputFromUser = new PromptInputFromUser();
        promptInputFromUser.mainMenu();
    }

    public int mainMenu() {
        System.out.println("Clients manager v.1.0. build 1.0");
        System.out.println("1. Add client.");
        System.out.println("2. Search client.");
        System.out.println("3. Clients list.");
        System.out.print(">: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                //add new client to db
                DBOperations dbOperations = new DBOperations();
                dbOperations.addNewClient();
                break;
            case 2:
                //search client
                break;
            case 3:
                //show all clients
                break;
            default:
                System.out.println("Use only numbers! Try again.");
                mainMenu();
                break;
        }
        return choice;
    }
}