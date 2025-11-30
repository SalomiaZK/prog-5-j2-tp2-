package salomia.zk.prog5j2tp2.service;

import org.springframework.stereotype.Service;
import salomia.zk.prog5j2tp2.entity.*;

import java.util.ArrayList;

@Service
public class ToolsRenting implements EntityRenting<RentableTools> {


    @Override
    public Rent rent(ArrayList <RentableTools> rentables, Renter renter) {
        return new Rent(rentables, renter, false)   ;
    }



}
