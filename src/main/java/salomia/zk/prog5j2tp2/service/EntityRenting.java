package salomia.zk.prog5j2tp2.service;

import org.springframework.stereotype.Service;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.Rentable;
import salomia.zk.prog5j2tp2.entity.Renter;

import java.util.ArrayList;


@Service
public interface EntityRenting <T extends Rentable>  {



    public abstract Rent rent(ArrayList<T> rentables, Renter renter);


}
