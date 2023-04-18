.class public final Lsg/r;
.super Lsg/t;
.source "SourceFile"

# interfaces
.implements Lch/n;


# instance fields
.field private final a:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    .line 1
    const-string v0, "member"

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
    iput-object p1, p0, Lsg/r;->a:Ljava/lang/reflect/Field;

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
.method public F()Z
    .locals 1

    invoke-virtual {p0}, Lsg/r;->S()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    move-result v0

    return v0
.end method

.method public N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic Q()Ljava/lang/reflect/Member;
    .locals 1

    invoke-virtual {p0}, Lsg/r;->S()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public S()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, Lsg/r;->a:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public T()Lsg/z;
    .locals 3

    sget-object v0, Lsg/z;->a:Lsg/z$a;

    invoke-virtual {p0}, Lsg/r;->S()Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "member.genericType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lsg/z$a;->a(Ljava/lang/reflect/Type;)Lsg/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getType()Lch/x;
    .locals 1

    invoke-virtual {p0}, Lsg/r;->T()Lsg/z;

    move-result-object v0

    return-object v0
.end method
