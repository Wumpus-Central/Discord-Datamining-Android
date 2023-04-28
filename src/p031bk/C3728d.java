package p031bk;

import android.net.http.X509TrustManagerExtensions;
import dk.AbstractC6521c;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m15073d2 = {"Lbk/d;", "Ldk/c;", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "other", "", "equals", "", "hashCode", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "c", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.d */
/* loaded from: classes8.dex */
public final class C3728d extends AbstractC6521c {

    /* renamed from: d */
    public static final C3729a f6064d = new C3729a(null);

    /* renamed from: b */
    private final X509TrustManager f6065b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f6066c;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m15073d2 = {"Lbk/d$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbk/d;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.d$a */
    /* loaded from: classes8.dex */
    public static final class C3729a {
        private C3729a() {
        }

        public /* synthetic */ C3729a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3728d m33728a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C9971q.m14633g(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C3728d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C3728d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C9971q.m14633g(trustManager, "trustManager");
        C9971q.m14633g(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f6065b = trustManager;
        this.f6066c = x509TrustManagerExtensions;
    }

    @Override // dk.AbstractC6521c
    /* renamed from: a */
    public List<Certificate> mo25376a(List<? extends Certificate> chain, String hostname) {
        C9971q.m14633g(chain, "chain");
        C9971q.m14633g(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f6066c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
                C9971q.m14634f(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3728d) && ((C3728d) obj).f6065b == this.f6065b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f6065b);
    }
}
