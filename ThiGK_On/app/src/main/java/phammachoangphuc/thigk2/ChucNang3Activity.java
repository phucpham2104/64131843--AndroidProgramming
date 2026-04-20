package phammachoangphuc.thigk2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {

    ListView lvBaiHat;
    ArrayList<BaiHat> dsBaiHat;
    BaiHatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        lvBaiHat = findViewById(R.id.lvBaiHat);
        dsBaiHat = new ArrayList<>();
        dsBaiHat.add(new BaiHat("Tiến về Sài Gòn"));
        dsBaiHat.add(new BaiHat("Giải phóng miền Nam"));
        dsBaiHat.add(new BaiHat("Đất nước trọn niềm vui"));
        dsBaiHat.add(new BaiHat("Bài ca thống nhất"));
        dsBaiHat.add(new BaiHat("Mùa xuân trên thành phố Hồ Chí Minh"));

        adapter = new BaiHatAdapter(this, R.layout.item_bai_hat, dsBaiHat);
        lvBaiHat.setAdapter(adapter);

        lvBaiHat.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(ChucNang3Activity.this, Item3Activity.class);
            intent.putExtra("tenBaiHat", dsBaiHat.get(position).getTenBaiHat());
            startActivity(intent);
        });
    }
}