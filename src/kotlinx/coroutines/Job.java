package kotlinx.coroutines;

import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000  2\u00020\u0001:\u0001\u0017J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\"\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010H&J6\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010H'R\u0014\u0010\u0019\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m15073d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "C", "", ViewProps.START, "cause", "", "h", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "F0", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/a1;", "Q", "onCancelling", "invokeImmediately", "z", "b", "()Z", "isActive", "g", "isCompleted", "Lkotlin/sequences/Sequence;", "s", "()Lkotlin/sequences/Sequence;", "children", "e", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* loaded from: classes8.dex */
public interface Job extends CoroutineContext.AbstractC9924b {

    /* renamed from: e */
    public static final C9997b f22120e = C9997b.f22121k;

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: kotlinx.coroutines.Job$a */
    /* loaded from: classes8.dex */
    public static final class C9996a {
        /* renamed from: a */
        public static /* synthetic */ void m14571a(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                job.mo3911h(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m14570b(Job job, R r, Function2<? super R, ? super CoroutineContext.AbstractC9924b, ? extends R> function2) {
            return (R) CoroutineContext.AbstractC9924b.C9925a.m14710a(job, r, function2);
        }

        /* renamed from: c */
        public static <E extends CoroutineContext.AbstractC9924b> E m14569c(Job job, CoroutineContext.AbstractC9926c<E> cVar) {
            return (E) CoroutineContext.AbstractC9924b.C9925a.m14709b(job, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ AbstractC10000a1 m14568d(Job job, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return job.mo14510z(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static CoroutineContext m14567e(Job job, CoroutineContext.AbstractC9926c<?> cVar) {
            return CoroutineContext.AbstractC9924b.C9925a.m14708c(job, cVar);
        }

        /* renamed from: f */
        public static CoroutineContext m14566f(Job job, CoroutineContext coroutineContext) {
            return CoroutineContext.AbstractC9924b.C9925a.m14707d(job, coroutineContext);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lkotlinx/coroutines/Job$b;", "Lkotlin/coroutines/CoroutineContext$c;", "Lkotlinx/coroutines/Job;", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.Job$b */
    /* loaded from: classes8.dex */
    public static final class C9997b implements CoroutineContext.AbstractC9926c<Job> {

        /* renamed from: k */
        static final /* synthetic */ C9997b f22121k = new C9997b();

        private C9997b() {
        }
    }

    /* renamed from: C */
    CancellationException mo14559C();

    /* renamed from: F0 */
    AbstractC10213u mo14553F0(AbstractC10221w wVar);

    /* renamed from: Q */
    AbstractC10000a1 mo14535Q(Function1<? super Throwable, Unit> function1);

    /* renamed from: b */
    boolean mo3873b();

    /* renamed from: g */
    boolean mo14526g();

    /* renamed from: h */
    void mo3911h(CancellationException cancellationException);

    /* renamed from: s */
    Sequence<Job> mo14517s();

    boolean start();

    /* renamed from: z */
    AbstractC10000a1 mo14510z(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);
}
