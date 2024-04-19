package com.enviro.assessment.grad001.patienceEdward.model;

/**
 * Represents a tip for recycling.
 */
public class RecyclingTip {
  private String tip;

  /**
   * Constructs a new RecyclingTip with the specified tip.
   *
   * @param tip The recycling tip.
   */
  public RecyclingTip(String tip) {
    this.tip = tip;
  }

  /**
   * Gets the recycling tip.
   *
   * @return The recycling tip.
   */
  public String getTip() {
    return tip;
  }

  /**
   * Sets the recycling tip.
   *
   * @param tip The new recycling tip.
   */
  public void setTip(String tip) {
    this.tip = tip;
  }

  /**
   * Returns a RecyclingTip with a tip about knowing what can be recycled.
   *
   * @return A RecyclingTip with a tip about knowing what can be recycled.
   */
  public static RecyclingTip tip1() {
    return new RecyclingTip(
        "Know What Can Be Recycled: Familiarize yourself with what materials are accepted for recycling in your area. Common recyclables include paper, cardboard, glass, metal, and certain plastics.");
  }

  /**
   * Returns a RecyclingTip with a tip about knowing what can be recycled.
   *
   * @return A RecyclingTip with a tip about knowing what can be recycled.
   */

  public static RecyclingTip tip2() {
    return new RecyclingTip(
        "Reduce and Reuse: Before recycling, consider ways to reduce your consumption and reuse items. For example, use a refillable water bottle instead of buying bottled water.");
  }

  /**
   * Returns a RecyclingTip with a tip about knowing what can be recycled.
   *
   * @return A RecyclingTip with a tip about knowing what can be recycled.
   */

  public static RecyclingTip tip3() {
    return new RecyclingTip(
        "Separate Materials: Sort your recyclables properly to ensure they can be processed efficiently. Keep different materials separate to prevent contamination.");
  }

  /**
   * Returns a RecyclingTip with a tip about knowing what can be recycled.
   *
   * @return A RecyclingTip with a tip about knowing what can be recycled.
   */

  public static RecyclingTip tip4() {
    return new RecyclingTip(
        "Check Labels: Look for recycling symbols and instructions on product labels to determine if an item is recyclable and how to prepare it for recycling.");
  }

  /**
   * Returns a RecyclingTip with a tip about knowing what can be recycled.
   *
   * @return A RecyclingTip with a tip about knowing what can be recycled.
   */

  public static RecyclingTip tip5() {
    return new RecyclingTip(
        "Avoid Contamination: Rinse out food and beverage containers before recycling to prevent contamination. Contaminated items may not be recyclable.");
  }
}
