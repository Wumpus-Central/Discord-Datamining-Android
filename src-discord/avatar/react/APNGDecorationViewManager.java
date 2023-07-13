package com.discord.avatar.react;

import com.discord.avatar.decoration.DecorationView;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.APNGDecorationViewManagerDelegate;
import com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = APNGDecorationViewManager.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/avatar/react/APNGDecorationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/avatar/decoration/DecorationView;", "Lcom/facebook/react/viewmanagers/APNGDecorationViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/APNGDecorationViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "onDropViewInstance", "", "view", "setUrl", "value", "Companion", "avatar_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class APNGDecorationViewManager extends SimpleViewManager<DecorationView> implements APNGDecorationViewManagerInterface<DecorationView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "APNGDecorationView";
    private final APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> delegate = new APNGDecorationViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/avatar/react/APNGDecorationViewManager$Companion;", "", "()V", "NAME", "", "avatar_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public DecorationView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        DecorationView decorationView = new DecorationView(reactContext, null, 0, 6, null);
        decorationView.inflateApngView(false);
        return decorationView;
    }

    
    @Override 
    public APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> getDelegate() {
        return this.delegate;
    }

    public void onDropViewInstance(DecorationView view) {
        q.g(view, "view");
        view.recycle();
    }

    @ReactProp(name = "url")
    public void setUrl(DecorationView view, String str) {
        q.g(view, "view");
        if (str != null) {
            view.asDecoration(str, null, null, true);
        }
    }
}
