package dk;

import fk.C7382y;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12727a;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u001a"}, m15073d2 = {"Ldk/d;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "h", "hostname", "g", "b", "d", "pattern", "f", "", "type", "", "c", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "e", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: dk.d */
/* loaded from: classes8.dex */
public final class C6523d implements HostnameVerifier {

    /* renamed from: a */
    public static final C6523d f13667a = new C6523d();

    private C6523d() {
    }

    /* renamed from: b */
    private final String m25373b(String str) {
        if (!m25371d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C9971q.m14634f(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            C9971q.m14634f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    private final List<String> m25372c(X509Certificate x509Certificate, int i) {
        List<String> i2;
        List<String> i3;
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!C9971q.m14638b(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            i3 = C9906j.m14820i();
            return i3;
        } catch (CertificateParsingException unused) {
            i2 = C9906j.m14820i();
            return i2;
        }
    }

    /* renamed from: d */
    private final boolean m25371d(String str) {
        return str.length() == ((int) C7382y.m22765b(str, 0, 0, 3, null));
    }

    /* renamed from: f */
    private final boolean m25369f(String str, String str2) {
        boolean z;
        boolean H;
        boolean s;
        boolean z2;
        boolean H2;
        boolean s2;
        boolean s3;
        boolean s4;
        boolean M;
        boolean H3;
        int Y;
        boolean s5;
        int d0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            H = C12718u.m5736H(str, ".", false, 2, null);
            if (!H) {
                s = C12718u.m5733s(str, "..", false, 2, null);
                if (!s) {
                    if (str2 == null || str2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        H2 = C12718u.m5736H(str2, ".", false, 2, null);
                        if (!H2) {
                            s2 = C12718u.m5733s(str2, "..", false, 2, null);
                            if (!s2) {
                                s3 = C12718u.m5733s(str, ".", false, 2, null);
                                if (!s3) {
                                    str = str + ".";
                                }
                                s4 = C12718u.m5733s(str2, ".", false, 2, null);
                                if (!s4) {
                                    str2 = str2 + ".";
                                }
                                String b = m25373b(str2);
                                M = C12719v.m5709M(b, "*", false, 2, null);
                                if (!M) {
                                    return C9971q.m14638b(str, b);
                                }
                                H3 = C12718u.m5736H(b, "*.", false, 2, null);
                                if (H3) {
                                    Y = C12719v.m5687Y(b, '*', 1, false, 4, null);
                                    if (Y != -1 || str.length() < b.length() || C9971q.m14638b("*.", b)) {
                                        return false;
                                    }
                                    String substring = b.substring(1);
                                    C9971q.m14634f(substring, "(this as java.lang.String).substring(startIndex)");
                                    s5 = C12718u.m5733s(str, substring, false, 2, null);
                                    if (!s5) {
                                        return false;
                                    }
                                    int length = str.length() - substring.length();
                                    if (length > 0) {
                                        d0 = C12719v.m5682d0(str, '.', length - 1, false, 4, null);
                                        if (d0 != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m25368g(String str, X509Certificate x509Certificate) {
        String b = m25373b(str);
        List<String> c = m25372c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (f13667a.m25369f(b, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m25367h(String str, X509Certificate x509Certificate) {
        String e = C12727a.m5644e(str);
        List<String> c = m25372c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (C9971q.m14638b(e, C12727a.m5644e(str2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> m25374a(X509Certificate certificate) {
        List<String> o0;
        C9971q.m14633g(certificate, "certificate");
        o0 = C9914r.m14750o0(m25372c(certificate, 7), m25372c(certificate, 2));
        return o0;
    }

    /* renamed from: e */
    public final boolean m25370e(String host, X509Certificate certificate) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(certificate, "certificate");
        if (C12729c.m5612f(host)) {
            return m25367h(host, certificate);
        }
        return m25368g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Certificate certificate;
        C9971q.m14633g(host, "host");
        C9971q.m14633g(session, "session");
        if (m25371d(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return m25370e(host, (X509Certificate) certificate);
    }
}
