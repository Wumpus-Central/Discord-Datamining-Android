package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.views.OverlayMenuView;
import x1.a;

/* loaded from: classes7.dex */
public final class OverlayMenuBubbleBinding {
    public final LinearLayout overlayHeader;
    public final View overlayLinkedAnchorView;
    public final TextView overlayMembersOverflowText;
    public final RecyclerView overlayMembersRecycler;
    public final OverlayMenuView overlayMenu;
    private final LinearLayout rootView;

    private OverlayMenuBubbleBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, TextView textView, RecyclerView recyclerView, OverlayMenuView overlayMenuView) {
        this.rootView = linearLayout;
        this.overlayHeader = linearLayout2;
        this.overlayLinkedAnchorView = view;
        this.overlayMembersOverflowText = textView;
        this.overlayMembersRecycler = recyclerView;
        this.overlayMenu = overlayMenuView;
    }

    public static OverlayMenuBubbleBinding bind(View view) {
        View a10;
        int i10 = R.id.overlay_header;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (!(linearLayout == null || (a10 = a.a(view, (i10 = R.id.overlay_linked_anchor_view))) == null)) {
            i10 = R.id.overlay_members_overflow_text;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.overlay_members_recycler;
                RecyclerView recyclerView = (RecyclerView) a.a(view, i10);
                if (recyclerView != null) {
                    i10 = R.id.overlay_menu;
                    OverlayMenuView overlayMenuView = (OverlayMenuView) a.a(view, i10);
                    if (overlayMenuView != null) {
                        return new OverlayMenuBubbleBinding((LinearLayout) view, linearLayout, a10, textView, recyclerView, overlayMenuView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OverlayMenuBubbleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayMenuBubbleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.overlay_menu_bubble, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
