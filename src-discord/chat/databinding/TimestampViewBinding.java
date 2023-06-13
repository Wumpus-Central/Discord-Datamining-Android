package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;

/* loaded from: classes8.dex */
public final class TimestampViewBinding {
    private final TextView rootView;

    private TimestampViewBinding(TextView textView) {
        this.rootView = textView;
    }

    public static TimestampViewBinding bind(View view) {
        if (view != null) {
            return new TimestampViewBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static TimestampViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TimestampViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.timestamp_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
