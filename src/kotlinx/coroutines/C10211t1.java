package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R&\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m15073d2 = {"Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/a2;", "", "cause", "", "W", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "o", "Lkotlin/jvm/functions/Function1;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t1 */
/* loaded from: classes8.dex */
public final class C10211t1 extends AbstractC10001a2 {

    /* renamed from: o */
    private final Function1<Throwable, Unit> f22465o;

    /* JADX WARN: Multi-variable type inference failed */
    public C10211t1(Function1<? super Throwable, Unit> function1) {
        this.f22465o = function1;
    }

    @Override // kotlinx.coroutines.AbstractC10003b0
    /* renamed from: W */
    public void mo13984W(Throwable th2) {
        this.f22465o.invoke(th2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo13984W(th2);
        return Unit.f22042a;
    }
}
