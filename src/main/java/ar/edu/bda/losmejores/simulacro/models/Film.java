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
@Table(name="film")
public class Film {
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
    private String title;
    @Nullable
    private String release_year;
    @Nullable
    private String description;
    @Nullable
    @OneToOne
    private Language original_language;
    @OneToOne
    private Language language;
    private int rental_duration;
    private double rental_rate;
    @Nullable
    private int length;
    private double replacement_cost;
    private String rating;
    @Nullable
    private String special_features;
    private Date last_update;
    @OneToMany
    private List<Actor> actors;
    @OneToMany
    private List<Category> categories;

}
