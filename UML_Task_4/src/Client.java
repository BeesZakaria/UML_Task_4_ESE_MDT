import Licenses.License;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private String name;
    private String id;

    public Set<License> getLicenses() {
        return licenses;
    }

    private Set<License> licenses;

    public Client(String name, String id, License license) {
        this.name = name;
        this.id = id;
        this.licenses = new HashSet<>();
        this.licenses.add(license);
    }

    public void removeLicense( License license) {
        this.licenses.remove(license);
    }
    public void addLicense(License license) {
        this.licenses.add(license);
    }
    public void payBill() {
        System.out.println(this.name  + "paid his Bill");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
