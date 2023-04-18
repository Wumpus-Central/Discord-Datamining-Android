.class Lcom/google/android/material/textfield/k$a;
.super Lcom/google/android/material/internal/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/google/android/material/textfield/k;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/k$a;->k:Lcom/google/android/material/textfield/k;

    invoke-direct {p0}, Lcom/google/android/material/internal/l;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/material/textfield/k$a;->k:Lcom/google/android/material/textfield/k;

    iget-object p2, p1, Lcom/google/android/material/textfield/f;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {p1}, Lcom/google/android/material/textfield/k;->e(Lcom/google/android/material/textfield/k;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    return-void
.end method
