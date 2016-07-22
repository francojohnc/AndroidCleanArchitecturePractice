package apkmarvel.cleanarchitecturesample.presentation.base.presenter;

import android.support.annotation.NonNull;

import apkmarvel.cleanarchitecturesample.presentation.base.view.BaseView;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<T extends BaseView> {
    public static final String TAG = BasePresenter.class.getSimpleName();
    private final CompositeSubscription subscriptionsToUnsubscribeOnUnbindView = new CompositeSubscription();
    protected T view;


    protected final void unsubscribeOnUnbindView(@NonNull Subscription subscription) {
        subscriptionsToUnsubscribeOnUnbindView.add(subscription);
    }
    /*set view*/
    public void bindView(T view) {
        this.view = view;
    }
    /*remove view*/
    public void unBindView() {
        this.view = null;
        subscriptionsToUnsubscribeOnUnbindView.clear();
    }
    /*view activity lifecycle*/
    protected abstract void onViewPause();
    protected abstract void onViewResume();
    protected abstract void onViewDestroy();
}

