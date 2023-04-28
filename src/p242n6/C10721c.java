package p242n6;

import android.app.Activity;
import android.view.OrientationEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.github.yamill.orientation.C5136b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C10150n1;
import p414x3.C13925a;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m15073d2 = {"Ln6/c;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactContext;", "k", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lkotlin/Function0;", "Landroid/app/Activity;", "l", "Lkotlin/jvm/functions/Function0;", "onGetCurrentActivity", "Landroid/view/OrientationEventListener;", "m", "Landroid/view/OrientationEventListener;", "orientationEventListener", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/functions/Function0;)V", "n", "b", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: n6.c */
/* loaded from: classes7.dex */
public final class C10721c implements LifecycleEventListener {

    /* renamed from: n */
    public static final C10723b f23755n;

    /* renamed from: o */
    private static Integer f23756o;

    /* renamed from: p */
    private static final Function2<Integer, ReactContext, Unit> f23757p;

    /* renamed from: k */
    private final ReactContext f23758k;

    /* renamed from: l */
    private final Function0<Activity> f23759l;

    /* renamed from: m */
    private OrientationEventListener f23760m;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: n6.c$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class C10722a extends C9968n implements Function2<Integer, ReactContext, Unit> {
        C10722a(Object obj) {
            super(2, obj, C10723b.class, "tryEmitOrientationDegreesChange", "tryEmitOrientationDegreesChange(ILcom/facebook/react/bridge/ReactContext;)V", 0);
        }

        /* renamed from: i */
        public final void m12563i(int i, ReactContext p1) {
            C9971q.m14633g(p1, "p1");
            ((C10723b) this.receiver).m12558e(i, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, ReactContext reactContext) {
            m12563i(num.intValue(), reactContext);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m15073d2 = {"Ln6/c$b;", "", "", "orientationDegrees", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "", "e", "lastEmittedOrientationDegrees", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "(Ljava/lang/Integer;)V", "Lkotlin/Function2;", "onOrientationDegreesChange", "Lkotlin/jvm/functions/Function2;", "c", "()Lkotlin/jvm/functions/Function2;", "<init>", "()V", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: n6.c$b */
    /* loaded from: classes7.dex */
    public static final class C10723b {
        private C10723b() {
        }

        public /* synthetic */ C10723b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m12558e(int i, ReactContext reactContext) {
            if (reactContext.hasActiveReactInstance()) {
                WritableMap createMap = Arguments.createMap();
                Integer b = m12561b();
                if (b == null || i != b.intValue()) {
                    createMap.putInt("orientationDegrees", i);
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDegreesDidChange", createMap);
                    m12559d(Integer.valueOf(i));
                }
            }
        }

        /* renamed from: b */
        public final Integer m12561b() {
            return C10721c.f23756o;
        }

        /* renamed from: c */
        public final Function2<Integer, ReactContext, Unit> m12560c() {
            return C10721c.f23757p;
        }

        /* renamed from: d */
        public final void m12559d(Integer num) {
            C10721c.f23756o = num;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"n6/c$c", "Landroid/view/OrientationEventListener;", "", "orientationDegrees", "", "onOrientationChanged", "react-native-orientation_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: n6.c$c */
    /* loaded from: classes7.dex */
    public static final class C0348c extends OrientationEventListener {

        /* renamed from: a */
        final /* synthetic */ C10721c f23761a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0348c(Activity activity, C10721c cVar) {
            super(activity);
            this.f23761a = cVar;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            C10721c.f23755n.m12560c().invoke(Integer.valueOf(i), this.f23761a.f23758k);
        }
    }

    static {
        C10723b bVar = new C10723b(null);
        f23755n = bVar;
        f23757p = C5136b.m30585a(1000L, C10150n1.f22356k, new C10722a(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10721c(ReactContext reactContext, Function0<? extends Activity> onGetCurrentActivity) {
        C9971q.m14633g(reactContext, "reactContext");
        C9971q.m14633g(onGetCurrentActivity, "onGetCurrentActivity");
        this.f23758k = reactContext;
        this.f23759l = onGetCurrentActivity;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity invoke = this.f23759l.invoke();
        if (invoke == null || this.f23760m != null) {
            C13925a.m2288j(ReactConstants.TAG, "no activity to register receiver");
            return;
        }
        C0348c cVar = new C0348c(invoke, this);
        this.f23760m = cVar;
        if (cVar.canDetectOrientation()) {
            OrientationEventListener orientationEventListener = this.f23760m;
            if (orientationEventListener == null) {
                C9971q.m14615y("orientationEventListener");
                orientationEventListener = null;
            }
            orientationEventListener.enable();
        }
    }
}
