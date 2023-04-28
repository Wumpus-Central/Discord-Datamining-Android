package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u000b*\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/x;", "a", "Lkotlinx/coroutines/a1;", "handle", "f", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "c", "h", "g", "e", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/JobKt")
/* renamed from: kotlinx.coroutines.z1 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10236z1 {
    /* renamed from: a */
    public static final AbstractC10225x m13941a(Job job) {
        return new C10223w1(job);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC10225x m13940b(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return C10227x1.m13960a(job);
    }

    /* renamed from: c */
    public static final void m13939c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.mo3484i(Job.f22120e);
        if (job != null) {
            job.mo3911h(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m13938d(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C10227x1.m13958c(coroutineContext, cancellationException);
    }

    /* renamed from: e */
    public static final void m13937e(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence<Job> s;
        Job job = (Job) coroutineContext.mo3484i(Job.f22120e);
        if (!(job == null || (s = job.mo14517s()) == null)) {
            for (Job job2 : s) {
                job2.mo3911h(cancellationException);
            }
        }
    }

    /* renamed from: f */
    public static final AbstractC10000a1 m13936f(Job job, AbstractC10000a1 a1Var) {
        return job.mo14535Q(new C10012c1(a1Var));
    }

    /* renamed from: g */
    public static final void m13935g(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.mo3484i(Job.f22120e);
        if (job != null) {
            C10227x1.m13952i(job);
        }
    }

    /* renamed from: h */
    public static final void m13934h(Job job) {
        if (!job.mo3873b()) {
            throw job.mo14559C();
        }
    }
}
