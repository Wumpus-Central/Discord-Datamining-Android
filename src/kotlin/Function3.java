package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9968n;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m15073d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/coroutines/Continuation;", "", "a", "Lkotlin/jvm/functions/Function3;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: vi.o  reason: from Kotlin metadata and invalid package */
/* loaded from: classes8.dex */
public final class Function3 {

    /* renamed from: a */
    private static final kotlin.jvm.functions.Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> f30230a = (kotlin.jvm.functions.Function3) C9964l0.m14653d(C13532a.f30231k, 3);

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: vi.o$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C13532a extends C9968n implements kotlin.jvm.functions.Function3<FlowCollector<? super Object>, Object, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        public static final C13532a f30231k = new C13532a();

        C13532a() {
            super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object invoke(FlowCollector<Object> flowCollector, Object obj, Continuation<? super Unit> continuation) {
            return flowCollector.emit(obj, continuation);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ kotlin.jvm.functions.Function3 m3472a() {
        return f30230a;
    }
}
