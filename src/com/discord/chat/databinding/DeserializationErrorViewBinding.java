package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.discord.chat.C3147R;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.cause_header;
        TextView textView = (TextView) C13836a.m2313a(view, i);
        if (textView != null) {
            i = C3147R.C3149id.copy_button;
            Button button = (Button) C13836a.m2313a(view, i);
            if (button != null) {
                i = C3147R.C3149id.exception;
                TextView textView2 = (TextView) C13836a.m2313a(view, i);
                if (textView2 != null) {
                    i = C3147R.C3149id.header;
                    TextView textView3 = (TextView) C13836a.m2313a(view, i);
                    if (textView3 != null) {
                        i = C3147R.C3149id.json;
                        TextView textView4 = (TextView) C13836a.m2313a(view, i);
                        if (textView4 != null) {
                            i = C3147R.C3149id.json_header;
                            TextView textView5 = (TextView) C13836a.m2313a(view, i);
                            if (textView5 != null) {
                                return new DeserializationErrorViewBinding(view, textView, button, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DeserializationErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.deserialization_error_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
