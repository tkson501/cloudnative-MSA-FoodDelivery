package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderHistrories",
    path = "orderHistrories"
)
public interface OrderHistroryRepository
    extends PagingAndSortingRepository<OrderHistrory, Long> {
    // keep

}
