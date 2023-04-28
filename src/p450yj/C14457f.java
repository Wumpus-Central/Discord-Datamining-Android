package p450yj;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p015ak.C1457k;
import p163j$.util.Spliterator;
import p327rj.C12729c;
import p373uj.AbstractC13366a;
import p373uj.C13368c;
import p373uj.C13369d;
import p373uj.C13370e;
import p450yj.C14477h;

@Metadata(m15074d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 º\u00012\u00020\u0001:\u0007»\u0001¼\u0001½\u0001\fB\u0015\b\u0000\u0012\b\u0010·\u0001\u001a\u00030¶\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0014J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010%\u001a\u00020!J\b\u00100\u001a\u00020\rH\u0016J)\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b4\u00105J\u001c\u00109\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u000207H\u0007J\u000e\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0014J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b@\u0010AJ-\u0010C\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bC\u0010DJ/\u0010G\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bI\u0010$R\u001a\u0010N\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\"\u0010g\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010b\u001a\u0004\bi\u0010d\"\u0004\bj\u0010fR\u0016\u0010m\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010KR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010rR\u0014\u0010w\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010rR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010~\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0018\u0010\u0082\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0084\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010}R\u0018\u0010\u0086\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010}R\u0018\u0010\u0088\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010}R\u001d\u0010\u008e\u0001\u001a\u00030\u0089\u00018\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0093\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u008b\u0001\u001a\u0006\b\u0090\u0001\u0010\u008d\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u0098\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010}\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009b\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010}\u001a\u0006\b\u009a\u0001\u0010\u0097\u0001R)\u0010\u009e\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010}\u001a\u0006\b\u009d\u0001\u0010\u0097\u0001R)\u0010¡\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010}\u001a\u0006\b \u0001\u0010\u0097\u0001R\u001f\u0010¦\u0001\u001a\u00030¢\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bb\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010«\u0001\u001a\u00030§\u00018\u0006¢\u0006\u000f\n\u0005\b}\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010±\u0001\u001a\u00070¬\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001e\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001¨\u0006¾\u0001"}, m15073d2 = {"Lyj/f;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lyj/c;", "requestHeaders", "", "out", "Lyj/i;", "O0", "Ljava/io/IOException;", "e", "", "f0", "id", "J0", "streamId", "V0", "(I)Lyj/i;", "", "read", "c1", "(J)V", "P0", "outFinished", "alternating", "e1", "(IZLjava/util/List;)V", "Lokio/Buffer;", "buffer", "byteCount", "d1", "Lyj/b;", "errorCode", "h1", "(ILyj/b;)V", "statusCode", "g1", "unacknowledgedBytesRead", "i1", "(IJ)V", "reply", "payload1", "payload2", "f1", "flush", "Z0", "close", "connectionCode", "streamCode", "cause", "b0", "(Lyj/b;Lyj/b;Ljava/io/IOException;)V", "sendConnectionPreface", "Luj/e;", "taskRunner", "a1", "nowNs", "N0", "W0", "()V", "U0", "(I)Z", "S0", "(ILjava/util/List;)V", "inFinished", "R0", "(ILjava/util/List;Z)V", "Lokio/BufferedSource;", "source", "Q0", "(ILokio/BufferedSource;IZ)V", "T0", "k", "Z", "j0", "()Z", "client", "Lyj/f$d;", "l", "Lyj/f$d;", "F0", "()Lyj/f$d;", "listener", "", "m", "Ljava/util/Map;", "K0", "()Ljava/util/Map;", "streams", "", "n", "Ljava/lang/String;", "w0", "()Ljava/lang/String;", "connectionName", "o", "I", "z0", "()I", "X0", "(I)V", "lastGoodStreamId", "p", "G0", "setNextStreamId$okhttp", "nextStreamId", "q", "isShutdown", "r", "Luj/e;", "Luj/d;", "s", "Luj/d;", "writerQueue", "t", "pushQueue", "u", "settingsListenerQueue", "Lyj/l;", "v", "Lyj/l;", "pushObserver", "w", "J", "intervalPingsSent", "x", "intervalPongsReceived", "y", "degradedPingsSent", "z", "degradedPongsReceived", "A", "awaitPongsReceived", "B", "degradedPongDeadlineNs", "Lyj/m;", "C", "Lyj/m;", "H0", "()Lyj/m;", "okHttpSettings", "D", "I0", "Y0", "(Lyj/m;)V", "peerSettings", "<set-?>", "E", "getReadBytesTotal", "()J", "readBytesTotal", "F", "getReadBytesAcknowledged", "readBytesAcknowledged", "G", "getWriteBytesTotal", "writeBytesTotal", "H", "L0", "writeBytesMaximum", "Ljava/net/Socket;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lyj/j;", "Lyj/j;", "M0", "()Lyj/j;", "writer", "Lyj/f$e;", "K", "Lyj/f$e;", "getReaderRunnable", "()Lyj/f$e;", "readerRunnable", "", "L", "Ljava/util/Set;", "currentPushRequests", "Lyj/f$b;", "builder", "<init>", "(Lyj/f$b;)V", "N", "b", "c", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.f */
/* loaded from: classes8.dex */
public final class C14457f implements Closeable {

    /* renamed from: M */
    private static final C14492m f39496M;

    /* renamed from: N */
    public static final C14460c f39497N = new C14460c(null);

    /* renamed from: A */
    private long f39498A;

    /* renamed from: B */
    private long f39499B;

    /* renamed from: C */
    private final C14492m f39500C;

    /* renamed from: D */
    private C14492m f39501D;

    /* renamed from: E */
    private long f39502E;

    /* renamed from: F */
    private long f39503F;

    /* renamed from: G */
    private long f39504G;

    /* renamed from: H */
    private long f39505H;

    /* renamed from: I */
    private final Socket f39506I;

    /* renamed from: J */
    private final C14486j f39507J;

    /* renamed from: K */
    private final C14464e f39508K;

    /* renamed from: L */
    private final Set<Integer> f39509L;

    /* renamed from: k */
    private final boolean f32712k;

    /* renamed from: l */
    private final AbstractC14461d f32713l;

    /* renamed from: m */
    private final Map<Integer, C14481i> f32714m = new LinkedHashMap();

    /* renamed from: n */
    private final String f32715n;

    /* renamed from: o */
    private int f32716o;

    /* renamed from: p */
    private int f32717p;

    /* renamed from: q */
    private boolean f32718q;

    /* renamed from: r */
    private final C13370e f32719r;

    /* renamed from: s */
    private final C13369d f32720s;

    /* renamed from: t */
    private final C13369d f32721t;

    /* renamed from: u */
    private final C13369d f32722u;

    /* renamed from: v */
    private final AbstractC14490l f32723v;

    /* renamed from: w */
    private long f32724w;

    /* renamed from: x */
    private long f32725x;

    /* renamed from: y */
    private long f32726y;

    /* renamed from: z */
    private long f32727z;

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"yj/f$a", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$a */
    /* loaded from: classes8.dex */
    public static final class C14458a extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32728e;

        /* renamed from: f */
        final /* synthetic */ C14457f f32729f;

        /* renamed from: g */
        final /* synthetic */ long f32730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14458a(String str, String str2, C14457f fVar, long j) {
            super(str2, false, 2, null);
            this.f32728e = str;
            this.f32729f = fVar;
            this.f32730g = j;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            boolean z;
            synchronized (this.f32729f) {
                if (this.f32729f.f32725x < this.f32729f.f32724w) {
                    z = true;
                } else {
                    this.f32729f.f32724w++;
                    z = false;
                }
            }
            if (z) {
                this.f32729f.m505f0(null);
                return -1L;
            }
            this.f32729f.m504f1(false, 1, 0);
            return this.f32730g;
        }
    }

    @Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010?\u001a\u00020:\u0012\u0006\u0010D\u001a\u00020@¢\u0006\u0004\bE\u0010FJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b$\u0010,\"\u0004\b-\u0010.R\"\u00105\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b*\u00107\"\u0004\b8\u00109R\"\u0010?\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010;\u001a\u0004\b\u0018\u0010<\"\u0004\b=\u0010>R\u001a\u0010D\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bB\u0010C¨\u0006G"}, m15073d2 = {"Lyj/f$b;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "m", "Lyj/f$d;", "listener", "k", "", "pingIntervalMillis", "l", "Lyj/f;", "a", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "connectionName", "Lokio/BufferedSource;", "i", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "d", "Lokio/BufferedSink;", "g", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "e", "Lyj/f$d;", "()Lyj/f$d;", "setListener$okhttp", "(Lyj/f$d;)V", "Lyj/l;", "f", "Lyj/l;", "()Lyj/l;", "setPushObserver$okhttp", "(Lyj/l;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "", "Z", "()Z", "setClient$okhttp", "(Z)V", "client", "Luj/e;", "Luj/e;", "j", "()Luj/e;", "taskRunner", "<init>", "(ZLuj/e;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$b */
    /* loaded from: classes8.dex */
    public static final class C14459b {

        /* renamed from: a */
        public Socket f32731a;

        /* renamed from: b */
        public String f32732b;

        /* renamed from: c */
        public BufferedSource f32733c;

        /* renamed from: d */
        public BufferedSink f32734d;

        /* renamed from: e */
        private AbstractC14461d f32735e = AbstractC14461d.f32740a;

        /* renamed from: f */
        private AbstractC14490l f32736f = AbstractC14490l.f32870a;

        /* renamed from: g */
        private int f32737g;

        /* renamed from: h */
        private boolean f32738h;

        /* renamed from: i */
        private final C13370e f32739i;

        public C14459b(boolean z, C13370e taskRunner) {
            C9971q.m14633g(taskRunner, "taskRunner");
            this.f32738h = z;
            this.f32739i = taskRunner;
        }

        /* renamed from: a */
        public final C14457f m487a() {
            return new C14457f(this);
        }

        /* renamed from: b */
        public final boolean m486b() {
            return this.f32738h;
        }

        /* renamed from: c */
        public final String m485c() {
            String str = this.f32732b;
            if (str == null) {
                C9971q.m14615y("connectionName");
            }
            return str;
        }

        /* renamed from: d */
        public final AbstractC14461d m484d() {
            return this.f32735e;
        }

        /* renamed from: e */
        public final int m483e() {
            return this.f32737g;
        }

        /* renamed from: f */
        public final AbstractC14490l m482f() {
            return this.f32736f;
        }

        /* renamed from: g */
        public final BufferedSink m481g() {
            BufferedSink bufferedSink = this.f32734d;
            if (bufferedSink == null) {
                C9971q.m14615y("sink");
            }
            return bufferedSink;
        }

        /* renamed from: h */
        public final Socket m480h() {
            Socket socket = this.f32731a;
            if (socket == null) {
                C9971q.m14615y("socket");
            }
            return socket;
        }

        /* renamed from: i */
        public final BufferedSource m479i() {
            BufferedSource bufferedSource = this.f32733c;
            if (bufferedSource == null) {
                C9971q.m14615y("source");
            }
            return bufferedSource;
        }

        /* renamed from: j */
        public final C13370e m478j() {
            return this.f32739i;
        }

        /* renamed from: k */
        public final C14459b m477k(AbstractC14461d listener) {
            C9971q.m14633g(listener, "listener");
            this.f32735e = listener;
            return this;
        }

        /* renamed from: l */
        public final C14459b m476l(int i) {
            this.f32737g = i;
            return this;
        }

        /* renamed from: m */
        public final C14459b m475m(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            C9971q.m14633g(socket, "socket");
            C9971q.m14633g(peerName, "peerName");
            C9971q.m14633g(source, "source");
            C9971q.m14633g(sink, "sink");
            this.f32731a = socket;
            if (this.f32738h) {
                str = C12729c.f28590i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            this.f32732b = str;
            this.f32733c = source;
            this.f32734d = sink;
            return this;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, m15073d2 = {"Lyj/f$c;", "", "Lyj/m;", "DEFAULT_SETTINGS", "Lyj/m;", "a", "()Lyj/m;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$c */
    /* loaded from: classes8.dex */
    public static final class C14460c {
        private C14460c() {
        }

        public /* synthetic */ C14460c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14492m m474a() {
            return C14457f.f39496M;
        }
    }

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, m15073d2 = {"Lyj/f$d;", "", "Lyj/i;", "stream", "", "b", "Lyj/f;", "connection", "Lyj/m;", "settings", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$d */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC14461d {

        /* renamed from: b */
        public static final C14463b f32741b = new C14463b(null);

        /* renamed from: a */
        public static final AbstractC14461d f32740a = new C14462a();

        @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"yj/f$d$a", "Lyj/f$d;", "Lyj/i;", "stream", "", "b", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.f$d$a */
        /* loaded from: classes8.dex */
        public static final class C14462a extends AbstractC14461d {
            C14462a() {
            }

            @Override // p450yj.C14457f.AbstractC14461d
            /* renamed from: b */
            public void mo472b(C14481i stream) {
                C9971q.m14633g(stream, "stream");
                stream.m415d(EnumC14449b.REFUSED_STREAM, null);
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lyj/f$d$b;", "", "Lyj/f$d;", "REFUSE_INCOMING_STREAMS", "Lyj/f$d;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.f$d$b */
        /* loaded from: classes8.dex */
        public static final class C14463b {
            private C14463b() {
            }

            public /* synthetic */ C14463b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public void mo473a(C14457f connection, C14492m settings) {
            C9971q.m14633g(connection, "connection");
            C9971q.m14633g(settings, "settings");
        }

        /* renamed from: b */
        public abstract void mo472b(C14481i iVar);
    }

    @Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00103J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m15073d2 = {"Lyj/f$e;", "Lyj/h$c;", "Lkotlin/Function0;", "", "n", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "i", "associatedStreamId", "", "Lyj/c;", "headerBlock", "a", "Lyj/b;", "errorCode", "c", "clearPrevious", "Lyj/m;", "settings", "l", "m", "g", "ack", "payload1", "payload2", "j", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "e", "", "windowSizeIncrement", "b", "streamDependency", "weight", "exclusive", "k", "promisedStreamId", "requestHeaders", "d", "Lyj/h;", "Lyj/h;", "getReader$okhttp", "()Lyj/h;", "reader", "<init>", "(Lyj/f;Lyj/h;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$e */
    /* loaded from: classes8.dex */
    public final class C14464e implements C14477h.AbstractC14480c, Function0<Unit> {

        /* renamed from: k */
        private final C14477h f32742k;

        /* renamed from: l */
        final /* synthetic */ C14457f f32743l;

        @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m15073d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Luj/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.f$e$a */
        /* loaded from: classes8.dex */
        public static final class C14465a extends AbstractC13366a {

            /* renamed from: e */
            final /* synthetic */ String f32744e;

            /* renamed from: f */
            final /* synthetic */ boolean f32745f;

            /* renamed from: g */
            final /* synthetic */ C14464e f32746g;

            /* renamed from: h */
            final /* synthetic */ Ref$ObjectRef f32747h;

            /* renamed from: i */
            final /* synthetic */ boolean f32748i;

            /* renamed from: j */
            final /* synthetic */ C14492m f32749j;

            /* renamed from: k */
            final /* synthetic */ Ref$LongRef f32750k;

            /* renamed from: l */
            final /* synthetic */ Ref$ObjectRef f32751l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14465a(String str, boolean z, String str2, boolean z2, C14464e eVar, Ref$ObjectRef ref$ObjectRef, boolean z3, C14492m mVar, Ref$LongRef ref$LongRef, Ref$ObjectRef ref$ObjectRef2) {
                super(str2, z2);
                this.f32744e = str;
                this.f32745f = z;
                this.f32746g = eVar;
                this.f32747h = ref$ObjectRef;
                this.f32748i = z3;
                this.f32749j = mVar;
                this.f32750k = ref$LongRef;
                this.f32751l = ref$ObjectRef2;
            }

            @Override // p373uj.AbstractC13366a
            /* renamed from: f */
            public long mo469f() {
                this.f32746g.f32743l.m539F0().mo473a(this.f32746g.f32743l, (C14492m) this.f32747h.f22069k);
                return -1L;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m15073d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Luj/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.f$e$b */
        /* loaded from: classes8.dex */
        public static final class C14466b extends AbstractC13366a {

            /* renamed from: e */
            final /* synthetic */ String f32752e;

            /* renamed from: f */
            final /* synthetic */ boolean f32753f;

            /* renamed from: g */
            final /* synthetic */ C14481i f32754g;

            /* renamed from: h */
            final /* synthetic */ C14464e f32755h;

            /* renamed from: i */
            final /* synthetic */ C14481i f32756i;

            /* renamed from: j */
            final /* synthetic */ int f32757j;

            /* renamed from: k */
            final /* synthetic */ List f32758k;

            /* renamed from: l */
            final /* synthetic */ boolean f32759l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14466b(String str, boolean z, String str2, boolean z2, C14481i iVar, C14464e eVar, C14481i iVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f32752e = str;
                this.f32753f = z;
                this.f32754g = iVar;
                this.f32755h = eVar;
                this.f32756i = iVar2;
                this.f32757j = i;
                this.f32758k = list;
                this.f32759l = z3;
            }

            @Override // p373uj.AbstractC13366a
            /* renamed from: f */
            public long mo469f() {
                try {
                    this.f32755h.f32743l.m539F0().mo472b(this.f32754g);
                    return -1L;
                } catch (IOException e) {
                    C1457k g = C1457k.f517c.m41079g();
                    g.m41091k("Http2Connection.Listener failure for " + this.f32755h.f32743l.m490w0(), 4, e);
                    try {
                        this.f32754g.m415d(EnumC14449b.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.f$e$c */
        /* loaded from: classes8.dex */
        public static final class C14467c extends AbstractC13366a {

            /* renamed from: e */
            final /* synthetic */ String f32760e;

            /* renamed from: f */
            final /* synthetic */ boolean f32761f;

            /* renamed from: g */
            final /* synthetic */ C14464e f32762g;

            /* renamed from: h */
            final /* synthetic */ int f32763h;

            /* renamed from: i */
            final /* synthetic */ int f32764i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14467c(String str, boolean z, String str2, boolean z2, C14464e eVar, int i, int i2) {
                super(str2, z2);
                this.f32760e = str;
                this.f32761f = z;
                this.f32762g = eVar;
                this.f32763h = i;
                this.f32764i = i2;
            }

            @Override // p373uj.AbstractC13366a
            /* renamed from: f */
            public long mo469f() {
                this.f32762g.f32743l.m504f1(true, this.f32763h, this.f32764i);
                return -1L;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.f$e$d */
        /* loaded from: classes8.dex */
        public static final class C14468d extends AbstractC13366a {

            /* renamed from: e */
            final /* synthetic */ String f32765e;

            /* renamed from: f */
            final /* synthetic */ boolean f32766f;

            /* renamed from: g */
            final /* synthetic */ C14464e f32767g;

            /* renamed from: h */
            final /* synthetic */ boolean f32768h;

            /* renamed from: i */
            final /* synthetic */ C14492m f32769i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14468d(String str, boolean z, String str2, boolean z2, C14464e eVar, boolean z3, C14492m mVar) {
                super(str2, z2);
                this.f32765e = str;
                this.f32766f = z;
                this.f32767g = eVar;
                this.f32768h = z3;
                this.f32769i = mVar;
            }

            @Override // p373uj.AbstractC13366a
            /* renamed from: f */
            public long mo469f() {
                this.f32767g.m471m(this.f32768h, this.f32769i);
                return -1L;
            }
        }

        public C14464e(C14457f fVar, C14477h reader) {
            C9971q.m14633g(reader, "reader");
            this.f32743l = fVar;
            this.f32742k = reader;
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: a */
        public void mo433a(boolean z, int i, int i2, List<C14451c> headerBlock) {
            C9971q.m14633g(headerBlock, "headerBlock");
            if (this.f32743l.m519U0(i)) {
                this.f32743l.m524R0(i, headerBlock, z);
                return;
            }
            synchronized (this.f32743l) {
                C14481i J0 = this.f32743l.m534J0(i);
                if (J0 != null) {
                    Unit unit = Unit.f22042a;
                    J0.m395x(C12729c.m5630M(headerBlock), z);
                } else if (!this.f32743l.f32718q) {
                    if (i > this.f32743l.m488z0()) {
                        if (i % 2 != this.f32743l.m538G0() % 2) {
                            C14481i iVar = new C14481i(i, this.f32743l, false, z, C12729c.m5630M(headerBlock));
                            this.f32743l.m516X0(i);
                            this.f32743l.m533K0().put(Integer.valueOf(i), iVar);
                            String str = this.f32743l.m490w0() + '[' + i + "] onStream";
                            this.f32743l.f32719r.m3816i().m3830i(new C14466b(str, true, str, true, iVar, this, J0, i, headerBlock, z), 0L);
                        }
                    }
                }
            }
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: b */
        public void mo432b(int i, long j) {
            if (i == 0) {
                synchronized (this.f32743l) {
                    C14457f fVar = this.f32743l;
                    fVar.f39505H = fVar.m532L0() + j;
                    C14457f fVar2 = this.f32743l;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        Unit unit = Unit.f22042a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            C14481i J0 = this.f32743l.m534J0(i);
            if (J0 != null) {
                synchronized (J0) {
                    J0.m418a(j);
                    Unit unit2 = Unit.f22042a;
                }
            }
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: c */
        public void mo431c(int i, EnumC14449b errorCode) {
            C9971q.m14633g(errorCode, "errorCode");
            if (this.f32743l.m519U0(i)) {
                this.f32743l.m521T0(i, errorCode);
                return;
            }
            C14481i V0 = this.f32743l.m518V0(i);
            if (V0 != null) {
                V0.m394y(errorCode);
            }
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: d */
        public void mo430d(int i, int i2, List<C14451c> requestHeaders) {
            C9971q.m14633g(requestHeaders, "requestHeaders");
            this.f32743l.m522S0(i2, requestHeaders);
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: e */
        public void mo429e(int i, EnumC14449b errorCode, ByteString debugData) {
            int i2;
            C14481i[] iVarArr;
            C9971q.m14633g(errorCode, "errorCode");
            C9971q.m14633g(debugData, "debugData");
            debugData.m9697v();
            synchronized (this.f32743l) {
                Object[] array = this.f32743l.m533K0().values().toArray(new C14481i[0]);
                if (array != null) {
                    iVarArr = (C14481i[]) array;
                    this.f32743l.f32718q = true;
                    Unit unit = Unit.f22042a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C14481i iVar : iVarArr) {
                if (iVar.m409j() > i && iVar.m399t()) {
                    iVar.m394y(EnumC14449b.REFUSED_STREAM);
                    this.f32743l.m518V0(iVar.m409j());
                }
            }
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: g */
        public void mo428g() {
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: i */
        public void mo427i(boolean z, int i, BufferedSource source, int i2) {
            C9971q.m14633g(source, "source");
            if (this.f32743l.m519U0(i)) {
                this.f32743l.m526Q0(i, source, i2, z);
                return;
            }
            C14481i J0 = this.f32743l.m534J0(i);
            if (J0 == null) {
                this.f32743l.m500h1(i, EnumC14449b.PROTOCOL_ERROR);
                long j = i2;
                this.f32743l.m508c1(j);
                source.skip(j);
                return;
            }
            J0.m396w(source, i2);
            if (z) {
                J0.m395x(C12729c.f28583b, true);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m470n();
            return Unit.f22042a;
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: j */
        public void mo426j(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f32743l) {
                    if (i == 1) {
                        this.f32743l.f32725x++;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.f32743l.f39498A++;
                            C14457f fVar = this.f32743l;
                            if (fVar != null) {
                                fVar.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        Unit unit = Unit.f22042a;
                    } else {
                        this.f32743l.f32727z++;
                    }
                }
                return;
            }
            String str = this.f32743l.m490w0() + " ping";
            this.f32743l.f32720s.m3830i(new C14467c(str, true, str, true, this, i, i2), 0L);
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: k */
        public void mo425k(int i, int i2, int i3, boolean z) {
        }

        @Override // p450yj.C14477h.AbstractC14480c
        /* renamed from: l */
        public void mo424l(boolean z, C14492m settings) {
            C9971q.m14633g(settings, "settings");
            String str = this.f32743l.m490w0() + " applyAndAckSettings";
            this.f32743l.f32720s.m3830i(new C14468d(str, true, str, true, this, z, settings), 0L);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:51|6|(1:8)(1:9)|10|(2:15|(10:17|21|22|49|23|24|52|25|28|29)(2:18|19))|20|21|22|49|23|24|52|25|28|29) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
            r21.f32743l.m505f0(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, yj.m] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Unknown variable types count: 1 */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m471m(boolean r22, p450yj.C14492m r23) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p450yj.C14457f.C14464e.m471m(boolean, yj.m):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [yj.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [yj.h, java.io.Closeable] */
        /* renamed from: n */
        public void m470n() {
            Throwable th2;
            EnumC14449b bVar;
            EnumC14449b bVar2 = EnumC14449b.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f32742k.m451h(this);
                    while (this.f32742k.m452g(false, this)) {
                    }
                    EnumC14449b bVar3 = EnumC14449b.NO_ERROR;
                    try {
                        this.f32743l.m510b0(bVar3, EnumC14449b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e2) {
                        e = e2;
                        EnumC14449b bVar4 = EnumC14449b.PROTOCOL_ERROR;
                        C14457f fVar = this.f32743l;
                        fVar.m510b0(bVar4, bVar4, e);
                        bVar = fVar;
                        bVar2 = this.f32742k;
                        C12729c.m5608j(bVar2);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f32743l.m510b0(bVar, bVar2, e);
                    C12729c.m5608j(this.f32742k);
                    throw th2;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th2 = th4;
                bVar = bVar2;
                this.f32743l.m510b0(bVar, bVar2, e);
                C12729c.m5608j(this.f32742k);
                throw th2;
            }
            bVar2 = this.f32742k;
            C12729c.m5608j(bVar2);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$f */
    /* loaded from: classes8.dex */
    public static final class C0472f extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32770e;

        /* renamed from: f */
        final /* synthetic */ boolean f32771f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32772g;

        /* renamed from: h */
        final /* synthetic */ int f32773h;

        /* renamed from: i */
        final /* synthetic */ Buffer f32774i;

        /* renamed from: j */
        final /* synthetic */ int f32775j;

        /* renamed from: k */
        final /* synthetic */ boolean f32776k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0472f(String str, boolean z, String str2, boolean z2, C14457f fVar, int i, Buffer buffer, int i2, boolean z3) {
            super(str2, z2);
            this.f32770e = str;
            this.f32771f = z;
            this.f32772g = fVar;
            this.f32773h = i;
            this.f32774i = buffer;
            this.f32775j = i2;
            this.f32776k = z3;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            try {
                boolean d = this.f32772g.f32723v.mo355d(this.f32773h, this.f32774i, this.f32775j, this.f32776k);
                if (d) {
                    this.f32772g.m531M0().m366z(this.f32773h, EnumC14449b.CANCEL);
                }
                if (!d && !this.f32776k) {
                    return -1L;
                }
                synchronized (this.f32772g) {
                    this.f32772g.f39509L.remove(Integer.valueOf(this.f32773h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$g */
    /* loaded from: classes8.dex */
    public static final class C14469g extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32777e;

        /* renamed from: f */
        final /* synthetic */ boolean f32778f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32779g;

        /* renamed from: h */
        final /* synthetic */ int f32780h;

        /* renamed from: i */
        final /* synthetic */ List f32781i;

        /* renamed from: j */
        final /* synthetic */ boolean f32782j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14469g(String str, boolean z, String str2, boolean z2, C14457f fVar, int i, List list, boolean z3) {
            super(str2, z2);
            this.f32777e = str;
            this.f32778f = z;
            this.f32779g = fVar;
            this.f32780h = i;
            this.f32781i = list;
            this.f32782j = z3;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            boolean b = this.f32779g.f32723v.mo357b(this.f32780h, this.f32781i, this.f32782j);
            if (b) {
                try {
                    this.f32779g.m531M0().m366z(this.f32780h, EnumC14449b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!b && !this.f32782j) {
                return -1L;
            }
            synchronized (this.f32779g) {
                this.f32779g.f39509L.remove(Integer.valueOf(this.f32780h));
            }
            return -1L;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$h */
    /* loaded from: classes8.dex */
    public static final class C14470h extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32783e;

        /* renamed from: f */
        final /* synthetic */ boolean f32784f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32785g;

        /* renamed from: h */
        final /* synthetic */ int f32786h;

        /* renamed from: i */
        final /* synthetic */ List f32787i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14470h(String str, boolean z, String str2, boolean z2, C14457f fVar, int i, List list) {
            super(str2, z2);
            this.f32783e = str;
            this.f32784f = z;
            this.f32785g = fVar;
            this.f32786h = i;
            this.f32787i = list;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            if (!this.f32785g.f32723v.mo358a(this.f32786h, this.f32787i)) {
                return -1L;
            }
            try {
                this.f32785g.m531M0().m366z(this.f32786h, EnumC14449b.CANCEL);
                synchronized (this.f32785g) {
                    this.f32785g.f39509L.remove(Integer.valueOf(this.f32786h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$i */
    /* loaded from: classes8.dex */
    public static final class C14471i extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32788e;

        /* renamed from: f */
        final /* synthetic */ boolean f32789f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32790g;

        /* renamed from: h */
        final /* synthetic */ int f32791h;

        /* renamed from: i */
        final /* synthetic */ EnumC14449b f32792i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14471i(String str, boolean z, String str2, boolean z2, C14457f fVar, int i, EnumC14449b bVar) {
            super(str2, z2);
            this.f32788e = str;
            this.f32789f = z;
            this.f32790g = fVar;
            this.f32791h = i;
            this.f32792i = bVar;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            this.f32790g.f32723v.mo356c(this.f32791h, this.f32792i);
            synchronized (this.f32790g) {
                this.f32790g.f39509L.remove(Integer.valueOf(this.f32791h));
                Unit unit = Unit.f22042a;
            }
            return -1L;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$j */
    /* loaded from: classes8.dex */
    public static final class C14472j extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32793e;

        /* renamed from: f */
        final /* synthetic */ boolean f32794f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32795g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14472j(String str, boolean z, String str2, boolean z2, C14457f fVar) {
            super(str2, z2);
            this.f32793e = str;
            this.f32794f = z;
            this.f32795g = fVar;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            this.f32795g.m504f1(false, 2, 0);
            return -1L;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$k */
    /* loaded from: classes8.dex */
    public static final class C14473k extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32796e;

        /* renamed from: f */
        final /* synthetic */ boolean f32797f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32798g;

        /* renamed from: h */
        final /* synthetic */ int f32799h;

        /* renamed from: i */
        final /* synthetic */ EnumC14449b f32800i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14473k(String str, boolean z, String str2, boolean z2, C14457f fVar, int i, EnumC14449b bVar) {
            super(str2, z2);
            this.f32796e = str;
            this.f32797f = z;
            this.f32798g = fVar;
            this.f32799h = i;
            this.f32800i = bVar;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            try {
                this.f32798g.m502g1(this.f32799h, this.f32800i);
                return -1L;
            } catch (IOException e) {
                this.f32798g.m505f0(e);
                return -1L;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m15073d2 = {"uj/c", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.f$l */
    /* loaded from: classes8.dex */
    public static final class C14474l extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f32801e;

        /* renamed from: f */
        final /* synthetic */ boolean f32802f;

        /* renamed from: g */
        final /* synthetic */ C14457f f32803g;

        /* renamed from: h */
        final /* synthetic */ int f32804h;

        /* renamed from: i */
        final /* synthetic */ long f32805i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14474l(String str, boolean z, String str2, boolean z2, C14457f fVar, int i, long j) {
            super(str2, z2);
            this.f32801e = str;
            this.f32802f = z;
            this.f32803g = fVar;
            this.f32804h = i;
            this.f32805i = j;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            try {
                this.f32803g.m531M0().m378H(this.f32804h, this.f32805i);
                return -1L;
            } catch (IOException e) {
                this.f32803g.m505f0(e);
                return -1L;
            }
        }
    }

    static {
        C14492m mVar = new C14492m();
        mVar.m347h(7, 65535);
        mVar.m347h(5, Spliterator.SUBSIZED);
        f39496M = mVar;
    }

    public C14457f(C14459b builder) {
        int i;
        C14492m mVar;
        C9971q.m14633g(builder, "builder");
        boolean b = builder.m486b();
        this.f32712k = b;
        this.f32713l = builder.m484d();
        String c = builder.m485c();
        this.f32715n = c;
        if (builder.m486b()) {
            i = 3;
        } else {
            i = 2;
        }
        this.f32717p = i;
        C13370e j = builder.m478j();
        this.f32719r = j;
        C13369d i2 = j.m3816i();
        this.f32720s = i2;
        this.f32721t = j.m3816i();
        this.f32722u = j.m3816i();
        this.f32723v = builder.m482f();
        C14492m mVar2 = new C14492m();
        if (builder.m486b()) {
            mVar2.m347h(7, 16777216);
        }
        Unit unit = Unit.f22042a;
        this.f39500C = mVar2;
        this.f39501D = f39496M;
        this.f39505H = mVar.m352c();
        this.f39506I = builder.m480h();
        this.f39507J = new C14486j(builder.m481g(), b);
        this.f39508K = new C14464e(this, new C14477h(builder.m479i(), b));
        this.f39509L = new LinkedHashSet();
        if (builder.m483e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m483e());
            String str = c + " ping";
            i2.m3830i(new C14458a(str, str, this, nanos), nanos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0006, B:23:0x0053, B:25:0x0056, B:26:0x005c, B:28:0x0061, B:33:0x006f, B:34:0x007a, B:5:0x0007, B:7:0x000e, B:8:0x0013, B:10:0x0017, B:12:0x002a, B:14:0x0032, B:19:0x0042, B:21:0x0048, B:22:0x0051, B:35:0x007b, B:36:0x0080), top: B:39:0x0006 }] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p450yj.C14481i m529O0(int r11, java.util.List<p450yj.C14451c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            yj.j r7 = r10.f39507J
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: all -> 0x0084
            int r0 = r10.f32717p     // Catch: all -> 0x0081
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            yj.b r0 = p450yj.EnumC14449b.REFUSED_STREAM     // Catch: all -> 0x0081
            r10.m513Z0(r0)     // Catch: all -> 0x0081
        L_0x0013:
            boolean r0 = r10.f32718q     // Catch: all -> 0x0081
            if (r0 != 0) goto L_0x007b
            int r8 = r10.f32717p     // Catch: all -> 0x0081
            int r0 = r8 + 2
            r10.f32717p = r0     // Catch: all -> 0x0081
            yj.i r9 = new yj.i     // Catch: all -> 0x0081
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: all -> 0x0081
            r0 = 1
            if (r13 == 0) goto L_0x0041
            long r1 = r10.f39504G     // Catch: all -> 0x0081
            long r3 = r10.f39505H     // Catch: all -> 0x0081
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            long r1 = r9.m401r()     // Catch: all -> 0x0081
            long r3 = r9.m402q()     // Catch: all -> 0x0081
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = r0
        L_0x0042:
            boolean r1 = r9.m398u()     // Catch: all -> 0x0081
            if (r1 == 0) goto L_0x0051
            java.util.Map<java.lang.Integer, yj.i> r1 = r10.f32714m     // Catch: all -> 0x0081
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: all -> 0x0081
            r1.put(r2, r9)     // Catch: all -> 0x0081
        L_0x0051:
            kotlin.Unit r1 = kotlin.Unit.f22042a     // Catch: all -> 0x0081
            monitor-exit(r10)     // Catch: all -> 0x0084
            if (r11 != 0) goto L_0x005c
            yj.j r11 = r10.f39507J     // Catch: all -> 0x0084
            r11.m370p(r6, r8, r12)     // Catch: all -> 0x0084
            goto L_0x0066
        L_0x005c:
            boolean r1 = r10.f32712k     // Catch: all -> 0x0084
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            yj.j r0 = r10.f39507J     // Catch: all -> 0x0084
            r0.m367t(r11, r8, r12)     // Catch: all -> 0x0084
        L_0x0066:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x006e
            yj.j r11 = r10.f39507J
            r11.flush()
        L_0x006e:
            return r9
        L_0x006f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: all -> 0x0084
            java.lang.String r11 = r11.toString()     // Catch: all -> 0x0084
            r12.<init>(r11)     // Catch: all -> 0x0084
            throw r12     // Catch: all -> 0x0084
        L_0x007b:
            yj.a r11 = new yj.a     // Catch: all -> 0x0081
            r11.<init>()     // Catch: all -> 0x0081
            throw r11     // Catch: all -> 0x0081
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)     // Catch: all -> 0x0084
            throw r11     // Catch: all -> 0x0084
        L_0x0084:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p450yj.C14457f.m529O0(int, java.util.List, boolean):yj.i");
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m509b1(C14457f fVar, boolean z, C13370e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            eVar = C13370e.f29933h;
        }
        fVar.m512a1(z, eVar);
    }

    /* renamed from: f0 */
    public final void m505f0(IOException iOException) {
        EnumC14449b bVar = EnumC14449b.PROTOCOL_ERROR;
        m510b0(bVar, bVar, iOException);
    }

    /* renamed from: F0 */
    public final AbstractC14461d m539F0() {
        return this.f32713l;
    }

    /* renamed from: G0 */
    public final int m538G0() {
        return this.f32717p;
    }

    /* renamed from: H0 */
    public final C14492m m536H0() {
        return this.f39500C;
    }

    /* renamed from: I0 */
    public final C14492m m535I0() {
        return this.f39501D;
    }

    /* renamed from: J0 */
    public final synchronized C14481i m534J0(int i) {
        return this.f32714m.get(Integer.valueOf(i));
    }

    /* renamed from: K0 */
    public final Map<Integer, C14481i> m533K0() {
        return this.f32714m;
    }

    /* renamed from: L0 */
    public final long m532L0() {
        return this.f39505H;
    }

    /* renamed from: M0 */
    public final C14486j m531M0() {
        return this.f39507J;
    }

    /* renamed from: N0 */
    public final synchronized boolean m530N0(long j) {
        if (this.f32718q) {
            return false;
        }
        if (this.f32727z < this.f32726y) {
            if (j >= this.f39499B) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public final C14481i m528P0(List<C14451c> requestHeaders, boolean z) {
        C9971q.m14633g(requestHeaders, "requestHeaders");
        return m529O0(0, requestHeaders, z);
    }

    /* renamed from: Q0 */
    public final void m526Q0(int i, BufferedSource source, int i2, boolean z) {
        C9971q.m14633g(source, "source");
        Buffer buffer = new Buffer();
        long j = i2;
        source.mo9735a0(j);
        source.read(buffer, j);
        String str = this.f32715n + '[' + i + "] onData";
        this.f32721t.m3830i(new C0472f(str, true, str, true, this, i, buffer, i2, z), 0L);
    }

    /* renamed from: R0 */
    public final void m524R0(int i, List<C14451c> requestHeaders, boolean z) {
        C9971q.m14633g(requestHeaders, "requestHeaders");
        String str = this.f32715n + '[' + i + "] onHeaders";
        this.f32721t.m3830i(new C14469g(str, true, str, true, this, i, requestHeaders, z), 0L);
    }

    /* renamed from: S0 */
    public final void m522S0(int i, List<C14451c> requestHeaders) {
        C9971q.m14633g(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f39509L.contains(Integer.valueOf(i))) {
                m500h1(i, EnumC14449b.PROTOCOL_ERROR);
                return;
            }
            this.f39509L.add(Integer.valueOf(i));
            String str = this.f32715n + '[' + i + "] onRequest";
            this.f32721t.m3830i(new C14470h(str, true, str, true, this, i, requestHeaders), 0L);
        }
    }

    /* renamed from: T0 */
    public final void m521T0(int i, EnumC14449b errorCode) {
        C9971q.m14633g(errorCode, "errorCode");
        String str = this.f32715n + '[' + i + "] onReset";
        this.f32721t.m3830i(new C14471i(str, true, str, true, this, i, errorCode), 0L);
    }

    /* renamed from: U0 */
    public final boolean m519U0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: V0 */
    public final synchronized C14481i m518V0(int i) {
        C14481i remove;
        remove = this.f32714m.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: W0 */
    public final void m517W0() {
        synchronized (this) {
            long j = this.f32727z;
            long j2 = this.f32726y;
            if (j >= j2) {
                this.f32726y = j2 + 1;
                this.f39499B = System.nanoTime() + 1000000000;
                Unit unit = Unit.f22042a;
                String str = this.f32715n + " ping";
                this.f32720s.m3830i(new C14472j(str, true, str, true, this), 0L);
            }
        }
    }

    /* renamed from: X0 */
    public final void m516X0(int i) {
        this.f32716o = i;
    }

    /* renamed from: Y0 */
    public final void m514Y0(C14492m mVar) {
        C9971q.m14633g(mVar, "<set-?>");
        this.f39501D = mVar;
    }

    /* renamed from: Z0 */
    public final void m513Z0(EnumC14449b statusCode) {
        C9971q.m14633g(statusCode, "statusCode");
        synchronized (this.f39507J) {
            synchronized (this) {
                if (!this.f32718q) {
                    this.f32718q = true;
                    int i = this.f32716o;
                    Unit unit = Unit.f22042a;
                    this.f39507J.m371n(i, statusCode, C12729c.f28582a);
                }
            }
        }
    }

    /* renamed from: a1 */
    public final void m512a1(boolean z, C13370e taskRunner) {
        C9971q.m14633g(taskRunner, "taskRunner");
        if (z) {
            this.f39507J.m375g();
            this.f39507J.m379C(this.f39500C);
            int c = this.f39500C.m352c();
            if (c != 65535) {
                this.f39507J.m378H(0, c - 65535);
            }
        }
        C13369d i = taskRunner.m3816i();
        String str = this.f32715n;
        i.m3830i(new C13368c(this.f39508K, str, true, str, true), 0L);
    }

    /* renamed from: b0 */
    public final void m510b0(EnumC14449b connectionCode, EnumC14449b streamCode, IOException iOException) {
        int i;
        C14481i[] iVarArr;
        C9971q.m14633g(connectionCode, "connectionCode");
        C9971q.m14633g(streamCode, "streamCode");
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            try {
                m513Z0(connectionCode);
            } catch (IOException unused) {
            }
            synchronized (this) {
                if (!this.f32714m.isEmpty()) {
                    Object[] array = this.f32714m.values().toArray(new C14481i[0]);
                    if (array != null) {
                        iVarArr = (C14481i[]) array;
                        this.f32714m.clear();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    iVarArr = null;
                }
                Unit unit = Unit.f22042a;
            }
            if (iVarArr != null) {
                for (C14481i iVar : iVarArr) {
                    try {
                        iVar.m415d(streamCode, iOException);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.f39507J.close();
            } catch (IOException unused3) {
            }
            try {
                this.f39506I.close();
            } catch (IOException unused4) {
            }
            this.f32720s.m3825n();
            this.f32721t.m3825n();
            this.f32722u.m3825n();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: c1 */
    public final synchronized void m508c1(long j) {
        long j2 = this.f39502E + j;
        this.f39502E = j2;
        long j3 = j2 - this.f39503F;
        if (j3 >= this.f39500C.m352c() / 2) {
            m498i1(0, j3);
            this.f39503F += j3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m510b0(EnumC14449b.NO_ERROR, EnumC14449b.CANCEL, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f39507J.m369r());
        r6 = r2;
        r8.f39504G += r6;
        r4 = kotlin.Unit.f22042a;
     */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m507d1(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            yj.j r12 = r8.f39507J
            r12.m374h(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f39504G     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            long r6 = r8.f39505H     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, yj.i> r2 = r8.f32714m     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            boolean r2 = r2.containsKey(r4)     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: all -> 0x005b, InterruptedException -> 0x005d
            throw r9     // Catch: all -> 0x005b, InterruptedException -> 0x005d
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: all -> 0x005b
            int r2 = (int) r4     // Catch: all -> 0x005b
            yj.j r4 = r8.f39507J     // Catch: all -> 0x005b
            int r4 = r4.m369r()     // Catch: all -> 0x005b
            int r2 = java.lang.Math.min(r2, r4)     // Catch: all -> 0x005b
            long r4 = r8.f39504G     // Catch: all -> 0x005b
            long r6 = (long) r2     // Catch: all -> 0x005b
            long r4 = r4 + r6
            r8.f39504G = r4     // Catch: all -> 0x005b
            kotlin.Unit r4 = kotlin.Unit.f22042a     // Catch: all -> 0x005b
            monitor-exit(r8)
            long r12 = r12 - r6
            yj.j r4 = r8.f39507J
            if (r10 == 0) goto L_0x0056
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            r4.m374h(r5, r9, r11, r2)
            goto L_0x000d
        L_0x005b:
            r9 = move-exception
            goto L_0x006a
        L_0x005d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: all -> 0x005b
            r9.interrupt()     // Catch: all -> 0x005b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: all -> 0x005b
            r9.<init>()     // Catch: all -> 0x005b
            throw r9     // Catch: all -> 0x005b
        L_0x006a:
            monitor-exit(r8)
            throw r9
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p450yj.C14457f.m507d1(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: e1 */
    public final void m506e1(int i, boolean z, List<C14451c> alternating) {
        C9971q.m14633g(alternating, "alternating");
        this.f39507J.m370p(z, i, alternating);
    }

    /* renamed from: f1 */
    public final void m504f1(boolean z, int i, int i2) {
        try {
            this.f39507J.m368s(z, i, i2);
        } catch (IOException e) {
            m505f0(e);
        }
    }

    public final void flush() {
        this.f39507J.flush();
    }

    /* renamed from: g1 */
    public final void m502g1(int i, EnumC14449b statusCode) {
        C9971q.m14633g(statusCode, "statusCode");
        this.f39507J.m366z(i, statusCode);
    }

    /* renamed from: h1 */
    public final void m500h1(int i, EnumC14449b errorCode) {
        C9971q.m14633g(errorCode, "errorCode");
        String str = this.f32715n + '[' + i + "] writeSynReset";
        this.f32720s.m3830i(new C14473k(str, true, str, true, this, i, errorCode), 0L);
    }

    /* renamed from: i1 */
    public final void m498i1(int i, long j) {
        String str = this.f32715n + '[' + i + "] windowUpdate";
        this.f32720s.m3830i(new C14474l(str, true, str, true, this, i, j), 0L);
    }

    /* renamed from: j0 */
    public final boolean m497j0() {
        return this.f32712k;
    }

    /* renamed from: w0 */
    public final String m490w0() {
        return this.f32715n;
    }

    /* renamed from: z0 */
    public final int m488z0() {
        return this.f32716o;
    }
}
