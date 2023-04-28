package p242n6;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Parcelable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p414x3.C13925a;

@Metadata(m15074d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001\u000f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m15073d2 = {"Ln6/b;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactContext;", "k", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lkotlin/Function0;", "Landroid/app/Activity;", "l", "Lkotlin/jvm/functions/Function0;", "onGetCurrentActivity", "n6/b$b", "m", "Ln6/b$b;", "receiver", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/functions/Function0;)V", "n", "a", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: n6.b */
/* loaded from: classes7.dex */
public final class C10719b implements LifecycleEventListener {

    /* renamed from: n */
    public static final C10720a f23750n = new C10720a(null);

    /* renamed from: k */
    private final ReactContext f23751k;

    /* renamed from: l */
    private final Function0<Activity> f23752l;

    /* renamed from: m */
    private final C0347b f23753m = new C0347b();

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Ln6/b$a;", "", "Landroid/app/Activity;", "activity", "Landroid/content/res/Configuration;", "newConfig", "", "a", "", "orientation", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "b", "", "INTENT_ACTION_CONFIG_CHANGED", "Ljava/lang/String;", "INTENT_VALUE_KEY", "<init>", "()V", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: n6.b$a */
    /* loaded from: classes7.dex */
    public static final class C10720a {
        private C10720a() {
        }

        public /* synthetic */ C10720a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m12569a(Activity activity, Configuration newConfig) {
            C9971q.m14633g(activity, "activity");
            C9971q.m14633g(newConfig, "newConfig");
            Intent intent = new Intent("onConfigurationChanged");
            intent.putExtra("newConfig", newConfig);
            activity.sendBroadcast(intent);
        }

        /* renamed from: b */
        public final void m12568b(int i, ReactContext reactContext) {
            String str;
            C9971q.m14633g(reactContext, "reactContext");
            if (reactContext.hasActiveReactInstance()) {
                if (i == 1) {
                    str = "PORTRAIT";
                } else {
                    str = "LANDSCAPE";
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("orientation", str);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m15073d2 = {"n6/b$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: n6.b$b */
    /* loaded from: classes7.dex */
    public static final class C0347b extends BroadcastReceiver {
        C0347b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9971q.m14633g(context, "context");
            C9971q.m14633g(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("newConfig");
            C9971q.m14636d(parcelableExtra);
            C10719b.f23750n.m12568b(((Configuration) parcelableExtra).orientation, C10719b.this.f23751k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10719b(ReactContext reactContext, Function0<? extends Activity> onGetCurrentActivity) {
        C9971q.m14633g(reactContext, "reactContext");
        C9971q.m14633g(onGetCurrentActivity, "onGetCurrentActivity");
        this.f23751k = reactContext;
        this.f23752l = onGetCurrentActivity;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity invoke = this.f23752l.invoke();
        if (invoke != null) {
            try {
                invoke.unregisterReceiver(this.f23753m);
            } catch (IllegalArgumentException e) {
                C13925a.m2287k(ReactConstants.TAG, "receiver already unregistered", e);
            }
        } else {
            C13925a.m2288j(ReactConstants.TAG, "no activity to un-register receiver");
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity invoke = this.f23752l.invoke();
        if (invoke != null) {
            invoke.registerReceiver(this.f23753m, new IntentFilter("onConfigurationChanged"));
        } else {
            C13925a.m2288j(ReactConstants.TAG, "no activity to register receiver");
        }
        f23750n.m12568b(this.f23751k.getResources().getConfiguration().orientation, this.f23751k);
    }
}
