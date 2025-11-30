package salomia.zk.prog5j2tp2.entity;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class Rent {
    private final ArrayList<? extends Rentable> rentable;
    private final Renter renter;
    private final boolean isReturned;
}