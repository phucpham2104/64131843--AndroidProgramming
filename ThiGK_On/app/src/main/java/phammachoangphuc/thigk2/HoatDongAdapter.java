package phammachoangphuc.thigk2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.ViewHolder> {

    private final List<HoatDong> dsHoatDong;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(HoatDong hoatDong);
    }

    public HoatDongAdapter(List<HoatDong> dsHoatDong, OnItemClickListener listener) {
        this.dsHoatDong = dsHoatDong;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hoat_dong, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HoatDong item = dsHoatDong.get(position);
        holder.imgAnh.setImageResource(item.getHinh());
        holder.tvTieuDe.setText(item.getTieuDe());
        holder.tvThoiGian.setText(item.getThoiGian());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(item));
    }

    @Override
    public int getItemCount() {
        return dsHoatDong.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAnh;
        TextView tvTieuDe, tvThoiGian;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imgHoatDong);
            tvTieuDe = itemView.findViewById(R.id.tvTieuDeHoatDong);
            tvThoiGian = itemView.findViewById(R.id.tvThoiGianHoatDong);
        }
    }
}