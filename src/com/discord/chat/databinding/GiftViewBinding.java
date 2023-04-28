package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.discord.chat.C4254R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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
        View a;
        View a2;
        View a3;
        View a4;
        View a5;
        int i = C4254R.C4256id.acceptButton;
        DCDButton dCDButton = (DCDButton) C13922a.m2313a(view, i);
        if (!(dCDButton == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.acceptButtonGradient))) == null)) {
            i = C4254R.C4256id.barrier;
            Barrier barrier = (Barrier) C13922a.m2313a(view, i);
            if (barrier != null) {
                i = C4254R.C4256id.body;
                TextView textView = (TextView) C13922a.m2313a(view, i);
                if (textView != null) {
                    i = C4254R.C4256id.content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C13922a.m2313a(view, i);
                    if (constraintLayout != null) {
                        i = C4254R.C4256id.gradients;
                        Group group = (Group) C13922a.m2313a(view, i);
                        if (group != null) {
                            i = C4254R.C4256id.header;
                            TextView textView2 = (TextView) C13922a.m2313a(view, i);
                            if (!(textView2 == null || (a2 = C13922a.m2313a(view, (i = C4254R.C4256id.headerGradient))) == null)) {
                                i = C4254R.C4256id.splash;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
                                if (simpleDraweeView != null) {
                                    i = C4254R.C4256id.subtitle;
                                    TextView textView3 = (TextView) C13922a.m2313a(view, i);
                                    if (!(textView3 == null || (a3 = C13922a.m2313a(view, (i = C4254R.C4256id.subtitleGradient))) == null)) {
                                        i = C4254R.C4256id.thumbnail;
                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                        if (!(simpleDraweeView2 == null || (a4 = C13922a.m2313a(view, (i = C4254R.C4256id.thumbnailGradient))) == null)) {
                                            i = C4254R.C4256id.title;
                                            TextView textView4 = (TextView) C13922a.m2313a(view, i);
                                            if (!(textView4 == null || (a5 = C13922a.m2313a(view, (i = C4254R.C4256id.titleGradient))) == null)) {
                                                return new GiftViewBinding((FrameLayout) view, dCDButton, a, barrier, textView, constraintLayout, group, textView2, a2, simpleDraweeView, textView3, a3, simpleDraweeView2, a4, textView4, a5);
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

    public static GiftViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GiftViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4254R.layout.gift_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
