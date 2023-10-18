package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="actor")
public class Actor {
    @Id
    @Column(name="actor_id")
    @GeneratedValue(generator="actor")
    @TableGenerator(
            name="actor",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;

    private String first_name;
    private String last_name;
    private Date last_update;
    @OneToMany
    private List<Film> films;
}
