package com.discord.media_player;

import android.content.Context;
import android.view.Surface;
import com.discord.logging.Log;
import com.discord.media_player.MediaPlayerView;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import j7.d;
import j7.o;
import java.io.IOException;
import java.util.List;
import k7.d1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import n8.i0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u0003567B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0007J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\nH\u0007J\b\u0010$\u001a\u00020\nH\u0007JF\u0010%\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007J\b\u0010-\u001a\u00020\nH\u0007J\u000e\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001bJ\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0016H\u0007J\u0006\u00104\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u00068"}, d2 = {"Lcom/discord/media_player/MediaPlayer;", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V", "eventListener", "Lkotlin/Function1;", "Lcom/discord/media_player/MediaPlayer$Event;", "", "getEventListener", "()Lkotlin/jvm/functions/Function1;", "setEventListener", "(Lkotlin/jvm/functions/Function1;)V", "mediaSource", "Lcom/discord/media_player/MediaSource;", "getMediaSource", "()Lcom/discord/media_player/MediaSource;", "setMediaSource", "(Lcom/discord/media_player/MediaSource;)V", "volumeListener", "", "getVolumeListener", "setVolumeListener", "bufferedPercentage", "currentPositionMs", "", "currentPositionPercentage", "durationMs", "hasEnded", "", "hasError", "isMuted", "isPlaying", "pause", "play", "preparePlayer", "autoPlayWhenReady", "loopMedia", "initialSeekPositionMs", "playerView", "Lcom/discord/media_player/MediaPlayerView;", "playerControlView", "Lcom/discord/media_player/MediaPlayerView$ControlView;", "reset", "seekTo", "positionMs", "setEvent", "event", "setVolume", "volume", "shouldPlay", "Companion", "Event", "Factory", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
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
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event;", "", "()V", "BufferEnd", "BufferStart", "Paused", "PlaybackEnded", "PlaybackError", "StartedPlaying", "Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Event {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class BufferEnd extends Event {
            public static final BufferEnd INSTANCE = new BufferEnd();

            private BufferEnd() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class BufferStart extends Event {
            public static final BufferStart INSTANCE = new BufferStart();

            private BufferStart() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Paused extends Event {
            public static final Paused INSTANCE = new Paused();

            private Paused() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event;", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class PlaybackEnded extends Event {
            public static final PlaybackEnded INSTANCE = new PlaybackEnded();

            private PlaybackEnded() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
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
        /* loaded from: classes7.dex */
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
    /* loaded from: classes7.dex */
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public final MediaPlayer create(Context context) {
            q.g(context, "context");
            d a10 = new d.a().d(MediaPlayer.MIN_BUFFER_MS, MediaPlayer.MAX_BUFFER_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_MS, MediaPlayer.BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS).a();
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
        exoPlayer.H(new Player.a() { // from class: com.discord.media_player.MediaPlayer.1
            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                o.a(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
                o.b(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z10) {
                o.c(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
                o.d(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public void onIsPlayingChanged(boolean z10) {
                o.e(this, z10);
                if (z10) {
                    MediaPlayer.this.setEvent(Event.StartedPlaying.INSTANCE);
                } else if (MediaPlayer.this.exoPlayer.O() != 4) {
                    MediaPlayer.this.setEvent(Event.Paused.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
                o.f(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
                o.g(this, mediaItem, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
                o.h(this, z10, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                o.i(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public void onPlaybackStateChanged(int i10) {
                o.j(this, i10);
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
                o.k(this, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public void onPlayerError(ExoPlaybackException error) {
                String str;
                q.g(error, "error");
                o.l(this, error);
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
                o.m(this, z10, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
                o.n(this, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
                o.o(this, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                o.p(this);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
                o.q(this, z10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
                o.r(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
                o.s(this, timeline, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            @Deprecated
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i10) {
                o.t(this, timeline, obj, i10);
            }

            @Override // com.google.android.exoplayer2.Player.a
            public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                o.u(this, trackGroupArray, trackSelectionArray);
            }
        });
        exoPlayer.E0(new AnalyticsListener() { // from class: com.discord.media_player.MediaPlayer.2
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
                d1.a(this, eventTime, audioAttributes);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j10) {
                d1.b(this, eventTime, str, j10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
                d1.c(this, eventTime, str);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                d1.d(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                d1.e(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
                d1.f(this, eventTime, format);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                d1.g(this, eventTime, format, decoderReuseEvaluation);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j10) {
                d1.h(this, eventTime, j10);
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i10) {
                d1.i(this, eventTime, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
                d1.j(this, eventTime, exc);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
                d1.k(this, eventTime, i10, j10, j11);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
                d1.l(this, eventTime, i10, j10, j11);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i10, DecoderCounters decoderCounters) {
                d1.m(this, eventTime, i10, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i10, DecoderCounters decoderCounters) {
                d1.n(this, eventTime, i10, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i10, String str, long j10) {
                d1.o(this, eventTime, i10, str, j10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i10, Format format) {
                d1.p(this, eventTime, i10, format);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
                d1.q(this, eventTime, mediaLoadData);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
                d1.r(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
                d1.s(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
                d1.t(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
                d1.u(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
                d1.v(this, eventTime, exc);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
                d1.w(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i10, long j10) {
                d1.x(this, eventTime, i10, j10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
                d1.y(this, player, events);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
                d1.z(this, eventTime, z10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
                d1.A(this, eventTime, z10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                q.g(eventTime, "eventTime");
                q.g(loadEventInfo, "loadEventInfo");
                q.g(mediaLoadData, "mediaLoadData");
                if (!loadEventInfo.f9891d.isEmpty()) {
                    DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                    companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f9894g);
                }
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                q.g(eventTime, "eventTime");
                q.g(loadEventInfo, "loadEventInfo");
                q.g(mediaLoadData, "mediaLoadData");
                if (!loadEventInfo.f9891d.isEmpty()) {
                    DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                    companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f9894g);
                }
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean z10) {
                q.g(eventTime, "eventTime");
                q.g(loadEventInfo, "loadEventInfo");
                q.g(mediaLoadData, "mediaLoadData");
                q.g(error, "error");
                if (!loadEventInfo.f9891d.isEmpty()) {
                    DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
                    companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f9894g);
                }
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                d1.B(this, eventTime, loadEventInfo, mediaLoadData);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
                d1.C(this, eventTime, z10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i10) {
                d1.D(this, eventTime, mediaItem, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.metadata.Metadata metadata) {
                d1.E(this, eventTime, metadata);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
                d1.F(this, eventTime, z10, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
                d1.G(this, eventTime, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i10) {
                d1.H(this, eventTime, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i10) {
                d1.I(this, eventTime, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
                d1.J(this, eventTime, exoPlaybackException);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
                d1.K(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
                d1.L(this, eventTime, z10, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i10) {
                d1.M(this, eventTime, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Surface surface) {
                d1.N(this, eventTime, surface);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i10) {
                d1.O(this, eventTime, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
                d1.P(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
                d1.Q(this, eventTime);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
                d1.R(this, eventTime, z10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
                d1.S(this, eventTime, z10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
                d1.T(this, eventTime, list);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i10, int i11) {
                d1.U(this, eventTime, i10, i11);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i10) {
                d1.V(this, eventTime, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                d1.W(this, eventTime, trackGroupArray, trackSelectionArray);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
                d1.X(this, eventTime, mediaLoadData);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j10) {
                d1.Y(this, eventTime, str, j10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
                d1.Z(this, eventTime, str);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                d1.a0(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
                d1.b0(this, eventTime, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j10, int i10) {
                d1.c0(this, eventTime, j10, i10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            @Deprecated
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
                d1.d0(this, eventTime, format);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                d1.e0(this, eventTime, format, decoderReuseEvaluation);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i10, int i11, int i12, float f10) {
                d1.f0(this, eventTime, i10, i11, i12, f10);
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public /* bridge */ /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f10) {
                d1.g0(this, eventTime, f10);
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
        return this.exoPlayer.O() == 4;
    }

    public final boolean hasError() {
        return this.exoPlayer.o() != null;
    }

    public final boolean isMuted() {
        return this.exoPlayer.N0() == 0.0f;
    }

    public final boolean isPlaying() {
        return this.exoPlayer.P();
    }

    public final void pause() {
        this.exoPlayer.p(false);
    }

    public final void play() {
        this.exoPlayer.p(true);
    }

    public final void preparePlayer(MediaSource mediaSource, boolean z10, boolean z11, long j10, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView) {
        q.g(mediaSource, "mediaSource");
        this.mediaSource = mediaSource;
        this.exoPlayer.b1(1);
        i0.b bVar = new i0.b(this.dataSourceFactory);
        String sourceUrl = mediaSource.getSourceUrl();
        q.d(sourceUrl);
        i0 c10 = bVar.c(MediaItem.b(sourceUrl));
        q.f(c10, "Factory(dataSourceFactor…mediaSource.sourceUrl!!))");
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.X0(c10);
        simpleExoPlayer.c0(j10);
        simpleExoPlayer.Q(z11 ? 1 : 0);
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
        this.exoPlayer.p(false);
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
        this.exoPlayer.e1(f10);
        this.volumeListener.invoke(Float.valueOf(f10));
    }

    public final void setVolumeListener(Function1<? super Float, Unit> function1) {
        q.g(function1, "<set-?>");
        this.volumeListener = function1;
    }

    public final boolean shouldPlay() {
        return this.exoPlayer.D();
    }
}
