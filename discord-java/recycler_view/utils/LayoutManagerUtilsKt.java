package com.discord.recycler_view.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"isPositionVisible", "", "Landroidx/recyclerview/widget/LinearLayoutManager;", ViewProps.POSITION, "", "(Landroidx/recyclerview/widget/LinearLayoutManager;I)Ljava/lang/Boolean;", "recycler_view_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutManagerUtilsKt {
    public static final Boolean isPositionVisible(LinearLayoutManager linearLayoutManager, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(linearLayoutManager, "<this>");
        Integer valueOf = Integer.valueOf(linearLayoutManager.e2());
        boolean z13 = true;
        if (valueOf.intValue() != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = Integer.valueOf(linearLayoutManager.i2());
            if (valueOf.intValue() != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                valueOf = null;
            }
        }
        Integer valueOf2 = Integer.valueOf(linearLayoutManager.j2());
        if (valueOf2.intValue() != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            valueOf2 = null;
        }
        if (valueOf2 == null) {
            valueOf2 = Integer.valueOf(linearLayoutManager.l2());
            if (valueOf2.intValue() == -1) {
                z13 = false;
            }
            if (!z13) {
                valueOf2 = null;
            }
        }
        if (valueOf == null || valueOf2 == null) {
            return null;
        }
        return Boolean.valueOf(new IntRange(valueOf.intValue(), valueOf2.intValue()).contains(i10));
    }
}
