package com.discord.media_player;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import com.discord.media_player.databinding.PlayerViewWithSurfaceViewBinding;
import com.discord.media_player.databinding.PlayerViewWithTextureViewBinding;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/discord/media_player/MediaPlayerView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "isVisible", "()Z", "setVisible", "(Z)V", "Lcom/google/android/exoplayer2/Player;", "player", "getPlayer$media_player_release", "()Lcom/google/android/exoplayer2/Player;", "setPlayer$media_player_release", "(Lcom/google/android/exoplayer2/Player;)V", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "getPlayerView", "()Lcom/google/android/exoplayer2/ui/PlayerView;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "reset", "", "ControlView", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaPlayerView {
    private View view;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/media_player/MediaPlayerView$ControlView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Lcom/google/android/exoplayer2/Player;", "player", "getPlayer$media_player_release", "()Lcom/google/android/exoplayer2/Player;", "setPlayer$media_player_release", "(Lcom/google/android/exoplayer2/Player;)V", "playerControlView", "Lcom/google/android/exoplayer2/ui/PlayerControlView;", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ControlView {
        private PlayerControlView playerControlView;

        public ControlView(Context context) {
            q.g(context, "context");
            this.playerControlView = new PlayerControlView(context);
        }

        public final Player getPlayer$media_player_release() {
            return this.playerControlView.getPlayer();
        }

        public final void setPlayer$media_player_release(Player player) {
            this.playerControlView.setPlayer(player);
        }
    }

    public MediaPlayerView(Context context) {
        PlayerView playerView;
        q.g(context, "context");
        if (Build.VERSION.SDK_INT < 24) {
            playerView = PlayerViewWithTextureViewBinding.inflate(LayoutInflater.from(context)).getRoot();
            q.f(playerView, "{\n            PlayerView…(context)).root\n        }");
        } else {
            playerView = PlayerViewWithSurfaceViewBinding.inflate(LayoutInflater.from(context)).getRoot();
            q.f(playerView, "{\n            PlayerView…(context)).root\n        }");
        }
        this.view = playerView;
        getPlayerView().setResizeMode(3);
        getPlayerView().setUseController(false);
    }

    private final PlayerView getPlayerView() {
        View view = this.view;
        q.e(view, "null cannot be cast to non-null type com.google.android.exoplayer2.ui.PlayerView");
        return (PlayerView) view;
    }

    public final Player getPlayer$media_player_release() {
        return getPlayerView().getPlayer();
    }

    public final View getView() {
        return this.view;
    }

    public final boolean isVisible() {
        if (this.view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void reset() {
        setPlayer$media_player_release(null);
    }

    public final void setPlayer$media_player_release(Player player) {
        getPlayerView().setPlayer(player);
    }

    public final void setView(View view) {
        q.g(view, "<set-?>");
        this.view = view;
    }

    public final void setVisible(boolean z10) {
        int i10;
        View view = this.view;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }
}
