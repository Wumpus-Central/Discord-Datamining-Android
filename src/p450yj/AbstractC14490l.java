package p450yj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, m15073d2 = {"Lyj/l;", "", "", "streamId", "", "Lyj/c;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/BufferedSource;", "source", "byteCount", "d", "Lyj/b;", "errorCode", "", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.l */
/* loaded from: classes8.dex */
public interface AbstractC14490l {

    /* renamed from: b */
    public static final C14491a f32871b = new C14491a(null);

    /* renamed from: a */
    public static final AbstractC14490l f32870a = new C14491a.C0473a();

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m15073d2 = {"Lyj/l$a;", "", "Lyj/l;", "CANCEL", "Lyj/l;", "<init>", "()V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.l$a */
    /* loaded from: classes8.dex */
    public static final class C14491a {

        @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, m15073d2 = {"Lyj/l$a$a;", "Lyj/l;", "", "streamId", "", "Lyj/c;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/BufferedSource;", "source", "byteCount", "d", "Lyj/b;", "errorCode", "", "c", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: yj.l$a$a */
        /* loaded from: classes8.dex */
        private static final class C0473a implements AbstractC14490l {
            @Override // p450yj.AbstractC14490l
            /* renamed from: a */
            public boolean mo358a(int i, List<C14451c> requestHeaders) {
                C9971q.m14633g(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p450yj.AbstractC14490l
            /* renamed from: b */
            public boolean mo357b(int i, List<C14451c> responseHeaders, boolean z) {
                C9971q.m14633g(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p450yj.AbstractC14490l
            /* renamed from: c */
            public void mo356c(int i, EnumC14449b errorCode) {
                C9971q.m14633g(errorCode, "errorCode");
            }

            @Override // p450yj.AbstractC14490l
            /* renamed from: d */
            public boolean mo355d(int i, BufferedSource source, int i2, boolean z) {
                C9971q.m14633g(source, "source");
                source.skip(i2);
                return true;
            }
        }

        private C14491a() {
        }

        public /* synthetic */ C14491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    boolean mo358a(int i, List<C14451c> list);

    /* renamed from: b */
    boolean mo357b(int i, List<C14451c> list, boolean z);

    /* renamed from: c */
    void mo356c(int i, EnumC14449b bVar);

    /* renamed from: d */
    boolean mo355d(int i, BufferedSource bufferedSource, int i2, boolean z);
}
