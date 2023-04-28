package p372ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.C10125x;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0011"}, m15073d2 = {"Lui/z;", "E", "Lui/y;", "", "R", "", "a0", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "p", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "pollResult", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.z */
/* loaded from: classes8.dex */
public final class C13365z<E> extends C13364y<E> {

    /* renamed from: p */
    public final Function1<E, Unit> f29919p;

    /* JADX WARN: Multi-variable type inference failed */
    public C13365z(E e, CancellableContinuation<? super Unit> cancellableContinuation, Function1<? super E, Unit> function1) {
        super(e, cancellableContinuation);
        this.f29919p = function1;
    }

    @Override // kotlinx.coroutines.internal.C10110p
    /* renamed from: R */
    public boolean mo3849R() {
        if (!super.mo3849R()) {
            return false;
        }
        mo3848a0();
        return true;
    }

    @Override // p372ui.AbstractC13361w
    /* renamed from: a0 */
    public void mo3848a0() {
        C10125x.m14202b(this.f29919p, mo3852X(), this.f29918o.getContext());
    }
}
