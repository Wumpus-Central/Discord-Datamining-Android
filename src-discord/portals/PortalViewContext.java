package com.discord.portals;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003Jq\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/discord/portals/PortalViewContext;", "", "view", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "removeViewFromParent", "Lkotlin/Function1;", "", "onViewAddedToPortal", "onViewRemovedFromPortal", "returnViewToParent", "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnViewAddedToPortal", "()Lkotlin/jvm/functions/Function1;", "getOnViewRemovedFromPortal", "getRemoveViewFromParent", "getReturnViewToParent", "getView", "()Ljava/lang/ref/WeakReference;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "portals_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PortalViewContext {
    private final Function1<View, Unit> onViewAddedToPortal;
    private final Function1<View, Unit> onViewRemovedFromPortal;
    private final Function1<View, Unit> removeViewFromParent;
    private final Function1<View, Unit> returnViewToParent;
    private final WeakReference<View> view;

    
    public PortalViewContext(WeakReference<View> view, Function1<? super View, Unit> removeViewFromParent, Function1<? super View, Unit> onViewAddedToPortal, Function1<? super View, Unit> onViewRemovedFromPortal, Function1<? super View, Unit> returnViewToParent) {
        q.h(view, "view");
        q.h(removeViewFromParent, "removeViewFromParent");
        q.h(onViewAddedToPortal, "onViewAddedToPortal");
        q.h(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        q.h(returnViewToParent, "returnViewToParent");
        this.view = view;
        this.removeViewFromParent = removeViewFromParent;
        this.onViewAddedToPortal = onViewAddedToPortal;
        this.onViewRemovedFromPortal = onViewRemovedFromPortal;
        this.returnViewToParent = returnViewToParent;
    }

    
    public static  PortalViewContext copy$default(PortalViewContext portalViewContext, WeakReference weakReference, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            weakReference = portalViewContext.view;
        }
        if ((i10 & 2) != 0) {
            function1 = portalViewContext.removeViewFromParent;
        }
        if ((i10 & 4) != 0) {
            function12 = portalViewContext.onViewAddedToPortal;
        }
        if ((i10 & 8) != 0) {
            function13 = portalViewContext.onViewRemovedFromPortal;
        }
        if ((i10 & 16) != 0) {
            function14 = portalViewContext.returnViewToParent;
        }
        return portalViewContext.copy(weakReference, function1, function12, function13, function14);
    }

    public final WeakReference<View> component1() {
        return this.view;
    }

    public final Function1<View, Unit> component2() {
        return this.removeViewFromParent;
    }

    public final Function1<View, Unit> component3() {
        return this.onViewAddedToPortal;
    }

    public final Function1<View, Unit> component4() {
        return this.onViewRemovedFromPortal;
    }

    public final Function1<View, Unit> component5() {
        return this.returnViewToParent;
    }

    public final PortalViewContext copy(WeakReference<View> view, Function1<? super View, Unit> removeViewFromParent, Function1<? super View, Unit> onViewAddedToPortal, Function1<? super View, Unit> onViewRemovedFromPortal, Function1<? super View, Unit> returnViewToParent) {
        q.h(view, "view");
        q.h(removeViewFromParent, "removeViewFromParent");
        q.h(onViewAddedToPortal, "onViewAddedToPortal");
        q.h(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        q.h(returnViewToParent, "returnViewToParent");
        return new PortalViewContext(view, removeViewFromParent, onViewAddedToPortal, onViewRemovedFromPortal, returnViewToParent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortalViewContext)) {
            return false;
        }
        PortalViewContext portalViewContext = (PortalViewContext) obj;
        return q.c(this.view, portalViewContext.view) && q.c(this.removeViewFromParent, portalViewContext.removeViewFromParent) && q.c(this.onViewAddedToPortal, portalViewContext.onViewAddedToPortal) && q.c(this.onViewRemovedFromPortal, portalViewContext.onViewRemovedFromPortal) && q.c(this.returnViewToParent, portalViewContext.returnViewToParent);
    }

    public final Function1<View, Unit> getOnViewAddedToPortal() {
        return this.onViewAddedToPortal;
    }

    public final Function1<View, Unit> getOnViewRemovedFromPortal() {
        return this.onViewRemovedFromPortal;
    }

    public final Function1<View, Unit> getRemoveViewFromParent() {
        return this.removeViewFromParent;
    }

    public final Function1<View, Unit> getReturnViewToParent() {
        return this.returnViewToParent;
    }

    public final WeakReference<View> getView() {
        return this.view;
    }

    public int hashCode() {
        return (((((((this.view.hashCode() * 31) + this.removeViewFromParent.hashCode()) * 31) + this.onViewAddedToPortal.hashCode()) * 31) + this.onViewRemovedFromPortal.hashCode()) * 31) + this.returnViewToParent.hashCode();
    }

    public String toString() {
        WeakReference<View> weakReference = this.view;
        Function1<View, Unit> function1 = this.removeViewFromParent;
        Function1<View, Unit> function12 = this.onViewAddedToPortal;
        Function1<View, Unit> function13 = this.onViewRemovedFromPortal;
        Function1<View, Unit> function14 = this.returnViewToParent;
        return "PortalViewContext(view=" + weakReference + ", removeViewFromParent=" + function1 + ", onViewAddedToPortal=" + function12 + ", onViewRemovedFromPortal=" + function13 + ", returnViewToParent=" + function14 + ")";
    }
}
