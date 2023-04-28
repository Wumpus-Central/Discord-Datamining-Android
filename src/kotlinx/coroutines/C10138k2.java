package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.internal.C10110p;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/g;", "", "cause", "", "a", "", "toString", "Lkotlinx/coroutines/internal/p;", "k", "Lkotlinx/coroutines/internal/p;", "node", "<init>", "(Lkotlinx/coroutines/internal/p;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k2 */
/* loaded from: classes8.dex */
final class C10138k2 extends AbstractC10067g {

    /* renamed from: k */
    private final C10110p f22343k;

    public C10138k2(C10110p pVar) {
        this.f22343k = pVar;
    }

    @Override // kotlinx.coroutines.AbstractC10152o
    /* renamed from: a */
    public void mo3945a(Throwable th2) {
        this.f22343k.mo3849R();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo3945a(th2);
        return Unit.f22042a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f22343k + ']';
    }
}
