package apkmarvel.cleanarchitecturesample.domain.usecase;

import apkmarvel.cleanarchitecturesample.domain.base.Interactor;
import apkmarvel.cleanarchitecturesample.domain.base.PostExecutionThread;


public class UserUscase extends Interactor{
    public UserUscase(PostExecutionThread postExecutionThread) {
        super(postExecutionThread);
    }
}
