package p031bk;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015ak.C1457k;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0011"}, m15073d2 = {"Lbk/c;", "Lbk/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "a", "", "c", "hostname", "", "Lqj/q;", "protocols", "", "d", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
@SuppressLint({"NewApi"})
/* renamed from: bk.c */
/* loaded from: classes8.dex */
public final class C3726c implements AbstractC3745m {

    /* renamed from: a */
    public static final C3727a f6063a = new C3727a(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, m15073d2 = {"Lbk/c$a;", "", "Lbk/m;", "a", "", "b", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.c$a */
    /* loaded from: classes8.dex */
    public static final class C3727a {
        private C3727a() {
        }

        public /* synthetic */ C3727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC3745m m33730a() {
            if (m33729b()) {
                return new C3726c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m33729b() {
            return C1457k.f517c.m41078h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: a */
    public boolean mo33706a() {
        return f6063a.m33729b();
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: b */
    public boolean mo33705b(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        C9971q.m14633g(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // p031bk.AbstractC3745m
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public String mo33704c(SSLSocket sslSocket) {
        String applicationProtocol;
        C9971q.m14633g(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // p031bk.AbstractC3745m
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo33703d(SSLSocket sslSocket, String str, List<? extends EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            C9971q.m14634f(sslParameters, "sslParameters");
            Object[] array = C1457k.f517c.m41084b(protocols).toArray(new String[0]);
            if (array != null) {
                sslParameters.setApplicationProtocols((String[]) array);
                sslSocket.setSSLParameters(sslParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
