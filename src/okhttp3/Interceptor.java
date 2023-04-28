package okhttp3;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, m15073d2 = {"Lokhttp3/Interceptor;", "", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Chain", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public interface Interceptor {

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, m15073d2 = {"Lokhttp3/Interceptor$Chain;", "", "Lokhttp3/Request;", "b", "request", "Lokhttp3/Response;", "a", "Lokhttp3/Call;", "call", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public interface Chain {
        /* renamed from: a */
        Response mo2360a(Request request);

        /* renamed from: b */
        Request mo2359b();

        Call call();
    }

    Response intercept(Chain chain);
}
