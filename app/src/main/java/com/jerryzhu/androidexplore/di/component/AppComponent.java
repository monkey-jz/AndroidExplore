package com.jerryzhu.androidexplore.di.component;

import com.jerryzhu.androidexplore.app.AndroidExploreApp;
import com.jerryzhu.androidexplore.core.DataManager;
import com.jerryzhu.androidexplore.di.module.AbstractAllActivityModule;
import com.jerryzhu.androidexplore.di.module.AbstractAllFragmentModule;
import com.jerryzhu.androidexplore.di.module.AppModlue;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * author: jerryzhu
 * Date : 2018/12/8
 * Description :
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AbstractAllActivityModule.class,
        AbstractAllFragmentModule.class,
        AppModlue.class,
        })
public interface AppComponent {

    /**
     * @param androidExploreApp
     */
    void inject(AndroidExploreApp androidExploreApp);

    /**
     * @return context
     */
    AndroidExploreApp getContext();

    /**
     * @return dataManager
     */
    DataManager getDataManager();


}
