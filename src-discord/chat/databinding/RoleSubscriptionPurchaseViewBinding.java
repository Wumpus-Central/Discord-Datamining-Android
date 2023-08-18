package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


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
        int i10 = R.id.role_subscription_badge_dummy_view;
        View a10 = a.a(view, i10);
        if (a10 != null) {
            i10 = R.id.role_subscription_purchase_badge;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.role_subscription_purchase_card_bg;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView2 != null) {
                    i10 = R.id.role_subscription_purchase_lanyard;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView3 != null) {
                        i10 = R.id.role_subscription_purchaser_avatar;
                        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                        if (simpleDraweeView4 != null) {
                            i10 = R.id.role_subscription_purchaser_username;
                            TextView textView = (TextView) a.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.role_subscription_welcome;
                                TextView textView2 = (TextView) a.a(view, i10);
                                if (textView2 != null) {
                                    return new RoleSubscriptionPurchaseViewBinding(view, a10, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RoleSubscriptionPurchaseViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.role_subscription_purchase_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
