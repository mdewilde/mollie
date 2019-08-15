package be.feelio.mollie.data.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRefundListResponse {

    private List<RefundResponse> refunds;


    private List<PaymentResponse> payments;
}
