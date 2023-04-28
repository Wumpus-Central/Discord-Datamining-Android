package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC1509a;
import androidx.appcompat.view.menu.AbstractC1584j;
import p052d.C6385g;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
class DialogInterface$OnKeyListenerC1578f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, AbstractC1584j.AbstractC1585a {

    /* renamed from: k */
    private C1575e f1016k;

    /* renamed from: l */
    private DialogInterfaceC1509a f1017l;

    /* renamed from: m */
    C1572c f1018m;

    /* renamed from: n */
    private AbstractC1584j.AbstractC1585a f1019n;

    public DialogInterface$OnKeyListenerC1578f(C1575e eVar) {
        this.f1016k = eVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
    /* renamed from: a */
    public void mo40291a(C1575e eVar, boolean z) {
        if (z || eVar == this.f1016k) {
            m40626c();
        }
        AbstractC1584j.AbstractC1585a aVar = this.f1019n;
        if (aVar != null) {
            aVar.mo40291a(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1584j.AbstractC1585a
    /* renamed from: b */
    public boolean mo40290b(C1575e eVar) {
        AbstractC1584j.AbstractC1585a aVar = this.f1019n;
        if (aVar != null) {
            return aVar.mo40290b(eVar);
        }
        return false;
    }

    /* renamed from: c */
    public void m40626c() {
        DialogInterfaceC1509a aVar = this.f1017l;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: d */
    public void m40625d(IBinder iBinder) {
        C1575e eVar = this.f1016k;
        DialogInterfaceC1509a.C0014a aVar = new DialogInterfaceC1509a.C0014a(eVar.m40632u());
        C1572c cVar = new C1572c(aVar.getContext(), C6385g.f13206j);
        this.f1018m = cVar;
        cVar.mo40579c(this);
        this.f1016k.m40650b(this.f1018m);
        aVar.m40916a(this.f1018m.m40681i(), this);
        View y = eVar.m40628y();
        if (y != null) {
            aVar.m40915b(y);
        } else {
            aVar.m40914c(eVar.m40630w()).setTitle(eVar.m40629x());
        }
        aVar.m40913d(this);
        DialogInterfaceC1509a create = aVar.create();
        this.f1017l = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1017l.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1017l.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1016k.m40666L((C1579g) this.f1018m.m40681i().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1018m.mo40314a(this.f1016k, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1017l.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1017l.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1016k.m40644e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1016k.performShortcut(i, keyEvent, 0);
    }
}
