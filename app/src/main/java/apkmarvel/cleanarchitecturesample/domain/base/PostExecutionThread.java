package apkmarvel.cleanarchitecturesample.domain.base;

import rx.Scheduler;

public interface PostExecutionThread {
  Scheduler getScheduler();
}