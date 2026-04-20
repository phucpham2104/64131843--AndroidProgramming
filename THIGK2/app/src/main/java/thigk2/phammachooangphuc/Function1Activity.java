package thigk2.phammachooangphuc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Function1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function1);

        EditText edtLength = findViewById(R.id.edtLength);
        EditText edtWidth = findViewById(R.id.edtWidth);
        Button btnCalc = findViewById(R.id.btnCalculate);
        TextView txtResult = findViewById(R.id.txtResult);

        btnCalc.setOnClickListener(v -> {
            try {
                double length = Double.parseDouble(edtLength.getText().toString());
                double width = Double.parseDouble(edtWidth.getText().toString());
                double perimeter = 2 * (length + width);
                double area = length * width;
                txtResult.setText("Chu vi: " + perimeter + "\nDiện tích: " + area);
            } catch (Exception e) {
                txtResult.setText("Vui lòng nhập số hợp lệ!");
            }
        });
    }
}