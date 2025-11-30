package salomia.zk.prog5j2tp2.entity;

import lombok.Getter;

import java.time.LocalDate;


@Getter
public class RentableRealEstate extends Rentable{
    private final String id;
    private final RealEstate realEstate;
    private final Money priceByMeterSquare;
    private final int meterSquare;

    public RentableRealEstate(String id, boolean isAvalable, LocalDate startDate, LocalDate endDate, String id1, RealEstate realEstate, Money priceByMeterSquare, int meterSquare) {
        super(id, isAvalable, startDate, endDate);
        this.id = id1;
        this.realEstate = realEstate;
        this.priceByMeterSquare = priceByMeterSquare;
        this.meterSquare = meterSquare;
    }

    public Money getTotalPriceByMeterSquare() {
        return
                new Money(
                        priceByMeterSquare.getCurrency(),
                        priceByMeterSquare.getAmount()*this.getMeterSquare()

                );
    }

}
