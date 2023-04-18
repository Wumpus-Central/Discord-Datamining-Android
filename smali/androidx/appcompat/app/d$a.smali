.class Landroidx/appcompat/app/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/appcompat/app/d;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/d$a;->k:Landroidx/appcompat/app/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/d$a;->k:Landroidx/appcompat/app/d;

    .line 2
    .line 3
    iget v1, v0, Landroidx/appcompat/app/d;->e0:I

    .line 4
    .line 5
    and-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/d;->Y(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/d$a;->k:Landroidx/appcompat/app/d;

    .line 14
    .line 15
    iget v1, v0, Landroidx/appcompat/app/d;->e0:I

    .line 16
    .line 17
    and-int/lit16 v1, v1, 0x1000

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/16 v1, 0x6c

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/d;->Y(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/d$a;->k:Landroidx/appcompat/app/d;

    .line 27
    .line 28
    iput-boolean v2, v0, Landroidx/appcompat/app/d;->d0:Z

    .line 29
    .line 30
    iput v2, v0, Landroidx/appcompat/app/d;->e0:I

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
