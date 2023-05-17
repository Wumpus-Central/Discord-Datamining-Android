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
import e7.e;
import i8.k0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u0003567B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0007J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\nH\u0007J\b\u0010$\u001a\u00020\nH\u0007JF\u0010%\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007J\b\u0010-\u001a\u00020\nH\u0007J\u000e\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001bJ\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0016H\u0007J\u0006\u00104\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u00068"}, d2 = {"Lcom/discord/media_player/MediaPlayer;", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V", "eventListener", "Lkotlin/Function1;", "Lcom/discord/media_player/MediaPlayer$Event;", "", "getEventListener", "()Lkotlin/jvm/functions/Function1;", "setEventListener", "(Lkotlin/jvm/functions/Function1;)V", "mediaSource", "Lcom/discord/media_player/MediaSource;", "getMediaSource", "()Lcom/discord/media_player/MediaSource;", "setMediaSource", "(Lcom/discord/media_player/MediaSource;)V", "volumeListener", "", "getVolumeListener", "setVolumeListener", "bufferedPercentage", "currentPositionMs", "", "currentPositionPercentage", "durationMs", "hasEnded", "", "hasError", "isMuted", "isPlaying", "pause", "play", "preparePlayer", "autoPlayWhenReady", "loopMedia", "initialSeekPositionMs", "playerView", "Lcom/discord/media_player/MediaPlayerView;", "playerControlView", "Lcom/discord/media_player/MediaPlayerView$ControlView;", "reset", "seekTo", "positionMs", "setEvent", "event", "setVolume", "volume", "shouldPlay", "Companion", "Event", "Factory", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Companion;", "", "()V", "BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS", "", "BUFFER_FOR_PLAYBACK_MS", "MAX_BUFFER_MS", "MIN_BUFFER_MS", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event;", "", "()V", "BufferEnd", "BufferStart", "Paused", "PlaybackEnded", "PlaybackError", "StartedPlaying", "Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class Event {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class BufferEnd extends Event {
            public static final BufferEnd INSTANCE = new BufferEnd();

            private BufferEnd() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class BufferStart extends Event {
            public static final BufferStart INSTANCE = new BufferStart();

            private BufferStart() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Paused extends Event {
            public static final Paused INSTANCE = new Paused();

            private Paused() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class PlaybackEnded extends Event {
            public static final PlaybackEnded INSTANCE = new PlaybackEnded();

            private PlaybackEnded() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class PlaybackError extends Event {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaybackError(Exception exception) {
                super(null);
                q.g(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ PlaybackError copy$default(PlaybackError playbackError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = playbackError.exception;
                }
                return playbackError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final PlaybackError copy(Exception exception) {
                q.g(exception, "exception");
                return new PlaybackError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlaybackError) && q.b(this.exception, ((PlaybackError) obj).exception);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes8.dex */
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Factory;", "", "()V", "create", "Lcom/discord/media_player/MediaPlayer;", "context", "Landroid/content/Context;", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public final MediaPlayer create(Context context) {
            q.g(context, "context");
            e a10 = new e.a().d(MediaPlayer.MIN_BUFFER_MS, MediaPlayer.MAX_BUFFER_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS).a();
            q.f(a10, "Builder()\n              …\n                .build()");
            SimpleExoPlayer w10 = new SimpleExoPlayer.b(context).y(a10).w();
            q.f(w10, "Builder(context)\n       …\n                .build()");
            return new MediaPlayer(w10, CacheDataSourceFactory.Companion.getInstance());
        }
    }

    public MediaPlayer(SimpleExoPlayer exoPlayer, DataSource.Factory dataSourceFactory) {
        q.g(exoPlayer, "exoPlayer");
        q.g(dataSourceFactory, "dataSourceFactory");
        this.exoPlayer = exoPlayer;
        this.dataSourceFactory = dataSourceFactory;
        exoPlayer.K(new Player.a() { // from class: com.discord.media_player.MediaPlayer.1
            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                e7.q.a(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
                e7.q.b(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z10) {
                e7.q.c(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
                e7.q.d(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public void onIsPlayingChanged(boolean z10) {
                e7.q.e(this, z10);
                if (z10) {
                    MediaPlayer.this.setEvent(Event.StartedPlaying.INSTANCE);
                } else if (MediaPlayer.this.exoPlayer.P() != 4) {
                    MediaPlayer.this.setEvent(Event.Paused.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
                e7.q.f(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
                e7.q.g(this, mediaItem, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
                e7.q.h(this, z10, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                e7.q.i(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public void onPlaybackStateChanged(int i10) {
                e7.q.j(this, i10);
                if (i10 == 2) {
                    MediaPlayer.this.setEvent(Event.BufferStart.INSTANCE);
                } else if (i10 == 3) {
                    MediaPlayer.this.setEvent(Event.BufferEnd.INSTANCE);
                } else if (i10 == 4) {
                    MediaPlayer.this.setEvent(Event.PlaybackEnded.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
                e7.q.k(this, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public void onPlayerError(ExoPlaybackException error) {
                String str;
                q.g(error, "error");
                e7.q.l(this, error);
                MediaPlayer.this.setEvent(new Event.PlaybackError(error));
                Log log = Log.INSTANCE;
                String simpleName = AnonymousClass1.class.getSimpleName();
                q.f(simpleName, "javaClass.simpleName");
                MediaSource mediaSource = MediaPlayer.this.getMediaSource();
                if (mediaSource != null) {
                    str = mediaSource.getFeatureTag();
                } else {
                    str = null;
                }
                log.e(simpleName, "Playback error for feature: " + str, error);
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
                e7.q.m(this, z10, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
                e7.q.n(this, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
                e7.q.o(this, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                e7.q.p(this);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
                e7.q.q(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
                e7.q.r(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
                e7.q.s(this, timeline, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i10) {
                e7.q.t(this, timeline, obj, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                e7.q.u(this, trackGroupArray, trackSelectionArray);
            }
        });
    }

    public static /* synthetic */ void preparePlayer$default(MediaPlayer mediaPlayer, MediaSource mediaSource, boolean z10, boolean z11, long j10, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView, int i10, Object obj) {
        boolean z12 = false;
        boolean z13 = (i10 & 2) != 0 ? false : z10;
        if ((i10 & 4) == 0) {
            z12 = z11;
        }
        long j11 = (i10 & 8) != 0 ? 0L : j10;
        MediaPlayerView.ControlView controlView2 = null;
        MediaPlayerView mediaPlayerView2 = (i10 & 16) != 0 ? null : mediaPlayerView;
        if ((i10 & 32) == 0) {
            controlView2 = controlView;
        }
        mediaPlayer.preparePlayer(mediaSource, z13, z12, j11, mediaPlayerView2, controlView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setEvent(Event event) {
        this.eventListener.invoke(event);
    }

    public final float bufferedPercentage() {
        return this.exoPlayer.Z() / 100.0f;
    }

    public final long currentPositionMs() {
        return this.exoPlayer.Y();
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
        return this.exoPlayer.P() == 4;
    }

    public final boolean hasError() {
        return this.exoPlayer.n() != null;
    }

    public final boolean isMuted() {
        return this.exoPlayer.M0() == 0.0f;
    }

    public final boolean isPlaying() {
        return this.exoPlayer.Q();
    }

    public final void pause() {
        this.exoPlayer.o(false);
    }

    public final void play() {
        this.exoPlayer.o(true);
    }

    public final void preparePlayer(MediaSource mediaSource, boolean z10, boolean z11, long j10, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView) {
        q.g(mediaSource, "mediaSource");
        this.mediaSource = mediaSource;
        this.exoPlayer.a1(1);
        k0.b bVar = new k0.b(this.dataSourceFactory);
        String sourceUrl = mediaSource.getSourceUrl();
        q.d(sourceUrl);
        k0 c10 = bVar.c(MediaItem.b(sourceUrl));
        q.f(c10, "Factory(dataSourceFactor…mediaSource.sourceUrl!!))");
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.W0(c10);
        simpleExoPlayer.c0(j10);
        simpleExoPlayer.R(z11 ? 1 : 0);
        simpleExoPlayer.c();
        if (mediaPlayerView != null) {
            mediaPlayerView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (controlView != null) {
            controlView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (z10) {
            play();
        }
    }

    public final void reset() {
        seekTo(0L);
        this.exoPlayer.o(false);
    }

    public final void seekTo(long j10) {
        this.exoPlayer.c0(j10);
    }

    public final void setEventListener(Function1<? super Event, Unit> function1) {
        q.g(function1, "<set-?>");
        this.eventListener = function1;
    }

    public final void setMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    public final void setVolume(float f10) {
        this.exoPlayer.d1(f10);
        this.volumeListener.invoke(Float.valueOf(f10));
    }

    public final void setVolumeListener(Function1<? super Float, Unit> function1) {
        q.g(function1, "<set-?>");
        this.volumeListener = function1;
    }

    public final boolean shouldPlay() {
        return this.exoPlayer.G();
    }
}
