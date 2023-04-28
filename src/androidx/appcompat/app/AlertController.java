package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C1733v0;
import androidx.core.view.C2733w0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p052d.C6379a;
import p052d.C6384f;
import p052d.C6388j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f35091A;

    /* renamed from: C */
    private Drawable f35093C;

    /* renamed from: D */
    private ImageView f35094D;

    /* renamed from: E */
    private TextView f35095E;

    /* renamed from: F */
    private TextView f35096F;

    /* renamed from: G */
    private View f35097G;

    /* renamed from: H */
    ListAdapter f35098H;

    /* renamed from: J */
    private int f35100J;

    /* renamed from: K */
    private int f35101K;

    /* renamed from: L */
    int f35102L;

    /* renamed from: M */
    int f35103M;

    /* renamed from: N */
    int f35104N;

    /* renamed from: O */
    int f35105O;

    /* renamed from: P */
    private boolean f35106P;

    /* renamed from: R */
    Handler f35108R;

    /* renamed from: a */
    private final Context f659a;

    /* renamed from: b */
    final DialogC1541j f660b;

    /* renamed from: c */
    private final Window f661c;

    /* renamed from: d */
    private final int f662d;

    /* renamed from: e */
    private CharSequence f663e;

    /* renamed from: f */
    private CharSequence f664f;

    /* renamed from: g */
    ListView f665g;

    /* renamed from: h */
    private View f666h;

    /* renamed from: i */
    private int f667i;

    /* renamed from: j */
    private int f668j;

    /* renamed from: k */
    private int f669k;

    /* renamed from: l */
    private int f670l;

    /* renamed from: m */
    private int f671m;

    /* renamed from: o */
    Button f673o;

    /* renamed from: p */
    private CharSequence f674p;

    /* renamed from: q */
    Message f675q;

    /* renamed from: r */
    private Drawable f676r;

    /* renamed from: s */
    Button f677s;

    /* renamed from: t */
    private CharSequence f678t;

    /* renamed from: u */
    Message f679u;

    /* renamed from: v */
    private Drawable f680v;

    /* renamed from: w */
    Button f681w;

    /* renamed from: x */
    private CharSequence f682x;

    /* renamed from: y */
    Message f683y;

    /* renamed from: z */
    private Drawable f684z;

    /* renamed from: n */
    private boolean f672n = false;

    /* renamed from: B */
    private int f35092B = 0;

    /* renamed from: I */
    int f35099I = -1;

    /* renamed from: Q */
    private int f35107Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f35109S = new View$OnClickListenerC1502a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: k */
        private final int f685k;

        /* renamed from: l */
        private final int f686l;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f13248c2);
            this.f686l = obtainStyledAttributes.getDimensionPixelOffset(C6388j.f13253d2, -1);
            this.f685k = obtainStyledAttributes.getDimensionPixelOffset(C6388j.f13258e2, -1);
        }

        /* renamed from: a */
        public void m40929a(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f685k;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f686l;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1502a implements View.OnClickListener {
        View$OnClickListenerC1502a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f673o && (message4 = alertController.f675q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f677s && (message3 = alertController.f679u) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f681w || (message2 = alertController.f683y) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f35108R.obtainMessage(1, alertController2.f660b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public static class C1503b {

        /* renamed from: A */
        public int f35110A;

        /* renamed from: B */
        public int f35111B;

        /* renamed from: C */
        public int f35112C;

        /* renamed from: D */
        public int f35113D;

        /* renamed from: F */
        public boolean[] f35115F;

        /* renamed from: G */
        public boolean f35116G;

        /* renamed from: H */
        public boolean f35117H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f35119J;

        /* renamed from: K */
        public Cursor f35120K;

        /* renamed from: L */
        public String f35121L;

        /* renamed from: M */
        public String f35122M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f35123N;

        /* renamed from: a */
        public final Context f688a;

        /* renamed from: b */
        public final LayoutInflater f689b;

        /* renamed from: d */
        public Drawable f691d;

        /* renamed from: f */
        public CharSequence f693f;

        /* renamed from: g */
        public View f694g;

        /* renamed from: h */
        public CharSequence f695h;

        /* renamed from: i */
        public CharSequence f696i;

        /* renamed from: j */
        public Drawable f697j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f698k;

        /* renamed from: l */
        public CharSequence f699l;

        /* renamed from: m */
        public Drawable f700m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f701n;

        /* renamed from: o */
        public CharSequence f702o;

        /* renamed from: p */
        public Drawable f703p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f704q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f706s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f707t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f708u;

        /* renamed from: v */
        public CharSequence[] f709v;

        /* renamed from: w */
        public ListAdapter f710w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f711x;

        /* renamed from: y */
        public int f712y;

        /* renamed from: z */
        public View f713z;

        /* renamed from: c */
        public int f690c = 0;

        /* renamed from: e */
        public int f692e = 0;

        /* renamed from: E */
        public boolean f35114E = false;

        /* renamed from: I */
        public int f35118I = -1;

        /* renamed from: O */
        public boolean f35124O = true;

        /* renamed from: r */
        public boolean f705r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        /* loaded from: classes.dex */
        public class C1504a extends ArrayAdapter<CharSequence> {

            /* renamed from: k */
            final /* synthetic */ RecycleListView f714k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1504a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f714k = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C1503b.this.f35115F;
                if (zArr != null && zArr[i]) {
                    this.f714k.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        /* loaded from: classes.dex */
        public class C0013b extends CursorAdapter {

            /* renamed from: k */
            private final int f716k;

            /* renamed from: l */
            private final int f717l;

            /* renamed from: m */
            final /* synthetic */ RecycleListView f718m;

            /* renamed from: n */
            final /* synthetic */ AlertController f719n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0013b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f718m = recycleListView;
                this.f719n = alertController;
                Cursor cursor2 = getCursor();
                this.f716k = cursor2.getColumnIndexOrThrow(C1503b.this.f35121L);
                this.f717l = cursor2.getColumnIndexOrThrow(C1503b.this.f35122M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f716k));
                RecycleListView recycleListView = this.f718m;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f717l) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C1503b.this.f689b.inflate(this.f719n.f35103M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        /* loaded from: classes.dex */
        public class C1505c implements AdapterView.OnItemClickListener {

            /* renamed from: k */
            final /* synthetic */ AlertController f721k;

            C1505c(AlertController alertController) {
                this.f721k = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C1503b.this.f711x.onClick(this.f721k.f660b, i);
                if (!C1503b.this.f35117H) {
                    this.f721k.f660b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        /* loaded from: classes.dex */
        public class C1506d implements AdapterView.OnItemClickListener {

            /* renamed from: k */
            final /* synthetic */ RecycleListView f723k;

            /* renamed from: l */
            final /* synthetic */ AlertController f724l;

            C1506d(RecycleListView recycleListView, AlertController alertController) {
                this.f723k = recycleListView;
                this.f724l = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C1503b.this.f35115F;
                if (zArr != null) {
                    zArr[i] = this.f723k.isItemChecked(i);
                }
                C1503b.this.f35119J.onClick(this.f724l.f660b, i, this.f723k.isItemChecked(i));
            }
        }

        public C1503b(Context context) {
            this.f688a = context;
            this.f689b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m40927b(AlertController alertController) {
            ListAdapter listAdapter;
            int i;
            RecycleListView recycleListView = (RecycleListView) this.f689b.inflate(alertController.f35102L, (ViewGroup) null);
            if (!this.f35116G) {
                if (this.f35117H) {
                    i = alertController.f35104N;
                } else {
                    i = alertController.f35105O;
                }
                if (this.f35120K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f688a, i, this.f35120K, new String[]{this.f35121L}, new int[]{16908308});
                } else {
                    listAdapter = this.f710w;
                    if (listAdapter == null) {
                        listAdapter = new C1508d(this.f688a, i, 16908308, this.f709v);
                    }
                }
            } else if (this.f35120K == null) {
                listAdapter = new C1504a(this.f688a, alertController.f35103M, 16908308, this.f709v, recycleListView);
            } else {
                listAdapter = new C0013b(this.f688a, this.f35120K, false, recycleListView, alertController);
            }
            alertController.f35098H = listAdapter;
            alertController.f35099I = this.f35118I;
            if (this.f711x != null) {
                recycleListView.setOnItemClickListener(new C1505c(alertController));
            } else if (this.f35119J != null) {
                recycleListView.setOnItemClickListener(new C1506d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f35123N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f35117H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f35116G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f665g = recycleListView;
        }

        /* renamed from: a */
        public void m40928a(AlertController alertController) {
            View view = this.f694g;
            if (view != null) {
                alertController.m40944k(view);
            } else {
                CharSequence charSequence = this.f693f;
                if (charSequence != null) {
                    alertController.m40939p(charSequence);
                }
                Drawable drawable = this.f691d;
                if (drawable != null) {
                    alertController.m40942m(drawable);
                }
                int i = this.f690c;
                if (i != 0) {
                    alertController.m40943l(i);
                }
                int i2 = this.f692e;
                if (i2 != 0) {
                    alertController.m40943l(alertController.m40952c(i2));
                }
            }
            CharSequence charSequence2 = this.f695h;
            if (charSequence2 != null) {
                alertController.m40941n(charSequence2);
            }
            CharSequence charSequence3 = this.f696i;
            if (!(charSequence3 == null && this.f697j == null)) {
                alertController.m40945j(-1, charSequence3, this.f698k, null, this.f697j);
            }
            CharSequence charSequence4 = this.f699l;
            if (!(charSequence4 == null && this.f700m == null)) {
                alertController.m40945j(-2, charSequence4, this.f701n, null, this.f700m);
            }
            CharSequence charSequence5 = this.f702o;
            if (!(charSequence5 == null && this.f703p == null)) {
                alertController.m40945j(-3, charSequence5, this.f704q, null, this.f703p);
            }
            if (!(this.f709v == null && this.f35120K == null && this.f710w == null)) {
                m40927b(alertController);
            }
            View view2 = this.f713z;
            if (view2 == null) {
                int i3 = this.f712y;
                if (i3 != 0) {
                    alertController.m40938q(i3);
                }
            } else if (this.f35114E) {
                alertController.m40936s(view2, this.f35110A, this.f35111B, this.f35112C, this.f35113D);
            } else {
                alertController.m40937r(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    private static final class HandlerC1507c extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f726a;

        public HandlerC1507c(DialogInterface dialogInterface) {
            this.f726a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f726a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public static class C1508d extends ArrayAdapter<CharSequence> {
        public C1508d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC1541j jVar, Window window) {
        this.f659a = context;
        this.f660b = jVar;
        this.f661c = window;
        this.f35108R = new HandlerC1507c(jVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C6388j.f37810F, C6379a.f13108n, 0);
        this.f35100J = obtainStyledAttributes.getResourceId(C6388j.f37815G, 0);
        this.f35101K = obtainStyledAttributes.getResourceId(C6388j.f37825I, 0);
        this.f35102L = obtainStyledAttributes.getResourceId(C6388j.f37835K, 0);
        this.f35103M = obtainStyledAttributes.getResourceId(C6388j.f37840L, 0);
        this.f35104N = obtainStyledAttributes.getResourceId(C6388j.f37850N, 0);
        this.f35105O = obtainStyledAttributes.getResourceId(C6388j.f37830J, 0);
        this.f35106P = obtainStyledAttributes.getBoolean(C6388j.f37845M, true);
        this.f662d = obtainStyledAttributes.getDimensionPixelSize(C6388j.f37820H, 0);
        obtainStyledAttributes.recycle();
        jVar.m40801d(1);
    }

    /* renamed from: a */
    static boolean m40954a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m40954a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m40953b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    private ViewGroup m40947h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: i */
    private int m40946i() {
        int i = this.f35101K;
        if (i == 0) {
            return this.f35100J;
        }
        if (this.f35107Q == 1) {
            return i;
        }
        return this.f35100J;
    }

    /* renamed from: o */
    private void m40940o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f661c.findViewById(C6384f.f13192v);
        View findViewById2 = this.f661c.findViewById(C6384f.f13191u);
        C2733w0.m37050H0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: t */
    private void m40935t(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f673o = button;
        button.setOnClickListener(this.f35109S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f674p) || this.f676r != null) {
            this.f673o.setText(this.f674p);
            Drawable drawable = this.f676r;
            if (drawable != null) {
                int i = this.f662d;
                drawable.setBounds(0, 0, i, i);
                this.f673o.setCompoundDrawables(this.f676r, null, null, null);
            }
            this.f673o.setVisibility(0);
            z = true;
        } else {
            this.f673o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f677s = button2;
        button2.setOnClickListener(this.f35109S);
        if (!TextUtils.isEmpty(this.f678t) || this.f680v != null) {
            this.f677s.setText(this.f678t);
            Drawable drawable2 = this.f680v;
            if (drawable2 != null) {
                int i2 = this.f662d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f677s.setCompoundDrawables(this.f680v, null, null, null);
            }
            this.f677s.setVisibility(0);
            z |= true;
        } else {
            this.f677s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f681w = button3;
        button3.setOnClickListener(this.f35109S);
        if (!TextUtils.isEmpty(this.f682x) || this.f684z != null) {
            this.f681w.setText(this.f682x);
            Drawable drawable3 = this.f684z;
            if (drawable3 != null) {
                int i3 = this.f662d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f681w.setCompoundDrawables(this.f684z, null, null, null);
            }
            this.f681w.setVisibility(0);
            z |= true;
        } else {
            this.f681w.setVisibility(8);
        }
        if (m40930y(this.f659a)) {
            if (z) {
                m40953b(this.f673o);
            } else if (z) {
                m40953b(this.f677s);
            } else if (z) {
                m40953b(this.f681w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: u */
    private void m40934u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f661c.findViewById(C6384f.f13193w);
        this.f35091A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f35091A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f35096F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f664f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f35091A.removeView(this.f35096F);
            if (this.f665g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f35091A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f35091A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f665g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m40933v(ViewGroup viewGroup) {
        View view = this.f666h;
        boolean z = false;
        if (view == null) {
            if (this.f667i != 0) {
                view = LayoutInflater.from(this.f659a).inflate(this.f667i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m40954a(view)) {
            this.f661c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f661c.findViewById(C6384f.f13184n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f672n) {
                frameLayout.setPadding(this.f668j, this.f669k, this.f670l, this.f671m);
            }
            if (this.f665g != null) {
                ((LinearLayout.LayoutParams) ((C1733v0.C1734a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m40932w(ViewGroup viewGroup) {
        if (this.f35097G != null) {
            viewGroup.addView(this.f35097G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f661c.findViewById(C6384f.f37783O).setVisibility(8);
            return;
        }
        this.f35094D = (ImageView) this.f661c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f663e)) || !this.f35106P) {
            this.f661c.findViewById(C6384f.f37783O).setVisibility(8);
            this.f35094D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f661c.findViewById(C6384f.f13180j);
        this.f35095E = textView;
        textView.setText(this.f663e);
        int i = this.f35092B;
        if (i != 0) {
            this.f35094D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f35093C;
        if (drawable != null) {
            this.f35094D.setImageDrawable(drawable);
            return;
        }
        this.f35095E.setPadding(this.f35094D.getPaddingLeft(), this.f35094D.getPaddingTop(), this.f35094D.getPaddingRight(), this.f35094D.getPaddingBottom());
        this.f35094D.setVisibility(8);
    }

    /* renamed from: x */
    private void m40931x() {
        Object[] objArr;
        boolean z;
        boolean z2;
        ListAdapter listAdapter;
        View findViewById;
        View view;
        View findViewById2;
        View findViewById3 = this.f661c.findViewById(C6384f.f13190t);
        int i = C6384f.f37784P;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C6384f.f13183m;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C6384f.f13181k;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C6384f.f13185o);
        m40933v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup h = m40947h(findViewById7, findViewById4);
        ViewGroup h2 = m40947h(findViewById8, findViewById5);
        ViewGroup h3 = m40947h(findViewById9, findViewById6);
        m40934u(h2);
        m40935t(h3);
        m40932w(h);
        int i4 = 0;
        if (viewGroup.getVisibility() != 8) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (h == null || h.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (h3 == null || h3.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(z2 || h2 == null || (findViewById2 = h2.findViewById(C6384f.f37779K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z) {
            NestedScrollView nestedScrollView = this.f35091A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f664f == null && this.f665g == null) {
                view = null;
            } else {
                view = h.findViewById(C6384f.f37782N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(h2 == null || (findViewById = h2.findViewById(C6384f.f37780L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f665g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m40929a(z, z2);
        }
        if (objArr == null) {
            View view2 = this.f665g;
            if (view2 == null) {
                view2 = this.f35091A;
            }
            if (view2 != null) {
                if (z2) {
                    i4 = 2;
                }
                int i5 = z ? 1 : 0;
                char c = z ? 1 : 0;
                char c2 = z ? 1 : 0;
                m40940o(h2, view2, i5 | i4, 3);
            }
        }
        ListView listView2 = this.f665g;
        if (listView2 != null && (listAdapter = this.f35098H) != null) {
            listView2.setAdapter(listAdapter);
            int i6 = this.f35099I;
            if (i6 > -1) {
                listView2.setItemChecked(i6, true);
                listView2.setSelection(i6);
            }
        }
    }

    /* renamed from: y */
    private static boolean m40930y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6379a.f13107m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m40952c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f659a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m40951d() {
        return this.f665g;
    }

    /* renamed from: e */
    public void m40950e() {
        this.f660b.setContentView(m40946i());
        m40931x();
    }

    /* renamed from: f */
    public boolean m40949f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f35091A;
        return nestedScrollView != null && nestedScrollView.m36789l(keyEvent);
    }

    /* renamed from: g */
    public boolean m40948g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f35091A;
        return nestedScrollView != null && nestedScrollView.m36789l(keyEvent);
    }

    /* renamed from: j */
    public void m40945j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f35108R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f682x = charSequence;
            this.f683y = message;
            this.f684z = drawable;
        } else if (i == -2) {
            this.f678t = charSequence;
            this.f679u = message;
            this.f680v = drawable;
        } else if (i == -1) {
            this.f674p = charSequence;
            this.f675q = message;
            this.f676r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: k */
    public void m40944k(View view) {
        this.f35097G = view;
    }

    /* renamed from: l */
    public void m40943l(int i) {
        this.f35093C = null;
        this.f35092B = i;
        ImageView imageView = this.f35094D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f35094D.setImageResource(this.f35092B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: m */
    public void m40942m(Drawable drawable) {
        this.f35093C = drawable;
        this.f35092B = 0;
        ImageView imageView = this.f35094D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f35094D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void m40941n(CharSequence charSequence) {
        this.f664f = charSequence;
        TextView textView = this.f35096F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public void m40939p(CharSequence charSequence) {
        this.f663e = charSequence;
        TextView textView = this.f35095E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m40938q(int i) {
        this.f666h = null;
        this.f667i = i;
        this.f672n = false;
    }

    /* renamed from: r */
    public void m40937r(View view) {
        this.f666h = view;
        this.f667i = 0;
        this.f672n = false;
    }

    /* renamed from: s */
    public void m40936s(View view, int i, int i2, int i3, int i4) {
        this.f666h = view;
        this.f667i = 0;
        this.f672n = true;
        this.f668j = i;
        this.f669k = i2;
        this.f670l = i3;
        this.f671m = i4;
    }
}
