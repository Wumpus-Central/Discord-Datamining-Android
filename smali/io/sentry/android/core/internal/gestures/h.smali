.class public final Lio/sentry/android/core/internal/gestures/h;
.super Lio/sentry/android/core/internal/gestures/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/internal/gestures/h$b;
    }
.end annotation


# instance fields
.field private final l:Landroid/view/Window$Callback;

.field private final m:Lio/sentry/android/core/internal/gestures/g;

.field private final n:Landroidx/core/view/GestureDetectorCompat;

.field private final o:Lio/sentry/o3;

.field private final p:Lio/sentry/android/core/internal/gestures/h$b;


# direct methods
.method public constructor <init>(Landroid/view/Window$Callback;Landroid/content/Context;Lio/sentry/android/core/internal/gestures/g;Lio/sentry/o3;)V
    .locals 6

    .line 1
    new-instance v2, Landroidx/core/view/GestureDetectorCompat;

    invoke-direct {v2, p2, p3}, Landroidx/core/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    new-instance v5, Lio/sentry/android/core/internal/gestures/h$a;

    invoke-direct {v5}, Lio/sentry/android/core/internal/gestures/h$a;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lio/sentry/android/core/internal/gestures/h;-><init>(Landroid/view/Window$Callback;Landroidx/core/view/GestureDetectorCompat;Lio/sentry/android/core/internal/gestures/g;Lio/sentry/o3;Lio/sentry/android/core/internal/gestures/h$b;)V

    return-void
.end method

.method constructor <init>(Landroid/view/Window$Callback;Landroidx/core/view/GestureDetectorCompat;Lio/sentry/android/core/internal/gestures/g;Lio/sentry/o3;Lio/sentry/android/core/internal/gestures/h$b;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/m;-><init>(Landroid/view/Window$Callback;)V

    .line 3
    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/h;->l:Landroid/view/Window$Callback;

    .line 4
    iput-object p3, p0, Lio/sentry/android/core/internal/gestures/h;->m:Lio/sentry/android/core/internal/gestures/g;

    .line 5
    iput-object p4, p0, Lio/sentry/android/core/internal/gestures/h;->o:Lio/sentry/o3;

    .line 6
    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/h;->n:Landroidx/core/view/GestureDetectorCompat;

    .line 7
    iput-object p5, p0, Lio/sentry/android/core/internal/gestures/h;->p:Lio/sentry/android/core/internal/gestures/h$b;

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->n:Landroidx/core/view/GestureDetectorCompat;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/view/GestureDetectorCompat;->a(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->m:Lio/sentry/android/core/internal/gestures/g;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lio/sentry/android/core/internal/gestures/g;->q(Landroid/view/MotionEvent;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public a()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->l:Landroid/view/Window$Callback;

    return-object v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->m:Lio/sentry/android/core/internal/gestures/g;

    sget-object v1, Lio/sentry/f4;->CANCELLED:Lio/sentry/f4;

    invoke-virtual {v0, v1}, Lio/sentry/android/core/internal/gestures/g;->s(Lio/sentry/f4;)V

    return-void
.end method

.method public bridge synthetic dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->p:Lio/sentry/android/core/internal/gestures/h$b;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/sentry/android/core/internal/gestures/h$b;->a(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-direct {p0, v0}, Lio/sentry/android/core/internal/gestures/h;->b(Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    :try_start_1
    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/h;->o:Lio/sentry/o3;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/h;->o:Lio/sentry/o3;

    .line 22
    .line 23
    invoke-virtual {v2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 28
    .line 29
    const-string v4, "Error dispatching touch event"

    .line 30
    .line 31
    invoke-interface {v2, v3, v4, v1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_1
    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public bridge synthetic dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onActionModeFinished(Landroid/view/ActionMode;)V

    return-void
.end method

.method public bridge synthetic onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onActionModeStarted(Landroid/view/ActionMode;)V

    return-void
.end method

.method public bridge synthetic onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Lio/sentry/android/core/internal/gestures/m;->onAttachedToWindow()V

    return-void
.end method

.method public bridge synthetic onContentChanged()V
    .locals 0

    invoke-super {p0}, Lio/sentry/android/core/internal/gestures/m;->onContentChanged()V

    return-void
.end method

.method public bridge synthetic onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/m;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onCreatePanelView(I)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Lio/sentry/android/core/internal/gestures/m;->onDetachedFromWindow()V

    return-void
.end method

.method public bridge synthetic onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/m;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/m;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/m;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public bridge synthetic onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lio/sentry/android/core/internal/gestures/m;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onSearchRequested()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lio/sentry/android/core/internal/gestures/m;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onSearchRequested(Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public bridge synthetic onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onWindowFocusChanged(Z)V

    return-void
.end method

.method public bridge synthetic onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/sentry/android/core/internal/gestures/m;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, Lio/sentry/android/core/internal/gestures/m;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
