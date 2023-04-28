package p302qe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import ie.AbstractC8390a;
import ie.AbstractC8391b;
import ie.C8392c;
import java.util.concurrent.TimeUnit;
import je.C9568e;
import p266oe.AbstractC11261c;
import p266oe.AbstractC11262d;
import pe.AbstractC11643e;
import pe.AbstractC11647i;
import pe.C11642d;
import pe.C11645g;
import re.C12577f;

/* renamed from: qe.e */
/* loaded from: classes6.dex */
public class C12117e extends AbstractC12115c {

    /* renamed from: t */
    private static final String f27199t = "e";

    /* renamed from: m */
    int f27200m = 2;

    /* renamed from: n */
    int f27201n = 2;

    /* renamed from: o */
    int f27202o = 2;

    /* renamed from: p */
    C11645g f27203p;

    /* renamed from: q */
    private MediaFormat f27204q;

    /* renamed from: r */
    private MediaFormat f27205r;

    /* renamed from: s */
    private AbstractC11643e f27206s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12117e(AbstractC11261c cVar, int i, AbstractC11262d dVar, int i2, MediaFormat mediaFormat, AbstractC11647i iVar, AbstractC8390a aVar, AbstractC8391b bVar) {
        super(cVar, i, dVar, i2, mediaFormat, iVar, aVar, bVar);
        this.f27205r = mediaFormat;
        if (iVar instanceof C11645g) {
            this.f27203p = (C11645g) iVar;
            m7787l();
            return;
        }
        throw new IllegalArgumentException("Cannot use non-OpenGL video renderer in " + C12117e.class.getSimpleName());
    }

    /* renamed from: j */
    private AbstractC11643e m7789j() {
        Number b = C12577f.m6489b(this.f27204q, "frame-rate");
        Number b2 = C12577f.m6489b(this.f27205r, "frame-rate");
        if (b2 == null || b2.intValue() < 1) {
            b2 = b;
        }
        if (b == null || b.intValue() <= b2.intValue()) {
            return null;
        }
        return new C11642d(b.intValue(), b2.intValue());
    }

    /* renamed from: k */
    private int m7788k() {
        int i;
        int sampleTrackIndex = this.f27186a.getSampleTrackIndex();
        if (sampleTrackIndex != this.f27192g && sampleTrackIndex != -1) {
            return 2;
        }
        int e = this.f27189d.mo19864e(0L);
        if (e >= 0) {
            C8392c b = this.f27189d.mo19867b(e);
            if (b != null) {
                int readSampleData = this.f27186a.readSampleData(b.f18294b, 0);
                long sampleTime = this.f27186a.getSampleTime();
                int sampleFlags = this.f27186a.getSampleFlags();
                if (readSampleData < 0 || (sampleFlags & 4) != 0) {
                    b.f18295c.set(0, 0, -1L, 4);
                    this.f27189d.mo19868a(b);
                    Log.d(f27199t, "EoS reached on the input stream");
                    i = 4;
                } else if (sampleTime >= this.f27191f.m26437a()) {
                    b.f18295c.set(0, 0, -1L, 4);
                    this.f27189d.mo19868a(b);
                    i = m7798b();
                    Log.d(f27199t, "Selection end reached on the input stream");
                } else {
                    b.f18295c.set(0, readSampleData, sampleTime, sampleFlags);
                    this.f27189d.mo19868a(b);
                    this.f27186a.advance();
                    return 2;
                }
                return i;
            }
            throw new C9568e(C9568e.EnumC9569a.NO_FRAME_AVAILABLE);
        } else if (e == -1) {
            return 2;
        } else {
            String str = f27199t;
            Log.e(str, "Unhandled value " + e + " when decoding an input frame");
            return 2;
        }
    }

    /* renamed from: l */
    private void m7787l() {
        this.f27204q = this.f27186a.getTrackFormat(this.f27192g);
        this.f27206s = m7789j();
        this.f27190e.mo19857d(this.f27195j);
        this.f27203p.mo9156b(this.f27190e.createInputSurface(), this.f27204q, this.f27205r);
        this.f27189d.mo19862g(this.f27204q, this.f27203p.m9161f());
    }

    /* renamed from: m */
    private int m7786m() {
        boolean z;
        int c = this.f27189d.mo19866c(0L);
        if (c >= 0) {
            C8392c f = this.f27189d.mo19863f(c);
            if (f != null) {
                MediaCodec.BufferInfo bufferInfo = f.f18295c;
                boolean z2 = false;
                if ((bufferInfo.flags & 4) != 0) {
                    Log.d(f27199t, "EoS on decoder output stream");
                    this.f27189d.mo19861h(c, false);
                    this.f27190e.mo19854g();
                    return 4;
                }
                if (bufferInfo.presentationTimeUs >= this.f27191f.m26436b()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f27189d.mo19861h(c, z);
                AbstractC11643e eVar = this.f27206s;
                if (eVar == null || eVar.mo9166a()) {
                    z2 = true;
                }
                if (!z || !z2) {
                    return 3;
                }
                this.f27203p.mo9155c(null, TimeUnit.MICROSECONDS.toNanos(f.f18295c.presentationTimeUs - this.f27191f.m26436b()));
                return 2;
            }
            throw new C9568e(C9568e.EnumC9569a.NO_FRAME_AVAILABLE);
        } else if (c == -2) {
            MediaFormat a = m7799a(this.f27204q, this.f27189d.getOutputFormat());
            this.f27204q = a;
            this.f27203p.mo9154d(a, this.f27205r);
            Log.d(f27199t, "Decoder output format changed: " + this.f27204q);
            return 2;
        } else if (c == -1) {
            return 2;
        } else {
            Log.e(f27199t, "Unhandled value " + c + " when receiving decoded input frame");
            return 2;
        }
    }

    /* renamed from: n */
    private int m7785n() {
        int c = this.f27190e.mo19858c(0L);
        int i = 2;
        if (c >= 0) {
            C8392c f = this.f27190e.mo19855f(c);
            if (f != null) {
                MediaCodec.BufferInfo bufferInfo = f.f18295c;
                int i2 = bufferInfo.flags;
                if ((i2 & 4) != 0) {
                    Log.d(f27199t, "Encoder produced EoS, we are done");
                    this.f27197l = 1.0f;
                    i = 4;
                } else if (bufferInfo.size > 0 && (i2 & 2) == 0) {
                    this.f27187b.mo10311b(this.f27193h, f.f18294b, bufferInfo);
                    long j = this.f27196k;
                    if (j > 0) {
                        this.f27197l = ((float) f.f18295c.presentationTimeUs) / ((float) j);
                    }
                }
                this.f27190e.mo19853h(c);
            } else {
                throw new C9568e(C9568e.EnumC9569a.NO_FRAME_AVAILABLE);
            }
        } else if (c == -2) {
            MediaFormat outputFormat = this.f27190e.getOutputFormat();
            i = 1;
            if (!this.f27194i) {
                MediaFormat a = m7799a(this.f27204q, outputFormat);
                this.f27195j = a;
                this.f27205r = a;
                this.f27193h = this.f27187b.mo10310c(a, this.f27193h);
                this.f27194i = true;
                this.f27203p.mo9154d(this.f27204q, this.f27205r);
            }
            Log.d(f27199t, "Encoder output format received " + outputFormat);
        } else if (c != -1) {
            Log.e(f27199t, "Unhandled value " + c + " when receiving encoded output frame");
        }
        return i;
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: g */
    public int mo7792g() {
        if (!this.f27190e.isRunning() || !this.f27189d.isRunning()) {
            return -3;
        }
        if (this.f27200m == 5) {
            this.f27200m = m7798b();
        }
        int i = this.f27200m;
        if (!(i == 4 || i == 5)) {
            this.f27200m = m7788k();
        }
        if (this.f27201n != 4) {
            this.f27201n = m7786m();
        }
        if (this.f27202o != 4) {
            this.f27202o = m7785n();
        }
        int i2 = this.f27202o;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
        }
        int i4 = this.f27200m;
        if ((i4 == 4 || i4 == 5) && this.f27201n == 4 && i2 == 4) {
            return 4;
        }
        if (this.f27201n == 3) {
            return 3;
        }
        return i3;
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: h */
    public void mo7791h() {
        this.f27186a.selectTrack(this.f27192g);
        this.f27190e.start();
        this.f27189d.start();
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: i */
    public void mo7790i() {
        this.f27190e.stop();
        this.f27190e.release();
        this.f27189d.stop();
        this.f27189d.release();
        this.f27203p.release();
    }
}
