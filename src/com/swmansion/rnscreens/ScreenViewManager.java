package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.C6308j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenViewManager.REACT_CLASS)
@Metadata(m15074d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0007J\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0017J!\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0013H\u0017J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0013H\u0017J!\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010'\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0013H\u0017J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0013H\u0017J\u001a\u0010+\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u0010,\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u000eH\u0016J\u001a\u0010-\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u0010.\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001c\u00100\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00101\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u00102\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001c\u00103\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020504H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u000207H\u0014R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, m15073d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/j;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "view", "", "activityState", "", "setActivityState", "", "presentation", "setStackPresentation", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/j;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setFullScreenSwipeEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "", "", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class ScreenViewManager extends ViewGroupManager<C6308j> implements RNSScreenManagerInterface<C6308j> {
    public static final C6279a Companion = new C6279a(null);
    public static final String REACT_CLASS = "RNSScreen";
    private final ViewManagerDelegate<C6308j> mDelegate = new RNSScreenManagerDelegate(this);

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenViewManager$a */
    /* loaded from: classes8.dex */
    public static final class C6279a {
        private C6279a() {
        }

        public /* synthetic */ C6279a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C6308j> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> of = MapBuilder.m30825of("topDismissed", MapBuilder.m30831of("registrationName", "onDismissed"), "topWillAppear", MapBuilder.m30831of("registrationName", "onWillAppear"), "topAppear", MapBuilder.m30831of("registrationName", "onAppear"), "topWillDisappear", MapBuilder.m30831of("registrationName", "onWillDisappear"), "topDisappear", MapBuilder.m30831of("registrationName", "onDisappear"), "topHeaderBackButtonClickedEvent", MapBuilder.m30831of("registrationName", "onHeaderBackButtonClicked"), "topTransitionProgress", MapBuilder.m30831of("registrationName", "onTransitionProgress"));
        C9971q.m14634f(of, "of(\n            ScreenDi…itionProgress\")\n        )");
        return of;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public void setCustomAnimationOnSwipe(C6308j jVar, boolean z) {
    }

    public void setFullScreenSwipeEnabled(C6308j jVar, boolean z) {
    }

    public void setGestureResponseDistance(C6308j jVar, ReadableMap readableMap) {
    }

    public void setHideKeyboardOnSwipe(C6308j jVar, boolean z) {
    }

    public void setHomeIndicatorHidden(C6308j jVar, boolean z) {
    }

    public void setPreventNativeDismiss(C6308j jVar, boolean z) {
    }

    public void setSwipeDirection(C6308j jVar, String str) {
    }

    public void setTransitionDuration(C6308j jVar, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C6308j createViewInstance(ThemedReactContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
        return new C6308j(reactContext);
    }

    public void setActivityState(C6308j view, float f) {
        C9971q.m14633g(view, "view");
        setActivityState(view, (int) f);
    }

    @ReactProp(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(C6308j view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setGestureEnabled(z);
    }

    @ReactProp(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(C6308j view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setNativeBackButtonDismissalEnabled(z);
    }

    @ReactProp(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(C6308j view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setNavigationBarColor(num);
    }

    @ReactProp(name = "navigationBarHidden")
    public void setNavigationBarHidden(C6308j view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(z));
    }

    @ReactProp(name = "replaceAnimation")
    public void setReplaceAnimation(C6308j view, String str) {
        C6308j.EnumC6310b bVar;
        C9971q.m14633g(view, "view");
        if (str == null ? true : C9971q.m14638b(str, "pop")) {
            bVar = C6308j.EnumC6310b.POP;
        } else if (C9971q.m14638b(str, "push")) {
            bVar = C6308j.EnumC6310b.PUSH;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
        }
        view.setReplaceAnimation(bVar);
    }

    @ReactProp(name = "screenOrientation")
    public void setScreenOrientation(C6308j view, String str) {
        C9971q.m14633g(view, "view");
        view.setScreenOrientation(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4.equals("default") != false) goto L_0x0084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r4.equals("flip") != false) goto L_0x0084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r4.equals("simple_push") != false) goto L_0x0084;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackAnimation(com.swmansion.rnscreens.C6308j r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            if (r4 == 0) goto L_0x0084
            int r0 = r4.hashCode()
            switch(r0) {
                case -1418955385: goto L_0x0064;
                case -427095442: goto L_0x0059;
                case -349395819: goto L_0x004e;
                case 3135100: goto L_0x0043;
                case 3145837: goto L_0x003a;
                case 3387192: goto L_0x002f;
                case 182437661: goto L_0x0024;
                case 1544803905: goto L_0x001b;
                case 1601504978: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x006d
        L_0x000f:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.SLIDE_FROM_BOTTOM
            goto L_0x0086
        L_0x001b:
            java.lang.String r0 = "default"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x0024:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.FADE_FROM_BOTTOM
            goto L_0x0086
        L_0x002f:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.NONE
            goto L_0x0086
        L_0x003a:
            java.lang.String r0 = "flip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x0043:
            java.lang.String r0 = "fade"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.FADE
            goto L_0x0086
        L_0x004e:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.SLIDE_FROM_RIGHT
            goto L_0x0086
        L_0x0059:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.SLIDE_FROM_LEFT
            goto L_0x0086
        L_0x0064:
            java.lang.String r0 = "simple_push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x006d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown animation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0084:
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C6308j.EnumC6311c.DEFAULT
        L_0x0086:
            r3.setStackAnimation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.j, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.equals("containedTransparentModal") != false) goto L_0x0051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r4.equals("containedModal") != false) goto L_0x003b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r4.equals("modal") != false) goto L_0x003b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r4 = com.swmansion.rnscreens.C6308j.EnumC6312d.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r4.equals("transparentModal") != false) goto L_0x0051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        r4 = com.swmansion.rnscreens.C6308j.EnumC6312d.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r4.equals("formSheet") != false) goto L_0x003b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r4.equals("fullScreenModal") != false) goto L_0x003b;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackPresentation(com.swmansion.rnscreens.C6308j r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            if (r4 == 0) goto L_0x0057
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L_0x0049;
                case 3452698: goto L_0x003e;
                case 104069805: goto L_0x0033;
                case 438078970: goto L_0x002a;
                case 955284238: goto L_0x0021;
                case 1171936146: goto L_0x0018;
                case 1798290171: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0057
        L_0x000f:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0018:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0021:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0051
        L_0x002a:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0033:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x003b:
            com.swmansion.rnscreens.j$d r4 = com.swmansion.rnscreens.C6308j.EnumC6312d.MODAL
            goto L_0x0053
        L_0x003e:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            com.swmansion.rnscreens.j$d r4 = com.swmansion.rnscreens.C6308j.EnumC6312d.PUSH
            goto L_0x0053
        L_0x0049:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x0051:
            com.swmansion.rnscreens.j$d r4 = com.swmansion.rnscreens.C6308j.EnumC6312d.TRANSPARENT_MODAL
        L_0x0053:
            r3.setStackPresentation(r4)
            return
        L_0x0057:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.j, java.lang.String):void");
    }

    @ReactProp(name = "statusBarAnimation")
    public void setStatusBarAnimation(C6308j view, String str) {
        C9971q.m14633g(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf(str != null && !C9971q.m14638b(ViewProps.NONE, str)));
    }

    @ReactProp(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(C6308j view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setStatusBarColor(num);
    }

    @ReactProp(name = "statusBarHidden")
    public void setStatusBarHidden(C6308j view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(z));
    }

    @ReactProp(name = "statusBarStyle")
    public void setStatusBarStyle(C6308j view, String str) {
        C9971q.m14633g(view, "view");
        view.setStatusBarStyle(str);
    }

    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C6308j view, boolean z) {
        C9971q.m14633g(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(z));
    }

    @ReactProp(name = "activityState")
    public final void setActivityState(C6308j view, int i) {
        C9971q.m14633g(view, "view");
        if (i != -1) {
            if (i == 0) {
                view.setActivityState(C6308j.EnumC6309a.INACTIVE);
            } else if (i == 1) {
                view.setActivityState(C6308j.EnumC6309a.TRANSITIONING_OR_BELOW_TOP);
            } else if (i == 2) {
                view.setActivityState(C6308j.EnumC6309a.ON_TOP);
            }
        }
    }
}
