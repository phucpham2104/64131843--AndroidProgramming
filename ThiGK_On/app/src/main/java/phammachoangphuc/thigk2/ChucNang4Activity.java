package phammachoangphuc.thigk2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChucNang4Activity extends AppCompatActivity {

    RecyclerView rvHoatDong;
    ArrayList<HoatDong> dsHoatDong;
    HoatDongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang4);

        rvHoatDong = findViewById(R.id.rvHoatDong);
        rvHoatDong.setLayoutManager(new LinearLayoutManager(this));

        dsHoatDong = new ArrayList<>();
        dsHoatDong.add(new HoatDong(R.mipmap.ic_launcher, "Hoạt động chào mừng 30/4", "08:00 30/04/2026"));
        dsHoatDong.add(new HoatDong(R.mipmap.ic_launcher, "Văn nghệ truyền thống", "09:30 30/04/2026"));
        dsHoatDong.add(new HoatDong(R.mipmap.ic_launcher, "Triển lãm ảnh lịch sử", "14:00 30/04/2026"));

        adapter = new HoatDongAdapter(dsHoatDong, hoatDong -> {
            Intent intent = new Intent(ChucNang4Activity.this, Item4Activity.class);
            intent.putExtra("tieuDe", hoatDong.getTieuDe());
            intent.putExtra("thoiGian", hoatDong.getThoiGian());
            startActivity(intent);
        });

        rvHoatDong.setAdapter(adapter);
    }
}