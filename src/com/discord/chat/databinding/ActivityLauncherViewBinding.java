package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C3147R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class ActivityLauncherViewBinding {
    public final Barrier barrierFooter;
    public final SimpleDraweeView icon;
    public final ConstraintLayout itemBottomContainer;
    public final TextView itemDescription;
    public final TextView itemHeader;
    public final SimpleDraweeView itemHero;
    public final DCDButton launchButton;
    public final OverlappingCirclesView participants;
    public final FrameLayout participantsContainer;
    public final TextView participantsInfo;
    public final LinearLayout participantsInfoContainer;
    private final View rootView;

    private ActivityLauncherViewBinding(View view, Barrier barrier, SimpleDraweeView simpleDraweeView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, OverlappingCirclesView overlappingCirclesView, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout) {
        this.rootView = view;
        this.barrierFooter = barrier;
        this.icon = simpleDraweeView;
        this.itemBottomContainer = constraintLayout;
        this.itemDescription = textView;
        this.itemHeader = textView2;
        this.itemHero = simpleDraweeView2;
        this.launchButton = dCDButton;
        this.participants = overlappingCirclesView;
        this.participantsContainer = frameLayout;
        this.participantsInfo = textView3;
        this.participantsInfoContainer = linearLayout;
    }

    public static ActivityLauncherViewBinding bind(View view) {
        int i = C3147R.C3149id.barrier_footer;
        Barrier barrier = (Barrier) C13836a.m2313a(view, i);
        if (barrier != null) {
            i = C3147R.C3149id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                i = C3147R.C3149id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) C13836a.m2313a(view, i);
                if (constraintLayout != null) {
                    i = C3147R.C3149id.item_description;
                    TextView textView = (TextView) C13836a.m2313a(view, i);
                    if (textView != null) {
                        i = C3147R.C3149id.item_header;
                        TextView textView2 = (TextView) C13836a.m2313a(view, i);
                        if (textView2 != null) {
                            i = C3147R.C3149id.item_hero;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C3147R.C3149id.launch_button;
                                DCDButton dCDButton = (DCDButton) C13836a.m2313a(view, i);
                                if (dCDButton != null) {
                                    i = C3147R.C3149id.participants;
                                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C13836a.m2313a(view, i);
                                    if (overlappingCirclesView != null) {
                                        i = C3147R.C3149id.participants_container;
                                        FrameLayout frameLayout = (FrameLayout) C13836a.m2313a(view, i);
                                        if (frameLayout != null) {
                                            i = C3147R.C3149id.participants_info;
                                            TextView textView3 = (TextView) C13836a.m2313a(view, i);
                                            if (textView3 != null) {
                                                i = C3147R.C3149id.participants_info_container;
                                                LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
                                                if (linearLayout != null) {
                                                    return new ActivityLauncherViewBinding(view, barrier, simpleDraweeView, constraintLayout, textView, textView2, simpleDraweeView2, dCDButton, overlappingCirclesView, frameLayout, textView3, linearLayout);
                                                }
                                            }
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

    public static ActivityLauncherViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.activity_launcher_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
