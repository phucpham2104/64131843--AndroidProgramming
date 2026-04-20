package thigk2.phammachooangphuc;


import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Function3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function3);

        ListView listView = findViewById(R.id.listTour);
        String[] tours = {
                "Vinpearl Land - Đảo Hòn Tre",
                "Tháp Bà Ponagar - Núi Cù Hin",
                "Bãi Dài - Cam Ranh",
                "Chùa Long Sơn - Phường Phương Sơn",
                "Hòn Chồng - Vĩnh Phước"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, tours);
        listView.setAdapter(adapter);
    }
}