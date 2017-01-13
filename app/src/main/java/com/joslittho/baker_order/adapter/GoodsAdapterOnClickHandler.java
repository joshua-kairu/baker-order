package com.joslittho.baker_order.adapter;

import com.joslittho.baker_order.viewholder.GoodViewHolder;

/**
 * Handler for click events in the {@link android.support.v7.widget.RecyclerView} populated by the
 * {@link GoodsAdapter}.
 */
// begin interface GoodsAdapterOnClickHandler
public interface GoodsAdapterOnClickHandler {

    /* METHODS */

    /**
     * Click handler for the {@link GoodsAdapter}.
     *
     * @param clickedHolder The {@link com.joslittho.baker_order.viewholder.GoodViewHolder} that has
     *                      been clicked.
     * */
    public void onClick( GoodViewHolder clickedHolder );

} // end interface GoodsAdapterOnClickHandler
