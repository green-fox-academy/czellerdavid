package com.spaceship.spaceshgip.Controller;

import com.spaceship.spaceshgip.Services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class MainController {

  private SpaceService spaceService;

  @Autowired
  public MainController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping()
  public String homePage(Model model){
    model.addAttribute("planets", spaceService.getPlanets());
    model.addAttribute("spaceship", spaceService.getShip(1L ));
    return "index";
  }

  @GetMapping("/movehere/{id}")
  public String moveShip(@PathVariable(value = "id") Long id){
    System.out.println(id);
    spaceService.moveShip(1L, id);
    return "redirect:";
  }
}
