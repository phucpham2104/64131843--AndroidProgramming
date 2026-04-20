package thigk2.phammachooangphuc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.ViewHolder> {

    private List<Tour> list;

    public TourAdapter(List<Tour> list) {
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgTour;
        TextView txtName, txtAddress;

        public ViewHolder(View itemView) {
            super(itemView);
            imgTour = itemView.findViewById(R.id.imgTour);
            txtName = itemView.findViewById(R.id.txtTourName);
            txtAddress = itemView.findViewById(R.id.txtTourAddress);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tour, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tour tour = list.get(position);
        holder.imgTour.setImageResource(tour.getImage());
        holder.txtName.setText(tour.getName());
        holder.txtAddress.setText(tour.getAddress());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}