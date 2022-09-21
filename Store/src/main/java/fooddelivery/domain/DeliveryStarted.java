package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(StoreMgmt aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
    // keep

}
