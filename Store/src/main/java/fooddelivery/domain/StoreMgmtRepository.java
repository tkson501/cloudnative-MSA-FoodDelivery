package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "storeMgmts",
    path = "storeMgmts"
)
public interface StoreMgmtRepository
    extends PagingAndSortingRepository<StoreMgmt, Long> {}
