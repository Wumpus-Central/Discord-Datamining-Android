package com.google.android.exoplayer2;

import p119g9.AbstractC7516c;
import p119g9.AbstractC7561t;
import p119g9.C7510a;
import p119g9.C7533h0;

/* renamed from: com.google.android.exoplayer2.h */
/* loaded from: classes7.dex */
final class C5190h implements AbstractC7561t {

    /* renamed from: k */
    private final C7533h0 f9237k;

    /* renamed from: l */
    private final AbstractC5191a f9238l;

    /* renamed from: m */
    private AbstractC5252t0 f9239m;

    /* renamed from: n */
    private AbstractC7561t f9240n;

    /* renamed from: o */
    private boolean f9241o = true;

    /* renamed from: p */
    private boolean f9242p;

    /* renamed from: com.google.android.exoplayer2.h$a */
    /* loaded from: classes7.dex */
    public interface AbstractC5191a {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public C5190h(AbstractC5191a aVar, AbstractC7516c cVar) {
        this.f9238l = aVar;
        this.f9237k = new C7533h0(cVar);
    }

    /* renamed from: e */
    private boolean m30139e(boolean z) {
        AbstractC5252t0 t0Var = this.f9239m;
        if (t0Var == null || t0Var.mo165c() || (!this.f9239m.mo164e() && (z || this.f9239m.mo24582g()))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m30135j(boolean z) {
        if (m30139e(z)) {
            this.f9241o = true;
            if (this.f9242p) {
                this.f9237k.m22304c();
                return;
            }
            return;
        }
        AbstractC7561t tVar = (AbstractC7561t) C7510a.m22367e(this.f9240n);
        long o = tVar.mo22088o();
        if (this.f9241o) {
            if (o < this.f9237k.mo22088o()) {
                this.f9237k.m22303d();
                return;
            }
            this.f9241o = false;
            if (this.f9242p) {
                this.f9237k.m22304c();
            }
        }
        this.f9237k.m22305a(o);
        PlaybackParameters b = tVar.mo22090b();
        if (!b.equals(this.f9237k.mo22090b())) {
            this.f9237k.mo22089f(b);
            this.f9238l.onPlaybackParametersChanged(b);
        }
    }

    /* renamed from: a */
    public void m30142a(AbstractC5252t0 t0Var) {
        if (t0Var == this.f9239m) {
            this.f9240n = null;
            this.f9239m = null;
            this.f9241o = true;
        }
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: b */
    public PlaybackParameters mo22090b() {
        AbstractC7561t tVar = this.f9240n;
        if (tVar != null) {
            return tVar.mo22090b();
        }
        return this.f9237k.mo22090b();
    }

    /* renamed from: c */
    public void m30141c(AbstractC5252t0 t0Var) {
        AbstractC7561t tVar;
        AbstractC7561t v = t0Var.mo22577v();
        if (v != null && v != (tVar = this.f9240n)) {
            if (tVar == null) {
                this.f9240n = v;
                this.f9239m = t0Var;
                v.mo22089f(this.f9237k.mo22090b());
                return;
            }
            throw ExoPlaybackException.m30557e(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: d */
    public void m30140d(long j) {
        this.f9237k.m22305a(j);
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: f */
    public void mo22089f(PlaybackParameters playbackParameters) {
        AbstractC7561t tVar = this.f9240n;
        if (tVar != null) {
            tVar.mo22089f(playbackParameters);
            playbackParameters = this.f9240n.mo22090b();
        }
        this.f9237k.mo22089f(playbackParameters);
    }

    /* renamed from: g */
    public void m30138g() {
        this.f9242p = true;
        this.f9237k.m22304c();
    }

    /* renamed from: h */
    public void m30137h() {
        this.f9242p = false;
        this.f9237k.m22303d();
    }

    /* renamed from: i */
    public long m30136i(boolean z) {
        m30135j(z);
        return mo22088o();
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: o */
    public long mo22088o() {
        if (this.f9241o) {
            return this.f9237k.mo22088o();
        }
        return ((AbstractC7561t) C7510a.m22367e(this.f9240n)).mo22088o();
    }
}
