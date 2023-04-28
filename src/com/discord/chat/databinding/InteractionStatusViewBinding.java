package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.view_interaction_status_danger_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3147R.C3149id.view_interaction_status_label_icon;
            LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
            if (linearLayout != null) {
                i = C3147R.C3149id.view_interaction_status_label_message;
                TextView textView = (TextView) C13836a.m2313a(view, i);
                if (textView != null) {
                    i = C3147R.C3149id.view_interaction_status_loading_dots;
                    ProgressDots progressDots = (ProgressDots) C13836a.m2313a(view, i);
                    if (progressDots != null) {
                        return new InteractionStatusViewBinding(view, simpleDraweeView, linearLayout, textView, progressDots);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InteractionStatusViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.interaction_status_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
