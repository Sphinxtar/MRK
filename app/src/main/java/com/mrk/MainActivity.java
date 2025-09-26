package com.mrk;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    // Using ArrayList to store images data
    ArrayList<Integer> testIcon = new ArrayList<>(Arrays.asList(R.drawable.balanced, R.drawable.low,
            R.drawable.needsattention, R.drawable.normal,
            R.drawable.low, R.drawable.balanced,
            R.drawable.low, R.drawable.needsattention));
    ArrayList <String> testTitle = new ArrayList<>(Arrays.asList("Title One", "Title Two", "Title Three", "Title Four", "Title Five",
            "Title Six", "Title Seven", "Title Eight"));
    ArrayList <String> testDesc = new ArrayList<>(Arrays.asList("Description One", "Description Two", "Description Three",
            "Description Four", "Description Five", "Description Six", "Description Seven", "Description Eight"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Getting reference of recyclerView
        recyclerView = findViewById(R.id.recyclerView);
        // Setting the layout as grid
        // layout for vertical orientation
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        //    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(gridLayoutManager);
        // Sending reference and data to Adapter
        Adapter adapter = new Adapter(MainActivity.this, testIcon, testTitle, testDesc);
        // Setting Adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
