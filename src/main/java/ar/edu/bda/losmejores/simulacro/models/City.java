package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="city")
public class City {
    @Id
    @Column(name="city_id")
    @GeneratedValue(generator="city")
    @TableGenerator(
            name="city",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    private String city;
    @OneToOne
    private Country country;
    private Date last_update;
}
