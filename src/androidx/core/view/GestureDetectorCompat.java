package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    private final AbstractC2528a f3503a;

    /* renamed from: androidx.core.view.GestureDetectorCompat$a */
    /* loaded from: classes.dex */
    interface AbstractC2528a {
        /* renamed from: b */
        boolean mo37551b(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$b */
    /* loaded from: classes.dex */
    static class C2529b implements AbstractC2528a {

        /* renamed from: a */
        private final GestureDetector f3504a;

        C2529b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3504a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.AbstractC2528a
        /* renamed from: b */
        public boolean mo37551b(MotionEvent motionEvent) {
            return this.f3504a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m37552a(MotionEvent motionEvent) {
        return this.f3503a.mo37551b(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f3503a = new C2529b(context, onGestureListener, handler);
    }
}
