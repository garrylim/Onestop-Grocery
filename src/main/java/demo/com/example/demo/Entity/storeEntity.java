package demo.com.example.demo.Entity;

public class storeEntity {
<<<<<<< Updated upstream
    private Long id;
    private String name;
    private String address;

    public storeEntity(Long id, String name, String address) {
        this.id = id;
=======
    private String name;
    private String address;

    public storeEntity(String name, String address) {
>>>>>>> Stashed changes
        this.name = name;
        this.address = address;
    }

<<<<<<< Updated upstream
    public Long getId() {  //store id
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
