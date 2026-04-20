package thigk2.phammachooangphuc;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Function4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function4);

        TextView txtInfo = findViewById(R.id.txtInfo);
        txtInfo.setText("Họ và tên: Pham Mac Hoang Phuc\n" +
                "MSSV: 64131843\n" +
                "Lớp: 64.HTTT\n" 
                );
    }
}