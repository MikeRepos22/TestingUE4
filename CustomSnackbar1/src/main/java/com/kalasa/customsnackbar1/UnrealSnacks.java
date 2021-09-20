package com.kalasa.customsnackbar1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
public class UnrealSnacks extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noview);
        Snackbar.make(getWindow().getDecorView().getRootView(), "Calling Android From UE4", Snackbar.LENGTH_LONG)
                    .setAction("Proceed", null).show();
    }
}
