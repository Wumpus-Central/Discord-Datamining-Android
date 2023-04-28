package fk;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(m15074d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m15073d2 = {"Lfk/i;", "Lokio/Source;", "", "g", "h", "Lokio/Buffer;", "buffer", "", "offset", "byteCount", "i", "", "name", "", "expected", "actual", "b", "sink", "read", "Lokio/Timeout;", "timeout", "close", "", "k", "B", "section", "Lfk/t;", "l", "Lfk/t;", "source", "Ljava/util/zip/Inflater;", "m", "Ljava/util/zip/Inflater;", "inflater", "Lfk/k;", "n", "Lfk/k;", "inflaterSource", "Ljava/util/zip/CRC32;", "o", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lokio/Source;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.i */
/* loaded from: classes8.dex */
public final class C7361i implements Source {

    /* renamed from: k */
    private byte f15851k;

    /* renamed from: l */
    private final C7375t f15852l;

    /* renamed from: m */
    private final Inflater f15853m;

    /* renamed from: n */
    private final C7364k f15854n;

    /* renamed from: o */
    private final CRC32 f15855o = new CRC32();

    public C7361i(Source source) {
        C9971q.m14633g(source, "source");
        C7375t tVar = new C7375t(source);
        this.f15852l = tVar;
        Inflater inflater = new Inflater(true);
        this.f15853m = inflater;
        this.f15854n = new C7364k((BufferedSource) tVar, inflater);
    }

    /* renamed from: b */
    private final void m22831b(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C9971q.m14634f(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: g */
    private final void m22830g() {
        boolean z;
        boolean z2;
        boolean z3;
        this.f15852l.mo9735a0(10L);
        byte C = this.f15852l.f15881k.m9792C(3L);
        boolean z4 = true;
        if (((C >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m22828i(this.f15852l.f15881k, 0L, 10L);
        }
        m22831b("ID1ID2", 8075, this.f15852l.readShort());
        this.f15852l.skip(8L);
        if (((C >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f15852l.mo9735a0(2L);
            if (z) {
                m22828i(this.f15852l.f15881k, 0L, 2L);
            }
            long j0 = this.f15852l.f15881k.m9764j0();
            this.f15852l.mo9735a0(j0);
            if (z) {
                m22828i(this.f15852l.f15881k, 0L, j0);
            }
            this.f15852l.skip(j0);
        }
        if (((C >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long b = this.f15852l.m22785b((byte) 0);
            if (b != -1) {
                if (z) {
                    m22828i(this.f15852l.f15881k, 0L, b + 1);
                }
                this.f15852l.skip(b + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((C >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long b2 = this.f15852l.m22785b((byte) 0);
            if (b2 != -1) {
                if (z) {
                    m22828i(this.f15852l.f15881k, 0L, b2 + 1);
                }
                this.f15852l.skip(b2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m22831b("FHCRC", this.f15852l.m22780n(), (short) this.f15855o.getValue());
            this.f15855o.reset();
        }
    }

    /* renamed from: h */
    private final void m22829h() {
        m22831b("CRC", this.f15852l.m22781l(), (int) this.f15855o.getValue());
        m22831b("ISIZE", this.f15852l.m22781l(), (int) this.f15853m.getBytesWritten());
    }

    /* renamed from: i */
    private final void m22828i(Buffer buffer, long j, long j2) {
        int i;
        C7377u uVar = buffer.f25530k;
        C9971q.m14636d(uVar);
        while (true) {
            int i2 = uVar.f15888c;
            int i3 = uVar.f15887b;
            if (j >= i2 - i3) {
                j -= i2 - i3;
                uVar = uVar.f15891f;
                C9971q.m14636d(uVar);
            }
        }
        while (j2 > 0) {
            int min = (int) Math.min(uVar.f15888c - i, j2);
            this.f15855o.update(uVar.f15886a, (int) (uVar.f15887b + j), min);
            j2 -= min;
            uVar = uVar.f15891f;
            C9971q.m14636d(uVar);
            j = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15854n.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        boolean z;
        C9971q.m14633g(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f15851k == 0) {
                m22830g();
                this.f15851k = (byte) 1;
            }
            if (this.f15851k == 1) {
                long size = sink.size();
                long read = this.f15854n.read(sink, j);
                if (read != -1) {
                    m22828i(sink, size, read);
                    return read;
                }
                this.f15851k = (byte) 2;
            }
            if (this.f15851k == 2) {
                m22829h();
                this.f15851k = (byte) 3;
                if (!this.f15852l.mo9731h0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f15852l.timeout();
    }
}
