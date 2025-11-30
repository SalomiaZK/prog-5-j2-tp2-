package salomia.zk.prog5j2tp2.entity;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
public class RentableMoney extends Rentable{
    private final long rateInterest;
    private final Money money;

    public RentableMoney(String id, boolean isAvalable, LocalDate startDate, LocalDate endDate, long rateInterest, Money money) {
        super(id, isAvalable, startDate, endDate);
        this.rateInterest = rateInterest;
        this.money = money;
    }

    public Money getTotalLocatioPrice(){

        return new Money(
                money.getCurrency(),
                money.getAmount() + money.getAmount()*rateInterest/100
        );
    }


}
