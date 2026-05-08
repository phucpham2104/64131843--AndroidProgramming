package phuc.edu.appvieccanlam;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtMsg;
    private Button btnAdd;
    private RecyclerView rvVcl;
    private TaskRecyclerViewAdapter adapter;
    private List<Task> taskList;

    private FirebaseDatabase database;
    private DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Ánh xạ View
        edtName = findViewById(R.id.edt_name);
        edtMsg = findViewById(R.id.edt_msg);
        btnAdd = findViewById(R.id.btn_add);
        rvVcl = findViewById(R.id.rv_vcl);

        // 2. Cấu hình RecyclerView
        taskList = new ArrayList<>();
        adapter = new TaskRecyclerViewAdapter(taskList);
        rvVcl.setLayoutManager(new LinearLayoutManager(this));
        rvVcl.setAdapter(adapter);

        // 3. Kết nối Firebase
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("tasks");

        // 4. Lắng nghe dữ liệu từ Firebase (Read)
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                taskList.clear();
                for (DataSnapshot data : snapshot.getChildren()) {
                    Task task = data.getValue(Task.class);
                    if (task != null) {
                        taskList.add(task);
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý lỗi nếu cần
            }
        });

        // 5. Thêm dữ liệu (Write)
        btnAdd.setOnClickListener(v -> {
            String name = edtName.getText().toString();
            String msg = edtMsg.getText().toString();
            String date = "08/05/2026"; // Ví dụ lấy ngày hiện tại
            String priority = "1";

            Task newTask = new Task(name, date, msg, priority);
            String key = myRef.push().getKey(); // Tạo ID tự động
            if (key != null) {
                myRef.child(key).setValue(newTask.toObject());
            }

            // Xóa trắng ô nhập sau khi thêm
            edtName.setText("");
            edtMsg.setText("");
        });
    }
}