package ClientDB;

import java.util.Scanner;

public class DBOperations extends ClientsList {
    public String name;
    public int age;

    public void addNewClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        Client client = new Client(name, age);
        clientArrayList.add(client); //client is null. why?
        getAllClientsList(); //show me that client now is in the list of all clients
    }

    public void getAllClientsList() {
        for (int i = 0;i < clientArrayList.size();i++) {
            System.out.println(clientArrayList.get(i).toString());
            System.out.println(clientArrayList.get(i));
        }
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + "; age=" + age + "]";
    }
}
