package p031bk;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015ak.C1457k;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00020\t0\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, m15073d2 = {"Lbk/n;", "Lbk/h;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocketFactory;", "h", "Ljava/lang/Class;", "sslSocketFactoryClass", "i", "paramClass", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "j", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.n */
/* loaded from: classes8.dex */
public final class C3746n extends C3733h {

    /* renamed from: j */
    public static final C3747a f6089j = new C3747a(null);

    /* renamed from: h */
    private final Class<? super SSLSocketFactory> f6090h;

    /* renamed from: i */
    private final Class<?> f6091i;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m15073d2 = {"Lbk/n$a;", "", "", "packageName", "Lbk/m;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.n$a */
    /* loaded from: classes8.dex */
    public static final class C3747a {
        private C3747a() {
        }

        public /* synthetic */ C3747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AbstractC3745m m33701b(C3747a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m33702a(str);
        }

        /* renamed from: a */
        public final AbstractC3745m m33702a(String packageName) {
            C9971q.m14633g(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                C9971q.m14634f(paramsClass, "paramsClass");
                return new C3746n(cls, cls2, paramsClass);
            } catch (Exception e) {
                C1457k.f517c.m41079g().m41091k("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3746n(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        C9971q.m14633g(sslSocketClass, "sslSocketClass");
        C9971q.m14633g(sslSocketFactoryClass, "sslSocketFactoryClass");
        C9971q.m14633g(paramClass, "paramClass");
        this.f6090h = sslSocketFactoryClass;
        this.f6091i = paramClass;
    }
}
