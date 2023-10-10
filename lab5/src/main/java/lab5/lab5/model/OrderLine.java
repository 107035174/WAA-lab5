package lab5.lab5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    @Column(name = "qty")
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    @Getter
    private Product product;

    public OrderLine() {
    }

    public OrderLine(int quantity) {
        this.quantity = quantity;
    }
}
