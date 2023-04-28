package okio;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import fk.C7355c;
import fk.C7366m;
import fk.C7369p;
import fk.C7372r;
import fk.C7377u;
import fk.C7379v;
import fk.C7380w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9894b;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import p122gk.C7708a;
import p326ri.C12694d;

@Metadata(m15074d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008b\u0001B\t¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J\u0018\u00106\u001a\u0002002\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0016J\b\u00107\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u00108\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020:H\u0016J\u0010\u0010<\u001a\u00020:2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010=\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020:H\u0016J \u0010>\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020?H\u0016J\u0006\u0010@\u001a\u00020\u000eJ\u0010\u0010A\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020&H\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u000200H\u0016J \u0010H\u001a\u00020\u00002\u0006\u0010D\u001a\u0002002\u0006\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001fH\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u001fH\u0016J\u0018\u0010K\u001a\u00020\u00002\u0006\u0010D\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J(\u0010L\u001a\u00020\u00002\u0006\u0010D\u001a\u0002002\u0006\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0016J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020:H\u0016J \u0010O\u001a\u00020\u00002\u0006\u0010M\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010P\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020?H\u0016J\u0010\u0010R\u001a\u00020\f2\u0006\u0010M\u001a\u00020QH\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001fH\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001fH\u0016J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u001fH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\fH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\fH\u0016J\u0017\u0010^\u001a\u00020]2\u0006\u0010\\\u001a\u00020\u001fH\u0000¢\u0006\u0004\b^\u0010_J\u0018\u0010`\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010>\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010c\u001a\u00020\f2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\fH\u0016J\u0010\u0010X\u001a\u00020\f2\u0006\u0010d\u001a\u00020&H\u0016J\u0018\u0010e\u001a\u00020\f2\u0006\u0010d\u001a\u00020&2\u0006\u0010a\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020&H\u0016J\u0018\u0010h\u001a\u00020\f2\u0006\u0010f\u001a\u00020&2\u0006\u0010a\u001a\u00020\fH\u0016J\u0018\u0010i\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020&H\u0016J(\u0010k\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020&2\u0006\u0010j\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\b\u0010l\u001a\u00020\u000eH\u0016J\b\u0010m\u001a\u00020\nH\u0016J\b\u0010n\u001a\u00020\u000eH\u0016J\b\u0010p\u001a\u00020oH\u0016J\u0013\u0010s\u001a\u00020\n2\b\u0010r\u001a\u0004\u0018\u00010qH\u0096\u0002J\b\u0010t\u001a\u00020\u001fH\u0016J\b\u0010u\u001a\u000200H\u0016J\u0006\u0010v\u001a\u00020\u0000J\b\u0010w\u001a\u00020\u0000H\u0016J\u0006\u0010x\u001a\u00020&J\u000e\u0010y\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u001fJ\u0012\u0010|\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020zH\u0007R\u0018\u0010\u007f\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b}\u0010~R1\u0010\u0082\u0001\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0017\n\u0005\bw\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008c\u0001"}, m15073d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "o", "Ljava/io/OutputStream;", "A0", "z", "t", "", "h0", "", "byteCount", "", "a0", "P", "peek", "Ljava/io/InputStream;", "E0", "out", "offset", "s", "n", "", "readByte", "pos", "C", "(J)B", "", "readShort", "", "readInt", "readLong", "j0", "f0", "i0", "B0", "Lokio/ByteString;", "o0", "e0", "Lfk/p;", "options", "t0", "sink", "y", "Lokio/Sink;", "x0", "", "s0", "z0", "Ljava/nio/charset/Charset;", "charset", "l0", "w0", "T", "limit", "E", "", "g0", "V", "readFully", "read", "Ljava/nio/ByteBuffer;", "h", "skip", "byteString", "J0", "string", "U0", "beginIndex", "endIndex", "V0", "codePoint", "W0", "T0", "S0", "source", "K0", "L0", "write", "Lokio/Source;", "N", "b", "M0", "R0", "i", "P0", "v", "Q0", "N0", "O0", "minimumCapacity", "Lfk/u;", "I0", "(I)Lfk/u;", "K", "fromIndex", "toIndex", "H", "bytes", "Q", "targetBytes", "A", "R", "S", "bytesOffset", "U", "flush", "isOpen", "close", "Lokio/Timeout;", "timeout", "", "other", "equals", "hashCode", "toString", "r", "l", "G0", "H0", "Lokio/Buffer$a;", "unsafeCursor", "Y", "k", "Lfk/u;", "head", "<set-?>", "J", "size", "()J", "F0", "(J)V", "c", "()Lokio/Buffer;", "buffer", "<init>", "()V", "a", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: k */
    public C7377u f25530k;

    /* renamed from: l */
    private long f25531l;

    @Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, m15073d2 = {"Lokio/Buffer$a;", "Ljava/io/Closeable;", "", "b", "", "offset", "h", "newSize", "g", "", "close", "Lokio/Buffer;", "k", "Lokio/Buffer;", "buffer", "", "l", "Z", "readWrite", "Lfk/u;", "m", "Lfk/u;", "segment", "n", "J", "", "o", "[B", "data", "p", "I", ViewProps.START, "q", ViewProps.END, "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.Buffer$a */
    /* loaded from: classes8.dex */
    public static final class C11434a implements Closeable {

        /* renamed from: k */
        public Buffer f25532k;

        /* renamed from: l */
        public boolean f25533l;

        /* renamed from: m */
        private C7377u f25534m;

        /* renamed from: o */
        public byte[] f25536o;

        /* renamed from: n */
        public long f25535n = -1;

        /* renamed from: p */
        public int f25537p = -1;

        /* renamed from: q */
        public int f25538q = -1;

        /* renamed from: b */
        public final int m9755b() {
            boolean z;
            long j;
            long j2 = this.f25535n;
            Buffer buffer = this.f25532k;
            C9971q.m14636d(buffer);
            if (j2 != buffer.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f25535n;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + (this.f25538q - this.f25537p);
                }
                return m9753h(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z;
            if (this.f25532k != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f25532k = null;
                this.f25534m = null;
                this.f25535n = -1L;
                this.f25536o = null;
                this.f25537p = -1;
                this.f25538q = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: g */
        public final long m9754g(long j) {
            boolean z;
            Buffer buffer = this.f25532k;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f25533l) {
                long size = buffer.size();
                int i = (j > size ? 1 : (j == size ? 0 : -1));
                int i2 = 1;
                if (i <= 0) {
                    if (j >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j2 = size - j;
                        while (true) {
                            if (j2 <= 0) {
                                break;
                            }
                            C7377u uVar = buffer.f25530k;
                            C9971q.m14636d(uVar);
                            C7377u uVar2 = uVar.f15892g;
                            C9971q.m14636d(uVar2);
                            int i3 = uVar2.f15888c;
                            long j3 = i3 - uVar2.f15887b;
                            if (j3 > j2) {
                                uVar2.f15888c = i3 - ((int) j2);
                                break;
                            }
                            buffer.f25530k = uVar2.m22778b();
                            C7379v.m22771b(uVar2);
                            j2 -= j3;
                        }
                        this.f25534m = null;
                        this.f25535n = j;
                        this.f25536o = null;
                        this.f25537p = -1;
                        this.f25538q = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                    }
                } else if (i > 0) {
                    long j4 = j - size;
                    boolean z2 = true;
                    while (j4 > 0) {
                        C7377u I0 = buffer.m9787I0(i2);
                        int min = (int) Math.min(j4, 8192 - I0.f15888c);
                        int i4 = I0.f15888c + min;
                        I0.f15888c = i4;
                        j4 -= min;
                        if (z2) {
                            this.f25534m = I0;
                            this.f25535n = size;
                            this.f25536o = I0.f15886a;
                            this.f25537p = i4 - min;
                            this.f25538q = i4;
                            z2 = false;
                        }
                        i2 = 1;
                    }
                }
                buffer.m9791F0(j);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        /* renamed from: h */
        public final int m9753h(long j) {
            C7377u uVar;
            Buffer buffer = this.f25532k;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < -1 || j > buffer.size()) {
                C9962k0 k0Var = C9962k0.f22091a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(buffer.size())}, 2));
                C9971q.m14634f(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            } else if (j == -1 || j == buffer.size()) {
                this.f25534m = null;
                this.f25535n = j;
                this.f25536o = null;
                this.f25537p = -1;
                this.f25538q = -1;
                return -1;
            } else {
                long size = buffer.size();
                C7377u uVar2 = buffer.f25530k;
                C7377u uVar3 = this.f25534m;
                long j2 = 0;
                if (uVar3 != null) {
                    long j3 = this.f25535n;
                    int i = this.f25537p;
                    C9971q.m14636d(uVar3);
                    long j4 = j3 - (i - uVar3.f15887b);
                    if (j4 > j) {
                        uVar = uVar2;
                        uVar2 = this.f25534m;
                        size = j4;
                    } else {
                        uVar = this.f25534m;
                        j2 = j4;
                    }
                } else {
                    uVar = uVar2;
                }
                if (size - j > j - j2) {
                    while (true) {
                        C9971q.m14636d(uVar);
                        int i2 = uVar.f15888c;
                        int i3 = uVar.f15887b;
                        if (j < (i2 - i3) + j2) {
                            break;
                        }
                        j2 += i2 - i3;
                        uVar = uVar.f15891f;
                    }
                } else {
                    while (size > j) {
                        C9971q.m14636d(uVar2);
                        uVar2 = uVar2.f15892g;
                        C9971q.m14636d(uVar2);
                        size -= uVar2.f15888c - uVar2.f15887b;
                    }
                    j2 = size;
                    uVar = uVar2;
                }
                if (this.f25533l) {
                    C9971q.m14636d(uVar);
                    if (uVar.f15889d) {
                        C7377u f = uVar.m22774f();
                        if (buffer.f25530k == uVar) {
                            buffer.f25530k = f;
                        }
                        uVar = uVar.m22777c(f);
                        C7377u uVar4 = uVar.f15892g;
                        C9971q.m14636d(uVar4);
                        uVar4.m22778b();
                    }
                }
                this.f25534m = uVar;
                this.f25535n = j;
                C9971q.m14636d(uVar);
                this.f25536o = uVar.f15886a;
                int i4 = uVar.f15887b + ((int) (j - j2));
                this.f25537p = i4;
                int i5 = uVar.f15888c;
                this.f25538q = i5;
                return i5 - i4;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m15073d2 = {"okio/Buffer$c", "Ljava/io/OutputStream;", "", "b", "", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.Buffer$c */
    /* loaded from: classes8.dex */
    public static final class C11436c extends OutputStream {
        C11436c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return Buffer.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            Buffer.this.writeByte(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            C9971q.m14633g(data, "data");
            Buffer.this.write(data, i, i2);
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ C11434a m9767b0(Buffer buffer, C11434a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C11434a();
        }
        return buffer.m9768Y(aVar);
    }

    @Override // okio.BufferedSource
    /* renamed from: A */
    public long mo9742A(ByteString targetBytes) {
        C9971q.m14633g(targetBytes, "targetBytes");
        return m9777R(targetBytes, 0L);
    }

    @Override // okio.BufferedSink
    /* renamed from: A0 */
    public OutputStream mo9752A0() {
        return new C11436c();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[EDGE_INSN: B:41:0x00ae->B:36:0x00ae ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo9741B0() {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            fk.u r6 = r14.f25530k
            kotlin.jvm.internal.C9971q.m14636d(r6)
            byte[] r7 = r6.f15886a
            int r8 = r6.f15887b
            int r9 = r6.f15888c
        L_0x0018:
            if (r8 >= r9) goto L_0x009a
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007b
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.mo9745n0(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo9726s0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = fk.C7355c.m22837e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r8 != r9) goto L_0x00a6
            fk.u r7 = r6.m22778b()
            r14.f25530k = r7
            fk.C7379v.m22771b(r6)
            goto L_0x00a8
        L_0x00a6:
            r6.f15887b = r8
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            fk.u r6 = r14.f25530k
            if (r6 != 0) goto L_0x000d
        L_0x00ae:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m9791F0(r1)
            return r4
        L_0x00b8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo9741B0():long");
    }

    /* renamed from: C */
    public final byte m9792C(long j) {
        C7355c.m22840b(size(), j, 1L);
        C7377u uVar = this.f25530k;
        if (uVar == null) {
            C9971q.m14636d(null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                uVar = uVar.f15892g;
                C9971q.m14636d(uVar);
                size -= uVar.f15888c - uVar.f15887b;
            }
            C9971q.m14636d(uVar);
            return uVar.f15886a[(int) ((uVar.f15887b + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = (uVar.f15888c - uVar.f15887b) + j2;
                if (j3 > j) {
                    C9971q.m14636d(uVar);
                    return uVar.f15886a[(int) ((uVar.f15887b + j) - j2)];
                }
                uVar = uVar.f15891f;
                C9971q.m14636d(uVar);
                j2 = j3;
            }
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: E */
    public String mo9740E(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long H = m9789H(b, 0L, j2);
            if (H != -1) {
                return C7708a.m21589c(this, H);
            }
            if (j2 < size() && m9792C(j2 - 1) == ((byte) 13) && m9792C(j2) == b) {
                return C7708a.m21589c(this, j2);
            }
            Buffer buffer = new Buffer();
            m9760s(buffer, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.mo9727o0().mo9708k() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: E0 */
    public InputStream mo9739E0() {
        return new C11435b();
    }

    /* renamed from: F0 */
    public final void m9791F0(long j) {
        this.f25531l = j;
    }

    /* renamed from: G0 */
    public final ByteString m9790G0() {
        boolean z;
        if (size() <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m9788H0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* renamed from: H */
    public long m9789H(byte b, long j, long j2) {
        boolean z;
        C7377u uVar;
        int i;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (uVar = this.f25530k) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    uVar = uVar.f15892g;
                    C9971q.m14636d(uVar);
                    j3 -= uVar.f15888c - uVar.f15887b;
                }
                while (j3 < j2) {
                    byte[] bArr = uVar.f15886a;
                    int min = (int) Math.min(uVar.f15888c, (uVar.f15887b + j2) - j3);
                    i = (int) ((uVar.f15887b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += uVar.f15888c - uVar.f15887b;
                    uVar = uVar.f15891f;
                    C9971q.m14636d(uVar);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (uVar.f15888c - uVar.f15887b) + j3;
                if (j4 > j) {
                    break;
                }
                uVar = uVar.f15891f;
                C9971q.m14636d(uVar);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = uVar.f15886a;
                int min2 = (int) Math.min(uVar.f15888c, (uVar.f15887b + j2) - j3);
                i = (int) ((uVar.f15887b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                j3 += uVar.f15888c - uVar.f15887b;
                uVar = uVar.f15891f;
                C9971q.m14636d(uVar);
                j = j3;
            }
            return -1L;
            return (i - uVar.f15887b) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: H0 */
    public final ByteString m9788H0(int i) {
        if (i == 0) {
            return ByteString.f25541n;
        }
        C7355c.m22840b(size(), 0L, i);
        C7377u uVar = this.f25530k;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C9971q.m14636d(uVar);
            int i5 = uVar.f15888c;
            int i6 = uVar.f15887b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                uVar = uVar.f15891f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C7377u uVar2 = this.f25530k;
        int i7 = 0;
        while (i2 < i) {
            C9971q.m14636d(uVar2);
            bArr[i7] = uVar2.f15886a;
            i2 += uVar2.f15888c - uVar2.f15887b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uVar2.f15887b;
            uVar2.f15889d = true;
            i7++;
            uVar2 = uVar2.f15891f;
        }
        return new C7380w(bArr, iArr);
    }

    /* renamed from: I0 */
    public final C7377u m9787I0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C7377u uVar = this.f25530k;
            if (uVar == null) {
                C7377u c = C7379v.m22770c();
                this.f25530k = c;
                c.f15892g = c;
                c.f15891f = c;
                return c;
            }
            C9971q.m14636d(uVar);
            C7377u uVar2 = uVar.f15892g;
            C9971q.m14636d(uVar2);
            if (uVar2.f15888c + i > 8192 || !uVar2.f15890e) {
                return uVar2.m22777c(C7379v.m22770c());
            }
            return uVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: J0 */
    public Buffer mo9743u0(ByteString byteString) {
        C9971q.m14633g(byteString, "byteString");
        byteString.mo9719D(this, 0, byteString.m9697v());
        return this;
    }

    @Override // okio.Sink
    /* renamed from: K */
    public void mo392K(Buffer source, long j) {
        boolean z;
        C7377u uVar;
        C7377u uVar2;
        int i;
        C9971q.m14633g(source, "source");
        if (source != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7355c.m22840b(source.size(), 0L, j);
            while (j > 0) {
                C7377u uVar3 = source.f25530k;
                C9971q.m14636d(uVar3);
                int i2 = uVar3.f15888c;
                C9971q.m14636d(source.f25530k);
                if (j < i2 - uVar.f15887b) {
                    C7377u uVar4 = this.f25530k;
                    if (uVar4 != null) {
                        C9971q.m14636d(uVar4);
                        uVar2 = uVar4.f15892g;
                    } else {
                        uVar2 = null;
                    }
                    if (uVar2 != null && uVar2.f15890e) {
                        long j2 = uVar2.f15888c + j;
                        if (uVar2.f15889d) {
                            i = 0;
                        } else {
                            i = uVar2.f15887b;
                        }
                        if (j2 - i <= 8192) {
                            C7377u uVar5 = source.f25530k;
                            C9971q.m14636d(uVar5);
                            uVar5.m22773g(uVar2, (int) j);
                            source.m9791F0(source.size() - j);
                            m9791F0(size() + j);
                            return;
                        }
                    }
                    C7377u uVar6 = source.f25530k;
                    C9971q.m14636d(uVar6);
                    source.f25530k = uVar6.m22775e((int) j);
                }
                C7377u uVar7 = source.f25530k;
                C9971q.m14636d(uVar7);
                long j3 = uVar7.f15888c - uVar7.f15887b;
                source.f25530k = uVar7.m22778b();
                C7377u uVar8 = this.f25530k;
                if (uVar8 == null) {
                    this.f25530k = uVar7;
                    uVar7.f15892g = uVar7;
                    uVar7.f15891f = uVar7;
                } else {
                    C9971q.m14636d(uVar8);
                    C7377u uVar9 = uVar8.f15892g;
                    C9971q.m14636d(uVar9);
                    uVar9.m22777c(uVar7).m22779a();
                }
                source.m9791F0(source.size() - j3);
                m9791F0(size() + j3);
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: K0 */
    public Buffer write(byte[] source) {
        C9971q.m14633g(source, "source");
        return write(source, 0, source.length);
    }

    /* renamed from: L0 */
    public Buffer write(byte[] source, int i, int i2) {
        C9971q.m14633g(source, "source");
        long j = i2;
        C7355c.m22840b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C7377u I0 = m9787I0(1);
            int min = Math.min(i3 - i, 8192 - I0.f15888c);
            int i4 = i + min;
            C9894b.m15031e(source, I0.f15886a, I0.f15888c, i, i4);
            I0.f15888c += min;
            i = i4;
        }
        m9791F0(size() + j);
        return this;
    }

    /* renamed from: M0 */
    public Buffer writeByte(int i) {
        C7377u I0 = m9787I0(1);
        byte[] bArr = I0.f15886a;
        int i2 = I0.f15888c;
        I0.f15888c = i2 + 1;
        bArr[i2] = (byte) i;
        m9791F0(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    /* renamed from: N */
    public long mo9748N(Source source) {
        C9971q.m14633g(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: N0 */
    public Buffer mo9746c0(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo9750J("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C7377u I0 = m9787I0(i2);
        byte[] bArr = I0.f15886a;
        int i3 = I0.f15888c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = C7708a.m21591a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        I0.f15888c += i2;
        m9791F0(size() + i2);
        return this;
    }

    /* renamed from: O0 */
    public Buffer mo9745n0(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C7377u I0 = m9787I0(i);
        byte[] bArr = I0.f15886a;
        int i2 = I0.f15888c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C7708a.m21591a()[(int) (15 & j)];
            j >>>= 4;
        }
        I0.f15888c += i;
        m9791F0(size() + i);
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: P */
    public boolean mo9738P(long j) {
        return this.f25531l >= j;
    }

    /* renamed from: P0 */
    public Buffer writeInt(int i) {
        C7377u I0 = m9787I0(4);
        byte[] bArr = I0.f15886a;
        int i2 = I0.f15888c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        I0.f15888c = i5 + 1;
        m9791F0(size() + 4);
        return this;
    }

    /* renamed from: Q */
    public long m9779Q(ByteString bytes, long j) {
        boolean z;
        boolean z2;
        long j2 = j;
        C9971q.m14633g(bytes, "bytes");
        if (bytes.m9697v() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C7377u uVar = this.f25530k;
                if (uVar != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            uVar = uVar.f15892g;
                            C9971q.m14636d(uVar);
                            size -= uVar.f15888c - uVar.f15887b;
                        }
                        byte[] l = bytes.mo9707l();
                        byte b = l[0];
                        int v = bytes.m9697v();
                        long size2 = (size() - v) + 1;
                        while (size < size2) {
                            byte[] bArr = uVar.f15886a;
                            int min = (int) Math.min(uVar.f15888c, (uVar.f15887b + size2) - size);
                            for (int i = (int) ((uVar.f15887b + j2) - size); i < min; i++) {
                                if (bArr[i] == b && C7708a.m21590b(uVar, i + 1, l, 1, v)) {
                                    return (i - uVar.f15887b) + size;
                                }
                            }
                            size += uVar.f15888c - uVar.f15887b;
                            uVar = uVar.f15891f;
                            C9971q.m14636d(uVar);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j4 = (uVar.f15888c - uVar.f15887b) + j3;
                            if (j4 > j2) {
                                break;
                            }
                            uVar = uVar.f15891f;
                            C9971q.m14636d(uVar);
                            j3 = j4;
                        }
                        byte[] l2 = bytes.mo9707l();
                        byte b2 = l2[0];
                        int v2 = bytes.m9697v();
                        for (long size3 = (size() - v2) + 1; j3 < size3; size3 = size3) {
                            byte[] bArr2 = uVar.f15886a;
                            int min2 = (int) Math.min(uVar.f15888c, (uVar.f15887b + size3) - j3);
                            for (int i2 = (int) ((uVar.f15887b + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && C7708a.m21590b(uVar, i2 + 1, l2, 1, v2)) {
                                    return (i2 - uVar.f15887b) + j3;
                                }
                            }
                            j3 += uVar.f15888c - uVar.f15887b;
                            uVar = uVar.f15891f;
                            C9971q.m14636d(uVar);
                            j2 = j3;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: Q0 */
    public Buffer m9778Q0(long j) {
        C7377u I0 = m9787I0(8);
        byte[] bArr = I0.f15886a;
        int i = I0.f15888c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        I0.f15888c = i8 + 1;
        m9791F0(size() + 8);
        return this;
    }

    /* renamed from: R */
    public long m9777R(ByteString targetBytes, long j) {
        boolean z;
        int i;
        int i2;
        C9971q.m14633g(targetBytes, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7377u uVar = this.f25530k;
            if (uVar == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    uVar = uVar.f15892g;
                    C9971q.m14636d(uVar);
                    j2 -= uVar.f15888c - uVar.f15887b;
                }
                if (targetBytes.m9697v() == 2) {
                    byte f = targetBytes.m9713f(0);
                    byte f2 = targetBytes.m9713f(1);
                    while (j2 < size()) {
                        byte[] bArr = uVar.f15886a;
                        i = (int) ((uVar.f15887b + j) - j2);
                        int i3 = uVar.f15888c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (!(b == f || b == f2)) {
                                i++;
                            }
                            i2 = uVar.f15887b;
                        }
                        j2 += uVar.f15888c - uVar.f15887b;
                        uVar = uVar.f15891f;
                        C9971q.m14636d(uVar);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] l = targetBytes.mo9707l();
                while (j2 < size()) {
                    byte[] bArr2 = uVar.f15886a;
                    i = (int) ((uVar.f15887b + j) - j2);
                    int i4 = uVar.f15888c;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : l) {
                            if (b2 == b3) {
                                i2 = uVar.f15887b;
                            }
                        }
                        i++;
                    }
                    j2 += uVar.f15888c - uVar.f15887b;
                    uVar = uVar.f15891f;
                    C9971q.m14636d(uVar);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (uVar.f15888c - uVar.f15887b) + j2;
                if (j3 > j) {
                    break;
                }
                uVar = uVar.f15891f;
                C9971q.m14636d(uVar);
                j2 = j3;
            }
            if (targetBytes.m9697v() == 2) {
                byte f3 = targetBytes.m9713f(0);
                byte f4 = targetBytes.m9713f(1);
                while (j2 < size()) {
                    byte[] bArr3 = uVar.f15886a;
                    i = (int) ((uVar.f15887b + j) - j2);
                    int i5 = uVar.f15888c;
                    while (i < i5) {
                        byte b4 = bArr3[i];
                        if (!(b4 == f3 || b4 == f4)) {
                            i++;
                        }
                        i2 = uVar.f15887b;
                    }
                    j2 += uVar.f15888c - uVar.f15887b;
                    uVar = uVar.f15891f;
                    C9971q.m14636d(uVar);
                    j = j2;
                }
                return -1L;
            }
            byte[] l2 = targetBytes.mo9707l();
            while (j2 < size()) {
                byte[] bArr4 = uVar.f15886a;
                i = (int) ((uVar.f15887b + j) - j2);
                int i6 = uVar.f15888c;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : l2) {
                        if (b5 == b6) {
                            i2 = uVar.f15887b;
                        }
                    }
                    i++;
                }
                j2 += uVar.f15888c - uVar.f15887b;
                uVar = uVar.f15891f;
                C9971q.m14636d(uVar);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: R0 */
    public Buffer writeShort(int i) {
        C7377u I0 = m9787I0(2);
        byte[] bArr = I0.f15886a;
        int i2 = I0.f15888c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        I0.f15888c = i3 + 1;
        m9791F0(size() + 2);
        return this;
    }

    /* renamed from: S */
    public boolean m9775S(long j, ByteString bytes) {
        C9971q.m14633g(bytes, "bytes");
        return m9772U(j, bytes, 0, bytes.m9697v());
    }

    /* renamed from: S0 */
    public Buffer m9774S0(String string, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        C9971q.m14633g(string, "string");
        C9971q.m14633g(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > string.length()) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
                } else if (C9971q.m14638b(charset, C12694d.f28536b)) {
                    return mo9749M(string, i, i2);
                } else {
                    String substring = string.substring(i, i2);
                    C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        C9971q.m14634f(bytes, "(this as java.lang.String).getBytes(charset)");
                        return write(bytes, 0, bytes.length);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: T */
    public String mo9737T() {
        return mo9740E(Long.MAX_VALUE);
    }

    /* renamed from: T0 */
    public Buffer m9773T0(String string, Charset charset) {
        C9971q.m14633g(string, "string");
        C9971q.m14633g(charset, "charset");
        return m9774S0(string, 0, string.length(), charset);
    }

    /* renamed from: U */
    public boolean m9772U(long j, ByteString bytes, int i, int i2) {
        C9971q.m14633g(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || bytes.m9697v() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m9792C(i3 + j) != bytes.m9713f(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: U0 */
    public Buffer mo9750J(String string) {
        C9971q.m14633g(string, "string");
        return mo9749M(string, 0, string.length());
    }

    @Override // okio.BufferedSource
    /* renamed from: V */
    public byte[] mo9736V(long j) {
        boolean z;
        if (j < 0 || j > ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() >= j) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: V0 */
    public Buffer mo9749M(String string, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        C9971q.m14633g(string, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= string.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt = string.charAt(i);
                        if (charAt < 128) {
                            C7377u I0 = m9787I0(1);
                            byte[] bArr = I0.f15886a;
                            int i3 = I0.f15888c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = string.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = I0.f15888c;
                            int i6 = (i3 + i4) - i5;
                            I0.f15888c = i5 + i6;
                            m9791F0(size() + i6);
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C7377u I02 = m9787I0(2);
                                byte[] bArr2 = I02.f15886a;
                                int i7 = I02.f15888c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                I02.f15888c = i7 + 2;
                                m9791F0(size() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                C7377u I03 = m9787I0(3);
                                byte[] bArr3 = I03.f15886a;
                                int i8 = I03.f15888c;
                                bArr3[i8] = (byte) ((charAt >> '\f') | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                I03.f15888c = i8 + 3;
                                m9791F0(size() + 3);
                            } else {
                                int i9 = i + 1;
                                if (i9 < i2) {
                                    c = string.charAt(i9);
                                } else {
                                    c = 0;
                                }
                                if (charAt > 56319 || 56320 > c || 57343 < c) {
                                    writeByte(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (c & 1023)) + 65536;
                                    C7377u I04 = m9787I0(4);
                                    byte[] bArr4 = I04.f15886a;
                                    int i11 = I04.f15888c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    I04.f15888c = i11 + 4;
                                    m9791F0(size() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: W0 */
    public Buffer m9769W0(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C7377u I0 = m9787I0(2);
            byte[] bArr = I0.f15886a;
            int i2 = I0.f15888c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            I0.f15888c = i2 + 2;
            m9791F0(size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            C7377u I02 = m9787I0(3);
            byte[] bArr2 = I02.f15886a;
            int i3 = I02.f15888c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            I02.f15888c = i3 + 3;
            m9791F0(size() + 3);
        } else if (i <= 1114111) {
            C7377u I03 = m9787I0(4);
            byte[] bArr3 = I03.f15886a;
            int i4 = I03.f15888c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            I03.f15888c = i4 + 4;
            m9791F0(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C7355c.m22836f(i));
        }
        return this;
    }

    /* renamed from: Y */
    public final C11434a m9768Y(C11434a unsafeCursor) {
        boolean z;
        C9971q.m14633g(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.f25532k == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            unsafeCursor.f25532k = this;
            unsafeCursor.f25533l = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: a0 */
    public void mo9735a0(long j) {
        if (this.f25531l < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: c */
    public Buffer mo9734c() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSource
    /* renamed from: e0 */
    public ByteString mo9733e0(long j) {
        boolean z;
        if (j < 0 || j > ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new ByteString(mo9736V(j));
        } else {
            ByteString H0 = m9788H0((int) j);
            skip(j);
            return H0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                C7377u uVar = this.f25530k;
                C9971q.m14636d(uVar);
                C7377u uVar2 = buffer.f25530k;
                C9971q.m14636d(uVar2);
                int i = uVar.f15887b;
                int i2 = uVar2.f15887b;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(uVar.f15888c - i, uVar2.f15888c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (uVar.f15886a[i] == uVar2.f15886a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == uVar.f15888c) {
                        uVar = uVar.f15891f;
                        C9971q.m14636d(uVar);
                        i = uVar.f15887b;
                    }
                    if (i2 == uVar2.f15888c) {
                        uVar2 = uVar2.f15891f;
                        C9971q.m14636d(uVar2);
                        i2 = uVar2.f15887b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public int m9766f0() {
        return C7355c.m22839c(readInt());
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource
    /* renamed from: g0 */
    public byte[] mo9732g0() {
        return mo9736V(size());
    }

    /* renamed from: h */
    public final void m9765h() {
        skip(size());
    }

    @Override // okio.BufferedSource
    /* renamed from: h0 */
    public boolean mo9731h0() {
        return this.f25531l == 0;
    }

    public int hashCode() {
        C7377u uVar = this.f25530k;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uVar.f15888c;
            for (int i3 = uVar.f15887b; i3 < i2; i3++) {
                i = (i * 31) + uVar.f15886a[i3];
            }
            uVar = uVar.f15891f;
            C9971q.m14636d(uVar);
        } while (uVar != this.f25530k);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[EDGE_INSN: B:44:0x00b3->B:37:0x00b3 ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo9730i0() {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L_0x0011:
            fk.u r7 = r15.f25530k
            kotlin.jvm.internal.C9971q.m14636d(r7)
            byte[] r8 = r7.f15886a
            int r9 = r7.f15887b
            int r10 = r7.f15888c
        L_0x001c:
            if (r9 >= r10) goto L_0x009f
            byte r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L_0x006f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L_0x006f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x0042
            if (r13 != 0) goto L_0x003c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L_0x007b
        L_0x0042:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.mo9746c0(r3)
            okio.Buffer r0 = r0.writeByte(r11)
            if (r1 != 0) goto L_0x0054
            r0.readByte()
        L_0x0054:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo9726s0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L_0x0080
            if (r0 != 0) goto L_0x0080
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L_0x007b:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0080:
            if (r0 == 0) goto L_0x0084
            r2 = r13
            goto L_0x009f
        L_0x0084:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = fk.C7355c.m22837e(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            if (r9 != r10) goto L_0x00ab
            fk.u r8 = r7.m22778b()
            r15.f25530k = r8
            fk.C7379v.m22771b(r7)
            goto L_0x00ad
        L_0x00ab:
            r7.f15887b = r9
        L_0x00ad:
            if (r2 != 0) goto L_0x00b3
            fk.u r7 = r15.f25530k
            if (r7 != 0) goto L_0x0011
        L_0x00b3:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.m9791F0(r5)
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            long r3 = -r3
        L_0x00c0:
            return r3
        L_0x00c1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo9730i0():long");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public short m9764j0() {
        return C7355c.m22838d(readShort());
    }

    /* renamed from: l */
    public Buffer clone() {
        return m9761r();
    }

    @Override // okio.BufferedSource
    /* renamed from: l0 */
    public String mo9729l0(Charset charset) {
        C9971q.m14633g(charset, "charset");
        return m9758w0(this.f25531l, charset);
    }

    /* renamed from: n */
    public final long m9762n() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C7377u uVar = this.f25530k;
        C9971q.m14636d(uVar);
        C7377u uVar2 = uVar.f15892g;
        C9971q.m14636d(uVar2);
        int i = uVar2.f15888c;
        if (i < 8192 && uVar2.f15890e) {
            size -= i - uVar2.f15887b;
        }
        return size;
    }

    @Override // okio.BufferedSource
    /* renamed from: o */
    public Buffer mo9728o() {
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: o0 */
    public ByteString mo9727o0() {
        return mo9733e0(size());
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return C7366m.m22819d(new C7372r(this));
    }

    /* renamed from: r */
    public final Buffer m9761r() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            C7377u uVar = this.f25530k;
            C9971q.m14636d(uVar);
            C7377u d = uVar.m22776d();
            buffer.f25530k = d;
            d.f15892g = d;
            d.f15891f = d;
            for (C7377u uVar2 = uVar.f15891f; uVar2 != uVar; uVar2 = uVar2.f15891f) {
                C7377u uVar3 = d.f15892g;
                C9971q.m14636d(uVar3);
                C9971q.m14636d(uVar2);
                uVar3.m22777c(uVar2.m22776d());
            }
            buffer.m9791F0(size());
        }
        return buffer;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C9971q.m14633g(sink, "sink");
        C7377u uVar = this.f25530k;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), uVar.f15888c - uVar.f15887b);
        sink.put(uVar.f15886a, uVar.f15887b, min);
        int i = uVar.f15887b + min;
        uVar.f15887b = i;
        this.f25531l -= min;
        if (i == uVar.f15888c) {
            this.f25530k = uVar.m22778b();
            C7379v.m22771b(uVar);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        if (size() != 0) {
            C7377u uVar = this.f25530k;
            C9971q.m14636d(uVar);
            int i = uVar.f15887b;
            int i2 = uVar.f15888c;
            int i3 = i + 1;
            byte b = uVar.f15886a[i];
            m9791F0(size() - 1);
            if (i3 == i2) {
                this.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            } else {
                uVar.f15887b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) {
        C9971q.m14633g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.BufferedSource
    public int readInt() {
        if (size() >= 4) {
            C7377u uVar = this.f25530k;
            C9971q.m14636d(uVar);
            int i = uVar.f15887b;
            int i2 = uVar.f15888c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f15886a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            m9791F0(size() - 4);
            if (i8 == i2) {
                this.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            } else {
                uVar.f15887b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        if (size() >= 8) {
            C7377u uVar = this.f25530k;
            C9971q.m14636d(uVar);
            int i = uVar.f15887b;
            int i2 = uVar.f15888c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = uVar.f15886a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            m9791F0(size() - 8);
            if (i10 == i2) {
                this.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            } else {
                uVar.f15887b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        if (size() >= 2) {
            C7377u uVar = this.f25530k;
            C9971q.m14636d(uVar);
            int i = uVar.f15887b;
            int i2 = uVar.f15888c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.f15886a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            m9791F0(size() - 2);
            if (i4 == i2) {
                this.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            } else {
                uVar.f15887b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public final Buffer m9760s(Buffer out, long j, long j2) {
        C9971q.m14633g(out, "out");
        C7355c.m22840b(size(), j, j2);
        if (j2 != 0) {
            out.m9791F0(out.size() + j2);
            C7377u uVar = this.f25530k;
            while (true) {
                C9971q.m14636d(uVar);
                int i = uVar.f15888c;
                int i2 = uVar.f15887b;
                if (j >= i - i2) {
                    j -= i - i2;
                    uVar = uVar.f15891f;
                }
            }
            while (j2 > 0) {
                C9971q.m14636d(uVar);
                C7377u d = uVar.m22776d();
                int i3 = d.f15887b + ((int) j);
                d.f15887b = i3;
                d.f15888c = Math.min(i3 + ((int) j2), d.f15888c);
                C7377u uVar2 = out.f25530k;
                if (uVar2 == null) {
                    d.f15892g = d;
                    d.f15891f = d;
                    out.f25530k = d;
                } else {
                    C9971q.m14636d(uVar2);
                    C7377u uVar3 = uVar2.f15892g;
                    C9971q.m14636d(uVar3);
                    uVar3.m22777c(d);
                }
                j2 -= d.f15888c - d.f15887b;
                uVar = uVar.f15891f;
                j = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: s0 */
    public String mo9726s0() {
        return m9758w0(this.f25531l, C12694d.f28536b);
    }

    public final long size() {
        return this.f25531l;
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        while (j > 0) {
            C7377u uVar = this.f25530k;
            if (uVar != null) {
                int min = (int) Math.min(j, uVar.f15888c - uVar.f15887b);
                long j2 = min;
                m9791F0(size() - j2);
                j -= j2;
                int i = uVar.f15887b + min;
                uVar.f15887b = i;
                if (i == uVar.f15888c) {
                    this.f25530k = uVar.m22778b();
                    C7379v.m22771b(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public Buffer mo9744q() {
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: t0 */
    public int mo9725t0(C7369p options) {
        C9971q.m14633g(options, "options");
        int e = C7708a.m21587e(this, options, false, 2, null);
        if (e == -1) {
            return -1;
        }
        skip(options.m22794g()[e].m9697v());
        return e;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.f25546d;
    }

    public String toString() {
        return m9790G0().toString();
    }

    @Override // okio.BufferedSource
    /* renamed from: v */
    public long mo9724v(ByteString bytes) {
        C9971q.m14633g(bytes, "bytes");
        return m9779Q(bytes, 0L);
    }

    /* renamed from: w0 */
    public String m9758w0(long j, Charset charset) {
        boolean z;
        C9971q.m14633g(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0 || j > ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f25531l < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C7377u uVar = this.f25530k;
            C9971q.m14636d(uVar);
            int i2 = uVar.f15887b;
            if (i2 + j > uVar.f15888c) {
                return new String(mo9736V(j), charset);
            }
            int i3 = (int) j;
            String str = new String(uVar.f15886a, i2, i3, charset);
            int i4 = uVar.f15887b + i3;
            uVar.f15887b = i4;
            this.f25531l -= j;
            if (i4 == uVar.f15888c) {
                this.f25530k = uVar.m22778b();
                C7379v.m22771b(uVar);
            }
            return str;
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: x0 */
    public long mo9723x0(Sink sink) {
        C9971q.m14633g(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.mo392K(this, size);
        }
        return size;
    }

    @Override // okio.BufferedSource
    /* renamed from: y */
    public void mo9722y(Buffer sink, long j) {
        C9971q.m14633g(sink, "sink");
        if (size() >= j) {
            sink.mo392K(this, j);
        } else {
            sink.mo392K(this, size());
            throw new EOFException();
        }
    }

    /* renamed from: z */
    public Buffer mo9751B() {
        return this;
    }

    /* renamed from: z0 */
    public String m9756z0(long j) {
        return m9758w0(j, C12694d.f28536b);
    }

    @Metadata(m15074d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m15073d2 = {"okio/Buffer$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.Buffer$b */
    /* loaded from: classes8.dex */
    public static final class C11435b extends InputStream {
        C11435b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(Buffer.this.size(), (long) ViewDefaults.NUMBER_OF_LINES);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (Buffer.this.size() > 0) {
                return Buffer.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return Buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i, int i2) {
            C9971q.m14633g(sink, "sink");
            return Buffer.this.read(sink, i, i2);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C9971q.m14633g(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            C7377u I0 = m9787I0(1);
            int min = Math.min(i, 8192 - I0.f15888c);
            source.get(I0.f15886a, I0.f15888c, min);
            i -= min;
            I0.f15888c += min;
        }
        this.f25531l += remaining;
        return remaining;
    }

    public int read(byte[] sink, int i, int i2) {
        C9971q.m14633g(sink, "sink");
        C7355c.m22840b(sink.length, i, i2);
        C7377u uVar = this.f25530k;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i2, uVar.f15888c - uVar.f15887b);
        byte[] bArr = uVar.f15886a;
        int i3 = uVar.f15887b;
        C9894b.m15031e(bArr, sink, i, i3, i3 + min);
        uVar.f15887b += min;
        m9791F0(size() - min);
        if (uVar.f15887b != uVar.f15888c) {
            return min;
        }
        this.f25530k = uVar.m22778b();
        C7379v.m22771b(uVar);
        return min;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        C9971q.m14633g(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (size() == 0) {
            return -1L;
        } else {
            if (j > size()) {
                j = size();
            }
            sink.mo392K(this, j);
            return j;
        }
    }
}
