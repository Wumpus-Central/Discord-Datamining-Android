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
import com.facebook.react.ReactRootView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import r5.b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\f\u0010\r\u001a\u00060\u000eR\u00020\u0000H\u0004J\f\u0010\u000f\u001a\u00060\u000eR\u00020\u0000H&J\b\u0010\u0010\u001a\u00020\u0011H\u0004J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/discord/react_activities/ReactActivity;", "Lcom/facebook/react/ReactActivity;", "()V", "rootView", "Lcom/discord/react_activities/ReactRootView;", "getRootView$react_activity_release", "()Lcom/discord/react_activities/ReactRootView;", "setRootView$react_activity_release", "(Lcom/discord/react_activities/ReactRootView;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "createReactActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "getActivityDelegate", "getMainComponentName", "", "getNameOfComponent", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ActivityDelegate", "Registry", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class ReactActivity extends com.facebook.react.ReactActivity {
    public static final Registry Registry = new Registry(null);
    private static final Class<?> mainActivity = MainActivity.class;
    private static final Class<?> shareActivity = ShareActivity.class;
    public ReactRootView rootView;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/discord/react_activities/ReactActivity$Registry;", "", "()V", "mainActivity", "Ljava/lang/Class;", "getMainActivity", "()Ljava/lang/Class;", "shareActivity", "getShareActivity", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Registry {
        private Registry() {
        }

        public  Registry(DefaultConstructorMarker defaultConstructorMarker) {
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
        q.g(MainActivity.class, "forName(\"com.discord.main.MainActivity\")");
        q.g(ShareActivity.class, "forName(\"com.discord.share.ShareActivity\")");
    }

    @Override 
    protected void attachBaseContext(Context newBase) {
        q.h(newBase, "newBase");
        super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(newBase));
        Unit unit = Unit.f21210a;
        Context applicationContext = getApplicationContext();
        q.g(applicationContext, "applicationContext");
        FontScaleUtilsKt.setFontScaleDeprecated(applicationContext);
    }

    public abstract ActivityDelegate getActivityDelegate();

    @Override 
    protected final String getMainComponentName() {
        return getNameOfComponent();
    }

    public abstract String getNameOfComponent();

    public final ReactRootView getRootView$react_activity_release() {
        ReactRootView reactRootView = this.rootView;
        if (reactRootView != null) {
            return reactRootView;
        }
        q.z("rootView");
        return null;
    }

    @Override 
    public void onConfigurationChanged(Configuration newConfig) {
        q.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        b.f27019m.a(this, newConfig);
    }

    @Override 
    protected void onCreate(Bundle bundle) {
        super.onCreate(null);
        BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 10, null, 2, null);
        ImmersiveMode.INSTANCE.enableImmersiveMode(this);
        ThemeManager themeManager = ThemeManager.INSTANCE;
        themeManager.updateSystemUi(this);
        themeManager.updateWindowBackground(this, true);
    }

    public final void setRootView$react_activity_release(ReactRootView reactRootView) {
        q.h(reactRootView, "<set-?>");
        this.rootView = reactRootView;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/discord/react_activities/ReactActivity;", "(Lcom/discord/react_activities/ReactActivity;Lcom/discord/react_activities/ReactActivity;)V", "createRootView", "Lcom/facebook/react/ReactRootView;", "initialProps", "Landroid/os/Bundle;", "react_activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public class ActivityDelegate extends ReactActivityDelegate {
        final  ReactActivity this$0;

        
        public ActivityDelegate(ReactActivity reactActivity, ReactActivity activity) {
            super((com.facebook.react.ReactActivity) activity, reactActivity.getNameOfComponent());
            q.h(activity, "activity");
            this.this$0 = reactActivity;
            TTILoggingApplication.Companion.trackActivityDelegateInitialized();
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            if (q.c(crashReporting.isCrashedLastRun(), Boolean.TRUE)) {
                CrashReporting.addBreadcrumb$default(crashReporting, "Checking for blocking OTA update", null, null, 6, null);
                BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, null, 2, null).get();
            }
        }

        @Override 
        protected ReactRootView createRootView() {
            Context context = getContext();
            q.g(context, "context");
            ReactRootView reactRootView = new ReactRootView(context);
            this.this$0.setRootView$react_activity_release(reactRootView);
            return reactRootView;
        }

        @Override 
        protected ReactRootView createRootView(Bundle bundle) {
            return createRootView();
        }
    }

    
    @Override 
    public final ActivityDelegate createReactActivityDelegate() {
        return getActivityDelegate();
    }
}
