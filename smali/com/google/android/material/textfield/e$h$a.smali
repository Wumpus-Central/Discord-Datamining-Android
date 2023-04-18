.class Lcom/google/android/material/textfield/e$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/e$h;->a(Lcom/google/android/material/textfield/TextInputLayout;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/widget/AutoCompleteTextView;

.field final synthetic l:Lcom/google/android/material/textfield/e$h;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/e$h;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/e$h$a;->l:Lcom/google/android/material/textfield/e$h;

    iput-object p2, p0, Lcom/google/android/material/textfield/e$h$a;->k:Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/e$h$a;->k:Landroid/widget/AutoCompleteTextView;

    iget-object v1, p0, Lcom/google/android/material/textfield/e$h$a;->l:Lcom/google/android/material/textfield/e$h;

    iget-object v1, v1, Lcom/google/android/material/textfield/e$h;->a:Lcom/google/android/material/textfield/e;

    invoke-static {v1}, Lcom/google/android/material/textfield/e;->g(Lcom/google/android/material/textfield/e;)Landroid/text/TextWatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method
