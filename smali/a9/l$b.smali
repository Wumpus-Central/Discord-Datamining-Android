.class public La9/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field e:Z

.field f:I


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    move-result-object v0

    iput-object v0, p0, La9/l$b;->a:Lbc/i0;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, La9/l$b;->b:I

    .line 6
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    move-result-object v1

    iput-object v1, p0, La9/l$b;->c:Lbc/i0;

    .line 7
    iput v0, p0, La9/l$b;->d:I

    .line 8
    iput-boolean v0, p0, La9/l$b;->e:Z

    .line 9
    iput v0, p0, La9/l$b;->f:I

    return-void
.end method

.method constructor <init>(La9/l;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iget-object v0, p1, La9/l;->k:Lbc/i0;

    iput-object v0, p0, La9/l$b;->a:Lbc/i0;

    .line 12
    iget v0, p1, La9/l;->l:I

    iput v0, p0, La9/l$b;->b:I

    .line 13
    iget-object v0, p1, La9/l;->m:Lbc/i0;

    iput-object v0, p0, La9/l$b;->c:Lbc/i0;

    .line 14
    iget v0, p1, La9/l;->n:I

    iput v0, p0, La9/l$b;->d:I

    .line 15
    iget-boolean v0, p1, La9/l;->o:Z

    iput-boolean v0, p0, La9/l$b;->e:Z

    .line 16
    iget p1, p1, La9/l;->p:I

    iput p1, p0, La9/l$b;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La9/l$b;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, La9/l$b;->b(Landroid/content/Context;)La9/l$b;

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string v0, "captioning"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/16 v0, 0x440

    .line 32
    .line 33
    iput v0, p0, La9/l$b;->d:I

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-static {p1}, Lf9/q0;->U(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lbc/i0;->y(Ljava/lang/Object;)Lbc/i0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, La9/l$b;->c:Lbc/i0;

    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method


# virtual methods
.method public a()La9/l;
    .locals 8

    new-instance v7, La9/l;

    iget-object v1, p0, La9/l$b;->a:Lbc/i0;

    iget v2, p0, La9/l$b;->b:I

    iget-object v3, p0, La9/l$b;->c:Lbc/i0;

    iget v4, p0, La9/l$b;->d:I

    iget-boolean v5, p0, La9/l$b;->e:Z

    iget v6, p0, La9/l$b;->f:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, La9/l;-><init>(Lbc/i0;ILbc/i0;IZI)V

    return-object v7
.end method

.method public b(Landroid/content/Context;)La9/l$b;
    .locals 2

    .line 1
    sget v0, Lf9/q0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, La9/l$b;->c(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
