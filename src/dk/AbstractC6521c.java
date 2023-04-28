package dk;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015ak.C1457k;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n"}, m15073d2 = {"Ldk/c;", "", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: dk.c */
/* loaded from: classes8.dex */
public abstract class AbstractC6521c {

    /* renamed from: a */
    public static final C6522a f13666a = new C6522a(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m15073d2 = {"Ldk/c$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ldk/c;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: dk.c$a */
    /* loaded from: classes8.dex */
    public static final class C6522a {
        private C6522a() {
        }

        public /* synthetic */ C6522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC6521c m25375a(X509TrustManager trustManager) {
            C9971q.m14633g(trustManager, "trustManager");
            return C1457k.f517c.m41079g().mo41099c(trustManager);
        }
    }

    /* renamed from: a */
    public abstract List<Certificate> mo25376a(List<? extends Certificate> list, String str);
}
