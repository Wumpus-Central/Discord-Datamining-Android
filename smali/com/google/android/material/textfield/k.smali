.class Lcom/google/android/material/textfield/k;
.super Lcom/google/android/material/textfield/f;
.source "SourceFile"


# instance fields
.field private final e:Landroid/text/TextWatcher;

.field private final f:Lcom/google/android/material/textfield/TextInputLayout$f;

.field private final g:Lcom/google/android/material/textfield/TextInputLayout$g;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/textfield/f;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/google/android/material/textfield/k$a;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/k$a;-><init>(Lcom/google/android/material/textfield/k;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/material/textfield/k;->e:Landroid/text/TextWatcher;

    .line 10
    .line 11
    new-instance p1, Lcom/google/android/material/textfield/k$b;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/k$b;-><init>(Lcom/google/android/material/textfield/k;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/material/textfield/k;->f:Lcom/google/android/material/textfield/TextInputLayout$f;

    .line 17
    .line 18
    new-instance p1, Lcom/google/android/material/textfield/k$c;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/k$c;-><init>(Lcom/google/android/material/textfield/k;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/material/textfield/k;->g:Lcom/google/android/material/textfield/TextInputLayout$g;

    .line 24
    .line 25
    return-void
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
.end method

.method static synthetic e(Lcom/google/android/material/textfield/k;)Z
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/textfield/k;->g()Z

    move-result p0

    return p0
.end method

.method static synthetic f(Lcom/google/android/material/textfield/k;)Landroid/text/TextWatcher;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/textfield/k;->e:Landroid/text/TextWatcher;

    return-object p0
.end method

.method private g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static h(Landroid/widget/EditText;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x80

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x90

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/16 v0, 0xe0

    .line 32
    .line 33
    if-ne p0, v0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    :goto_0
    return p0
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


# virtual methods
.method a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/textfield/f;->d:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget v1, Ldb/e;->a:I

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget v2, Ldb/i;->p:I

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconCheckable(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 39
    .line 40
    new-instance v1, Lcom/google/android/material/textfield/k$d;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/k$d;-><init>(Lcom/google/android/material/textfield/k;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/google/android/material/textfield/k;->f:Lcom/google/android/material/textfield/TextInputLayout$f;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->g(Lcom/google/android/material/textfield/TextInputLayout$f;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/google/android/material/textfield/k;->g:Lcom/google/android/material/textfield/TextInputLayout$g;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->h(Lcom/google/android/material/textfield/TextInputLayout$g;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/google/android/material/textfield/f;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lcom/google/android/material/textfield/k;->h(Landroid/widget/EditText;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method