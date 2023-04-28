package com.swmansion.reanimated.keyboardObserver;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2696r2;
import androidx.core.view.C2710t2;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.swmansion.reanimated.C6265R;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class ReanimatedKeyboardEventListener {
    private final WeakReference<ReactApplicationContext> reactContext;
    private KeyboardState state;
    private int nextListenerId = 0;
    private final HashMap<Integer, NativeProxy.KeyboardEventDataUpdater> listeners = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public enum KeyboardState {
        UNKNOWN(0),
        OPENING(1),
        OPEN(2),
        CLOSING(3),
        CLOSED(4);
        
        private final int value;

        KeyboardState(int i) {
            this.value = i;
        }

        public int asInt() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public class WindowInsetsCallback extends C2710t2.AbstractC2712b {
        private int keyboardHeight = 0;

        public WindowInsetsCallback() {
            super(1);
        }

        @Override // androidx.core.view.C2710t2.AbstractC2712b
        public void onEnd(C2710t2 t2Var) {
            KeyboardState keyboardState;
            ReanimatedKeyboardEventListener reanimatedKeyboardEventListener = ReanimatedKeyboardEventListener.this;
            if (this.keyboardHeight == 0) {
                keyboardState = KeyboardState.CLOSED;
            } else {
                keyboardState = KeyboardState.OPEN;
            }
            reanimatedKeyboardEventListener.state = keyboardState;
            ReanimatedKeyboardEventListener.this.updateKeyboard(this.keyboardHeight);
        }

        @Override // androidx.core.view.C2710t2.AbstractC2712b
        public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<C2710t2> list) {
            int dIPFromPixel = (int) PixelUtil.toDIPFromPixel(Math.max(0, windowInsetsCompat.m37521f(WindowInsetsCompat.C2542m.m37460b()).f3329d - windowInsetsCompat.m37521f(WindowInsetsCompat.C2542m.m37455g()).f3329d));
            this.keyboardHeight = dIPFromPixel;
            ReanimatedKeyboardEventListener.this.updateKeyboard(dIPFromPixel);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.C2710t2.AbstractC2712b
        public C2710t2.C2711a onStart(C2710t2 t2Var, C2710t2.C2711a aVar) {
            KeyboardState keyboardState;
            ReanimatedKeyboardEventListener reanimatedKeyboardEventListener = ReanimatedKeyboardEventListener.this;
            if (this.keyboardHeight == 0) {
                keyboardState = KeyboardState.OPENING;
            } else {
                keyboardState = KeyboardState.CLOSING;
            }
            reanimatedKeyboardEventListener.state = keyboardState;
            ReanimatedKeyboardEventListener.this.updateKeyboard(this.keyboardHeight);
            return super.onStart(t2Var, aVar);
        }
    }

    public ReanimatedKeyboardEventListener(WeakReference<ReactApplicationContext> weakReference) {
        this.reactContext = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bringBackWindowInsets() {
        C2696r2.m37144b(this.reactContext.get().getCurrentActivity().getWindow(), true);
        C2733w0.m37058D0(getRootView(), null);
        C2733w0.m37040M0(getRootView(), null);
        View findViewById = getRootView().getRootView().findViewById(C6265R.C6267id.action_bar_root);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setLayoutParams(layoutParams);
    }

    private View getRootView() {
        return this.reactContext.get().getCurrentActivity().getWindow().getDecorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat lambda$setupWindowInsets$0(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.m37521f(WindowInsetsCompat.C2542m.m37455g()).f3327b;
        View findViewById = view.getRootView().findViewById(C6265R.C6267id.action_bar_root);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, i, 0, 0);
        findViewById.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    private void removeCallbacks() {
        View rootView = getRootView();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboardObserver.a
            @Override // java.lang.Runnable
            public final void run() {
                ReanimatedKeyboardEventListener.this.bringBackWindowInsets();
            }
        });
        C2733w0.m37040M0(rootView, null);
    }

    private void setUpCallbacks() {
        View rootView = getRootView();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboardObserver.c
            @Override // java.lang.Runnable
            public final void run() {
                ReanimatedKeyboardEventListener.this.setupWindowInsets();
            }
        });
        C2733w0.m37040M0(rootView, new WindowInsetsCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupWindowInsets() {
        final View rootView = getRootView();
        C2696r2.m37144b(this.reactContext.get().getCurrentActivity().getWindow(), false);
        C2733w0.m37058D0(rootView, new AbstractC2694r0() { // from class: com.swmansion.reanimated.keyboardObserver.b
            @Override // androidx.core.view.AbstractC2694r0
            /* renamed from: a */
            public final WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$setupWindowInsets$0;
                lambda$setupWindowInsets$0 = ReanimatedKeyboardEventListener.lambda$setupWindowInsets$0(rootView, view, windowInsetsCompat);
                return lambda$setupWindowInsets$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateKeyboard(int i) {
        for (NativeProxy.KeyboardEventDataUpdater keyboardEventDataUpdater : this.listeners.values()) {
            keyboardEventDataUpdater.keyboardEventDataUpdater(this.state.asInt(), i);
        }
    }

    public int subscribeForKeyboardEvents(NativeProxy.KeyboardEventDataUpdater keyboardEventDataUpdater) {
        int i = this.nextListenerId;
        this.nextListenerId = i + 1;
        if (this.listeners.isEmpty()) {
            setUpCallbacks();
        }
        this.listeners.put(Integer.valueOf(i), keyboardEventDataUpdater);
        return i;
    }

    public void unsubscribeFromKeyboardEvents(int i) {
        this.listeners.remove(Integer.valueOf(i));
        if (this.listeners.isEmpty()) {
            removeCallbacks();
        }
    }
}
