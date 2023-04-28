package p144i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p052d.C6387i;

/* renamed from: i.c */
/* loaded from: classes.dex */
public class C8096c extends ContextWrapper {

    /* renamed from: a */
    private int f17482a;

    /* renamed from: b */
    private Resources.Theme f17483b;

    /* renamed from: c */
    private LayoutInflater f17484c;

    /* renamed from: d */
    private Configuration f17485d;

    /* renamed from: e */
    private Resources f17486e;

    public C8096c() {
        super(null);
    }

    /* renamed from: b */
    private Resources m20620b() {
        if (this.f17486e == null) {
            Configuration configuration = this.f17485d;
            if (configuration == null) {
                this.f17486e = super.getResources();
            } else {
                this.f17486e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f17486e;
    }

    /* renamed from: d */
    private void m20618d() {
        boolean z;
        if (this.f17483b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f17483b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17483b.setTo(theme);
            }
        }
        m20617e(this.f17483b, this.f17482a, z);
    }

    /* renamed from: a */
    public void m20621a(Configuration configuration) {
        if (this.f17486e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f17485d == null) {
            this.f17485d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m20619c() {
        return this.f17482a;
    }

    /* renamed from: e */
    protected void m20617e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m20620b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f17484c == null) {
            this.f17484c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f17484c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f17483b;
        if (theme != null) {
            return theme;
        }
        if (this.f17482a == 0) {
            this.f17482a = C6387i.f13234d;
        }
        m20618d();
        return this.f17483b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f17482a != i) {
            this.f17482a = i;
            m20618d();
        }
    }

    public C8096c(Context context, int i) {
        super(context);
        this.f17482a = i;
    }

    public C8096c(Context context, Resources.Theme theme) {
        super(context);
        this.f17483b = theme;
    }
}
