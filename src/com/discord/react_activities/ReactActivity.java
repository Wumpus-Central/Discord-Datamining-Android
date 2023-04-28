package com.discord.react_activities;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.crash_reporting.CrashReporting;
import com.discord.main.MainActivity;
import com.discord.safearea.extensions.ImmersiveMode;
import com.discord.scale.FontScaleUtilsKt;
import com.discord.share.ShareActivity;
import com.discord.theme.ThemeManager;
import com.discord.tti_manager.TTILoggingApplication;
import com.facebook.react.ReactActivityDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p242n6.C10719b;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\f\u0010\u0007\u001a\u00060\bR\u00020\u0000H\u0004J\f\u0010\t\u001a\u00060\bR\u00020\u0000H&J\b\u0010\n\u001a\u00020\u000bH\u0004J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014¨\u0006\u0015"}, m15073d2 = {"Lcom/discord/react_activities/ReactActivity;", "Lcom/facebook/react/ReactActivity;", "()V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "createReactActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "getActivityDelegate", "getMainComponentName", "", "getNameOfComponent", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ActivityDelegate", "Registry", "react_activity_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public abstract class ReactActivity extends com.facebook.react.ReactActivity {
    public static final Registry Registry = new Registry(null);
    private static final Class<?> mainActivity = MainActivity.class;
    private static final Class<?> shareActivity = ShareActivity.class;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/discord/react_activities/ReactActivity;", "(Lcom/discord/react_activities/ReactActivity;Lcom/discord/react_activities/ReactActivity;)V", "react_activity_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public class ActivityDelegate extends ReactActivityDelegate {
        final /* synthetic */ ReactActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityDelegate(ReactActivity reactActivity, ReactActivity activity) {
            super((com.facebook.react.ReactActivity) activity, reactActivity.getNameOfComponent());
            C9971q.m14633g(activity, "activity");
            this.this$0 = reactActivity;
            TTILoggingApplication.Companion.trackActivityDelegateInitialized();
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            if (C9971q.m14638b(crashReporting.isCrashedLastRun(), Boolean.TRUE)) {
                CrashReporting.addBreadcrumb$default(crashReporting, "Checking for blocking OTA update", null, null, 6, null);
                BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, null, 2, null).get();
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m15073d2 = {"Lcom/discord/react_activities/ReactActivity$Registry;", "", "()V", "mainActivity", "Ljava/lang/Class;", "getMainActivity", "()Ljava/lang/Class;", "shareActivity", "getShareActivity", "react_activity_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Registry {
        private Registry() {
        }

        public /* synthetic */ Registry(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Class<?> getMainActivity() {
            return ReactActivity.mainActivity;
        }

        public final Class<?> getShareActivity() {
            return ReactActivity.shareActivity;
        }
    }

    static {
        C9971q.m14634f(MainActivity.class, "forName(\"com.discord.main.MainActivity\")");
        C9971q.m14634f(ShareActivity.class, "forName(\"com.discord.share.ShareActivity\")");
    }

    @Override // androidx.appcompat.app.ActivityC1510b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        C9971q.m14633g(newBase, "newBase");
        super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(newBase));
        Unit unit = Unit.f22042a;
        Context applicationContext = getApplicationContext();
        C9971q.m14634f(applicationContext, "applicationContext");
        FontScaleUtilsKt.setFontScaleDeprecated(applicationContext);
    }

    public abstract ActivityDelegate getActivityDelegate();

    @Override // com.facebook.react.ReactActivity
    protected final String getMainComponentName() {
        return getNameOfComponent();
    }

    public abstract String getNameOfComponent();

    @Override // com.facebook.react.ReactActivity, androidx.appcompat.app.ActivityC1510b, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C9971q.m14633g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C10719b.f23750n.m12569a(this, newConfig);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(null);
        BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 10, null, 2, null);
        ImmersiveMode.INSTANCE.enableImmersiveMode(this);
        ThemeManager themeManager = ThemeManager.INSTANCE;
        themeManager.updateSystemUi(this);
        themeManager.updateWindowBackground(this, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.ReactActivity
    public final ActivityDelegate createReactActivityDelegate() {
        return getActivityDelegate();
    }
}
