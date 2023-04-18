.class public abstract Lnh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh/a$a;
    }
.end annotation


# instance fields
.field protected k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lnh/a;->k:I

    .line 6
    .line 7
    return-void
    .line 8
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
.end method


# virtual methods
.method b()Lnh/w;
    .locals 1

    new-instance v0, Lnh/w;

    invoke-direct {v0, p0}, Lnh/w;-><init>(Lnh/q;)V

    return-object v0
.end method

.method public f(Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lnh/q;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lnh/f;->v(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-static {v1}, Lnh/f;->u(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1, v1}, Lnh/f;->J(Ljava/io/OutputStream;I)Lnh/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v0}, Lnh/f;->o0(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, p1}, Lnh/q;->e(Lnh/f;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lnh/f;->I()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
