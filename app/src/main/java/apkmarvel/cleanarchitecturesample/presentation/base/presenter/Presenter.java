package apkmarvel.cleanarchitecturesample.presentation.base.presenter;

import apkmarvel.cleanarchitecturesample.presentation.base.view.View;
public interface Presenter<T extends View> {

    void setView(T view);
    void onViewResume();
    void onViewPause();
    void onViewDestroy();

}

