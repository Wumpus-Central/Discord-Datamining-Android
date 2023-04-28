package p450yj;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.BufferedSink;
import p163j$.util.Spliterator;
import p327rj.C12729c;
import p450yj.C14453d;

@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001DB\u0017\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010A\u001a\u00020\u0016¢\u0006\u0004\bB\u0010CJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u00102\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00103R\u0016\u00107\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106¨\u0006E"}, m15073d2 = {"Lyj/j;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "", "Q", "g", "Lyj/m;", "peerSettings", "b", "promisedStreamId", "", "Lyj/c;", "requestHeaders", "t", "flush", "Lyj/b;", "errorCode", "z", "r", "", "outFinished", "Lokio/Buffer;", "source", "h", "flags", "buffer", "i", "settings", "C", "ack", "payload1", "payload2", "s", "lastGoodStreamId", "", "debugData", "n", "windowSizeIncrement", "H", "length", "type", "l", "close", "headerBlock", "p", "k", "Lokio/Buffer;", "hpackBuffer", "I", "maxFrameSize", "m", "Z", "closed", "Lyj/d$b;", "Lyj/d$b;", "getHpackWriter", "()Lyj/d$b;", "hpackWriter", "Lokio/BufferedSink;", "o", "Lokio/BufferedSink;", "sink", "client", "<init>", "(Lokio/BufferedSink;Z)V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.j */
/* loaded from: classes8.dex */
public final class C14486j implements Closeable {

    /* renamed from: k */
    private final Buffer f32857k;

    /* renamed from: l */
    private int f32858l = Spliterator.SUBSIZED;

    /* renamed from: m */
    private boolean f32859m;

    /* renamed from: n */
    private final C14453d.C14455b f32860n;

    /* renamed from: o */
    private final BufferedSink f32861o;

    /* renamed from: p */
    private final boolean f32862p;

    /* renamed from: r */
    public static final C14487a f32856r = new C14487a(null);

    /* renamed from: q */
    private static final Logger f32855q = Logger.getLogger(C14456e.class.getName());

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m15073d2 = {"Lyj/j$a;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.j$a */
    /* loaded from: classes8.dex */
    public static final class C14487a {
        private C14487a() {
        }

        public /* synthetic */ C14487a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14486j(BufferedSink sink, boolean z) {
        C9971q.m14633g(sink, "sink");
        this.f32861o = sink;
        this.f32862p = z;
        Buffer buffer = new Buffer();
        this.f32857k = buffer;
        this.f32860n = new C14453d.C14455b(0, false, buffer, 3, null);
    }

    /* renamed from: Q */
    private final void m377Q(int i, long j) {
        int i2;
        while (j > 0) {
            long min = Math.min(this.f32858l, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            m372l(i, i3, 9, i2);
            this.f32861o.mo392K(this.f32857k, min);
        }
    }

    /* renamed from: C */
    public final synchronized void m379C(C14492m settings) {
        int i;
        C9971q.m14633g(settings, "settings");
        if (!this.f32859m) {
            m372l(0, settings.m346i() * 6, 4, 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (settings.m349f(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 != 7) {
                        i = i2;
                    } else {
                        i = 4;
                    }
                    this.f32861o.writeShort(i);
                    this.f32861o.writeInt(settings.m354a(i2));
                }
            }
            this.f32861o.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: H */
    public final synchronized void m378H(int i, long j) {
        boolean z;
        if (!this.f32859m) {
            if (j == 0 || j > 2147483647L) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                m372l(i, 4, 8, 0);
                this.f32861o.writeInt((int) j);
                this.f32861o.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void m376b(C14492m peerSettings) {
        C9971q.m14633g(peerSettings, "peerSettings");
        if (!this.f32859m) {
            this.f32858l = peerSettings.m350e(this.f32858l);
            if (peerSettings.m353b() != -1) {
                this.f32860n.m547e(peerSettings.m353b());
            }
            m372l(0, 0, 4, 1);
            this.f32861o.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f32859m = true;
        this.f32861o.close();
    }

    public final synchronized void flush() {
        if (!this.f32859m) {
            this.f32861o.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final synchronized void m375g() {
        if (this.f32859m) {
            throw new IOException("closed");
        } else if (this.f32862p) {
            Logger logger = f32855q;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C12729c.m5601q(">> CONNECTION " + C14456e.f32707a.mo9708k(), new Object[0]));
            }
            this.f32861o.mo9743u0(C14456e.f32707a);
            this.f32861o.flush();
        }
    }

    /* renamed from: h */
    public final synchronized void m374h(boolean z, int i, Buffer buffer, int i2) {
        if (!this.f32859m) {
            m373i(i, z ? 1 : 0, buffer, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    public final void m373i(int i, int i2, Buffer buffer, int i3) {
        m372l(i, i3, 0, i2);
        if (i3 > 0) {
            BufferedSink bufferedSink = this.f32861o;
            C9971q.m14636d(buffer);
            bufferedSink.mo392K(buffer, i3);
        }
    }

    /* renamed from: l */
    public final void m372l(int i, int i2, int i3, int i4) {
        boolean z;
        Logger logger = f32855q;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C14456e.f32711e.m541c(false, i, i2, i3, i4));
        }
        boolean z2 = true;
        if (i2 <= this.f32858l) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((((int) 2147483648L) & i) != 0) {
                z2 = false;
            }
            if (z2) {
                C12729c.m5618Y(this.f32861o, i2);
                this.f32861o.writeByte(i3 & 255);
                this.f32861o.writeByte(i4 & 255);
                this.f32861o.writeInt(i & ViewDefaults.NUMBER_OF_LINES);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f32858l + ": " + i2).toString());
    }

    /* renamed from: n */
    public final synchronized void m371n(int i, EnumC14449b errorCode, byte[] debugData) {
        boolean z;
        C9971q.m14633g(errorCode, "errorCode");
        C9971q.m14633g(debugData, "debugData");
        if (!this.f32859m) {
            boolean z2 = false;
            if (errorCode.m576a() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m372l(0, debugData.length + 8, 7, 0);
                this.f32861o.writeInt(i);
                this.f32861o.writeInt(errorCode.m576a());
                if (debugData.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.f32861o.write(debugData);
                }
                this.f32861o.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: p */
    public final synchronized void m370p(boolean z, int i, List<C14451c> headerBlock) {
        int i2;
        C9971q.m14633g(headerBlock, "headerBlock");
        if (!this.f32859m) {
            this.f32860n.m545g(headerBlock);
            long size = this.f32857k.size();
            long min = Math.min(this.f32858l, size);
            int i3 = (size > min ? 1 : (size == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            m372l(i, (int) min, 1, i2);
            this.f32861o.mo392K(this.f32857k, min);
            if (i3 > 0) {
                m377Q(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: r */
    public final int m369r() {
        return this.f32858l;
    }

    /* renamed from: s */
    public final synchronized void m368s(boolean z, int i, int i2) {
        int i3;
        if (!this.f32859m) {
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            m372l(0, 8, 6, i3);
            this.f32861o.writeInt(i);
            this.f32861o.writeInt(i2);
            this.f32861o.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: t */
    public final synchronized void m367t(int i, int i2, List<C14451c> requestHeaders) {
        int i3;
        C9971q.m14633g(requestHeaders, "requestHeaders");
        if (!this.f32859m) {
            this.f32860n.m545g(requestHeaders);
            long size = this.f32857k.size();
            int min = (int) Math.min(this.f32858l - 4, size);
            int i4 = min + 4;
            long j = min;
            int i5 = (size > j ? 1 : (size == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            m372l(i, i4, 5, i3);
            this.f32861o.writeInt(i2 & ViewDefaults.NUMBER_OF_LINES);
            this.f32861o.mo392K(this.f32857k, j);
            if (i5 > 0) {
                m377Q(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: z */
    public final synchronized void m366z(int i, EnumC14449b errorCode) {
        boolean z;
        C9971q.m14633g(errorCode, "errorCode");
        if (!this.f32859m) {
            if (errorCode.m576a() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m372l(i, 4, 3, 0);
                this.f32861o.writeInt(errorCode.m576a());
                this.f32861o.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
