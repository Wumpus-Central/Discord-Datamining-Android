package p372ui;

import kotlin.Metadata;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.C10160q;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10110p;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, m15073d2 = {"Lui/l;", "E", "Lui/w;", "Lui/u;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "Z", "", "W", "value", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;", "l", "(Ljava/lang/Object;)V", "closed", "Y", "", "toString", "", "n", "Ljava/lang/Throwable;", "closeCause", "e0", "()Ljava/lang/Throwable;", "sendException", "d0", "receiveException", "b0", "()Lui/l;", "offerResult", "c0", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.l */
/* loaded from: classes8.dex */
public final class C13348l<E> extends AbstractC13361w implements AbstractC13359u<E> {

    /* renamed from: n */
    public final Throwable f29909n;

    public C13348l(Throwable th2) {
        this.f29909n = th2;
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: W */
    public void mo3853W() {
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: Y */
    public void mo3851Y(C13348l<?> lVar) {
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: Z */
    public C10087d0 mo3850Z(C10110p.C10113c cVar) {
        C10087d0 d0Var = C10160q.f22367a;
        if (cVar != null) {
            cVar.m14240d();
        }
        return d0Var;
    }

    /* renamed from: b0 */
    public C13348l<E> mo3866a() {
        return this;
    }

    /* renamed from: c0 */
    public C13348l<E> mo3852X() {
        return this;
    }

    /* renamed from: d0 */
    public final Throwable m3891d0() {
        Throwable th2 = this.f29909n;
        return th2 == null ? new C13349m("Channel was closed") : th2;
    }

    /* renamed from: e0 */
    public final Throwable m3890e0() {
        Throwable th2 = this.f29909n;
        return th2 == null ? new C13350n("Channel was closed") : th2;
    }

    @Override // p372ui.AbstractC13359u
    /* renamed from: l */
    public void mo3865l(E e) {
    }

    @Override // kotlinx.coroutines.internal.C10110p
    public String toString() {
        return "Closed@" + C10149n0.m14164b(this) + '[' + this.f29909n + ']';
    }

    @Override // p372ui.AbstractC13359u
    /* renamed from: z */
    public C10087d0 mo3864z(E e, C10110p.C10113c cVar) {
        C10087d0 d0Var = C10160q.f22367a;
        if (cVar != null) {
            cVar.m14240d();
        }
        return d0Var;
    }
}
