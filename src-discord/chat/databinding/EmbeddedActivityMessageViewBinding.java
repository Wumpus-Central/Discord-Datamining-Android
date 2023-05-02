package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

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
        int i10 = R.id.card;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.dismiss;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView2 != null) {
                    i10 = R.id.join_button;
                    DCDButton dCDButton = (DCDButton) a.a(view, i10);
                    if (dCDButton != null) {
                        i10 = R.id.message;
                        TextView textView = (TextView) a.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.participants;
                            OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.a(view, i10);
                            if (overlappingCirclesView != null) {
                                return new EmbeddedActivityMessageViewBinding(view, constraintLayout, simpleDraweeView, simpleDraweeView2, dCDButton, textView, overlappingCirclesView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EmbeddedActivityMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.embedded_activity_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
