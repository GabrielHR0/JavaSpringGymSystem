package com.gym.gym_test.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import org.springframework.data.annotation.Id;

@Document(collection = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;

    @Indexed(unique = true)
    @NonNull
    private Integer matriculation;
    
    @NonNull
    private String password;

    private String profileId;
    private String contractId;

    

    // Construtor padrão
    public User() {
    }

    public User(String profileId) {
        this.profileId = profileId;
    }

    // Construtor com parâmetros sem profile id
    /*public User(String id, String password) {
        this.id = id;
        this.matriculation = MatriculationGenerator.generateMatriculation();  // Geração automática
        this.password = password;
    }*/

    // Construtor com parâmetros
    public User(String id, Integer matriculation, String password, String profileId) {
        this.id = id;
        this.matriculation = matriculation;
        this.password = password;
        this.profileId = profileId;
    }

    // Getters and Setters
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                ", Matriculation=" + matriculation +
                ", password='" + password + '\'' +
                '}';
    }
}
