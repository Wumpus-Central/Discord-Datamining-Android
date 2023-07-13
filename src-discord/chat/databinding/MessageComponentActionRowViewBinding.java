package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView;
import com.google.android.flexbox.FlexboxLayout;
import v0.a;


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
        View a10;
        int i10 = R.id.action_row_component_view_group;
        FlexboxLayout flexboxLayout = (FlexboxLayout) a.a(view, i10);
        if (flexboxLayout != null && (a10 = a.a(view, (i10 = R.id.action_row_component_view_group_error_row))) != null) {
            return new MessageComponentActionRowViewBinding((ActionRowComponentView) view, flexboxLayout, ComponentFailedLabelViewBinding.bind(a10));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageComponentActionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentActionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.message_component_action_row_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ActionRowComponentView getRoot() {
        return this.rootView;
    }
}
