package com.joslittho.baker_order.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.R2;
import com.joslittho.baker_order.activity.SelectedGoodActivity;
import com.joslittho.baker_order.adapter.GoodsAdapter;
import com.joslittho.baker_order.adapter.GoodsAdapterOnClickHandler;
import com.joslittho.baker_order.model.BakedGood;
import com.joslittho.baker_order.viewholder.GoodViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link Fragment} to hold the list of goods
 */
// begin fragment GoodsFragment
public class GoodsFragment extends Fragment implements GoodsAdapterOnClickHandler {

    /* CONSTANTS */

    /* Integers */

    public static final int GOODS_NUMBER = 20; // ditto
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = GoodsFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* GoodsAdapters */

    private GoodsAdapter mGoodsAdapter; // ditto

    /* Lists */

    private List< BakedGood > mBakedGoods; // ditto

    /* RecyclerViews */

    @BindView( R2.id.goods_rv_list )
    public RecyclerView mGoodsRecyclerView; // ditto

    /* CONSTRUCTOR */

    public GoodsFragment() {
        // Required empty public constructor
    }

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. inflate the layout for this fragment
        // 1. bind
        // 2. get a list of goods
        // 3. the recycler
        // 3a. use a linear layout manager
        // 3b. has fixed size
        // 3c. set adapter
        // last. return the inflated view

        // 0. inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_goods, container, false );

        // 1. bind

        ButterKnife.bind( this, rootView );

        // 2. get a list of goods

        mBakedGoods = generateBakedGoods();

        // 2. the recycler

        // 2a. use a linear layout manager

        mGoodsRecyclerView.setLayoutManager( new LinearLayoutManager( getActivity() ) );

        // 2b. has fixed size

        mGoodsRecyclerView.setHasFixedSize( true );

        // 2c. set adapter

        mGoodsAdapter = new GoodsAdapter( getActivity(), mBakedGoods, this );

        mGoodsRecyclerView.setAdapter( mGoodsAdapter );

        // last. return the inflated view

        return rootView;

    } // end onCreateView

    /**
     * Listener for when a good item in the recycler is clicked.
     *
     * @param clickedHolder The {@link GoodViewHolder} that has been clicked.
     * */
    @Override
    // begin onClick
    public void onClick( GoodViewHolder clickedHolder ) {

        // 0. get the picture of the clicked item
        // 1. put the picture in an intent
        // 2. start the selected good activity using the intent

        // 0. get the picture of the clicked item

        int imageRes = mBakedGoods.get( clickedHolder.getAdapterPosition() ).getPicture();

        // 1. put the picture in an intent

        Intent selectedGoodIntent = new Intent( getActivity(), SelectedGoodActivity.class )
                .putExtra( SelectedGoodFragment.ARGUMENT_PICTURE, imageRes );

        // 2. start the selected good activity using the intent

        startActivity( selectedGoodIntent );

    } // end onClick

    /* Other Methods */

    /**
     * Helper method to generate goods for the list.
     *
     * @return An {@link ArrayList} of some generated goods.
     * */
    // begin generateBakedGoods
    private ArrayList< BakedGood > generateBakedGoods() {

        ArrayList< BakedGood > goods = new ArrayList<>( GOODS_NUMBER );

        for ( int i = 0; i < GOODS_NUMBER; i++ ) {

            int picture, value;

            String name;

            switch ( i % 4 ) {

                case 0:
                    picture = R.drawable.raisin_cake;
                    value = 500;
                    name = getString( R.string.raisin_cake );
                    break;

                case 1:
                    picture = R.drawable.cookies;
                    value = 600;
                    name = getString( R.string.cookies );
                    break;

                case 2:
                    picture = R.drawable.muffins;
                    value = 700;
                    name = getString( R.string.muffins );
                    break;

                case 3: default:
                    picture = R.drawable.shortcake;
                    value = 800;
                    name = getString( R.string.shortcake );
                    break;
            }

            BakedGood good = new BakedGood( name, picture, value );

            goods.add( good );

        }

        return goods;

    } // end generateBakedGoods

} // end fragment GoodsFragment
