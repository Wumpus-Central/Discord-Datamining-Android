package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        View a;
        int i = C3147R.C3149id.left_bar;
        View a2 = C13836a.m2313a(view, i);
        if (a2 != null) {
            i = C3147R.C3149id.middle_text;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (!(textView == null || (a = C13836a.m2313a(view, (i = C3147R.C3149id.right_bar))) == null)) {
                return new SeparatorViewBinding(view, a2, textView, a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SeparatorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.separator_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
