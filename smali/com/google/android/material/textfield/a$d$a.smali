.class Lcom/google/android/material/textfield/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/a$d;->a(Lcom/google/android/material/textfield/TextInputLayout;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/widget/EditText;

.field final synthetic l:Lcom/google/android/material/textfield/a$d;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/a$d;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/a$d$a;->l:Lcom/google/android/material/textfield/a$d;

    iput-object p2, p0, Lcom/google/android/material/textfield/a$d$a;->k:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/a$d$a;->k:Landroid/widget/EditText;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/textfield/a$d$a;->l:Lcom/google/android/material/textfield/a$d;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/google/android/material/textfield/a$d;->a:Lcom/google/android/material/textfield/a;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/google/android/material/textfield/a;->h(Lcom/google/android/material/textfield/a;)Landroid/text/TextWatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/material/textfield/a$d$a;->l:Lcom/google/android/material/textfield/a$d;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/material/textfield/a$d;->a:Lcom/google/android/material/textfield/a;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-static {v0, v1}, Lcom/google/android/material/textfield/a;->f(Lcom/google/android/material/textfield/a;Z)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method
