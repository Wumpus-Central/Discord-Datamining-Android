package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class MessageComponentButtonViewBinding {
    public final MaterialButton button;
    public final SimpleDraweeSpanTextView emoji;
    public final MaterialTextView label;
    public final SimpleDraweeView linkIcon;
    public final ProgressDots loadingDots;
    private final ButtonComponentView rootView;

    private MessageComponentButtonViewBinding(ButtonComponentView buttonComponentView, MaterialButton materialButton, SimpleDraweeSpanTextView simpleDraweeSpanTextView, MaterialTextView materialTextView, SimpleDraweeView simpleDraweeView, ProgressDots progressDots) {
        this.rootView = buttonComponentView;
        this.button = materialButton;
        this.emoji = simpleDraweeSpanTextView;
        this.label = materialTextView;
        this.linkIcon = simpleDraweeView;
        this.loadingDots = progressDots;
    }

    public static MessageComponentButtonViewBinding bind(View view) {
        int i = C4254R.C4256id.button;
        MaterialButton materialButton = (MaterialButton) C13922a.m2313a(view, i);
        if (materialButton != null) {
            i = C4254R.C4256id.emoji;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
            if (simpleDraweeSpanTextView != null) {
                i = C4254R.C4256id.label;
                MaterialTextView materialTextView = (MaterialTextView) C13922a.m2313a(view, i);
                if (materialTextView != null) {
                    i = C4254R.C4256id.link_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
                    if (simpleDraweeView != null) {
                        i = C4254R.C4256id.loading_dots;
                        ProgressDots progressDots = (ProgressDots) C13922a.m2313a(view, i);
                        if (progressDots != null) {
                            return new MessageComponentButtonViewBinding((ButtonComponentView) view, materialButton, simpleDraweeSpanTextView, materialTextView, simpleDraweeView, progressDots);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4254R.layout.message_component_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ButtonComponentView getRoot() {
        return this.rootView;
    }
}
