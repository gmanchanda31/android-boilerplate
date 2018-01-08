package com.uietdig.android.myschool.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.uietdig.android.myschool.data.DataManager;
import com.uietdig.android.myschool.data.SyncService;
import com.uietdig.android.myschool.data.local.DatabaseHelper;
import com.uietdig.android.myschool.data.local.PreferencesHelper;
import com.uietdig.android.myschool.data.remote.RibotsService;
import com.uietdig.android.myschool.injection.ApplicationContext;
import com.uietdig.android.myschool.injection.module.ApplicationModule;
import com.uietdig.android.myschool.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
