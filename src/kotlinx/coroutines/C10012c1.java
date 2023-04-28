package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/a2;", "", "cause", "", "W", "Lkotlinx/coroutines/a1;", "o", "Lkotlinx/coroutines/a1;", "handle", "<init>", "(Lkotlinx/coroutines/a1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c1 */
/* loaded from: classes8.dex */
public final class C10012c1 extends AbstractC10001a2 {

    /* renamed from: o */
    private final AbstractC10000a1 f22140o;

    public C10012c1(AbstractC10000a1 a1Var) {
        this.f22140o = a1Var;
    }

    @Override // kotlinx.coroutines.AbstractC10003b0
    /* renamed from: W */
    public void mo13984W(Throwable th2) {
        this.f22140o.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo13984W(th2);
        return Unit.f22042a;
    }
}
