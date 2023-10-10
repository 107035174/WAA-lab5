package lab5.lab5.service;

import jakarta.transaction.Transactional;
import lab5.lab5.model.Order;
import lab5.lab5.repository.OrderRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public Order getById(long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order update(long id, Order order) {
        if (orderRepository.existsById(id)) {
            order.setOrderId(id);
            return orderRepository.save(order);
        }
        return null;
    }

    public void delete(long id) {
        orderRepository.deleteById(id);
    }
}
