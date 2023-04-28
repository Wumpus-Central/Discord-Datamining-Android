package okhttp3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p307qj.C12231k;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\f"}, m15073d2 = {"Lokhttp3/CookieJar;", "", "Lokhttp3/HttpUrl;", "url", "", "Lqj/k;", "cookies", "", "saveFromResponse", "loadForRequest", "b", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public interface CookieJar {

    /* renamed from: b */
    public static final C11417a f25368b = new C11417a(null);

    /* renamed from: a */
    public static final CookieJar f25367a = new C11417a.C0363a();

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m15073d2 = {"Lokhttp3/CookieJar$a;", "", "Lokhttp3/CookieJar;", "NO_COOKIES", "Lokhttp3/CookieJar;", "<init>", "()V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.CookieJar$a */
    /* loaded from: classes8.dex */
    public static final class C11417a {

        @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, m15073d2 = {"Lokhttp3/CookieJar$a$a;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "Lqj/k;", "cookies", "", "saveFromResponse", "loadForRequest", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.CookieJar$a$a */
        /* loaded from: classes8.dex */
        private static final class C0363a implements CookieJar {
            @Override // okhttp3.CookieJar
            public List<C12231k> loadForRequest(HttpUrl url) {
                List<C12231k> i;
                C9971q.m14633g(url, "url");
                i = C9906j.m14820i();
                return i;
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<C12231k> cookies) {
                C9971q.m14633g(url, "url");
                C9971q.m14633g(cookies, "cookies");
            }
        }

        private C11417a() {
        }

        public /* synthetic */ C11417a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    List<C12231k> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<C12231k> list);
}
