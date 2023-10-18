package ar.edu.bda.losmejores.simulacro.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="address")
public class Address {
    @Id
    @Column(name="address_id")
    @GeneratedValue(generator="address")
    @TableGenerator(
            name="address",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    private String address;
    @Nullable
    private String address2;
    private String district;
    @OneToOne
    private City city;
    @Nullable
    private String postal_code;
    private String phone;
    private Date last_update;
}
