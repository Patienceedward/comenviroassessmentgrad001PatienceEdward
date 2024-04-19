package com.enviro.assessment.grad001.patienceEdward.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

// Use Spring extension for testing
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DisposalGuidelineTest {

  // Test method for plastic guideline
  @Test
  public void testPlasticGuideline() {
    DisposalGuideline plasticGuideline = DisposalGuideline.plasticGuideline();
    // Assert that the guideline matches the expected value
    assertThat(plasticGuideline.getGuideline())
        .isEqualTo("Recycle plastic containers, bottles, and bags. Avoid single-use plastics.");
  }

  @Test
  public void testPaperGuideline() {
    DisposalGuideline paperGuideline = DisposalGuideline.paperGuideline();
    // Assert that the guideline matches the expected value
    assertThat(paperGuideline.getGuideline())
        .isEqualTo("Recycle newspapers, magazines, and cardboard. Avoid wet or contaminated paper.");
  }

  @Test
  public void testGlassGuideline() {
    // Create a glass guideline instance
    DisposalGuideline glassGuideline = DisposalGuideline.glassGuideline();
    // Assert that the guideline matches the expected value

    assertThat(glassGuideline.getGuideline()).isEqualTo("Recycle glass bottles and jars. Avoid broken glass.");
  }
}
