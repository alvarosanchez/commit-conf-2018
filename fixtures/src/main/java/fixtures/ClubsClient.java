package fixtures;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.reactivex.Maybe;

@Client("clubs")
public interface ClubsClient {

    @Get("/club/{id}")
    Maybe<Club> findClub(Long id);
}