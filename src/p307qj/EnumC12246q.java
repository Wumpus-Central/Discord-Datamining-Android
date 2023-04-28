package p307qj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m15073d2 = {"Lqj/q;", "", "", "toString", "k", "Ljava/lang/String;", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "s", "a", "l", "m", "n", "o", "p", "q", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.q */
/* loaded from: classes8.dex */
public enum EnumC12246q {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: s */
    public static final C12247a f27560s = new C12247a(null);

    /* renamed from: k */
    private final String f27561k;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m15073d2 = {"Lqj/q$a;", "", "", "protocol", "Lqj/q;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.q$a */
    /* loaded from: classes8.dex */
    public static final class C12247a {
        private C12247a() {
        }

        public /* synthetic */ C12247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC12246q m7269a(String protocol) {
            C9971q.m14633g(protocol, "protocol");
            EnumC12246q qVar = EnumC12246q.HTTP_1_0;
            if (!C9971q.m14638b(protocol, qVar.f27561k)) {
                qVar = EnumC12246q.HTTP_1_1;
                if (!C9971q.m14638b(protocol, qVar.f27561k)) {
                    qVar = EnumC12246q.H2_PRIOR_KNOWLEDGE;
                    if (!C9971q.m14638b(protocol, qVar.f27561k)) {
                        qVar = EnumC12246q.HTTP_2;
                        if (!C9971q.m14638b(protocol, qVar.f27561k)) {
                            qVar = EnumC12246q.SPDY_3;
                            if (!C9971q.m14638b(protocol, qVar.f27561k)) {
                                qVar = EnumC12246q.QUIC;
                                if (!C9971q.m14638b(protocol, qVar.f27561k)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return qVar;
        }
    }

    EnumC12246q(String str) {
        this.f27561k = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f27561k;
    }
}
