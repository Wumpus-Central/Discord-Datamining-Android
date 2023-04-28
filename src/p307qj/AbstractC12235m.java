package p307qj;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, m15073d2 = {"Lqj/m;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "b", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.m */
/* loaded from: classes8.dex */
public interface AbstractC12235m {

    /* renamed from: b */
    public static final C12236a f27541b = new C12236a(null);

    /* renamed from: a */
    public static final AbstractC12235m f27540a = new C12236a.C0393a();

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m15073d2 = {"Lqj/m$a;", "", "Lqj/m;", "SYSTEM", "Lqj/m;", "<init>", "()V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.m$a */
    /* loaded from: classes8.dex */
    public static final class C12236a {

        @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m15073d2 = {"Lqj/m$a$a;", "Lqj/m;", "", "hostname", "", "Ljava/net/InetAddress;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: qj.m$a$a */
        /* loaded from: classes8.dex */
        private static final class C0393a implements AbstractC12235m {
            @Override // p307qj.AbstractC12235m
            /* renamed from: a */
            public List<InetAddress> mo7309a(String hostname) {
                List<InetAddress> u0;
                C9971q.m14633g(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    C9971q.m14634f(allByName, "InetAddress.getAllByName(hostname)");
                    u0 = C9899f.m14914u0(allByName);
                    return u0;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C12236a() {
        }

        public /* synthetic */ C12236a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    List<InetAddress> mo7309a(String str);
}
