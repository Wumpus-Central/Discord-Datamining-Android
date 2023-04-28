package p079e7;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.List;

/* renamed from: e7.q */
/* loaded from: classes7.dex */
public final /* synthetic */ class C6730q {
    /* renamed from: a */
    public static void m24451a(Player.AbstractC5153a aVar, Player player, Player.Events events) {
    }

    /* renamed from: b */
    public static void m24450b(Player.AbstractC5153a aVar, boolean z) {
    }

    /* renamed from: c */
    public static void m24449c(Player.AbstractC5153a aVar, boolean z) {
    }

    /* renamed from: d */
    public static void m24448d(Player.AbstractC5153a aVar, boolean z) {
        aVar.onLoadingChanged(z);
    }

    /* renamed from: e */
    public static void m24447e(Player.AbstractC5153a aVar, boolean z) {
    }

    @Deprecated
    /* renamed from: f */
    public static void m24446f(Player.AbstractC5153a aVar, boolean z) {
    }

    /* renamed from: g */
    public static void m24445g(Player.AbstractC5153a aVar, MediaItem mediaItem, int i) {
    }

    /* renamed from: h */
    public static void m24444h(Player.AbstractC5153a aVar, boolean z, int i) {
    }

    /* renamed from: i */
    public static void m24443i(Player.AbstractC5153a aVar, PlaybackParameters playbackParameters) {
    }

    /* renamed from: j */
    public static void m24442j(Player.AbstractC5153a aVar, int i) {
    }

    /* renamed from: k */
    public static void m24441k(Player.AbstractC5153a aVar, int i) {
    }

    /* renamed from: l */
    public static void m24440l(Player.AbstractC5153a aVar, ExoPlaybackException exoPlaybackException) {
    }

    @Deprecated
    /* renamed from: m */
    public static void m24439m(Player.AbstractC5153a aVar, boolean z, int i) {
    }

    /* renamed from: n */
    public static void m24438n(Player.AbstractC5153a aVar, int i) {
    }

    /* renamed from: o */
    public static void m24437o(Player.AbstractC5153a aVar, int i) {
    }

    @Deprecated
    /* renamed from: p */
    public static void m24436p(Player.AbstractC5153a aVar) {
    }

    /* renamed from: q */
    public static void m24435q(Player.AbstractC5153a aVar, boolean z) {
    }

    /* renamed from: r */
    public static void m24434r(Player.AbstractC5153a aVar, List list) {
    }

    /* renamed from: s */
    public static void m24433s(Player.AbstractC5153a aVar, Timeline timeline, int i) {
        Object obj;
        if (timeline.mo20022p() == 1) {
            obj = timeline.m30436n(0, new Timeline.C5161c()).f9093d;
        } else {
            obj = null;
        }
        aVar.onTimelineChanged(timeline, obj, i);
    }

    @Deprecated
    /* renamed from: t */
    public static void m24432t(Player.AbstractC5153a aVar, Timeline timeline, Object obj, int i) {
    }

    /* renamed from: u */
    public static void m24431u(Player.AbstractC5153a aVar, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }
}
