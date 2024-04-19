package com.enviro.assessment.grad001.patienceEdward.controller;

import com.enviro.assessment.grad001.patienceEdward.model.WasteCategory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the WasteController class.
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class WasteControllerTest {

  /**
   * Test method to ensure that the application context loads successfully.
   */

  @Test
  public void contextLoads() {
    assertThat(true).isTrue();
  }

  /**
   * Test method for the showWasteCategories() method in the WasteController
   * class.
   */

  @Test
  public void testShowWasteCategories() {
    WasteController controller = new WasteController();
    Model model = new ConcurrentModel();

    String viewName = controller.showWasteCategories(model);

    assertThat(viewName).isEqualTo("waste-categories");
    assertThat(model.containsAttribute("wasteCategories")).isTrue();
    assertThat(model.getAttribute("wasteCategories")).isInstanceOf(WasteCategory[].class);
  }
}
