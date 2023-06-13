package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.reactions.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class AddReactionViewBinding {
    public final SimpleDraweeView addReactionImage;
    public final TextView addReactionText;
    private final View rootView;

    private AddReactionViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = view;
        this.addReactionImage = simpleDraweeView;
        this.addReactionText = textView;
    }

    public static AddReactionViewBinding bind(View view) {
        int i10 = R.id.add_reaction_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.add_reaction_text;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                return new AddReactionViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AddReactionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.add_reaction_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
