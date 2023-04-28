package p420x9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: x9.h */
/* loaded from: classes5.dex */
public abstract class AbstractC13977h {

    /* renamed from: a */
    private static int f31526a = 4225;

    /* renamed from: b */
    private static final Object f31527b = new Object();

    /* renamed from: c */
    private static C13995m1 f31528c = null;

    /* renamed from: d */
    static HandlerThread f31529d = null;

    /* renamed from: e */
    private static boolean f31530e = false;

    /* renamed from: a */
    public static int m2106a() {
        return f31526a;
    }

    /* renamed from: b */
    public static AbstractC13977h m2105b(Context context) {
        Looper looper;
        synchronized (f31527b) {
            if (f31528c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f31530e) {
                    looper = m2104c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f31528c = new C13995m1(applicationContext, looper);
            }
        }
        return f31528c;
    }

    /* renamed from: c */
    public static HandlerThread m2104c() {
        synchronized (f31527b) {
            HandlerThread handlerThread = f31529d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f31529d = handlerThread2;
            handlerThread2.start();
            return f31529d;
        }
    }

    /* renamed from: d */
    protected abstract void mo2079d(C13982i1 i1Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m2103e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo2079d(new C13982i1(str, str2, i, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo2078f(C13982i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
