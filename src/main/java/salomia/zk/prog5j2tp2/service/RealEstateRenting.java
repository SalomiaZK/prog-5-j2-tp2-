package salomia.zk.prog5j2tp2.service;

import org.springframework.stereotype.Service;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableRealEstate;
import salomia.zk.prog5j2tp2.entity.Renter;
import salomia.zk.prog5j2tp2.repository.RentRepository;

import java.util.ArrayList;

@Service
public class RealEstateRenting  implements EntityRenting<RentableRealEstate> {
    private RentRepository rentRepository;

    public RealEstateRenting(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @Override
    public Rent rent(ArrayList<RentableRealEstate> rentables, Renter renter) {
       return  rentRepository.save( new Rent(rentables, renter, false) )  ;

    }
}
