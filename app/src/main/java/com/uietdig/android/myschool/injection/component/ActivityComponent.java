package com.uietdig.android.myschool.injection.component;

import dagger.Subcomponent;
import com.uietdig.android.myschool.injection.PerActivity;
import com.uietdig.android.myschool.injection.module.ActivityModule;
import com.uietdig.android.myschool.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
