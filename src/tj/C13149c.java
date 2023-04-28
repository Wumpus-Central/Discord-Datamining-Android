package tj;

import com.facebook.react.views.image.ReactImageView;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import p326ri.C12718u;
import p327rj.C12729c;
import p409wj.C13893c;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005B\u001d\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, m15073d2 = {"Ltj/c;", "", "Lokhttp3/Request;", "a", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "Lokhttp3/Response;", "()Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: tj.c */
/* loaded from: classes8.dex */
public final class C13149c {

    /* renamed from: c */
    public static final C13150a f29458c = new C13150a(null);

    /* renamed from: a */
    private final Request f29459a;

    /* renamed from: b */
    private final Response f29460b;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m15073d2 = {"Ltj/c$a;", "", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.c$a */
    /* loaded from: classes8.dex */
    public static final class C13150a {
        private C13150a() {
        }

        public /* synthetic */ C13150a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m4503a(Response response, Request request) {
            C9971q.m14633g(response, "response");
            C9971q.m14633g(request, "request");
            int l = response.m9839l();
            if (!(l == 200 || l == 410 || l == 414 || l == 501 || l == 203 || l == 204)) {
                if (l != 307) {
                    if (!(l == 308 || l == 404 || l == 405)) {
                        switch (l) {
                            case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.m9834t(response, "Expires", null, 2, null) == null && response.m9842g().m10102c() == -1 && !response.m9842g().m10103b() && !response.m9842g().m10104a()) {
                    return false;
                }
            }
            if (response.m9842g().m10097h() || request.m9887b().m10097h()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010)\u001a\u0004\u0018\u00010&¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m15073d2 = {"Ltj/c$b;", "", "", "f", "Ltj/c;", "c", "", "d", "a", "Lokhttp3/Request;", "request", "e", "b", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "lastModifiedString", "expires", "J", "sentRequestMillis", "g", "receivedResponseMillis", "h", "etag", "", "i", "I", "ageSeconds", "j", "nowMillis", "k", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "Lokhttp3/Response;", "l", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.c$b */
    /* loaded from: classes8.dex */
    public static final class C13151b {

        /* renamed from: a */
        private Date f29461a;

        /* renamed from: b */
        private String f29462b;

        /* renamed from: c */
        private Date f29463c;

        /* renamed from: d */
        private String f29464d;

        /* renamed from: e */
        private Date f29465e;

        /* renamed from: f */
        private long f29466f;

        /* renamed from: g */
        private long f29467g;

        /* renamed from: h */
        private String f29468h;

        /* renamed from: i */
        private int f29469i;

        /* renamed from: j */
        private final long f29470j;

        /* renamed from: k */
        private final Request f29471k;

        /* renamed from: l */
        private final Response f29472l;

        public C13151b(long j, Request request, Response response) {
            boolean t;
            boolean t2;
            boolean t3;
            boolean t4;
            boolean t5;
            C9971q.m14633g(request, "request");
            this.f29470j = j;
            this.f29471k = request;
            this.f29472l = response;
            this.f29469i = -1;
            if (response != null) {
                this.f29466f = response.m9843f0();
                this.f29467g = response.m9846Y();
                Headers z = response.m9833z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    String b = z.m10071b(i);
                    String j2 = z.m10067j(i);
                    t = C12718u.m5732t(b, "Date", true);
                    if (t) {
                        this.f29461a = C13893c.m2376a(j2);
                        this.f29462b = j2;
                    } else {
                        t2 = C12718u.m5732t(b, "Expires", true);
                        if (t2) {
                            this.f29465e = C13893c.m2376a(j2);
                        } else {
                            t3 = C12718u.m5732t(b, "Last-Modified", true);
                            if (t3) {
                                this.f29463c = C13893c.m2376a(j2);
                                this.f29464d = j2;
                            } else {
                                t4 = C12718u.m5732t(b, "ETag", true);
                                if (t4) {
                                    this.f29468h = j2;
                                } else {
                                    t5 = C12718u.m5732t(b, "Age", true);
                                    if (t5) {
                                        this.f29469i = C12729c.m5622U(j2, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private final long m4502a() {
            Date date = this.f29461a;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.f29467g - date.getTime());
            }
            int i = this.f29469i;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            long j2 = this.f29467g;
            return j + (j2 - this.f29466f) + (this.f29470j - j2);
        }

        /* renamed from: c */
        private final C13149c m4500c() {
            long j;
            String str;
            if (this.f29472l == null) {
                return new C13149c(this.f29471k, null);
            }
            if (this.f29471k.m9882g() && this.f29472l.m9837p() == null) {
                return new C13149c(this.f29471k, null);
            }
            if (!C13149c.f29458c.m4503a(this.f29472l, this.f29471k)) {
                return new C13149c(this.f29471k, null);
            }
            CacheControl b = this.f29471k.m9887b();
            if (b.m10098g() || m4498e(this.f29471k)) {
                return new C13149c(this.f29471k, null);
            }
            CacheControl g = this.f29472l.m9842g();
            long a = m4502a();
            long d = m4499d();
            if (b.m10102c() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis(b.m10102c()));
            }
            long j2 = 0;
            if (b.m10100e() != -1) {
                j = TimeUnit.SECONDS.toMillis(b.m10100e());
            } else {
                j = 0;
            }
            if (!g.m10099f() && b.m10101d() != -1) {
                j2 = TimeUnit.SECONDS.toMillis(b.m10101d());
            }
            if (!g.m10098g()) {
                long j3 = j + a;
                if (j3 < j2 + d) {
                    Response.C11430a R = this.f29472l.m9850R();
                    if (j3 >= d) {
                        R.m9832a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m4497f()) {
                        R.m9832a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C13149c(null, R.m9830c());
                }
            }
            String str2 = this.f29468h;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f29463c != null) {
                    str2 = this.f29464d;
                } else if (this.f29461a == null) {
                    return new C13149c(this.f29471k, null);
                } else {
                    str2 = this.f29462b;
                }
                str = "If-Modified-Since";
            }
            Headers.C11418a f = this.f29471k.m9883f().m10070f();
            C9971q.m14636d(str2);
            f.m10063c(str, str2);
            return new C13149c(this.f29471k.m9880i().m9871f(f.m10062d()).m9875b(), this.f29472l);
        }

        /* renamed from: d */
        private final long m4499d() {
            long j;
            long j2;
            Response response = this.f29472l;
            C9971q.m14636d(response);
            CacheControl g = response.m9842g();
            if (g.m10102c() != -1) {
                return TimeUnit.SECONDS.toMillis(g.m10102c());
            }
            Date date = this.f29465e;
            if (date != null) {
                Date date2 = this.f29461a;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.f29467g;
                }
                long time = date.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f29463c == null || this.f29472l.m9844b0().m9877l().m10036n() != null) {
                return 0L;
            } else {
                Date date3 = this.f29461a;
                if (date3 != null) {
                    j = date3.getTime();
                } else {
                    j = this.f29466f;
                }
                Date date4 = this.f29463c;
                C9971q.m14636d(date4);
                long time2 = j - date4.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0L;
            }
        }

        /* renamed from: e */
        private final boolean m4498e(Request request) {
            if (request.m9885d("If-Modified-Since") == null && request.m9885d("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private final boolean m4497f() {
            Response response = this.f29472l;
            C9971q.m14636d(response);
            return response.m9842g().m10102c() == -1 && this.f29465e == null;
        }

        /* renamed from: b */
        public final C13149c m4501b() {
            C13149c c = m4500c();
            if (c.m4504b() == null || !this.f29471k.m9887b().m10096i()) {
                return c;
            }
            return new C13149c(null, null);
        }
    }

    public C13149c(Request request, Response response) {
        this.f29459a = request;
        this.f29460b = response;
    }

    /* renamed from: a */
    public final Response m4505a() {
        return this.f29460b;
    }

    /* renamed from: b */
    public final Request m4504b() {
        return this.f29459a;
    }
}
