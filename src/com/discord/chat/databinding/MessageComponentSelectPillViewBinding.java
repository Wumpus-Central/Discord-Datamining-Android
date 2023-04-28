package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C4254R;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes4.dex */
public final class MessageComponentSelectPillViewBinding {
    private final MaterialTextView rootView;

    private MessageComponentSelectPillViewBinding(MaterialTextView materialTextView) {
        this.rootView = materialTextView;
    }

    public static MessageComponentSelectPillViewBinding bind(View view) {
        if (view != null) {
            return new MessageComponentSelectPillViewBinding((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static MessageComponentSelectPillViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageComponentSelectPillViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4254R.layout.message_component_select_pill_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialTextView getRoot() {
        return this.rootView;
    }
}
