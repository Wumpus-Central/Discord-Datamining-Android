package p231mb;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: mb.a */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC10579a implements View.OnTouchListener {

    /* renamed from: k */
    private final Dialog f23424k;

    /* renamed from: l */
    private final int f23425l;

    /* renamed from: m */
    private final int f23426m;

    /* renamed from: n */
    private final int f23427n;

    public View$OnTouchListenerC10579a(Dialog dialog, Rect rect) {
        this.f23424k = dialog;
        this.f23425l = rect.left;
        this.f23426m = rect.top;
        this.f23427n = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f23425l + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f23426m + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f23427n;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f23424k.onTouchEvent(obtain);
    }
}
