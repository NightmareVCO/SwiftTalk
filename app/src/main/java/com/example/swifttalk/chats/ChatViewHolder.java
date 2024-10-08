package com.example.swifttalk.chats;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.swifttalk.R;

public class ChatViewHolder extends RecyclerView.ViewHolder {
  TextView nameView, lastMessageView, timestampView;
  ImageView userCoverView;

  public ChatViewHolder(View itemView) {
    super(itemView);

    nameView = itemView.findViewById(R.id.user_name);
    lastMessageView = itemView.findViewById(R.id.last_message);
    timestampView = itemView.findViewById(R.id.timestamp);
    userCoverView = itemView.findViewById(R.id.user_cover);
  }
}
