package p372ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.C10160q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10110p;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m15073d2 = {"Lui/y;", "E", "Lui/w;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "Z", "", "W", "Lui/l;", "closed", "Y", "", "toString", "n", "Ljava/lang/Object;", "X", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/CancellableContinuation;", "o", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.y */
/* loaded from: classes8.dex */
public class C13364y<E> extends AbstractC13361w {

    /* renamed from: n */
    private final E f29917n;

    /* renamed from: o */
    public final CancellableContinuation<Unit> f29918o;

    /* JADX WARN: Multi-variable type inference failed */
    public C13364y(E e, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f29917n = e;
        this.f29918o = cancellableContinuation;
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: W */
    public void mo3853W() {
        this.f29918o.mo14151B(C10160q.f22367a);
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: X */
    public E mo3852X() {
        return this.f29917n;
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: Y */
    public void mo3851Y(C13348l<?> lVar) {
        CancellableContinuation<Unit> cancellableContinuation = this.f29918o;
        C11090s.C11091a aVar = C11090s.f24606l;
        cancellableContinuation.resumeWith(C11090s.m10940b(C11093t.m10931a(lVar.m3890e0())));
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: Z */
    public C10087d0 mo3850Z(C10110p.C10113c cVar) {
        C10110p.AbstractC10111a aVar;
        CancellableContinuation<Unit> cancellableContinuation = this.f29918o;
        Unit unit = Unit.f22042a;
        if (cVar != null) {
            aVar = cVar.f22314c;
        } else {
            aVar = null;
        }
        if (cancellableContinuation.mo14132j(unit, aVar) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.m14240d();
        }
        return C10160q.f22367a;
    }

    @Override // kotlinx.coroutines.internal.C10110p
    public String toString() {
        return C10149n0.m14165a(this) + '@' + C10149n0.m14164b(this) + '(' + mo3852X() + ')';
    }
}
