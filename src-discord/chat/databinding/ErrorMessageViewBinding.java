package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import v0.a;

/* loaded from: classes3.dex */
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
        int i10 = R.id.error_label;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.header;
            TextView textView2 = (TextView) a.a(view, i10);
            if (textView2 != null) {
                return new ErrorMessageViewBinding(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ErrorMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.error_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
