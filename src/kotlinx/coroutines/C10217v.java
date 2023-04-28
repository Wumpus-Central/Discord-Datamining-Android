package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/u;", "", "cause", "", "W", "", "c", "Lkotlinx/coroutines/w;", "o", "Lkotlinx/coroutines/w;", "childJob", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/w;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v */
/* loaded from: classes8.dex */
public final class C10217v extends AbstractC10219v1 implements AbstractC10213u {

    /* renamed from: o */
    public final AbstractC10221w f22469o;

    public C10217v(AbstractC10221w wVar) {
        this.f22469o = wVar;
    }

    @Override // kotlinx.coroutines.AbstractC10003b0
    /* renamed from: W */
    public void mo13984W(Throwable th2) {
        this.f22469o.mo13978H(m14564X());
    }

    @Override // kotlinx.coroutines.AbstractC10213u
    /* renamed from: c */
    public boolean mo13983c(Throwable th2) {
        return m14564X().mo3481N(th2);
    }

    @Override // kotlinx.coroutines.AbstractC10213u
    public Job getParent() {
        return m14564X();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        mo13984W(th2);
        return Unit.f22042a;
    }
}
