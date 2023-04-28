package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.discord.reactions.C4675R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import p412x1.C13922a;

/* loaded from: classes6.dex */
public final class ReactionViewBinding {
    public final TextView reactionCount1;
    public final TextView reactionCount2;
    public final TextSwitcher reactionCountSwitcher;
    public final SimpleDraweeSpanTextView reactionEmoji;
    private final View rootView;

    private ReactionViewBinding(View view, TextView textView, TextView textView2, TextSwitcher textSwitcher, SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        this.rootView = view;
        this.reactionCount1 = textView;
        this.reactionCount2 = textView2;
        this.reactionCountSwitcher = textSwitcher;
        this.reactionEmoji = simpleDraweeSpanTextView;
    }

    public static ReactionViewBinding bind(View view) {
        int i = C4675R.C4677id.reaction_count_1;
        TextView textView = (TextView) C13922a.m2313a(view, i);
        if (textView != null) {
            i = C4675R.C4677id.reaction_count_2;
            TextView textView2 = (TextView) C13922a.m2313a(view, i);
            if (textView2 != null) {
                i = C4675R.C4677id.reaction_count_switcher;
                TextSwitcher textSwitcher = (TextSwitcher) C13922a.m2313a(view, i);
                if (textSwitcher != null) {
                    i = C4675R.C4677id.reaction_emoji;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        return new ReactionViewBinding(view, textView, textView2, textSwitcher, simpleDraweeSpanTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ReactionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4675R.layout.reaction_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
