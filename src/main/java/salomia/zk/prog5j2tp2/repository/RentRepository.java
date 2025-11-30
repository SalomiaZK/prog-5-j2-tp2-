package salomia.zk.prog5j2tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salomia.zk.prog5j2tp2.entity.Rent;


public interface RentRepository extends JpaRepository<Rent, String> {


    Rent save(Rent rent);
}