package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import x1.a;

/* loaded from: classes5.dex */
public final class SeparatorViewBinding {
    public final View leftBar;
    public final TextView middleText;
    public final View rightBar;
    private final View rootView;

    private SeparatorViewBinding(View view, View view2, TextView textView, View view3) {
        this.rootView = view;
        this.leftBar = view2;
        this.middleText = textView;
        this.rightBar = view3;
    }

    public static SeparatorViewBinding bind(View view) {
        View a10;
        int i10 = R.id.left_bar;
        View a11 = a.a(view, i10);
        if (a11 != null) {
            i10 = R.id.middle_text;
            TextView textView = (TextView) a.a(view, i10);
            if (!(textView == null || (a10 = a.a(view, (i10 = R.id.right_bar))) == null)) {
                return new SeparatorViewBinding(view, a11, textView, a10);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SeparatorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.separator_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
