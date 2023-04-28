package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0006\"\n\u0087\u0001gxB\u0015\u0012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014J0\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\tJ\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u00101\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00107\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0018\u0010c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0018\u0010e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\\R$\u0010k\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u00107R\u0013\u0010q\u001a\u0004\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR(\u0010r\u001a\u0004\u0018\u00010\u001e2\b\u0010r\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR(\u0010z\u001a\u0004\u0018\u00010\t2\b\u0010w\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010h\"\u0004\by\u0010jR(\u0010~\u001a\u0004\u0018\u00010\t2\b\u0010{\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010h\"\u0004\b}\u0010jR+\u0010\u007f\u001a\u0004\u0018\u00010\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0080\u0001\u0010X\"\u0006\b\u0081\u0001\u0010\u0082\u0001R-\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0084\u0001\u0010X\"\u0006\b\u0085\u0001\u0010\u0082\u0001R,\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010h\"\u0005\b\u0088\u0001\u0010jR(\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010R\"\u0005\b\u008c\u0001\u0010T¨\u0006\u0092\u0001"}, m15073d2 = {"Lcom/swmansion/rnscreens/j;", "Lcom/swmansion/rnscreens/e;", "", "width", "height", "", "g", "Landroid/view/ViewGroup;", "viewGroup", "", "b", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "container", "dispatchSaveInstanceState", "dispatchRestoreInstanceState", "changed", "l", "t", "r", ViewProps.ON_LAYOUT, "transitioning", "setTransitioning", "layerType", "Landroid/graphics/Paint;", "paint", "setLayerType", "Lcom/swmansion/rnscreens/j$a;", "activityState", "setActivityState", "", "screenOrientation", "setScreenOrientation", "mode", "a", "Lcom/swmansion/rnscreens/n;", "k", "Lcom/swmansion/rnscreens/n;", "getFragment", "()Lcom/swmansion/rnscreens/n;", "setFragment", "(Lcom/swmansion/rnscreens/n;)V", "fragment", "Lcom/swmansion/rnscreens/l;", "Lcom/swmansion/rnscreens/l;", "getContainer", "()Lcom/swmansion/rnscreens/l;", "setContainer", "(Lcom/swmansion/rnscreens/l;)V", "<set-?>", "m", "Lcom/swmansion/rnscreens/j$a;", "getActivityState", "()Lcom/swmansion/rnscreens/j$a;", "n", "Z", "mTransitioning", "Lcom/swmansion/rnscreens/j$d;", "o", "Lcom/swmansion/rnscreens/j$d;", "getStackPresentation", "()Lcom/swmansion/rnscreens/j$d;", "setStackPresentation", "(Lcom/swmansion/rnscreens/j$d;)V", "stackPresentation", "Lcom/swmansion/rnscreens/j$b;", "p", "Lcom/swmansion/rnscreens/j$b;", "getReplaceAnimation", "()Lcom/swmansion/rnscreens/j$b;", "setReplaceAnimation", "(Lcom/swmansion/rnscreens/j$b;)V", "replaceAnimation", "Lcom/swmansion/rnscreens/j$c;", "q", "Lcom/swmansion/rnscreens/j$c;", "getStackAnimation", "()Lcom/swmansion/rnscreens/j$c;", "setStackAnimation", "(Lcom/swmansion/rnscreens/j$c;)V", "stackAnimation", "isGestureEnabled", "()Z", "setGestureEnabled", "(Z)V", "s", "Ljava/lang/Integer;", "getScreenOrientation", "()Ljava/lang/Integer;", "Ljava/lang/String;", "mStatusBarStyle", "u", "Ljava/lang/Boolean;", "mStatusBarHidden", "v", "mStatusBarTranslucent", "w", "mStatusBarColor", "x", "mNavigationBarColor", "y", "mNavigationBarHidden", "z", "d", "()Ljava/lang/Boolean;", "setStatusBarAnimated", "(Ljava/lang/Boolean;)V", "isStatusBarAnimated", "A", "mNativeBackButtonDismissalEnabled", "Lcom/swmansion/rnscreens/u;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/u;", "headerConfig", "statusBarStyle", "getStatusBarStyle", "()Ljava/lang/String;", "setStatusBarStyle", "(Ljava/lang/String;)V", "statusBarHidden", "e", "setStatusBarHidden", "isStatusBarHidden", "statusBarTranslucent", "f", "setStatusBarTranslucent", "isStatusBarTranslucent", "statusBarColor", "getStatusBarColor", "setStatusBarColor", "(Ljava/lang/Integer;)V", "navigationBarColor", "getNavigationBarColor", "setNavigationBarColor", "navigationBarHidden", "c", "setNavigationBarHidden", "isNavigationBarHidden", "enableNativeBackButtonDismissal", "getNativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "nativeBackButtonDismissalEnabled", "Lcom/facebook/react/bridge/ReactContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.j */
/* loaded from: classes8.dex */
public final class C6308j extends AbstractC6290e {

    /* renamed from: k */
    private C6319n f12792k;

    /* renamed from: l */
    private C6316l<?> f12793l;

    /* renamed from: m */
    private EnumC6309a f12794m;

    /* renamed from: n */
    private boolean f12795n;

    /* renamed from: s */
    private Integer f12800s;

    /* renamed from: t */
    private String f12801t;

    /* renamed from: u */
    private Boolean f12802u;

    /* renamed from: v */
    private Boolean f12803v;

    /* renamed from: w */
    private Integer f12804w;

    /* renamed from: x */
    private Integer f12805x;

    /* renamed from: y */
    private Boolean f12806y;

    /* renamed from: z */
    private Boolean f12807z;

    /* renamed from: o */
    private EnumC6312d f12796o = EnumC6312d.PUSH;

    /* renamed from: p */
    private EnumC6310b f12797p = EnumC6310b.POP;

    /* renamed from: q */
    private EnumC6311c f12798q = EnumC6311c.DEFAULT;

    /* renamed from: r */
    private boolean f12799r = true;

    /* renamed from: A */
    private boolean f37678A = true;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/j$a;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$a */
    /* loaded from: classes8.dex */
    public enum EnumC6309a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/swmansion/rnscreens/j$b;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$b */
    /* loaded from: classes8.dex */
    public enum EnumC6310b {
        PUSH,
        POP
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m15073d2 = {"Lcom/swmansion/rnscreens/j$c;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "o", "p", "q", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$c */
    /* loaded from: classes8.dex */
    public enum EnumC6311c {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/j$d;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$d */
    /* loaded from: classes8.dex */
    public enum EnumC6312d {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m15073d2 = {"Lcom/swmansion/rnscreens/j$e;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "o", "p", "q", "r", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$e */
    /* loaded from: classes8.dex */
    public enum EnumC6313e {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_COLOR,
        NAVIGATION_BAR_HIDDEN
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"com/swmansion/rnscreens/j$f", "Lcom/facebook/react/bridge/GuardedRunnable;", "", "runGuarded", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$f */
    /* loaded from: classes8.dex */
    public static final class C6314f extends GuardedRunnable {

        /* renamed from: k */
        final /* synthetic */ ReactContext f12836k;

        /* renamed from: l */
        final /* synthetic */ C6308j f12837l;

        /* renamed from: m */
        final /* synthetic */ int f12838m;

        /* renamed from: n */
        final /* synthetic */ int f12839n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6314f(ReactContext reactContext, C6308j jVar, int i, int i2) {
            super(reactContext);
            this.f12836k = reactContext;
            this.f12837l = jVar;
            this.f12838m = i;
            this.f12839n = i2;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f12836k.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(this.f12837l.getId(), this.f12838m, this.f12839n);
            }
        }
    }

    public C6308j(ReactContext reactContext) {
        super(reactContext);
        setLayoutParams(new WindowManager.LayoutParams(2));
    }

    /* renamed from: b */
    private final boolean m25926b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m25926b((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final void m25921g(int i, int i2) {
        Context context = getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        reactContext.runOnNativeModulesQueueThread(new C6314f(reactContext, this, i, i2));
    }

    /* renamed from: a */
    public final void m25927a(int i) {
        C6288d dVar;
        setImportantForAccessibility(i);
        C6336u headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            dVar = headerConfig.getToolbar();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.setImportantForAccessibility(i);
        }
    }

    /* renamed from: c */
    public final Boolean m25925c() {
        return this.f12806y;
    }

    /* renamed from: d */
    public final Boolean m25924d() {
        return this.f12807z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        C9971q.m14633g(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        C9971q.m14633g(container, "container");
    }

    /* renamed from: e */
    public final Boolean m25923e() {
        return this.f12802u;
    }

    /* renamed from: f */
    public final Boolean m25922f() {
        return this.f12803v;
    }

    public final EnumC6309a getActivityState() {
        return this.f12794m;
    }

    public final C6316l<?> getContainer() {
        return this.f12793l;
    }

    public final C6319n getFragment() {
        return this.f12792k;
    }

    public final C6336u getHeaderConfig() {
        View childAt = getChildAt(0);
        if (childAt instanceof C6336u) {
            return (C6336u) childAt;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f37678A;
    }

    public final Integer getNavigationBarColor() {
        return this.f12805x;
    }

    public final EnumC6310b getReplaceAnimation() {
        return this.f12797p;
    }

    public final Integer getScreenOrientation() {
        return this.f12800s;
    }

    public final EnumC6311c getStackAnimation() {
        return this.f12798q;
    }

    public final EnumC6312d getStackPresentation() {
        return this.f12796o;
    }

    public final Integer getStatusBarColor() {
        return this.f12804w;
    }

    public final String getStatusBarStyle() {
        return this.f12801t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            m25921g(i3 - i, i4 - i2);
        }
    }

    public final void setActivityState(EnumC6309a activityState) {
        C9971q.m14633g(activityState, "activityState");
        if (activityState != this.f12794m) {
            this.f12794m = activityState;
            C6316l<?> lVar = this.f12793l;
            if (lVar != null) {
                lVar.m25906l();
            }
        }
    }

    public final void setContainer(C6316l<?> lVar) {
        this.f12793l = lVar;
    }

    public final void setFragment(C6319n nVar) {
        this.f12792k = nVar;
    }

    public final void setGestureEnabled(boolean z) {
        this.f12799r = z;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.f37678A = z;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            C6343z.f12923a.m25817d();
        }
        this.f12805x = num;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            C6343z.f12923a.m25805p(this, nVar.m25878y());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            C6343z.f12923a.m25817d();
        }
        this.f12806y = bool;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            C6343z.f12923a.m25804q(this, nVar.m25878y());
        }
    }

    public final void setReplaceAnimation(EnumC6310b bVar) {
        C9971q.m14633g(bVar, "<set-?>");
        this.f12797p = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setScreenOrientation(String str) {
        int i;
        if (str == null) {
            this.f12800s = null;
            return;
        }
        C6343z zVar = C6343z.f12923a;
        zVar.m25816e();
        switch (str.hashCode()) {
            case -1894896954:
                if (str.equals("portrait_down")) {
                    i = 9;
                    break;
                }
                i = -1;
                break;
            case 96673:
                if (str.equals("all")) {
                    i = 10;
                    break;
                }
                i = -1;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i = 7;
                    break;
                }
                i = -1;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i = 6;
                    break;
                }
                i = -1;
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i = 1;
                    break;
                }
                i = -1;
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i = 8;
                    break;
                }
                i = -1;
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i = 0;
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        this.f12800s = i;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            zVar.m25803r(this, nVar.m25878y());
        }
    }

    public final void setStackAnimation(EnumC6311c cVar) {
        C9971q.m14633g(cVar, "<set-?>");
        this.f12798q = cVar;
    }

    public final void setStackPresentation(EnumC6312d dVar) {
        C9971q.m14633g(dVar, "<set-?>");
        this.f12796o = dVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f12807z = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            C6343z.f12923a.m25815f();
        }
        this.f12804w = num;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            C6343z.f12923a.m25809l(this, nVar.m25878y(), nVar.m25877z());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            C6343z.f12923a.m25815f();
        }
        this.f12802u = bool;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            C6343z.f12923a.m25807n(this, nVar.m25878y());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            C6343z.f12923a.m25815f();
        }
        this.f12801t = str;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            C6343z.f12923a.m25801t(this, nVar.m25878y(), nVar.m25877z());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            C6343z.f12923a.m25815f();
        }
        this.f12803v = bool;
        C6319n nVar = this.f12792k;
        if (nVar != null) {
            C6343z.f12923a.m25800u(this, nVar.m25878y(), nVar.m25877z());
        }
    }

    public final void setTransitioning(boolean z) {
        if (this.f12795n != z) {
            this.f12795n = z;
            boolean b = m25926b(this);
            int i = 2;
            if (!b || getLayerType() == 2) {
                if (!z || b) {
                    i = 0;
                }
                super.setLayerType(i, null);
            }
        }
    }
}
