package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.discord.chat.C3147R;
import com.discord.core.DCDButton;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class FlaggedMessageActionBarViewBinding {
    public final DCDButton actionsButton;
    public final DCDButton feedbackButton;
    private final View rootView;
    public final ImageView separatorDot;

    private FlaggedMessageActionBarViewBinding(View view, DCDButton dCDButton, DCDButton dCDButton2, ImageView imageView) {
        this.rootView = view;
        this.actionsButton = dCDButton;
        this.feedbackButton = dCDButton2;
        this.separatorDot = imageView;
    }

    public static FlaggedMessageActionBarViewBinding bind(View view) {
        int i = C3147R.C3149id.actions_button;
        DCDButton dCDButton = (DCDButton) C13836a.m2313a(view, i);
        if (dCDButton != null) {
            i = C3147R.C3149id.feedback_button;
            DCDButton dCDButton2 = (DCDButton) C13836a.m2313a(view, i);
            if (dCDButton2 != null) {
                i = C3147R.C3149id.separator_dot;
                ImageView imageView = (ImageView) C13836a.m2313a(view, i);
                if (imageView != null) {
                    return new FlaggedMessageActionBarViewBinding(view, dCDButton, dCDButton2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlaggedMessageActionBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.flagged_message_action_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
