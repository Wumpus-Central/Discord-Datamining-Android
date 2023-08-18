package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;
import u0.a;


public final class MessageComponentSelectViewBinding {
    private final SelectComponentView rootView;
    public final SimpleDraweeView selectComponentChevron;
    public final ProgressBar selectComponentLoading;
    public final SimpleDraweeSpanTextView selectComponentSelectionIcon;
    public final MaterialTextView selectComponentSelectionText;
    public final FlexboxLayout selectComponentSelectionsRoot;

    private MessageComponentSelectViewBinding(SelectComponentView selectComponentView, SimpleDraweeView simpleDraweeView, ProgressBar progressBar, SimpleDraweeSpanTextView simpleDraweeSpanTextView, MaterialTextView materialTextView, FlexboxLayout flexboxLayout) {
        this.rootView = selectComponentView;
        this.selectComponentChevron = simpleDraweeView;
        this.selectComponentLoading = progressBar;
        this.selectComponentSelectionIcon = simpleDraweeSpanTextView;
        this.selectComponentSelectionText = materialTextView;
        this.selectComponentSelectionsRoot = flexboxLayout;
    }

    public static MessageComponentSelectViewBinding bind(View view) {
        int i10 = R.id.select_component_chevron;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.select_component_loading;
            ProgressBar progressBar = (ProgressBar) a.a(view, i10);
            if (progressBar != null) {
                i10 = R.id.select_component_selection_icon;
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                if (simpleDraweeSpanTextView != null) {
                    i10 = R.id.select_component_selection_text;
                    MaterialTextView materialTextView = (MaterialTextView) a.a(view, i10);
                    if (materialTextView != null) {
                        i10 = R.id.select_component_selections_root;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) a.a(view, i10);
                        if (flexboxLayout != null) {
                            return new MessageComponentSelectViewBinding((SelectComponentView) view, simpleDraweeView, progressBar, simpleDraweeSpanTextView, materialTextView, flexboxLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageComponentSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.message_component_select_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public SelectComponentView getRoot() {
        return this.rootView;
    }
}
