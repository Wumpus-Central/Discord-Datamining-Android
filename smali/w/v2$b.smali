.class final Lw/v2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lw/k2;

.field private b:Z

.field private c:Z


# direct methods
.method constructor <init>(Lw/k2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lw/v2$b;->b:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lw/v2$b;->c:Z

    .line 8
    .line 9
    iput-object p1, p0, Lw/v2$b;->a:Lw/k2;

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
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-boolean v0, p0, Lw/v2$b;->c:Z

    return v0
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Lw/v2$b;->b:Z

    return v0
.end method

.method c()Lw/k2;
    .locals 1

    iget-object v0, p0, Lw/v2$b;->a:Lw/k2;

    return-object v0
.end method

.method d(Z)V
    .locals 0

    iput-boolean p1, p0, Lw/v2$b;->c:Z

    return-void
.end method

.method e(Z)V
    .locals 0

    iput-boolean p1, p0, Lw/v2$b;->b:Z

    return-void
.end method
