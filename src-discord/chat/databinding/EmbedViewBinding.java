package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.EmbedViewResizingMediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class EmbedViewBinding {
    public final SimpleDraweeView authorAvatar;
    public final LinearLayout authorContainer;
    public final TextView authorName;
    public final View border;
    public final SimpleDraweeSpanTextView description;
    public final TextView error;
    public final SimpleDraweeView errorIcon;
    public final LinearLayout fieldsBottomWrap;
    public final LinearLayout fieldsContainer;
    public final LinearLayout fieldsTopWrap;
    public final SimpleDraweeView footerAvatar;
    public final LinearLayout footerContainer;
    public final TextView footerText;
    public final FrameLayout imageBlurBg;
    public final ConstraintLayout inlineMediaContainer;
    public final EmbedViewResizingMediaView inlineMediaView;
    public final EmbedViewResizingMediaView inlineMediaView2;
    public final EmbedViewResizingMediaView inlineMediaView3;
    public final EmbedViewResizingMediaView inlineMediaView4;
    public final EmbedViewResizingMediaView mediaView;
    public final SimpleDraweeSpanTextView provider;
    private final View rootView;
    public final Space spacer;
    public final SpoilerView spoiler;
    public final SimpleDraweeView thumbnail;
    public final SimpleDraweeSpanTextView title;

    private EmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, TextView textView, View view2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, TextView textView2, SimpleDraweeView simpleDraweeView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, SimpleDraweeView simpleDraweeView3, LinearLayout linearLayout5, TextView textView3, FrameLayout frameLayout, ConstraintLayout constraintLayout, EmbedViewResizingMediaView embedViewResizingMediaView, EmbedViewResizingMediaView embedViewResizingMediaView2, EmbedViewResizingMediaView embedViewResizingMediaView3, EmbedViewResizingMediaView embedViewResizingMediaView4, EmbedViewResizingMediaView embedViewResizingMediaView5, SimpleDraweeSpanTextView simpleDraweeSpanTextView2, Space space, SpoilerView spoilerView, SimpleDraweeView simpleDraweeView4, SimpleDraweeSpanTextView simpleDraweeSpanTextView3) {
        this.rootView = view;
        this.authorAvatar = simpleDraweeView;
        this.authorContainer = linearLayout;
        this.authorName = textView;
        this.border = view2;
        this.description = simpleDraweeSpanTextView;
        this.error = textView2;
        this.errorIcon = simpleDraweeView2;
        this.fieldsBottomWrap = linearLayout2;
        this.fieldsContainer = linearLayout3;
        this.fieldsTopWrap = linearLayout4;
        this.footerAvatar = simpleDraweeView3;
        this.footerContainer = linearLayout5;
        this.footerText = textView3;
        this.imageBlurBg = frameLayout;
        this.inlineMediaContainer = constraintLayout;
        this.inlineMediaView = embedViewResizingMediaView;
        this.inlineMediaView2 = embedViewResizingMediaView2;
        this.inlineMediaView3 = embedViewResizingMediaView3;
        this.inlineMediaView4 = embedViewResizingMediaView4;
        this.mediaView = embedViewResizingMediaView5;
        this.provider = simpleDraweeSpanTextView2;
        this.spacer = space;
        this.spoiler = spoilerView;
        this.thumbnail = simpleDraweeView4;
        this.title = simpleDraweeSpanTextView3;
    }

    public static EmbedViewBinding bind(View view) {
        View a10;
        int i10 = R.id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.author_container;
            LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
            if (linearLayout != null) {
                i10 = R.id.author_name;
                TextView textView = (TextView) a.a(view, i10);
                if (!(textView == null || (a10 = a.a(view, (i10 = R.id.border))) == null)) {
                    i10 = R.id.description;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                    if (simpleDraweeSpanTextView != null) {
                        i10 = R.id.error;
                        TextView textView2 = (TextView) a.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.error_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView2 != null) {
                                i10 = R.id.fields_bottom_wrap;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view, i10);
                                if (linearLayout2 != null) {
                                    i10 = R.id.fields_container;
                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view, i10);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.fields_top_wrap;
                                        LinearLayout linearLayout4 = (LinearLayout) a.a(view, i10);
                                        if (linearLayout4 != null) {
                                            i10 = R.id.footer_avatar;
                                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                                            if (simpleDraweeView3 != null) {
                                                i10 = R.id.footer_container;
                                                LinearLayout linearLayout5 = (LinearLayout) a.a(view, i10);
                                                if (linearLayout5 != null) {
                                                    i10 = R.id.footer_text;
                                                    TextView textView3 = (TextView) a.a(view, i10);
                                                    if (textView3 != null) {
                                                        i10 = R.id.image_blur_bg;
                                                        FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
                                                        if (frameLayout != null) {
                                                            i10 = R.id.inline_media_container;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                                                            if (constraintLayout != null) {
                                                                i10 = R.id.inline_media_view;
                                                                EmbedViewResizingMediaView embedViewResizingMediaView = (EmbedViewResizingMediaView) a.a(view, i10);
                                                                if (embedViewResizingMediaView != null) {
                                                                    i10 = R.id.inline_media_view2;
                                                                    EmbedViewResizingMediaView embedViewResizingMediaView2 = (EmbedViewResizingMediaView) a.a(view, i10);
                                                                    if (embedViewResizingMediaView2 != null) {
                                                                        i10 = R.id.inline_media_view3;
                                                                        EmbedViewResizingMediaView embedViewResizingMediaView3 = (EmbedViewResizingMediaView) a.a(view, i10);
                                                                        if (embedViewResizingMediaView3 != null) {
                                                                            i10 = R.id.inline_media_view4;
                                                                            EmbedViewResizingMediaView embedViewResizingMediaView4 = (EmbedViewResizingMediaView) a.a(view, i10);
                                                                            if (embedViewResizingMediaView4 != null) {
                                                                                i10 = R.id.media_view;
                                                                                EmbedViewResizingMediaView embedViewResizingMediaView5 = (EmbedViewResizingMediaView) a.a(view, i10);
                                                                                if (embedViewResizingMediaView5 != null) {
                                                                                    i10 = R.id.provider;
                                                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) a.a(view, i10);
                                                                                    if (simpleDraweeSpanTextView2 != null) {
                                                                                        i10 = R.id.spacer;
                                                                                        Space space = (Space) a.a(view, i10);
                                                                                        if (space != null) {
                                                                                            i10 = R.id.spoiler;
                                                                                            SpoilerView spoilerView = (SpoilerView) a.a(view, i10);
                                                                                            if (spoilerView != null) {
                                                                                                i10 = R.id.thumbnail;
                                                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                                                                                                if (simpleDraweeView4 != null) {
                                                                                                    i10 = R.id.title;
                                                                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = (SimpleDraweeSpanTextView) a.a(view, i10);
                                                                                                    if (simpleDraweeSpanTextView3 != null) {
                                                                                                        return new EmbedViewBinding(view, simpleDraweeView, linearLayout, textView, a10, simpleDraweeSpanTextView, textView2, simpleDraweeView2, linearLayout2, linearLayout3, linearLayout4, simpleDraweeView3, linearLayout5, textView3, frameLayout, constraintLayout, embedViewResizingMediaView, embedViewResizingMediaView2, embedViewResizingMediaView3, embedViewResizingMediaView4, embedViewResizingMediaView5, simpleDraweeSpanTextView2, space, spoilerView, simpleDraweeView4, simpleDraweeSpanTextView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
