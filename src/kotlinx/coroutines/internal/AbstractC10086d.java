package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lkotlinx/coroutines/internal/d;", "T", "Lkotlinx/coroutines/internal/y;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "f", "()Ljava/lang/Object;", "consensus", "", "h", "()Z", "isDecided", "", "g", "()J", "opSequence", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.d */
/* loaded from: classes8.dex */
public abstract class AbstractC10086d<T> extends AbstractC10127y {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22274a = AtomicReferenceFieldUpdater.newUpdater(AbstractC10086d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C10084c.f22270a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC10127y
    /* renamed from: a */
    public AbstractC10086d<?> mo14024a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC10127y
    /* renamed from: c */
    public final Object mo14023c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C10084c.f22270a) {
            obj2 = m14333e(mo3922i(obj));
        }
        mo14002d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo14002d(T t, Object obj);

    /* renamed from: e */
    public final Object m14333e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C10084c.f22270a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C2113b.m38965a(f22274a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public final Object m14332f() {
        return this._consensus;
    }

    /* renamed from: g */
    public long mo14028g() {
        return 0L;
    }

    /* renamed from: h */
    public final boolean m14331h() {
        return this._consensus != C10084c.f22270a;
    }

    /* renamed from: i */
    public abstract Object mo3922i(T t);
}
