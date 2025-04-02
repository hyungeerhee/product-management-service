package com.hyungee.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    public void AgePlus() {
        this.age = this.age + 1;
    }
    public void AgeSet(Integer age) {
        if(age >=0 && age < 100) {
            this.age = age;
        }
    }

}
