package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C3147R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.name;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13836a.m2313a(view, i);
        if (simpleDraweeSpanTextView != null) {
            i = C3147R.C3149id.value;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) C13836a.m2313a(view, i);
            if (simpleDraweeSpanTextView2 != null) {
                return new EmbedFieldViewBinding(view, simpleDraweeSpanTextView, simpleDraweeSpanTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EmbedFieldViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.embed_field_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
