package p015ak;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u000f"}, m15073d2 = {"Lak/i;", "Lak/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lqj/q;", "protocols", "", "e", "h", "<init>", "()V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.i */
/* loaded from: classes8.dex */
public class C1453i extends C1457k {

    /* renamed from: d */
    private static final boolean f510d;

    /* renamed from: e */
    public static final C1454a f511e = new C1454a(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lak/i$a;", "", "Lak/i;", "a", "", "isAvailable", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.i$a */
    /* loaded from: classes8.dex */
    public static final class C1454a {
        private C1454a() {
        }

        public /* synthetic */ C1454a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1453i m41106a() {
            if (m41105b()) {
                return new C1453i();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m41105b() {
            return C1453i.f510d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            ak.i$a r0 = new ak.i$a
            r1 = 0
            r0.<init>(r1)
            p015ak.C1453i.f511e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = p326ri.C12707l.m5779m(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = r2
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0021
            r1.getMethod(r3, r4)     // Catch: NoSuchMethodException -> 0x0021
        L_0x002c:
            p015ak.C1453i.f510d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015ak.C1453i.<clinit>():void");
    }

    @Override // p015ak.C1457k
    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        List<String> b = C1457k.f517c.m41084b(protocols);
        C9971q.m14634f(sslParameters, "sslParameters");
        Object[] array = b.toArray(new String[0]);
        if (array != null) {
            sslParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sslParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // p015ak.C1457k
    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        String applicationProtocol;
        C9971q.m14633g(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
