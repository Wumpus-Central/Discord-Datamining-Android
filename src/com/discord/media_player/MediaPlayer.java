package com.discord.media_player;

import android.content.Context;
import com.discord.logging.Log;
import com.discord.media_player.MediaPlayerView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p079e7.C6148e;
import p079e7.C6163q;
import p153i8.C7751k0;

@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u0003567B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0007J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\nH\u0007J\b\u0010$\u001a\u00020\nH\u0007JF\u0010%\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007J\b\u0010-\u001a\u00020\nH\u0007J\u000e\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001bJ\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0016H\u0007J\u0006\u00104\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u00068"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer;", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V", "eventListener", "Lkotlin/Function1;", "Lcom/discord/media_player/MediaPlayer$Event;", "", "getEventListener", "()Lkotlin/jvm/functions/Function1;", "setEventListener", "(Lkotlin/jvm/functions/Function1;)V", "mediaSource", "Lcom/discord/media_player/MediaSource;", "getMediaSource", "()Lcom/discord/media_player/MediaSource;", "setMediaSource", "(Lcom/discord/media_player/MediaSource;)V", "volumeListener", "", "getVolumeListener", "setVolumeListener", "bufferedPercentage", "currentPositionMs", "", "currentPositionPercentage", "durationMs", "hasEnded", "", "hasError", "isMuted", "isPlaying", "pause", "play", "preparePlayer", "autoPlayWhenReady", "loopMedia", "initialSeekPositionMs", "playerView", "Lcom/discord/media_player/MediaPlayerView;", "playerControlView", "Lcom/discord/media_player/MediaPlayerView$ControlView;", "reset", "seekTo", "positionMs", "setEvent", "event", "setVolume", "volume", "shouldPlay", "Companion", "Event", "Factory", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MediaPlayer {
    private static final int BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    private static final int BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BUFFER_MS = 30000;
    private static final int MIN_BUFFER_MS = 10000;
    private final DataSource.Factory dataSourceFactory;
    private final SimpleExoPlayer exoPlayer;
    private MediaSource mediaSource;
    private Function1<? super Event, Unit> eventListener = MediaPlayer$eventListener$1.INSTANCE;
    private Function1<? super Float, Unit> volumeListener = MediaPlayer$volumeListener$1.INSTANCE;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Companion;", "", "()V", "BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS", "", "BUFFER_FOR_PLAYBACK_MS", "MAX_BUFFER_MS", "MIN_BUFFER_MS", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event;", "", "()V", "BufferEnd", "BufferStart", "Paused", "PlaybackEnded", "PlaybackError", "StartedPlaying", "Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Event {

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class BufferEnd extends Event {
            public static final BufferEnd INSTANCE = new BufferEnd();

            private BufferEnd() {
                super(null);
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class BufferStart extends Event {
            public static final BufferStart INSTANCE = new BufferStart();

            private BufferStart() {
                super(null);
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class Paused extends Event {
            public static final Paused INSTANCE = new Paused();

            private Paused() {
                super(null);
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class PlaybackEnded extends Event {
            public static final PlaybackEnded INSTANCE = new PlaybackEnded();

            private PlaybackEnded() {
                super(null);
            }
        }

        @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class PlaybackError extends Event {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaybackError(Exception exception) {
                super(null);
                C9677q.m14633g(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ PlaybackError copy$default(PlaybackError playbackError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = playbackError.exception;
                }
                return playbackError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final PlaybackError copy(Exception exception) {
                C9677q.m14633g(exception, "exception");
                return new PlaybackError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlaybackError) && C9677q.m14638b(this.exception, ((PlaybackError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                Exception exc = this.exception;
                return "PlaybackError(exception=" + exc + ")";
            }
        }

        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class StartedPlaying extends Event {
            public static final StartedPlaying INSTANCE = new StartedPlaying();

            private StartedPlaying() {
                super(null);
            }
        }

        private Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/media_player/MediaPlayer$Factory;", "", "()V", "create", "Lcom/discord/media_player/MediaPlayer;", "context", "Landroid/content/Context;", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public final MediaPlayer create(Context context) {
            C9677q.m14633g(context, "context");
            C6148e a = new C6148e.C6149a().m24545d(MediaPlayer.MIN_BUFFER_MS, MediaPlayer.MAX_BUFFER_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS).m24548a();
            C9677q.m14634f(a, "Builder()\n              …\n                .build()");
            SimpleExoPlayer w = new SimpleExoPlayer.C4466b(context).m30442y(a).m30444w();
            C9677q.m14634f(w, "Builder(context)\n       …\n                .build()");
            return new MediaPlayer(w, CacheDataSourceFactory.Companion.getInstance());
        }
    }

    public MediaPlayer(SimpleExoPlayer exoPlayer, DataSource.Factory dataSourceFactory) {
        C9677q.m14633g(exoPlayer, "exoPlayer");
        C9677q.m14633g(dataSourceFactory, "dataSourceFactory");
        this.exoPlayer = exoPlayer;
        this.dataSourceFactory = dataSourceFactory;
        exoPlayer.mo30364K(new Player.AbstractC4462a() { // from class: com.discord.media_player.MediaPlayer.1
            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                C6163q.m24451a(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
                C6163q.m24450b(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
                C6163q.m24449c(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                C6163q.m24448d(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public void onIsPlayingChanged(boolean z) {
                C6163q.m24447e(this, z);
                if (z) {
                    MediaPlayer.this.setEvent(Event.StartedPlaying.INSTANCE);
                } else if (MediaPlayer.this.exoPlayer.mo30355P() != 4) {
                    MediaPlayer.this.setEvent(Event.Paused.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                C6163q.m24446f(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                C6163q.m24445g(this, mediaItem, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                C6163q.m24444h(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                C6163q.m24443i(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public void onPlaybackStateChanged(int i) {
                C6163q.m24442j(this, i);
                if (i == 2) {
                    MediaPlayer.this.setEvent(Event.BufferStart.INSTANCE);
                } else if (i == 3) {
                    MediaPlayer.this.setEvent(Event.BufferEnd.INSTANCE);
                } else if (i == 4) {
                    MediaPlayer.this.setEvent(Event.PlaybackEnded.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                C6163q.m24441k(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public void onPlayerError(ExoPlaybackException error) {
                String str;
                C9677q.m14633g(error, "error");
                C6163q.m24440l(this, error);
                MediaPlayer.this.setEvent(new Event.PlaybackError(error));
                Log log = Log.INSTANCE;
                String simpleName = C34951.class.getSimpleName();
                C9677q.m14634f(simpleName, "javaClass.simpleName");
                MediaSource mediaSource = MediaPlayer.this.getMediaSource();
                if (mediaSource != null) {
                    str = mediaSource.getFeatureTag();
                } else {
                    str = null;
                }
                log.m32179e(simpleName, "Playback error for feature: " + str, error);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                C6163q.m24439m(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                C6163q.m24438n(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                C6163q.m24437o(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                C6163q.m24436p(this);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                C6163q.m24435q(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
                C6163q.m24434r(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                C6163q.m24433s(this, timeline, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            @Deprecated
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
                C6163q.m24432t(this, timeline, obj, i);
            }

            @Override // com.google.android.exoplayer2.Player.AbstractC4462a
            public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                C6163q.m24431u(this, trackGroupArray, trackSelectionArray);
            }
        });
    }

    public static /* synthetic */ void preparePlayer$default(MediaPlayer mediaPlayer, MediaSource mediaSource, boolean z, boolean z2, long j, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView, int i, Object obj) {
        boolean z3 = false;
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) == 0) {
            z3 = z2;
        }
        long j2 = (i & 8) != 0 ? 0L : j;
        MediaPlayerView.ControlView controlView2 = null;
        MediaPlayerView mediaPlayerView2 = (i & 16) != 0 ? null : mediaPlayerView;
        if ((i & 32) == 0) {
            controlView2 = controlView;
        }
        mediaPlayer.preparePlayer(mediaSource, z4, z3, j2, mediaPlayerView2, controlView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setEvent(Event event) {
        this.eventListener.invoke(event);
    }

    public final float bufferedPercentage() {
        return this.exoPlayer.m30277Z() / 100.0f;
    }

    public final long currentPositionMs() {
        return this.exoPlayer.mo30341Y();
    }

    public final float currentPositionPercentage() {
        return ((float) currentPositionMs()) / ((float) durationMs());
    }

    public final long durationMs() {
        return this.exoPlayer.getDuration();
    }

    public final Function1<Event, Unit> getEventListener() {
        return this.eventListener;
    }

    public final MediaSource getMediaSource() {
        return this.mediaSource;
    }

    public final Function1<Float, Unit> getVolumeListener() {
        return this.volumeListener;
    }

    public final boolean hasEnded() {
        return this.exoPlayer.mo30355P() == 4;
    }

    public final boolean hasError() {
        return this.exoPlayer.mo30308n() != null;
    }

    public final boolean isMuted() {
        return this.exoPlayer.m30523M0() == 0.0f;
    }

    public final boolean isPlaying() {
        return this.exoPlayer.mo30279Q();
    }

    public final void pause() {
        this.exoPlayer.mo30305o(false);
    }

    public final void play() {
        this.exoPlayer.mo30305o(true);
    }

    public final void preparePlayer(MediaSource mediaSource, boolean z, boolean z2, long j, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView) {
        C9677q.m14633g(mediaSource, "mediaSource");
        this.mediaSource = mediaSource;
        this.exoPlayer.m30506a1(1);
        C7751k0.C7753b bVar = new C7751k0.C7753b(this.dataSourceFactory);
        String sourceUrl = mediaSource.getSourceUrl();
        C9677q.m14636d(sourceUrl);
        C7751k0 c = bVar.m20138c(MediaItem.m30552b(sourceUrl));
        C9677q.m14634f(c, "Factory(dataSourceFactor…mediaSource.sourceUrl!!))");
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.m30511W0(c);
        simpleExoPlayer.m30274c0(j);
        simpleExoPlayer.mo30352R(z2 ? 1 : 0);
        simpleExoPlayer.mo30335c();
        if (mediaPlayerView != null) {
            mediaPlayerView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (controlView != null) {
            controlView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (z) {
            play();
        }
    }

    public final void reset() {
        seekTo(0L);
        this.exoPlayer.mo30305o(false);
    }

    public final void seekTo(long j) {
        this.exoPlayer.m30274c0(j);
    }

    public final void setEventListener(Function1<? super Event, Unit> function1) {
        C9677q.m14633g(function1, "<set-?>");
        this.eventListener = function1;
    }

    public final void setMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    public final void setVolume(float f) {
        this.exoPlayer.m30502d1(f);
        this.volumeListener.invoke(Float.valueOf(f));
    }

    public final void setVolumeListener(Function1<? super Float, Unit> function1) {
        C9677q.m14633g(function1, "<set-?>");
        this.volumeListener = function1;
    }

    public final boolean shouldPlay() {
        return this.exoPlayer.mo30371G();
    }
}
