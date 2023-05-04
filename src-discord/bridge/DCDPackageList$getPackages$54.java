package com.discord.bridge;

import com.discord.channel_spine.ChannelSpineViewManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "it", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DCDPackageList$getPackages$54 extends s implements Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> {
    public static final DCDPackageList$getPackages$54 INSTANCE = new DCDPackageList$getPackages$54();

    DCDPackageList$getPackages$54() {
        super(1);
    }

    public final ViewManager<?, LayoutShadowNode> invoke(ReactApplicationContext it) {
        q.g(it, "it");
        return new ChannelSpineViewManager();
    }
}
