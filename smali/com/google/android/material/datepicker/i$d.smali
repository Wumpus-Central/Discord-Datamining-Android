.class Lcom/google/android/material/datepicker/i$d;
.super Lcom/google/android/material/datepicker/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/i;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/datepicker/o<",
        "TS;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/datepicker/i;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/i$d;->a:Lcom/google/android/material/datepicker/i;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/i$d;->a:Lcom/google/android/material/datepicker/i;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/material/datepicker/i;->f(Lcom/google/android/material/datepicker/i;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/datepicker/i$d;->a:Lcom/google/android/material/datepicker/i;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/android/material/datepicker/i;->h(Lcom/google/android/material/datepicker/i;)Landroid/widget/Button;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/google/android/material/datepicker/i$d;->a:Lcom/google/android/material/datepicker/i;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/material/datepicker/i;->g(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lcom/google/android/material/datepicker/d;->F()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
.end method
