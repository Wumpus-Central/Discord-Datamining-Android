package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.core.view.C2733w0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import java.util.Map;
import p163j$.util.Spliterator;
import p414x3.C13925a;

@ReactModule(name = StatusBarModule.NAME)
/* loaded from: classes7.dex */
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        float f;
        String str;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            f = PixelUtil.toDIPFromPixel(reactApplicationContext.getResources().getDimensionPixelSize(identifier));
        } else {
            f = 0.0f;
        }
        if (currentActivity != null) {
            str = String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215));
        } else {
            str = "black";
        }
        return MapBuilder.m30830of(HEIGHT_KEY, Float.valueOf(f), DEFAULT_BACKGROUND_COLOR_KEY, str);
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d, final boolean z) {
        final int i = (int) d;
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13925a.m2304H(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.1
                @Override // com.facebook.react.bridge.GuardedRunnable
                @TargetApi(21)
                public void runGuarded() {
                    currentActivity.getWindow().addFlags(Integer.MIN_VALUE);
                    if (z) {
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(currentActivity.getWindow().getStatusBarColor()), Integer.valueOf(i));
                        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.1.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                currentActivity.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        ofObject.setDuration(300L).setStartDelay(0L);
                        ofObject.start();
                        return;
                    }
                    currentActivity.getWindow().setStatusBarColor(i);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13925a.m2304H(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.3
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        currentActivity.getWindow().addFlags(Spliterator.IMMUTABLE);
                        currentActivity.getWindow().clearFlags(RecyclerView.ItemAnimator.FLAG_MOVED);
                        return;
                    }
                    currentActivity.getWindow().addFlags(RecyclerView.ItemAnimator.FLAG_MOVED);
                    currentActivity.getWindow().clearFlags(Spliterator.IMMUTABLE);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13925a.m2304H(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.4
                @Override // java.lang.Runnable
                @TargetApi(30)
                public void run() {
                    int i;
                    WindowInsetsController insetsController;
                    if (Build.VERSION.SDK_INT > 30) {
                        insetsController = currentActivity.getWindow().getInsetsController();
                        if ("dark-content".equals(str)) {
                            insetsController.setSystemBarsAppearance(8, 8);
                        } else {
                            insetsController.setSystemBarsAppearance(0, 8);
                        }
                    } else {
                        View decorView = currentActivity.getWindow().getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if ("dark-content".equals(str)) {
                            i = systemUiVisibility | 8192;
                        } else {
                            i = systemUiVisibility & (-8193);
                        }
                        decorView.setSystemUiVisibility(i);
                    }
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C13925a.m2304H(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.2
                @Override // com.facebook.react.bridge.GuardedRunnable
                @TargetApi(21)
                public void runGuarded() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.2.1
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
                            }
                        });
                    } else {
                        decorView.setOnApplyWindowInsetsListener(null);
                    }
                    C2733w0.m36996n0(decorView);
                }
            });
        }
    }
}
