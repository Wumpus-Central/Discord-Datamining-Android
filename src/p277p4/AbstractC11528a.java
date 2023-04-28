package p277p4;

import android.os.Looper;

/* renamed from: p4.a */
/* loaded from: classes7.dex */
public abstract class AbstractC11528a {

    /* renamed from: a */
    private static AbstractC11528a f25718a;

    /* renamed from: p4.a$a */
    /* loaded from: classes7.dex */
    public interface AbstractC0367a {
        void release();
    }

    /* renamed from: b */
    public static synchronized AbstractC11528a m9451b() {
        AbstractC11528a aVar;
        synchronized (AbstractC11528a.class) {
            if (f25718a == null) {
                f25718a = new C11529b();
            }
            aVar = f25718a;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m9450c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public abstract void mo9449a(AbstractC0367a aVar);

    /* renamed from: d */
    public abstract void mo9448d(AbstractC0367a aVar);
}
