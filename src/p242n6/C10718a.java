package p242n6;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m15073d2 = {"Ln6/a;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "n6/a$a", "c", "()Ln6/a$a;", "", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactContext;", "k", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lkotlin/Function1;", "", "l", "Lkotlin/jvm/functions/Function1;", "onAutoRotateEnabled", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "m", "Landroid/net/Uri;", "setting", "", "n", "Ljava/lang/String;", "autoRotateFlag", "Landroid/database/ContentObserver;", "o", "Landroid/database/ContentObserver;", "observer", "d", "()Z", "autoRotate", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/functions/Function1;)V", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: n6.a */
/* loaded from: classes7.dex */
public final class C10718a implements LifecycleEventListener {

    /* renamed from: k */
    private final ReactContext f23744k;

    /* renamed from: l */
    private final Function1<Boolean, Unit> f23745l;

    /* renamed from: m */
    private final Uri f23746m = Settings.System.getUriFor("accelerometer_rotation");

    /* renamed from: n */
    private final String f23747n = "accelerometer_rotation";

    /* renamed from: o */
    private ContentObserver f23748o;

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m15073d2 = {"n6/a$a", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "deliverSelfNotifications", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: n6.a$a */
    /* loaded from: classes7.dex */
    public static final class C0346a extends ContentObserver {
        C0346a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            C10718a.this.f23745l.invoke(Boolean.valueOf(C10718a.this.m12571d()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10718a(ReactContext reactContext, Function1<? super Boolean, Unit> onAutoRotateEnabled) {
        C9971q.m14633g(reactContext, "reactContext");
        C9971q.m14633g(onAutoRotateEnabled, "onAutoRotateEnabled");
        this.f23744k = reactContext;
        this.f23745l = onAutoRotateEnabled;
        onAutoRotateEnabled.invoke(Boolean.valueOf(m12571d()));
    }

    /* renamed from: c */
    private final C0346a m12572c() {
        Looper myLooper = Looper.myLooper();
        C9971q.m14636d(myLooper);
        return new C0346a(new Handler(myLooper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m12571d() {
        return Settings.System.getInt(this.f23744k.getContentResolver(), this.f23747n, 0) == 1;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        ContentObserver contentObserver = this.f23748o;
        if (contentObserver != null) {
            this.f23744k.getContentResolver().unregisterContentObserver(contentObserver);
        }
        this.f23748o = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C0346a c = m12572c();
        this.f23748o = c;
        if (c != null) {
            this.f23744k.getContentResolver().registerContentObserver(this.f23746m, false, c);
        }
        this.f23745l.invoke(Boolean.valueOf(m12571d()));
    }
}
