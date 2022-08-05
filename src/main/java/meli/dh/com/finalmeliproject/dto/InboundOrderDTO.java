package meli.dh.com.finalmeliproject.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@NoArgsConstructor
public class InboundOrderDTO {
    private long orderNumber;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime orderDate;

    private SectionDTO section;
    private List<BatchDTO> batchStock;

    public static List<BatchDTO> findBatchStock(List<BatchDTO> batchStock){
        return batchStock.stream().map(
                BatchDTO::new
        ).collect(Collectors.toList());
    }

}
