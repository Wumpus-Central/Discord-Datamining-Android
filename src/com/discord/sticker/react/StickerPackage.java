package com.discord.sticker.react;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9610j;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/sticker/react/StickerPackage;", "Lcom/facebook/react/ReactPackage;", "()V", "createNativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "sticker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class StickerPackage implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        C9677q.m14633g(reactContext, "reactContext");
        return new ArrayList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, LayoutShadowNode>> o;
        C9677q.m14633g(reactContext, "reactContext");
        o = C9610j.m14814o(new StickerViewManagerAPNG(), new StickerViewManagerLottie());
        return o;
    }
}
