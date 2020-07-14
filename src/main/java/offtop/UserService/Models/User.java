package offtop.UserService.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String firstName;
    public String lastName;
    public String city;
    public int age;
    public String gender;
    public String profession;
    public String email;
    public String username;
    public String createdAt;
    public String deletedAt;

    public User(){
        super();
    }

    public User (int Id, String firstName, String lastName, String city, int age, String gender, String professional,
     String email, String username, String createdAt, String deletedAt ){
      
        super();
        this.id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.profession = professional;
        this.email = email;
        this.username = username;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfessional() {
        return profession;
    }

    public void setProfessional(String professional) {
        this.profession = professional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", age=" + age + ", city=" + city + ", createdAt=" + createdAt + ", deletedAt="
            + deletedAt + ", email=" + email + ", firstName=" + firstName + ", gender=" + gender + ", lastName="
            + lastName + ", profession=" + profession + ", username=" + username
            + "]";
    }

}