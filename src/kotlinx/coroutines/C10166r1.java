package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/n;", "", "cause", "", "a", "", "toString", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "k", "Lkotlin/jvm/functions/Function1;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.r1 */
/* loaded from: classes8.dex */
final class C10166r1 extends AbstractC10148n {

    /* renamed from: k */
    private final Function1<Throwable, Unit> f22369k;

    /* JADX WARN: Multi-variable type inference failed */
    public C10166r1(Function1<? super Throwable, Unit> function1) {
        this.f22369k = function1;
    }

    @Override // kotlinx.coroutines.AbstractC10152o
    /* renamed from: a */
    public void mo3945a(Throwable th2) {
        this.f22369k.invoke(th2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo3945a(th2);
        return Unit.f22042a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C10149n0.m14165a(this.f22369k) + '@' + C10149n0.m14164b(this) + ']';
    }
}
