package belajar;

public class Person {
    private String name;
    private String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void addressToString(String address) {
        System.out.println("person address " + address);
    }
}

