package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C4254R;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class ErrorMessageViewBinding {
    public final TextView errorLabel;
    public final TextView header;
    private final View rootView;

    private ErrorMessageViewBinding(View view, TextView textView, TextView textView2) {
        this.rootView = view;
        this.errorLabel = textView;
        this.header = textView2;
    }

    public static ErrorMessageViewBinding bind(View view) {
        int i = C4254R.C4256id.error_label;
        TextView textView = (TextView) C13922a.m2313a(view, i);
        if (textView != null) {
            i = C4254R.C4256id.header;
            TextView textView2 = (TextView) C13922a.m2313a(view, i);
            if (textView2 != null) {
                return new ErrorMessageViewBinding(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ErrorMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.error_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
