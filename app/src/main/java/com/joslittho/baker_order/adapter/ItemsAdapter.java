package com.joslittho.baker_order.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.model.Item;
import com.joslittho.baker_order.viewholder.ItemViewHolder;

import java.util.List;

/**
 * {@link ItemsAdapter} exposes {@link Item}s to a {@link android.support.v7.widget.RecyclerView}.
 */
// begin class ItemsAdapter
public class ItemsAdapter extends RecyclerView.Adapter< ItemViewHolder > {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /* GoodsAdapterOnClickHandlers */

    public ItemsAdapterOnClickHandler mItemsAdapterOnClickHandler; // ditto

    /* Lists */

    private List< Item > mGoods; // ditto

    /* CONSTRUCTOR */

    // begin constructor
    public ItemsAdapter( Context context, List< Item > goods,
                         ItemsAdapterOnClickHandler clickHandler ) {

        // 0. initialize the list
        // 1. initialize the click handler

        // 0. initialize the list

        mGoods = goods;

        // 1. initialize the click handler

        mItemsAdapterOnClickHandler = clickHandler;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreateViewHolder
    public ItemViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        // 0. inflate the correct layout using the parent view group's context
        // 1. return a view holder using the inflated view and this adapter

        // 0. inflate the correct layout using the parent view group's context

        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.item, parent, false );

        // 1. return a view holder using the inflated view and this adapter

        return new ItemViewHolder( view, this );

    } // end onCreateViewHolder

    @Override
    // begin onBindViewHolder
    public void onBindViewHolder( ItemViewHolder itemViewHolder, int position ) {

        // 0. for the list item at this position, show the correct
        // 0a. picture
        // 0b. name
        // 0c. value

        // 0. for the list item at this position, show the correct

        Item currentGood = mGoods.get( position );

        // 0a. picture

        itemViewHolder.mPictureImageView.setImageResource( currentGood.getPicture() );

        // 0b. name

        itemViewHolder.mNameTextView.setText( currentGood.getName() );

        // 0c. value

        itemViewHolder.mValueTextView.setText( String.valueOf( currentGood.getPrice() ) + " XOF" );

    } // end onBindViewHolder

    @Override
    // getItemCount
    public int getItemCount() {
        return mGoods.size();
    }

    /* Other Methods */

} // end class ItemsAdapter
