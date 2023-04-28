package tj;

import com.discord.nearby.NearbyManager;
import fk.AbstractC7359g;
import fk.C7366m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import nf.C11075i;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import p015ak.C1457k;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12729c;
import p373uj.AbstractC13366a;
import p373uj.C13369d;
import p373uj.C13370e;
import p426xf.C14082c;
import p470zj.AbstractC14668a;

@Metadata(m15074d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b*\u0001Z\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0004qrstB9\b\u0000\u0012\u0006\u0010c\u001a\u00020^\u0012\u0006\u0010f\u001a\u00020/\u0012\u0006\u0010h\u001a\u00020B\u0012\u0006\u0010l\u001a\u00020B\u0012\u0006\u0010.\u001a\u00020\u0016\u0012\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010pJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J#\u0010\u001c\u001a\u00020\u00032\n\u0010\u001a\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u001fR\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0003R*\u0010.\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010)R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001fR\u00020\u00000<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010FR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u0016\u0010J\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010FR\"\u0010P\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010FR\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010FR\u0016\u0010V\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010)R\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010f\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010DR\u001a\u0010l\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010D\u001a\u0004\bj\u0010k¨\u0006u"}, m15073d2 = {"Ltj/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "z0", "Lokio/BufferedSink;", "j0", "", "line", "F0", "w0", "", "f0", "s", "J0", "key", "L0", "b0", "G0", "()V", "Ltj/d$d;", "Q", "", "expectedSequenceNumber", "Ltj/d$b;", "C", "editor", "success", "t", "(Ltj/d$b;Z)V", "H0", "Ltj/d$c;", "entry", "I0", "(Ltj/d$c;)Z", "flush", "close", "K0", "z", "value", "k", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "maxSize", "Ljava/io/File;", "l", "Ljava/io/File;", "journalFile", "m", "journalFileTmp", "n", "journalFileBackup", "o", "size", "p", "Lokio/BufferedSink;", "journalWriter", "Ljava/util/LinkedHashMap;", "q", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "", "r", "I", "redundantOpCount", "Z", "hasJournalErrors", "civilizedFileSystem", "u", "initialized", "v", "R", "()Z", "setClosed$okhttp", "(Z)V", "closed", "w", "mostRecentTrimFailed", "x", "mostRecentRebuildFailed", "y", "nextSequenceNumber", "Luj/d;", "Luj/d;", "cleanupQueue", "tj/d$e", "A", "Ltj/d$e;", "cleanupTask", "Lzj/a;", "B", "Lzj/a;", "U", "()Lzj/a;", "fileSystem", "S", "()Ljava/io/File;", "directory", "D", "appVersion", "E", "Y", "()I", "valueCount", "Luj/e;", "taskRunner", "<init>", "(Lzj/a;Ljava/io/File;IIJLuj/e;)V", "a", "b", "c", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: tj.d */
/* loaded from: classes8.dex */
public final class C13152d implements Closeable, Flushable {

    /* renamed from: B */
    private final AbstractC14668a f39381B;

    /* renamed from: C */
    private final File f39382C;

    /* renamed from: D */
    private final int f39383D;

    /* renamed from: E */
    private final int f39384E;

    /* renamed from: k */
    private long f29473k;

    /* renamed from: l */
    private final File f29474l;

    /* renamed from: m */
    private final File f29475m;

    /* renamed from: n */
    private final File f29476n;

    /* renamed from: o */
    private long f29477o;

    /* renamed from: p */
    private BufferedSink f29478p;

    /* renamed from: r */
    private int f29480r;

    /* renamed from: s */
    private boolean f29481s;

    /* renamed from: t */
    private boolean f29482t;

    /* renamed from: u */
    private boolean f29483u;

    /* renamed from: v */
    private boolean f29484v;

    /* renamed from: w */
    private boolean f29485w;

    /* renamed from: x */
    private boolean f29486x;

    /* renamed from: y */
    private long f29487y;

    /* renamed from: z */
    private final C13369d f29488z;

    /* renamed from: Q */
    public static final C13153a f39379Q = new C13153a(null);

    /* renamed from: F */
    public static final String f39368F = "journal";

    /* renamed from: G */
    public static final String f39369G = "journal.tmp";

    /* renamed from: H */
    public static final String f39370H = "journal.bkp";

    /* renamed from: I */
    public static final String f39371I = "libcore.io.DiskLruCache";

    /* renamed from: J */
    public static final String f39372J = NearbyManager.PERMISSION_DENIED;

    /* renamed from: K */
    public static final long f39373K = -1;

    /* renamed from: L */
    public static final Regex f39374L = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: M */
    public static final String f39375M = "CLEAN";

    /* renamed from: N */
    public static final String f39376N = "DIRTY";

    /* renamed from: O */
    public static final String f39377O = "REMOVE";

    /* renamed from: P */
    public static final String f39378P = "READ";

    /* renamed from: q */
    private final LinkedHashMap<String, C13156c> f29479q = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: A */
    private final C13158e f39380A = new C13158e(C12729c.f28590i + " Cache");

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, m15073d2 = {"Ltj/d$a;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.d$a */
    /* loaded from: classes8.dex */
    public static final class C13153a {
        private C13153a() {
        }

        public /* synthetic */ C13153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0018\u001a\u00060\u0013R\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0018\u001a\u00060\u0013R\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Ltj/d$b;", "", "", "c", "()V", "", "index", "Lokio/Sink;", "f", "b", "a", "", "[Z", "e", "()[Z", "written", "", "Z", "done", "Ltj/d$c;", "Ltj/d;", "Ltj/d$c;", "d", "()Ltj/d$c;", "entry", "<init>", "(Ltj/d;Ltj/d$c;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.d$b */
    /* loaded from: classes8.dex */
    public final class C13154b {

        /* renamed from: a */
        private final boolean[] f29489a;

        /* renamed from: b */
        private boolean f29490b;

        /* renamed from: c */
        private final C13156c f29491c;

        /* renamed from: d */
        final /* synthetic */ C13152d f29492d;

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Ljava/io/IOException;", "it", "", "a", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, m15072k = 3, m15071mv = {1, 4, 0})
        /* renamed from: tj.d$b$a */
        /* loaded from: classes8.dex */
        public static final class C13155a extends AbstractC9973s implements Function1<IOException, Unit> {

            /* renamed from: l */
            final /* synthetic */ int f29494l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13155a(int i) {
                super(1);
                C13154b.this = r1;
                this.f29494l = i;
            }

            /* renamed from: a */
            public final void m4460a(IOException it) {
                C9971q.m14633g(it, "it");
                synchronized (C13154b.this.f29492d) {
                    C13154b.this.m4464c();
                    Unit unit = Unit.f22042a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                m4460a(iOException);
                return Unit.f22042a;
            }
        }

        public C13154b(C13152d dVar, C13156c entry) {
            boolean[] zArr;
            C9971q.m14633g(entry, "entry");
            this.f29492d = dVar;
            this.f29491c = entry;
            if (entry.m4453g()) {
                zArr = null;
            } else {
                zArr = new boolean[dVar.m4483Y()];
            }
            this.f29489a = zArr;
        }

        /* renamed from: a */
        public final void m4466a() {
            synchronized (this.f29492d) {
                if (!this.f29490b) {
                    if (C9971q.m14638b(this.f29491c.m4458b(), this)) {
                        this.f29492d.m4470t(this, false);
                    }
                    this.f29490b = true;
                    Unit unit = Unit.f22042a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: b */
        public final void m4465b() {
            synchronized (this.f29492d) {
                if (!this.f29490b) {
                    if (C9971q.m14638b(this.f29491c.m4458b(), this)) {
                        this.f29492d.m4470t(this, true);
                    }
                    this.f29490b = true;
                    Unit unit = Unit.f22042a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: c */
        public final void m4464c() {
            if (!C9971q.m14638b(this.f29491c.m4458b(), this)) {
                return;
            }
            if (this.f29492d.f29482t) {
                this.f29492d.m4470t(this, false);
            } else {
                this.f29491c.m4443q(true);
            }
        }

        /* renamed from: d */
        public final C13156c m4463d() {
            return this.f29491c;
        }

        /* renamed from: e */
        public final boolean[] m4462e() {
            return this.f29489a;
        }

        /* renamed from: f */
        public final Sink m4461f(int i) {
            synchronized (this.f29492d) {
                if (!(!this.f29490b)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!C9971q.m14638b(this.f29491c.m4458b(), this)) {
                    return C7366m.m22821b();
                } else {
                    if (!this.f29491c.m4453g()) {
                        boolean[] zArr = this.f29489a;
                        C9971q.m14636d(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new C13160e(this.f29492d.m4484U().mo2f(this.f29491c.m4457c().get(i)), new C13155a(i));
                    } catch (FileNotFoundException unused) {
                        return C7366m.m22821b();
                    }
                }
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010 R\"\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u00105\u001a\b\u0018\u00010/R\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b\u001e\u00102\"\u0004\b3\u00104R\"\u0010:\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\b0\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\b%\u0010C¨\u0006G"}, m15073d2 = {"Ltj/d$c;", "", "", "", "strings", "", "j", "", "index", "Lokio/Source;", "k", "", "m", "(Ljava/util/List;)V", "Lokio/BufferedSink;", "writer", "s", "(Lokio/BufferedSink;)V", "Ltj/d$d;", "Ltj/d;", "r", "()Ltj/d$d;", "", "a", "[J", "e", "()[J", "lengths", "", "Ljava/io/File;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "c", "dirtyFiles", "", "d", "Z", "g", "()Z", "o", "(Z)V", "readable", "i", "q", "zombie", "Ltj/d$b;", "f", "Ltj/d$b;", "()Ltj/d$b;", "l", "(Ltj/d$b;)V", "currentEditor", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "h", "J", "()J", "p", "(J)V", "sequenceNumber", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "<init>", "(Ltj/d;Ljava/lang/String;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.d$c */
    /* loaded from: classes8.dex */
    public final class C13156c {

        /* renamed from: a */
        private final long[] f29495a;

        /* renamed from: b */
        private final List<File> f29496b = new ArrayList();

        /* renamed from: c */
        private final List<File> f29497c = new ArrayList();

        /* renamed from: d */
        private boolean f29498d;

        /* renamed from: e */
        private boolean f29499e;

        /* renamed from: f */
        private C13154b f29500f;

        /* renamed from: g */
        private int f29501g;

        /* renamed from: h */
        private long f29502h;

        /* renamed from: i */
        private final String f29503i;

        /* renamed from: j */
        final /* synthetic */ C13152d f29504j;

        @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m15073d2 = {"tj/d$c$a", "Lfk/g;", "", "close", "", "k", "Z", "closed", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: tj.d$c$a */
        /* loaded from: classes8.dex */
        public static final class C13157a extends AbstractC7359g {

            /* renamed from: k */
            private boolean f29505k;

            /* renamed from: m */
            final /* synthetic */ Source f29507m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13157a(Source source, Source source2) {
                super(source2);
                C13156c.this = r1;
                this.f29507m = source;
            }

            @Override // fk.AbstractC7359g, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (!this.f29505k) {
                    this.f29505k = true;
                    synchronized (C13156c.this.f29504j) {
                        C13156c cVar = C13156c.this;
                        cVar.m4446n(cVar.m4454f() - 1);
                        if (C13156c.this.m4454f() == 0 && C13156c.this.m4451i()) {
                            C13156c cVar2 = C13156c.this;
                            cVar2.f29504j.m4491I0(cVar2);
                        }
                        Unit unit = Unit.f22042a;
                    }
                }
            }
        }

        public C13156c(C13152d dVar, String key) {
            C9971q.m14633g(key, "key");
            this.f29504j = dVar;
            this.f29503i = key;
            this.f29495a = new long[dVar.m4483Y()];
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int Y = dVar.m4483Y();
            for (int i = 0; i < Y; i++) {
                sb2.append(i);
                this.f29496b.add(new File(dVar.m4485S(), sb2.toString()));
                sb2.append(".tmp");
                this.f29497c.add(new File(dVar.m4485S(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* renamed from: j */
        private final Void m4450j(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        /* renamed from: k */
        private final Source m4449k(int i) {
            Source e = this.f29504j.m4484U().mo3e(this.f29496b.get(i));
            if (this.f29504j.f29482t) {
                return e;
            }
            this.f29501g++;
            return new C13157a(e, e);
        }

        /* renamed from: a */
        public final List<File> m4459a() {
            return this.f29496b;
        }

        /* renamed from: b */
        public final C13154b m4458b() {
            return this.f29500f;
        }

        /* renamed from: c */
        public final List<File> m4457c() {
            return this.f29497c;
        }

        /* renamed from: d */
        public final String m4456d() {
            return this.f29503i;
        }

        /* renamed from: e */
        public final long[] m4455e() {
            return this.f29495a;
        }

        /* renamed from: f */
        public final int m4454f() {
            return this.f29501g;
        }

        /* renamed from: g */
        public final boolean m4453g() {
            return this.f29498d;
        }

        /* renamed from: h */
        public final long m4452h() {
            return this.f29502h;
        }

        /* renamed from: i */
        public final boolean m4451i() {
            return this.f29499e;
        }

        /* renamed from: l */
        public final void m4448l(C13154b bVar) {
            this.f29500f = bVar;
        }

        /* renamed from: m */
        public final void m4447m(List<String> strings) {
            C9971q.m14633g(strings, "strings");
            if (strings.size() == this.f29504j.m4483Y()) {
                try {
                    int size = strings.size();
                    for (int i = 0; i < size; i++) {
                        this.f29495a[i] = Long.parseLong(strings.get(i));
                    }
                } catch (NumberFormatException unused) {
                    m4450j(strings);
                    throw new C11075i();
                }
            } else {
                m4450j(strings);
                throw new C11075i();
            }
        }

        /* renamed from: n */
        public final void m4446n(int i) {
            this.f29501g = i;
        }

        /* renamed from: o */
        public final void m4445o(boolean z) {
            this.f29498d = z;
        }

        /* renamed from: p */
        public final void m4444p(long j) {
            this.f29502h = j;
        }

        /* renamed from: q */
        public final void m4443q(boolean z) {
            this.f29499e = z;
        }

        /* renamed from: r */
        public final C0425d m4442r() {
            C13152d dVar = this.f29504j;
            if (C12729c.f28589h && !Thread.holdsLock(dVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9971q.m14634f(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(dVar);
                throw new AssertionError(sb2.toString());
            } else if (!this.f29498d) {
                return null;
            } else {
                if (!this.f29504j.f29482t && (this.f29500f != null || this.f29499e)) {
                    return null;
                }
                ArrayList<Source> arrayList = new ArrayList();
                long[] jArr = (long[]) this.f29495a.clone();
                try {
                    int Y = this.f29504j.m4483Y();
                    for (int i = 0; i < Y; i++) {
                        arrayList.add(m4449k(i));
                    }
                    return new C0425d(this.f29504j, this.f29503i, this.f29502h, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (Source source : arrayList) {
                        C12729c.m5608j(source);
                    }
                    try {
                        this.f29504j.m4491I0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        /* renamed from: s */
        public final void m4441s(BufferedSink writer) {
            C9971q.m14633g(writer, "writer");
            for (long j : this.f29495a) {
                writer.writeByte(32).mo9746c0(j);
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\b\u0018\u00010\u0002R\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m15073d2 = {"Ltj/d$d;", "Ljava/io/Closeable;", "Ltj/d$b;", "Ltj/d;", "b", "", "index", "Lokio/Source;", "g", "", "close", "", "k", "Ljava/lang/String;", "key", "", "l", "J", "sequenceNumber", "", "m", "Ljava/util/List;", "sources", "", "n", "[J", "lengths", "<init>", "(Ltj/d;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.d$d */
    /* loaded from: classes8.dex */
    public final class C0425d implements Closeable {

        /* renamed from: k */
        private final String f29508k;

        /* renamed from: l */
        private final long f29509l;

        /* renamed from: m */
        private final List<Source> f29510m;

        /* renamed from: n */
        private final long[] f29511n;

        /* renamed from: o */
        final /* synthetic */ C13152d f29512o;

        /* JADX WARN: Multi-variable type inference failed */
        public C0425d(C13152d dVar, String key, long j, List<? extends Source> sources, long[] lengths) {
            C9971q.m14633g(key, "key");
            C9971q.m14633g(sources, "sources");
            C9971q.m14633g(lengths, "lengths");
            this.f29512o = dVar;
            this.f29508k = key;
            this.f29509l = j;
            this.f29510m = sources;
            this.f29511n = lengths;
        }

        /* renamed from: b */
        public final C13154b m4440b() {
            return this.f29512o.m4496C(this.f29508k, this.f29509l);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.f29510m) {
                C12729c.m5608j(source);
            }
        }

        /* renamed from: g */
        public final Source m4439g(int i) {
            return this.f29510m.get(i);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"tj/d$e", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.d$e */
    /* loaded from: classes8.dex */
    public static final class C13158e extends AbstractC13366a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13158e(String str) {
            super(str, false, 2, null);
            C13152d.this = r3;
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            synchronized (C13152d.this) {
                if (!C13152d.this.f29483u || C13152d.this.m4486R()) {
                    return -1L;
                }
                try {
                    C13152d.this.m4489K0();
                } catch (IOException unused) {
                    C13152d.this.f29485w = true;
                }
                try {
                    if (C13152d.this.m4480f0()) {
                        C13152d.this.m4494G0();
                        C13152d.this.f29480r = 0;
                    }
                } catch (IOException unused2) {
                    C13152d.this.f29486x = true;
                    C13152d.this.f29478p = C7366m.m22820c(C7366m.m22821b());
                }
                return -1L;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Ljava/io/IOException;", "it", "", "a", "(Ljava/io/IOException;)V"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: tj.d$f */
    /* loaded from: classes8.dex */
    public static final class C13159f extends AbstractC9973s implements Function1<IOException, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13159f() {
            super(1);
            C13152d.this = r1;
        }

        /* renamed from: a */
        public final void m4438a(IOException it) {
            C9971q.m14633g(it, "it");
            C13152d dVar = C13152d.this;
            if (!C12729c.f28589h || Thread.holdsLock(dVar)) {
                C13152d.this.f29481s = true;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(dVar);
            throw new AssertionError(sb2.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
            m4438a(iOException);
            return Unit.f22042a;
        }
    }

    public C13152d(AbstractC14668a fileSystem, File directory, int i, int i2, long j, C13370e taskRunner) {
        boolean z;
        C9971q.m14633g(fileSystem, "fileSystem");
        C9971q.m14633g(directory, "directory");
        C9971q.m14633g(taskRunner, "taskRunner");
        this.f39381B = fileSystem;
        this.f39382C = directory;
        this.f39383D = i;
        this.f39384E = i2;
        this.f29473k = j;
        boolean z2 = false;
        this.f29488z = taskRunner.m3816i();
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0 ? true : z2) {
                this.f29474l = new File(directory, f39368F);
                this.f29475m = new File(directory, f39369G);
                this.f29476n = new File(directory, f39370H);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: F0 */
    private final void m4495F0(String str) {
        int Y;
        int Y2;
        String str2;
        boolean H;
        boolean H2;
        boolean H3;
        List<String> y0;
        boolean H4;
        Y = C12719v.m5687Y(str, ' ', 0, false, 6, null);
        if (Y != -1) {
            int i = Y + 1;
            Y2 = C12719v.m5687Y(str, ' ', i, false, 4, null);
            if (Y2 == -1) {
                if (str != null) {
                    str2 = str.substring(i);
                    C9971q.m14634f(str2, "(this as java.lang.String).substring(startIndex)");
                    String str3 = f39377O;
                    if (Y == str3.length()) {
                        H4 = C12718u.m5736H(str, str3, false, 2, null);
                        if (H4) {
                            this.f29479q.remove(str2);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str != null) {
                str2 = str.substring(i, Y2);
                C9971q.m14634f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            C13156c cVar = this.f29479q.get(str2);
            if (cVar == null) {
                cVar = new C13156c(this, str2);
                this.f29479q.put(str2, cVar);
            }
            if (Y2 != -1) {
                String str4 = f39375M;
                if (Y == str4.length()) {
                    H3 = C12718u.m5736H(str, str4, false, 2, null);
                    if (H3) {
                        int i2 = Y2 + 1;
                        if (str != null) {
                            String substring = str.substring(i2);
                            C9971q.m14634f(substring, "(this as java.lang.String).substring(startIndex)");
                            y0 = C12719v.m5661y0(substring, new char[]{' '}, false, 0, 6, null);
                            cVar.m4445o(true);
                            cVar.m4448l(null);
                            cVar.m4447m(y0);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            if (Y2 == -1) {
                String str5 = f39376N;
                if (Y == str5.length()) {
                    H2 = C12718u.m5736H(str, str5, false, 2, null);
                    if (H2) {
                        cVar.m4448l(new C13154b(this, cVar));
                        return;
                    }
                }
            }
            if (Y2 == -1) {
                String str6 = f39378P;
                if (Y == str6.length()) {
                    H = C12718u.m5736H(str, str6, false, 2, null);
                    if (H) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: H */
    public static /* synthetic */ C13154b m4493H(C13152d dVar, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = f39373K;
        }
        return dVar.m4496C(str, j);
    }

    /* renamed from: J0 */
    private final boolean m4490J0() {
        for (C13156c toEvict : this.f29479q.values()) {
            if (!toEvict.m4451i()) {
                C9971q.m14634f(toEvict, "toEvict");
                m4491I0(toEvict);
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    private final void m4488L0(String str) {
        if (!f39374L.m14583g(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* renamed from: f0 */
    public final boolean m4480f0() {
        int i = this.f29480r;
        return i >= 2000 && i >= this.f29479q.size();
    }

    /* renamed from: j0 */
    private final BufferedSink m4476j0() {
        return C7366m.m22820c(new C13160e(this.f39381B.mo5c(this.f29474l), new C13159f()));
    }

    /* renamed from: s */
    private final synchronized void m4471s() {
        if (!(!this.f29484v)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* renamed from: w0 */
    private final void m4469w0() {
        this.f39381B.mo0h(this.f29475m);
        Iterator<C13156c> it = this.f29479q.values().iterator();
        while (it.hasNext()) {
            C13156c next = it.next();
            C9971q.m14634f(next, "i.next()");
            C13156c cVar = next;
            int i = 0;
            if (cVar.m4458b() == null) {
                int i2 = this.f39384E;
                while (i < i2) {
                    this.f29477o += cVar.m4455e()[i];
                    i++;
                }
            } else {
                cVar.m4448l(null);
                int i3 = this.f39384E;
                while (i < i3) {
                    this.f39381B.mo0h(cVar.m4459a().get(i));
                    this.f39381B.mo0h(cVar.m4457c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: z0 */
    private final void m4467z0() {
        BufferedSource d = C7366m.m22819d(this.f39381B.mo3e(this.f29474l));
        try {
            String T = d.mo9737T();
            String T2 = d.mo9737T();
            String T3 = d.mo9737T();
            String T4 = d.mo9737T();
            String T5 = d.mo9737T();
            boolean z = true;
            if (!(!C9971q.m14638b(f39371I, T)) && !(!C9971q.m14638b(f39372J, T2)) && !(!C9971q.m14638b(String.valueOf(this.f39383D), T3)) && !(!C9971q.m14638b(String.valueOf(this.f39384E), T4))) {
                int i = 0;
                if (T5.length() <= 0) {
                    z = false;
                }
                if (!z) {
                    while (true) {
                        try {
                            m4495F0(d.mo9737T());
                            i++;
                        } catch (EOFException unused) {
                            this.f29480r = i - this.f29479q.size();
                            if (!d.mo9731h0()) {
                                m4494G0();
                            } else {
                                this.f29478p = m4476j0();
                            }
                            Unit unit = Unit.f22042a;
                            th = null;
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + T + ", " + T2 + ", " + T4 + ", " + T5 + ']');
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: C */
    public final synchronized C13154b m4496C(String key, long j) {
        C13154b bVar;
        C9971q.m14633g(key, "key");
        m4481b0();
        m4471s();
        m4488L0(key);
        C13156c cVar = this.f29479q.get(key);
        if (j != f39373K && (cVar == null || cVar.m4452h() != j)) {
            return null;
        }
        if (cVar != null) {
            bVar = cVar.m4458b();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return null;
        }
        if (cVar != null && cVar.m4454f() != 0) {
            return null;
        }
        if (!this.f29485w && !this.f29486x) {
            BufferedSink bufferedSink = this.f29478p;
            C9971q.m14636d(bufferedSink);
            bufferedSink.mo9750J(f39376N).writeByte(32).mo9750J(key).writeByte(10);
            bufferedSink.flush();
            if (this.f29481s) {
                return null;
            }
            if (cVar == null) {
                cVar = new C13156c(this, key);
                this.f29479q.put(key, cVar);
            }
            C13154b bVar2 = new C13154b(this, cVar);
            cVar.m4448l(bVar2);
            return bVar2;
        }
        C13369d.m3829j(this.f29488z, this.f39380A, 0L, 2, null);
        return null;
    }

    /* renamed from: G0 */
    public final synchronized void m4494G0() {
        BufferedSink bufferedSink = this.f29478p;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink c = C7366m.m22820c(this.f39381B.mo2f(this.f29475m));
        c.mo9750J(f39371I).writeByte(10);
        c.mo9750J(f39372J).writeByte(10);
        c.mo9746c0(this.f39383D).writeByte(10);
        c.mo9746c0(this.f39384E).writeByte(10);
        c.writeByte(10);
        for (C13156c cVar : this.f29479q.values()) {
            if (cVar.m4458b() != null) {
                c.mo9750J(f39376N).writeByte(32);
                c.mo9750J(cVar.m4456d());
                c.writeByte(10);
            } else {
                c.mo9750J(f39375M).writeByte(32);
                c.mo9750J(cVar.m4456d());
                cVar.m4441s(c);
                c.writeByte(10);
            }
        }
        Unit unit = Unit.f22042a;
        C14082c.m1713a(c, null);
        if (this.f39381B.mo6b(this.f29474l)) {
            this.f39381B.mo1g(this.f29474l, this.f29476n);
        }
        this.f39381B.mo1g(this.f29475m, this.f29474l);
        this.f39381B.mo0h(this.f29476n);
        this.f29478p = m4476j0();
        this.f29481s = false;
        this.f29486x = false;
    }

    /* renamed from: H0 */
    public final synchronized boolean m4492H0(String key) {
        C9971q.m14633g(key, "key");
        m4481b0();
        m4471s();
        m4488L0(key);
        C13156c cVar = this.f29479q.get(key);
        if (cVar == null) {
            return false;
        }
        C9971q.m14634f(cVar, "lruEntries[key] ?: return false");
        boolean I0 = m4491I0(cVar);
        if (I0 && this.f29477o <= this.f29473k) {
            this.f29485w = false;
        }
        return I0;
    }

    /* renamed from: I0 */
    public final boolean m4491I0(C13156c entry) {
        BufferedSink bufferedSink;
        C9971q.m14633g(entry, "entry");
        if (!this.f29482t) {
            if (entry.m4454f() > 0 && (bufferedSink = this.f29478p) != null) {
                bufferedSink.mo9750J(f39376N);
                bufferedSink.writeByte(32);
                bufferedSink.mo9750J(entry.m4456d());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.m4454f() > 0 || entry.m4458b() != null) {
                entry.m4443q(true);
                return true;
            }
        }
        C13154b b = entry.m4458b();
        if (b != null) {
            b.m4464c();
        }
        int i = this.f39384E;
        for (int i2 = 0; i2 < i; i2++) {
            this.f39381B.mo0h(entry.m4459a().get(i2));
            this.f29477o -= entry.m4455e()[i2];
            entry.m4455e()[i2] = 0;
        }
        this.f29480r++;
        BufferedSink bufferedSink2 = this.f29478p;
        if (bufferedSink2 != null) {
            bufferedSink2.mo9750J(f39377O);
            bufferedSink2.writeByte(32);
            bufferedSink2.mo9750J(entry.m4456d());
            bufferedSink2.writeByte(10);
        }
        this.f29479q.remove(entry.m4456d());
        if (m4480f0()) {
            C13369d.m3829j(this.f29488z, this.f39380A, 0L, 2, null);
        }
        return true;
    }

    /* renamed from: K0 */
    public final void m4489K0() {
        while (this.f29477o > this.f29473k) {
            if (!m4490J0()) {
                return;
            }
        }
        this.f29485w = false;
    }

    /* renamed from: Q */
    public final synchronized C0425d m4487Q(String key) {
        C9971q.m14633g(key, "key");
        m4481b0();
        m4471s();
        m4488L0(key);
        C13156c cVar = this.f29479q.get(key);
        if (cVar == null) {
            return null;
        }
        C9971q.m14634f(cVar, "lruEntries[key] ?: return null");
        C0425d r = cVar.m4442r();
        if (r == null) {
            return null;
        }
        this.f29480r++;
        BufferedSink bufferedSink = this.f29478p;
        C9971q.m14636d(bufferedSink);
        bufferedSink.mo9750J(f39378P).writeByte(32).mo9750J(key).writeByte(10);
        if (m4480f0()) {
            C13369d.m3829j(this.f29488z, this.f39380A, 0L, 2, null);
        }
        return r;
    }

    /* renamed from: R */
    public final boolean m4486R() {
        return this.f29484v;
    }

    /* renamed from: S */
    public final File m4485S() {
        return this.f39382C;
    }

    /* renamed from: U */
    public final AbstractC14668a m4484U() {
        return this.f39381B;
    }

    /* renamed from: Y */
    public final int m4483Y() {
        return this.f39384E;
    }

    /* renamed from: b0 */
    public final synchronized void m4481b0() {
        if (C12729c.f28589h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (!this.f29483u) {
            if (this.f39381B.mo6b(this.f29476n)) {
                if (this.f39381B.mo6b(this.f29474l)) {
                    this.f39381B.mo0h(this.f29476n);
                } else {
                    this.f39381B.mo1g(this.f29476n, this.f29474l);
                }
            }
            this.f29482t = C12729c.m5640C(this.f39381B, this.f29476n);
            if (this.f39381B.mo6b(this.f29474l)) {
                try {
                    m4467z0();
                    m4469w0();
                    this.f29483u = true;
                    return;
                } catch (IOException e) {
                    C1457k g = C1457k.f517c.m41079g();
                    g.m41091k("DiskLruCache " + this.f39382C + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    m4468z();
                    this.f29484v = false;
                }
            }
            m4494G0();
            this.f29483u = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        C13156c[] cVarArr;
        C13154b b;
        if (this.f29483u && !this.f29484v) {
            Collection<C13156c> values = this.f29479q.values();
            C9971q.m14634f(values, "lruEntries.values");
            Object[] array = values.toArray(new C13156c[0]);
            if (array != null) {
                for (C13156c cVar : (C13156c[]) array) {
                    if (!(cVar.m4458b() == null || (b = cVar.m4458b()) == null)) {
                        b.m4464c();
                    }
                }
                m4489K0();
                BufferedSink bufferedSink = this.f29478p;
                C9971q.m14636d(bufferedSink);
                bufferedSink.close();
                this.f29478p = null;
                this.f29484v = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f29484v = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f29483u) {
            m4471s();
            m4489K0();
            BufferedSink bufferedSink = this.f29478p;
            C9971q.m14636d(bufferedSink);
            bufferedSink.flush();
        }
    }

    /* renamed from: t */
    public final synchronized void m4470t(C13154b editor, boolean z) {
        C9971q.m14633g(editor, "editor");
        C13156c d = editor.m4463d();
        if (C9971q.m14638b(d.m4458b(), editor)) {
            if (z && !d.m4453g()) {
                int i = this.f39384E;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] e = editor.m4462e();
                    C9971q.m14636d(e);
                    if (!e[i2]) {
                        editor.m4466a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    } else if (!this.f39381B.mo6b(d.m4457c().get(i2))) {
                        editor.m4466a();
                        return;
                    }
                }
            }
            int i3 = this.f39384E;
            for (int i4 = 0; i4 < i3; i4++) {
                File file = d.m4457c().get(i4);
                if (!z || d.m4451i()) {
                    this.f39381B.mo0h(file);
                } else if (this.f39381B.mo6b(file)) {
                    File file2 = d.m4459a().get(i4);
                    this.f39381B.mo1g(file, file2);
                    long j = d.m4455e()[i4];
                    long d2 = this.f39381B.mo4d(file2);
                    d.m4455e()[i4] = d2;
                    this.f29477o = (this.f29477o - j) + d2;
                }
            }
            d.m4448l(null);
            if (d.m4451i()) {
                m4491I0(d);
                return;
            }
            this.f29480r++;
            BufferedSink bufferedSink = this.f29478p;
            C9971q.m14636d(bufferedSink);
            if (!d.m4453g() && !z) {
                this.f29479q.remove(d.m4456d());
                bufferedSink.mo9750J(f39377O).writeByte(32);
                bufferedSink.mo9750J(d.m4456d());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f29477o <= this.f29473k || m4480f0()) {
                    C13369d.m3829j(this.f29488z, this.f39380A, 0L, 2, null);
                }
                return;
            }
            d.m4445o(true);
            bufferedSink.mo9750J(f39375M).writeByte(32);
            bufferedSink.mo9750J(d.m4456d());
            d.m4441s(bufferedSink);
            bufferedSink.writeByte(10);
            if (z) {
                long j2 = this.f29487y;
                this.f29487y = 1 + j2;
                d.m4444p(j2);
            }
            bufferedSink.flush();
            if (this.f29477o <= this.f29473k) {
            }
            C13369d.m3829j(this.f29488z, this.f39380A, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: z */
    public final void m4468z() {
        close();
        this.f39381B.mo7a(this.f39382C);
    }
}
