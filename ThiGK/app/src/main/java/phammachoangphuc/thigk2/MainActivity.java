package phammachoangphuc.thigk2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCn2, btnCn3, btnCn4, btnAbout, btnLamThem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCn2 = findViewById(R.id.btnChucNang2);
        btnCn3 = findViewById(R.id.btnChucNang3);
        btnCn4 = findViewById(R.id.btnChucNang4);
        btnAbout = findViewById(R.id.btnAboutMe);


        btnCn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang2Activity.class)));
        btnCn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang3Activity.class)));
        btnCn4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang4Activity.class)));
        btnAbout.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AboutMeActivity.class)));

    }
}