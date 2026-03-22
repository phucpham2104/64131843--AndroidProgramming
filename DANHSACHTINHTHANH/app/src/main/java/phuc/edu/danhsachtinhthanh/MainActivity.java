package phuc.edu.danhsachtinhthanh;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- BƯỚC 1: TẠO NGUỒN DỮ LIỆU (ArrayList) ---
        ArrayList<String> dsTenTinhThanhVN = new ArrayList<>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        // --- BƯỚC 2: TẠO ADAPTER ---
        // Tham số 1: Context (this)
        // Tham số 2: Giao diện một dòng (layout mặc định của android)
        // Tham số 3: Nguồn dữ liệu (ArrayList trên)
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN
        );

        // --- BƯỚC 3: GẮN VÀO ĐIỀU KHIỂN HIỂN THỊ (ListView) ---
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
    }
}