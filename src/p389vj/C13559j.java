package p389vj;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11067f;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, m15073d2 = {"Lvj/j;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "", "a", "<set-?>", "k", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "lastConnectException", "l", "b", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.j */
/* loaded from: classes8.dex */
public final class C13559j extends RuntimeException {

    /* renamed from: k */
    private IOException f30329k;

    /* renamed from: l */
    private final IOException f30330l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13559j(IOException firstConnectException) {
        super(firstConnectException);
        C9971q.m14633g(firstConnectException, "firstConnectException");
        this.f30330l = firstConnectException;
        this.f30329k = firstConnectException;
    }

    /* renamed from: a */
    public final void m3356a(IOException e) {
        C9971q.m14633g(e, "e");
        C11067f.m10981a(this.f30330l, e);
        this.f30329k = e;
    }

    /* renamed from: b */
    public final IOException m3355b() {
        return this.f30330l;
    }

    /* renamed from: c */
    public final IOException m3354c() {
        return this.f30329k;
    }
}
