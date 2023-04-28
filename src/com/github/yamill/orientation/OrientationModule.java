package com.github.yamill.orientation;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p242n6.C10718a;
import p242n6.C10719b;
import p242n6.C10721c;
import p267of.C11288u;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0007H\u0007J\b\u0010\u0016\u001a\u00020\u0007H\u0007J\b\u0010\u0017\u001a\u00020\u0007H\u0007J\b\u0010\u0018\u001a\u00020\u0007H\u0007J\b\u0010\u0019\u001a\u00020\u0007H\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006!"}, m15073d2 = {"Lcom/github/yamill/orientation/OrientationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/github/yamill/orientation/OrientationModule$d;", "lockState", "", "autoRotateEnabled", "autoRotateIgnored", "", "updateOrientation", "", "orientation", "", "getOrientationString", "getName", "", "", "getConstants", "Lcom/facebook/react/bridge/Callback;", "callback", "getOrientation", "ignoreAutoRotate", "lockToPortrait", "lockToLandscape", "lockToLandscapeLeft", "lockToLandscapeRight", "unlockAllOrientations", "Lcom/github/yamill/orientation/OrientationModule$d;", "Z", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "d", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class OrientationModule extends ReactContextBaseJavaModule {
    private boolean autoRotateEnabled;
    private boolean autoRotateIgnored;
    private EnumC5134d lockState;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "autoRotateEnabled", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.github.yamill.orientation.OrientationModule$a */
    /* loaded from: classes7.dex */
    static final class C5131a extends AbstractC9973s implements Function1<Boolean, Unit> {
        C5131a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f22042a;
        }

        public final void invoke(boolean z) {
            OrientationModule.updateOrientation$default(OrientationModule.this, null, z, false, 5, null);
        }
    }

    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Landroid/app/Activity;", "a", "()Landroid/app/Activity;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.OrientationModule$b */
    /* loaded from: classes7.dex */
    static final class C5132b extends AbstractC9973s implements Function0<Activity> {
        C5132b() {
            super(0);
        }

        /* renamed from: a */
        public final Activity invoke() {
            return OrientationModule.this.getCurrentActivity();
        }
    }

    @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"Landroid/app/Activity;", "a", "()Landroid/app/Activity;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.OrientationModule$c */
    /* loaded from: classes7.dex */
    static final class C5133c extends AbstractC9973s implements Function0<Activity> {
        C5133c() {
            super(0);
        }

        /* renamed from: a */
        public final Activity invoke() {
            return OrientationModule.this.getCurrentActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m15073d2 = {"Lcom/github/yamill/orientation/OrientationModule$d;", "", "", "k", "I", "b", "()I", "orientationInt", "<init>", "(Ljava/lang/String;II)V", "l", "m", "n", "o", "p", "q", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.OrientationModule$d */
    /* loaded from: classes7.dex */
    public enum EnumC5134d {
        LOCKED_PORTRAIT(1),
        LOCKED_LANDSCAPE(6),
        LOCKED_LANDSCAPE_LEFT(0),
        LOCKED_LANDSCAPE_RIGHT(8),
        UNLOCKED(4),
        UNSPECIFIED(-1);
        

        /* renamed from: k */
        private final int f8919k;

        EnumC5134d(int i) {
            this.f8919k = i;
        }

        /* renamed from: b */
        public final int m30586b() {
            return this.f8919k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(new C10718a(reactContext, new C5131a()));
        reactContext.addLifecycleEventListener(new C10719b(reactContext, new C5132b()));
        reactContext.addLifecycleEventListener(new C10721c(reactContext, new C5133c()));
    }

    private final String getOrientationString(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 1) {
            return "PORTRAIT";
        }
        if (i != 2) {
            return null;
        }
        return "LANDSCAPE";
    }

    private final void updateOrientation(EnumC5134d dVar, boolean z, boolean z2) {
        boolean z3;
        EnumC5134d dVar2;
        Activity currentActivity;
        Activity currentActivity2;
        if (this.lockState != dVar || this.autoRotateEnabled != z || this.autoRotateIgnored != z2) {
            this.lockState = dVar;
            this.autoRotateEnabled = z;
            this.autoRotateIgnored = z2;
            if (dVar != null) {
                boolean z4 = false;
                if (z || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && (currentActivity2 = getCurrentActivity()) != null) {
                    currentActivity2.setRequestedOrientation(dVar.m30586b());
                }
                if (!z && !z2) {
                    z4 = true;
                }
                if (z4 && dVar != (dVar2 = EnumC5134d.UNSPECIFIED) && (currentActivity = getCurrentActivity()) != null) {
                    currentActivity.setRequestedOrientation(dVar2.m30586b());
                }
            }
        }
    }

    static /* synthetic */ void updateOrientation$default(OrientationModule orientationModule, EnumC5134d dVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = orientationModule.lockState;
        }
        if ((i & 2) != 0) {
            z = orientationModule.autoRotateEnabled;
        }
        if ((i & 4) != 0) {
            z2 = orientationModule.autoRotateIgnored;
        }
        orientationModule.updateOrientation(dVar, z, z2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> e;
        e = C11288u.m10254e(C11098x.m10921a("initialOrientation", getOrientationString(getReactApplicationContext().getResources().getConfiguration().orientation)));
        return e;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public final void getOrientation(Callback callback) {
        C9971q.m14633g(callback, "callback");
        int i = getReactApplicationContext().getResources().getConfiguration().orientation;
        String orientationString = getOrientationString(i);
        if (orientationString == null) {
            callback.invoke(Integer.valueOf(i), null);
        } else {
            callback.invoke(null, orientationString);
        }
    }

    @ReactMethod
    public final void ignoreAutoRotate(boolean z) {
        updateOrientation$default(this, null, false, z, 3, null);
    }

    @ReactMethod
    public final void lockToLandscape() {
        updateOrientation$default(this, EnumC5134d.LOCKED_LANDSCAPE, false, false, 6, null);
    }

    @ReactMethod
    public final void lockToLandscapeLeft() {
        updateOrientation$default(this, EnumC5134d.LOCKED_LANDSCAPE_LEFT, false, false, 6, null);
    }

    @ReactMethod
    public final void lockToLandscapeRight() {
        updateOrientation$default(this, EnumC5134d.LOCKED_LANDSCAPE_RIGHT, false, false, 6, null);
    }

    @ReactMethod
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void lockToPortrait() {
        updateOrientation$default(this, EnumC5134d.LOCKED_PORTRAIT, false, false, 6, null);
    }

    @ReactMethod
    public final void unlockAllOrientations() {
        updateOrientation$default(this, EnumC5134d.UNLOCKED, false, false, 6, null);
    }
}
