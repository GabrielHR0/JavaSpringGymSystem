package com.gym.gym_test.model;
import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer _id;
    private Integer userRegistration;
    private String password;
    private UserRole userRole;

    public User(Integer id, Integer userRegistration, String password, UserRole userRole){
        this._id = id;
        this.userRegistration = userRegistration;
        this.password = password;
        this.userRole = userRole;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(Integer Userid) {
        this._id = Userid;
    }

    public Integer getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(Integer userName) {
        this.userRegistration = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_id == null) ? 0 : _id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (_id == null) {
            if (other._id != null)
                return false;
        } else if (!_id.equals(other._id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + _id +
                ", Matrícula='" + userRegistration + '\'' +
                ", Tipo de usuário=" + userRole +
                '}';
    }
}
