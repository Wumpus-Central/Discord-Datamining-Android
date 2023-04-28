package p111g1;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: g1.b */
/* loaded from: classes.dex */
class C7391b extends Filter {

    /* renamed from: a */
    AbstractC7392a f15930a;

    /* renamed from: g1.b$a */
    /* loaded from: classes.dex */
    interface AbstractC7392a {
        /* renamed from: a */
        void mo22754a(Cursor cursor);

        /* renamed from: b */
        Cursor mo22753b(CharSequence charSequence);

        /* renamed from: c */
        Cursor mo22752c();

        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7391b(AbstractC7392a aVar) {
        this.f15930a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f15930a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor b = this.f15930a.mo22753b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (b != null) {
            filterResults.count = b.getCount();
            filterResults.values = b;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c = this.f15930a.mo22752c();
        Object obj = filterResults.values;
        if (obj != null && obj != c) {
            this.f15930a.mo22754a((Cursor) obj);
        }
    }
}
