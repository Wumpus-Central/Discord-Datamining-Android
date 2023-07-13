package com.discord.sounds;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"JG\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/discord/sounds/SoundManager;", "", "", "key", "usage", "soundResId", "", "filePath", "Lkotlin/Function1;", "", "soundResIdPrepared", "prepare", "(IILjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "play", "pause", "stop", "release", "numberOfLoops", "setNumberOfLoops", "", "volume", "setVolume", "pan", "setPan", "time", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "Lcom/discord/sounds/SoundPlayer;", "soundPlayers", "Ljava/util/Map;", "<init>", "(Landroid/content/Context;)V", "Companion", "sounds_release"}, k = 1, mv = {1, 8, 0})

public final class SoundManager {
    public static final Companion Companion = new Companion(null);
    private static final String logTag;
    private final Context context;
    private Map<Integer, SoundPlayer> soundPlayers = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/sounds/SoundManager$Companion;", "", "()V", "logTag", "", "getLogTag", "()Ljava/lang/String;", "sounds_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getLogTag() {
            return SoundManager.logTag;
        }
    }

    static {
        String simpleName = SoundManager.class.getSimpleName();
        q.f(simpleName, "SoundManager::class.java.simpleName");
        logTag = simpleName;
    }

    public SoundManager(Context context) {
        q.g(context, "context");
        this.context = context;
    }

    public final void pause(int i10) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.pause();
    }

    public final void play(int i10) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.play();
    }

    public final void prepare(int i10, int i11, Integer num, String str, Function1<? super Integer, Unit> soundResIdPrepared) {
        q.g(soundResIdPrepared, "soundResIdPrepared");
        if (!this.soundPlayers.containsKey(Integer.valueOf(i10))) {
            this.soundPlayers.put(Integer.valueOf(i10), new SoundPlayer(this.context, i11, num, str, soundResIdPrepared));
            return;
        }
        throw new IllegalAccessError("Trying to prepare an already prepared asset.");
    }

    public final void release(int i10) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.release();
        this.soundPlayers.remove(Integer.valueOf(i10));
    }

    public final void setCurrentTime(int i10, int i11) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.setCurrentTime(i11);
    }

    public final void setNumberOfLoops(int i10, int i11) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.setNumberOfLoops(i11);
    }

    public final void setPan(int i10, float f10) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.setPan(f10);
    }

    public final void setVolume(int i10, float f10) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.setVolume(f10);
    }

    public final void stop(int i10) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(i10));
        q.d(soundPlayer);
        soundPlayer.stop();
    }
}
