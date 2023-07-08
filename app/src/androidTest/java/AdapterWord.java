package cl.recyclerview;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.databinding.ItemBinding;

import java.util.List;


public class AdapterWords extends RecyclerView.Adapter <AdapterWords.ViewHolder>{
    private List<String>words;
    @NonNull
    @Override
    public AdapterWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       ItemBinding binding=ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return null;


    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    {
    }
}

        }

        }

