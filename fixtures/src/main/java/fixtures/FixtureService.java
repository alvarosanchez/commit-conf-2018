package fixtures;

import io.reactivex.Flowable;
import io.reactivex.Maybe;

import javax.inject.Singleton;

@Singleton
public class FixtureService {

    private ClubsClient clubsClient;
    private FixtureRepository fixtureRepository;

    public FixtureService(ClubsClient clubsClient, FixtureRepository fixtureRepository) {
        this.clubsClient = clubsClient;
        this.fixtureRepository = fixtureRepository;
    }

    private Maybe<FixtureResponse> toResponse(Fixture fixture) {
        return Maybe.zip(
                clubsClient.findClub(fixture.getHomeClubId()),
                clubsClient.findClub(fixture.getAwayClubId()),
                (homeClub, awayClub) -> new FixtureResponse(homeClub.getName(), awayClub.getName(), fixture.getHomeScore(), fixture.getAwayScore(), homeClub.getStadium())
        );
    }

    public Flowable<FixtureResponse> findAll() {
        return Flowable.fromIterable(fixtureRepository.findAll()).flatMapMaybe(this::toResponse);
    }
}