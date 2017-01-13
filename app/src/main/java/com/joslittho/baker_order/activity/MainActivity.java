package com.joslittho.baker_order.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.R2;

import butterknife.BindBool;

public class MainActivity extends AppCompatActivity {

    /* CONSTANTS */

    /* VARIABLES */

    /* Primitives */

    @BindBool( R2.bool.is_large_screen )
    public boolean mIsLargeScreen; // ditto

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff
        // 1. use the main activity layout
        // 2. if we are on a large screen and thus need to use a two-pane UI

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.activity_main );

        // 2. if we are on a large screen and thus need to use a two-pane UI

        // begin if we are on large screen
        if ( mIsLargeScreen ) {



        } // end if we are on large screen

    } // end onCreate

    /* Other Methods */

}
