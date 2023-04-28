package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import p339sf.AbstractC12889d;
import p339sf.C12893f;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m15073d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.k */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10134k {
    /* renamed from: a */
    public static final <T> T m14189a(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContext2;
        AbstractC10022e1 e1Var;
        AbstractC10022e1 e1Var2;
        Thread currentThread = Thread.currentThread();
        AbstractC12889d dVar = (AbstractC12889d) coroutineContext.mo3484i(AbstractC12889d.f28964h);
        if (dVar == null) {
            e1Var = C10167r2.f22370a.m14102b();
            coroutineContext2 = C10025f0.m14458e(C10150n1.f22356k, coroutineContext.mo3485f0(e1Var));
        } else {
            AbstractC10022e1 e1Var3 = null;
            if (dVar instanceof AbstractC10022e1) {
                e1Var2 = (AbstractC10022e1) dVar;
            } else {
                e1Var2 = null;
            }
            if (e1Var2 != null) {
                if (e1Var2.m14465V0()) {
                    e1Var3 = e1Var2;
                }
                if (e1Var3 != null) {
                    e1Var = e1Var3;
                    coroutineContext2 = C10025f0.m14458e(C10150n1.f22356k, coroutineContext);
                }
            }
            e1Var = C10167r2.f22370a.m14103a();
            coroutineContext2 = C10025f0.m14458e(C10150n1.f22356k, coroutineContext);
        }
        C10072h hVar = new C10072h(coroutineContext2, currentThread, e1Var);
        hVar.m14565T0(EnumC10140l0.DEFAULT, hVar, function2);
        return (T) hVar.m14353U0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m14188b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C12893f.f28966k;
        }
        return C10129j.m14194e(coroutineContext, function2);
    }
}
