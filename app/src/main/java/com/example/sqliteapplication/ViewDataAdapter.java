package com.example.sqliteapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ViewDataAdapter extends ArrayAdapter {
    private  List<ViewList> ViewList;
    private final LayoutInflater layoutInflater;
    private final int layoutResource;

    public ViewDataAdapter(@NonNull Context context, int resource,  List<ViewList> viewList) {
        super(context, resource);
        this.ViewList = viewList;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutResource = resource;
    }

    @Override
    public int getCount() {
        return ViewList.size();
    }

    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        v = layoutInflater.inflate(layoutResource, parent, false);
        TextView nameText = v.findViewById(R.id.v_name);
        TextView contactText = v.findViewById(R.id.v_contact);
        TextView dobText = v.findViewById(R.id.v_dob);

        nameText.setText(nameText.getText() + ViewList.get(position).getName());
        contactText.setText(contactText.getText() + ViewList.get(position).getContact());
        dobText.setText(dobText.getText() + ViewList.get(position).getDate_of_birth());

        return v;
    }
}
