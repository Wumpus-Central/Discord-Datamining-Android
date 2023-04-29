package com.discord.avatar.react;

import com.discord.avatar.decoration.DecorationView;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/discord/avatar/react/APNGDecorationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/avatar/decoration/DecorationView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "decorationUrl", "", "view", "url", "", "getName", "onDropViewInstance", "avatar_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class APNGDecorationViewManager extends SimpleViewManager<DecorationView> {
    @ReactProp(name = "url")
    public final void decorationUrl(DecorationView view, String url) {
        q.g(view, "view");
        q.g(url, "url");
        view.asDecoration(url, null, null, true);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "APNGDecorationView";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public DecorationView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        DecorationView decorationView = new DecorationView(reactContext, null, 0, 6, null);
        decorationView.inflateApngView(false);
        return decorationView;
    }

    public void onDropViewInstance(DecorationView view) {
        q.g(view, "view");
        super.onDropViewInstance((APNGDecorationViewManager) view);
        view.recycle();
    }
}
