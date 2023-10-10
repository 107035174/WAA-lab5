package lab5.lab5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lab5.lab5.model.OrderLine;
import lab5.lab5.repository.OrderLineRepository;

@Service
@Transactional
public class OrderLineService {
    @Autowired
    private OrderLineRepository orderLineRepository;

    public OrderLine create(OrderLine orderLine) {
        return orderLineRepository.save(orderLine);
    }

    public List<OrderLine> getAll() {
        return orderLineRepository.findAll();
    }

    public OrderLine getById(long id) {
        return orderLineRepository.findById(id).orElse(null);
    }

    public OrderLine update(long id, OrderLine orderLine) {
        if (orderLineRepository.existsById(id)) {
            orderLine.setId(id);
            return orderLineRepository.save(orderLine);
        }
        return null;
    }

    public void delete(long id) {
        orderLineRepository.deleteById(id);
    }
}
