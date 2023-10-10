package lab5.lab5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab5.lab5.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
