.class Lcom/google/android/material/textfield/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/e$a;->afterTextChanged(Landroid/text/Editable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/widget/AutoCompleteTextView;

.field final synthetic l:Lcom/google/android/material/textfield/e$a;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/e$a;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/e$a$a;->l:Lcom/google/android/material/textfield/e$a;

    iput-object p2, p0, Lcom/google/android/material/textfield/e$a$a;->k:Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/e$a$a;->k:Landroid/widget/AutoCompleteTextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/textfield/e$a$a;->l:Lcom/google/android/material/textfield/e$a;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/google/android/material/textfield/e$a;->k:Lcom/google/android/material/textfield/e;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lcom/google/android/material/textfield/e;->r(Lcom/google/android/material/textfield/e;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/material/textfield/e$a$a;->l:Lcom/google/android/material/textfield/e$a;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/google/android/material/textfield/e$a;->k:Lcom/google/android/material/textfield/e;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/google/android/material/textfield/e;->s(Lcom/google/android/material/textfield/e;Z)Z

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method
