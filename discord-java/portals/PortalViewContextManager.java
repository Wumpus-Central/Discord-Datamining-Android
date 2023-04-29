package com.discord.portals;

import android.view.View;
import android.widget.FrameLayout;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jl\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00142\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0014H\u0007J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\fJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discord/portals/PortalViewContextManager;", "", "()V", "_portalContextIdsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/discord/portals/PortalViewContextManager$Event;", "portalContextIdsFlow", "Lkotlinx/coroutines/flow/Flow;", "getPortalContextIdsFlow", "()Lkotlinx/coroutines/flow/Flow;", "portalContextMap", "", "", "Lcom/discord/portals/PortalViewContext;", "addPortal", "", "portal", "view", "Landroid/view/View;", "removeViewFromParent", "Lkotlin/Function1;", "onViewAddedToPortal", "onViewRemovedFromPortal", "returnViewToParent", "getViewContext", "isMediaViewBeingPortaled", "", "(Ljava/lang/Double;)Ljava/lang/Boolean;", "registerView", "portalView", "Landroid/widget/FrameLayout;", "unregisterView", "Event", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PortalViewContextManager {
    private static MutableStateFlow<Event> _portalContextIdsFlow;
    private static final Flow<Event> portalContextIdsFlow;
    public static final PortalViewContextManager INSTANCE = new PortalViewContextManager();
    private static Map<Double, PortalViewContext> portalContextMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/portals/PortalViewContextManager$Event;", "", "()V", "PortalRegistered", "Lcom/discord/portals/PortalViewContextManager$Event$PortalRegistered;", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Event {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/portals/PortalViewContextManager$Event$PortalRegistered;", "Lcom/discord/portals/PortalViewContextManager$Event;", "()V", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class PortalRegistered extends Event {
            public static final PortalRegistered INSTANCE = new PortalRegistered();

            private PortalRegistered() {
                super(null);
            }
        }

        private Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        MutableStateFlow<Event> a10 = q.a(null);
        _portalContextIdsFlow = a10;
        portalContextIdsFlow = a10;
    }

    private PortalViewContextManager() {
    }

    public static /* synthetic */ void addPortal$default(PortalViewContextManager portalViewContextManager, double d10, View view, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, Object obj) {
        PortalViewContextManager$addPortal$1 portalViewContextManager$addPortal$1;
        PortalViewContextManager$addPortal$2 portalViewContextManager$addPortal$2;
        if ((i10 & 8) != 0) {
            portalViewContextManager$addPortal$1 = PortalViewContextManager$addPortal$1.INSTANCE;
        } else {
            portalViewContextManager$addPortal$1 = function12;
        }
        if ((i10 & 16) != 0) {
            portalViewContextManager$addPortal$2 = PortalViewContextManager$addPortal$2.INSTANCE;
        } else {
            portalViewContextManager$addPortal$2 = function13;
        }
        portalViewContextManager.addPortal(d10, view, function1, portalViewContextManager$addPortal$1, portalViewContextManager$addPortal$2, function14);
    }

    public final void addPortal(double d10, View view, Function1<? super View, Unit> removeViewFromParent, Function1<? super View, Unit> onViewAddedToPortal, Function1<? super View, Unit> onViewRemovedFromPortal, Function1<? super View, Unit> returnViewToParent) {
        kotlin.jvm.internal.q.g(view, "view");
        kotlin.jvm.internal.q.g(removeViewFromParent, "removeViewFromParent");
        kotlin.jvm.internal.q.g(onViewAddedToPortal, "onViewAddedToPortal");
        kotlin.jvm.internal.q.g(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        kotlin.jvm.internal.q.g(returnViewToParent, "returnViewToParent");
        if (portalContextMap.get(Double.valueOf(d10)) == null) {
            portalContextMap.put(Double.valueOf(d10), new PortalViewContext(new WeakReference(view), removeViewFromParent, onViewAddedToPortal, onViewRemovedFromPortal, returnViewToParent));
        }
    }

    public final Flow<Event> getPortalContextIdsFlow() {
        return portalContextIdsFlow;
    }

    public final PortalViewContext getViewContext(double d10) {
        return portalContextMap.get(Double.valueOf(d10));
    }

    public final Boolean isMediaViewBeingPortaled(Double d10) {
        if (portalContextMap.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(portalContextMap.containsKey(d10));
    }

    public final void registerView(double d10, FrameLayout portalView) {
        View view;
        kotlin.jvm.internal.q.g(portalView, "portalView");
        PortalViewContext portalViewContext = portalContextMap.get(Double.valueOf(d10));
        if (portalViewContext != null && (view = portalViewContext.getView().get()) != null) {
            kotlin.jvm.internal.q.f(view, "context.view.get() ?: return@let");
            portalViewContext.getRemoveViewFromParent().invoke(view);
            portalView.addView(view);
            ViewMeasureExtensionsKt.measureAndLayout(portalView);
            portalViewContext.getOnViewAddedToPortal().invoke(view);
            _portalContextIdsFlow.setValue(Event.PortalRegistered.INSTANCE);
        }
    }

    public final void unregisterView(double d10) {
        PortalViewContext remove = portalContextMap.remove(Double.valueOf(d10));
        if (remove != null) {
            _portalContextIdsFlow.setValue(null);
            View view = remove.getView().get();
            if (view != null) {
                kotlin.jvm.internal.q.f(view, "context.view.get() ?: return");
                PortalViewContextUtilsKt.removeFromParent(view);
                remove.getOnViewRemovedFromPortal().invoke(view);
                remove.getReturnViewToParent().invoke(view);
            }
        }
    }
}