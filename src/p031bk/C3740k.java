package p031bk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import p015ak.C1445e;
import p015ak.C1457k;
import p031bk.C3743l;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011"}, m15073d2 = {"Lbk/k;", "Lbk/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "a", "", "c", "hostname", "", "Lqj/q;", "protocols", "", "d", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.k */
/* loaded from: classes8.dex */
public final class C3740k implements AbstractC3745m {

    /* renamed from: b */
    public static final C3742b f6086b = new C3742b(null);

    /* renamed from: a */
    private static final C3743l.AbstractC3744a f6085a = new C3741a();

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m15073d2 = {"bk/k$a", "Lbk/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lbk/m;", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.k$a */
    /* loaded from: classes8.dex */
    public static final class C3741a implements C3743l.AbstractC3744a {
        C3741a() {
        }

        @Override // p031bk.C3743l.AbstractC3744a
        /* renamed from: b */
        public boolean mo33708b(SSLSocket sslSocket) {
            C9971q.m14633g(sslSocket, "sslSocket");
            if (!C1445e.f498f.m41113c() || !Conscrypt.isConscrypt(sslSocket)) {
                return false;
            }
            return true;
        }

        @Override // p031bk.C3743l.AbstractC3744a
        /* renamed from: c */
        public AbstractC3745m mo33707c(SSLSocket sslSocket) {
            C9971q.m14633g(sslSocket, "sslSocket");
            return new C3740k();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m15073d2 = {"Lbk/k$b;", "", "Lbk/l$a;", "factory", "Lbk/l$a;", "a", "()Lbk/l$a;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.k$b */
    /* loaded from: classes8.dex */
    public static final class C3742b {
        private C3742b() {
        }

        public /* synthetic */ C3742b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3743l.AbstractC3744a m33710a() {
            return C3740k.f6085a;
        }
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: a */
    public boolean mo33706a() {
        return C1445e.f498f.m41113c();
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: b */
    public boolean mo33705b(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: c */
    public String mo33704c(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        if (mo33705b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: d */
    public void mo33703d(SSLSocket sslSocket, String str, List<? extends EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        if (mo33705b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C1457k.f517c.m41084b(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
