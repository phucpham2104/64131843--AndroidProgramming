package phuc.edu.baith6_xulysukien_tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // xử lý cộng
    public void XuLyCong(View view){
        // b1: lấy dữ liệu
        EditText editTextSo1 = findViewById(R.id.edtNumber1);
        EditText editTextSo2 = findViewById(R.id.edtNumber2);

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        // b2: tính toán
        float Tong = soA + soB;

        // b3: hiển thị kết quả
        TextView tvKetqua = findViewById(R.id.tvResult);
        tvKetqua.setText("Kết quả: " + Tong);
    }
}