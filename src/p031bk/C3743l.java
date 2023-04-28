package p031bk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lbk/l;", "Lbk/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "e", "", "a", "b", "", "hostname", "", "Lqj/q;", "protocols", "", "d", "c", "Lbk/m;", "delegate", "Lbk/l$a;", "Lbk/l$a;", "socketAdapterFactory", "<init>", "(Lbk/l$a;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.l */
/* loaded from: classes8.dex */
public final class C3743l implements AbstractC3745m {

    /* renamed from: a */
    private AbstractC3745m f6087a;

    /* renamed from: b */
    private final AbstractC3744a f6088b;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, m15073d2 = {"Lbk/l$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lbk/m;", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.l$a */
    /* loaded from: classes8.dex */
    public interface AbstractC3744a {
        /* renamed from: b */
        boolean mo33708b(SSLSocket sSLSocket);

        /* renamed from: c */
        AbstractC3745m mo33707c(SSLSocket sSLSocket);
    }

    public C3743l(AbstractC3744a socketAdapterFactory) {
        C9971q.m14633g(socketAdapterFactory, "socketAdapterFactory");
        this.f6088b = socketAdapterFactory;
    }

    /* renamed from: e */
    private final synchronized AbstractC3745m m33709e(SSLSocket sSLSocket) {
        if (this.f6087a == null && this.f6088b.mo33708b(sSLSocket)) {
            this.f6087a = this.f6088b.mo33707c(sSLSocket);
        }
        return this.f6087a;
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: a */
    public boolean mo33706a() {
        return true;
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: b */
    public boolean mo33705b(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        return this.f6088b.mo33708b(sslSocket);
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: c */
    public String mo33704c(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        AbstractC3745m e = m33709e(sslSocket);
        if (e != null) {
            return e.mo33704c(sslSocket);
        }
        return null;
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: d */
    public void mo33703d(SSLSocket sslSocket, String str, List<? extends EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        AbstractC3745m e = m33709e(sslSocket);
        if (e != null) {
            e.mo33703d(sslSocket, str, protocols);
        }
    }
}
