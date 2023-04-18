.class public abstract Lcd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcd/h;


# direct methods
.method protected constructor <init>(Lcd/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcd/b;->a:Lcd/h;

    .line 5
    .line 6
    return-void
    .line 7
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
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public abstract a(Lcd/h;)Lcd/b;
.end method

.method public abstract b()Lgd/b;
.end method

.method public abstract c(ILgd/a;)Lgd/a;
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lcd/b;->a:Lcd/h;

    invoke-virtual {v0}, Lcd/h;->a()I

    move-result v0

    return v0
.end method

.method public final e()Lcd/h;
    .locals 1

    iget-object v0, p0, Lcd/b;->a:Lcd/h;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lcd/b;->a:Lcd/h;

    invoke-virtual {v0}, Lcd/h;->d()I

    move-result v0

    return v0
.end method
