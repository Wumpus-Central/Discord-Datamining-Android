package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import p372ui.EnumC13337e;
import tf.C13080d;
import vi.AbstractC13514d;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R9\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m15073d2 = {"Lkotlinx/coroutines/flow/c;", "T", "Lvi/d;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "n", "Lkotlin/jvm/functions/Function2;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lui/e;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILui/e;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.c */
/* loaded from: classes8.dex */
class C10038c<T> extends AbstractC13514d<T> {

    /* renamed from: n */
    private final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> f22183n;

    /* JADX WARN: Multi-variable type inference failed */
    public C10038c(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        super(coroutineContext, i, eVar);
        this.f22183n = function2;
    }

    /* renamed from: i */
    static /* synthetic */ Object m14433i(C10038c cVar, ProducerScope producerScope, Continuation continuation) {
        Object d;
        Object invoke = cVar.f22183n.invoke(producerScope, continuation);
        d = C13080d.m4646d();
        return invoke == d ? invoke : Unit.f22042a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vi.AbstractC13514d
    /* renamed from: d */
    public Object mo3491d(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return m14433i(this, producerScope, continuation);
    }

    @Override // vi.AbstractC13514d
    public String toString() {
        return "block[" + this.f22183n + "] -> " + super.toString();
    }
}
