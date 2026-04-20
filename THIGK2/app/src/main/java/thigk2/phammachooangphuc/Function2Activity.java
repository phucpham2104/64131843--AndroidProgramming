package thigk2.phammachooangphuc;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Function2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function2);

        ListView listView = findViewById(R.id.listCities);
        String[] cities = {"Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Hải Phòng",
                "Cần Thơ", "Nghệ An", "Huế", "Họ và Tên", "Khánh Hòa", "Bình Dương"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, cities);
        listView.setAdapter(adapter);
    }
}