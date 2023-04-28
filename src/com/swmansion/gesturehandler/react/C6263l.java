package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p085ef.AbstractC6871x;
import p085ef.EnumC6859r;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/l;", "Lef/x;", "Landroid/view/View;", "view", "Lef/r;", "a", "Landroid/view/ViewGroup;", "parent", "", "index", "c", "", "b", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.l */
/* loaded from: classes8.dex */
public final class C6263l implements AbstractC6871x {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.swmansion.gesturehandler.react.l$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C6264a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12718a;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12718a = iArr;
        }
    }

    @Override // p085ef.AbstractC6871x
    /* renamed from: a */
    public EnumC6859r mo23994a(View view) {
        PointerEvents pointerEvents;
        C9971q.m14633g(view, "view");
        if (view instanceof ReactPointerEventsView) {
            pointerEvents = ((ReactPointerEventsView) view).getPointerEvents();
            C9971q.m14634f(pointerEvents, "{\n        (view as React…ew).pointerEvents\n      }");
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return EnumC6859r.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return EnumC6859r.NONE;
            }
        }
        int i = C6264a.f12718a[pointerEvents.ordinal()];
        if (i == 1) {
            return EnumC6859r.BOX_ONLY;
        }
        if (i == 2) {
            return EnumC6859r.BOX_NONE;
        }
        if (i == 3) {
            return EnumC6859r.NONE;
        }
        if (i == 4) {
            return EnumC6859r.AUTO;
        }
        throw new C11088q();
    }

    @Override // p085ef.AbstractC6871x
    /* renamed from: b */
    public boolean mo23993b(ViewGroup view) {
        C9971q.m14633g(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof ReactViewGroup) {
            return C9971q.m14638b(ViewProps.HIDDEN, ((ReactViewGroup) view).getOverflow());
        }
        return false;
    }

    @Override // p085ef.AbstractC6871x
    /* renamed from: c */
    public View mo23992c(ViewGroup parent, int i) {
        C9971q.m14633g(parent, "parent");
        if (parent instanceof ReactViewGroup) {
            View childAt = parent.getChildAt(((ReactViewGroup) parent).getZIndexMappedChildIndex(i));
            C9971q.m14634f(childAt, "{\n      parent.getChildA…dChildIndex(index))\n    }");
            return childAt;
        }
        View childAt2 = parent.getChildAt(i);
        C9971q.m14634f(childAt2, "parent.getChildAt(index)");
        return childAt2;
    }
}
