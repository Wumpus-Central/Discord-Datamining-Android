package p302qe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import p266oe.AbstractC11261c;
import p266oe.AbstractC11262d;

/* renamed from: qe.b */
/* loaded from: classes6.dex */
public class C12114b extends AbstractC12115c {

    /* renamed from: p */
    private static final String f27182p = "b";

    /* renamed from: m */
    ByteBuffer f27183m;

    /* renamed from: n */
    MediaCodec.BufferInfo f27184n;

    /* renamed from: o */
    int f27185o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12114b(AbstractC11261c cVar, int i, AbstractC11262d dVar, int i2) {
        super(cVar, i, dVar, i2, null, null, null, null);
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: c */
    public String mo7797c() {
        return "passthrough";
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: d */
    public String mo7796d() {
        return "passthrough";
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: g */
    public int mo7792g() {
        int i;
        int i2;
        int i3 = this.f27185o;
        if (i3 == 4) {
            return i3;
        }
        if (i3 == 5) {
            this.f27185o = m7798b();
            return 4;
        } else if (!this.f27194i) {
            MediaFormat trackFormat = this.f27186a.getTrackFormat(this.f27192g);
            this.f27195j = trackFormat;
            long j = this.f27196k;
            if (j > 0) {
                trackFormat.setLong("durationUs", j);
            }
            this.f27193h = this.f27187b.mo10310c(this.f27195j, this.f27193h);
            this.f27194i = true;
            if (this.f27195j.containsKey("max-input-size")) {
                i2 = this.f27195j.getInteger("max-input-size");
            } else {
                i2 = 1048576;
            }
            this.f27183m = ByteBuffer.allocate(i2);
            this.f27185o = 1;
            return 1;
        } else {
            int sampleTrackIndex = this.f27186a.getSampleTrackIndex();
            if (sampleTrackIndex == -1 || sampleTrackIndex == this.f27192g) {
                this.f27185o = 2;
                int readSampleData = this.f27186a.readSampleData(this.f27183m, 0);
                long sampleTime = this.f27186a.getSampleTime();
                int sampleFlags = this.f27186a.getSampleFlags();
                if (readSampleData < 0 || (sampleFlags & 4) != 0) {
                    this.f27183m.clear();
                    this.f27197l = 1.0f;
                    this.f27185o = 4;
                    Log.d(f27182p, "Reach EoS on input stream");
                } else if (sampleTime >= this.f27191f.m26437a()) {
                    this.f27183m.clear();
                    this.f27197l = 1.0f;
                    this.f27184n.set(0, 0, sampleTime - this.f27191f.m26436b(), this.f27184n.flags | 4);
                    this.f27187b.mo10311b(this.f27193h, this.f27183m, this.f27184n);
                    this.f27185o = m7798b();
                    Log.d(f27182p, "Reach selection end on input stream");
                } else {
                    if (sampleTime >= this.f27191f.m26436b()) {
                        if ((sampleFlags & 1) != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        long b = sampleTime - this.f27191f.m26436b();
                        long j2 = this.f27196k;
                        if (j2 > 0) {
                            this.f27197l = ((float) b) / ((float) j2);
                        }
                        this.f27184n.set(0, readSampleData, b, i);
                        this.f27187b.mo10311b(this.f27193h, this.f27183m, this.f27184n);
                    }
                    this.f27186a.advance();
                }
                return this.f27185o;
            }
            this.f27185o = 2;
            return 2;
        }
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: h */
    public void mo7791h() {
        this.f27186a.selectTrack(this.f27192g);
        this.f27184n = new MediaCodec.BufferInfo();
    }

    @Override // p302qe.AbstractC12115c
    /* renamed from: i */
    public void mo7790i() {
        ByteBuffer byteBuffer = this.f27183m;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f27183m = null;
        }
    }
}
