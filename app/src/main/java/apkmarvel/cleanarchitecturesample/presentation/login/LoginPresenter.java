package apkmarvel.cleanarchitecturesample.presentation.login;


import apkmarvel.cleanarchitecturesample.presentation.base.presenter.Presenter;

public class LoginPresenter implements Presenter<LoginView> {

    private LoginView view;
    private LoginInteractor loginInteractor = new LoginInteractor();

    @Override
    public void setView(LoginView view) {
        this.view = view;
    }

    @Override
    public void onViewResume() {

    }

    @Override
    public void onViewPause() {

    }

    @Override
    public void onViewDestroy() {

    }

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


}
