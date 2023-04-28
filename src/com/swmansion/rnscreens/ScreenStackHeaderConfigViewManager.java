package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001OB\u0007¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u001a\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0017J!\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b(\u0010&J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0018H\u0017J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0018H\u0017J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0018H\u0017J!\u00100\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b0\u0010&J\u0018\u00102\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0018H\u0017J\u0018\u00104\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0018H\u0017J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0018H\u0017J\u001a\u00108\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0004H\u0017J\u0016\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000109H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0014J\u001c\u0010?\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010@\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010A\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u000fH\u0016J\u001a\u0010B\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J\u001c\u0010C\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010D\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u000fH\u0016J\u001c\u0010E\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J#\u0010F\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bF\u0010&J\u001a\u0010G\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J#\u0010H\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bH\u0010&J\u001a\u0010I\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006P"}, m15073d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/u;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;", "", "propName", "", "logNotAvailable", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "parent", "Landroid/view/View;", "child", "", "index", "addView", "view", "onDropViewInstance", "removeAllViews", "removeViewAt", "getChildCount", "getChildAt", "", "needsCustomLayoutForChildren", "onAfterUpdateTransaction", "config", "title", "setTitle", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", ViewProps.COLOR, "setColor", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "", "", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<C6336u> implements RNSScreenStackHeaderConfigManagerInterface<C6336u> {
    public static final C6276a Companion = new C6276a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final ViewManagerDelegate<C6336u> mDelegate = new RNSScreenStackHeaderConfigManagerDelegate(this);

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager$a */
    /* loaded from: classes8.dex */
    public static final class C6276a {
        private C6276a() {
        }

        public /* synthetic */ C6276a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("RN SCREENS", str + " prop is not available on Android");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C6336u> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("onAttached", MapBuilder.m30831of("registrationName", "onAttached")).put("onDetached", MapBuilder.m30831of("registrationName", "onDetached")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void addView(C6336u parent, View child, int i) {
        C9971q.m14633g(parent, "parent");
        C9971q.m14633g(child, "child");
        if (child instanceof C6338v) {
            parent.m25830b((C6338v) child, i);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C6336u createViewInstance(ThemedReactContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
        return new C6336u(reactContext);
    }

    public View getChildAt(C6336u parent, int i) {
        C9971q.m14633g(parent, "parent");
        return parent.m25828d(i);
    }

    public int getChildCount(C6336u parent) {
        C9971q.m14633g(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C6336u parent) {
        C9971q.m14633g(parent, "parent");
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) parent);
        parent.m25825g();
    }

    public void onDropViewInstance(C6336u view) {
        C9971q.m14633g(view, "view");
        view.m25829c();
    }

    public void removeAllViews(C6336u parent) {
        C9971q.m14633g(parent, "parent");
        parent.m25824h();
    }

    public void removeViewAt(C6336u parent, int i) {
        C9971q.m14633g(parent, "parent");
        parent.m25823i(i);
    }

    @ReactProp(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(C6336u config, boolean z) {
        C9971q.m14633g(config, "config");
        config.setBackButtonInCustomView(z);
    }

    public void setBackTitle(C6336u uVar, String str) {
        logNotAvailable("backTitle");
    }

    public void setBackTitleFontFamily(C6336u uVar, String str) {
        logNotAvailable("backTitleFontFamily");
    }

    public void setBackTitleFontSize(C6336u uVar, int i) {
        logNotAvailable("backTitleFontSize");
    }

    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(C6336u config, Integer num) {
        C9971q.m14633g(config, "config");
        config.setBackgroundColor(num);
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(C6336u config, Integer num) {
        C9971q.m14633g(config, "config");
        config.setTintColor(num != null ? num.intValue() : 0);
    }

    @ReactProp(name = "direction")
    public void setDirection(C6336u config, String str) {
        C9971q.m14633g(config, "config");
        config.setDirection(str);
    }

    public void setDisableBackButtonMenu(C6336u uVar, boolean z) {
        logNotAvailable("disableBackButtonMenu");
    }

    @ReactProp(name = ViewProps.HIDDEN)
    public void setHidden(C6336u config, boolean z) {
        C9971q.m14633g(config, "config");
        config.setHidden(z);
    }

    @ReactProp(name = "hideBackButton")
    public void setHideBackButton(C6336u config, boolean z) {
        C9971q.m14633g(config, "config");
        config.setHideBackButton(z);
    }

    @ReactProp(name = "hideShadow")
    public void setHideShadow(C6336u config, boolean z) {
        C9971q.m14633g(config, "config");
        config.setHideShadow(z);
    }

    public void setLargeTitle(C6336u uVar, boolean z) {
        logNotAvailable("largeTitle");
    }

    public void setLargeTitleBackgroundColor(C6336u uVar, Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    public void setLargeTitleColor(C6336u uVar, Integer num) {
        logNotAvailable("largeTitleColor");
    }

    public void setLargeTitleFontFamily(C6336u uVar, String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    public void setLargeTitleFontSize(C6336u uVar, int i) {
        logNotAvailable("largeTitleFontSize");
    }

    public void setLargeTitleFontWeight(C6336u uVar, String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    public void setLargeTitleHideShadow(C6336u uVar, boolean z) {
        logNotAvailable("largeTitleHideShadow");
    }

    @ReactProp(name = "title")
    public void setTitle(C6336u config, String str) {
        C9971q.m14633g(config, "config");
        config.setTitle(str);
    }

    @ReactProp(customType = "Color", name = "titleColor")
    public void setTitleColor(C6336u config, Integer num) {
        C9971q.m14633g(config, "config");
        if (num != null) {
            config.setTitleColor(num.intValue());
        }
    }

    @ReactProp(name = "titleFontFamily")
    public void setTitleFontFamily(C6336u config, String str) {
        C9971q.m14633g(config, "config");
        config.setTitleFontFamily(str);
    }

    @ReactProp(name = "titleFontSize")
    public void setTitleFontSize(C6336u config, int i) {
        C9971q.m14633g(config, "config");
        config.setTitleFontSize(i);
    }

    @ReactProp(name = "titleFontWeight")
    public void setTitleFontWeight(C6336u config, String str) {
        C9971q.m14633g(config, "config");
        config.setTitleFontWeight(str);
    }

    @ReactProp(name = "topInsetEnabled")
    public void setTopInsetEnabled(C6336u config, boolean z) {
        C9971q.m14633g(config, "config");
        config.setTopInsetEnabled(z);
    }

    @ReactProp(name = "translucent")
    public void setTranslucent(C6336u config, boolean z) {
        C9971q.m14633g(config, "config");
        config.setTranslucent(z);
    }
}
