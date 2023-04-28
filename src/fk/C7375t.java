package fk;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p122gk.C7708a;
import p326ri.C12690b;

@Metadata(m15074d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010I\u001a\u00020F¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\rH\u0016J \u00102\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000fH\u0016J\u0018\u00108\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0001H\u0016J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\bH\u0016J\b\u0010=\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020>H\u0016J\b\u0010@\u001a\u00020\u001eH\u0016R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010DR\u0014\u0010I\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010K¨\u0006Q"}, m15073d2 = {"Lfk/t;", "Lokio/BufferedSource;", "Lokio/Buffer;", "o", "sink", "", "byteCount", "read", "", "h0", "", "a0", "P", "", "readByte", "Lokio/ByteString;", "o0", "e0", "Lfk/p;", "options", "", "t0", "", "g0", "V", "readFully", "Ljava/nio/ByteBuffer;", "y", "Lokio/Sink;", "x0", "", "s0", "Ljava/nio/charset/Charset;", "charset", "l0", "T", "limit", "E", "", "readShort", "n", "readInt", "l", "readLong", "i0", "B0", "skip", "b", "fromIndex", "toIndex", "g", "bytes", "v", "h", "targetBytes", "A", "i", "peek", "Ljava/io/InputStream;", "E0", "isOpen", "close", "Lokio/Timeout;", "timeout", "toString", "k", "Lokio/Buffer;", "bufferField", "Z", "closed", "Lokio/Source;", "m", "Lokio/Source;", "source", "c", "()Lokio/Buffer;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lokio/Source;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.t */
/* loaded from: classes8.dex */
public final class C7375t implements BufferedSource {

    /* renamed from: k */
    public final Buffer f15881k = new Buffer();

    /* renamed from: l */
    public boolean f15882l;

    /* renamed from: m */
    public final Source f15883m;

    public C7375t(Source source) {
        C9971q.m14633g(source, "source");
        this.f15883m = source;
    }

    @Override // okio.BufferedSource
    /* renamed from: A */
    public long mo9742A(ByteString targetBytes) {
        C9971q.m14633g(targetBytes, "targetBytes");
        return m22782i(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    /* renamed from: B0 */
    public long mo9741B0() {
        byte C;
        int a;
        int a2;
        mo9735a0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo9738P(i2)) {
                break;
            }
            C = this.f15881k.m9792C(i);
            if ((C < ((byte) 48) || C > ((byte) 57)) && ((C < ((byte) 97) || C > ((byte) 102)) && (C < ((byte) 65) || C > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            a = C12690b.m5870a(16);
            a2 = C12690b.m5870a(a);
            String num = Integer.toString(C, a2);
            C9971q.m14634f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f15881k.mo9741B0();
    }

    @Override // okio.BufferedSource
    /* renamed from: E */
    public String mo9740E(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long g = m22784g(b, 0L, j2);
            if (g != -1) {
                return C7708a.m21589c(this.f15881k, g);
            }
            if (j2 < Long.MAX_VALUE && mo9738P(j2) && this.f15881k.m9792C(j2 - 1) == ((byte) 13) && mo9738P(1 + j2) && this.f15881k.m9792C(j2) == b) {
                return C7708a.m21589c(this.f15881k, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.f15881k;
            buffer2.m9760s(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f15881k.size(), j) + " content=" + buffer.mo9727o0().mo9708k() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: E0 */
    public InputStream mo9739E0() {
        return new C7376a();
    }

    @Override // okio.BufferedSource
    /* renamed from: P */
    public boolean mo9738P(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f15882l) {
            while (this.f15881k.size() < j) {
                if (this.f15883m.read(this.f15881k, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: T */
    public String mo9737T() {
        return mo9740E(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    /* renamed from: V */
    public byte[] mo9736V(long j) {
        mo9735a0(j);
        return this.f15881k.mo9736V(j);
    }

    @Override // okio.BufferedSource
    /* renamed from: a0 */
    public void mo9735a0(long j) {
        if (!mo9738P(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public long m22785b(byte b) {
        return m22784g(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    /* renamed from: c */
    public Buffer mo9734c() {
        return this.f15881k;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f15882l) {
            this.f15882l = true;
            this.f15883m.close();
            this.f15881k.m9765h();
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: e0 */
    public ByteString mo9733e0(long j) {
        mo9735a0(j);
        return this.f15881k.mo9733e0(j);
    }

    /* renamed from: g */
    public long m22784g(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f15882l) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long H = this.f15881k.m9789H(b, j, j2);
                    if (H != -1) {
                        return H;
                    }
                    long size = this.f15881k.size();
                    if (size >= j2 || this.f15883m.read(this.f15881k, 8192) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, size);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: g0 */
    public byte[] mo9732g0() {
        this.f15881k.mo9748N(this.f15883m);
        return this.f15881k.mo9732g0();
    }

    /* renamed from: h */
    public long m22783h(ByteString bytes, long j) {
        C9971q.m14633g(bytes, "bytes");
        if (!this.f15882l) {
            while (true) {
                long Q = this.f15881k.m9779Q(bytes, j);
                if (Q != -1) {
                    return Q;
                }
                long size = this.f15881k.size();
                if (this.f15883m.read(this.f15881k, 8192) == -1) {
                    return -1L;
                }
                j = Math.max(j, (size - bytes.m9697v()) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: h0 */
    public boolean mo9731h0() {
        if (!(!this.f15882l)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f15881k.mo9731h0() || this.f15883m.read(this.f15881k, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: i */
    public long m22782i(ByteString targetBytes, long j) {
        C9971q.m14633g(targetBytes, "targetBytes");
        if (!this.f15882l) {
            while (true) {
                long R = this.f15881k.m9777R(targetBytes, j);
                if (R != -1) {
                    return R;
                }
                long size = this.f15881k.size();
                if (this.f15883m.read(this.f15881k, 8192) == -1) {
                    return -1L;
                }
                j = Math.max(j, size);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r4 == 0) goto L_0x002f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = p326ri.C12690b.m5870a(16);
        r2 = p326ri.C12690b.m5870a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.C9971q.m14634f(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.BufferedSource
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo9730i0() {
        /*
            r10 = this;
            r0 = 1
            r10.mo9735a0(r0)
            r2 = 0
            r4 = r2
        L_0x0008:
            long r6 = r4 + r0
            boolean r8 = r10.mo9738P(r6)
            if (r8 == 0) goto L_0x0059
            okio.Buffer r8 = r10.f15881k
            byte r8 = r8.m9792C(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L_0x0020
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L_0x002a
        L_0x0020:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r4 = r6
            goto L_0x0008
        L_0x002c:
            if (r4 == 0) goto L_0x002f
            goto L_0x0059
        L_0x002f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = p326ri.C12688a.m5874a(r2)
            int r2 = p326ri.C12688a.m5874a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C9971q.m14634f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0059:
            okio.Buffer r0 = r10.f15881k
            long r0 = r0.mo9730i0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.C7375t.mo9730i0():long");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f15882l;
    }

    /* renamed from: l */
    public int m22781l() {
        mo9735a0(4L);
        return this.f15881k.m9766f0();
    }

    @Override // okio.BufferedSource
    /* renamed from: l0 */
    public String mo9729l0(Charset charset) {
        C9971q.m14633g(charset, "charset");
        this.f15881k.mo9748N(this.f15883m);
        return this.f15881k.mo9729l0(charset);
    }

    /* renamed from: n */
    public short m22780n() {
        mo9735a0(2L);
        return this.f15881k.m9764j0();
    }

    @Override // okio.BufferedSource
    /* renamed from: o */
    public Buffer mo9728o() {
        return this.f15881k;
    }

    @Override // okio.BufferedSource
    /* renamed from: o0 */
    public ByteString mo9727o0() {
        this.f15881k.mo9748N(this.f15883m);
        return this.f15881k.mo9727o0();
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return C7366m.m22819d(new C7372r(this));
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        C9971q.m14633g(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f15882l)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f15881k.size() == 0 && this.f15883m.read(this.f15881k, 8192) == -1) {
            return -1L;
        } else {
            return this.f15881k.read(sink, Math.min(j, this.f15881k.size()));
        }
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        mo9735a0(1L);
        return this.f15881k.readByte();
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) {
        C9971q.m14633g(sink, "sink");
        try {
            mo9735a0(sink.length);
            this.f15881k.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (this.f15881k.size() > 0) {
                Buffer buffer = this.f15881k;
                int read = buffer.read(sink, i, (int) buffer.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public int readInt() {
        mo9735a0(4L);
        return this.f15881k.readInt();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        mo9735a0(8L);
        return this.f15881k.readLong();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        mo9735a0(2L);
        return this.f15881k.readShort();
    }

    @Override // okio.BufferedSource
    /* renamed from: s0 */
    public String mo9726s0() {
        this.f15881k.mo9748N(this.f15883m);
        return this.f15881k.mo9726s0();
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        if (!this.f15882l) {
            while (j > 0) {
                if (this.f15881k.size() == 0 && this.f15883m.read(this.f15881k, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f15881k.size());
                this.f15881k.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: t0 */
    public int mo9725t0(C7369p options) {
        C9971q.m14633g(options, "options");
        if (!this.f15882l) {
            while (true) {
                int d = C7708a.m21588d(this.f15881k, options, true);
                if (d == -2) {
                    if (this.f15883m.read(this.f15881k, 8192) == -1) {
                        break;
                    }
                } else if (d != -1) {
                    this.f15881k.skip(options.m22794g()[d].m9697v());
                    return d;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f15883m.timeout();
    }

    public String toString() {
        return "buffer(" + this.f15883m + ')';
    }

    @Override // okio.BufferedSource
    /* renamed from: v */
    public long mo9724v(ByteString bytes) {
        C9971q.m14633g(bytes, "bytes");
        return m22783h(bytes, 0L);
    }

    @Override // okio.BufferedSource
    /* renamed from: x0 */
    public long mo9723x0(Sink sink) {
        C9971q.m14633g(sink, "sink");
        long j = 0;
        while (this.f15883m.read(this.f15881k, 8192) != -1) {
            long n = this.f15881k.m9762n();
            if (n > 0) {
                j += n;
                sink.mo392K(this.f15881k, n);
            }
        }
        if (this.f15881k.size() <= 0) {
            return j;
        }
        long size = j + this.f15881k.size();
        Buffer buffer = this.f15881k;
        sink.mo392K(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    /* renamed from: y */
    public void mo9722y(Buffer sink, long j) {
        C9971q.m14633g(sink, "sink");
        try {
            mo9735a0(j);
            this.f15881k.mo9722y(sink, j);
        } catch (EOFException e) {
            sink.mo9748N(this.f15881k);
            throw e;
        }
    }

    @Metadata(m15074d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m15073d2 = {"fk/t$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: fk.t$a */
    /* loaded from: classes8.dex */
    public static final class C7376a extends InputStream {
        C7376a() {
        }

        @Override // java.io.InputStream
        public int available() {
            C7375t tVar = C7375t.this;
            if (!tVar.f15882l) {
                return (int) Math.min(tVar.f15881k.size(), (long) ViewDefaults.NUMBER_OF_LINES);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7375t.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C7375t tVar = C7375t.this;
            if (!tVar.f15882l) {
                if (tVar.f15881k.size() == 0) {
                    C7375t tVar2 = C7375t.this;
                    if (tVar2.f15883m.read(tVar2.f15881k, 8192) == -1) {
                        return -1;
                    }
                }
                return C7375t.this.f15881k.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C7375t.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i, int i2) {
            C9971q.m14633g(data, "data");
            if (!C7375t.this.f15882l) {
                C7355c.m22840b(data.length, i, i2);
                if (C7375t.this.f15881k.size() == 0) {
                    C7375t tVar = C7375t.this;
                    if (tVar.f15883m.read(tVar.f15881k, 8192) == -1) {
                        return -1;
                    }
                }
                return C7375t.this.f15881k.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C9971q.m14633g(sink, "sink");
        if (this.f15881k.size() == 0 && this.f15883m.read(this.f15881k, 8192) == -1) {
            return -1;
        }
        return this.f15881k.read(sink);
    }
}
