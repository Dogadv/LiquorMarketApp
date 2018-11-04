package org.dogadaev.liquormarket.presentation.view.adapter;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.dogadaev.liquormarket.R;
import org.dogadaev.liquormarket.data.model.ProductItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsRecyclerAdapter extends RecyclerView.Adapter<ProductsRecyclerAdapter.ViewHolder> {

    private List<ProductItem> data = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public void addData(@NonNull List<ProductItem> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.productThumbnail)
        ImageView thumbnail;
        @BindView(R.id.productTitle)
        TextView title;
        @BindView(R.id.productAmount)
        TextView amount;
        @BindView(R.id.productPrice)
        TextView price;
        @BindView(R.id.productOldPrice)
        TextView oldPrice;
        @BindView(R.id.productSinglePrice)
        TextView singlePrice;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(ProductItem productItem) {
            String sThumbnailLink = productItem.getImageThumbUrl();
            if (sThumbnailLink != null)
                    Picasso.get().load(sThumbnailLink).into(thumbnail);
            else thumbnail.setImageResource(R.drawable.ic_beer);

            title.setText(productItem.getName());

            int iAmount = productItem.getTotalPackageUnits();
            String sAmount = "x" + iAmount;
            amount.setText(sAmount);

            float fPrice = (float) productItem.getPriceInCents() / 100;
            String sPrice = "$" + fPrice;
            price.setText(sPrice);

            if (iAmount > 1) {
                String sSinglePrice = "($" + String.format(Locale.ENGLISH, "%.2f", fPrice / iAmount) + " per unit)";
                singlePrice.setText(sSinglePrice);
                singlePrice.setVisibility(View.VISIBLE);
            }

            if(productItem.getPriceInCents() < productItem.getRegularPriceInCents()) {
                float fOldPrice = (float) productItem.getRegularPriceInCents() / 100;
                String sOldPrice = "$" + fOldPrice;
                oldPrice.setText(sOldPrice);
                oldPrice.setPaintFlags(Paint.ANTI_ALIAS_FLAG | Paint.STRIKE_THRU_TEXT_FLAG);
                oldPrice.setVisibility(View.VISIBLE);
            }
        }
    }
}
