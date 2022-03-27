package cntt61.a61133778;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Data> listTinh;

    public DataAdapter(Context context, int layout, List<Data> listTinh) {
        this.context = context;
        this.layout = layout;
        this.listTinh = listTinh;
    }

    @Override
    public int getCount() {
        return listTinh.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView tvTinh = (TextView) view.findViewById(R.id.tvtinh);
        ImageView img = (ImageView) view.findViewById(R.id.image);

        tvTinh.setText(listTinh.get(i).tentinh);
        if(listTinh.get(i).tentinh.length() <=3 )
            img.setImageResource(R.drawable.ngoisao);
        else
            img.setImageResource(R.drawable.traidat);
        return view;
    }
}
