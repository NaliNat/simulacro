package ar.edu.bda.losmejores.simulacro.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name="store")
public class Store {
    @Id
    @Column(name="store_id")
    @GeneratedValue(generator="store")
    @TableGenerator(
            name="store",
            table="sqlite_sequence",
            pkColumnName = "name", valueColumnName="seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private Long id;
    @OneToOne
    private Staff manager;
    @OneToMany
    private List<Staff> staff;
    @OneToOne
    private Address address;
    private Date last_update;
    @OneToMany
    private List<Inventory> inventories;
}
