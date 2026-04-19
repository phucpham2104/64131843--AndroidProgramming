package phammachoangphuc.thigk2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Item4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        TextView tvChiTiet = findViewById(R.id.tvChiTietItem4);
        String tieuDe = getIntent().getStringExtra("tieuDe");
        String thoiGian = getIntent().getStringExtra("thoiGian");
        tvChiTiet.setText("Tiêu đề: " + tieuDe + "\nThời gian: " + thoiGian);
    }
}