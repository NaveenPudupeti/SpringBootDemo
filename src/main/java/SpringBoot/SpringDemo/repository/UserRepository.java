package SpringBoot.SpringDemo.repository;

import SpringBoot.SpringDemo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;



public interface UserRepository extends JpaRepository<Users, Long> {


}
