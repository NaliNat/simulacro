package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="language")
public class Language {
    @Id
//    @Column(name="language_id")
    @GeneratedValue(generator="language")
    @TableGenerator(
            name="language",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    private String name;
    private Date last_update;
}
