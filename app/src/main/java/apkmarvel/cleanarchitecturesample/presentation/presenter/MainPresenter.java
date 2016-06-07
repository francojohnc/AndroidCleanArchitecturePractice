package apkmarvel.cleanarchitecturesample.presentation.presenter;

import apkmarvel.cleanarchitecturesample.MainCallback;
import apkmarvel.cleanarchitecturesample.MainInteractor;
import apkmarvel.cleanarchitecturesample.view.MainView;

/**
 * Created by JCF on 6/7/2016.
 */
public class MainPresenter implements Presenter<MainView>,MainCallback {
    private MainView mainView;
    private MainInteractor mainInteractor;
    @Override
    public void setView(MainView view) {
        if (view == null) throw new IllegalArgumentException("You can't set a null view");
        this.mainView=view;
        mainInteractor = new MainInteractor(view.getContext());
    }

    @Override
    public void detachView() {

    }

    public void onSearch(String query){
        mainView.showLoading();
        mainInteractor.loadDataFromApi(query,this);
    }

    @Override
    public void onSuccess() {
        mainView.hideLoading();
    }

    @Override
    public void onError() {

    }
}
