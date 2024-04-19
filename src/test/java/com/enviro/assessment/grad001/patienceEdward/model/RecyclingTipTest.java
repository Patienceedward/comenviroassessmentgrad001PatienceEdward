package com.enviro.assessment.grad001.patienceEdward.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RecyclingTipTest {
  // Test for Recycling Tip 1
  @Test
  public void testTip1() {
    RecyclingTip tip1 = RecyclingTip.tip1();
    assertThat(tip1.getTip()).isEqualTo(
        "Know What Can Be Recycled: Familiarize yourself with what materials are accepted for recycling in your area. Common recyclables include paper, cardboard, glass, metal, and certain plastics.");
  }

  // Test for Recycling Tip 2
  @Test
  public void testTip2() {
    RecyclingTip tip2 = RecyclingTip.tip2();
    assertThat(tip2.getTip()).isEqualTo(
        "Reduce and Reuse: Before recycling, consider ways to reduce your consumption and reuse items. For example, use a refillable water bottle instead of buying bottled water.");
  }

  // Test for Recycling Tip 3
  @Test
  public void testTip3() {
    RecyclingTip tip3 = RecyclingTip.tip3();
    assertThat(tip3.getTip()).isEqualTo(
        "Separate Materials: Sort your recyclables properly to ensure they can be processed efficiently. Keep different materials separate to prevent contamination.");
  }

  // Test for Recycling Tip 4
  @Test
  public void testTip4() {
    RecyclingTip tip4 = RecyclingTip.tip4();
    assertThat(tip4.getTip()).isEqualTo(
        "Check Labels: Look for recycling symbols and instructions on product labels to determine if an item is recyclable and how to prepare it for recycling.");
  }

  // Test for Recycling Tip 5
  @Test
  public void testTip5() {
    RecyclingTip tip5 = RecyclingTip.tip5();
    assertThat(tip5.getTip()).isEqualTo(
        "Avoid Contamination: Rinse out food and beverage containers before recycling to prevent contamination. Contaminated items may not be recyclable.");
  }
}
