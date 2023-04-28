package p119g9;

import com.google.android.exoplayer2.PlaybackParameters;
import p079e7.C6713c;

/* renamed from: g9.h0 */
/* loaded from: classes5.dex */
public final class C7533h0 implements AbstractC7561t {

    /* renamed from: k */
    private final AbstractC7516c f16325k;

    /* renamed from: l */
    private boolean f16326l;

    /* renamed from: m */
    private long f16327m;

    /* renamed from: n */
    private long f16328n;

    /* renamed from: o */
    private PlaybackParameters f16329o = PlaybackParameters.f9028d;

    public C7533h0(AbstractC7516c cVar) {
        this.f16325k = cVar;
    }

    /* renamed from: a */
    public void m22305a(long j) {
        this.f16327m = j;
        if (this.f16326l) {
            this.f16328n = this.f16325k.mo22292b();
        }
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: b */
    public PlaybackParameters mo22090b() {
        return this.f16329o;
    }

    /* renamed from: c */
    public void m22304c() {
        if (!this.f16326l) {
            this.f16328n = this.f16325k.mo22292b();
            this.f16326l = true;
        }
    }

    /* renamed from: d */
    public void m22303d() {
        if (this.f16326l) {
            m22305a(mo22088o());
            this.f16326l = false;
        }
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: f */
    public void mo22089f(PlaybackParameters playbackParameters) {
        if (this.f16326l) {
            m22305a(mo22088o());
        }
        this.f16329o = playbackParameters;
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: o */
    public long mo22088o() {
        long j;
        long j2 = this.f16327m;
        if (!this.f16326l) {
            return j2;
        }
        long b = this.f16325k.mo22292b() - this.f16328n;
        PlaybackParameters playbackParameters = this.f16329o;
        if (playbackParameters.f9029a == 1.0f) {
            j = C6713c.m24566c(b);
        } else {
            j = playbackParameters.m30540a(b);
        }
        return j2 + j;
    }
}
