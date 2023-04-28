package com.discord.activity_invites.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.discord.activity_invites.C4199R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes.dex */
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
        View a;
        int i = C4199R.C4201id.above_bottom_row_barrier;
        Barrier barrier = (Barrier) C13922a.m2313a(view, i);
        if (barrier != null) {
            i = C4199R.C4201id.avatars;
            OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C13922a.m2313a(view, i);
            if (!(overlappingCirclesView == null || (a = C13922a.m2313a(view, (i = C4199R.C4201id.bg_gradient))) == null)) {
                i = C4199R.C4201id.bottom_end_label;
                TextView textView = (TextView) C13922a.m2313a(view, i);
                if (textView != null) {
                    i = C4199R.C4201id.button;
                    DCDButton dCDButton = (DCDButton) C13922a.m2313a(view, i);
                    if (dCDButton != null) {
                        i = C4199R.C4201id.end_image;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
                        if (simpleDraweeView != null) {
                            i = C4199R.C4201id.header;
                            TextView textView2 = (TextView) C13922a.m2313a(view, i);
                            if (textView2 != null) {
                                i = C4199R.C4201id.hero_text;
                                TextView textView3 = (TextView) C13922a.m2313a(view, i);
                                if (textView3 != null) {
                                    i = C4199R.C4201id.start_image;
                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                    if (simpleDraweeView2 != null) {
                                        i = C4199R.C4201id.subtext;
                                        TextView textView4 = (TextView) C13922a.m2313a(view, i);
                                        if (textView4 != null) {
                                            return new ActivityInviteEmbedViewBinding(view, barrier, overlappingCirclesView, a, textView, dCDButton, simpleDraweeView, textView2, textView3, simpleDraweeView2, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityInviteEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4199R.layout.activity_invite_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
