package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ContextAwareHelper {

    /* renamed from: a */
    private final Set<OnContextAvailableListener> f621a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f622b;

    /* renamed from: a */
    public void m40999a(OnContextAvailableListener onContextAvailableListener) {
        if (this.f622b != null) {
            onContextAvailableListener.mo36251a(this.f622b);
        }
        this.f621a.add(onContextAvailableListener);
    }

    /* renamed from: b */
    public void m40998b() {
        this.f622b = null;
    }

    /* renamed from: c */
    public void m40997c(Context context) {
        this.f622b = context;
        for (OnContextAvailableListener onContextAvailableListener : this.f621a) {
            onContextAvailableListener.mo36251a(context);
        }
    }

    /* renamed from: d */
    public Context m40996d() {
        return this.f622b;
    }

    /* renamed from: e */
    public void m40995e(OnContextAvailableListener onContextAvailableListener) {
        this.f621a.remove(onContextAvailableListener);
    }
}
