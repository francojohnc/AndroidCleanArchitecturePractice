package apkmarvel.cleanarchitecturesample.domain.usecase;

import apkmarvel.cleanarchitecturesample.data.entity.AppVersion;
import apkmarvel.cleanarchitecturesample.data.repository.VersionRepository;
import apkmarvel.cleanarchitecturesample.domain.base.Interactor;
import apkmarvel.cleanarchitecturesample.domain.base.PostExecutionThread;
import rx.Observable;

public class VersionUseCase extends Interactor {

    private static final String TAG = VersionUseCase.class.getSimpleName();
    private final VersionRepository versionRepository;

    public VersionUseCase(PostExecutionThread postExecutionThread, VersionRepository versionRepository) {
        super(postExecutionThread);
        this.versionRepository = versionRepository;
    }
    public Observable<AppVersion> getVersion() {

        return versionRepository.getVersion().compose(this.<AppVersion>applySchedulers());
    }
}
