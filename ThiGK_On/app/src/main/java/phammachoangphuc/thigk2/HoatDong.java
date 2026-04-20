package phammachoangphuc.thigk2;

public class HoatDong {
    private int hinh;
    private String tieuDe;
    private String thoiGian;

    public HoatDong(int hinh, String tieuDe, String thoiGian) {
        this.hinh = hinh;
        this.tieuDe = tieuDe;
        this.thoiGian = thoiGian;
    }

    public int getHinh() {
        return hinh;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getThoiGian() {
        return thoiGian;
    }
}