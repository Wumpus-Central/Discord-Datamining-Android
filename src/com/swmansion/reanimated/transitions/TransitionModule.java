package com.swmansion.reanimated.transitions;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C3184a0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes8.dex */
public class TransitionModule {
    private final UIManagerModule mUIManager;

    public TransitionModule(UIManagerModule uIManagerModule) {
        this.mUIManager = uIManagerModule;
    }

    public void animateNextTransition(final int i, final ReadableMap readableMap) {
        this.mUIManager.prependUIBlock(new UIBlock() { // from class: com.swmansion.reanimated.transitions.TransitionModule.1
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                try {
                    View resolveView = nativeViewHierarchyManager.resolveView(i);
                    if (resolveView instanceof ViewGroup) {
                        ReadableArray array = readableMap.getArray("transitions");
                        int size = array.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C3184a0.m34980a((ViewGroup) resolveView, TransitionUtils.inflate(array.getMap(i2)));
                        }
                    }
                } catch (IllegalViewOperationException unused) {
                }
            }
        });
    }
}
