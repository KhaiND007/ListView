package cntt61.a61133778;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    private ArrayList<String> listData;
    private ArrayAdapter<String> adapter;
    private TextView textView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        textView = (TextView) findViewById(R.id.tv);

        listData = new ArrayList<>();
        listData.add("Intel");
        listData.add("SamSung");
        listData.add("Nokia");
        listData.add("Simen");
        listData.add("AMD");
        listData.add("KIC");
        listData.add("ECD");

        adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, listData);

        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int i, long id){
        super.onListItemClick(l, v, i, id);
        textView.setText("positon: "+i+" ; value = "+listData.get(i));
    }
}