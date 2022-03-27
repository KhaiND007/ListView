package cntt61.a61133778;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Data> arrayList;
    DataAdapter adapter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv);
        listView = (ListView) findViewById(R.id.lv);
        arrayList = new ArrayList<>();

        arrayList.add(new Data("Hà nội"));
        arrayList.add(new Data("Huế"));
        arrayList.add(new Data("Spa"));
        arrayList.add(new Data("Côn Sơn"));
        arrayList.add(new Data("Vũng Tàu"));
        arrayList.add(new Data("Đà Nẵng"));

        adapter = new DataAdapter(this, R.layout.item, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(arrayList.get(i).toString());
            }
        });
    }
}