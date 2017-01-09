package com.joslittho.baker_order.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.R2;
import com.joslittho.baker_order.adapter.GoodsAdapter;
import com.joslittho.baker_order.model.BakedGood;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity {

    /* CONSTANTS */

    public static final int GOODS_NUMBER = 20;

    /* VARIABLES */

    GoodsAdapter mGoodsAdapter;

    List< BakedGood > mBakedGoods;

    @BindView( R2.id.goods_rv_list )
    ListView mGoodsListView;

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    protected void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        setContentView( R.layout.fragment_goods );

        ButterKnife.bind( this );
        ButterKnife.setDebug( true );

        mBakedGoods = generateBakedGoods();

        mGoodsAdapter = new GoodsAdapter( this, mBakedGoods );

        mGoodsListView.setAdapter( mGoodsAdapter );

        int s = 0;
    }

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

    @OnItemClick( R2.id.goods_rv_list )
    public void onGoodsListClick( int position ) {

        int imageRes = mBakedGoods.get( position ).getPicture();

        Intent selectedGoodIntent = new Intent( this, SelectedGoodActivity.class )
                .putExtra( SelectedGoodActivity.ARG_PICTURE, imageRes );

        startActivity( selectedGoodIntent );
    }
}
