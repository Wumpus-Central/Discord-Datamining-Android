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
import pe.AbstractC11647i;

/* renamed from: qe.a */
/* loaded from: classes6.dex */
public class C12113a extends AbstractC12115c {

    /* renamed from: q */
    private static final String f27177q = "a";

    /* renamed from: m */
    int f27178m = 2;

    /* renamed from: n */
    int f27179n = 2;

    /* renamed from: o */
    int f27180o = 2;

    /* renamed from: p */
    private MediaFormat f27181p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12113a(AbstractC11261c cVar, int i, AbstractC11262d dVar, int i2, MediaFormat mediaFormat, AbstractC11647i iVar, AbstractC8390a aVar, AbstractC8391b bVar) {
        super(cVar, i, dVar, i2, mediaFormat, iVar, aVar, bVar);
        m7802k();
    }

    /* renamed from: j */
    private int m7803j() {
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
                    Log.d(f27177q, "EoS reached on the input stream");
                    i = 4;
                } else if (sampleTime >= this.f27191f.m26437a()) {
                    b.f18295c.set(0, 0, -1L, 4);
                    this.f27189d.mo19868a(b);
                    i = m7798b();
                    Log.d(f27177q, "Selection end reached on the input stream");
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
            String str = f27177q;
            Log.e(str, "Unhandled value " + e + " when decoding an input frame");
            return 2;
        }
    }

    /* renamed from: k */
    private void m7802k() {
        this.f27181p = this.f27186a.getTrackFormat(this.f27192g);
        this.f27190e.mo19857d(this.f27195j);
        this.f27188c.mo9156b(null, this.f27181p, this.f27195j);
        this.f27189d.mo19862g(this.f27181p, null);
    }

    /* renamed from: l */
    private int m7801l() {
        int c = this.f27189d.mo19866c(0L);
        if (c >= 0) {
            C8392c f = this.f27189d.mo19863f(c);
            if (f != null) {
                if (f.f18295c.presentationTimeUs >= this.f27191f.m26436b() || (f.f18295c.flags & 4) != 0) {
                    long b = f.f18295c.presentationTimeUs - this.f27191f.m26436b();
                    f.f18295c.presentationTimeUs = b;
                    this.f27188c.mo9155c(f, TimeUnit.MICROSECONDS.toNanos(b));
                }
                this.f27189d.mo19861h(c, false);
                if ((f.f18295c.flags & 4) == 0) {
                    return 2;
                }
                Log.d(f27177q, "EoS on decoder output stream");
                return 4;
            }
            throw new C9568e(C9568e.EnumC9569a.NO_FRAME_AVAILABLE);
        } else if (c == -2) {
            MediaFormat outputFormat = this.f27189d.getOutputFormat();
            this.f27181p = outputFormat;
            this.f27188c.mo9154d(outputFormat, this.f27195j);
            String str = f27177q;
            Log.d(str, "Decoder output format changed: " + this.f27181p);
            return 2;
        } else if (c == -1) {
            return 2;
        } else {
            String str2 = f27177q;
            Log.e(str2, "Unhandled value " + c + " when receiving decoded input frame");
            return 2;
        }
    }

    /* renamed from: m */
    private int m7800m() {
        int c = this.f27190e.mo19858c(0L);
        int i = 2;
        if (c >= 0) {
            C8392c f = this.f27190e.mo19855f(c);
            if (f != null) {
                MediaCodec.BufferInfo bufferInfo = f.f18295c;
                int i2 = bufferInfo.flags;
                if ((i2 & 4) != 0) {
                    Log.d(f27177q, "Encoder produced EoS, we are done");
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
                MediaFormat a = m7799a(this.f27181p, outputFormat);
                this.f27195j = a;
                this.f27193h = this.f27187b.mo10310c(a, this.f27193h);
                this.f27194i = true;
                this.f27188c.mo9154d(this.f27181p, this.f27195j);
            }
            Log.d(f27177q, "Encoder output format received " + outputFormat);
        } else if (c != -1) {
            Log.e(f27177q, "Unhandled value " + c + " when receiving encoded output frame");
        }
        return i;
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: g */
    public int mo7792g() {
        if (!this.f27190e.isRunning() || !this.f27189d.isRunning()) {
            return -3;
        }
        if (this.f27178m == 5) {
            this.f27178m = m7798b();
        }
        int i = this.f27178m;
        if (!(i == 4 || i == 5)) {
            this.f27178m = m7803j();
        }
        if (this.f27179n != 4) {
            this.f27179n = m7801l();
        }
        if (this.f27180o != 4) {
            this.f27180o = m7800m();
        }
        int i2 = this.f27180o;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
        }
        int i4 = this.f27178m;
        if ((i4 == 4 || i4 == 5) && this.f27179n == 4 && i2 == 4) {
            return 4;
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
        this.f27188c.release();
        this.f27190e.stop();
        this.f27190e.release();
        this.f27189d.stop();
        this.f27189d.release();
    }
}
