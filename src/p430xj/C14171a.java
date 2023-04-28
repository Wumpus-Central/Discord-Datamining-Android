package p430xj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okio.BufferedSource;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m15073d2 = {"Lxj/a;", "", "", "b", "Lokhttp3/Headers;", "a", "", "J", "headerLimit", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: xj.a */
/* loaded from: classes8.dex */
public final class C14171a {

    /* renamed from: c */
    public static final C0459a f31991c = new C0459a(null);

    /* renamed from: a */
    private long f31992a = 262144;

    /* renamed from: b */
    private final BufferedSource f31993b;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lxj/a$a;", "", "", "HEADER_LIMIT", "I", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.a$a */
    /* loaded from: classes8.dex */
    public static final class C0459a {
        private C0459a() {
        }

        public /* synthetic */ C0459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14171a(BufferedSource source) {
        C9971q.m14633g(source, "source");
        this.f31993b = source;
    }

    /* renamed from: a */
    public final Headers m1461a() {
        boolean z;
        Headers.C11418a aVar = new Headers.C11418a();
        while (true) {
            String b = m1460b();
            if (b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return aVar.m10062d();
            }
            aVar.m10064b(b);
        }
    }

    /* renamed from: b */
    public final String m1460b() {
        String E = this.f31993b.mo9740E(this.f31992a);
        this.f31992a -= E.length();
        return E;
    }
}
