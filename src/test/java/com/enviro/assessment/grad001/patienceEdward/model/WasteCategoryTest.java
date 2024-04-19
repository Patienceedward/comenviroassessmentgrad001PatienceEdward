package com.enviro.assessment.grad001.patienceEdward.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WasteCategoryTest {


  // Test method to check the number of enum values

  @Test
  public void testEnumValues() {
    // Check the total number of enum values
    assertEquals(10, WasteCategory.values().length);

    // Test method to check the number of enum values
    assertEquals(WasteCategory.PLASTIC, WasteCategory.valueOf("PLASTIC"));
    assertEquals(WasteCategory.PAPER, WasteCategory.valueOf("PAPER"));
    assertEquals(WasteCategory.GLASS, WasteCategory.valueOf("GLASS"));
    assertEquals(WasteCategory.METAL, WasteCategory.valueOf("METAL"));
    assertEquals(WasteCategory.ORGANIC, WasteCategory.valueOf("ORGANIC"));
    assertEquals(WasteCategory.ELECTONIC, WasteCategory.valueOf("ELECTONIC"));
    assertEquals(WasteCategory.FOOD_WASTE, WasteCategory.valueOf("FOOD_WASTE"));
    assertEquals(WasteCategory.HAZARDOUS_WASTE, WasteCategory.valueOf("HAZARDOUS_WASTE"));
    assertEquals(WasteCategory.CLOTHES, WasteCategory.valueOf("CLOTHES"));
    assertEquals(WasteCategory.MEDICATIONS, WasteCategory.valueOf("MEDICATIONS"));
  }
}
