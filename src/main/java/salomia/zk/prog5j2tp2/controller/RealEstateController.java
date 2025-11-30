package salomia.zk.prog5j2tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableRealEstate;
import salomia.zk.prog5j2tp2.entity.Renter;
import salomia.zk.prog5j2tp2.service.RealEstateRenting;

import java.security.Principal;
import java.util.ArrayList;

@Controller
public class RealEstateController {
    private final RealEstateRenting realEstateRenting;

    public RealEstateController(RealEstateRenting realEstateRenting) {
        this.realEstateRenting = realEstateRenting;
    }

    @PostMapping("/rent/realEstate")
    public Rent rentRealEstate(@RequestBody ArrayList<RentableRealEstate> realEstates, @RequestBody Renter renter) {
        return realEstateRenting.rent(realEstates, renter );
    }
}
