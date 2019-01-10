package com.example.mehed.contact_listrecycleview;

public class Contact {
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    private String phone;
}
