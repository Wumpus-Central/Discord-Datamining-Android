package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlinx.coroutines.internal.C10092g;
import kotlinx.coroutines.internal.C10094h;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m15073d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z2 */
/* loaded from: classes8.dex */
public final class C10237z2 {
    /* renamed from: a */
    public static final Object m13933a(Continuation<? super Unit> continuation) {
        Continuation c;
        C10092g gVar;
        Object obj;
        Object d;
        Object d2;
        CoroutineContext context = continuation.getContext();
        C10227x1.m13953h(context);
        c = C13076c.m4647c(continuation);
        if (c instanceof C10092g) {
            gVar = (C10092g) c;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            obj = Unit.f22042a;
        } else {
            if (gVar.f22280n.mo4545I0(context)) {
                gVar.m14318n(context, Unit.f22042a);
            } else {
                C10232y2 y2Var = new C10232y2();
                CoroutineContext f0 = context.mo3485f0(y2Var);
                Unit unit = Unit.f22042a;
                gVar.m14318n(f0, unit);
                if (y2Var.f22486l) {
                    if (C10094h.m14304d(gVar)) {
                        obj = C13080d.m4646d();
                    } else {
                        obj = unit;
                    }
                }
            }
            obj = C13080d.m4646d();
        }
        d = C13080d.m4646d();
        if (obj == d) {
            C9933g.m14691c(continuation);
        }
        d2 = C13080d.m4646d();
        if (obj == d2) {
            return obj;
        }
        return Unit.f22042a;
    }
}
