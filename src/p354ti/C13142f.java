package p354ti;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.react.bridge.BaseJavaModule;
import kotlin.Metadata;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\"\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m15073d2 = {"Landroid/os/Looper;", "", BaseJavaModule.METHOD_TYPE_ASYNC, "Landroid/os/Handler;", "a", "Lti/e;", "Lti/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: ti.f */
/* loaded from: classes8.dex */
public final class C13142f {

    /* renamed from: a */
    public static final AbstractC13141e f29445a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        AbstractC13141e eVar = null;
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11090s.m10940b(new C13138d(m4536a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        if (!C11090s.m10935g(obj)) {
            eVar = obj;
        }
        f29445a = eVar;
    }

    /* renamed from: a */
    public static final Handler m4536a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
