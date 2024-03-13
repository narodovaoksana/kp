package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Додаємо рядок до моделі
        model.addAttribute("message", "Привіт, світ!");

        // Створюємо список елементів
        List<String> items = List.of("item1", "item2", "item3");

        // Додаємо список до моделі
        model.addAttribute("items", items);

        // Повертаємо ім'я шаблону, яке потрібно відобразити
        return "home";
    }
}
