package demo.com.example.demo.Entity;

public class storeEntity {
    private String name;
    private String address;

    public storeEntity(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {  //store name
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public String getAddress() { //store address
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

