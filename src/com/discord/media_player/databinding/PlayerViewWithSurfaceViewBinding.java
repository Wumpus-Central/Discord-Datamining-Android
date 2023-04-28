package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.media_player.C4555R;
import com.google.android.exoplayer2.p049ui.PlayerView;

/* loaded from: classes5.dex */
public final class PlayerViewWithSurfaceViewBinding {
    private final PlayerView rootView;

    private PlayerViewWithSurfaceViewBinding(PlayerView playerView) {
        this.rootView = playerView;
    }

    public static PlayerViewWithSurfaceViewBinding bind(View view) {
        if (view != null) {
            return new PlayerViewWithSurfaceViewBinding((PlayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static PlayerViewWithSurfaceViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlayerViewWithSurfaceViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4555R.layout.player_view_with_surface_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public PlayerView getRoot() {
        return this.rootView;
    }
}
