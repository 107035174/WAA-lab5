package lab5.lab5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab5.lab5.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
