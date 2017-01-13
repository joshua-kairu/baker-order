package com.joslittho.baker_order.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.R2;
import com.joslittho.baker_order.adapter.GoodsAdapter;
import com.joslittho.baker_order.adapter.GoodsAdapterOnClickHandler;
import com.joslittho.baker_order.model.BakedGood;
import com.joslittho.baker_order.viewholder.GoodViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity implements GoodsAdapterOnClickHandler {

    /* CONSTANTS */

    public static final int GOODS_NUMBER = 20;

    /* VARIABLES */

    /* GoodsAdapters */

    private GoodsAdapter mGoodsAdapter; // ditto

    /* Lists */

    private List< BakedGood > mBakedGoods; // ditto

    /* RecyclerViews */

    @BindView( R2.id.goods_rv_list )
    public RecyclerView mGoodsRecyclerView; // ditto

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff
        // 1. use the goods fragment layout
        // 2. bind
        // 3. get a list of goods
        // 4. the recycler
        // 4a. use a linear layout manager
        // 4b. has fixed size
        // 4c. set adapter

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the goods fragment layout

        setContentView( R.layout.fragment_goods );

        // 2. bind

        ButterKnife.bind( this );

        // 3. get a list of goods

        mBakedGoods = generateBakedGoods();

        // 4. the recycler

        // 4a. use a linear layout manager

        mGoodsRecyclerView.setLayoutManager( new LinearLayoutManager( this ) );

        // 4b. has fixed size

        mGoodsRecyclerView.setHasFixedSize( true );

        // 4c. set adapter

        mGoodsAdapter = new GoodsAdapter( this, mBakedGoods, this );

        mGoodsRecyclerView.setAdapter( mGoodsAdapter );

    } // end onCreate

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

        Intent selectedGoodIntent = new Intent( this, SelectedGoodActivity.class )
                .putExtra( SelectedGoodActivity.ARG_PICTURE, imageRes );

        // 2. start the selected good activity using the intent

        startActivity( selectedGoodIntent );

    } // end onClick

    /* Other Methods */

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

    }

}
