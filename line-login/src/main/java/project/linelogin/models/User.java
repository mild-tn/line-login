package project.linelogin.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @NotNull
    public String username;

    @NotNull
    public String password;

    @NotNull
    public String lineId;

    @NotNull
    public String firstName;

    @NotNull
    public String lastName;

    public User(){

    }

    public User(@NotNull String username,@NotNull String password,@NotNull String lineId){
        this.lineId = lineId;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public String getLineId() {
        return lineId;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
