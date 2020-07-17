package offtop.UserService.Models;

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

    public String first_name;
    public String last_name;
    public String city;
    public int age;
    public String gender;
    public String profession;
    public String email;
    public String username;
    public String created_at;
    public String deleted_at;

    public User() {
    }

    public User(int id, String first_name, String last_name, String city, int age, String gender, String profession,
            String email, String username, String created_at, String deleted_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
        this.email = email;
        this.username = username;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", city=" + city + ", created_at=" + created_at + ", deleted_at=" + deleted_at
                + ", email=" + email + ", first_name=" + first_name + ", gender=" + gender + ", id=" + id
                + ", last_name=" + last_name + ", profession=" + profession + ", username=" + username + "]";
    }

    
}