package p307qj;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.ByteString;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, m15073d2 = {"Lqj/l;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.l */
/* loaded from: classes8.dex */
public final class C12234l {

    /* renamed from: a */
    public static final C12234l f27539a = new C12234l();

    private C12234l() {
    }

    /* renamed from: a */
    public static final String m7310a(String username, String password, Charset charset) {
        C9971q.m14633g(username, "username");
        C9971q.m14633g(password, "password");
        C9971q.m14633g(charset, "charset");
        String a = ByteString.f25542o.m9691c(username + ':' + password, charset).mo9718a();
        return "Basic " + a;
    }
}
