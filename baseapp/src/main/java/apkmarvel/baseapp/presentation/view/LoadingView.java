
package apkmarvel.baseapp.presentation.view;

import android.content.Context;

public interface LoadingView extends BaseView {

  void showLoading();
  void hideLoading();
  void showRetry();
  void hideRetry();
  void showError(String message);
  Context context();
}
