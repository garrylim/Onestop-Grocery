package demo.com.example.demo.Entity;

public class userEntity {
<<<<<<< Updated upstream
    private long id;
    private String name;
    private String phoneNumber;
    private String address;

    public userEntity(long id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
=======
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;

    public userEntity(String username, String password, String email, String phoneNumber, String address) {
        
        this.username = username;
        this.password = password;
        this.email = email;
>>>>>>> Stashed changes
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

<<<<<<< Updated upstream
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
=======
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
>>>>>>> Stashed changes
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
