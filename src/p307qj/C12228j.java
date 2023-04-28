package p307qj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p303qf.C12120c;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002\u0012\u0017B9\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010!R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006)"}, m15073d2 = {"Lqj/j;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "g", "", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "other", "equals", "", "hashCode", "", "toString", "a", "Z", "f", "()Z", "isTls", "b", "h", "supportsTlsExtensions", "", "[Ljava/lang/String;", "cipherSuitesAsString", "d", "tlsVersionsAsString", "", "Lqj/g;", "()Ljava/util/List;", "cipherSuites", "Lqj/s;", "i", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "k", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.j */
/* loaded from: classes8.dex */
public final class C12228j {

    /* renamed from: e */
    private static final C12223g[] f27501e;

    /* renamed from: f */
    private static final C12223g[] f27502f;

    /* renamed from: g */
    public static final C12228j f27503g;

    /* renamed from: h */
    public static final C12228j f27504h;

    /* renamed from: i */
    public static final C12228j f27505i;

    /* renamed from: a */
    private final boolean f27508a;

    /* renamed from: b */
    private final boolean f27509b;

    /* renamed from: c */
    private final String[] f27510c;

    /* renamed from: d */
    private final String[] f27511d;

    /* renamed from: k */
    public static final C12230b f27507k = new C12230b(null);

    /* renamed from: j */
    public static final C12228j f27506j = new C12229a(false).m7336a();

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b#\u0010%J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0002\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006&"}, m15073d2 = {"Lqj/j$a;", "", "", "Lqj/g;", "cipherSuites", "c", "([Lqj/g;)Lqj/j$a;", "", "b", "([Ljava/lang/String;)Lqj/j$a;", "Lqj/s;", "tlsVersions", "f", "([Lqj/s;)Lqj/j$a;", "e", "", "supportsTlsExtensions", "d", "Lqj/j;", "a", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "(Z)V", "tls", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "<init>", "connectionSpec", "(Lqj/j;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.j$a */
    /* loaded from: classes8.dex */
    public static final class C12229a {

        /* renamed from: a */
        private boolean f27512a;

        /* renamed from: b */
        private String[] f27513b;

        /* renamed from: c */
        private String[] f27514c;

        /* renamed from: d */
        private boolean f27515d;

        public C12229a(boolean z) {
            this.f27512a = z;
        }

        /* renamed from: a */
        public final C12228j m7336a() {
            return new C12228j(this.f27512a, this.f27515d, this.f27513b, this.f27514c);
        }

        /* renamed from: b */
        public final C12229a m7335b(String... cipherSuites) {
            boolean z;
            C9971q.m14633g(cipherSuites, "cipherSuites");
            if (this.f27512a) {
                if (cipherSuites.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object clone = cipherSuites.clone();
                    if (clone != null) {
                        this.f27513b = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C12229a m7334c(C12223g... cipherSuites) {
            C9971q.m14633g(cipherSuites, "cipherSuites");
            if (this.f27512a) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (C12223g gVar : cipherSuites) {
                    arrayList.add(gVar.m7353c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return m7335b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final C12229a m7333d(boolean z) {
            if (this.f27512a) {
                this.f27515d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: e */
        public final C12229a m7332e(String... tlsVersions) {
            boolean z;
            C9971q.m14633g(tlsVersions, "tlsVersions");
            if (this.f27512a) {
                if (tlsVersions.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object clone = tlsVersions.clone();
                    if (clone != null) {
                        this.f27514c = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: f */
        public final C12229a m7331f(EnumC12249s... tlsVersions) {
            C9971q.m14633g(tlsVersions, "tlsVersions");
            if (this.f27512a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (EnumC12249s sVar : tlsVersions) {
                    arrayList.add(sVar.m7264a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return m7332e((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C12229a(C12228j connectionSpec) {
            C9971q.m14633g(connectionSpec, "connectionSpec");
            this.f27512a = connectionSpec.m7340f();
            this.f27513b = connectionSpec.f27510c;
            this.f27514c = connectionSpec.f27511d;
            this.f27515d = connectionSpec.m7338h();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, m15073d2 = {"Lqj/j$b;", "", "", "Lqj/g;", "APPROVED_CIPHER_SUITES", "[Lqj/g;", "Lqj/j;", "CLEARTEXT", "Lqj/j;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.j$b */
    /* loaded from: classes8.dex */
    public static final class C12230b {
        private C12230b() {
        }

        public /* synthetic */ C12230b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C12223g gVar = C12223g.f27469n1;
        C12223g gVar2 = C12223g.f27472o1;
        C12223g gVar3 = C12223g.f27475p1;
        C12223g gVar4 = C12223g.f39224Z0;
        C12223g gVar5 = C12223g.f27439d1;
        C12223g gVar6 = C12223g.f27430a1;
        C12223g gVar7 = C12223g.f27442e1;
        C12223g gVar8 = C12223g.f27460k1;
        C12223g gVar9 = C12223g.f27457j1;
        C12223g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        f27501e = gVarArr;
        C12223g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, C12223g.f39194K0, C12223g.f39196L0, C12223g.f27453i0, C12223g.f27456j0, C12223g.f39185G, C12223g.f39193K, C12223g.f27458k};
        f27502f = gVarArr2;
        C12229a c = new C12229a(true).m7334c((C12223g[]) Arrays.copyOf(gVarArr, gVarArr.length));
        EnumC12249s sVar = EnumC12249s.TLS_1_3;
        EnumC12249s sVar2 = EnumC12249s.TLS_1_2;
        f27503g = c.m7331f(sVar, sVar2).m7333d(true).m7336a();
        f27504h = new C12229a(true).m7334c((C12223g[]) Arrays.copyOf(gVarArr2, gVarArr2.length)).m7331f(sVar, sVar2).m7333d(true).m7336a();
        f27505i = new C12229a(true).m7334c((C12223g[]) Arrays.copyOf(gVarArr2, gVarArr2.length)).m7331f(sVar, sVar2, EnumC12249s.TLS_1_1, EnumC12249s.TLS_1_0).m7333d(true).m7336a();
    }

    public C12228j(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f27508a = z;
        this.f27509b = z2;
        this.f27510c = strArr;
        this.f27511d = strArr2;
    }

    /* renamed from: g */
    private final C12228j m7339g(SSLSocket sSLSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Comparator f;
        if (this.f27510c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C9971q.m14634f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = C12729c.m5641B(enabledCipherSuites, this.f27510c, C12223g.f27484s1.m7349c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f27511d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C9971q.m14634f(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr = this.f27511d;
            f = C12120c.m7776f();
            tlsVersionsIntersection = C12729c.m5641B(enabledProtocols, strArr, f);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C9971q.m14634f(supportedCipherSuites, "supportedCipherSuites");
        int u = C12729c.m5597u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C12223g.f27484s1.m7349c());
        if (z && u != -1) {
            C9971q.m14634f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u];
            C9971q.m14634f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = C12729c.m5606l(cipherSuitesIntersection, str);
        }
        C12229a aVar = new C12229a(this);
        C9971q.m14634f(cipherSuitesIntersection, "cipherSuitesIntersection");
        C12229a b = aVar.m7335b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        C9971q.m14634f(tlsVersionsIntersection, "tlsVersionsIntersection");
        return b.m7332e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m7336a();
    }

    /* renamed from: c */
    public final void m7343c(SSLSocket sslSocket, boolean z) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C12228j g = m7339g(sslSocket, z);
        if (g.m7337i() != null) {
            sslSocket.setEnabledProtocols(g.f27511d);
        }
        if (g.m7342d() != null) {
            sslSocket.setEnabledCipherSuites(g.f27510c);
        }
    }

    /* renamed from: d */
    public final List<C12223g> m7342d() {
        List<C12223g> D0;
        String[] strArr = this.f27510c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C12223g.f27484s1.m7350b(str));
        }
        D0 = C9914r.m14790D0(arrayList);
        return D0;
    }

    /* renamed from: e */
    public final boolean m7341e(SSLSocket socket) {
        Comparator f;
        C9971q.m14633g(socket, "socket");
        if (!this.f27508a) {
            return false;
        }
        String[] strArr = this.f27511d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            f = C12120c.m7776f();
            if (!C12729c.m5600r(strArr, enabledProtocols, f)) {
                return false;
            }
        }
        String[] strArr2 = this.f27510c;
        if (strArr2 == null || C12729c.m5600r(strArr2, socket.getEnabledCipherSuites(), C12223g.f27484s1.m7349c())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12228j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f27508a;
        C12228j jVar = (C12228j) obj;
        if (z != jVar.f27508a) {
            return false;
        }
        if (!z || (Arrays.equals(this.f27510c, jVar.f27510c) && Arrays.equals(this.f27511d, jVar.f27511d) && this.f27509b == jVar.f27509b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m7340f() {
        return this.f27508a;
    }

    /* renamed from: h */
    public final boolean m7338h() {
        return this.f27509b;
    }

    public int hashCode() {
        int i;
        if (!this.f27508a) {
            return 17;
        }
        String[] strArr = this.f27510c;
        int i2 = 0;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i3 = (527 + i) * 31;
        String[] strArr2 = this.f27511d;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((i3 + i2) * 31) + (!this.f27509b ? 1 : 0);
    }

    /* renamed from: i */
    public final List<EnumC12249s> m7337i() {
        List<EnumC12249s> D0;
        String[] strArr = this.f27511d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC12249s.f27571r.m7263a(str));
        }
        D0 = C9914r.m14790D0(arrayList);
        return D0;
    }

    public String toString() {
        if (!this.f27508a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m7342d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m7337i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f27509b + ')';
    }
}
