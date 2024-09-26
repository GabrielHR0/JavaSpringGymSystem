package com.gym.gym_test.model;

import java.io.Serializable;
import java.time.LocalDate;  // Usando LocalDate em vez de java.sql.Date
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profiles")
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Indexed(unique = true)
    private long cpf;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;  // Alterado para LocalDate
    private String gender;
    private String email;
    private long phoneNumber;

    // Construtor com parâmetros
    public Profile(String id, String firstName, String lastName, String gender, String email, long cpf, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.cpf = cpf;
        this.birthDate = birthDate;  // Definindo birthDate corretamente
    }

    // Construtor vazio
    public Profile() {
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
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

    public LocalDate getBirthDate() {  // Retorna LocalDate
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {  // Define LocalDate
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
