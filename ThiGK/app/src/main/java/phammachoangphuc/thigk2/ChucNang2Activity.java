package phammachoangphuc.thigk2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {

    EditText edtNgay, edtThang, edtNam;
    Button btnKiemTra;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        edtNgay = findViewById(R.id.edtNgay);
        edtThang = findViewById(R.id.edtThang);
        edtNam = findViewById(R.id.edtNam);
        btnKiemTra = findViewById(R.id.btnKiemTra);
        tvKetQua = findViewById(R.id.tvKetQua);

        btnKiemTra.setOnClickListener(v -> {
            String ngay = edtNgay.getText().toString().trim();
            String thang = edtThang.getText().toString().trim();
            String nam = edtNam.getText().toString().trim();

            if (ngay.isEmpty() || thang.isEmpty() || nam.isEmpty()) {
                tvKetQua.setText("Vui lòng nhập đầy đủ ngày, tháng, năm");
                return;
            }

            int d = Integer.parseInt(ngay);
            int m = Integer.parseInt(thang);
            int y = Integer.parseInt(nam);

            if (d == 30 && m == 4 && y == 1975) {
                tvKetQua.setText("Đúng! Mốc thời gian là 30/4/1975");
            } else {
                tvKetQua.setText("Sai! Đáp án đúng là 30/4/1975");
            }
        });
    }
}