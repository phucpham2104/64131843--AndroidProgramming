    package phuc.edu.recyclerview;

    import android.os.Bundle;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;
    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        ArrayList<Landscape> dsData;
        LandscapeAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            dsData = new ArrayList<>();
            dsData.add(new Landscape("hanoi_flag", "Cột cờ Hà Nội"));
            dsData.add(new Landscape("statue_liberty", "Tượng nữ thần tự do"));
            dsData.add(new Landscape("buckingham", "Cung điện Buckingham"));

            recyclerView = findViewById(R.id.recyclerLand);


            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            adapter = new LandscapeAdapter(this, dsData);
            recyclerView.setAdapter(adapter);
        }
    }