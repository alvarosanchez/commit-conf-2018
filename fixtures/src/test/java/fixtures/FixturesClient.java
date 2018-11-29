package fixtures;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("/")
interface FixturesClient {

    @Get("/")
    public List<FixtureResponse> list();

}
