package com.discord.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.discord.core.R;
import com.google.android.material.button.MaterialButton;
import x1.a;

/* loaded from: classes4.dex */
public final class DcdButtonBinding {
    public final MaterialButton button;
    public final ProgressBar progress;
    private final View rootView;

    private DcdButtonBinding(View view, MaterialButton materialButton, ProgressBar progressBar) {
        this.rootView = view;
        this.button = materialButton;
        this.progress = progressBar;
    }

    public static DcdButtonBinding bind(View view) {
        int i10 = R.id.button;
        MaterialButton materialButton = (MaterialButton) a.a(view, i10);
        if (materialButton != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) a.a(view, i10);
            if (progressBar != null) {
                return new DcdButtonBinding(view, materialButton, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DcdButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dcd_button, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
