package meli.dh.com.finalmeliproject.dto;

import lombok.Getter;
import lombok.Setter;
import meli.dh.com.finalmeliproject.model.Product;

import java.util.List;

@Getter @Setter
public class ResponseDTO {
    private List<Product> batchStock;
}
