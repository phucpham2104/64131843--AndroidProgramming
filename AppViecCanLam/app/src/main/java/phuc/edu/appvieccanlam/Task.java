package phuc.edu.appvieccanlam;

import java.util.HashMap;

public class Task {
    private String name;
    private String date;
    private String message;
    private String priority;

    // Constructor mặc định (Bắt buộc phải có để Firebase đọc dữ liệu)
    public Task() {
    }

    // Constructor có tham số
    public Task(String name, String date, String message, String priority) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    // Getter và Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    // Phương thức chuyển đổi sang Map để đẩy lên Firebase
    public HashMap<String, String> toObject() {
        HashMap<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("date", date);
        result.put("message", message);
        result.put("priority", priority);
        return result;
    }
}