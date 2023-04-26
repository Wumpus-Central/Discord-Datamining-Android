.class public Lcom/facebook/hermes/intl/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/a;


# instance fields
.field private a:Ljava/text/RuleBasedCollator;

.field private b:Lcom/facebook/hermes/intl/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

    invoke-virtual {v0, p1, p2}, Ljava/text/RuleBasedCollator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public b()Lcom/facebook/hermes/intl/a$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

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
    invoke-virtual {v0}, Ljava/text/Collator;->getStrength()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->k:Lcom/facebook/hermes/intl/a$c;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->l:Lcom/facebook/hermes/intl/a$c;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_2
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->n:Lcom/facebook/hermes/intl/a$c;

    .line 24
    .line 25
    return-object v0
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
.end method

.method public c(Lg5/b;)Lcom/facebook/hermes/intl/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Lcom/facebook/hermes/intl/a;"
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/facebook/hermes/intl/h;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/facebook/hermes/intl/l;->b:Lcom/facebook/hermes/intl/h;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/hermes/intl/h;->m()Ljava/util/Locale;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/text/RuleBasedCollator;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

    .line 16
    .line 17
    return-object p0
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
.end method

.method public d(Z)Lcom/facebook/hermes/intl/a;
    .locals 0

    return-object p0
.end method

.method public e(Lcom/facebook/hermes/intl/a$b;)Lcom/facebook/hermes/intl/a;
    .locals 0

    return-object p0
.end method

.method public f(Z)Lcom/facebook/hermes/intl/a;
    .locals 0

    return-object p0
.end method

.method public g(Lcom/facebook/hermes/intl/a$c;)Lcom/facebook/hermes/intl/a;
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/l$a;->a:[I

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
    const/4 v1, 0x3

    .line 17
    if-eq p1, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-eq p1, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/text/Collator;->setStrength(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p1, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/text/Collator;->setStrength(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object p1, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    iget-object p1, p0, Lcom/facebook/hermes/intl/l;->a:Ljava/text/RuleBasedCollator;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/text/Collator;->setStrength(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-object p0
.end method
