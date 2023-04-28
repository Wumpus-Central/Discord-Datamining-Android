package fk;

import androidx.camera.view.C2062h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lfk/v;", "", "Lfk/u;", "c", "segment", "", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lfk/u;", "LOCK", "HASH_BUCKET_COUNT", "", "d", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.v */
/* loaded from: classes8.dex */
public final class C7379v {

    /* renamed from: c */
    private static final int f15895c;

    /* renamed from: d */
    private static final AtomicReference<C7377u>[] f15896d;

    /* renamed from: e */
    public static final C7379v f15897e = new C7379v();

    /* renamed from: a */
    private static final int f15893a = 65536;

    /* renamed from: b */
    private static final C7377u f15894b = new C7377u(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15895c = highestOneBit;
        AtomicReference<C7377u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f15896d = atomicReferenceArr;
    }

    private C7379v() {
    }

    /* renamed from: a */
    private final AtomicReference<C7377u> m22772a() {
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        return f15896d[(int) (currentThread.getId() & (f15895c - 1))];
    }

    /* renamed from: b */
    public static final void m22771b(C7377u segment) {
        boolean z;
        AtomicReference<C7377u> a;
        C7377u uVar;
        int i;
        C9971q.m14633g(segment, "segment");
        if (segment.f15891f == null && segment.f15892g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!segment.f15889d && (uVar = (a = f15897e.m22772a()).get()) != f15894b) {
            if (uVar != null) {
                i = uVar.f15888c;
            } else {
                i = 0;
            }
            if (i < f15893a) {
                segment.f15891f = uVar;
                segment.f15887b = 0;
                segment.f15888c = i + 8192;
                if (!C2062h.m39137a(a, uVar, segment)) {
                    segment.f15891f = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static final C7377u m22770c() {
        AtomicReference<C7377u> a = f15897e.m22772a();
        C7377u uVar = f15894b;
        C7377u andSet = a.getAndSet(uVar);
        if (andSet == uVar) {
            return new C7377u();
        }
        if (andSet == null) {
            a.set(null);
            return new C7377u();
        }
        a.set(andSet.f15891f);
        andSet.f15891f = null;
        andSet.f15888c = 0;
        return andSet;
    }
}
