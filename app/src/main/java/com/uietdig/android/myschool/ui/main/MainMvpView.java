package com.uietdig.android.myschool.ui.main;

import java.util.List;

import com.uietdig.android.myschool.data.model.Ribot;
import com.uietdig.android.myschool.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
