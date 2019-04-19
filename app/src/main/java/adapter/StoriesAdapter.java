package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.stories.R;
import com.example.stories.StoriesDisplay;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Stories;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder> {
    Context mContext;
    List<Stories> storiesList;

    //constructor to receive data from activity

    public StoriesAdapter(Context mContext, List<Stories> storiesList) {
        this.mContext = mContext;
        this.storiesList = storiesList;
    }

    @NonNull
    @Override
    public StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
         View view = LayoutInflater.from(viewGroup.getContext())
                 .inflate(R.layout.stories, viewGroup, false);
        return new StoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesViewHolder storiesViewHolder, int i) {
        final Stories stories = storiesList.get(i);
        storiesViewHolder.imgStory.setImageResource(stories.getImgStoryId());
        storiesViewHolder.imgProfile.setImageResource(stories.getImgProfileId());

        storiesViewHolder.imgStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, StoriesDisplay.class);
                intent.putExtra("image",stories.getImgStoryId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return storiesList.size();
    }


    public class StoriesViewHolder extends RecyclerView.ViewHolder{
       ImageView imgStory;
       CircleImageView imgProfile;

        public StoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            imgStory = itemView.findViewById(R.id.imgStory);

        }
    }
}
