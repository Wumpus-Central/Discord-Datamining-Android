package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.List;
import p119g9.C7565v;
import p133h9.AbstractC7959m;
import p133h9.AbstractC7965q;
import p154i9.AbstractC8310a;
import p317r8.AbstractC12465l;
import p317r8.C12453b;
import p459z7.C14576a;

/* loaded from: classes7.dex */
public interface Player {

    /* loaded from: classes7.dex */
    public static final class Events extends C7565v {
        @Override // p119g9.C7565v
        /* renamed from: b */
        public boolean mo22066b(int i) {
            return super.mo22066b(i);
        }

        @Override // p119g9.C7565v
        /* renamed from: c */
        public boolean mo22065c(int... iArr) {
            return super.mo22065c(iArr);
        }
    }

    /* renamed from: com.google.android.exoplayer2.Player$a */
    /* loaded from: classes7.dex */
    public interface AbstractC5153a {
        void onEvents(Player player, Events events);

        void onExperimentalOffloadSchedulingEnabledChanged(boolean z);

        void onExperimentalSleepingForOffloadChanged(boolean z);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @Deprecated
        void onLoadingChanged(boolean z);

        void onMediaItemTransition(MediaItem mediaItem, int i);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(ExoPlaybackException exoPlaybackException);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity(int i);

        void onRepeatModeChanged(int i);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onStaticMetadataChanged(List<C14576a> list);

        void onTimelineChanged(Timeline timeline, int i);

        @Deprecated
        void onTimelineChanged(Timeline timeline, Object obj, int i);

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);
    }

    /* renamed from: com.google.android.exoplayer2.Player$b */
    /* loaded from: classes7.dex */
    public interface AbstractC5154b {
        /* renamed from: C */
        void mo30535C(AbstractC12465l lVar);

        /* renamed from: i */
        void mo30492i(AbstractC12465l lVar);

        /* renamed from: s */
        List<C12453b> mo30477s();
    }

    /* renamed from: com.google.android.exoplayer2.Player$c */
    /* loaded from: classes7.dex */
    public interface AbstractC5155c {
        /* renamed from: A */
        void mo30538A(TextureView textureView);

        /* renamed from: J */
        void mo30527J(TextureView textureView);

        /* renamed from: T */
        void mo30516T(SurfaceView surfaceView);

        /* renamed from: W */
        void mo30512W(AbstractC7965q qVar);

        /* renamed from: a */
        void mo30507a(Surface surface);

        /* renamed from: f */
        void mo30499f(Surface surface);

        /* renamed from: j */
        void mo30490j(SurfaceView surfaceView);

        /* renamed from: k */
        void mo30488k(AbstractC7959m mVar);

        /* renamed from: q */
        void mo30481q(AbstractC7965q qVar);

        /* renamed from: r */
        void mo30479r(AbstractC7959m mVar);

        /* renamed from: y */
        void mo30470y(AbstractC8310a aVar);

        /* renamed from: z */
        void mo30468z(AbstractC8310a aVar);
    }

    /* renamed from: B */
    TrackSelectionArray mo30380B();

    /* renamed from: D */
    int mo30377D(int i);

    /* renamed from: E */
    AbstractC5154b mo30375E();

    /* renamed from: F */
    void mo30373F(int i, long j);

    /* renamed from: G */
    boolean mo30371G();

    /* renamed from: H */
    void mo30369H(boolean z);

    /* renamed from: I */
    int mo30367I();

    /* renamed from: K */
    void mo30364K(AbstractC5153a aVar);

    /* renamed from: L */
    int mo30362L();

    /* renamed from: M */
    long mo30360M();

    /* renamed from: N */
    int mo30280N();

    /* renamed from: O */
    long mo30357O();

    /* renamed from: P */
    int mo30355P();

    /* renamed from: Q */
    boolean mo30279Q();

    /* renamed from: R */
    void mo30352R(int i);

    /* renamed from: S */
    int mo30278S();

    /* renamed from: U */
    int mo30348U();

    /* renamed from: V */
    boolean mo30346V();

    /* renamed from: X */
    long mo30343X();

    /* renamed from: Y */
    long mo30341Y();

    /* renamed from: b */
    PlaybackParameters mo30337b();

    /* renamed from: c */
    void mo30335c();

    /* renamed from: d */
    boolean mo30333d();

    /* renamed from: e */
    long mo30330e();

    /* renamed from: g */
    List<C14576a> mo30325g();

    long getDuration();

    /* renamed from: h */
    boolean mo30273h();

    boolean hasNext();

    boolean hasPrevious();

    /* renamed from: l */
    void mo30314l(AbstractC5153a aVar);

    /* renamed from: m */
    int mo30311m();

    /* renamed from: n */
    ExoPlaybackException mo30308n();

    /* renamed from: o */
    void mo30305o(boolean z);

    /* renamed from: p */
    AbstractC5155c mo30302p();

    /* renamed from: t */
    int mo30293t();

    /* renamed from: u */
    int mo30291u();

    /* renamed from: v */
    TrackGroupArray mo30289v();

    /* renamed from: w */
    Timeline mo30287w();

    /* renamed from: x */
    Looper mo30285x();
}
