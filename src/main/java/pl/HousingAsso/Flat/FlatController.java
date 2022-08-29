package pl.HousingAsso.Flat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import pl.HousingAsso.Counter.CounterRepository;
import pl.HousingAsso.User.User;
import pl.HousingAsso.User.UserRepository;

@Controller
@RequestMapping("/Flat")
@RequiredArgsConstructor
public class FlatController {

    private final FlatRepository flatRepository;
    private final CounterRepository counterRepository;

    @GetMapping("/all")
    public String viewFlats(Model model) {
        model.addAttribute("flats", flatRepository.findAll());
        return "Flat/flats";
    }

}
