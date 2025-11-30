package salomia.zk.prog5j2tp2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
public abstract class  Rentable {
    private final String id;
    private final boolean isAvalable;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Money  rentAmount;
}
