package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;

/* loaded from: classes8.dex */
public final class MessageTagViewBinding {
    public final ConstraintLayout layout;
    private final View rootView;
    public final TextView tag;
    public final SimpleDraweeView verifiedBotIcon;

    private MessageTagViewBinding(View view, ConstraintLayout constraintLayout, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.layout = constraintLayout;
        this.tag = textView;
        this.verifiedBotIcon = simpleDraweeView;
    }

    public static MessageTagViewBinding bind(View view) {
        int i10 = R.id.layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.tag;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.verified_bot_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    return new MessageTagViewBinding(view, constraintLayout, textView, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageTagViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_tag_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
