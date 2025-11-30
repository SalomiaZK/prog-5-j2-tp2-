package salomia.zk.prog5j2tp2.service;

import org.springframework.stereotype.Service;
import salomia.zk.prog5j2tp2.entity.*;
import salomia.zk.prog5j2tp2.repository.RentRepository;

import java.util.ArrayList;

@Service
public class ToolsRenting implements EntityRenting<RentableTools> {
private RentRepository rentRepository;

    public ToolsRenting(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @Override
    public Rent rent(ArrayList <RentableTools> rentables, Renter renter) {

        return rentRepository.save( new Rent(rentables, renter, false))   ;
    }



}
