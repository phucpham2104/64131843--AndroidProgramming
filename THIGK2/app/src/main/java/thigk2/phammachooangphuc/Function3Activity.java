package thigk2.phammachooangphuc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Function3Activity extends AppCompatActivity {

    RecyclerView recyclerTour;
    ArrayList<Tour> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function3);

        recyclerTour = findViewById(R.id.recyclerTour);
        recyclerTour.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        list.add(new Tour(R.drawable.vinpearl,
                "Vinpearl Land",
                "Đảo Hòn Tre, Nha Trang"));

        list.add(new Tour(R.drawable.thapba,
                "Tháp Bà Ponagar",
                "2 Tháng 4, Vĩnh Phước"));

        list.add(new Tour(R.drawable.bai_dai,
                "Bãi Dài",
                "Cam Ranh, Khánh Hòa"));

        list.add(new Tour(R.drawable.chua_long_son,
                "Chùa Long Sơn",
                "22 Đường 23/10, Nha Trang"));

        list.add(new Tour(R.drawable.hon_chong,
                "Hòn Chồng",
                "Vĩnh Phước, Nha Trang"));

        TourAdapter adapter = new TourAdapter(list);
        recyclerTour.setAdapter(adapter);
    }
}