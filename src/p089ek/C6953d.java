package p089ek;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.jvm.internal.C9949e0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p089ek.C6964g;
import p307qj.AbstractC12216d;
import p307qj.AbstractC12237n;
import p307qj.AbstractC12251t;
import p307qj.EnumC12246q;
import p326ri.C12718u;
import p327rj.C12729c;
import p373uj.AbstractC13366a;
import p373uj.C13369d;
import p373uj.C13370e;
import p389vj.C13541c;
import p389vj.C13545e;

@Metadata(m15074d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0005(' \u001e\"BA\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010f\u001a\u00020*\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010i\u001a\u00020*¢\u0006\u0004\bl\u0010mJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010,\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010+\u001a\u00020*J\u000f\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b/\u00100J\u001c\u00103\u001a\u00020\u000b2\n\u0010\"\u001a\u000601j\u0002`22\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0014\u00105\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010CR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010O\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010QR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0016\u0010X\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010SR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010SR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010QR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010]R\u001a\u0010b\u001a\u00020_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010`\u001a\u0004\bY\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010dR\u0014\u0010f\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0018\u0010h\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010gR\u0016\u0010i\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010N¨\u0006o"}, m15073d2 = {"Lek/d;", "Lokhttp3/WebSocket;", "Lek/g$a;", "Lek/e;", "", "t", "Lokio/ByteString;", "data", "", "formatOpcode", "w", "", "v", "m", "Lokhttp3/OkHttpClient;", "client", "p", "Lokhttp3/Response;", "response", "Lvj/c;", "exchange", "n", "(Lokhttp3/Response;Lvj/c;)V", "", "name", "Lek/d$d;", "streams", "s", "u", "text", "d", "bytes", "c", "payload", "e", "f", "code", "reason", "h", "b", "a", "g", "", "cancelAfterCloseMillis", "o", "x", "()Z", "y", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "q", "Ljava/lang/String;", "key", "Lokhttp3/Call;", "Lokhttp3/Call;", "call", "Luj/a;", "Luj/a;", "writerTask", "Lek/g;", "Lek/g;", "reader", "Lek/h;", "Lek/h;", "writer", "Luj/d;", "Luj/d;", "taskQueue", "Lek/d$d;", "Ljava/util/ArrayDeque;", "i", "Ljava/util/ArrayDeque;", "pongQueue", "", "j", "messageAndCloseQueue", "k", "J", "queueSize", "l", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "failed", "sentPingCount", "receivedPingCount", "r", "receivedPongCount", "awaitingPong", "Lokhttp3/Request;", "Lokhttp3/Request;", "originalRequest", "Lqj/t;", "Lqj/t;", "()Lqj/t;", "listener", "Ljava/util/Random;", "Ljava/util/Random;", "random", "pingIntervalMillis", "Lek/e;", "extensions", "minimumDeflateSize", "Luj/e;", "taskRunner", "<init>", "(Luj/e;Lokhttp3/Request;Lqj/t;Ljava/util/Random;JLek/e;J)V", "A", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.d */
/* loaded from: classes8.dex */
public final class C6953d implements WebSocket, C6964g.AbstractC6965a {

    /* renamed from: A */
    public static final C6955b f38315A = new C6955b(null);

    /* renamed from: z */
    private static final List<EnumC12246q> f15118z;

    /* renamed from: a */
    private final String f15119a;

    /* renamed from: b */
    private Call f15120b;

    /* renamed from: c */
    private AbstractC13366a f15121c;

    /* renamed from: d */
    private C6964g f15122d;

    /* renamed from: e */
    private C6966h f15123e;

    /* renamed from: f */
    private C13369d f15124f;

    /* renamed from: g */
    private String f15125g;

    /* renamed from: h */
    private AbstractC0211d f15126h;

    /* renamed from: k */
    private long f15129k;

    /* renamed from: l */
    private boolean f15130l;

    /* renamed from: n */
    private String f15132n;

    /* renamed from: o */
    private boolean f15133o;

    /* renamed from: p */
    private int f15134p;

    /* renamed from: q */
    private int f15135q;

    /* renamed from: r */
    private int f15136r;

    /* renamed from: s */
    private boolean f15137s;

    /* renamed from: t */
    private final Request f15138t;

    /* renamed from: u */
    private final AbstractC12251t f15139u;

    /* renamed from: v */
    private final Random f15140v;

    /* renamed from: w */
    private final long f15141w;

    /* renamed from: x */
    private C6961e f15142x;

    /* renamed from: y */
    private long f15143y;

    /* renamed from: i */
    private final ArrayDeque<ByteString> f15127i = new ArrayDeque<>();

    /* renamed from: j */
    private final ArrayDeque<Object> f15128j = new ArrayDeque<>();

    /* renamed from: m */
    private int f15131m = -1;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lek/d$a;", "", "", "a", "I", "b", "()I", "code", "Lokio/ByteString;", "Lokio/ByteString;", "c", "()Lokio/ByteString;", "reason", "", "J", "()J", "cancelAfterCloseMillis", "<init>", "(ILokio/ByteString;J)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$a */
    /* loaded from: classes8.dex */
    public static final class C6954a {

        /* renamed from: a */
        private final int f15144a;

        /* renamed from: b */
        private final ByteString f15145b;

        /* renamed from: c */
        private final long f15146c;

        public C6954a(int i, ByteString byteString, long j) {
            this.f15144a = i;
            this.f15145b = byteString;
            this.f15146c = j;
        }

        /* renamed from: a */
        public final long m23837a() {
            return this.f15146c;
        }

        /* renamed from: b */
        public final int m23836b() {
            return this.f15144a;
        }

        /* renamed from: c */
        public final ByteString m23835c() {
            return this.f15145b;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m15073d2 = {"Lek/d$b;", "", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lqj/q;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$b */
    /* loaded from: classes8.dex */
    public static final class C6955b {
        private C6955b() {
        }

        public /* synthetic */ C6955b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lek/d$c;", "", "", "a", "I", "b", "()I", "formatOpcode", "Lokio/ByteString;", "Lokio/ByteString;", "()Lokio/ByteString;", "data", "<init>", "(ILokio/ByteString;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$c */
    /* loaded from: classes8.dex */
    public static final class C6956c {

        /* renamed from: a */
        private final int f15147a;

        /* renamed from: b */
        private final ByteString f15148b;

        public C6956c(int i, ByteString data) {
            C9971q.m14633g(data, "data");
            this.f15147a = i;
            this.f15148b = data;
        }

        /* renamed from: a */
        public final ByteString m23834a() {
            return this.f15148b;
        }

        /* renamed from: b */
        public final int m23833b() {
            return this.f15147a;
        }
    }

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lek/d$d;", "Ljava/io/Closeable;", "", "k", "Z", "b", "()Z", "client", "Lokio/BufferedSource;", "l", "Lokio/BufferedSource;", "h", "()Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "m", "Lokio/BufferedSink;", "g", "()Lokio/BufferedSink;", "sink", "<init>", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$d */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC0211d implements Closeable {

        /* renamed from: k */
        private final boolean f15149k;

        /* renamed from: l */
        private final BufferedSource f15150l;

        /* renamed from: m */
        private final BufferedSink f15151m;

        public AbstractC0211d(boolean z, BufferedSource source, BufferedSink sink) {
            C9971q.m14633g(source, "source");
            C9971q.m14633g(sink, "sink");
            this.f15149k = z;
            this.f15150l = source;
            this.f15151m = sink;
        }

        /* renamed from: b */
        public final boolean m23832b() {
            return this.f15149k;
        }

        /* renamed from: g */
        public final BufferedSink m23831g() {
            return this.f15151m;
        }

        /* renamed from: h */
        public final BufferedSource m23830h() {
            return this.f15150l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lek/d$e;", "Luj/a;", "", "f", "<init>", "(Lek/d;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$e */
    /* loaded from: classes8.dex */
    public final class C6957e extends AbstractC13366a {
        public C6957e() {
            super(C6953d.this.f15125g + " writer", false, 2, null);
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            try {
                if (C6953d.this.m23839x()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                C6953d.this.m23846q(e, null);
                return -1L;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m15073d2 = {"ek/d$f", "Lqj/d;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "", "onResponse", "Ljava/io/IOException;", "e", "onFailure", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$f */
    /* loaded from: classes8.dex */
    public static final class C6958f implements AbstractC12216d {

        /* renamed from: b */
        final /* synthetic */ Request f15154b;

        C6958f(Request request) {
            this.f15154b = request;
        }

        @Override // p307qj.AbstractC12216d
        public void onFailure(Call call, IOException e) {
            C9971q.m14633g(call, "call");
            C9971q.m14633g(e, "e");
            C6953d.this.m23846q(e, null);
        }

        @Override // p307qj.AbstractC12216d
        public void onResponse(Call call, Response response) {
            C9971q.m14633g(call, "call");
            C9971q.m14633g(response, "response");
            C13541c n = response.m9838n();
            try {
                C6953d.this.m23849n(response, n);
                C9971q.m14636d(n);
                AbstractC0211d m = n.m3451m();
                C6961e a = C6961e.f15172g.m23828a(response.m9833z());
                C6953d.this.f15142x = a;
                if (!C6953d.this.m23843t(a)) {
                    synchronized (C6953d.this) {
                        C6953d.this.f15128j.clear();
                        C6953d.this.mo9802g(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    C6953d.this.m23844s(C12729c.f28590i + " WebSocket " + this.f15154b.m9877l().m10035o(), m);
                    C6953d.this.m23845r().onOpen(C6953d.this, response);
                    C6953d.this.m23842u();
                } catch (Exception e) {
                    C6953d.this.m23846q(e, null);
                }
            } catch (IOException e2) {
                if (n != null) {
                    n.m3443u();
                }
                C6953d.this.m23846q(e2, response);
                C12729c.m5608j(response);
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m15073d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Luj/a;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$schedule$1"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$g */
    /* loaded from: classes8.dex */
    public static final class C6959g extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f15155e;

        /* renamed from: f */
        final /* synthetic */ long f15156f;

        /* renamed from: g */
        final /* synthetic */ C6953d f15157g;

        /* renamed from: h */
        final /* synthetic */ String f15158h;

        /* renamed from: i */
        final /* synthetic */ AbstractC0211d f15159i;

        /* renamed from: j */
        final /* synthetic */ C6961e f15160j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6959g(String str, String str2, long j, C6953d dVar, String str3, AbstractC0211d dVar2, C6961e eVar) {
            super(str2, false, 2, null);
            this.f15155e = str;
            this.f15156f = j;
            this.f15157g = dVar;
            this.f15158h = str3;
            this.f15159i = dVar2;
            this.f15160j = eVar;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            this.f15157g.m23838y();
            return this.f15156f;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m15073d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Luj/a;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.d$h */
    /* loaded from: classes8.dex */
    public static final class C6960h extends AbstractC13366a {

        /* renamed from: e */
        final /* synthetic */ String f15161e;

        /* renamed from: f */
        final /* synthetic */ boolean f15162f;

        /* renamed from: g */
        final /* synthetic */ C6953d f15163g;

        /* renamed from: h */
        final /* synthetic */ C6966h f15164h;

        /* renamed from: i */
        final /* synthetic */ ByteString f15165i;

        /* renamed from: j */
        final /* synthetic */ Ref$ObjectRef f15166j;

        /* renamed from: k */
        final /* synthetic */ C9949e0 f15167k;

        /* renamed from: l */
        final /* synthetic */ Ref$ObjectRef f15168l;

        /* renamed from: m */
        final /* synthetic */ Ref$ObjectRef f15169m;

        /* renamed from: n */
        final /* synthetic */ Ref$ObjectRef f15170n;

        /* renamed from: o */
        final /* synthetic */ Ref$ObjectRef f15171o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6960h(String str, boolean z, String str2, boolean z2, C6953d dVar, C6966h hVar, ByteString byteString, Ref$ObjectRef ref$ObjectRef, C9949e0 e0Var, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5) {
            super(str2, z2);
            this.f15161e = str;
            this.f15162f = z;
            this.f15163g = dVar;
            this.f15164h = hVar;
            this.f15165i = byteString;
            this.f15166j = ref$ObjectRef;
            this.f15167k = e0Var;
            this.f15168l = ref$ObjectRef2;
            this.f15169m = ref$ObjectRef3;
            this.f15170n = ref$ObjectRef4;
            this.f15171o = ref$ObjectRef5;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            this.f15163g.m23850m();
            return -1L;
        }
    }

    static {
        List<EnumC12246q> d;
        d = C9905i.m14825d(EnumC12246q.HTTP_1_1);
        f15118z = d;
    }

    public C6953d(C13370e taskRunner, Request originalRequest, AbstractC12251t listener, Random random, long j, C6961e eVar, long j2) {
        C9971q.m14633g(taskRunner, "taskRunner");
        C9971q.m14633g(originalRequest, "originalRequest");
        C9971q.m14633g(listener, "listener");
        C9971q.m14633g(random, "random");
        this.f15138t = originalRequest;
        this.f15139u = listener;
        this.f15140v = random;
        this.f15141w = j;
        this.f15142x = eVar;
        this.f15143y = j2;
        this.f15124f = taskRunner.m3816i();
        if (C9971q.m14638b("GET", originalRequest.m9881h())) {
            ByteString.C11437a aVar = ByteString.f25542o;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            Unit unit = Unit.f22042a;
            this.f15119a = ByteString.C11437a.m9687g(aVar, bArr, 0, 0, 3, null).mo9718a();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + originalRequest.m9881h()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final boolean m23843t(C6961e eVar) {
        if (eVar.f15178f || eVar.f15174b != null) {
            return false;
        }
        Integer num = eVar.f15176d;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        if (8 > intValue || 15 < intValue) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private final void m23841v() {
        if (!C12729c.f28589h || Thread.holdsLock(this)) {
            AbstractC13366a aVar = this.f15121c;
            if (aVar != null) {
                C13369d.m3829j(this.f15124f, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: w */
    private final synchronized boolean m23840w(ByteString byteString, int i) {
        if (!this.f15133o && !this.f15130l) {
            if (this.f15129k + byteString.m9697v() > 16777216) {
                mo9802g(RNCWebViewManager.COMMAND_CLEAR_CACHE, null);
                return false;
            }
            this.f15129k += byteString.m9697v();
            this.f15128j.add(new C6956c(i, byteString));
            m23841v();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: a */
    public boolean mo9804a(ByteString bytes) {
        C9971q.m14633g(bytes, "bytes");
        return m23840w(bytes, 2);
    }

    @Override // okhttp3.WebSocket
    /* renamed from: b */
    public boolean mo9803b(String text) {
        C9971q.m14633g(text, "text");
        return m23840w(ByteString.f25542o.m9690d(text), 1);
    }

    @Override // p089ek.C6964g.AbstractC6965a
    /* renamed from: c */
    public void mo23818c(ByteString bytes) {
        C9971q.m14633g(bytes, "bytes");
        this.f15139u.onMessage(this, bytes);
    }

    @Override // p089ek.C6964g.AbstractC6965a
    /* renamed from: d */
    public void mo23817d(String text) {
        C9971q.m14633g(text, "text");
        this.f15139u.onMessage(this, text);
    }

    @Override // p089ek.C6964g.AbstractC6965a
    /* renamed from: e */
    public synchronized void mo23816e(ByteString payload) {
        C9971q.m14633g(payload, "payload");
        if (!this.f15133o && (!this.f15130l || !this.f15128j.isEmpty())) {
            this.f15127i.add(payload);
            m23841v();
            this.f15135q++;
        }
    }

    @Override // p089ek.C6964g.AbstractC6965a
    /* renamed from: f */
    public synchronized void mo23815f(ByteString payload) {
        C9971q.m14633g(payload, "payload");
        this.f15136r++;
        this.f15137s = false;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: g */
    public boolean mo9802g(int i, String str) {
        return m23848o(i, str, 60000L);
    }

    @Override // p089ek.C6964g.AbstractC6965a
    /* renamed from: h */
    public void mo23814h(int i, String reason) {
        boolean z;
        AbstractC0211d dVar;
        C6966h hVar;
        C6964g gVar;
        C9971q.m14633g(reason, "reason");
        boolean z2 = true;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this) {
                if (this.f15131m != -1) {
                    z2 = false;
                }
                if (z2) {
                    this.f15131m = i;
                    this.f15132n = reason;
                    dVar = null;
                    if (!this.f15130l || !this.f15128j.isEmpty()) {
                        gVar = null;
                        hVar = null;
                    } else {
                        AbstractC0211d dVar2 = this.f15126h;
                        this.f15126h = null;
                        gVar = this.f15122d;
                        this.f15122d = null;
                        hVar = this.f15123e;
                        this.f15123e = null;
                        this.f15124f.m3825n();
                        dVar = dVar2;
                    }
                    Unit unit = Unit.f22042a;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.f15139u.onClosing(this, i, reason);
                if (dVar != null) {
                    this.f15139u.onClosed(this, i, reason);
                }
            } finally {
                if (dVar != null) {
                    C12729c.m5608j(dVar);
                }
                if (gVar != null) {
                    C12729c.m5608j(gVar);
                }
                if (hVar != null) {
                    C12729c.m5608j(hVar);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: m */
    public void m23850m() {
        Call call = this.f15120b;
        C9971q.m14636d(call);
        call.cancel();
    }

    /* renamed from: n */
    public final void m23849n(Response response, C13541c cVar) {
        boolean t;
        boolean t2;
        C9971q.m14633g(response, "response");
        if (response.m9839l() == 101) {
            String t3 = Response.m9834t(response, "Connection", null, 2, null);
            t = C12718u.m5732t("Upgrade", t3, true);
            if (t) {
                String t4 = Response.m9834t(response, "Upgrade", null, 2, null);
                t2 = C12718u.m5732t("websocket", t4, true);
                if (t2) {
                    String t5 = Response.m9834t(response, "Sec-WebSocket-Accept", null, 2, null);
                    ByteString.C11437a aVar = ByteString.f25542o;
                    String a = aVar.m9690d(this.f15119a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").m9699t().mo9718a();
                    if (!C9971q.m14638b(a, t5)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a + "' but was '" + t5 + '\'');
                    } else if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + t4 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + t3 + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.m9839l() + ' ' + response.m9852H() + '\'');
        }
    }

    /* renamed from: o */
    public final synchronized boolean m23848o(int i, String str, long j) {
        ByteString byteString;
        boolean z;
        C6963f.f15179a.m23825c(i);
        if (str != null) {
            byteString = ByteString.f25542o.m9690d(str);
            if (byteString.m9697v() <= 123) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        } else {
            byteString = null;
        }
        if (!this.f15133o && !this.f15130l) {
            this.f15130l = true;
            this.f15128j.add(new C6954a(i, byteString, j));
            m23841v();
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m23847p(OkHttpClient client) {
        C9971q.m14633g(client, "client");
        if (this.f15138t.m9885d("Sec-WebSocket-Extensions") != null) {
            m23846q(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient c = client.m9968B().m9909h(AbstractC12237n.f27542a).m9919N(f15118z).m9914c();
        Request b = this.f15138t.m9880i().m9872e("Upgrade", "websocket").m9872e("Connection", "Upgrade").m9872e("Sec-WebSocket-Key", this.f15119a).m9872e("Sec-WebSocket-Version", "13").m9872e("Sec-WebSocket-Extensions", "permessage-deflate").m9875b();
        C13545e eVar = new C13545e(c, b, true);
        this.f15120b = eVar;
        C9971q.m14636d(eVar);
        eVar.mo3413p(new C6958f(b));
    }

    /* renamed from: q */
    public final void m23846q(Exception e, Response response) {
        C9971q.m14633g(e, "e");
        synchronized (this) {
            if (!this.f15133o) {
                this.f15133o = true;
                AbstractC0211d dVar = this.f15126h;
                this.f15126h = null;
                C6964g gVar = this.f15122d;
                this.f15122d = null;
                C6966h hVar = this.f15123e;
                this.f15123e = null;
                this.f15124f.m3825n();
                Unit unit = Unit.f22042a;
                try {
                    this.f15139u.onFailure(this, e, response);
                } finally {
                    if (dVar != null) {
                        C12729c.m5608j(dVar);
                    }
                    if (gVar != null) {
                        C12729c.m5608j(gVar);
                    }
                    if (hVar != null) {
                        C12729c.m5608j(hVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final AbstractC12251t m23845r() {
        return this.f15139u;
    }

    /* renamed from: s */
    public final void m23844s(String name, AbstractC0211d streams) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(streams, "streams");
        C6961e eVar = this.f15142x;
        C9971q.m14636d(eVar);
        synchronized (this) {
            this.f15125g = name;
            this.f15126h = streams;
            this.f15123e = new C6966h(streams.m23832b(), streams.m23831g(), this.f15140v, eVar.f15173a, eVar.m23829a(streams.m23832b()), this.f15143y);
            this.f15121c = new C6957e();
            long j = this.f15141w;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                String str = name + " ping";
                this.f15124f.m3830i(new C6959g(str, str, nanos, this, name, streams, eVar), nanos);
            }
            if (!this.f15128j.isEmpty()) {
                m23841v();
            }
            Unit unit = Unit.f22042a;
        }
        this.f15122d = new C6964g(streams.m23832b(), streams.m23830h(), this, eVar.f15173a, eVar.m23829a(!streams.m23832b()));
    }

    /* renamed from: u */
    public final void m23842u() {
        while (this.f15131m == -1) {
            C6964g gVar = this.f15122d;
            C9971q.m14636d(gVar);
            gVar.m23824b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:40:0x0134, B:41:0x013b, B:42:0x013c, B:45:0x0142, B:37:0x0121), top: B:86:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x01af, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:40:0x0134, B:41:0x013b, B:42:0x013c, B:45:0x0142, B:37:0x0121), top: B:86:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, ek.h] */
    /* JADX WARN: Type inference failed for: r1v14, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, ek.d$d] */
    /* JADX WARN: Type inference failed for: r2v16, types: [ek.g, T] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, ek.h] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.ByteString] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m23839x() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p089ek.C6953d.m23839x():boolean");
    }

    /* renamed from: y */
    public final void m23838y() {
        int i;
        synchronized (this) {
            if (!this.f15133o) {
                C6966h hVar = this.f15123e;
                if (hVar != null) {
                    if (this.f15137s) {
                        i = this.f15134p;
                    } else {
                        i = -1;
                    }
                    this.f15134p++;
                    this.f15137s = true;
                    Unit unit = Unit.f22042a;
                    if (i != -1) {
                        m23846q(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f15141w + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                        return;
                    }
                    try {
                        hVar.m23810i(ByteString.f25541n);
                    } catch (IOException e) {
                        m23846q(e, null);
                    }
                }
            }
        }
    }
}
