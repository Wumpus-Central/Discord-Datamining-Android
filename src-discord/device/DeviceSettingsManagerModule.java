package com.discord.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.r2;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\f\u0010\u0007\u001a\u00020\b*\u00020\u0013H\u0002J\f\u0010\u0014\u001a\u00020\b*\u00020\u0013H\u0002J\f\u0010\u0015\u001a\u00020\b*\u00020\u0013H\u0003¨\u0006\u0016"}, d2 = {"Lcom/discord/device/DeviceSettingsManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "openAccessibilitySettings", "", "()Lkotlin/Unit;", "openNotificationSettings", "openPrivacySettings", "setInsetsVisible", ViewProps.VISIBLE, "", "insetType", "", "setNavigationBarVisible", "setStatusBarVisible", "Landroid/content/Context;", "openApplicationDetailSettings", "openApplicationNotificationSettings", "device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceSettingsManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    private final void openApplicationDetailSettings(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", new Uri.Builder().scheme("package").opaquePart(context.getPackageName()).build());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private final void openApplicationNotificationSettings(Context context) {
        context.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()));
    }

    private final void setInsetsVisible(final boolean z10, final int i10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.discord.device.b
            @Override // java.lang.Runnable
            public final void run() {
                DeviceSettingsManagerModule.setInsetsVisible$lambda$0(DeviceSettingsManagerModule.this, z10, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInsetsVisible$lambda$0(DeviceSettingsManagerModule this$0, boolean z10, int i10) {
        Window window;
        q.g(this$0, "this$0");
        Activity currentActivity = this$0.getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            window = currentActivity.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            WindowInsetsControllerCompat a10 = r2.a(window, window.getDecorView());
            q.f(a10, "getInsetsController(window, window.decorView)");
            a10.d(2);
            if (z10) {
                a10.e(i10);
            } else {
                a10.a(i10);
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceSettingsManager";
    }

    @ReactMethod
    public final Unit openAccessibilitySettings() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        openAccessibilitySettings(currentActivity);
        return Unit.f22036a;
    }

    @ReactMethod
    public final Unit openNotificationSettings() {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            if (currentActivity == null) {
                return null;
            }
            openApplicationNotificationSettings(currentActivity);
            return Unit.f22036a;
        }
        Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
        if (currentActivity2 == null) {
            return null;
        }
        openApplicationDetailSettings(currentActivity2);
        return Unit.f22036a;
    }

    @ReactMethod
    public final void openPrivacySettings() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        openApplicationDetailSettings(reactApplicationContext);
    }

    @ReactMethod
    public final void setNavigationBarVisible(boolean z10) {
        setInsetsVisible(z10, WindowInsetsCompat.m.e());
    }

    @ReactMethod
    public final void setStatusBarVisible(boolean z10) {
        setInsetsVisible(z10, WindowInsetsCompat.m.f());
    }

    private final void openAccessibilitySettings(Context context) {
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
