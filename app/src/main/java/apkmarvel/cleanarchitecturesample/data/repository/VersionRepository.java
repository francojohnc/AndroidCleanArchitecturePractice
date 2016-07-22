package apkmarvel.cleanarchitecturesample.data.repository;

import apkmarvel.cleanarchitecturesample.data.entity.AppVersion;
import rx.Observable;

public interface VersionRepository {
    Observable<AppVersion> getVersion();
}