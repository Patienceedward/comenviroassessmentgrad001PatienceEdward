package com.enviro.assessment.grad001.patienceEdward.controller;

import com.enviro.assessment.grad001.patienceEdward.model.DisposalGuideline;
import com.enviro.assessment.grad001.patienceEdward.model.RecyclingTip;
import com.enviro.assessment.grad001.patienceEdward.model.WasteCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling requests related to waste management.
 */

@Controller
public class WasteController {

  @GetMapping("/waste-categories")
  public String showWasteCategories(Model model) {
    // Get all WasteCategory enum values
    WasteCategory[] wasteCategories = WasteCategory.values();

    // Ads the different waste categories to the model
    model.addAttribute("wasteCategories", wasteCategories);

    return "waste-categories"; // waste-categories.html
  }

  @GetMapping("/disposal-guidelines")
  public String showDisposalGuidelines(Model model) {
    // Gets the hardcoded disposal guidelines
    DisposalGuideline plasticGuideline = DisposalGuideline.plasticGuideline();
    DisposalGuideline paperGuideline = DisposalGuideline.paperGuideline();
    DisposalGuideline glassGuideline = DisposalGuideline.glassGuideline();
    DisposalGuideline MetalGuideline = DisposalGuideline.MetalGuideline();
    DisposalGuideline BatteriesGuideline = DisposalGuideline.BatteriesGuideline();
    DisposalGuideline ElectronicsGuideline = DisposalGuideline.ElectronicsGuideline();
    DisposalGuideline FoodWasteGuideline = DisposalGuideline.FoodWasteGuideline();
    DisposalGuideline HazardousWasteGuideline = DisposalGuideline.HazardousWasteGuideline();
    DisposalGuideline ClothingsGuideline = DisposalGuideline.ClothingsGuideline();
    DisposalGuideline MedicationsGuideline = DisposalGuideline.MedicationsGuideline();

    // Adds the disposal guidelines to the model
    model.addAttribute("plasticGuideline", plasticGuideline);
    model.addAttribute("paperGuideline", paperGuideline);
    model.addAttribute("glassGuideline", glassGuideline);
    model.addAttribute("MetalGuideline", MetalGuideline);
    model.addAttribute("BatteriesGuideline", BatteriesGuideline);
    model.addAttribute("ElectronicsGuideline", ElectronicsGuideline);
    model.addAttribute("FoodWasteGuideline", FoodWasteGuideline);
    model.addAttribute("HazardousWasteGuideline", HazardousWasteGuideline);
    model.addAttribute("ClothingsGuideline", ClothingsGuideline);
    model.addAttribute("MedicationsGuideline", MedicationsGuideline);

    return "disposal-guidelines"; // disposal-guidelines.html
  }

  @GetMapping("/recycling-tips")
  public String showRecyclingTips(Model model) {
    // Getting the hardcoded recycling Tips
    RecyclingTip tip1 = RecyclingTip.tip1();
    RecyclingTip tip2 = RecyclingTip.tip2();
    RecyclingTip tip3 = RecyclingTip.tip3();
    RecyclingTip tip4 = RecyclingTip.tip4();
    RecyclingTip tip5 = RecyclingTip.tip5();

    // Adds the recycling tips to the model
    model.addAttribute("tip1", tip1);
    model.addAttribute("tip2", tip2);
    model.addAttribute("tip3", tip3);
    model.addAttribute("tip4", tip4);
    model.addAttribute("tip5", tip5);

    return "recycling-tips"; // recycling-tips.html
  }
}
