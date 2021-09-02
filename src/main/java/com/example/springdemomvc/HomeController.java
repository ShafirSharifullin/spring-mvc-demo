package com.example.springdemomvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller - это контроллер Spring MVC. Он наследуется от Component, поэтому в принципе можно сказать, что это компонент
@RestController
public class HomeController {


    // Мы получаем путь, который хотим нанести на карту
    @RequestMapping(value = "/", method = RequestMethod.GET)
    // Название здесь не имеет какого-то значения, поэтому можно назвать как угодно.
    public String showMyPage() {
        // Возвращаем имя представления (view). Spring сам его найдет в каталоге, который мы задали в файле.
        return "main-menu";
    }
}
