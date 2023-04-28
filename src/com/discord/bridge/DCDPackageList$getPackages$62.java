package com.discord.bridge;

import com.discord.portals.PortalViewModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "it", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class DCDPackageList$getPackages$62 extends AbstractC9679s implements Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> {
    public static final DCDPackageList$getPackages$62 INSTANCE = new DCDPackageList$getPackages$62();

    DCDPackageList$getPackages$62() {
        super(1);
    }

    public final ViewManager<?, LayoutShadowNode> invoke(ReactApplicationContext it) {
        C9677q.m14633g(it, "it");
        return new PortalViewModule.PortalViewManager();
    }
}
