package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes8.dex */
public final class GiftViewBinding {
    public final DCDButton acceptButton;
    public final View acceptButtonGradient;
    public final Barrier barrier;
    public final TextView body;
    public final ConstraintLayout content;
    public final Group gradients;
    public final TextView header;
    public final View headerGradient;
    private final FrameLayout rootView;
    public final SimpleDraweeView splash;
    public final TextView subtitle;
    public final View subtitleGradient;
    public final SimpleDraweeView thumbnail;
    public final View thumbnailGradient;
    public final TextView title;
    public final View titleGradient;

    private GiftViewBinding(FrameLayout frameLayout, DCDButton dCDButton, View view, Barrier barrier, TextView textView, ConstraintLayout constraintLayout, Group group, TextView textView2, View view2, SimpleDraweeView simpleDraweeView, TextView textView3, View view3, SimpleDraweeView simpleDraweeView2, View view4, TextView textView4, View view5) {
        this.rootView = frameLayout;
        this.acceptButton = dCDButton;
        this.acceptButtonGradient = view;
        this.barrier = barrier;
        this.body = textView;
        this.content = constraintLayout;
        this.gradients = group;
        this.header = textView2;
        this.headerGradient = view2;
        this.splash = simpleDraweeView;
        this.subtitle = textView3;
        this.subtitleGradient = view3;
        this.thumbnail = simpleDraweeView2;
        this.thumbnailGradient = view4;
        this.title = textView4;
        this.titleGradient = view5;
    }

    public static GiftViewBinding bind(View view) {
        View a10;
        View a11;
        View a12;
        View a13;
        View a14;
        int i10 = R.id.acceptButton;
        DCDButton dCDButton = (DCDButton) a.a(view, i10);
        if (!(dCDButton == null || (a10 = a.a(view, (i10 = R.id.acceptButtonGradient))) == null)) {
            i10 = R.id.barrier;
            Barrier barrier = (Barrier) a.a(view, i10);
            if (barrier != null) {
                i10 = R.id.body;
                TextView textView = (TextView) a.a(view, i10);
                if (textView != null) {
                    i10 = R.id.content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = R.id.gradients;
                        Group group = (Group) a.a(view, i10);
                        if (group != null) {
                            i10 = R.id.header;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (!(textView2 == null || (a11 = a.a(view, (i10 = R.id.headerGradient))) == null)) {
                                i10 = R.id.splash;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                                if (simpleDraweeView != null) {
                                    i10 = R.id.subtitle;
                                    TextView textView3 = (TextView) a.a(view, i10);
                                    if (!(textView3 == null || (a12 = a.a(view, (i10 = R.id.subtitleGradient))) == null)) {
                                        i10 = R.id.thumbnail;
                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                                        if (!(simpleDraweeView2 == null || (a13 = a.a(view, (i10 = R.id.thumbnailGradient))) == null)) {
                                            i10 = R.id.title;
                                            TextView textView4 = (TextView) a.a(view, i10);
                                            if (!(textView4 == null || (a14 = a.a(view, (i10 = R.id.titleGradient))) == null)) {
                                                return new GiftViewBinding((FrameLayout) view, dCDButton, a10, barrier, textView, constraintLayout, group, textView2, a11, simpleDraweeView, textView3, a12, simpleDraweeView2, a13, textView4, a14);
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

    public static GiftViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GiftViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.gift_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
