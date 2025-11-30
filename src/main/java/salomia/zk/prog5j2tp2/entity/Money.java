package salomia.zk.prog5j2tp2.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Money {
    private  final String currency;
    private final long amount;

}
