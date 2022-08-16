package meli.dh.com.finalmeliproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import meli.dh.com.finalmeliproject.model.Product;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseProductBatchStockDTO {

    private String productId;
    private int batchNumber;
    private int currentQuantity;
    private LocalDate dueDate;

    public int compareToBatch(Product p) {
        return (int) (this.getBatchNumber() - p.getBatch().getId());
    }
}
