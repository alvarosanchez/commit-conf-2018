package clubs;

import java.util.List;
import java.util.Optional;

public interface ClubsRepository {

    Optional<Club> findOne(Long id);

}