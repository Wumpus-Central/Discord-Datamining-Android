.class public final Lw/p0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lw/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw/n0$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lw/n0$a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lw/n0$a;->h()Lw/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lw/p0$a;->a:Lw/n0;

    .line 14
    .line 15
    return-void
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
.method public a()Lw/n0;
    .locals 1

    iget-object v0, p0, Lw/p0$a;->a:Lw/n0;

    return-object v0
.end method

.method public getId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
