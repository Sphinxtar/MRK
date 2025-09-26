package com.mrk;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

// Extends the Adapter class to RecyclerView.Adapter
// and implement the unimplemented methods
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList <Integer> testImg;
    ArrayList <String> testTitle, testDesc;
    Context context;

    // Constructor for initialization
    public Adapter(Context context, ArrayList <Integer>testImg, ArrayList <String>testTitle, ArrayList<String>testDesc) {
        this.context = context;
        this.testImg = testImg;
        this.testTitle = testTitle;
        this.testDesc = testDesc;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the Layout(Instantiates list_item.xml
        // layout file into View object)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        // Passing view to ViewHolder
        return new ViewHolder(view);
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        // TypeCast Object to int type
        int res = testImg.get(position);
        holder.images.setImageResource(res);
        holder.title.setText(testTitle.get(position));
        holder.desc.setText(testDesc.get(position));
    }

    @Override
    public int getItemCount() {
        // Returns number of items
        // currently available in Adapter
        return testTitle.size();
    }

    // Initializing the Views
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        TextView title;
        TextView desc;
        public ViewHolder(View view) {
            super(view);
            images = view.findViewById(R.id.icon);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
       }
    }
}
