package salomia.zk.prog5j2tp2.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public abstract class  Rentable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;
    private  boolean isAvalable;
    private  LocalDate startDate;
    private  LocalDate endDate;
}
