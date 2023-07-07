package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;

/* loaded from: classes3.dex */
public final class ActivityBookmarkViewBinding {
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

    private ActivityBookmarkViewBinding(View view, Barrier barrier, SimpleDraweeView simpleDraweeView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, OverlappingCirclesView overlappingCirclesView, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout) {
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

    public static ActivityBookmarkViewBinding bind(View view) {
        int i10 = R.id.barrier_footer;
        Barrier barrier = (Barrier) a.a(view, i10);
        if (barrier != null) {
            i10 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.item_description;
                    TextView textView = (TextView) a.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.item_header;
                        TextView textView2 = (TextView) a.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.item_hero;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView2 != null) {
                                i10 = R.id.launch_button;
                                DCDButton dCDButton = (DCDButton) a.a(view, i10);
                                if (dCDButton != null) {
                                    i10 = R.id.participants;
                                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.a(view, i10);
                                    if (overlappingCirclesView != null) {
                                        i10 = R.id.participants_container;
                                        FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = R.id.participants_info;
                                            TextView textView3 = (TextView) a.a(view, i10);
                                            if (textView3 != null) {
                                                i10 = R.id.participants_info_container;
                                                LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                                                if (linearLayout != null) {
                                                    return new ActivityBookmarkViewBinding(view, barrier, simpleDraweeView, constraintLayout, textView, textView2, simpleDraweeView2, dCDButton, overlappingCirclesView, frameLayout, textView3, linearLayout);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityBookmarkViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.activity_bookmark_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
