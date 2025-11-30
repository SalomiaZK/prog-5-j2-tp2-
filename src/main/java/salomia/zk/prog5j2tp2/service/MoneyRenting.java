package salomia.zk.prog5j2tp2.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableMoney;
import salomia.zk.prog5j2tp2.entity.Renter;
import salomia.zk.prog5j2tp2.repository.RentRepository;
import salomia.zk.prog5j2tp2.repository.RentableMoneyRepository;

import java.util.ArrayList;

@Service
@Transactional

public class MoneyRenting implements EntityRenting<RentableMoney> {

    private RentRepository rentRepository;

    public MoneyRenting(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @Override
    public Rent rent(ArrayList<RentableMoney> rentables, Renter renter) {
      return   rentRepository.save
              (new Rent(
                rentables,
                renter,
                false
        ));
    }
}
