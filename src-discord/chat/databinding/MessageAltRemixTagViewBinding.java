package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class MessageAltRemixTagViewBinding {
    public final TextView altRemixTag;
    public final ConstraintLayout layout;
    public final SimpleDraweeView remixIcon;
    private final View rootView;

    private MessageAltRemixTagViewBinding(View view, TextView textView, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.altRemixTag = textView;
        this.layout = constraintLayout;
        this.remixIcon = simpleDraweeView;
    }

    public static MessageAltRemixTagViewBinding bind(View view) {
        int i10 = R.id.alt_remix_tag;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.remix_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    return new MessageAltRemixTagViewBinding(view, textView, constraintLayout, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageAltRemixTagViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_alt_remix_tag_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
