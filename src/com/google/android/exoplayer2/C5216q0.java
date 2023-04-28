package com.google.android.exoplayer2;

import cc.AbstractC3884i0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;
import p029b9.C3427n;
import p153i8.AbstractC8299u;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.q0 */
/* loaded from: classes7.dex */
public final class C5216q0 {

    /* renamed from: s */
    private static final AbstractC8299u.C8300a f9320s = new AbstractC8299u.C8300a(new Object());

    /* renamed from: a */
    public final Timeline f9321a;

    /* renamed from: b */
    public final AbstractC8299u.C8300a f9322b;

    /* renamed from: c */
    public final long f9323c;

    /* renamed from: d */
    public final int f9324d;

    /* renamed from: e */
    public final ExoPlaybackException f9325e;

    /* renamed from: f */
    public final boolean f9326f;

    /* renamed from: g */
    public final TrackGroupArray f9327g;

    /* renamed from: h */
    public final C3427n f9328h;

    /* renamed from: i */
    public final List<C14576a> f9329i;

    /* renamed from: j */
    public final AbstractC8299u.C8300a f9330j;

    /* renamed from: k */
    public final boolean f9331k;

    /* renamed from: l */
    public final int f9332l;

    /* renamed from: m */
    public final PlaybackParameters f9333m;

    /* renamed from: n */
    public final boolean f9334n;

    /* renamed from: o */
    public final boolean f9335o;

    /* renamed from: p */
    public volatile long f9336p;

    /* renamed from: q */
    public volatile long f9337q;

    /* renamed from: r */
    public volatile long f9338r;

    public C5216q0(Timeline timeline, AbstractC8299u.C8300a aVar, long j, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, C3427n nVar, List<C14576a> list, AbstractC8299u.C8300a aVar2, boolean z2, int i2, PlaybackParameters playbackParameters, long j2, long j3, long j4, boolean z3, boolean z4) {
        this.f9321a = timeline;
        this.f9322b = aVar;
        this.f9323c = j;
        this.f9324d = i;
        this.f9325e = exoPlaybackException;
        this.f9326f = z;
        this.f9327g = trackGroupArray;
        this.f9328h = nVar;
        this.f9329i = list;
        this.f9330j = aVar2;
        this.f9331k = z2;
        this.f9332l = i2;
        this.f9333m = playbackParameters;
        this.f9336p = j2;
        this.f9337q = j3;
        this.f9338r = j4;
        this.f9334n = z3;
        this.f9335o = z4;
    }

    /* renamed from: k */
    public static C5216q0 m30022k(C3427n nVar) {
        Timeline timeline = Timeline.f9081a;
        AbstractC8299u.C8300a aVar = f9320s;
        return new C5216q0(timeline, aVar, -9223372036854775807L, 1, null, false, TrackGroupArray.f9361n, nVar, AbstractC3884i0.m33399x(), aVar, false, 0, PlaybackParameters.f9028d, 0L, 0L, 0L, false, false);
    }

    /* renamed from: l */
    public static AbstractC8299u.C8300a m30021l() {
        return f9320s;
    }

    /* renamed from: a */
    public C5216q0 m30032a(boolean z) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, this.f9325e, z, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }

    /* renamed from: b */
    public C5216q0 m30031b(AbstractC8299u.C8300a aVar) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, aVar, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }

    /* renamed from: c */
    public C5216q0 m30030c(AbstractC8299u.C8300a aVar, long j, long j2, long j3, TrackGroupArray trackGroupArray, C3427n nVar, List<C14576a> list) {
        return new C5216q0(this.f9321a, aVar, j2, this.f9324d, this.f9325e, this.f9326f, trackGroupArray, nVar, list, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, j3, j, this.f9334n, this.f9335o);
    }

    /* renamed from: d */
    public C5216q0 m30029d(boolean z) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, z, this.f9335o);
    }

    /* renamed from: e */
    public C5216q0 m30028e(boolean z, int i) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, z, i, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }

    /* renamed from: f */
    public C5216q0 m30027f(ExoPlaybackException exoPlaybackException) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, exoPlaybackException, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }

    /* renamed from: g */
    public C5216q0 m30026g(PlaybackParameters playbackParameters) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, playbackParameters, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }

    /* renamed from: h */
    public C5216q0 m30025h(int i) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, i, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }

    /* renamed from: i */
    public C5216q0 m30024i(boolean z) {
        return new C5216q0(this.f9321a, this.f9322b, this.f9323c, this.f9324d, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, z);
    }

    /* renamed from: j */
    public C5216q0 m30023j(Timeline timeline) {
        return new C5216q0(timeline, this.f9322b, this.f9323c, this.f9324d, this.f9325e, this.f9326f, this.f9327g, this.f9328h, this.f9329i, this.f9330j, this.f9331k, this.f9332l, this.f9333m, this.f9336p, this.f9337q, this.f9338r, this.f9334n, this.f9335o);
    }
}
