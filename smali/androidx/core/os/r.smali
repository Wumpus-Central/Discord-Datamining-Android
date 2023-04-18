.class final Landroidx/core/os/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/os/n;


# instance fields
.field private final a:Landroid/os/LocaleList;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Landroid/os/LocaleList;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/core/os/r;->a:Landroid/os/LocaleList;

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
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/core/os/r;->a:Landroid/os/LocaleList;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/os/r;->a:Landroid/os/LocaleList;

    check-cast p1, Landroidx/core/os/n;

    invoke-interface {p1}, Landroidx/core/os/n;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/appcompat/app/f;->a(Landroid/os/LocaleList;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Landroidx/core/os/r;->a:Landroid/os/LocaleList;

    invoke-static {v0, p1}, Landroidx/core/os/o;->a(Landroid/os/LocaleList;I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/core/os/r;->a:Landroid/os/LocaleList;

    invoke-static {v0}, Landroidx/core/os/p;->a(Landroid/os/LocaleList;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/core/os/r;->a:Landroid/os/LocaleList;

    invoke-static {v0}, Landroidx/core/os/q;->a(Landroid/os/LocaleList;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
