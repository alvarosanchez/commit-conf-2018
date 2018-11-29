package clubs;

import java.util.*;

public class ClubsRepositoryImpl implements ClubsRepository {

    private Map<Long, Club> database = new HashMap<>();

    public ClubsRepositoryImpl() {
        database.put(1L, new Club(1L, "Real Madrid", "Bernabeu"));
        database.put(2L, new Club(2L, "FC Barcelona", "Camp Nou"));
        database.put(3L, new Club(3L, "CD Leganes", "Butarque"));
        database.put(4L, new Club(4L, "Getafe CF", "Coliseum"));
    }

    @Override
    public Optional<Club> findOne(Long id) {
        return Optional.ofNullable(database.get(id));
    }

}
