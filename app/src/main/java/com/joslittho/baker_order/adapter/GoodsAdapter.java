package com.joslittho.baker_order.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.model.BakedGood;
import com.joslittho.baker_order.viewholder.GoodViewHolder;

import java.util.List;

/**
 * {@link GoodsAdapter} exposes {@link BakedGood}s to a {@link android.support.v7.widget.RecyclerView}.
 */
// begin class GoodsAdapter
public class GoodsAdapter extends RecyclerView.Adapter< GoodViewHolder > {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /* Contexts */

    private Context mContext; // ditto

    /* GoodsAdapterOnClickHandlers */

    public GoodsAdapterOnClickHandler mGoodsAdapterOnClickHandler; // ditto

    /* Lists */

    private List< BakedGood > mGoods; // ditto

    /* CONSTRUCTOR */

    // begin constructor
    public GoodsAdapter( Context context, List< BakedGood > goods,
                         GoodsAdapterOnClickHandler clickHandler ) {

        // 0. initialize context
        // 1. initialize the list
        // 2. initialize the click handler

        // 0. initialize context

        mContext = context;

        // 1. initialize the list

        mGoods = goods;

        // 2. initialize the click handler

        mGoodsAdapterOnClickHandler = clickHandler;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreateViewHolder
    public GoodViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        // 0. inflate the correct layout using the parent view group's context
        // 1. return a view holder using the inflated view and this adapter

        // 0. inflate the correct layout using the parent view group's context

        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.goods_item, parent, false );

        // 1. return a view holder using the inflated view and this adapter

        return new GoodViewHolder( view, this );

    } // end onCreateViewHolder

    @Override
    // begin onBindViewHolder
    public void onBindViewHolder( GoodViewHolder goodViewHolder, int position ) {

        // 0. for the list item at this position, show the correct
        // 0a. picture
        // 0b. name
        // 0c. value

        // 0. for the list item at this position, show the correct

        BakedGood currentGood = mGoods.get( position );

        // 0a. picture

        goodViewHolder.mPictureImageView.setImageResource( currentGood.getPicture() );

        // 0b. name

        goodViewHolder.mNameTextView.setText( currentGood.getName() );

        // 0c. value

        goodViewHolder.mValueTextView.setText( String.valueOf( currentGood.getPrice() ) + " XOF" );

    } // end onBindViewHolder

    @Override
    // getItemCount
    public int getItemCount() {
        return mGoods.size();
    }

    /* Other Methods */

} // end class GoodsAdapter
