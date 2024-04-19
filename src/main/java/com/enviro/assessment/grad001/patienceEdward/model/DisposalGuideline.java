package com.enviro.assessment.grad001.patienceEdward.model;

/**
 * Represents a guideline for disposing of specific types of waste.
 */

public class DisposalGuideline {
  private String guideline;

  /**
   * Constructs a new DisposalGuideline with the specified guideline.
   *
   * @param guideline The guideline for disposing of the waste.
   */

  public DisposalGuideline(String guideline) {
    this.guideline = guideline;
  }

  /**
   * Gets the disposal guideline.
   *
   * @return The disposal guideline.
   */

  public String getGuideline() {
    return guideline;
  }

  /**
   * Sets the disposal guideline.
   *
   * @param guideline The new disposal guideline.
   */

  public void setGuideline(String guideline) {
    this.guideline = guideline;
  }

  /**
   * Returns a DisposalGuideline for recycling plastic.
   *
   * @return A DisposalGuideline for recycling plastic.
   */

  public static DisposalGuideline plasticGuideline() {
    return new DisposalGuideline("Recycle plastic containers, bottles, and bags. Avoid single-use plastics.");
  }

  /**
   * Returns a DisposalGuideline for recycling paper.
   *
   * @return A DisposalGuideline for recycling paper.
   */
  public static DisposalGuideline paperGuideline() {
    return new DisposalGuideline("Recycle newspapers, magazines, and cardboard. Avoid wet or contaminated paper.");
  }

  /**
   * Returns a DisposalGuideline for recycling glass.
   *
   * @return A DisposalGuideline for recycling glass.
   */

  public static DisposalGuideline glassGuideline() {
    return new DisposalGuideline("Recycle glass bottles and jars. Avoid broken glass.");
  }

  /**
   * Returns a DisposalGuideline for recycling Metal.
   *
   * @return A DisposalGuideline for recycling Metal.
   */
  public static DisposalGuideline MetalGuideline() {
    return new DisposalGuideline(" Recycle aluminum cans, steel cans, and clean foil. Rinse cans before recycling.");
  }

  /**
   * Returns a DisposalGuideline for recycling Batterie.
   *
   * @return A DisposalGuideline for recycling Batteries.
   */
  public static DisposalGuideline BatteriesGuideline() {
    return new DisposalGuideline(
        " Recycle rechargeable batteries at designated drop-off locations. Dispose of single-use batteries according to local guidelines.");
  }

  /**
   * Returns a DisposalGuideline for recycling Electronics.
   *
   * @return A DisposalGuideline for recycling Electronics.
   */
  public static DisposalGuideline ElectronicsGuideline() {
    return new DisposalGuideline("Recycle glass bottles and jars. Avoid broken glass.");
  }

  /**
   * Returns a DisposalGuideline for recycling Food.
   *
   * @return A DisposalGuideline for recycling Food.
   */
  public static DisposalGuideline FoodWasteGuideline() {
    return new DisposalGuideline(
        "Compost food scraps such as fruit and vegetable peels, coffee grounds, and eggshells. Do not compost meat, dairy, or oily foods");
  }

  /**
   * Returns a DisposalGuideline for recycling Disposal.
   *
   * @return A DisposalGuideline for recycling Disposal.
   */
  public static DisposalGuideline HazardousWasteGuideline() {
    return new DisposalGuideline(
        "Dispose of hazardous waste such as paint, chemicals, and batteries at designated hazardous waste disposal facilities.");
  }

  /**
   * Returns a DisposalGuideline for recycling Clothing.
   *
   * @return A DisposalGuideline for recycling Clothing.
   */
  public static DisposalGuideline ClothingsGuideline() {
    return new DisposalGuideline(
        "Donate gently used clothing to local charities or clothing donation centers. Recycle old or damaged clothing into rags or textiles.");
  }

  /**
   * Returns a DisposalGuideline for recycling Medication.
   *
   * @return A DisposalGuideline for recycling Medication.
   */
  public static DisposalGuideline MedicationsGuideline() {
    return new DisposalGuideline(
        "Dispose of expired or unused medications at designated medication take-back locations to prevent environmental contamination. Do not flush medications down the toilet.");
  }

}
