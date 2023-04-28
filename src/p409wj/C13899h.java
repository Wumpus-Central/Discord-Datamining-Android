package p409wj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m15073d2 = {"Lwj/h;", "Lokhttp3/ResponseBody;", "", "contentLength", "Lokhttp3/MediaType;", "contentType", "Lokio/BufferedSource;", "source", "", "k", "Ljava/lang/String;", "contentTypeString", "l", "J", "m", "Lokio/BufferedSource;", "<init>", "(Ljava/lang/String;JLokio/BufferedSource;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.h */
/* loaded from: classes8.dex */
public final class C13899h extends ResponseBody {

    /* renamed from: k */
    private final String f31338k;

    /* renamed from: l */
    private final long f31339l;

    /* renamed from: m */
    private final BufferedSource f31340m;

    public C13899h(String str, long j, BufferedSource source) {
        C9971q.m14633g(source, "source");
        this.f31338k = str;
        this.f31339l = j;
        this.f31340m = source;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f31339l;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.f31338k;
        if (str != null) {
            return MediaType.f25402g.m9979b(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return this.f31340m;
    }
}
