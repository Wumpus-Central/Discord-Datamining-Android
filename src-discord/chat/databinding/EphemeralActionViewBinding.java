package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes4.dex */
public final class EphemeralActionViewBinding {
    public final SimpleDraweeView chatListAdapterItemIconHelp;
    public final SimpleDraweeSpanTextView chatListAdapterItemTextDismiss;
    public final SimpleDraweeView chatListAdapterItemVisibilityIcon;
    private final View rootView;

    private EphemeralActionViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeSpanTextView simpleDraweeSpanTextView, SimpleDraweeView simpleDraweeView2) {
        this.rootView = view;
        this.chatListAdapterItemIconHelp = simpleDraweeView;
        this.chatListAdapterItemTextDismiss = simpleDraweeSpanTextView;
        this.chatListAdapterItemVisibilityIcon = simpleDraweeView2;
    }

    public static EphemeralActionViewBinding bind(View view) {
        int i10 = R.id.chat_list_adapter_item_icon_help;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.chat_list_adapter_item_text_dismiss;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
            if (simpleDraweeSpanTextView != null) {
                i10 = R.id.chat_list_adapter_item_visibility_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView2 != null) {
                    return new EphemeralActionViewBinding(view, simpleDraweeView, simpleDraweeSpanTextView, simpleDraweeView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EphemeralActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.ephemeral_action_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
