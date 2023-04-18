.class final Lrd/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/m$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lrd/m$a;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lrd/m;->a:I

    .line 6
    .line 7
    sget-object v0, Lrd/m$a;->k:Lrd/m$a;

    .line 8
    .line 9
    iput-object v0, p0, Lrd/m;->b:Lrd/m$a;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lrd/m;->a:I

    return v0
.end method

.method b(I)V
    .locals 1

    iget v0, p0, Lrd/m;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Lrd/m;->a:I

    return-void
.end method

.method c()Z
    .locals 2

    iget-object v0, p0, Lrd/m;->b:Lrd/m$a;

    sget-object v1, Lrd/m$a;->l:Lrd/m$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method d()Z
    .locals 2

    iget-object v0, p0, Lrd/m;->b:Lrd/m$a;

    sget-object v1, Lrd/m$a;->m:Lrd/m$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method e()V
    .locals 1

    sget-object v0, Lrd/m$a;->l:Lrd/m$a;

    iput-object v0, p0, Lrd/m;->b:Lrd/m$a;

    return-void
.end method

.method f()V
    .locals 1

    sget-object v0, Lrd/m$a;->m:Lrd/m$a;

    iput-object v0, p0, Lrd/m;->b:Lrd/m$a;

    return-void
.end method

.method g()V
    .locals 1

    sget-object v0, Lrd/m$a;->k:Lrd/m$a;

    iput-object v0, p0, Lrd/m;->b:Lrd/m$a;

    return-void
.end method

.method h(I)V
    .locals 0

    iput p1, p0, Lrd/m;->a:I

    return-void
.end method
