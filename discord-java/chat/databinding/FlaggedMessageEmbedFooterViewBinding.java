package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.discord.chat.R;
import x1.a;

/* loaded from: classes4.dex */
public final class FlaggedMessageEmbedFooterViewBinding {
    public final TextView flaggedMessageKeyword;
    public final TextView flaggedMessageRuleName;
    private final View rootView;
    public final ImageView separatorDot;

    private FlaggedMessageEmbedFooterViewBinding(View view, TextView textView, TextView textView2, ImageView imageView) {
        this.rootView = view;
        this.flaggedMessageKeyword = textView;
        this.flaggedMessageRuleName = textView2;
        this.separatorDot = imageView;
    }

    public static FlaggedMessageEmbedFooterViewBinding bind(View view) {
        int i10 = R.id.flagged_message_keyword;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.flagged_message_rule_name;
            TextView textView2 = (TextView) a.a(view, i10);
            if (textView2 != null) {
                i10 = R.id.separator_dot;
                ImageView imageView = (ImageView) a.a(view, i10);
                if (imageView != null) {
                    return new FlaggedMessageEmbedFooterViewBinding(view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FlaggedMessageEmbedFooterViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.flagged_message_embed_footer_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
