package org.example.employees;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Company {
    @Id
    @GeneratedValue(generator = "company_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "company_gen",
            sequenceName = "company_seq",
            allocationSize = 1)
    private Long id;
    @Column(name = "company_name")
    private String name;
    @Column(name = "company_country")
    private String country;

    @OneToMany(
            cascade = {CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH,
            })
    private List<Product> products;

    public Company(String name, String country, List<Product> products) {
        this.name = name;
        this.country = country;
        this.products = products;
    }

    public Company(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", products=" + products +
                '}';
    }
}
