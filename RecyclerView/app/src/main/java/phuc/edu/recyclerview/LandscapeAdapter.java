package phuc.edu.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemViewHolder> {
    private Context context;
    private ArrayList<Landscape> listData;

    public LandscapeAdapter(Context context, ArrayList<Landscape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_land, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Landscape item = listData.get(position);
        holder.tvCaption.setText(item.getLandscapeCaption());


        String packageName = context.getPackageName();
        int imageId = context.getResources().getIdentifier(item.getLandscapeImageName(), "mipmap", packageName);
        holder.ivLandscape.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    //
    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView ivLandscape;
        TextView tvCaption;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLandscape = itemView.findViewById(R.id.iv_landscape);
            tvCaption = itemView.findViewById(R.id.tv_caption);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            Landscape clickedItem = listData.get(pos);
            Toast.makeText(context, "Bạn chọn: " + clickedItem.getLandscapeCaption(), Toast.LENGTH_SHORT).show();
        }
    }
}