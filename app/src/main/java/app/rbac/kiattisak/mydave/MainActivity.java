package app.rbac.kiattisak.mydave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.rbac.kiattisak.mydave.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Fragment
        if (savedInstanceState == null){
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainContainer,mainFragment)
                    .commit();
        }
    } // Main Method

} //  Main Class
