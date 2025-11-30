package salomia.zk.prog5j2tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableMoney;
import salomia.zk.prog5j2tp2.entity.Renter;
import salomia.zk.prog5j2tp2.service.MoneyRenting;

import java.util.ArrayList;

@Controller
public class MoneyController {
    private final MoneyRenting moneyRenting;

    public MoneyController(MoneyRenting moneyRenting) {
        this.moneyRenting = moneyRenting;
    }

    @PostMapping("/rent/money")
    public Rent rentMoeny(@RequestBody ArrayList<RentableMoney> rentableMoney, @RequestBody Renter renter ) {
        return moneyRenting.rent(rentableMoney, renter);
    }
}
