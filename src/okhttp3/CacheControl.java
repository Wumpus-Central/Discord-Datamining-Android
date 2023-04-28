package okhttp3;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 '2\u00020\u0001:\u0002\u0005\nBs\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0011\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0019\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0018\u0010$\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, m15073d2 = {"Lokhttp3/CacheControl;", "", "", "toString", "", "a", "Z", "g", "()Z", "noCache", "b", "h", "noStore", "", "c", "I", "()I", "maxAgeSeconds", "d", "sMaxAgeSeconds", "e", "isPrivate", "f", "isPublic", "mustRevalidate", "maxStaleSeconds", "i", "minFreshSeconds", "j", "onlyIfCached", "k", "noTransform", "l", "immutable", "m", "Ljava/lang/String;", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "p", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class CacheControl {

    /* renamed from: a */
    private final boolean f25346a;

    /* renamed from: b */
    private final boolean f25347b;

    /* renamed from: c */
    private final int f25348c;

    /* renamed from: d */
    private final int f25349d;

    /* renamed from: e */
    private final boolean f25350e;

    /* renamed from: f */
    private final boolean f25351f;

    /* renamed from: g */
    private final boolean f25352g;

    /* renamed from: h */
    private final int f25353h;

    /* renamed from: i */
    private final int f25354i;

    /* renamed from: j */
    private final boolean f25355j;

    /* renamed from: k */
    private final boolean f25356k;

    /* renamed from: l */
    private final boolean f25357l;

    /* renamed from: m */
    private String f25358m;

    /* renamed from: p */
    public static final C11416b f25345p = new C11416b(null);

    /* renamed from: n */
    public static final CacheControl f25343n = new C11415a().m10092d().m10095a();

    /* renamed from: o */
    public static final CacheControl f25344o = new C11415a().m10090f().m10093c(ViewDefaults.NUMBER_OF_LINES, TimeUnit.SECONDS).m10095a();

    @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0000J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, m15073d2 = {"Lokhttp3/CacheControl$a;", "", "", "", "b", "d", "e", "maxStale", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "c", "f", "Lokhttp3/CacheControl;", "a", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "g", "noTransform", "h", "immutable", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.CacheControl$a */
    /* loaded from: classes8.dex */
    public static final class C11415a {

        /* renamed from: a */
        private boolean f25359a;

        /* renamed from: b */
        private boolean f25360b;

        /* renamed from: c */
        private int f25361c = -1;

        /* renamed from: d */
        private int f25362d = -1;

        /* renamed from: e */
        private int f25363e = -1;

        /* renamed from: f */
        private boolean f25364f;

        /* renamed from: g */
        private boolean f25365g;

        /* renamed from: h */
        private boolean f25366h;

        /* renamed from: b */
        private final int m10094b(long j) {
            return j > ((long) ViewDefaults.NUMBER_OF_LINES) ? ViewDefaults.NUMBER_OF_LINES : (int) j;
        }

        /* renamed from: a */
        public final CacheControl m10095a() {
            return new CacheControl(this.f25359a, this.f25360b, this.f25361c, -1, false, false, false, this.f25362d, this.f25363e, this.f25364f, this.f25365g, this.f25366h, null, null);
        }

        /* renamed from: c */
        public final C11415a m10093c(int i, TimeUnit timeUnit) {
            boolean z;
            C9971q.m14633g(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f25362d = m10094b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        /* renamed from: d */
        public final C11415a m10092d() {
            this.f25359a = true;
            return this;
        }

        /* renamed from: e */
        public final C11415a m10091e() {
            this.f25360b = true;
            return this;
        }

        /* renamed from: f */
        public final C11415a m10090f() {
            this.f25364f = true;
            return this;
        }
    }

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lokhttp3/CacheControl$b;", "", "", "characters", "", "startIndex", "a", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "b", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.CacheControl$b */
    /* loaded from: classes8.dex */
    public static final class C11416b {
        private C11416b() {
        }

        public /* synthetic */ C11416b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m10089a(String str, String str2, int i) {
            boolean L;
            int length = str.length();
            while (i < length) {
                L = C12719v.m5711L(str2, str.charAt(i), false, 2, null);
                if (L) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl m10088b(okhttp3.Headers r32) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.C11416b.m10088b(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f25346a = z;
        this.f25347b = z2;
        this.f25348c = i;
        this.f25349d = i2;
        this.f25350e = z3;
        this.f25351f = z4;
        this.f25352g = z5;
        this.f25353h = i3;
        this.f25354i = i4;
        this.f25355j = z6;
        this.f25356k = z7;
        this.f25357l = z8;
        this.f25358m = str;
    }

    /* renamed from: a */
    public final boolean m10104a() {
        return this.f25350e;
    }

    /* renamed from: b */
    public final boolean m10103b() {
        return this.f25351f;
    }

    /* renamed from: c */
    public final int m10102c() {
        return this.f25348c;
    }

    /* renamed from: d */
    public final int m10101d() {
        return this.f25353h;
    }

    /* renamed from: e */
    public final int m10100e() {
        return this.f25354i;
    }

    /* renamed from: f */
    public final boolean m10099f() {
        return this.f25352g;
    }

    /* renamed from: g */
    public final boolean m10098g() {
        return this.f25346a;
    }

    /* renamed from: h */
    public final boolean m10097h() {
        return this.f25347b;
    }

    /* renamed from: i */
    public final boolean m10096i() {
        return this.f25355j;
    }

    public String toString() {
        boolean z;
        String str = this.f25358m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f25346a) {
            sb2.append("no-cache, ");
        }
        if (this.f25347b) {
            sb2.append("no-store, ");
        }
        if (this.f25348c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f25348c);
            sb2.append(", ");
        }
        if (this.f25349d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f25349d);
            sb2.append(", ");
        }
        if (this.f25350e) {
            sb2.append("private, ");
        }
        if (this.f25351f) {
            sb2.append("public, ");
        }
        if (this.f25352g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f25353h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f25353h);
            sb2.append(", ");
        }
        if (this.f25354i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f25354i);
            sb2.append(", ");
        }
        if (this.f25355j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f25356k) {
            sb2.append("no-transform, ");
        }
        if (this.f25357l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f25358m = sb3;
        return sb3;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
