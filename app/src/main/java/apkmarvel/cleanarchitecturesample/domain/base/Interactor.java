package apkmarvel.cleanarchitecturesample.domain.base;

import rx.Observable;
import rx.schedulers.Schedulers;


public abstract class Interactor {
    private static final String TAG = Interactor.class.getSimpleName();
    protected final PostExecutionThread postExecutionThread;

    protected final Observable.Transformer schedulersTransformer = new Observable.Transformer<Observable, Observable>() {
        @Override
        public Observable call(Observable observable) {
            return observable.subscribeOn(Schedulers.io()).observeOn(postExecutionThread.getScheduler());
        }
    };
    public Interactor(final PostExecutionThread postExecutionThread) {
        this.postExecutionThread = postExecutionThread;
    }
    protected <T> Observable.Transformer<T, T> applySchedulers() {
        return (Observable.Transformer<T, T>) schedulersTransformer;
    }
}
