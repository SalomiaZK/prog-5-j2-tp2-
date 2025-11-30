package salomia.zk.prog5j2tp2.service;

import org.springframework.stereotype.Service;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableMoney;
import salomia.zk.prog5j2tp2.entity.Renter;

import java.util.ArrayList;

@Service
public class MoneyRenting implements EntityRenting<RentableMoney> {
    @Override
    public Rent rent(ArrayList<RentableMoney> rentables, Renter renter) {
        return  new Rent(
                rentables,
                renter,
                false
        );
    }
}
