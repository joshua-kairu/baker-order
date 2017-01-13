package com.joslittho.baker_order.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link Fragment} to show the details of the selected good
 */
// begin fragment SelectedGoodFragment
public class SelectedGoodFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */
    
    /* Strings */

    public static final String ARGUMENT_PICTURE = "ARGUMENT_PICTURE"; // ditto

    /**
     * The logger.
     */
    private static final String LOG_TAG = SelectedGoodFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* ImageViews */

    @BindView( R2.id.selected_good_iv_picture )
    public ImageView mPictureImageView; // ditto

    /* CONSTRUCTOR */

    public SelectedGoodFragment() {
        // Required empty public constructor
    }

    /**
     * Create a new {@link SelectedGoodFragment} with the given arguments.
     *
     * @param picture An integer reference to the selected good's image resource
     * */
    // begin instantiating method newInstance
    public static SelectedGoodFragment newInstance( int picture ) {

        // 0. create a new SelectedGoodFragment
        // 1. put the parameters in a bundle
        // 2. use the bundle as the arguments for the created SelectedGoodFragment
        // 3. return the created SelectedGoodFragment

        // 0. create a new SelectedGoodFragment

        SelectedGoodFragment selectedGoodFragment = new SelectedGoodFragment();

        // 1. put the parameters in a bundle

        Bundle bundle = new Bundle();

        bundle.putInt( ARGUMENT_PICTURE, picture );

        // 2. use the bundle as the arguments for the created SelectedGoodFragment

        selectedGoodFragment.setArguments( bundle );

        // 3. return the created SelectedGoodFragment

        return selectedGoodFragment;

    } // end instantiating method newInstance

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. inflate the layout for this fragment
        // 1. bind
        // 2. if we have it in the bundle, show the picture
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_selected_good, container, false );

        // 1. bind

        ButterKnife.bind( this, rootView );

        // 2. if we have it in the bundle, show the picture

        Bundle bundle = getArguments();

        // begin if there is a bundle and it has the arguments we need
        if ( bundle != null && bundle.containsKey( ARGUMENT_PICTURE ) ) {

            int imageRes = bundle.getInt( ARGUMENT_PICTURE );

            mPictureImageView.setImageResource( imageRes );

        } // end if there is a bundle and it has the arguments we need

        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

} // end fragment SelectedGoodFragment
