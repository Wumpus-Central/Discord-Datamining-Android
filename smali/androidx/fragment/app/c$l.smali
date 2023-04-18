.class Landroidx/fragment/app/c$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/s$e;

.field private final b:Landroidx/core/os/e;


# direct methods
.method constructor <init>(Landroidx/fragment/app/s$e;Landroidx/core/os/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/c$l;->a:Landroidx/fragment/app/s$e;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/c$l;->b:Landroidx/core/os/e;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/c$l;->a:Landroidx/fragment/app/s$e;

    iget-object v1, p0, Landroidx/fragment/app/c$l;->b:Landroidx/core/os/e;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/s$e;->d(Landroidx/core/os/e;)V

    return-void
.end method

.method b()Landroidx/fragment/app/s$e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/c$l;->a:Landroidx/fragment/app/s$e;

    return-object v0
.end method

.method c()Landroidx/core/os/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/c$l;->b:Landroidx/core/os/e;

    return-object v0
.end method

.method d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/c$l;->a:Landroidx/fragment/app/s$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/s$e;->f()Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/fragment/app/s$e$c;->c(Landroid/view/View;)Landroidx/fragment/app/s$e$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Landroidx/fragment/app/c$l;->a:Landroidx/fragment/app/s$e;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/fragment/app/s$e;->e()Landroidx/fragment/app/s$e$c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    sget-object v2, Landroidx/fragment/app/s$e$c;->l:Landroidx/fragment/app/s$e$c;

    .line 22
    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    if-eq v1, v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    :goto_1
    return v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
