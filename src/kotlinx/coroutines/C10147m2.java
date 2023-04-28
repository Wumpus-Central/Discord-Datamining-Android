package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.AbstractC10198d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR3\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m15073d2 = {"Lkotlinx/coroutines/m2;", "T", "R", "Lkotlinx/coroutines/a2;", "", "cause", "", "W", "Lkotlinx/coroutines/selects/d;", "o", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "p", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.m2 */
/* loaded from: classes8.dex */
public final class C10147m2<T, R> extends AbstractC10001a2 {

    /* renamed from: o */
    private final AbstractC10198d<R> f22354o;

    /* renamed from: p */
    private final Function2<T, Continuation<? super R>, Object> f22355p;

    /* JADX WARN: Multi-variable type inference failed */
    public C10147m2(AbstractC10198d<? super R> dVar, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f22354o = dVar;
        this.f22355p = function2;
    }

    @Override // kotlinx.coroutines.AbstractC10003b0
    /* renamed from: W */
    public void mo13984W(Throwable th2) {
        if (this.f22354o.mo14019s()) {
            m14564X().m14556D0(this.f22354o, this.f22355p);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo13984W(th2);
        return Unit.f22042a;
    }
}
