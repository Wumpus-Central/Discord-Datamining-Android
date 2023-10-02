package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class SafetyPolicyNoticeBinding {
    public final TextView description;
    public final LinearLayout footer;
    public final SimpleDraweeView icon;
    public final TextView learnMore;
    private final View rootView;
    public final TextView subtitleText;
    public final TextView title;

    private SafetyPolicyNoticeBinding(View view, TextView textView, LinearLayout linearLayout, SimpleDraweeView simpleDraweeView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = view;
        this.description = textView;
        this.footer = linearLayout;
        this.icon = simpleDraweeView;
        this.learnMore = textView2;
        this.subtitleText = textView3;
        this.title = textView4;
    }

    public static SafetyPolicyNoticeBinding bind(View view) {
        int i10 = R.id.description;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.footer;
            LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
            if (linearLayout != null) {
                i10 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    i10 = R.id.learn_more;
                    TextView textView2 = (TextView) a.a(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.subtitle_text;
                        TextView textView3 = (TextView) a.a(view, i10);
                        if (textView3 != null) {
                            i10 = R.id.title;
                            TextView textView4 = (TextView) a.a(view, i10);
                            if (textView4 != null) {
                                return new SafetyPolicyNoticeBinding(view, textView, linearLayout, simpleDraweeView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SafetyPolicyNoticeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.safety_policy_notice, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
