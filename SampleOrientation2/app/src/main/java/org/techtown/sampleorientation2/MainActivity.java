package org.techtown.sampleorientation2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            showToast("방향 : ORIENTATION_LANDSCAPE");
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            showToast("Orientation : OREINTATION_PORTRAIT");
    }

    private void showToast(String text){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }
}
