package org.example.employees;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(generator = "product_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "product_gen",
            sequenceName = "product_seq",
            allocationSize = 1)
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "year_of_issue")
    private LocalDate yearOfIssue;
    @Column(name = "price")
    private int price;

//    @ManyToOne(cascade = {
//            CascadeType.MERGE,
//            CascadeType.DETACH,
//            CascadeType.PERSIST,
//            CascadeType.REFRESH
//    })
//    private Company company;
    @ManyToOne
    (
            cascade = {CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH
            })
    private Category categories;

    public Product(String name, LocalDate yearOfIssue, int price) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", price=" + price +
                ", categories=" + categories +
                '}';
    }
}
