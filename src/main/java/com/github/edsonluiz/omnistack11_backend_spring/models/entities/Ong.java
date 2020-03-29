package com.github.edsonluiz.omnistack11_backend_spring.models.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "ongs")
public class Ong implements Serializable {
  private static final long serialVersionUID = 6041467582811809570L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Name should not be blank")
  private String name;

  @Email(message = "Email sould be valid")
  @Column(unique = true, nullable = false)
  private String email;

  @NotBlank
  @Length(min = 11, max = 14, message = "Whatsapp number should be in range of 11 and 14 characters")
  private String whatsapp;

  @NotBlank
  private String city;

  @NotBlank
  @Length(min = 2, max = 2, message = "UF should not have more than 2 characters")
  private String uf;

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
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWhatsapp() {
    return whatsapp;
  }

  public void setWhatsapp(String whatsapp) {
    this.whatsapp = whatsapp;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }
}
