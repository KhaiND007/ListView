package cntt61.a61133778;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView ListView;
    private String[] ListData;
    private ArrayAdapter<String> Adapter;
    private Context context;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        ListView = (ListView) findViewById(R.id.lv);
        textView = (TextView) findViewById(R.id.tv);


        ListData = context.getResources().getStringArray(R.array.ListView);

        Adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, ListData);
        ListView.setAdapter(Adapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                textView.setText("position :"+i+" ; value ="+ListData[(int) l]);
            }
        });
    }

}