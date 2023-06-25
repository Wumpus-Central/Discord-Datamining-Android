package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;

/* loaded from: classes8.dex */
public final class SeparatorSummaryViewBinding {
    public final SimpleDraweeView icon;
    public final View leftBar;
    public final TextView middleText;
    public final View rightBar;
    private final View rootView;

    private SeparatorSummaryViewBinding(View view, SimpleDraweeView simpleDraweeView, View view2, TextView textView, View view3) {
        this.rootView = view;
        this.icon = simpleDraweeView;
        this.leftBar = view2;
        this.middleText = textView;
        this.rightBar = view3;
    }

    public static SeparatorSummaryViewBinding bind(View view) {
        View a10;
        View a11;
        int i10 = R.id.icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (!(simpleDraweeView == null || (a10 = a.a(view, (i10 = R.id.left_bar))) == null)) {
            i10 = R.id.middle_text;
            TextView textView = (TextView) a.a(view, i10);
            if (!(textView == null || (a11 = a.a(view, (i10 = R.id.right_bar))) == null)) {
                return new SeparatorSummaryViewBinding(view, simpleDraweeView, a10, textView, a11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SeparatorSummaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.separator_summary_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
