package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class MessageHighlightHeaderBinding {
    public final TextView header;
    public final SimpleDraweeView highlightIcon;
    private final View rootView;

    private MessageHighlightHeaderBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.header = textView;
        this.highlightIcon = simpleDraweeView;
    }

    public static MessageHighlightHeaderBinding bind(View view) {
        int i10 = R.id.header;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.highlight_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                return new MessageHighlightHeaderBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageHighlightHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_highlight_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
