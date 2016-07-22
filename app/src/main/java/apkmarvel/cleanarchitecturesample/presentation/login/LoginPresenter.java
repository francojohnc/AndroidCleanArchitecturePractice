package apkmarvel.cleanarchitecturesample.presentation.login;


import apkmarvel.cleanarchitecturesample.presentation.base.presenter.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginView> {
    private LoginInteractor loginInteractor = new LoginInteractor();
    public void validateCredentials(String username, String password) {
        if (view != null) {
            view.showLoading();
        }
        loginInteractor.login(username, password, new LoginInteractor.OnLoginFinishedListener() {
            @Override
            public void onUsernameError() {
                if (view != null) {
                    view.setUsernameError();
                    view.hideLoading();
                }
            }
            @Override
            public void onPasswordError() {
                if (view != null) {
                    view.setPasswordError();
                    view.hideLoading();
                }
            }
            @Override
            public void onSuccess() {
                if (view != null) {
                    view.navigateToHome();
                }
            }
        });
    }


    @Override
    protected void onViewPause() {

    }

    @Override
    protected void onViewResume() {

    }

    @Override
    protected void onViewDestroy() {

    }
}
