package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.Ref$ObjectRef;
import p339sf.AbstractC12889d;
import p339sf.C12893f;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0080\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "addedContext", "d", "", "c", "originalContext", "appendContext", "isNewCoroutine", "a", "Lkotlin/coroutines/Continuation;", "", "oldValue", "Lkotlinx/coroutines/w2;", "g", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "f", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f0 */
/* loaded from: classes8.dex */
public final class C10025f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f0$a */
    /* loaded from: classes8.dex */
    public static final class C10026a extends AbstractC9973s implements Function2<CoroutineContext, CoroutineContext.AbstractC9924b, CoroutineContext> {

        /* renamed from: k */
        public static final C10026a f22162k = new C10026a();

        C10026a() {
            super(2);
        }

        /* renamed from: a */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.AbstractC9924b bVar) {
            if (bVar instanceof AbstractC10021e0) {
                return coroutineContext.mo3485f0(((AbstractC10021e0) bVar).m14476S());
            }
            return coroutineContext.mo3485f0(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f0$b */
    /* loaded from: classes8.dex */
    public static final class C10027b extends AbstractC9973s implements Function2<CoroutineContext, CoroutineContext.AbstractC9924b, CoroutineContext> {

        /* renamed from: k */
        final /* synthetic */ Ref$ObjectRef<CoroutineContext> f22163k;

        /* renamed from: l */
        final /* synthetic */ boolean f22164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10027b(Ref$ObjectRef<CoroutineContext> ref$ObjectRef, boolean z) {
            super(2);
            this.f22163k = ref$ObjectRef;
            this.f22164l = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
        /* renamed from: a */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.AbstractC9924b bVar) {
            if (!(bVar instanceof AbstractC10021e0)) {
                return coroutineContext.mo3485f0(bVar);
            }
            CoroutineContext.AbstractC9924b i = this.f22163k.f22069k.mo3484i(bVar.getKey());
            if (i == null) {
                AbstractC10021e0 e0Var = (AbstractC10021e0) bVar;
                if (this.f22164l) {
                    e0Var = e0Var.m14476S();
                }
                return coroutineContext.mo3485f0(e0Var);
            }
            Ref$ObjectRef<CoroutineContext> ref$ObjectRef = this.f22163k;
            ref$ObjectRef.f22069k = ref$ObjectRef.f22069k.mo3483j0(bVar.getKey());
            return coroutineContext.mo3485f0(((AbstractC10021e0) bVar).m14475r(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$b;", "it", "a", "(ZLkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Boolean;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f0$c */
    /* loaded from: classes8.dex */
    public static final class C10028c extends AbstractC9973s implements Function2<Boolean, CoroutineContext.AbstractC9924b, Boolean> {

        /* renamed from: k */
        public static final C10028c f22165k = new C10028c();

        C10028c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m14453a(boolean z, CoroutineContext.AbstractC9924b bVar) {
            return Boolean.valueOf(z || (bVar instanceof AbstractC10021e0));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.AbstractC9924b bVar) {
            return m14453a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    private static final CoroutineContext m14462a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean c = m14460c(coroutineContext);
        boolean c2 = m14460c(coroutineContext2);
        if (!c && !c2) {
            return coroutineContext.mo3485f0(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f22069k = coroutineContext2;
        C12893f fVar = C12893f.f28966k;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.mo3482w0(fVar, new C10027b(ref$ObjectRef, z));
        if (c2) {
            ref$ObjectRef.f22069k = ((CoroutineContext) ref$ObjectRef.f22069k).mo3482w0(fVar, C10026a.f22162k);
        }
        return coroutineContext3.mo3485f0((CoroutineContext) ref$ObjectRef.f22069k);
    }

    /* renamed from: b */
    public static final String m14461b(CoroutineContext coroutineContext) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m14460c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.mo3482w0(Boolean.FALSE, C10028c.f22165k)).booleanValue();
    }

    /* renamed from: d */
    public static final CoroutineContext m14459d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!m14460c(coroutineContext2)) {
            return coroutineContext.mo3485f0(coroutineContext2);
        }
        return m14462a(coroutineContext, coroutineContext2, false);
    }

    /* renamed from: e */
    public static final CoroutineContext m14458e(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext a = m14462a(coroutineScope.getCoroutineContext(), coroutineContext, true);
        if (a == C10230y0.m13947a() || a.mo3484i(AbstractC12889d.f28964h) != null) {
            return a;
        }
        return a.mo3485f0(C10230y0.m13947a());
    }

    /* renamed from: f */
    public static final C10224w2<?> m14457f(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C10218v0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof C10224w2) {
                return (C10224w2) coroutineStackFrame;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C10224w2<?> m14456g(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        boolean z;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.mo3484i(C10228x2.f22475k) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C10224w2<?> f = m14457f((CoroutineStackFrame) continuation);
        if (f != null) {
            f.m13966W0(coroutineContext, obj);
        }
        return f;
    }
}
