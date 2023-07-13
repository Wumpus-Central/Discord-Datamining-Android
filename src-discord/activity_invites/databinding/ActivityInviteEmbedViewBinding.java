package com.discord.activity_invites.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.discord.activity_invites.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;


public final class ActivityInviteEmbedViewBinding {
    public final Barrier aboveBottomRowBarrier;
    public final OverlappingCirclesView avatars;
    public final View bgGradient;
    public final TextView bottomEndLabel;
    public final DCDButton button;
    public final SimpleDraweeView endImage;
    public final TextView header;
    public final TextView heroText;
    private final View rootView;
    public final SimpleDraweeView startImage;
    public final TextView subtext;

    private ActivityInviteEmbedViewBinding(View view, Barrier barrier, OverlappingCirclesView overlappingCirclesView, View view2, TextView textView, DCDButton dCDButton, SimpleDraweeView simpleDraweeView, TextView textView2, TextView textView3, SimpleDraweeView simpleDraweeView2, TextView textView4) {
        this.rootView = view;
        this.aboveBottomRowBarrier = barrier;
        this.avatars = overlappingCirclesView;
        this.bgGradient = view2;
        this.bottomEndLabel = textView;
        this.button = dCDButton;
        this.endImage = simpleDraweeView;
        this.header = textView2;
        this.heroText = textView3;
        this.startImage = simpleDraweeView2;
        this.subtext = textView4;
    }

    public static ActivityInviteEmbedViewBinding bind(View view) {
        View a10;
        int i10 = R.id.above_bottom_row_barrier;
        Barrier barrier = (Barrier) a.a(view, i10);
        if (barrier != null) {
            i10 = R.id.avatars;
            OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.a(view, i10);
            if (!(overlappingCirclesView == null || (a10 = a.a(view, (i10 = R.id.bg_gradient))) == null)) {
                i10 = R.id.bottom_end_label;
                TextView textView = (TextView) a.a(view, i10);
                if (textView != null) {
                    i10 = R.id.button;
                    DCDButton dCDButton = (DCDButton) a.a(view, i10);
                    if (dCDButton != null) {
                        i10 = R.id.end_image;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                        if (simpleDraweeView != null) {
                            i10 = R.id.header;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.hero_text;
                                TextView textView3 = (TextView) a.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.start_image;
                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                                    if (simpleDraweeView2 != null) {
                                        i10 = R.id.subtext;
                                        TextView textView4 = (TextView) a.a(view, i10);
                                        if (textView4 != null) {
                                            return new ActivityInviteEmbedViewBinding(view, barrier, overlappingCirclesView, a10, textView, dCDButton, simpleDraweeView, textView2, textView3, simpleDraweeView2, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityInviteEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.activity_invite_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
