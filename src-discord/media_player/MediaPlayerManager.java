package com.discord.media_player;

import android.content.Context;
import com.discord.media_player.MediaPlayer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0015\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/media_player/MediaPlayerManager;", "", "()V", "MAX_PLAYER_SIZE", "", "acquiredPlayerMap", "", "", "Lcom/discord/media_player/MediaPlayer;", "playerPool", "Ljava/util/concurrent/ArrayBlockingQueue;", "acquire", "context", "Landroid/content/Context;", "key", "release", "", "(Ljava/lang/Double;)Z", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaPlayerManager {
    private static final int MAX_PLAYER_SIZE = 10;
    public static final MediaPlayerManager INSTANCE = new MediaPlayerManager();
    private static final ArrayBlockingQueue<MediaPlayer> playerPool = new ArrayBlockingQueue<>(10);
    private static Map<Double, MediaPlayer> acquiredPlayerMap = new LinkedHashMap();

    private MediaPlayerManager() {
    }

    public final synchronized MediaPlayer acquire(Context context, double d10) {
        boolean z10;
        q.g(context, "context");
        if (acquiredPlayerMap.get(Double.valueOf(d10)) != null) {
            MediaPlayer mediaPlayer = acquiredPlayerMap.get(Double.valueOf(d10));
            q.d(mediaPlayer);
            return mediaPlayer;
        }
        ArrayBlockingQueue<MediaPlayer> arrayBlockingQueue = playerPool;
        if (arrayBlockingQueue.isEmpty()) {
            if (acquiredPlayerMap.size() <= 10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayBlockingQueue.add(MediaPlayer.Factory.INSTANCE.create(context));
            } else {
                throw new IllegalStateException("Reach maxed player size, no more players to initialize".toString());
            }
        }
        MediaPlayer take = arrayBlockingQueue.take();
        MediaPlayer it = take;
        Double valueOf = Double.valueOf(d10);
        Map<Double, MediaPlayer> map = acquiredPlayerMap;
        q.f(it, "it");
        map.put(valueOf, it);
        q.f(take, "playerPool.take().also {…erMap[key] = it\n        }");
        return take;
    }

    public final synchronized boolean release(Double d10) {
        if (d10 == null) {
            return false;
        }
        d10.doubleValue();
        MediaPlayer remove = acquiredPlayerMap.remove(d10);
        if (remove != null) {
            playerPool.add(remove);
        }
        return true;
    }
}
