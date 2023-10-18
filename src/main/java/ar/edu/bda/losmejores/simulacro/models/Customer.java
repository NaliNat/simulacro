package ar.edu.bda.losmejores.simulacro.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="customer_id")
    @GeneratedValue(generator="customer")
    @TableGenerator(
            name="customer",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    @OneToOne
    private Store store;
    private String first_name;
    private String last_name;
    @Nullable
    private String email;
    @OneToOne
    private Address address;
    private char active;
    private Date create_date;
    private Date last_update;
    @OneToMany
    private List<Rental> rentals;

}
