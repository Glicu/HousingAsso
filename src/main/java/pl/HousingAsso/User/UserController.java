package pl.HousingAsso.User;

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
import pl.HousingAsso.Flat.FlatRepository;

@Controller
@RequestMapping("/User")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final FlatRepository flatRepository;
    private final CounterRepository counterRepository;


    @GetMapping("/all")
    public String viewUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "User/users";
    }

    @GetMapping("/add")
    public String addUserView(Model model) {
        model.addAttribute("user", new User());
        return "User/add";
    }

    @PostMapping("/add")
    public RedirectView addUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/User/add", true);
        User savedUser = userRepository.save(user);
        redirectAttributes.addFlashAttribute("savedUser", savedUser);
        redirectAttributes.addFlashAttribute("addUserSuccess", true);
        return redirectView;
    }

}
