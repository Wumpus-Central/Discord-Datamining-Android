package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.C3521R;
import com.discord.mobile_voice_overlay.views.OverlayMenuView;
import p413x1.C13836a;

/* loaded from: classes5.dex */
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
        View a;
        int i = C3521R.C3523id.overlay_header;
        LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
        if (!(linearLayout == null || (a = C13836a.m2313a(view, (i = C3521R.C3523id.overlay_linked_anchor_view))) == null)) {
            i = C3521R.C3523id.overlay_members_overflow_text;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                i = C3521R.C3523id.overlay_members_recycler;
                RecyclerView recyclerView = (RecyclerView) C13836a.m2313a(view, i);
                if (recyclerView != null) {
                    i = C3521R.C3523id.overlay_menu;
                    OverlayMenuView overlayMenuView = (OverlayMenuView) C13836a.m2313a(view, i);
                    if (overlayMenuView != null) {
                        return new OverlayMenuBubbleBinding((LinearLayout) view, linearLayout, a, textView, recyclerView, overlayMenuView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static OverlayMenuBubbleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayMenuBubbleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3521R.layout.overlay_menu_bubble, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
