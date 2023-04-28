package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C2337a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p052d.C6379a;
import p052d.C6384f;
import p111g1.AbstractC7393c;

/* renamed from: androidx.appcompat.widget.h1 */
/* loaded from: classes.dex */
class View$OnClickListenerC1678h1 extends AbstractC7393c implements View.OnClickListener {

    /* renamed from: C */
    private ColorStateList f35281C;

    /* renamed from: v */
    private final SearchView f1372v;

    /* renamed from: w */
    private final SearchableInfo f1373w;

    /* renamed from: x */
    private final Context f1374x;

    /* renamed from: y */
    private final WeakHashMap<String, Drawable.ConstantState> f1375y;

    /* renamed from: z */
    private final int f1376z;

    /* renamed from: A */
    private boolean f35279A = false;

    /* renamed from: B */
    private int f35280B = 1;

    /* renamed from: D */
    private int f35282D = -1;

    /* renamed from: E */
    private int f35283E = -1;

    /* renamed from: F */
    private int f35284F = -1;

    /* renamed from: G */
    private int f35285G = -1;

    /* renamed from: H */
    private int f35286H = -1;

    /* renamed from: I */
    private int f35287I = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h1$a */
    /* loaded from: classes.dex */
    public static final class C1679a {

        /* renamed from: a */
        public final TextView f1377a;

        /* renamed from: b */
        public final TextView f1378b;

        /* renamed from: c */
        public final ImageView f1379c;

        /* renamed from: d */
        public final ImageView f1380d;

        /* renamed from: e */
        public final ImageView f1381e;

        public C1679a(View view) {
            this.f1377a = (TextView) view.findViewById(16908308);
            this.f1378b = (TextView) view.findViewById(16908309);
            this.f1379c = (ImageView) view.findViewById(16908295);
            this.f1380d = (ImageView) view.findViewById(16908296);
            this.f1381e = (ImageView) view.findViewById(C6384f.f13187q);
        }
    }

    public View$OnClickListenerC1678h1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1372v = searchView;
        this.f1373w = searchableInfo;
        this.f1376z = searchView.getSuggestionCommitIconResId();
        this.f1374x = context;
        this.f1375y = weakHashMap;
    }

    /* renamed from: A */
    private void m40196A(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: j */
    private Drawable m40195j(String str) {
        Drawable.ConstantState constantState = this.f1375y.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: k */
    private CharSequence m40194k(CharSequence charSequence) {
        if (this.f35281C == null) {
            TypedValue typedValue = new TypedValue();
            this.f1374x.getTheme().resolveAttribute(C6379a.f37747M, typedValue, true);
            this.f35281C = this.f1374x.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f35281C, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: l */
    private Drawable m40193l(ComponentName componentName) {
        PackageManager packageManager = this.f1374x.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: m */
    private Drawable m40192m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1375y.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1375y.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1374x.getResources());
        }
        Drawable l = m40193l(componentName);
        if (l != null) {
            constantState = l.getConstantState();
        }
        this.f1375y.put(flattenToShortString, constantState);
        return l;
    }

    /* renamed from: n */
    public static String m40191n(Cursor cursor, String str) {
        return m40183v(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: o */
    private Drawable m40190o() {
        Drawable m = m40192m(this.f1373w.getSearchActivity());
        if (m != null) {
            return m;
        }
        return this.f1374x.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: p */
    private Drawable m40189p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m40188q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream openInputStream = this.f1374x.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        openInputStream.close();
                    } catch (IOException e) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                    }
                    return createFromStream;
                }
                throw new FileNotFoundException("Failed to open " + uri);
            }
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: r */
    private Drawable m40187r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1374x.getPackageName() + "/" + parseInt;
            Drawable j = m40195j(str2);
            if (j != null) {
                return j;
            }
            Drawable e = C2337a.m38133e(this.f1374x, parseInt);
            m40179z(str2, e);
            return e;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable j2 = m40195j(str);
            if (j2 != null) {
                return j2;
            }
            Drawable p = m40189p(Uri.parse(str));
            m40179z(str, p);
            return p;
        }
    }

    /* renamed from: s */
    private Drawable m40186s(Cursor cursor) {
        int i = this.f35285G;
        if (i == -1) {
            return null;
        }
        Drawable r = m40187r(cursor.getString(i));
        if (r != null) {
            return r;
        }
        return m40190o();
    }

    /* renamed from: t */
    private Drawable m40185t(Cursor cursor) {
        int i = this.f35286H;
        if (i == -1) {
            return null;
        }
        return m40187r(cursor.getString(i));
    }

    /* renamed from: v */
    private static String m40183v(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: x */
    private void m40181x(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: y */
    private void m40180y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: z */
    private void m40179z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1375y.put(str, drawable.getConstantState());
        }
    }

    @Override // p111g1.AbstractC7389a, p111g1.C7391b.AbstractC7392a
    /* renamed from: a */
    public void mo22754a(Cursor cursor) {
        if (this.f35279A) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo22754a(cursor);
            if (cursor != null) {
                this.f35282D = cursor.getColumnIndex("suggest_text_1");
                this.f35283E = cursor.getColumnIndex("suggest_text_2");
                this.f35284F = cursor.getColumnIndex("suggest_text_2_url");
                this.f35285G = cursor.getColumnIndex("suggest_icon_1");
                this.f35286H = cursor.getColumnIndex("suggest_icon_2");
                this.f35287I = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p111g1.C7391b.AbstractC7392a
    /* renamed from: b */
    public Cursor mo22753b(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.f1372v.getVisibility() == 0 && this.f1372v.getWindowVisibility() == 0) {
            try {
                Cursor u = m40184u(this.f1373w, str, 50);
                if (u != null) {
                    u.getCount();
                    return u;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p111g1.AbstractC7389a, p111g1.C7391b.AbstractC7392a
    public CharSequence convertToString(Cursor cursor) {
        String n;
        String n2;
        if (cursor == null) {
            return null;
        }
        String n3 = m40191n(cursor, "suggest_intent_query");
        if (n3 != null) {
            return n3;
        }
        if (this.f1373w.shouldRewriteQueryFromData() && (n2 = m40191n(cursor, "suggest_intent_data")) != null) {
            return n2;
        }
        if (!this.f1373w.shouldRewriteQueryFromText() || (n = m40191n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n;
    }

    @Override // p111g1.AbstractC7389a
    /* renamed from: d */
    public void mo22758d(View view, Context context, Cursor cursor) {
        int i;
        CharSequence charSequence;
        C1679a aVar = (C1679a) view.getTag();
        int i2 = this.f35287I;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (aVar.f1377a != null) {
            m40180y(aVar.f1377a, m40183v(cursor, this.f35282D));
        }
        if (aVar.f1378b != null) {
            String v = m40183v(cursor, this.f35284F);
            if (v != null) {
                charSequence = m40194k(v);
            } else {
                charSequence = m40183v(cursor, this.f35283E);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1377a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1377a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1377a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1377a.setMaxLines(1);
                }
            }
            m40180y(aVar.f1378b, charSequence);
        }
        ImageView imageView = aVar.f1379c;
        if (imageView != null) {
            m40181x(imageView, m40186s(cursor), 4);
        }
        ImageView imageView2 = aVar.f1380d;
        if (imageView2 != null) {
            m40181x(imageView2, m40185t(cursor), 8);
        }
        int i3 = this.f35280B;
        if (i3 == 2 || (i3 == 1 && (i & 1) != 0)) {
            aVar.f1381e.setVisibility(0);
            aVar.f1381e.setTag(aVar.f1377a.getText());
            aVar.f1381e.setOnClickListener(this);
            return;
        }
        aVar.f1381e.setVisibility(8);
    }

    @Override // p111g1.AbstractC7393c, p111g1.AbstractC7389a
    /* renamed from: g */
    public View mo22750g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g = super.mo22750g(context, cursor, viewGroup);
        g.setTag(new C1679a(g));
        ((ImageView) g.findViewById(C6384f.f13187q)).setImageResource(this.f1376z);
        return g;
    }

    @Override // p111g1.AbstractC7389a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View f = mo22751f(this.f1374x, mo22752c(), viewGroup);
            if (f != null) {
                ((C1679a) f.getTag()).f1377a.setText(e.toString());
            }
            return f;
        }
    }

    @Override // p111g1.AbstractC7389a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo22750g(this.f1374x, mo22752c(), viewGroup);
            if (g != null) {
                ((C1679a) g.getTag()).f1377a.setText(e.toString());
            }
            return g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m40196A(mo22752c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m40196A(mo22752c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1372v.m40417S((CharSequence) tag);
        }
    }

    /* renamed from: q */
    Drawable m40188q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1374x.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: u */
    Cursor m40184u(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1374x.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    /* renamed from: w */
    public void m40182w(int i) {
        this.f35280B = i;
    }
}
