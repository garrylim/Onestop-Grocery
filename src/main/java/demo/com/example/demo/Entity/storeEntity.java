package demo.com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "store")
public class storeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String localities;

    public storeEntity() {
    }

    public storeEntity(String name, String phoneNumber, String localities) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.localities = localities;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Please insert store name");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Please insert store phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getLocalities() {
        return localities;
    }

    public void setLocalities(String localities) {
        if (localities == null || localities.isEmpty()) {
            throw new IllegalArgumentException("Please insert store locality");
        }
        this.localities = localities;
    }
}
