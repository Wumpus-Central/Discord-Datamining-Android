package p111g1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p111g1.C7391b;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public abstract class AbstractC7389a extends BaseAdapter implements Filterable, C7391b.AbstractC7392a {

    /* renamed from: k */
    protected boolean f15920k;

    /* renamed from: l */
    protected boolean f15921l;

    /* renamed from: m */
    protected Cursor f15922m;

    /* renamed from: n */
    protected Context f15923n;

    /* renamed from: o */
    protected int f15924o;

    /* renamed from: p */
    protected C0228a f15925p;

    /* renamed from: q */
    protected DataSetObserver f15926q;

    /* renamed from: r */
    protected C7391b f15927r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1.a$a */
    /* loaded from: classes.dex */
    public class C0228a extends ContentObserver {
        C0228a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC7389a.this.m22756h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1.a$b */
    /* loaded from: classes.dex */
    public class C7390b extends DataSetObserver {
        C7390b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC7389a aVar = AbstractC7389a.this;
            aVar.f15920k = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC7389a aVar = AbstractC7389a.this;
            aVar.f15920k = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public AbstractC7389a(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        m22757e(context, cursor, i);
    }

    /* renamed from: a */
    public void mo22754a(Cursor cursor) {
        Cursor i = m22755i(cursor);
        if (i != null) {
            i.close();
        }
    }

    @Override // p111g1.C7391b.AbstractC7392a
    /* renamed from: c */
    public Cursor mo22752c() {
        return this.f15922m;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* renamed from: d */
    public abstract void mo22758d(View view, Context context, Cursor cursor);

    /* renamed from: e */
    void m22757e(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f15921l = true;
        } else {
            this.f15921l = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f15922m = cursor;
        this.f15920k = z;
        this.f15923n = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f15924o = i2;
        if ((i & 2) == 2) {
            this.f15925p = new C0228a();
            this.f15926q = new C7390b();
        } else {
            this.f15925p = null;
            this.f15926q = null;
        }
        if (z) {
            C0228a aVar = this.f15925p;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f15926q;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: f */
    public abstract View mo22751f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: g */
    public abstract View mo22750g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f15920k || (cursor = this.f15922m) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f15920k) {
            return null;
        }
        this.f15922m.moveToPosition(i);
        if (view == null) {
            view = mo22751f(this.f15923n, this.f15922m, viewGroup);
        }
        mo22758d(view, this.f15923n, this.f15922m);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f15927r == null) {
            this.f15927r = new C7391b(this);
        }
        return this.f15927r;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f15920k || (cursor = this.f15922m) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f15922m;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f15920k || (cursor = this.f15922m) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f15922m.getLong(this.f15924o);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f15920k) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f15922m.moveToPosition(i)) {
            if (view == null) {
                view = mo22750g(this.f15923n, this.f15922m, viewGroup);
            }
            mo22758d(view, this.f15923n, this.f15922m);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    protected void m22756h() {
        Cursor cursor;
        if (this.f15921l && (cursor = this.f15922m) != null && !cursor.isClosed()) {
            this.f15920k = this.f15922m.requery();
        }
    }

    /* renamed from: i */
    public Cursor m22755i(Cursor cursor) {
        Cursor cursor2 = this.f15922m;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0228a aVar = this.f15925p;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f15926q;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f15922m = cursor;
        if (cursor != null) {
            C0228a aVar2 = this.f15925p;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f15926q;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f15924o = cursor.getColumnIndexOrThrow("_id");
            this.f15920k = true;
            notifyDataSetChanged();
        } else {
            this.f15924o = -1;
            this.f15920k = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
