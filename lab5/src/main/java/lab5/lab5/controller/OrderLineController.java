package lab5.lab5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lab5.lab5.model.OrderLine;
import lab5.lab5.service.OrderLineService;

@RestController
@RequestMapping("/orderline")
public class OrderLineController {
    @Autowired
    private OrderLineService orderLineService;

    @PostMapping("/add")
    public OrderLine create(@RequestParam int quantity) {
        return orderLineService.create(new OrderLine(quantity));
    }

    @GetMapping("/")
    public List<OrderLine> getAll() {
        return orderLineService.getAll();
    }

    @GetMapping("/{id}")
    public OrderLine getById(@PathVariable long id) {
        return orderLineService.getById(id);
    }

    @PutMapping("/{id}")
    public OrderLine update(@PathVariable long id, @RequestParam int quantity) {
        return orderLineService.update(id, new OrderLine(quantity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        orderLineService.delete(id);
    }

}
