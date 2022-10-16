package Contracts;


import Users.Client;

public class Contract {
    private String type;

    public String getType() {
        return this.type;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private Client client;
}
