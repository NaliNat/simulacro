package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="country")
public class Country {
    @Id
    @Column(name="country_id")
    @GeneratedValue(generator="country")
    @TableGenerator(
            name="country",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    private String country;
    private Date last_update;
}
