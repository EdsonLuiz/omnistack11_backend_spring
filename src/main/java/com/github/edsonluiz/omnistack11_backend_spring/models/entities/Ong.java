package com.github.edsonluiz.omnistack11_backend_spring.models.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "ongs")
public class Ong implements Serializable {
  private static final long serialVersionUID = 6041467582811809570L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonIgnore
  private String ong_id;

  @NotBlank(message = "Name should not be blank")
  private String name;

  @Email(message = "Email should be valid")
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

  public String getOng_id() {
    return ong_id;
  }

  public void setOng_id(String ong_id) {
    this.ong_id = ong_id;
  }
}
