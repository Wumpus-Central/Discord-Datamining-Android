package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lkotlinx/coroutines/t;", "Lkotlinx/coroutines/v1;", "", "cause", "", "W", "Lkotlinx/coroutines/p;", "o", "Lkotlinx/coroutines/p;", "child", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t */
/* loaded from: classes8.dex */
public final class C10209t extends AbstractC10219v1 {

    /* renamed from: o */
    public final C10156p<?> f22464o;

    public C10209t(C10156p<?> pVar) {
        this.f22464o = pVar;
    }

    @Override // kotlinx.coroutines.AbstractC10003b0
    /* renamed from: W */
    public void mo13984W(Throwable th2) {
        C10156p<?> pVar = this.f22464o;
        pVar.m14144I(pVar.m14118x(m14564X()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo13984W(th2);
        return Unit.f22042a;
    }
}
