package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C4254R;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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
        int i = C4254R.C4256id.view_interaction_failed_label_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C4254R.C4256id.view_interaction_failed_label_message;
            TextView textView = (TextView) C13922a.m2313a(view, i);
            if (textView != null) {
                return new ComponentFailedLabelViewBinding((ConstraintLayout) view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ComponentFailedLabelViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ComponentFailedLabelViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4254R.layout.component_failed_label_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
