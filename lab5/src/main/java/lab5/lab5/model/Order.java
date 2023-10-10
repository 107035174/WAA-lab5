package lab5.lab5.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long orderId;
    @Getter
    @Setter
    @Column(name = "date")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @Getter
    private Customer customer;
    @OneToMany
    @JoinColumn(name = "orderline_id")
    @Getter
    private List<OrderLine> orderLines;

    public Order() {
    }

    public Order(LocalDate date) {
        this.date = date;
    }
}
