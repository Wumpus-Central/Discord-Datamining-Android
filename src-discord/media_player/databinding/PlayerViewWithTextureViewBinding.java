package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.media_player.R;
import com.google.android.exoplayer2.ui.PlayerView;


public final class PlayerViewWithTextureViewBinding {
    private final PlayerView rootView;

    private PlayerViewWithTextureViewBinding(PlayerView playerView) {
        this.rootView = playerView;
    }

    public static PlayerViewWithTextureViewBinding bind(View view) {
        if (view != null) {
            return new PlayerViewWithTextureViewBinding((PlayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static PlayerViewWithTextureViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlayerViewWithTextureViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.player_view_with_texture_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public PlayerView getRoot() {
        return this.rootView;
    }
}
