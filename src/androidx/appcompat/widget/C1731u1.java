package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.u1 */
/* loaded from: classes.dex */
public class C1731u1 extends C1662e1 {

    /* renamed from: c */
    private static boolean f1518c = false;

    /* renamed from: b */
    private final WeakReference<Context> f1519b;

    public C1731u1(Context context, Resources resources) {
        super(resources);
        this.f1519b = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m40006b() {
        return f1518c;
    }

    /* renamed from: c */
    public static void m40005c(boolean z) {
        f1518c = z;
    }

    /* renamed from: d */
    public static boolean m40004d() {
        m40006b();
        return false;
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) {
        return super.getAnimation(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) {
        return super.getBoolean(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) {
        return super.getColor(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) {
        return super.getColorStateList(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) {
        return super.getDimension(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) {
        return super.getDimensionPixelOffset(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) {
        return super.getDimensionPixelSize(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) {
        return super.getDrawable(i, theme);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) {
        return super.getIntArray(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) {
        return super.getInteger(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) {
        return super.getLayout(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i) {
        return super.getMovie(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) {
        return super.getQuantityString(i, i2);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) {
        return super.getQuantityText(i, i2);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) {
        return super.getResourceEntryName(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i) {
        return super.getResourceName(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) {
        return super.getResourcePackageName(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) {
        return super.getResourceTypeName(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i) {
        return super.getString(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i) {
        return super.getStringArray(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i) {
        return super.getText(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) {
        return super.getTextArray(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) {
        super.getValue(i, typedValue, z);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) {
        return super.getXml(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) {
        return super.obtainTypedArray(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) {
        return super.openRawResource(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i) {
        return super.openRawResourceFd(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f1519b.get();
        if (context != null) {
            return C1652d1.m40273h().m40261t(context, this, i);
        }
        return m40251a(i);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) {
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) {
        return super.getString(i, objArr);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z) {
        super.getValue(str, typedValue, z);
    }

    @Override // androidx.appcompat.widget.C1662e1, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i, TypedValue typedValue) {
        return super.openRawResource(i, typedValue);
    }
}
