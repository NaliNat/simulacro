package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="category")
public class Category {
    @Id
    @Column(name="category_id")
    @GeneratedValue(generator="category")
    @TableGenerator(
            name="category",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    private String name;
    private Date last_update;
}
