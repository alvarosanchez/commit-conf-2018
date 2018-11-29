package clubs;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@Controller("/clubs")
public class ClubsController {

    private ClubsRepository clubsRepository;

    public ClubsController(ClubsRepository clubsRepository) {
        this.clubsRepository = clubsRepository;
    }

    @Get("/{id}")
    public HttpResponse<Club> show(Long id) {
        Optional<Club> club = this.clubsRepository.findOne(id);
        if (club.isPresent()) {
            return HttpResponse.ok(club.get());
        } else {
            return HttpResponse.notFound();
        }
    }
}