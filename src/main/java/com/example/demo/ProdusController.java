package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/produse")
public class ProdusController {
    private final ProdusService produsService;

    public ProdusController(ProdusService produsService) {
        this.produsService = produsService;
    }
@Operation(summary = "afisare lista produse")
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
    @Operation(summary = "adaugare produs in lista")
    @PostMapping("/add")
    public String addProdus(@ModelAttribute Produs produs) {
        produsService.addProdus(produs);
        return "redirect:/produse";
    }
    @Operation(summary = "Pagina editare")
    @GetMapping("/edit/{id}")
    public String editProdusForm(@PathVariable Long id, Model model) {
        Optional<Produs> produs = produsService.getProdus(id);
        if (produs.isPresent()) {
            model.addAttribute("produs", produs.get());
            model.addAttribute("id", id);
            return "edit";
        }
        return "redirect:/produse"; // Redirect if not found
    }
    @Operation(summary = "Editare produs")
    @PostMapping("/edit/{id}")
    public String editProdus(@PathVariable Long id, @ModelAttribute Produs produs) {
        produsService.updateProdus(id, produs);
        return "redirect:/produse";
    }

    @Operation(summary = "Stergere produs")
    @GetMapping("/delete/{id}")
    public String deleteProdus(@PathVariable Long id) {
        produsService.deleteProdus(id);
        return "redirect:/produse";
    }
}
