package phuc.edu.appmonan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> dsMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonAn = findViewById(R.id.lv_danhsach_monan);
        dsMonAn = new ArrayList<>();

        // Thêm dữ liệu mẫu (Lưu ý: Bạn cần có ảnh trong thư mục res/drawable)
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Sườn nướng thơm ngon", R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm gà xối mỡ", 35000, "Gà giòn rụm", R.drawable.cg));

        adapter = new MonAnAdapter(this, dsMonAn);
        lvMonAn.setAdapter(adapter);
    }
}