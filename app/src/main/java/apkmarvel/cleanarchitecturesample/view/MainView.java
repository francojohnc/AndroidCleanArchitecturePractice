package apkmarvel.cleanarchitecturesample.view;

/**
 * Created by JCF on 6/7/2016.
 */
public interface MainView extends BaseView {
    void showLoading();
    void hideLoading();
    void showResult(String result);
}
