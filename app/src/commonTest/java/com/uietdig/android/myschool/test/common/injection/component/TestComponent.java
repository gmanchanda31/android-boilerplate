package com.uietdig.android.myschool.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.uietdig.android.myschool.injection.component.ApplicationComponent;
import com.uietdig.android.myschool.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
