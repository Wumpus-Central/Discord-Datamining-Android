package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;

/* loaded from: classes3.dex */
public final class ComponentFailedLabelViewBinding {
    private final ConstraintLayout rootView;
    public final SimpleDraweeView viewInteractionFailedLabelIcon;
    public final TextView viewInteractionFailedLabelMessage;

    private ComponentFailedLabelViewBinding(ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = constraintLayout;
        this.viewInteractionFailedLabelIcon = simpleDraweeView;
        this.viewInteractionFailedLabelMessage = textView;
    }

    public static ComponentFailedLabelViewBinding bind(View view) {
        int i10 = R.id.view_interaction_failed_label_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.view_interaction_failed_label_message;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                return new ComponentFailedLabelViewBinding((ConstraintLayout) view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ComponentFailedLabelViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ComponentFailedLabelViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.component_failed_label_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
