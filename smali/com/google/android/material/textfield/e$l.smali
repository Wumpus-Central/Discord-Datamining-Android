.class Lcom/google/android/material/textfield/e$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/e;->L(Landroid/widget/AutoCompleteTextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/widget/AutoCompleteTextView;

.field final synthetic l:Lcom/google/android/material/textfield/e;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/e$l;->l:Lcom/google/android/material/textfield/e;

    iput-object p2, p0, Lcom/google/android/material/textfield/e$l;->k:Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x1

    .line 6
    const/4 v0, 0x0

    .line 7
    if-ne p1, p2, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/textfield/e$l;->l:Lcom/google/android/material/textfield/e;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/android/material/textfield/e;->n(Lcom/google/android/material/textfield/e;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/material/textfield/e$l;->l:Lcom/google/android/material/textfield/e;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/google/android/material/textfield/e;->s(Lcom/google/android/material/textfield/e;Z)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/textfield/e$l;->l:Lcom/google/android/material/textfield/e;

    .line 23
    .line 24
    iget-object p2, p0, Lcom/google/android/material/textfield/e$l;->k:Landroid/widget/AutoCompleteTextView;

    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/google/android/material/textfield/e;->t(Lcom/google/android/material/textfield/e;Landroid/widget/AutoCompleteTextView;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/material/textfield/e$l;->l:Lcom/google/android/material/textfield/e;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/google/android/material/textfield/e;->u(Lcom/google/android/material/textfield/e;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
