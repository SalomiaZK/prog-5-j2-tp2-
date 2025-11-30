package salomia.zk.prog5j2tp2.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class RentableTools extends Rentable{

    private  final Tool tool;
    private final Money rentAmount;

    public RentableTools(String id, boolean isAvalable, LocalDate startDate, LocalDate endDate, Money rentAmount, Tool tool, Money rentAmount1) {
        super(id, isAvalable, startDate, endDate, rentAmount);
        this.tool = tool;
        this.rentAmount = rentAmount1;
    }
}
