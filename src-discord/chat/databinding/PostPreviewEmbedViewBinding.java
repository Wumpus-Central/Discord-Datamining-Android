package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

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
        View a10;
        int i10 = R.id.cover_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.cover_image_overlay_button;
            DCDButton dCDButton = (DCDButton) a.a(view, i10);
            if (dCDButton != null) {
                i10 = R.id.cta;
                DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
                if (dCDButton2 != null) {
                    i10 = R.id.footer;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                    if (!(simpleDraweeSpanTextView == null || (a10 = a.a(view, (i10 = R.id.header_divider))) == null)) {
                        i10 = R.id.subtitle;
                        TextView textView = (TextView) a.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.title;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (textView2 != null) {
                                return new PostPreviewEmbedViewBinding(view, simpleDraweeView, dCDButton, dCDButton2, simpleDraweeSpanTextView, a10, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PostPreviewEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.post_preview_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
