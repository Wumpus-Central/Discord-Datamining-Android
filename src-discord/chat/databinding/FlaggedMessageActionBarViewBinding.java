package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import v0.a;

/* loaded from: classes8.dex */
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
        int i10 = R.id.actions_button;
        DCDButton dCDButton = (DCDButton) a.a(view, i10);
        if (dCDButton != null) {
            i10 = R.id.feedback_button;
            DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
            if (dCDButton2 != null) {
                i10 = R.id.separator_dot;
                ImageView imageView = (ImageView) a.a(view, i10);
                if (imageView != null) {
                    return new FlaggedMessageActionBarViewBinding(view, dCDButton, dCDButton2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FlaggedMessageActionBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.flagged_message_action_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
