package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C4254R;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class PostPreviewEmbedViewBinding {
    public final SimpleDraweeView coverImage;
    public final DCDButton coverImageOverlayButton;
    public final DCDButton cta;
    public final SimpleDraweeSpanTextView footer;
    public final View headerDivider;
    private final View rootView;
    public final TextView subtitle;
    public final TextView title;

    private PostPreviewEmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, DCDButton dCDButton, DCDButton dCDButton2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, View view2, TextView textView, TextView textView2) {
        this.rootView = view;
        this.coverImage = simpleDraweeView;
        this.coverImageOverlayButton = dCDButton;
        this.cta = dCDButton2;
        this.footer = simpleDraweeSpanTextView;
        this.headerDivider = view2;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static PostPreviewEmbedViewBinding bind(View view) {
        View a;
        int i = C4254R.C4256id.cover_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C4254R.C4256id.cover_image_overlay_button;
            DCDButton dCDButton = (DCDButton) C13922a.m2313a(view, i);
            if (dCDButton != null) {
                i = C4254R.C4256id.cta;
                DCDButton dCDButton2 = (DCDButton) C13922a.m2313a(view, i);
                if (dCDButton2 != null) {
                    i = C4254R.C4256id.footer;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
                    if (!(simpleDraweeSpanTextView == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.header_divider))) == null)) {
                        i = C4254R.C4256id.subtitle;
                        TextView textView = (TextView) C13922a.m2313a(view, i);
                        if (textView != null) {
                            i = C4254R.C4256id.title;
                            TextView textView2 = (TextView) C13922a.m2313a(view, i);
                            if (textView2 != null) {
                                return new PostPreviewEmbedViewBinding(view, simpleDraweeView, dCDButton, dCDButton2, simpleDraweeSpanTextView, a, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PostPreviewEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.post_preview_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
