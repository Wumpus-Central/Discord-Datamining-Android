package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p052d.C6384f;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b-\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\"R\u001c\u0010(\u001a\n %*\u0004\u0018\u00010$0$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010+\u001a\n %*\u0004\u0018\u00010)0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010*R\u001c\u0010,\u001a\n %*\u0004\u0018\u00010)0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010*¨\u0006."}, m15073d2 = {"Lcom/swmansion/rnscreens/i0;", "", "", "textColor", "", "h", "(Ljava/lang/Integer;)V", "tintColor", "i", "headerIconColor", "e", "hintTextColor", "f", "", ReactTextInputShadowNode.PROP_PLACEHOLDER, "", "shouldShowHintSearchIcon", "g", "Landroidx/appcompat/widget/SearchView;", "a", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "searchView", "b", "Ljava/lang/Integer;", "mDefaultTextColor", "Landroid/graphics/drawable/Drawable;", "c", "Landroid/graphics/drawable/Drawable;", "mDefaultTintBackground", "Landroid/widget/EditText;", "()Landroid/widget/EditText;", "searchEditText", "Landroid/view/View;", "kotlin.jvm.PlatformType", "d", "()Landroid/view/View;", "searchTextPlate", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "searchIcon", "searchCloseIcon", "<init>", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.i0 */
/* loaded from: classes8.dex */
public final class C6307i0 {

    /* renamed from: a */
    private SearchView f12789a;

    /* renamed from: b */
    private Integer f12790b;

    /* renamed from: c */
    private Drawable f12791c;

    public C6307i0(SearchView searchView) {
        C9971q.m14633g(searchView, "searchView");
        this.f12789a = searchView;
    }

    /* renamed from: a */
    private final ImageView m25936a() {
        return (ImageView) this.f12789a.findViewById(C6384f.f13195y);
    }

    /* renamed from: b */
    private final EditText m25935b() {
        View findViewById = this.f12789a.findViewById(C6384f.f37772D);
        if (findViewById instanceof EditText) {
            return (EditText) findViewById;
        }
        return null;
    }

    /* renamed from: c */
    private final ImageView m25934c() {
        return (ImageView) this.f12789a.findViewById(C6384f.f13194x);
    }

    /* renamed from: d */
    private final View m25933d() {
        return this.f12789a.findViewById(C6384f.f37771C);
    }

    /* renamed from: e */
    public final void m25932e(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            m25934c().setColorFilter(intValue);
            m25936a().setColorFilter(intValue);
        }
    }

    /* renamed from: f */
    public final void m25931f(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            EditText b = m25935b();
            if (b != null) {
                b.setHintTextColor(intValue);
            }
        }
    }

    /* renamed from: g */
    public final void m25930g(String placeholder, boolean z) {
        C9971q.m14633g(placeholder, "placeholder");
        if (z) {
            this.f12789a.setQueryHint(placeholder);
            return;
        }
        EditText b = m25935b();
        if (b != null) {
            b.setHint(placeholder);
        }
    }

    /* renamed from: h */
    public final void m25929h(Integer num) {
        EditText b;
        Integer num2;
        ColorStateList textColors;
        Integer num3 = this.f12790b;
        if (num != null) {
            if (num3 == null) {
                EditText b2 = m25935b();
                if (b2 == null || (textColors = b2.getTextColors()) == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(textColors.getDefaultColor());
                }
                this.f12790b = num2;
            }
            EditText b3 = m25935b();
            if (b3 != null) {
                b3.setTextColor(num.intValue());
            }
        } else if (num3 != null && (b = m25935b()) != null) {
            b.setTextColor(num3.intValue());
        }
    }

    /* renamed from: i */
    public final void m25928i(Integer num) {
        Drawable drawable = this.f12791c;
        if (num != null) {
            if (drawable == null) {
                this.f12791c = m25933d().getBackground();
            }
            m25933d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            m25933d().setBackground(drawable);
        }
    }
}
