package com.example.bottomnavigationwithtablayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bottomnavigationwithtablayout.Product;
import com.example.bottomnavigationwithtablayout.R;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {

    private Context context;
    private int resource;
    private List<Product> arrayProduct;

    public ProductAdapter(@NonNull Context context, int resource, @NonNull List<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrayProduct = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = convertView.findViewById(R.id.product_name);
            viewHolder.description = convertView.findViewById(R.id.decription);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Product product = arrayProduct.get(position);
        viewHolder.name.setText(product.getName());
        viewHolder.description.setText(product.getDescription());
        return convertView;
    }

    static class ViewHolder {
        TextView name, description;
    }
}
