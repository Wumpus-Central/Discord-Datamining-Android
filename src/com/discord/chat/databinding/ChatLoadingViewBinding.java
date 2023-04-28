package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.discord.chat.C4254R;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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
        int i = C4254R.C4256id.button;
        Button button = (Button) C13922a.m2313a(view, i);
        if (button != null) {
            i = C4254R.C4256id.progress_spinner;
            ProgressBar progressBar = (ProgressBar) C13922a.m2313a(view, i);
            if (progressBar != null) {
                return new ChatLoadingViewBinding(view, button, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChatLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.chat_loading_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
