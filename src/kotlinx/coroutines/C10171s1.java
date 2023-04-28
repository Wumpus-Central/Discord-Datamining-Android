package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/v1;", "", "cause", "", "W", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "o", "Lkotlin/jvm/functions/Function1;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.s1 */
/* loaded from: classes8.dex */
final class C10171s1 extends AbstractC10219v1 {

    /* renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22373p = AtomicIntegerFieldUpdater.newUpdater(C10171s1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: o */
    private final Function1<Throwable, Unit> f22374o;

    /* JADX WARN: Multi-variable type inference failed */
    public C10171s1(Function1<? super Throwable, Unit> function1) {
        this.f22374o = function1;
    }

    @Override // kotlinx.coroutines.AbstractC10003b0
    /* renamed from: W */
    public void mo13984W(Throwable th2) {
        if (f22373p.compareAndSet(this, 0, 1)) {
            this.f22374o.invoke(th2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo13984W(th2);
        return Unit.f22042a;
    }
}
