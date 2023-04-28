package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.media_player.C4555R;
import com.google.android.exoplayer2.p049ui.PlayerView;

/* loaded from: classes5.dex */
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

    public static PlayerViewWithTextureViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4555R.layout.player_view_with_texture_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public PlayerView getRoot() {
        return this.rootView;
    }
}
