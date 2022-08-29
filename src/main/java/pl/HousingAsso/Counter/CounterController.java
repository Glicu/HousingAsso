package pl.HousingAsso.Counter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Counter")
@RequiredArgsConstructor
public class CounterController {

    private final CounterRepository counterRepository;

    @GetMapping("/all")
    public String viewCounters(Model model) {
        model.addAttribute("counters", counterRepository.findAll());
        return "Counter/counters";
    }

}

