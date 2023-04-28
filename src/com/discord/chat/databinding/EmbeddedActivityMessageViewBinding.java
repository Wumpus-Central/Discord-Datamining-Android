package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C3147R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class EmbeddedActivityMessageViewBinding {
    public final ConstraintLayout card;
    public final SimpleDraweeView dismiss;
    public final SimpleDraweeView icon;
    public final DCDButton joinButton;
    public final TextView message;
    public final OverlappingCirclesView participants;
    private final View rootView;

    private EmbeddedActivityMessageViewBinding(View view, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, TextView textView, OverlappingCirclesView overlappingCirclesView) {
        this.rootView = view;
        this.card = constraintLayout;
        this.dismiss = simpleDraweeView;
        this.icon = simpleDraweeView2;
        this.joinButton = dCDButton;
        this.message = textView;
        this.participants = overlappingCirclesView;
    }

    public static EmbeddedActivityMessageViewBinding bind(View view) {
        int i = C3147R.C3149id.card;
        ConstraintLayout constraintLayout = (ConstraintLayout) C13836a.m2313a(view, i);
        if (constraintLayout != null) {
            i = C3147R.C3149id.dismiss;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                i = C3147R.C3149id.icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C3147R.C3149id.join_button;
                    DCDButton dCDButton = (DCDButton) C13836a.m2313a(view, i);
                    if (dCDButton != null) {
                        i = C3147R.C3149id.message;
                        TextView textView = (TextView) C13836a.m2313a(view, i);
                        if (textView != null) {
                            i = C3147R.C3149id.participants;
                            OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C13836a.m2313a(view, i);
                            if (overlappingCirclesView != null) {
                                return new EmbeddedActivityMessageViewBinding(view, constraintLayout, simpleDraweeView, simpleDraweeView2, dCDButton, textView, overlappingCirclesView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EmbeddedActivityMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.embedded_activity_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
