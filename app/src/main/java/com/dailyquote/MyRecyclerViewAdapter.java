package com.dailyquote;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dailyquote.network.Quote;

import java.util.ArrayList;


/**
 * Created by stoyan-ivanov on 09.09.17.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Quote> mData = new ArrayList<>();
    private LayoutInflater mInflater;

    public MyRecyclerViewAdapter(ArrayList<Quote> data) {
        this.mData = data;
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView dateTextView, quoteTextView;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv);
            dateTextView = (TextView) itemView.findViewById(R.id.viewholder_date);
            quoteTextView = (TextView) itemView.findViewById(R.id.viewholder_quote);

            attachOnClickListener();
        }

        private void attachOnClickListener() {
            dateTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(quoteTextView.getVisibility() == View.GONE) {
                        quoteTextView.setVisibility(View.VISIBLE);
                    } else {
                        quoteTextView.setVisibility(View.GONE);
                        dateTextView.setVisibility(View.VISIBLE);
                    }
                }
            });
        }

    }

      // inflates the cell layout from xml when needed
      @Override
      public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                 View view = mInflater.from(parent.getContext())
                                    .inflate(R.layout.rv_viewholder, parent, false);
                return new ViewHolder(view);
      }

      // binds the data to the textview in each cel
      @Override
      public void onBindViewHolder(ViewHolder holder, int position) {
          Quote currQuote = mData.get(position);
          holder.dateTextView.setText(currQuote.getQuoteDate());
          holder.quoteTextView.setText(currQuote.getQuoteMsg());

      }

      @Override
      public int getItemCount() {
                 return mData.size();
      }


      // convenience method for getting data at click position
      public Quote getItem(int id) {
         return mData.get(id);
      }
  
//              // allows clicks events to be caught
//              public void setClickListener(ItemClickListener itemClickListener) {
//                 this.mClickListener = itemClickListener;
//             }
//
//              // parent activity will implement this method to respond to click events
//              public interface ItemClickListener {
//          void onItemClick(View view, int position);
//      }
  } 
