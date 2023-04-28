package p307qj;

import dk.AbstractC6521c;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import p326ri.C12718u;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0003\b\f\u000fB#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\"J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m15073d2 = {"Lqj/e;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lqj/e$c;", "c", "Ldk/c;", "certificateChainCleaner", "e", "(Ldk/c;)Lqj/e;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "pins", "Ldk/c;", "d", "()Ldk/c;", "<init>", "(Ljava/util/Set;Ldk/c;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.e */
/* loaded from: classes8.dex */
public final class C12217e {

    /* renamed from: a */
    private final Set<C12220c> f27418a;

    /* renamed from: b */
    private final AbstractC6521c f27419b;

    /* renamed from: d */
    public static final C12219b f27417d = new C12219b(null);

    /* renamed from: c */
    public static final C12217e f27416c = new C12218a().m7365a();

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lqj/e$a;", "", "Lqj/e;", "a", "", "Lqj/e$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.e$a */
    /* loaded from: classes8.dex */
    public static final class C12218a {

        /* renamed from: a */
        private final List<C12220c> f27420a = new ArrayList();

        /* renamed from: a */
        public final C12217e m7365a() {
            Set H0;
            H0 = C9914r.m14786H0(this.f27420a);
            return new C12217e(H0, null, 2, null);
        }
    }

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m15073d2 = {"Lqj/e$b;", "", "Ljava/security/cert/X509Certificate;", "Lokio/ByteString;", "b", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "Lqj/e;", "DEFAULT", "Lqj/e;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.e$b */
    /* loaded from: classes8.dex */
    public static final class C12219b {
        private C12219b() {
        }

        public /* synthetic */ C12219b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m7364a(Certificate certificate) {
            C9971q.m14633g(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + m7362c((X509Certificate) certificate).mo9718a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final ByteString m7363b(X509Certificate sha1Hash) {
            C9971q.m14633g(sha1Hash, "$this$sha1Hash");
            ByteString.C11437a aVar = ByteString.f25542o;
            PublicKey publicKey = sha1Hash.getPublicKey();
            C9971q.m14634f(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C9971q.m14634f(encoded, "publicKey.encoded");
            return ByteString.C11437a.m9687g(aVar, encoded, 0, 0, 3, null).m9699t();
        }

        /* renamed from: c */
        public final ByteString m7362c(X509Certificate sha256Hash) {
            C9971q.m14633g(sha256Hash, "$this$sha256Hash");
            ByteString.C11437a aVar = ByteString.f25542o;
            PublicKey publicKey = sha256Hash.getPublicKey();
            C9971q.m14634f(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C9971q.m14634f(encoded, "publicKey.encoded");
            return ByteString.C11437a.m9687g(aVar, encoded, 0, 0, 3, null).m9698u();
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, m15073d2 = {"Lqj/e$c;", "", "", "hostname", "", "c", "toString", "other", "equals", "", "hashCode", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "pattern", "b", "hashAlgorithm", "Lokio/ByteString;", "Lokio/ByteString;", "()Lokio/ByteString;", "hash", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.e$c */
    /* loaded from: classes8.dex */
    public static final class C12220c {

        /* renamed from: a */
        private final String f27421a;

        /* renamed from: b */
        private final String f27422b;

        /* renamed from: c */
        private final ByteString f27423c;

        /* renamed from: a */
        public final ByteString m7361a() {
            return this.f27423c;
        }

        /* renamed from: b */
        public final String m7360b() {
            return this.f27422b;
        }

        /* renamed from: c */
        public final boolean m7359c(String hostname) {
            boolean H;
            boolean H2;
            boolean y;
            int d0;
            boolean y2;
            C9971q.m14633g(hostname, "hostname");
            H = C12718u.m5736H(this.f27421a, "**.", false, 2, null);
            if (H) {
                int length = this.f27421a.length() - 3;
                int length2 = hostname.length() - length;
                y2 = C12718u.m5727y(hostname, hostname.length() - length, this.f27421a, 3, length, false, 16, null);
                if (!y2) {
                    return false;
                }
                if (!(length2 == 0 || hostname.charAt(length2 - 1) == '.')) {
                    return false;
                }
            } else {
                H2 = C12718u.m5736H(this.f27421a, "*.", false, 2, null);
                if (!H2) {
                    return C9971q.m14638b(hostname, this.f27421a);
                }
                int length3 = this.f27421a.length() - 1;
                int length4 = hostname.length() - length3;
                y = C12718u.m5727y(hostname, hostname.length() - length3, this.f27421a, 1, length3, false, 16, null);
                if (!y) {
                    return false;
                }
                d0 = C12719v.m5682d0(hostname, '.', length4 - 1, false, 4, null);
                if (d0 != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12220c)) {
                return false;
            }
            C12220c cVar = (C12220c) obj;
            if (!(!C9971q.m14638b(this.f27421a, cVar.f27421a)) && !(!C9971q.m14638b(this.f27422b, cVar.f27422b)) && !(!C9971q.m14638b(this.f27423c, cVar.f27423c))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f27421a.hashCode() * 31) + this.f27422b.hashCode()) * 31) + this.f27423c.hashCode();
        }

        public String toString() {
            return this.f27422b + '/' + this.f27423c.mo9718a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: qj.e$d */
    /* loaded from: classes8.dex */
    public static final class C12221d extends AbstractC9973s implements Function0<List<? extends X509Certificate>> {

        /* renamed from: l */
        final /* synthetic */ List f27425l;

        /* renamed from: m */
        final /* synthetic */ String f27426m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12221d(List list, String str) {
            super(0);
            this.f27425l = list;
            this.f27426m = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> list;
            int t;
            AbstractC6521c d = C12217e.this.m7367d();
            if (d == null || (list = d.mo25376a(this.f27425l, this.f27426m)) == null) {
                list = this.f27425l;
            }
            t = C9907k.m14809t(list, 10);
            ArrayList arrayList = new ArrayList(t);
            for (Certificate certificate : list) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
    }

    public C12217e(Set<C12220c> pins, AbstractC6521c cVar) {
        C9971q.m14633g(pins, "pins");
        this.f27418a = pins;
        this.f27419b = cVar;
    }

    /* renamed from: a */
    public final void m7370a(String hostname, List<? extends Certificate> peerCertificates) {
        C9971q.m14633g(hostname, "hostname");
        C9971q.m14633g(peerCertificates, "peerCertificates");
        m7369b(hostname, new C12221d(peerCertificates, hostname));
    }

    /* renamed from: b */
    public final void m7369b(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        C9971q.m14633g(hostname, "hostname");
        C9971q.m14633g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<C12220c> c = m7368c(hostname);
        if (!c.isEmpty()) {
            List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : list) {
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (C12220c cVar : c) {
                    String b = cVar.m7360b();
                    int hashCode = b.hashCode();
                    if (hashCode != -903629273) {
                        if (hashCode == 3528965 && b.equals("sha1")) {
                            if (byteString2 == null) {
                                byteString2 = f27417d.m7363b(x509Certificate);
                            }
                            if (C9971q.m14638b(cVar.m7361a(), byteString2)) {
                                return;
                            }
                        }
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.m7360b());
                    } else if (b.equals("sha256")) {
                        if (byteString == null) {
                            byteString = f27417d.m7362c(x509Certificate);
                        }
                        if (C9971q.m14638b(cVar.m7361a(), byteString)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.m7360b());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb2.append("\n    ");
                sb2.append(f27417d.m7364a(x509Certificate2));
                sb2.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C9971q.m14634f(subjectDN, "element.subjectDN");
                sb2.append(subjectDN.getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(hostname);
            sb2.append(":");
            for (C12220c cVar2 : c) {
                sb2.append("\n    ");
                sb2.append(cVar2);
            }
            String sb3 = sb2.toString();
            C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    /* renamed from: c */
    public final List<C12220c> m7368c(String hostname) {
        List<C12220c> i;
        C9971q.m14633g(hostname, "hostname");
        Set<C12220c> set = this.f27418a;
        i = C9906j.m14820i();
        for (Object obj : set) {
            if (((C12220c) obj).m7359c(hostname)) {
                if (i.isEmpty()) {
                    i = new ArrayList<>();
                }
                C9964l0.m14655b(i).add(obj);
            }
        }
        return i;
    }

    /* renamed from: d */
    public final AbstractC6521c m7367d() {
        return this.f27419b;
    }

    /* renamed from: e */
    public final C12217e m7366e(AbstractC6521c certificateChainCleaner) {
        C9971q.m14633g(certificateChainCleaner, "certificateChainCleaner");
        if (C9971q.m14638b(this.f27419b, certificateChainCleaner)) {
            return this;
        }
        return new C12217e(this.f27418a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12217e) {
            C12217e eVar = (C12217e) obj;
            if (C9971q.m14638b(eVar.f27418a, this.f27418a) && C9971q.m14638b(eVar.f27419b, this.f27419b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.f27418a.hashCode()) * 41;
        AbstractC6521c cVar = this.f27419b;
        if (cVar != null) {
            i = cVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public /* synthetic */ C12217e(Set set, AbstractC6521c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : cVar);
    }
}
