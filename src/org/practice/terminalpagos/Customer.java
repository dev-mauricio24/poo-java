package org.practice.terminalpagos;

public class Customer {
    private String document;
    private String name;
    private String surname;
    private String phone;
    private String mail;

    public Customer(String document, String name, String surname, String phone, String mail) {
        this.document = document;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.mail = mail;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "document='" + document + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
