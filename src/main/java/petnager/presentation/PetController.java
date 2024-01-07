package petnager.presentation;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import petnager.application.PetService;
import petnager.presentation.response.PetResponse;

@RestController
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/api/pets")
    private List<PetResponse> getPets() {
        return petService.findAll().stream()
                .map(PetResponse::new)
                .toList();
    }
}
