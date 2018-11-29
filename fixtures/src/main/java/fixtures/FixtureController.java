package fixtures;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.reactivex.Flowable;

@Controller("/")
public class FixtureController {

    private FixtureService fixtureService;

    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @Get("/")
    public Flowable<FixtureResponse> list() {
        return fixtureService.findAll();
    }
}