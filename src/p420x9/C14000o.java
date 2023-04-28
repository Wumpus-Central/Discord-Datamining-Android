package p420x9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.AbstractC13473g;
import p384v9.AbstractC13478k;
import p384v9.C13477j;

/* renamed from: x9.o */
/* loaded from: classes5.dex */
public class C14000o {

    /* renamed from: a */
    private static final AbstractC13998n0 f31572a = new C13985j0();

    /* renamed from: x9.o$a */
    /* loaded from: classes5.dex */
    public interface AbstractC14001a<R extends AbstractC13478k, T> {
        /* renamed from: a */
        T mo2064a(R r);
    }

    /* renamed from: a */
    public static <R extends AbstractC13478k, T extends C13477j<R>> Task<T> m2067a(AbstractC13473g<R> gVar, T t) {
        return m2066b(gVar, new C13991l0(t));
    }

    /* renamed from: b */
    public static <R extends AbstractC13478k, T> Task<T> m2066b(AbstractC13473g<R> gVar, AbstractC14001a<R, T> aVar) {
        AbstractC13998n0 n0Var = f31572a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.addStatusListener(new C13988k0(gVar, taskCompletionSource, aVar, n0Var));
        return taskCompletionSource.m28902a();
    }

    /* renamed from: c */
    public static <R extends AbstractC13478k> Task<Void> m2065c(AbstractC13473g<R> gVar) {
        return m2066b(gVar, new C13994m0());
    }
}
