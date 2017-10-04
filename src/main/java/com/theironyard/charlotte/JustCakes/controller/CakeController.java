package com.theironyard.charlotte.JustCakes.controller;

import com.theironyard.charlotte.JustCakes.models.Cake;
import com.theironyard.charlotte.JustCakes.repositories.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CakeController {

    @Autowired
    CakeRepository cakeRepo;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("cakes", cakeRepo.findAll());
        return "index";
    }

    @PostMapping("/add-cake")
    public String addCookie(Cake cake) {
        cakeRepo.save(cake);
        return "redirect:/";
    }


    @PostMapping("/delete_dessert")
    public String delete_dessert(Integer id){
       cakeRepo.delete(id);
       return "redirect:/";
    }


//    @RequestMapping(value = "/delete_dessert", method = RequestMethod.DELETE)
//    public String handleDeleteUser(@RequestParam(name="personId")String personId) {
//        System.out.println(personId);
//        System.out.println("test");
//        return "redirect:/external";
//    }
}
