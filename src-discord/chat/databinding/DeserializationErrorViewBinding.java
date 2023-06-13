package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.discord.chat.R;
import x1.a;

/* loaded from: classes8.dex */
public final class DeserializationErrorViewBinding {
    public final TextView causeHeader;
    public final Button copyButton;
    public final TextView exception;
    public final TextView header;
    public final TextView json;
    public final TextView jsonHeader;
    private final View rootView;

    private DeserializationErrorViewBinding(View view, TextView textView, Button button, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = view;
        this.causeHeader = textView;
        this.copyButton = button;
        this.exception = textView2;
        this.header = textView3;
        this.json = textView4;
        this.jsonHeader = textView5;
    }

    public static DeserializationErrorViewBinding bind(View view) {
        int i10 = R.id.cause_header;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.copy_button;
            Button button = (Button) a.a(view, i10);
            if (button != null) {
                i10 = R.id.exception;
                TextView textView2 = (TextView) a.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.header;
                    TextView textView3 = (TextView) a.a(view, i10);
                    if (textView3 != null) {
                        i10 = R.id.json;
                        TextView textView4 = (TextView) a.a(view, i10);
                        if (textView4 != null) {
                            i10 = R.id.json_header;
                            TextView textView5 = (TextView) a.a(view, i10);
                            if (textView5 != null) {
                                return new DeserializationErrorViewBinding(view, textView, button, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DeserializationErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.deserialization_error_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
