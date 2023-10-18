package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="rental")
public class Rental {
    @Id
    @Column(name="rental_id")
    @GeneratedValue(generator="rental")
    @TableGenerator(
            name="rental",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    private Date rental_date;
    @OneToOne
    private Inventory inventory;
    @OneToOne
    private Customer customer;
    private Date return_date;
    @OneToOne
    private Staff staff;
    private Date last_update;
}
