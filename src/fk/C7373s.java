package fk;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00105\u001a\u000202¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0001H\u0016J\b\u0010\"\u001a\u00020\u0001H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020\u000bH\u0016R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006="}, m15073d2 = {"Lfk/s;", "Lokio/BufferedSink;", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "Lokio/ByteString;", "byteString", "u0", "", "string", "J", "", "beginIndex", "endIndex", "M", "", "write", "offset", "Ljava/nio/ByteBuffer;", "Lokio/Source;", "N", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "c0", "n0", "B", "q", "Ljava/io/OutputStream;", "A0", "flush", "", "isOpen", "close", "Lokio/Timeout;", "timeout", "toString", "k", "Lokio/Buffer;", "bufferField", "l", "Z", "closed", "Lokio/Sink;", "m", "Lokio/Sink;", "sink", "c", "()Lokio/Buffer;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lokio/Sink;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.s */
/* loaded from: classes8.dex */
public final class C7373s implements BufferedSink {

    /* renamed from: k */
    public final Buffer f15877k = new Buffer();

    /* renamed from: l */
    public boolean f15878l;

    /* renamed from: m */
    public final Sink f15879m;

    public C7373s(Sink sink) {
        C9971q.m14633g(sink, "sink");
        this.f15879m = sink;
    }

    @Override // okio.BufferedSink
    /* renamed from: A0 */
    public OutputStream mo9752A0() {
        return new C7374a();
    }

    @Override // okio.BufferedSink
    /* renamed from: B */
    public BufferedSink mo9751B() {
        if (!this.f15878l) {
            long n = this.f15877k.m9762n();
            if (n > 0) {
                this.f15879m.mo392K(this.f15877k, n);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: J */
    public BufferedSink mo9750J(String string) {
        C9971q.m14633g(string, "string");
        if (!this.f15878l) {
            this.f15877k.mo9750J(string);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        C9971q.m14633g(source, "source");
        if (!this.f15878l) {
            this.f15877k.mo392K(source, j);
            mo9751B();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: M */
    public BufferedSink mo9749M(String string, int i, int i2) {
        C9971q.m14633g(string, "string");
        if (!this.f15878l) {
            this.f15877k.mo9749M(string, i, i2);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: N */
    public long mo9748N(Source source) {
        C9971q.m14633g(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.f15877k, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo9751B();
        }
    }

    @Override // okio.BufferedSink
    /* renamed from: c */
    public Buffer mo9747c() {
        return this.f15877k;
    }

    @Override // okio.BufferedSink
    /* renamed from: c0 */
    public BufferedSink mo9746c0(long j) {
        if (!this.f15878l) {
            this.f15877k.mo9746c0(j);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2;
        if (!this.f15878l) {
            try {
                if (this.f15877k.size() > 0) {
                    Sink sink = this.f15879m;
                    Buffer buffer = this.f15877k;
                    sink.mo392K(buffer, buffer.size());
                }
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f15879m.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            this.f15878l = true;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (!this.f15878l) {
            if (this.f15877k.size() > 0) {
                Sink sink = this.f15879m;
                Buffer buffer = this.f15877k;
                sink.mo392K(buffer, buffer.size());
            }
            this.f15879m.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f15878l;
    }

    @Override // okio.BufferedSink
    /* renamed from: n0 */
    public BufferedSink mo9745n0(long j) {
        if (!this.f15878l) {
            this.f15877k.mo9745n0(j);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: q */
    public BufferedSink mo9744q() {
        if (!this.f15878l) {
            long size = this.f15877k.size();
            if (size > 0) {
                this.f15879m.mo392K(this.f15877k, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f15879m.timeout();
    }

    public String toString() {
        return "buffer(" + this.f15879m + ')';
    }

    @Override // okio.BufferedSink
    /* renamed from: u0 */
    public BufferedSink mo9743u0(ByteString byteString) {
        C9971q.m14633g(byteString, "byteString");
        if (!this.f15878l) {
            this.f15877k.mo9743u0(byteString);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C9971q.m14633g(source, "source");
        if (!this.f15878l) {
            int write = this.f15877k.write(source);
            mo9751B();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeByte(int i) {
        if (!this.f15878l) {
            this.f15877k.writeByte(i);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeInt(int i) {
        if (!this.f15878l) {
            this.f15877k.writeInt(i);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShort(int i) {
        if (!this.f15878l) {
            this.f15877k.writeShort(i);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Metadata(m15074d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m15073d2 = {"fk/s$a", "Ljava/io/OutputStream;", "", "b", "", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: fk.s$a */
    /* loaded from: classes8.dex */
    public static final class C7374a extends OutputStream {
        C7374a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7373s.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            C7373s sVar = C7373s.this;
            if (!sVar.f15878l) {
                sVar.flush();
            }
        }

        public String toString() {
            return C7373s.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C7373s sVar = C7373s.this;
            if (!sVar.f15878l) {
                sVar.f15877k.writeByte((byte) i);
                C7373s.this.mo9751B();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            C9971q.m14633g(data, "data");
            C7373s sVar = C7373s.this;
            if (!sVar.f15878l) {
                sVar.f15877k.write(data, i, i2);
                C7373s.this.mo9751B();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] source) {
        C9971q.m14633g(source, "source");
        if (!this.f15878l) {
            this.f15877k.write(source);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] source, int i, int i2) {
        C9971q.m14633g(source, "source");
        if (!this.f15878l) {
            this.f15877k.write(source, i, i2);
            return mo9751B();
        }
        throw new IllegalStateException("closed".toString());
    }
}
