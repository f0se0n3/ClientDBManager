package ClientDB;

public class Client extends DBOperations {
    public String name;
    public int age;

    public Client(String clientName, int clientAge) {
        name = clientName;
        age = clientAge;
    }
    public Client() {}
}
