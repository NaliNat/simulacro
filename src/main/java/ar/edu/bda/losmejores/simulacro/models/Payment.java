package ar.edu.bda.losmejores.simulacro.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="payment")
public class Payment {
    @Id
    @Column(name="payment_id")
    @GeneratedValue(generator="payment")
    @TableGenerator(
            name="payment",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Staff staff;
    @Nullable
    @OneToOne
    private Rental rental;
    private double amount;
    private Date payment_date;
    private Date last_update;
}
