package p450yj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lyj/n;", "Ljava/io/IOException;", "Lyj/b;", "k", "Lyj/b;", "errorCode", "<init>", "(Lyj/b;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.n */
/* loaded from: classes8.dex */
public final class C14494n extends IOException {

    /* renamed from: k */
    public final EnumC14449b f32875k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14494n(EnumC14449b errorCode) {
        super("stream was reset: " + errorCode);
        C9971q.m14633g(errorCode, "errorCode");
        this.f32875k = errorCode;
    }
}
