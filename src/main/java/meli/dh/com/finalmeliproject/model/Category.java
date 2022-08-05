package meli.dh.com.finalmeliproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String categoryName;

    private int minTemperature;

    private int maxTemperature;

    @OneToMany(mappedBy = "category")
    private List<ShippingCategory> shippingCategories;

    @OneToMany(mappedBy = "category")
    private List<Package> listOfPackages;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    @OneToMany(mappedBy = "category")
    private List<InboundOrder> inboundOrder;
}
