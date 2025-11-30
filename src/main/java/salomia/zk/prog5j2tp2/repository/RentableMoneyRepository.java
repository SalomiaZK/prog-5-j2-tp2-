package salomia.zk.prog5j2tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salomia.zk.prog5j2tp2.entity.Rent;
import salomia.zk.prog5j2tp2.entity.RentableMoney;

import java.util.List;

@Repository
public interface RentableMoneyRepository extends JpaRepository<RentableMoney, String> {

    Rent save(RentableMoney rentableMoney);

}