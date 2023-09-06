package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.IconButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import u0.a;


public final class ObscureOverlayViewBinding {
    public final BlurView blurView;
    public final TextView descriptionLabel;
    public final IconButtonView hideButton;
    public final SimpleDraweeView mediaWarningIcon;
    public final LinearLayout overlayCenteredContainer;
    public final ConstraintLayout overlayLayout;
    public final IconButtonView revealButton;
    private final View rootView;

    private ObscureOverlayViewBinding(View view, BlurView blurView, TextView textView, IconButtonView iconButtonView, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, ConstraintLayout constraintLayout, IconButtonView iconButtonView2) {
        this.rootView = view;
        this.blurView = blurView;
        this.descriptionLabel = textView;
        this.hideButton = iconButtonView;
        this.mediaWarningIcon = simpleDraweeView;
        this.overlayCenteredContainer = linearLayout;
        this.overlayLayout = constraintLayout;
        this.revealButton = iconButtonView2;
    }

    public static ObscureOverlayViewBinding bind(View view) {
        int i10 = R.id.blur_view;
        BlurView blurView = (BlurView) a.a(view, i10);
        if (blurView != null) {
            i10 = R.id.description_label;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.hide_button;
                IconButtonView iconButtonView = (IconButtonView) a.a(view, i10);
                if (iconButtonView != null) {
                    i10 = R.id.media_warning_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView != null) {
                        i10 = R.id.overlay_centered_container;
                        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.overlay_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                            if (constraintLayout != null) {
                                i10 = R.id.reveal_button;
                                IconButtonView iconButtonView2 = (IconButtonView) a.a(view, i10);
                                if (iconButtonView2 != null) {
                                    return new ObscureOverlayViewBinding(view, blurView, textView, iconButtonView, simpleDraweeView, linearLayout, constraintLayout, iconButtonView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ObscureOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.obscure_overlay_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
