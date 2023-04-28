package p372ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C10077i0;
import kotlinx.coroutines.channels.ProducerScope;
import p372ui.AbstractC13362x;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m15073d2 = {"Lui/r;", "E", "Lui/g;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "value", "V0", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "R0", "b", "()Z", "isActive", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lui/f;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lui/f;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.r */
/* loaded from: classes8.dex */
public final class C13356r<E> extends C13340g<E> implements ProducerScope<E> {
    public C13356r(CoroutineContext coroutineContext, AbstractC13338f<E> fVar) {
        super(coroutineContext, fVar, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC9998a
    /* renamed from: R0 */
    protected void mo3876R0(Throwable th2, boolean z) {
        if (!m3912U0().mo3857t(th2) && !z) {
            C10077i0.m14350a(getContext(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V0 */
    public void mo3875S0(Unit unit) {
        AbstractC13362x.C13363a.m3854a(m3912U0(), null, 1, null);
    }

    @Override // kotlinx.coroutines.AbstractC9998a, kotlinx.coroutines.C10005b2, kotlinx.coroutines.Job
    /* renamed from: b */
    public boolean mo3873b() {
        return super.mo3873b();
    }
}
