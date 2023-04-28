package re;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lre/a;", "", "", "capacity", "Ljava/nio/ByteBuffer;", "a", "c", "byteBuffer", "", "d", "b", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/util/concurrent/LinkedBlockingQueue;", "bufferQueue", "", "Z", "isDirect", "<init>", "(Z)V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* renamed from: re.a */
/* loaded from: classes6.dex */
public final class C12572a {

    /* renamed from: a */
    private final LinkedBlockingQueue<ByteBuffer> f28273a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private final boolean f28274b;

    public C12572a(boolean z) {
        this.f28274b = z;
    }

    /* renamed from: a */
    private final ByteBuffer m6504a(int i) {
        if (this.f28274b) {
            ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
            C9971q.m14634f(order, "ByteBuffer.allocateDirec…(ByteOrder.LITTLE_ENDIAN)");
            return order;
        }
        ByteBuffer order2 = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        C9971q.m14634f(order2, "ByteBuffer.allocate(capa…(ByteOrder.LITTLE_ENDIAN)");
        return order2;
    }

    /* renamed from: b */
    public final void m6503b() {
        this.f28273a.clear();
    }

    /* renamed from: c */
    public final ByteBuffer m6502c(int i) {
        ByteBuffer poll = this.f28273a.poll();
        if (poll != null) {
            if (poll.capacity() < i) {
                poll = m6504a(i);
            }
            if (poll != null) {
                return poll;
            }
        }
        return m6504a(i);
    }

    /* renamed from: d */
    public final void m6501d(ByteBuffer byteBuffer) {
        C9971q.m14633g(byteBuffer, "byteBuffer");
        byteBuffer.clear();
        this.f28273a.put(byteBuffer);
    }
}
