package com.discord.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.discord.core.C4418R;
import com.google.android.material.button.MaterialButton;
import p412x1.C13922a;

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
        int i = C4418R.C4420id.button;
        MaterialButton materialButton = (MaterialButton) C13922a.m2313a(view, i);
        if (materialButton != null) {
            i = C4418R.C4420id.progress;
            ProgressBar progressBar = (ProgressBar) C13922a.m2313a(view, i);
            if (progressBar != null) {
                return new DcdButtonBinding(view, materialButton, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DcdButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4418R.layout.dcd_button, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
