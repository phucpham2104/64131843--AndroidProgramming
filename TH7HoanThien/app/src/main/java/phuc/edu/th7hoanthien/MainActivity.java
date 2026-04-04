package phuc.edu.th7hoanthien;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> dsTenTinhThanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsTenTinhThanh = new ArrayList<>();
        dsTenTinhThanh.add("Hà Nội");
        dsTenTinhThanh.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanh.add("Đồng Nai");
        dsTenTinhThanh.add("Bình Thuận");
        dsTenTinhThanh.add("Ninh Thuận");
        dsTenTinhThanh.add("Nha Trang");


        ArrayAdapter<String> adapterTT = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanh
        );


        ListView lvTT = findViewById(R.id.lv_danhsachTT);
        lvTT.setAdapter(adapterTT);


        lvTT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String tenTinh = dsTenTinhThanh.get(i);

                Toast.makeText(MainActivity.this,
                        "Bạn vừa chọn: " + tenTinh,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}