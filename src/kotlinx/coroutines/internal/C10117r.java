package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/internal/r;", "", "E", "", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "d", "()Ljava/lang/Object;", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.r */
/* loaded from: classes8.dex */
public class C10117r<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22319a = AtomicReferenceFieldUpdater.newUpdater(C10117r.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C10117r(boolean z) {
        this._cur = new C10118s(8, z);
    }

    /* renamed from: a */
    public final boolean m14231a(E e) {
        while (true) {
            C10118s sVar = (C10118s) this._cur;
            int a = sVar.m14227a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C2113b.m38965a(f22319a, this, sVar, sVar.m14219i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m14230b() {
        while (true) {
            C10118s sVar = (C10118s) this._cur;
            if (!sVar.m14224d()) {
                C2113b.m38965a(f22319a, this, sVar, sVar.m14219i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int m14229c() {
        return ((C10118s) this._cur).m14222f();
    }

    /* renamed from: d */
    public final E m14228d() {
        while (true) {
            C10118s sVar = (C10118s) this._cur;
            E e = (E) sVar.m14218j();
            if (e != C10118s.f22323h) {
                return e;
            }
            C2113b.m38965a(f22319a, this, sVar, sVar.m14219i());
        }
    }
}
