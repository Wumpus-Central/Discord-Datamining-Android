package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import v0.a;

/* loaded from: classes3.dex */
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
        int i10 = R.id.button;
        MaterialButton materialButton = (MaterialButton) a.a(view, i10);
        if (materialButton != null) {
            i10 = R.id.emoji;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
            if (simpleDraweeSpanTextView != null) {
                i10 = R.id.label;
                MaterialTextView materialTextView = (MaterialTextView) a.a(view, i10);
                if (materialTextView != null) {
                    i10 = R.id.link_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView != null) {
                        i10 = R.id.loading_dots;
                        ProgressDots progressDots = (ProgressDots) a.a(view, i10);
                        if (progressDots != null) {
                            return new MessageComponentButtonViewBinding((ButtonComponentView) view, materialButton, simpleDraweeSpanTextView, materialTextView, simpleDraweeView, progressDots);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageComponentButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.message_component_button_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ButtonComponentView getRoot() {
        return this.rootView;
    }
}
