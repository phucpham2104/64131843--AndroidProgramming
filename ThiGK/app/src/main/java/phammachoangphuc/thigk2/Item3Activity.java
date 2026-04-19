package phammachoangphuc.thigk2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Item3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        TextView tvNoiDung = findViewById(R.id.tvNoiDungItem3);
        String tenBaiHat = getIntent().getStringExtra("tenBaiHat");
        tvNoiDung.setText("Bạn vừa chọn bài hát: " + tenBaiHat);
    }
}