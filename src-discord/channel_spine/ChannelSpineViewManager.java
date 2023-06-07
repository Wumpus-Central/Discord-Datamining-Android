package com.discord.channel_spine;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lcom/discord/channel_spine/ChannelSpineViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/channel_spine/ChannelSpineView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "numRows", "", "view", "", "rowHeight", "height", "", "channel_spine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChannelSpineViewManager extends SimpleViewManager<ChannelSpineView> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return ChannelSpineViewManagerImpl.NAME;
    }

    @ReactProp(name = "numRows")
    public final void numRows(ChannelSpineView view, int i10) {
        q.g(view, "view");
        ChannelSpineViewManagerImpl.INSTANCE.numRows(view, i10);
    }

    @ReactProp(name = "rowHeight")
    public final void rowHeight(ChannelSpineView view, float f10) {
        q.g(view, "view");
        ChannelSpineViewManagerImpl.INSTANCE.rowHeight(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ChannelSpineView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return ChannelSpineViewManagerImpl.INSTANCE.createViewInstance(reactContext);
    }
}
