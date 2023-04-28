package vi;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C10083b0;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010¨\u0006\b"}, m15073d2 = {"Lvi/n;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "a", "Lkotlinx/coroutines/Job;", "collectJob", "b", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: vi.p */
/* loaded from: classes8.dex */
public final class C13533p {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(ILkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: vi.p$a */
    /* loaded from: classes8.dex */
    public static final class C13534a extends AbstractC9973s implements Function2<Integer, CoroutineContext.AbstractC9924b, Integer> {

        /* renamed from: k */
        final /* synthetic */ C13530n<?> f30232k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13534a(C13530n<?> nVar) {
            super(2);
            this.f30232k = nVar;
        }

        /* renamed from: a */
        public final Integer m3468a(int i, CoroutineContext.AbstractC9924b bVar) {
            int i2;
            CoroutineContext.AbstractC9926c<?> key = bVar.getKey();
            CoroutineContext.AbstractC9924b i3 = this.f30232k.f30225l.mo3484i(key);
            if (key != Job.f22120e) {
                if (bVar != i3) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = i + 1;
                }
                return Integer.valueOf(i2);
            }
            Job job = (Job) i3;
            Job b = C13533p.m3469b((Job) bVar, job);
            if (b == job) {
                if (job != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.AbstractC9924b bVar) {
            return m3468a(num.intValue(), bVar);
        }
    }

    /* renamed from: a */
    public static final void m3470a(C13530n<?> nVar, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.mo3482w0(0, new C13534a(nVar))).intValue() != nVar.f30226m) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + nVar.f30225l + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final Job m3469b(Job job, Job job2) {
        while (job != null) {
            if (job == job2) {
                return job;
            }
            if (!(job instanceof C10083b0)) {
                return job;
            }
            job = ((C10083b0) job).m14336U0();
        }
        return null;
    }
}
