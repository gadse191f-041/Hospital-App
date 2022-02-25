package com.example.familylove.model;

public class NewUser {
    private String name;
    private String nic;
    private String address;
    private String telephone;

    public NewUser(){}

    public NewUser(String name, String nic, String address, String telephone) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
