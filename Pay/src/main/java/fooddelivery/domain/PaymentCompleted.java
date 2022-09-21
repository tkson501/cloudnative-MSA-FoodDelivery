package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentCompleted extends AbstractEvent {

    private Long id;

    public PaymentCompleted(Pay aggregate) {
        super(aggregate);
    }

    public PaymentCompleted() {
        super();
    }
    // keep

}
