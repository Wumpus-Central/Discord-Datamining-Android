package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.discord.chat.R;
import v0.a;

/* loaded from: classes8.dex */
public final class ChatLoadingViewBinding {
    public final Button button;
    public final ProgressBar progressSpinner;
    private final View rootView;

    private ChatLoadingViewBinding(View view, Button button, ProgressBar progressBar) {
        this.rootView = view;
        this.button = button;
        this.progressSpinner = progressBar;
    }

    public static ChatLoadingViewBinding bind(View view) {
        int i10 = R.id.button;
        Button button = (Button) a.a(view, i10);
        if (button != null) {
            i10 = R.id.progress_spinner;
            ProgressBar progressBar = (ProgressBar) a.a(view, i10);
            if (progressBar != null) {
                return new ChatLoadingViewBinding(view, button, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ChatLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.chat_loading_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
