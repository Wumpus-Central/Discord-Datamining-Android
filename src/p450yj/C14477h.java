package p450yj;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9986a;
import kotlin.ranges.IntRange;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p327rj.C12729c;
import p450yj.C14453d;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \t2\u00020\u0001:\u0003+,-B\u0017\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006."}, m15073d2 = {"Lyj/h;", "Ljava/io/Closeable;", "Lyj/h$c;", "handler", "", "length", "flags", "streamId", "", "p", ViewProps.PADDING, "", "Lyj/c;", "n", "i", "t", "s", "C", "H", "z", "r", "l", "Q", "h", "", "requireSettings", "g", "close", "Lyj/h$b;", "k", "Lyj/h$b;", "continuation", "Lyj/d$a;", "Lyj/d$a;", "hpackReader", "Lokio/BufferedSource;", "m", "Lokio/BufferedSource;", "source", "Z", "client", "<init>", "(Lokio/BufferedSource;Z)V", "a", "b", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.h */
/* loaded from: classes8.dex */
public final class C14477h implements Closeable {

    /* renamed from: o */
    private static final Logger f32815o;

    /* renamed from: p */
    public static final C14478a f32816p = new C14478a(null);

    /* renamed from: k */
    private final C14479b f32817k;

    /* renamed from: l */
    private final C14453d.C14454a f32818l;

    /* renamed from: m */
    private final BufferedSource f32819m;

    /* renamed from: n */
    private final boolean f32820n;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m15073d2 = {"Lyj/h$a;", "", "", "length", "flags", ViewProps.PADDING, "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.h$a */
    /* loaded from: classes8.dex */
    public static final class C14478a {
        private C14478a() {
        }

        public /* synthetic */ C14478a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m442a() {
            return C14477h.f32815o;
        }

        /* renamed from: b */
        public final int m441b(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\"\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\"\u0010!\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#¨\u0006'"}, m15073d2 = {"Lyj/h$b;", "Lokio/Source;", "", "g", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "close", "", "k", "I", "getLength", "()I", "l", "(I)V", "length", "getFlags", "h", "flags", "m", "getStreamId", "p", "streamId", "n", "b", "i", ViewProps.LEFT, "o", "getPadding", ViewProps.PADDING, "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.h$b */
    /* loaded from: classes8.dex */
    public static final class C14479b implements Source {

        /* renamed from: k */
        private int f32821k;

        /* renamed from: l */
        private int f32822l;

        /* renamed from: m */
        private int f32823m;

        /* renamed from: n */
        private int f32824n;

        /* renamed from: o */
        private int f32825o;

        /* renamed from: p */
        private final BufferedSource f32826p;

        public C14479b(BufferedSource source) {
            C9971q.m14633g(source, "source");
            this.f32826p = source;
        }

        /* renamed from: g */
        private final void m439g() {
            int i = this.f32823m;
            int H = C12729c.m5635H(this.f32826p);
            this.f32824n = H;
            this.f32821k = H;
            int b = C12729c.m5616b(this.f32826p.readByte(), 255);
            this.f32822l = C12729c.m5616b(this.f32826p.readByte(), 255);
            C14478a aVar = C14477h.f32816p;
            if (aVar.m442a().isLoggable(Level.FINE)) {
                aVar.m442a().fine(C14456e.f32711e.m541c(true, this.f32823m, this.f32821k, b, this.f32822l));
            }
            int readInt = this.f32826p.readInt() & ViewDefaults.NUMBER_OF_LINES;
            this.f32823m = readInt;
            if (b != 9) {
                throw new IOException(b + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        /* renamed from: b */
        public final int m440b() {
            return this.f32824n;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: h */
        public final void m438h(int i) {
            this.f32822l = i;
        }

        /* renamed from: i */
        public final void m437i(int i) {
            this.f32824n = i;
        }

        /* renamed from: l */
        public final void m436l(int i) {
            this.f32821k = i;
        }

        /* renamed from: n */
        public final void m435n(int i) {
            this.f32825o = i;
        }

        /* renamed from: p */
        public final void m434p(int i) {
            this.f32823m = i;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9971q.m14633g(sink, "sink");
            while (true) {
                int i = this.f32824n;
                if (i == 0) {
                    this.f32826p.skip(this.f32825o);
                    this.f32825o = 0;
                    if ((this.f32822l & 4) != 0) {
                        return -1L;
                    }
                    m439g();
                } else {
                    long read = this.f32826p.read(sink, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f32824n -= (int) read;
                    return read;
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f32826p.timeout();
        }
    }

    @Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006*"}, m15073d2 = {"Lyj/h$c;", "", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "", "i", "associatedStreamId", "", "Lyj/c;", "headerBlock", "a", "Lyj/b;", "errorCode", "c", "clearPrevious", "Lyj/m;", "settings", "l", "g", "ack", "payload1", "payload2", "j", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "e", "", "windowSizeIncrement", "b", "streamDependency", "weight", "exclusive", "k", "promisedStreamId", "requestHeaders", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.h$c */
    /* loaded from: classes8.dex */
    public interface AbstractC14480c {
        /* renamed from: a */
        void mo433a(boolean z, int i, int i2, List<C14451c> list);

        /* renamed from: b */
        void mo432b(int i, long j);

        /* renamed from: c */
        void mo431c(int i, EnumC14449b bVar);

        /* renamed from: d */
        void mo430d(int i, int i2, List<C14451c> list);

        /* renamed from: e */
        void mo429e(int i, EnumC14449b bVar, ByteString byteString);

        /* renamed from: g */
        void mo428g();

        /* renamed from: i */
        void mo427i(boolean z, int i, BufferedSource bufferedSource, int i2);

        /* renamed from: j */
        void mo426j(boolean z, int i, int i2);

        /* renamed from: k */
        void mo425k(int i, int i2, int i3, boolean z);

        /* renamed from: l */
        void mo424l(boolean z, C14492m mVar);
    }

    static {
        Logger logger = Logger.getLogger(C14456e.class.getName());
        C9971q.m14634f(logger, "Logger.getLogger(Http2::class.java.name)");
        f32815o = logger;
    }

    public C14477h(BufferedSource source, boolean z) {
        C9971q.m14633g(source, "source");
        this.f32819m = source;
        this.f32820n = z;
        C14479b bVar = new C14479b(source);
        this.f32817k = bVar;
        this.f32818l = new C14453d.C14454a(bVar, 4096, 0, 4, null);
    }

    /* renamed from: C */
    private final void m456C(AbstractC14480c cVar, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f32819m.readInt();
            EnumC14449b a = EnumC14449b.f39495A.m575a(readInt);
            if (a != null) {
                cVar.mo431c(i3, a);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: H */
    private final void m455H(AbstractC14480c cVar, int i, int i2, int i3) {
        IntRange q;
        C9986a o;
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.mo428g();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            C14492m mVar = new C14492m();
            q = C6884j.m23947q(0, i);
            o = C6884j.m23949o(q, 6);
            int a = o.m14605a();
            int b = o.m14604b();
            int f = o.m14603f();
            if (f < 0 ? a >= b : a <= b) {
                while (true) {
                    int c = C12729c.m5615c(this.f32819m.readShort(), 65535);
                    readInt = this.f32819m.readInt();
                    if (c != 2) {
                        if (c == 3) {
                            c = 4;
                        } else if (c != 4) {
                            if (c == 5 && (readInt < 16384 || readInt > 16777215)) {
                                break;
                            }
                        } else if (readInt >= 0) {
                            c = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.m347h(c, readInt);
                    if (a == b) {
                        break;
                    }
                    a += f;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.mo424l(false, mVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
    }

    /* renamed from: Q */
    private final void m454Q(AbstractC14480c cVar, int i, int i2, int i3) {
        if (i == 4) {
            long d = C12729c.m5614d(this.f32819m.readInt(), 2147483647L);
            if (d != 0) {
                cVar.mo432b(i3, d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    /* renamed from: i */
    private final void m450i(AbstractC14480c cVar, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            boolean z2 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((i2 & 8) != 0) {
                    i4 = C12729c.m5616b(this.f32819m.readByte(), 255);
                }
                cVar.mo427i(z, i3, this.f32819m, f32816p.m441b(i, i2, i4));
                this.f32819m.skip(i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: l */
    private final void m449l(AbstractC14480c cVar, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f32819m.readInt();
            int readInt2 = this.f32819m.readInt();
            int i4 = i - 8;
            EnumC14449b a = EnumC14449b.f39495A.m575a(readInt2);
            if (a != null) {
                ByteString byteString = ByteString.f25541n;
                if (i4 > 0) {
                    byteString = this.f32819m.mo9733e0(i4);
                }
                cVar.mo429e(readInt, a, byteString);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* renamed from: n */
    private final List<C14451c> m448n(int i, int i2, int i3, int i4) {
        this.f32817k.m437i(i);
        C14479b bVar = this.f32817k;
        bVar.m436l(bVar.m440b());
        this.f32817k.m435n(i2);
        this.f32817k.m438h(i3);
        this.f32817k.m434p(i4);
        this.f32818l.m558k();
        return this.f32818l.m564e();
    }

    /* renamed from: p */
    private final void m447p(AbstractC14480c cVar, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i4 = C12729c.m5616b(this.f32819m.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m445s(cVar, i3);
                i -= 5;
            }
            cVar.mo433a(z, i3, -1, m448n(f32816p.m441b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: r */
    private final void m446r(AbstractC14480c cVar, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f32819m.readInt();
            int readInt2 = this.f32819m.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo426j(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    /* renamed from: s */
    private final void m445s(AbstractC14480c cVar, int i) {
        boolean z;
        int readInt = this.f32819m.readInt();
        if ((((int) 2147483648L) & readInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        cVar.mo425k(i, readInt & ViewDefaults.NUMBER_OF_LINES, C12729c.m5616b(this.f32819m.readByte(), 255) + 1, z);
    }

    /* renamed from: t */
    private final void m444t(AbstractC14480c cVar, int i, int i2, int i3) {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            m445s(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    /* renamed from: z */
    private final void m443z(AbstractC14480c cVar, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                i4 = C12729c.m5616b(this.f32819m.readByte(), 255);
            } else {
                i4 = 0;
            }
            cVar.mo430d(i3, this.f32819m.readInt() & ViewDefaults.NUMBER_OF_LINES, m448n(f32816p.m441b(i - 4, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32819m.close();
    }

    /* renamed from: g */
    public final boolean m452g(boolean z, AbstractC14480c handler) {
        C9971q.m14633g(handler, "handler");
        try {
            this.f32819m.mo9735a0(9L);
            int H = C12729c.m5635H(this.f32819m);
            if (H <= 16384) {
                int b = C12729c.m5616b(this.f32819m.readByte(), 255);
                int b2 = C12729c.m5616b(this.f32819m.readByte(), 255);
                int readInt = this.f32819m.readInt() & ViewDefaults.NUMBER_OF_LINES;
                Logger logger = f32815o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C14456e.f32711e.m541c(true, readInt, H, b, b2));
                }
                if (!z || b == 4) {
                    switch (b) {
                        case 0:
                            m450i(handler, H, b2, readInt);
                            return true;
                        case 1:
                            m447p(handler, H, b2, readInt);
                            return true;
                        case 2:
                            m444t(handler, H, b2, readInt);
                            return true;
                        case 3:
                            m456C(handler, H, b2, readInt);
                            return true;
                        case 4:
                            m455H(handler, H, b2, readInt);
                            return true;
                        case 5:
                            m443z(handler, H, b2, readInt);
                            return true;
                        case 6:
                            m446r(handler, H, b2, readInt);
                            return true;
                        case 7:
                            m449l(handler, H, b2, readInt);
                            return true;
                        case 8:
                            m454Q(handler, H, b2, readInt);
                            return true;
                        default:
                            this.f32819m.skip(H);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + C14456e.f32711e.m542b(b));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + H);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public final void m451h(AbstractC14480c handler) {
        C9971q.m14633g(handler, "handler");
        if (!this.f32820n) {
            BufferedSource bufferedSource = this.f32819m;
            ByteString byteString = C14456e.f32707a;
            ByteString e0 = bufferedSource.mo9733e0(byteString.m9697v());
            Logger logger = f32815o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C12729c.m5601q("<< CONNECTION " + e0.mo9708k(), new Object[0]));
            }
            if (!C9971q.m14638b(byteString, e0)) {
                throw new IOException("Expected a connection header but was " + e0.m9721B());
            }
        } else if (!m452g(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
