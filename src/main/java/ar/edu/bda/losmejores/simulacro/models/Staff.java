package ar.edu.bda.losmejores.simulacro.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="staff")
public class Staff {
    @Id
    @Column(name="staff_id")
    @GeneratedValue(generator="staff")
    @TableGenerator(
            name="staff",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    @OneToOne
    private Address address;
    private String first_name;
    private String last_name;
    @Nullable
    @Lob
    private byte[] picture;
    @Nullable
    private String email;
    @OneToOne
    private Store store;
    private int active;
    private String username;
    @Nullable
    private String password;
    private Date last_update;
}
