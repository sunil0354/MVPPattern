package com.app.sunilmvp.Login;

import android.support.annotation.NonNull;

import com.app.sunilmvp.adapter.User;
import com.app.sunilmvp.retrofit.APIClient;
import com.app.sunilmvp.retrofit.APIInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView mView;

    LoginPresenterImpl(LoginView view) {
        this.mView=view;        //assigning LoginView to this view
    }

    @Override
    public void onLogin() {
        User user = new User("morpheus", "leader");
        Call<User> call1 = APIClient.getClient().create(APIInterface.class).createUser(user);
        call1.enqueue(new Callback<User>() {
            @Override
            public void onResponse(@NonNull Call<User> call, @NonNull Response<User> response) {
                mView.onSuccess();
            }
            @Override
            public void onFailure(@NonNull Call<User> call, @NonNull Throwable t) {
                call.cancel();
                mView.onValidate();
            }
        });
    }
}
