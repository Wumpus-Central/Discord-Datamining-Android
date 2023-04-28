package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenContainerViewManager.REACT_CLASS)
@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J$\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u0011\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001e"}, m15073d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/l;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "Lcom/swmansion/rnscreens/n;", "createViewInstance", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "removeViewAt", "removeAllViews", "getChildCount", "getChildAt", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "", "needsCustomLayoutForChildren", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class ScreenContainerViewManager extends ViewGroupManager<C6316l<?>> {
    public static final C6275a Companion = new C6275a(null);
    public static final String REACT_CLASS = "RNSScreenContainer";

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenContainerViewManager$a */
    /* loaded from: classes8.dex */
    public static final class C6275a {
        private C6275a() {
        }

        public /* synthetic */ C6275a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void addView(C6316l<?> parent, View child, int i) {
        C9971q.m14633g(parent, "parent");
        C9971q.m14633g(child, "child");
        if (child instanceof C6308j) {
            parent.m25913d((C6308j) child, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens".toString());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance(ReactApplicationContext context) {
        C9971q.m14633g(context, "context");
        return new C6289d0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C6316l<C6319n> createViewInstance(ThemedReactContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
        return new C6316l<>(reactContext);
    }

    public View getChildAt(C6316l<?> parent, int i) {
        C9971q.m14633g(parent, "parent");
        return parent.m25907j(i);
    }

    public int getChildCount(C6316l<?> parent) {
        C9971q.m14633g(parent, "parent");
        return parent.getScreenCount();
    }

    public void removeAllViews(C6316l<?> parent) {
        C9971q.m14633g(parent, "parent");
        parent.mo25859s();
    }

    public void removeViewAt(C6316l<?> parent, int i) {
        C9971q.m14633g(parent, "parent");
        parent.mo25858u(i);
    }
}
