package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class RoleSubscriptionPurchaseViewBinding {
    public final View roleSubscriptionBadgeDummyView;
    public final SimpleDraweeView roleSubscriptionPurchaseBadge;
    public final SimpleDraweeView roleSubscriptionPurchaseCardBg;
    public final SimpleDraweeView roleSubscriptionPurchaseLanyard;
    public final SimpleDraweeView roleSubscriptionPurchaserAvatar;
    public final TextView roleSubscriptionPurchaserUsername;
    public final TextView roleSubscriptionWelcome;
    private final View rootView;

    private RoleSubscriptionPurchaseViewBinding(View view, View view2, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, SimpleDraweeView simpleDraweeView3, SimpleDraweeView simpleDraweeView4, TextView textView, TextView textView2) {
        this.rootView = view;
        this.roleSubscriptionBadgeDummyView = view2;
        this.roleSubscriptionPurchaseBadge = simpleDraweeView;
        this.roleSubscriptionPurchaseCardBg = simpleDraweeView2;
        this.roleSubscriptionPurchaseLanyard = simpleDraweeView3;
        this.roleSubscriptionPurchaserAvatar = simpleDraweeView4;
        this.roleSubscriptionPurchaserUsername = textView;
        this.roleSubscriptionWelcome = textView2;
    }

    public static RoleSubscriptionPurchaseViewBinding bind(View view) {
        int i = C3147R.C3149id.role_subscription_badge_dummy_view;
        View a = C13836a.m2313a(view, i);
        if (a != null) {
            i = C3147R.C3149id.role_subscription_purchase_badge;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                i = C3147R.C3149id.role_subscription_purchase_card_bg;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C3147R.C3149id.role_subscription_purchase_lanyard;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C13836a.m2313a(view, i);
                    if (simpleDraweeView3 != null) {
                        i = C3147R.C3149id.role_subscription_purchaser_avatar;
                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C13836a.m2313a(view, i);
                        if (simpleDraweeView4 != null) {
                            i = C3147R.C3149id.role_subscription_purchaser_username;
                            TextView textView = (TextView) C13836a.m2313a(view, i);
                            if (textView != null) {
                                i = C3147R.C3149id.role_subscription_welcome;
                                TextView textView2 = (TextView) C13836a.m2313a(view, i);
                                if (textView2 != null) {
                                    return new RoleSubscriptionPurchaseViewBinding(view, a, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RoleSubscriptionPurchaseViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.role_subscription_purchase_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
