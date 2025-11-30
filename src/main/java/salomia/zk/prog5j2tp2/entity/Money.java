package salomia.zk.prog5j2tp2.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Money {
    private final String id;
    private  final String currency;
    private final BigDecimal amount;

}
