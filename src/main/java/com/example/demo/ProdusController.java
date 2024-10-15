package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produse")
public class ProdusController {
    private final ProdusService produsService;

    public ProdusController(ProdusService produsService) {
        this.produsService = produsService;
    }

    @GetMapping
    public String showProduse(Model model) {
        model.addAttribute("produse", produsService.getAllProduse());
        return "index";
    }

    @GetMapping("/add")
    public String addProdusForm(Model model) {
        model.addAttribute("produs", new Produs());
        return "edit";
    }

    @PostMapping("/add")
    public String addProdus(@ModelAttribute Produs produs) {
        produsService.addProdus(produs);
        return "redirect:/produse";
    }

    @GetMapping("/edit/{index}")
    public String editProdusForm(@PathVariable int index, Model model) {
        model.addAttribute("produs", produsService.getProdus(index));
        model.addAttribute("index", index);
        return "edit";
    }

    @PostMapping("/edit/{index}")
    public String editProdus(@PathVariable int index, @ModelAttribute Produs produs) {
        produsService.updateProdus(index, produs);
        return "redirect:/produse";
    }

    @GetMapping("/delete/{index}")
    public String deleteProdus(@PathVariable int index) {
        produsService.deleteProdus(index);
        return "redirect:/produse";
    }
}

