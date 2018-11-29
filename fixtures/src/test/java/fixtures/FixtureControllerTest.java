package fixtures;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class FixtureControllerTest {

    @Inject
    FixturesClient fixturesClient;

    @Test
    void testListFixtures() {
        List<FixtureResponse> fixtureResponses = fixturesClient.list();

        FixtureResponse rmaVsFcb = fixtureResponses.stream()
                .filter(fixtureResponse -> fixtureResponse.getHomeScore() == 5)
                .findFirst()
                .get();

        assertEquals("Real Madrid", rmaVsFcb.getHomeClub());
    }

}