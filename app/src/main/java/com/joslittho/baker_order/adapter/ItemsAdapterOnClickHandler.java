package com.joslittho.baker_order.adapter;

import com.joslittho.baker_order.viewholder.ItemViewHolder;

/**
 * Handler for click events in the {@link android.support.v7.widget.RecyclerView} populated by the
 * {@link ItemsAdapter}.
 */
// begin interface ItemsAdapterOnClickHandler
public interface ItemsAdapterOnClickHandler {

    /* METHODS */

    /**
     * Click handler for the {@link ItemsAdapter}.
     *
     * @param clickedHolder The {@link ItemViewHolder} that has
     *                      been clicked.
     * */
    public void onClick( ItemViewHolder clickedHolder );

} // end interface ItemsAdapterOnClickHandler
