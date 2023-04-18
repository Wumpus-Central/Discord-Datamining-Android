.class public final Lsg/y;
.super Lsg/t;
.source "SourceFile"

# interfaces
.implements Lch/w;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "recordComponent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lsg/t;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lsg/y;->a:Ljava/lang/Object;

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
.end method


# virtual methods
.method public Q()Ljava/lang/reflect/Member;
    .locals 2

    .line 1
    sget-object v0, Lsg/a;->a:Lsg/a;

    .line 2
    .line 3
    iget-object v1, p0, Lsg/y;->a:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lsg/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/NoSuchMethodError;

    .line 13
    .line 14
    const-string v1, "Can\'t find `getAccessor` method"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getType()Lch/x;
    .locals 2

    .line 1
    sget-object v0, Lsg/a;->a:Lsg/a;

    .line 2
    .line 3
    iget-object v1, p0, Lsg/y;->a:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lsg/a;->d(Ljava/lang/Object;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lsg/n;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lsg/n;-><init>(Ljava/lang/reflect/Type;)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/NoSuchMethodError;

    .line 18
    .line 19
    const-string v1, "Can\'t find `getType` method"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method
