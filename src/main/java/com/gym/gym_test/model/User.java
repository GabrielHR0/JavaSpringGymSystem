package com.gym.gym_test.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "users")  // Adicionando o nome da coleção
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;

    @Indexed(unique = true)
    private Integer matriculation;
    
    private String userName;
    private String password;
    private UserRole userRole;

    // Construtor padrão
    public User() {
    }

    // Construtor com parâmetros
    public User(String id, String userName, Integer matriculation, String password, UserRole userRole) {
        this.id = id;
        this.userName = userName;
        this.matriculation = matriculation;
        this.password = password;
        this.userRole = userRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id; 
    }

    public Integer getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(Integer matriculation) {
        this.matriculation = matriculation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());  // Corrigido para usar 'id'
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +  // Ajustado para usar 'id'
                ", userRegistration=" + userName +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
