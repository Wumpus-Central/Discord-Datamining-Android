package kotlinx.coroutines;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.internal.C10083b0;
import kotlinx.coroutines.internal.C10095h0;
import p339sf.AbstractC12889d;
import p339sf.C12893f;
import p429xi.C14169a;
import p429xi.C14170b;
import tf.C13080d;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aR\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/l0;", ViewProps.START, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlinx/coroutines/Job;", "c", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "T", "Lkotlinx/coroutines/q0;", "a", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/q0;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.l */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10139l {
    /* renamed from: a */
    public static final <T> AbstractC10161q0<T> m14177a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        C10165r0 r0Var;
        CoroutineContext e = C10025f0.m14458e(coroutineScope, coroutineContext);
        if (l0Var.m14170c()) {
            r0Var = new C10017d2(e, function2);
        } else {
            r0Var = new C10165r0(e, true);
        }
        ((AbstractC9998a) r0Var).m14565T0(l0Var, r0Var, function2);
        return r0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC10161q0 m14176b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C12893f.f28966k;
        }
        if ((i & 2) != 0) {
            l0Var = EnumC10140l0.DEFAULT;
        }
        return C10129j.m14198a(coroutineScope, coroutineContext, l0Var, function2);
    }

    /* renamed from: c */
    public static final Job m14175c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        AbstractC9998a aVar;
        CoroutineContext e = C10025f0.m14458e(coroutineScope, coroutineContext);
        if (l0Var.m14170c()) {
            aVar = new C10023e2(e, function2);
        } else {
            aVar = new C10151n2(e, true);
        }
        aVar.m14565T0(l0Var, aVar, function2);
        return aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ Job m14174d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C12893f.f28966k;
        }
        if ((i & 2) != 0) {
            l0Var = EnumC10140l0.DEFAULT;
        }
        return C10129j.m14196c(coroutineScope, coroutineContext, l0Var, function2);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: e */
    public static final <T> Object m14173e(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object obj;
        Object d;
        CoroutineContext context = continuation.getContext();
        CoroutineContext d2 = C10025f0.m14459d(context, coroutineContext);
        C10227x1.m13953h(d2);
        if (d2 == context) {
            C10083b0 b0Var = new C10083b0(d2, continuation);
            obj = C14170b.m1463d(b0Var, b0Var, function2);
        } else {
            AbstractC12889d.C12891b bVar = AbstractC12889d.f28964h;
            if (C9971q.m14638b(d2.mo3484i(bVar), context.mo3484i(bVar))) {
                C10224w2 w2Var = new C10224w2(d2, continuation);
                Object c = C10095h0.m14301c(d2, null);
                try {
                    Object d3 = C14170b.m1463d(w2Var, w2Var, function2);
                    C10095h0.m14303a(d2, c);
                    obj = d3;
                } catch (Throwable th2) {
                    C10095h0.m14303a(d2, c);
                    throw th2;
                }
            } else {
                C10218v0 v0Var = new C10218v0(d2, continuation);
                C14169a.m1467e(function2, v0Var, v0Var, null, 4, null);
                obj = v0Var.m13981V0();
            }
        }
        d = C13080d.m4646d();
        if (obj == d) {
            C9933g.m14691c(continuation);
        }
        return obj;
    }
}
