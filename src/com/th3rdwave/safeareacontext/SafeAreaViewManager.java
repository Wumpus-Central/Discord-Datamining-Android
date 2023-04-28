package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewManager;
import java.util.EnumSet;

/* loaded from: classes8.dex */
public class SafeAreaViewManager extends ReactViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return C6357h.class;
    }

    @ReactProp(name = "edges")
    public void setEdges(ViewTreeObserver$OnPreDrawListenerC6352d dVar, ReadableArray readableArray) {
        EnumSet<EnumC6354e> noneOf = EnumSet.noneOf(EnumC6354e.class);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (ViewProps.TOP.equals(string)) {
                    noneOf.add(EnumC6354e.TOP);
                } else if (ViewProps.RIGHT.equals(string)) {
                    noneOf.add(EnumC6354e.RIGHT);
                } else if (ViewProps.BOTTOM.equals(string)) {
                    noneOf.add(EnumC6354e.BOTTOM);
                } else if (ViewProps.LEFT.equals(string)) {
                    noneOf.add(EnumC6354e.LEFT);
                }
            }
        }
        dVar.setEdges(noneOf);
    }

    @ReactProp(name = "mode")
    public void setMode(ViewTreeObserver$OnPreDrawListenerC6352d dVar, String str) {
        if (ViewProps.PADDING.equals(str)) {
            dVar.setMode(EnumC6356g.PADDING);
        } else if (ViewProps.MARGIN.equals(str)) {
            dVar.setMode(EnumC6356g.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C6357h createShadowNodeInstance() {
        return new C6357h();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ViewTreeObserver$OnPreDrawListenerC6352d createViewInstance(ThemedReactContext themedReactContext) {
        return new ViewTreeObserver$OnPreDrawListenerC6352d(themedReactContext);
    }
}
