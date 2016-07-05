
package apkmarvel.cleanarchitecturesample.presentation.base.view;

import android.content.Context;

public interface LoadingView extends View{

  void showLoading();
  void hideLoading();
  void showRetry();
  void hideRetry();
  void showError(String message);
  Context context();
}
