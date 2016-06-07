package apkmarvel.cleanarchitecturesample;

import android.content.Context;
import android.widget.Toast;

import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by JCF on 6/7/2016.
 */
public class MainInteractor {
    private Context context;

    public MainInteractor(Context context) {
        this.context = context;
    }

    //You could use RXAndroid instead of a callback to communicate
    // but to keep it simple use a callback and RX only for api calls
    public void loadDataFromApi(String query,MainCallback mainCallback) {
        Toast.makeText(context,query,Toast.LENGTH_SHORT).show();
        mainCallback.onSuccess();
    }
}
