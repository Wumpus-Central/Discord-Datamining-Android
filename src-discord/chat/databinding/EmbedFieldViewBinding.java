package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import v0.a;


public final class EmbedFieldViewBinding {
    public final SimpleDraweeSpanTextView name;
    private final View rootView;
    public final SimpleDraweeSpanTextView value;

    private EmbedFieldViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView, SimpleDraweeSpanTextView simpleDraweeSpanTextView2) {
        this.rootView = view;
        this.name = simpleDraweeSpanTextView;
        this.value = simpleDraweeSpanTextView2;
    }

    public static EmbedFieldViewBinding bind(View view) {
        int i10 = R.id.name;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
        if (simpleDraweeSpanTextView != null) {
            i10 = R.id.value;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) a.a(view, i10);
            if (simpleDraweeSpanTextView2 != null) {
                return new EmbedFieldViewBinding(view, simpleDraweeSpanTextView, simpleDraweeSpanTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EmbedFieldViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.embed_field_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
