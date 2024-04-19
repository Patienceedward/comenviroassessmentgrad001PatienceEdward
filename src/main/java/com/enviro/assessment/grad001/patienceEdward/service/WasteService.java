package com.enviro.assessment.grad001.patienceEdward.service;


import com.enviro.assessment.grad001.patienceEdward.model.DisposalGuideline;
import com.enviro.assessment.grad001.patienceEdward.model.RecyclingTip;
import com.enviro.assessment.grad001.patienceEdward.model.WasteCategory;

import java.util.List;

public interface WasteService {
    WasteCategory saveWasteCategory(WasteCategory wasteCategory);
    DisposalGuideline saveDisposalGuideline(DisposalGuideline disposalGuideline);
    RecyclingTip saveRecyclingTip(RecyclingTip recyclingTip);

    WasteCategory getWasteCategoryById(Long id);
    DisposalGuideline getDisposalGuidelineById(Long id);
    RecyclingTip getRecyclingTipById(Long id);

    List<WasteCategory> getAllWasteCategories();
    List<DisposalGuideline> getAllDisposalGuidelines();
    List<RecyclingTip> getAllRecyclingTips();

    void deleteWasteCategory(Long id);
    void deleteDisposalGuideline(Long id);
    void deleteRecyclingTip(Long id);
}
