package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="inventory")
public class Inventory {
    @Id
    @Column(name="film_id")
    @GeneratedValue(generator="film")
    @TableGenerator(
            name="film",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    @OneToOne
    private Film film;
    @OneToOne
    private Store store;
    private Date last_update;
}
