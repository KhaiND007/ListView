package cntt61.a61133778;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> listData;
    private ArrayAdapter<String> adapter;
    private Context context;
    private Button btnNhap;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        btnNhap = (Button) findViewById(R.id.btnNhap);
        editText = (EditText) findViewById(R.id.edtext);
        textView = (TextView) findViewById(R.id.tv);

        context = this;

        listData = new ArrayList<>();
        listData.add("Tèo");
        listData.add("Tí");
        listData.add("Bin");
        listData.add("Bo");

        adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String item = editText.getText().toString().trim();
                if(TextUtils.isEmpty(item)) {
                    Toast.makeText(context, "Bạn chưa nhập dữ liệu", Toast.LENGTH_LONG).show();
                    return;
                }
                listData.add(item);
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("position: "+i+"; value = "+listData.get((int) l));
            }
        });
    }
}