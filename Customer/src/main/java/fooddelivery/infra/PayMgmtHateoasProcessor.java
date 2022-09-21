package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PayMgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PayMgmt>> {

    @Override
    public EntityModel<PayMgmt> process(EntityModel<PayMgmt> model) {
        return model;
    }
}
