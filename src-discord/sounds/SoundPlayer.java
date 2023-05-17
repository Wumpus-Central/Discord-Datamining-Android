package com.discord.sounds;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import com.discord.logging.Log;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B'\b\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u001c\u0010\u001dBC\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u001c\u0010$J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/discord/sounds/SoundPlayer;", "", "Lkotlin/Function1;", "", "", "soundResIdPrepared", "initializeMediaPlayer", "play", "pause", "stop", "release", "", "volume", "setVolume", "pan", "setPan", "time", "setCurrentTime", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "F", "numberOfLoops", "I", "getNumberOfLoops", "()I", "setNumberOfLoops", "(I)V", "<init>", "(Landroid/media/MediaPlayer;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "usage", "soundResId", "", "filePath", "(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Companion", "sounds_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SoundPlayer {
    public static final Companion Companion = new Companion(null);
    private MediaPlayer mediaPlayer;
    private int numberOfLoops;
    private float volume;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/discord/sounds/SoundPlayer$Companion;", "", "()V", "createMediaPlayer", "Landroid/media/MediaPlayer;", "context", "Landroid/content/Context;", "usage", "", "soundResId", "filePath", "", "(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/String;)Landroid/media/MediaPlayer;", "sounds_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MediaPlayer createMediaPlayer(Context context, int i10, Integer num, String str) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(i10).build());
            if (num != null) {
                AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(num.intValue());
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            }
            if (str != null) {
                try {
                    mediaPlayer.setDataSource(context, Uri.parse(str));
                } catch (Exception e10) {
                    Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to set sound.", e10);
                }
            }
            return mediaPlayer;
        }
    }

    public SoundPlayer(MediaPlayer mediaPlayer, Function1<? super Integer, Unit> soundResIdPrepared) {
        q.g(soundResIdPrepared, "soundResIdPrepared");
        this.mediaPlayer = mediaPlayer;
        this.volume = 1.0f;
        initializeMediaPlayer(soundResIdPrepared);
    }

    private final void initializeMediaPlayer(final Function1<? super Integer, Unit> function1) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.discord.sounds.a
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    SoundPlayer.initializeMediaPlayer$lambda$0(SoundPlayer.this, mediaPlayer2);
                }
            });
        }
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.discord.sounds.b
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    SoundPlayer.initializeMediaPlayer$lambda$1(Function1.this, mediaPlayer3);
                }
            });
        }
        try {
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.prepare();
            }
        } catch (IOException unused) {
            this.mediaPlayer = null;
            function1.invoke(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeMediaPlayer$lambda$0(SoundPlayer this$0, MediaPlayer mediaPlayer) {
        q.g(this$0, "this$0");
        int i10 = this$0.numberOfLoops;
        if (i10 != 0) {
            this$0.numberOfLoops = i10 - 1;
            this$0.play();
            return;
        }
        this$0.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeMediaPlayer$lambda$1(Function1 soundResIdPrepared, MediaPlayer mediaPlayer) {
        q.g(soundResIdPrepared, "$soundResIdPrepared");
        soundResIdPrepared.invoke(Integer.valueOf(mediaPlayer.getDuration()));
    }

    public final int getNumberOfLoops() {
        return this.numberOfLoops;
    }

    public final void pause() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
        } catch (Exception e10) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pause.", e10);
        }
    }

    public final void play() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        } catch (Exception e10) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to start.", e10);
        }
    }

    public final void release() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.mediaPlayer = null;
        } catch (Exception unused) {
            this.mediaPlayer = null;
            Log.w$default(Log.INSTANCE, SoundManager.Companion.getLogTag(), "Unable to release media player.", (Throwable) null, 4, (Object) null);
        }
    }

    public final void setCurrentTime(int i10) {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i10);
            }
        } catch (Exception e10) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to seek to.", e10);
        }
    }

    public final void setNumberOfLoops(int i10) {
        this.numberOfLoops = i10;
    }

    public final void setPan(float f10) {
        float f11;
        float f12;
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        try {
            if (i10 >= 0) {
                float f13 = 2;
                f11 = this.volume * (f13 - (f10 * f13));
            } else {
                f11 = this.volume;
            }
            if (i10 >= 0) {
                f12 = this.volume;
            } else {
                f12 = f10 * 2 * this.volume;
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f11, f12);
            }
        } catch (Exception e10) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", e10);
        }
    }

    public final void setVolume(float f10) {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f10, f10);
            }
            this.volume = f10;
        } catch (Exception e10) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to set volume.", e10);
        }
    }

    public final void stop() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.seekTo(0);
            }
        } catch (Exception e10) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to stop.", e10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundPlayer(Context context, int i10, Integer num, String str, Function1<? super Integer, Unit> soundResIdPrepared) {
        this(Companion.createMediaPlayer(context, i10, num, str), soundResIdPrepared);
        q.g(context, "context");
        q.g(soundResIdPrepared, "soundResIdPrepared");
    }
}
