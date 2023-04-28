package p307qj;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB;\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001f¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000b\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\u001e\u001a\u00020\u0007*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001d¨\u0006#"}, m15073d2 = {"Lqj/o;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "Ljava/security/cert/Certificate;", "a", "Lkotlin/Lazy;", "d", "()Ljava/util/List;", "peerCertificates", "Lqj/s;", "b", "Lqj/s;", "e", "()Lqj/s;", "tlsVersion", "Lqj/g;", "c", "Lqj/g;", "()Lqj/g;", "cipherSuite", "Ljava/util/List;", "localCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lqj/s;Lqj/g;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.o */
/* loaded from: classes8.dex */
public final class C12241o {

    /* renamed from: e */
    public static final C12242a f27544e = new C12242a(null);

    /* renamed from: a */
    private final Lazy f27545a;

    /* renamed from: b */
    private final EnumC12249s f27546b;

    /* renamed from: c */
    private final C12223g f27547c;

    /* renamed from: d */
    private final List<Certificate> f27548d;

    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0014"}, m15073d2 = {"Lqj/o$a;", "", "", "Ljava/security/cert/Certificate;", "", "c", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lqj/o;", "a", "(Ljavax/net/ssl/SSLSession;)Lqj/o;", "Lqj/s;", "tlsVersion", "Lqj/g;", "cipherSuite", "peerCertificates", "localCertificates", "b", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.o$a */
    /* loaded from: classes8.dex */
    public static final class C12242a {

        @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
        /* renamed from: qj.o$a$a */
        /* loaded from: classes8.dex */
        static final class C0394a extends AbstractC9973s implements Function0<List<? extends Certificate>> {

            /* renamed from: k */
            final /* synthetic */ List f27549k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0394a(List list) {
                super(0);
                this.f27549k = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f27549k;
            }
        }

        @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
        /* renamed from: qj.o$a$b */
        /* loaded from: classes8.dex */
        static final class C12243b extends AbstractC9973s implements Function0<List<? extends Certificate>> {

            /* renamed from: k */
            final /* synthetic */ List f27550k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12243b(List list) {
                super(0);
                this.f27550k = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f27550k;
            }
        }

        private C12242a() {
        }

        public /* synthetic */ C12242a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        private final List<Certificate> m7272c(Certificate[] certificateArr) {
            List<Certificate> i;
            if (certificateArr != null) {
                return C12729c.m5598t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            i = C9906j.m14820i();
            return i;
        }

        /* renamed from: a */
        public final C12241o m7274a(SSLSession handshake) {
            List<Certificate> list;
            C9971q.m14633g(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                C12223g b = C12223g.f27484s1.m7350b(cipherSuite);
                String protocol = handshake.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!C9971q.m14638b("NONE", protocol)) {
                    EnumC12249s a = EnumC12249s.f27571r.m7263a(protocol);
                    try {
                        list = m7272c(handshake.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = C9906j.m14820i();
                    }
                    return new C12241o(a, b, m7272c(handshake.getLocalCertificates()), new C12243b(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        /* renamed from: b */
        public final C12241o m7273b(EnumC12249s tlsVersion, C12223g cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            C9971q.m14633g(tlsVersion, "tlsVersion");
            C9971q.m14633g(cipherSuite, "cipherSuite");
            C9971q.m14633g(peerCertificates, "peerCertificates");
            C9971q.m14633g(localCertificates, "localCertificates");
            return new C12241o(tlsVersion, cipherSuite, C12729c.m5625R(localCertificates), new C0394a(C12729c.m5625R(peerCertificates)));
        }
    }

    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: qj.o$b */
    /* loaded from: classes8.dex */
    static final class C12244b extends AbstractC9973s implements Function0<List<? extends Certificate>> {

        /* renamed from: k */
        final /* synthetic */ Function0 f27551k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12244b(Function0 function0) {
            super(0);
            this.f27551k = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            List<? extends Certificate> i;
            try {
                return (List) this.f27551k.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                i = C9906j.m14820i();
                return i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12241o(EnumC12249s tlsVersion, C12223g cipherSuite, List<? extends Certificate> localCertificates, Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Lazy a;
        C9971q.m14633g(tlsVersion, "tlsVersion");
        C9971q.m14633g(cipherSuite, "cipherSuite");
        C9971q.m14633g(localCertificates, "localCertificates");
        C9971q.m14633g(peerCertificatesFn, "peerCertificatesFn");
        this.f27546b = tlsVersion;
        this.f27547c = cipherSuite;
        this.f27548d = localCertificates;
        a = C11084n.m10945a(new C12244b(peerCertificatesFn));
        this.f27545a = a;
    }

    /* renamed from: b */
    private final String m7278b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C9971q.m14634f(type, "type");
        return type;
    }

    /* renamed from: a */
    public final C12223g m7279a() {
        return this.f27547c;
    }

    /* renamed from: c */
    public final List<Certificate> m7277c() {
        return this.f27548d;
    }

    /* renamed from: d */
    public final List<Certificate> m7276d() {
        return (List) this.f27545a.getValue();
    }

    /* renamed from: e */
    public final EnumC12249s m7275e() {
        return this.f27546b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12241o) {
            C12241o oVar = (C12241o) obj;
            if (oVar.f27546b == this.f27546b && C9971q.m14638b(oVar.f27547c, this.f27547c) && C9971q.m14638b(oVar.m7276d(), m7276d()) && C9971q.m14638b(oVar.f27548d, this.f27548d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f27546b.hashCode()) * 31) + this.f27547c.hashCode()) * 31) + m7276d().hashCode()) * 31) + this.f27548d.hashCode();
    }

    public String toString() {
        int t;
        int t2;
        List<Certificate> d = m7276d();
        t = C9907k.m14809t(d, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Certificate certificate : d) {
            arrayList.add(m7278b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f27546b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f27547c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f27548d;
        t2 = C9907k.m14809t(list, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        for (Certificate certificate2 : list) {
            arrayList2.add(m7278b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
