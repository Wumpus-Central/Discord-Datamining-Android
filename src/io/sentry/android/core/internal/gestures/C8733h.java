package io.sentry.android.core.internal.gestures;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C8951o3;
import io.sentry.EnumC8866f4;

/* renamed from: io.sentry.android.core.internal.gestures.h */
/* loaded from: classes8.dex */
public final class C8733h extends Window$CallbackC8740m {

    /* renamed from: l */
    private final Window.Callback f19319l;

    /* renamed from: m */
    private final GestureDetector$OnGestureListenerC8730g f19320m;

    /* renamed from: n */
    private final GestureDetectorCompat f19321n;

    /* renamed from: o */
    private final C8951o3 f19322o;

    /* renamed from: p */
    private final AbstractC8735b f19323p;

    /* renamed from: io.sentry.android.core.internal.gestures.h$a */
    /* loaded from: classes8.dex */
    class C8734a implements AbstractC8735b {
        C8734a() {
        }

        @Override // io.sentry.android.core.internal.gestures.C8733h.AbstractC8735b
        /* renamed from: a */
        public /* synthetic */ MotionEvent mo18237a(MotionEvent motionEvent) {
            return C8736i.m18236a(this, motionEvent);
        }
    }

    /* renamed from: io.sentry.android.core.internal.gestures.h$b */
    /* loaded from: classes8.dex */
    interface AbstractC8735b {
        /* renamed from: a */
        MotionEvent mo18237a(MotionEvent motionEvent);
    }

    public C8733h(Window.Callback callback, Context context, GestureDetector$OnGestureListenerC8730g gVar, C8951o3 o3Var) {
        this(callback, new GestureDetectorCompat(context, gVar), gVar, o3Var, new C8734a());
    }

    /* renamed from: b */
    private void m18239b(MotionEvent motionEvent) {
        this.f19321n.m37552a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f19320m.m18254q(motionEvent);
        }
    }

    /* renamed from: a */
    public Window.Callback m18240a() {
        return this.f19319l;
    }

    /* renamed from: c */
    public void m18238c() {
        this.f19320m.m18252s(EnumC8866f4.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                m18239b(this.f19323p.mo18237a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i, Menu menu) {
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i) {
        return super.onCreatePanelView(i);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i, View view, Menu menu) {
        return super.onPreparePanel(i, view, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    C8733h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, GestureDetector$OnGestureListenerC8730g gVar, C8951o3 o3Var, AbstractC8735b bVar) {
        super(callback);
        this.f19319l = callback;
        this.f19320m = gVar;
        this.f19322o = o3Var;
        this.f19321n = gestureDetectorCompat;
        this.f19323p = bVar;
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC8740m, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return super.onWindowStartingActionMode(callback, i);
    }
}
