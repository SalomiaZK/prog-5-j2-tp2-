package salomia.zk.prog5j2tp2.entity;

import lombok.AllArgsConstructor;

import java.time.LocalDate;


public class RentableRealEstate extends Rentable{

    private final String location;
    private final long area;
    private final String type;
    private final String description;
    private final Money price;

    public RentableRealEstate(String id, boolean isAvalable, LocalDate startDate, LocalDate endDate, Money rentAmount, String location, long area, String type, String description, Money price) {
        super(id, isAvalable, startDate, endDate);
        this.location = location;
        this.area = area;
        this.type = type;
        this.description = description;
        this.price = price;
    }
}
