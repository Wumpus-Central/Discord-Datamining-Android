package p389vj;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p307qj.C12228j;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lvj/b;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "sslSocket", "Lqj/j;", "a", "Ljava/io/IOException;", "e", "b", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "isFallback", "", "d", "Ljava/util/List;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.b */
/* loaded from: classes8.dex */
public final class C13540b {

    /* renamed from: a */
    private int f30243a;

    /* renamed from: b */
    private boolean f30244b;

    /* renamed from: c */
    private boolean f30245c;

    /* renamed from: d */
    private final List<C12228j> f30246d;

    public C13540b(List<C12228j> connectionSpecs) {
        C9971q.m14633g(connectionSpecs, "connectionSpecs");
        this.f30246d = connectionSpecs;
    }

    /* renamed from: c */
    private final boolean m3464c(SSLSocket sSLSocket) {
        int size = this.f30246d.size();
        for (int i = this.f30243a; i < size; i++) {
            if (this.f30246d.get(i).m7341e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C12228j m3466a(SSLSocket sslSocket) {
        C12228j jVar;
        C9971q.m14633g(sslSocket, "sslSocket");
        int i = this.f30243a;
        int size = this.f30246d.size();
        while (true) {
            if (i >= size) {
                jVar = null;
                break;
            }
            jVar = this.f30246d.get(i);
            if (jVar.m7341e(sslSocket)) {
                this.f30243a = i + 1;
                break;
            }
            i++;
        }
        if (jVar != null) {
            this.f30244b = m3464c(sslSocket);
            jVar.m7343c(sslSocket, this.f30245c);
            return jVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f30245c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f30246d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        C9971q.m14636d(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C9971q.m14634f(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m3465b(IOException e) {
        C9971q.m14633g(e, "e");
        this.f30245c = true;
        if (this.f30244b && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
