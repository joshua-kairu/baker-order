package com.joslittho.baker_order.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link android.app.Activity} to display the selected good
 */
// begin activity SelectedGoodActivity
public class SelectedGoodActivity extends AppCompatActivity {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    public static final String ARG_PICTURE = "ARG_PICTURE";
    /**
     * The logger.
     */
    private static final String LOG_TAG = SelectedGoodActivity.class.getSimpleName();
    
    /* VARIABLES */

    @BindView( R2.id.selected_good_iv_picture )
    ImageView mGoodImageView;

    /* CONSTRUCTOR */
    
    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff

        // 0. super stuff

        super.onCreate( savedInstanceState );

        setContentView( R.layout.fragment_selected_good );

        ButterKnife.bind( this );

        Bundle bundle = getIntent().getExtras();

        if ( bundle != null ) {
            int imageRes = bundle.getInt( ARG_PICTURE );
            mGoodImageView.setImageResource( imageRes );
        }

    } // end onCreate
    
    /* Other Methods */

} // end activity SelectedGoodActivity
