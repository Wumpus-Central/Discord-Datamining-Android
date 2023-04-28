package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView;
import com.google.android.flexbox.FlexboxLayout;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class MessageComponentActionRowViewBinding {
    public final FlexboxLayout actionRowComponentViewGroup;
    public final ComponentFailedLabelViewBinding actionRowComponentViewGroupErrorRow;
    private final ActionRowComponentView rootView;

    private MessageComponentActionRowViewBinding(ActionRowComponentView actionRowComponentView, FlexboxLayout flexboxLayout, ComponentFailedLabelViewBinding componentFailedLabelViewBinding) {
        this.rootView = actionRowComponentView;
        this.actionRowComponentViewGroup = flexboxLayout;
        this.actionRowComponentViewGroupErrorRow = componentFailedLabelViewBinding;
    }

    public static MessageComponentActionRowViewBinding bind(View view) {
        View a;
        int i = C4254R.C4256id.action_row_component_view_group;
        FlexboxLayout flexboxLayout = (FlexboxLayout) C13922a.m2313a(view, i);
        if (flexboxLayout != null && (a = C13922a.m2313a(view, (i = C4254R.C4256id.action_row_component_view_group_error_row))) != null) {
            return new MessageComponentActionRowViewBinding((ActionRowComponentView) view, flexboxLayout, ComponentFailedLabelViewBinding.bind(a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentActionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentActionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4254R.layout.message_component_action_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ActionRowComponentView getRoot() {
        return this.rootView;
    }
}
