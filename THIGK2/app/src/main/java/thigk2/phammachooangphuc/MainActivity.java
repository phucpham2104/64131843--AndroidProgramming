package thigk2.phammachooangphuc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnFunction1);
        Button btn2 = findViewById(R.id.btnFunction2);
        Button btn3 = findViewById(R.id.btnFunction3);
        Button btn4 = findViewById(R.id.btnFunction4);

        btn1.setOnClickListener(v -> startActivity(new Intent(this, Function1Activity.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(this, Function2Activity.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(this, Function3Activity.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(this, Function4Activity.class)));
    }
}