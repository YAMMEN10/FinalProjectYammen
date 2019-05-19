package com.myhexaville.login;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.myhexaville.UI.Chat.search.search_fragment;

public class ThirdActivity extends AppCompatActivity implements search_fragment.OnFragmentInteractionListener {

    public static search_fragment search_fragment;
    public static FragmentManager fragmentManager;
    public static FragmentActivity fragmentActivity;
    public static Context context;
    private static FragmentTransaction fragmentTransaction;

    public ThirdActivity() {
        fragmentActivity = this;
        context = this;
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        String fragment = getIntent().getExtras().getString("fragment");
        search_fragment = new search_fragment();

        if (findViewById(R.id.container_main_third) != null) {
            if (savedInstanceState != null) return;
            if (fragment.equals("search_fragment")) {
                getSupportFragmentManager().beginTransaction().add(R.id.container_main_third, ThirdActivity.search_fragment).addToBackStack(null).commit();
            }
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
