package p089ek;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

@Metadata(m15074d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\u0006\u0010-\u001a\u00020(\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00105\u001a\u00020\u0016\u0012\u0006\u00107\u001a\u00020\u0016\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\b<\u0010=J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018R\u0014\u00107\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0018R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, m15073d2 = {"Lek/h;", "Ljava/io/Closeable;", "", "opcode", "Lokio/ByteString;", "payload", "", "g", "i", "l", "code", "reason", "b", "formatOpcode", "data", "h", "close", "Lokio/Buffer;", "k", "Lokio/Buffer;", "messageBuffer", "sinkBuffer", "", "m", "Z", "writerClosed", "Lek/a;", "n", "Lek/a;", "messageDeflater", "", "o", "[B", "maskKey", "Lokio/Buffer$a;", "p", "Lokio/Buffer$a;", "maskCursor", "q", "isClient", "Lokio/BufferedSink;", "r", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "sink", "Ljava/util/Random;", "s", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "random", "t", "perMessageDeflate", "u", "noContextTakeover", "", "v", "J", "minimumDeflateSize", "<init>", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.h */
/* loaded from: classes8.dex */
public final class C6966h implements Closeable {

    /* renamed from: k */
    private final Buffer f15196k = new Buffer();

    /* renamed from: l */
    private final Buffer f15197l;

    /* renamed from: m */
    private boolean f15198m;

    /* renamed from: n */
    private C6950a f15199n;

    /* renamed from: o */
    private final byte[] f15200o;

    /* renamed from: p */
    private final Buffer.C11434a f15201p;

    /* renamed from: q */
    private final boolean f15202q;

    /* renamed from: r */
    private final BufferedSink f15203r;

    /* renamed from: s */
    private final Random f15204s;

    /* renamed from: t */
    private final boolean f15205t;

    /* renamed from: u */
    private final boolean f15206u;

    /* renamed from: v */
    private final long f15207v;

    public C6966h(boolean z, BufferedSink sink, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        C9971q.m14633g(sink, "sink");
        C9971q.m14633g(random, "random");
        this.f15202q = z;
        this.f15203r = sink;
        this.f15204s = random;
        this.f15205t = z2;
        this.f15206u = z3;
        this.f15207v = j;
        this.f15197l = sink.mo9747c();
        Buffer.C11434a aVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f15200o = bArr;
        this.f15201p = z ? new Buffer.C11434a() : aVar;
    }

    /* renamed from: g */
    private final void m23812g(int i, ByteString byteString) {
        boolean z;
        if (!this.f15198m) {
            int v = byteString.m9697v();
            if (v <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f15197l.writeByte(i | 128);
                if (this.f15202q) {
                    this.f15197l.writeByte(v | 128);
                    Random random = this.f15204s;
                    byte[] bArr = this.f15200o;
                    C9971q.m14636d(bArr);
                    random.nextBytes(bArr);
                    this.f15197l.write(this.f15200o);
                    if (v > 0) {
                        long size = this.f15197l.size();
                        this.f15197l.mo9743u0(byteString);
                        Buffer buffer = this.f15197l;
                        Buffer.C11434a aVar = this.f15201p;
                        C9971q.m14636d(aVar);
                        buffer.m9768Y(aVar);
                        this.f15201p.m9753h(size);
                        C6963f.f15179a.m23826b(this.f15201p, this.f15200o);
                        this.f15201p.close();
                    }
                } else {
                    this.f15197l.writeByte(v);
                    this.f15197l.mo9743u0(byteString);
                }
                this.f15203r.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    /* renamed from: b */
    public final void m23813b(int i, ByteString byteString) {
        ByteString byteString2 = ByteString.f25541n;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                C6963f.f15179a.m23825c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.mo9743u0(byteString);
            }
            byteString2 = buffer.mo9727o0();
        }
        try {
            m23812g(8, byteString2);
        } finally {
            this.f15198m = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6950a aVar = this.f15199n;
        if (aVar != null) {
            aVar.close();
        }
    }

    /* renamed from: h */
    public final void m23811h(int i, ByteString data) {
        C9971q.m14633g(data, "data");
        if (!this.f15198m) {
            this.f15196k.mo9743u0(data);
            int i2 = 128;
            int i3 = i | 128;
            if (this.f15205t && data.m9697v() >= this.f15207v) {
                C6950a aVar = this.f15199n;
                if (aVar == null) {
                    aVar = new C6950a(this.f15206u);
                    this.f15199n = aVar;
                }
                aVar.m23858b(this.f15196k);
                i3 |= 64;
            }
            long size = this.f15196k.size();
            this.f15197l.writeByte(i3);
            if (!this.f15202q) {
                i2 = 0;
            }
            if (size <= 125) {
                this.f15197l.writeByte(((int) size) | i2);
            } else if (size <= 65535) {
                this.f15197l.writeByte(i2 | 126);
                this.f15197l.writeShort((int) size);
            } else {
                this.f15197l.writeByte(i2 | 127);
                this.f15197l.m9778Q0(size);
            }
            if (this.f15202q) {
                Random random = this.f15204s;
                byte[] bArr = this.f15200o;
                C9971q.m14636d(bArr);
                random.nextBytes(bArr);
                this.f15197l.write(this.f15200o);
                if (size > 0) {
                    Buffer buffer = this.f15196k;
                    Buffer.C11434a aVar2 = this.f15201p;
                    C9971q.m14636d(aVar2);
                    buffer.m9768Y(aVar2);
                    this.f15201p.m9753h(0L);
                    C6963f.f15179a.m23826b(this.f15201p, this.f15200o);
                    this.f15201p.close();
                }
            }
            this.f15197l.mo392K(this.f15196k, size);
            this.f15203r.mo9744q();
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: i */
    public final void m23810i(ByteString payload) {
        C9971q.m14633g(payload, "payload");
        m23812g(9, payload);
    }

    /* renamed from: l */
    public final void m23809l(ByteString payload) {
        C9971q.m14633g(payload, "payload");
        m23812g(10, payload);
    }
}
