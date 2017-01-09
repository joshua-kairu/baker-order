package com.joslittho.baker_order.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.joslittho.baker_order.R;
import com.joslittho.baker_order.model.BakedGood;

import java.util.List;

/**
 * {@link android.widget.Adapter} for the baked mGoods list
 */
// begin class GoodsAdapter
public class GoodsAdapter extends ArrayAdapter< BakedGood > {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    Context mContext;

    List< BakedGood > mGoods;

    /* CONSTRUCTOR */

    public GoodsAdapter( Context context, List< BakedGood > goods ) {

        super( context, 0, goods );

        mContext = context;

        mGoods = goods;
    }

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @NonNull
    @Override
    public View getView( int position, View convertView, ViewGroup parent ) {

        BakedGood currentGood = mGoods.get( position );

        if ( convertView == null ) {
            convertView = LayoutInflater.from( mContext ).inflate( R.layout.goods_item, parent, false );
        }

        ImageView pictureImageView = ( ImageView ) convertView.findViewById( R.id.good_item_iv_picture );
        TextView nameTextView = ( TextView ) convertView.findViewById( R.id.good_item_tv_name );
        TextView valueTextView = ( TextView ) convertView.findViewById( R.id.good_item_tv_value );

        pictureImageView.setImageResource( currentGood.getPicture() );
        nameTextView.setText( currentGood.getName() );
        valueTextView.setText( String.valueOf( currentGood.getPrice() ) + " XOF" );

        return convertView;
    }

    /* Other Methods */

} // end class GoodsAdapter
