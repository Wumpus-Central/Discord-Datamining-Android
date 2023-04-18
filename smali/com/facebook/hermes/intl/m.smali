.class public Lcom/facebook/hermes/intl/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/a;


# instance fields
.field private a:Landroid/icu/text/RuleBasedCollator;


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
    iput-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

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
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    invoke-static {v0, p1, p2}, Lg5/f0;->a(Landroid/icu/text/RuleBasedCollator;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public b()Lcom/facebook/hermes/intl/a$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->o:Lcom/facebook/hermes/intl/a$c;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-static {v0}, Lg5/d0;->a(Landroid/icu/text/RuleBasedCollator;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 15
    .line 16
    invoke-static {v0}, Lg5/e0;->a(Landroid/icu/text/RuleBasedCollator;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->m:Lcom/facebook/hermes/intl/a$c;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->k:Lcom/facebook/hermes/intl/a$c;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    const/4 v1, 0x1

    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->l:Lcom/facebook/hermes/intl/a$c;

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_3
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->n:Lcom/facebook/hermes/intl/a$c;

    .line 35
    .line 36
    return-object v0
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
.end method

.method public c(Lcom/facebook/hermes/intl/a$b;)Lcom/facebook/hermes/intl/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/m$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 16
    .line 17
    invoke-static {p1}, Lg5/c0;->a(Landroid/icu/text/RuleBasedCollator;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lg5/b0;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lg5/y;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-object p0
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
.end method

.method public d(Z)Lcom/facebook/hermes/intl/a;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lg5/i;->e(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p1, v0}, Lg5/a0;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    :cond_0
    return-object p0
.end method

.method public e(Lg5/b;)Lcom/facebook/hermes/intl/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Lcom/facebook/hermes/intl/a;"
        }
    .end annotation

    .line 1
    check-cast p1, Lg5/x;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg5/x;->m()Landroid/icu/util/ULocale;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lg5/g0;->a(Landroid/icu/util/ULocale;)Landroid/icu/text/Collator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/icu/text/RuleBasedCollator;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 14
    .line 15
    const/16 v0, 0x11

    .line 16
    .line 17
    invoke-static {p1, v0}, Lg5/h0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 18
    .line 19
    .line 20
    return-object p0
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
.end method

.method public f(Lcom/facebook/hermes/intl/a$c;)Lcom/facebook/hermes/intl/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/m$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq p1, v1, :cond_3

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq p1, v2, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq p1, v3, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 24
    .line 25
    invoke-static {p1, v2}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 35
    .line 36
    invoke-static {p1, v1}, Lg5/z;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 41
    .line 42
    invoke-static {p1, v1}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 47
    .line 48
    invoke-static {p1, v0}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-object p0
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
.end method

.method public g(Z)Lcom/facebook/hermes/intl/a;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lg5/i0;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    :cond_0
    return-object p0
.end method
