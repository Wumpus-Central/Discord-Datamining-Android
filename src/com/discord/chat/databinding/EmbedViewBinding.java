package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.view.EmbedViewResizingMediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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

    private EmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, TextView textView, View view2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, TextView textView2, SimpleDraweeView simpleDraweeView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, SimpleDraweeView simpleDraweeView3, LinearLayout linearLayout5, TextView textView3, ConstraintLayout constraintLayout, EmbedViewResizingMediaView embedViewResizingMediaView, EmbedViewResizingMediaView embedViewResizingMediaView2, EmbedViewResizingMediaView embedViewResizingMediaView3, EmbedViewResizingMediaView embedViewResizingMediaView4, EmbedViewResizingMediaView embedViewResizingMediaView5, SimpleDraweeSpanTextView simpleDraweeSpanTextView2, Space space, SpoilerView spoilerView, SimpleDraweeView simpleDraweeView4, SimpleDraweeSpanTextView simpleDraweeSpanTextView3) {
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
        View a;
        int i = C4254R.C4256id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C4254R.C4256id.author_container;
            LinearLayout linearLayout = (LinearLayout) C13922a.m2313a(view, i);
            if (linearLayout != null) {
                i = C4254R.C4256id.author_name;
                TextView textView = (TextView) C13922a.m2313a(view, i);
                if (!(textView == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.border))) == null)) {
                    i = C4254R.C4256id.description;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        i = C4254R.C4256id.error;
                        TextView textView2 = (TextView) C13922a.m2313a(view, i);
                        if (textView2 != null) {
                            i = C4254R.C4256id.error_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C4254R.C4256id.fields_bottom_wrap;
                                LinearLayout linearLayout2 = (LinearLayout) C13922a.m2313a(view, i);
                                if (linearLayout2 != null) {
                                    i = C4254R.C4256id.fields_container;
                                    LinearLayout linearLayout3 = (LinearLayout) C13922a.m2313a(view, i);
                                    if (linearLayout3 != null) {
                                        i = C4254R.C4256id.fields_top_wrap;
                                        LinearLayout linearLayout4 = (LinearLayout) C13922a.m2313a(view, i);
                                        if (linearLayout4 != null) {
                                            i = C4254R.C4256id.footer_avatar;
                                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                            if (simpleDraweeView3 != null) {
                                                i = C4254R.C4256id.footer_container;
                                                LinearLayout linearLayout5 = (LinearLayout) C13922a.m2313a(view, i);
                                                if (linearLayout5 != null) {
                                                    i = C4254R.C4256id.footer_text;
                                                    TextView textView3 = (TextView) C13922a.m2313a(view, i);
                                                    if (textView3 != null) {
                                                        i = C4254R.C4256id.inline_media_container;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) C13922a.m2313a(view, i);
                                                        if (constraintLayout != null) {
                                                            i = C4254R.C4256id.inline_media_view;
                                                            EmbedViewResizingMediaView embedViewResizingMediaView = (EmbedViewResizingMediaView) C13922a.m2313a(view, i);
                                                            if (embedViewResizingMediaView != null) {
                                                                i = C4254R.C4256id.inline_media_view2;
                                                                EmbedViewResizingMediaView embedViewResizingMediaView2 = (EmbedViewResizingMediaView) C13922a.m2313a(view, i);
                                                                if (embedViewResizingMediaView2 != null) {
                                                                    i = C4254R.C4256id.inline_media_view3;
                                                                    EmbedViewResizingMediaView embedViewResizingMediaView3 = (EmbedViewResizingMediaView) C13922a.m2313a(view, i);
                                                                    if (embedViewResizingMediaView3 != null) {
                                                                        i = C4254R.C4256id.inline_media_view4;
                                                                        EmbedViewResizingMediaView embedViewResizingMediaView4 = (EmbedViewResizingMediaView) C13922a.m2313a(view, i);
                                                                        if (embedViewResizingMediaView4 != null) {
                                                                            i = C4254R.C4256id.media_view;
                                                                            EmbedViewResizingMediaView embedViewResizingMediaView5 = (EmbedViewResizingMediaView) C13922a.m2313a(view, i);
                                                                            if (embedViewResizingMediaView5 != null) {
                                                                                i = C4254R.C4256id.provider;
                                                                                SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
                                                                                if (simpleDraweeSpanTextView2 != null) {
                                                                                    i = C4254R.C4256id.spacer;
                                                                                    Space space = (Space) C13922a.m2313a(view, i);
                                                                                    if (space != null) {
                                                                                        i = C4254R.C4256id.spoiler;
                                                                                        SpoilerView spoilerView = (SpoilerView) C13922a.m2313a(view, i);
                                                                                        if (spoilerView != null) {
                                                                                            i = C4254R.C4256id.thumbnail;
                                                                                            SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                                                                            if (simpleDraweeView4 != null) {
                                                                                                i = C4254R.C4256id.title;
                                                                                                SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
                                                                                                if (simpleDraweeSpanTextView3 != null) {
                                                                                                    return new EmbedViewBinding(view, simpleDraweeView, linearLayout, textView, a, simpleDraweeSpanTextView, textView2, simpleDraweeView2, linearLayout2, linearLayout3, linearLayout4, simpleDraweeView3, linearLayout5, textView3, constraintLayout, embedViewResizingMediaView, embedViewResizingMediaView2, embedViewResizingMediaView3, embedViewResizingMediaView4, embedViewResizingMediaView5, simpleDraweeSpanTextView2, space, spoilerView, simpleDraweeView4, simpleDraweeSpanTextView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
