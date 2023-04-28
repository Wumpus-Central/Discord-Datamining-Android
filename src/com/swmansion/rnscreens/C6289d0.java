package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lcom/swmansion/rnscreens/d0;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "nativeViewHierarchyOptimizer", "", "onBeforeLayout", "Lcom/facebook/react/bridge/ReactContext;", "a", "Lcom/facebook/react/bridge/ReactContext;", "mContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.d0 */
/* loaded from: classes8.dex */
public final class C6289d0 extends LayoutShadowNode {

    /* renamed from: a */
    private ReactContext f12737a;

    public C6289d0(ReactContext mContext) {
        C9971q.m14633g(mContext, "mContext");
        this.f12737a = mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m25968b(C6289d0 this$0, NativeViewHierarchyManager nativeViewHierarchyManager) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(nativeViewHierarchyManager, "nativeViewHierarchyManager");
        View resolveView = nativeViewHierarchyManager.resolveView(this$0.getReactTag());
        if (resolveView instanceof C6316l) {
            ((C6316l) resolveView).m25903q();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        C9971q.m14633g(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f12737a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new UIBlock() { // from class: com.swmansion.rnscreens.c0
                @Override // com.facebook.react.uimanager.UIBlock
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    C6289d0.m25968b(C6289d0.this, nativeViewHierarchyManager);
                }
            });
        }
    }
}
