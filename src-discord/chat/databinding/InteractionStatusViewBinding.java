package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class InteractionStatusViewBinding {
    private final View rootView;
    public final SimpleDraweeView viewInteractionStatusDangerIcon;
    public final LinearLayout viewInteractionStatusLabelIcon;
    public final TextView viewInteractionStatusLabelMessage;
    public final ProgressDots viewInteractionStatusLoadingDots;

    private InteractionStatusViewBinding(View view, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, TextView textView, ProgressDots progressDots) {
        this.rootView = view;
        this.viewInteractionStatusDangerIcon = simpleDraweeView;
        this.viewInteractionStatusLabelIcon = linearLayout;
        this.viewInteractionStatusLabelMessage = textView;
        this.viewInteractionStatusLoadingDots = progressDots;
    }

    public static InteractionStatusViewBinding bind(View view) {
        int i10 = R.id.view_interaction_status_danger_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.view_interaction_status_label_icon;
            LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
            if (linearLayout != null) {
                i10 = R.id.view_interaction_status_label_message;
                TextView textView = (TextView) a.a(view, i10);
                if (textView != null) {
                    i10 = R.id.view_interaction_status_loading_dots;
                    ProgressDots progressDots = (ProgressDots) a.a(view, i10);
                    if (progressDots != null) {
                        return new InteractionStatusViewBinding(view, simpleDraweeView, linearLayout, textView, progressDots);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static InteractionStatusViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.interaction_status_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
