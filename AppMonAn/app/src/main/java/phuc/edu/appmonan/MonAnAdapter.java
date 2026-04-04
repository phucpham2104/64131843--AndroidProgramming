package phuc.edu.appmonan;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater inflater;

    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.context = context;
        this.dsMonAn = dsMonAn;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() { return dsMonAn.size(); }

    @Override
    public Object getItem(int i) { return dsMonAn.get(i); }

    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.item_monan, null);
        }

        // Ánh xạ các View
        TextView tvTen = view.findViewById(R.id.tv_ten_mon);
        TextView tvGia = view.findViewById(R.id.tv_don_gia);
        TextView tvMoTa = view.findViewById(R.id.tv_mo_ta);
        ImageView img = view.findViewById(R.id.img_dai_dien);

        // Đổ dữ liệu vào View
        MonAn m = dsMonAn.get(i);
        tvTen.setText(m.getTenMonAn());
        tvGia.setText(String.valueOf(m.getDonGia()) + " VNĐ");
        tvMoTa.setText(m.getMoTa());
        img.setImageResource(m.getIdAnhMinhHoa());

        return view;
    }
}