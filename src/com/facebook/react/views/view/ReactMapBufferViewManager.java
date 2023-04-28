package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\"\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J0\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m15073d2 = {"Lcom/facebook/react/views/view/ReactMapBufferViewManager;", "Lcom/facebook/react/views/view/ReactViewManagerWrapper;", "()V", "viewGroupManager", "Lcom/facebook/react/uimanager/ViewGroupManager;", "getViewGroupManager", "()Lcom/facebook/react/uimanager/ViewGroupManager;", "viewManager", "Lcom/facebook/react/views/view/ReactViewManager;", "createView", "Landroid/view/View;", "reactTag", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "props", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "jsResponderHandler", "Lcom/facebook/react/touch/JSResponderHandler;", "getName", "", "onDropViewInstance", "", "view", "receiveCommand", "root", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "setPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateExtraData", "extraData", "updateProperties", "viewToUpdate", "updateState", "ReactAndroid_release"}, m15072k = 1, m15071mv = {1, 6, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class ReactMapBufferViewManager implements ReactViewManagerWrapper {
    public static final ReactMapBufferViewManager INSTANCE = new ReactMapBufferViewManager();
    private static final ReactViewManager viewManager = new ReactViewManager();

    private ReactMapBufferViewManager() {
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View createView(int r8, com.facebook.react.uimanager.ThemedReactContext r9, java.lang.Object r10, com.facebook.react.uimanager.StateWrapper r11, com.facebook.react.touch.JSResponderHandler r12) {
        /*
            r7 = this;
            java.lang.String r0 = "reactContext"
            kotlin.jvm.internal.C9971q.m14633g(r9, r0)
            java.lang.String r0 = "jsResponderHandler"
            kotlin.jvm.internal.C9971q.m14633g(r12, r0)
            com.facebook.react.views.view.ReactViewManager r1 = com.facebook.react.views.view.ReactMapBufferViewManager.viewManager
            boolean r0 = r10 instanceof com.facebook.react.uimanager.ReactStylesDiffMap
            if (r0 == 0) goto L_0x0014
            r0 = r10
            com.facebook.react.uimanager.ReactStylesDiffMap r0 = (com.facebook.react.uimanager.ReactStylesDiffMap) r0
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r4 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            android.view.View r8 = r1.createView(r2, r3, r4, r5, r6)
            r9 = r8
            com.facebook.react.views.view.ReactViewGroup r9 = (com.facebook.react.views.view.ReactViewGroup) r9
            boolean r11 = r10 instanceof com.facebook.react.common.mapbuffer.ReadableMapBuffer
            if (r11 == 0) goto L_0x002f
            com.facebook.react.views.view.ReactMapBufferViewManager r11 = com.facebook.react.views.view.ReactMapBufferViewManager.INSTANCE
            java.lang.String r12 = "view"
            kotlin.jvm.internal.C9971q.m14634f(r9, r12)
            r11.updateProperties(r9, r10)
        L_0x002f:
            java.lang.String r9 = "viewManager\n          .c…            }\n          }"
            kotlin.jvm.internal.C9971q.m14634f(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactMapBufferViewManager.createView(int, com.facebook.react.uimanager.ThemedReactContext, java.lang.Object, com.facebook.react.uimanager.StateWrapper, com.facebook.react.touch.JSResponderHandler):android.view.View");
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public String getName() {
        String name = viewManager.getName();
        C9971q.m14634f(name, "viewManager.name");
        return name;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public ViewGroupManager<?> getViewGroupManager() {
        return viewManager;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void onDropViewInstance(View view) {
        C9971q.m14633g(view, "view");
        viewManager.onDropViewInstance((ReactViewGroup) view);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void receiveCommand(View root, String commandId, ReadableArray readableArray) {
        C9971q.m14633g(root, "root");
        C9971q.m14633g(commandId, "commandId");
        viewManager.receiveCommand((ReactViewGroup) root, commandId, readableArray);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void setPadding(View view, int i, int i2, int i3, int i4) {
        C9971q.m14633g(view, "view");
        viewManager.setPadding((ReactViewGroup) view, i, i2, i3, i4);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void updateExtraData(View root, Object obj) {
        C9971q.m14633g(root, "root");
        viewManager.updateExtraData((ReactViewManager) ((ReactViewGroup) root), obj);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void updateProperties(View viewToUpdate, Object obj) {
        ReactStylesDiffMap reactStylesDiffMap;
        C9971q.m14633g(viewToUpdate, "viewToUpdate");
        if (!(obj instanceof ReadableMapBuffer)) {
            ReactViewManager reactViewManager = viewManager;
            ReactViewGroup reactViewGroup = (ReactViewGroup) viewToUpdate;
            if (obj instanceof ReactStylesDiffMap) {
                reactStylesDiffMap = (ReactStylesDiffMap) obj;
            } else {
                reactStylesDiffMap = null;
            }
            reactViewManager.updateProperties(reactViewGroup, reactStylesDiffMap);
            return;
        }
        ReactMapBufferPropSetter.INSTANCE.setProps((ReactViewGroup) viewToUpdate, viewManager, (MapBuffer) obj);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public Object updateState(View view, Object obj, StateWrapper stateWrapper) {
        C9971q.m14633g(view, "view");
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void receiveCommand(View root, int i, ReadableArray readableArray) {
        C9971q.m14633g(root, "root");
        viewManager.receiveCommand((ReactViewGroup) root, i, readableArray);
    }
}
