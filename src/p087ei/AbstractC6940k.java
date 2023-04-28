package p087ei;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ei.k */
/* loaded from: classes8.dex */
public interface AbstractC6940k {

    /* renamed from: a */
    public static final C6941a f15092a = C6941a.f15093a;

    /* renamed from: ei.k$a */
    /* loaded from: classes8.dex */
    public static final class C6941a {

        /* renamed from: a */
        static final /* synthetic */ C6941a f15093a = new C6941a();

        private C6941a() {
        }

        /* renamed from: a */
        public final C6918d m23905a(Runnable runnable, Function1<? super InterruptedException, Unit> function1) {
            if (runnable == null || function1 == null) {
                return new C6918d(null, 1, null);
            }
            return new C6917c(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
