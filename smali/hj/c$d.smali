.class public final Lhj/c$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final n:Lfj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/c<",
            "Lnet/time4j/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lfj/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/x<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lfj/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/x<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Locale;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhj/i;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lhj/b;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;

.field private j:Lnet/time4j/k;

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lfj/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/x<",
            "*>;"
        }
    .end annotation
.end field

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "CUSTOM_DAY_PERIOD"

    .line 2
    .line 3
    const-class v1, Lnet/time4j/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgj/a;->e(Ljava/lang/String;Ljava/lang/Class;)Lfj/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lhj/c$d;->n:Lfj/c;

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

.method private constructor <init>(Lfj/x;Ljava/util/Locale;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "TT;>;",
            "Ljava/util/Locale;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lhj/c$d;-><init>(Lfj/x;Ljava/util/Locale;Lfj/x;)V

    return-void
.end method

.method private constructor <init>(Lfj/x;Ljava/util/Locale;Lfj/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "TT;>;",
            "Ljava/util/Locale;",
            "Lfj/x<",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 4
    iput-object p1, p0, Lhj/c$d;->a:Lfj/x;

    .line 5
    iput-object p3, p0, Lhj/c$d;->b:Lfj/x;

    .line 6
    iput-object p2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 7
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 8
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    const/4 p2, 0x0

    .line 9
    iput p2, p0, Lhj/c$d;->f:I

    const/4 p3, -0x1

    .line 10
    iput p3, p0, Lhj/c$d;->g:I

    .line 11
    iput p2, p0, Lhj/c$d;->h:I

    const/4 p3, 0x0

    .line 12
    iput-object p3, p0, Lhj/c$d;->i:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lhj/c$d;->j:Lnet/time4j/k;

    .line 14
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lhj/c$d;->k:Ljava/util/Map;

    .line 15
    iput-object p1, p0, Lhj/c$d;->l:Lfj/x;

    .line 16
    iput p2, p0, Lhj/c$d;->m:I

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing locale."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing chronology."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lfj/x;Ljava/util/Locale;Lhj/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lhj/c$d;-><init>(Lfj/x;Ljava/util/Locale;)V

    return-void
.end method

.method private H(Lfj/p;)Lhj/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)",
            "Lhj/i;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lhj/i;

    .line 25
    .line 26
    :goto_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lhj/i;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0}, Lhj/i;->i()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, " can\'t be inserted after an element"

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p1, " with decimal digits."

    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_3
    :goto_1
    return-object v0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private static I(Lfj/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lfj/c;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x5f

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "Internal attribute not allowed: "

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Lfj/c;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private J(Lfj/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    .line 2
    .line 3
    iget-object v1, p0, Lhj/c$d;->b:Lfj/x;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lhj/c;->c(Lfj/x;Lfj/x;Lfj/p;)Lfj/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    .line 10
    .line 11
    iget-object v1, p0, Lhj/c$d;->b:Lfj/x;

    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lhj/c;->d(Lfj/x;Lfj/x;Lfj/x;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lhj/c$d;->m:I

    .line 18
    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    iput-object p1, p0, Lhj/c$d;->l:Lfj/x;

    .line 22
    .line 23
    iput v0, p0, Lhj/c$d;->m:I

    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
.end method

.method private K()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    .line 2
    .line 3
    invoke-static {v0}, Lhj/c$d;->R(Lfj/x;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\"."

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private M()V
    .locals 3

    .line 1
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lhj/i;

    .line 18
    .line 19
    invoke-virtual {v1}, Lhj/i;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {v1}, Lhj/i;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    const-string v1, "Cannot define more than one element with decimal digits."

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_2
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private N(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhj/c$d;->M()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    iget p1, p0, Lhj/c$d;->g:I

    .line 9
    .line 10
    const/4 p2, -0x1

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string p2, "Cannot add fractional element with variable width after another numerical element with variable width."

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    return-void
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
.end method

.method private O(ZLnet/time4j/k;)Lgj/t;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lnet/time4j/k;",
            ")",
            "Lgj/t<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lgj/a$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhj/c$d;->P()Lfj/x;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lgj/a$b;-><init>(Lfj/x;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lgj/a$b;->a()Lgj/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lhj/b;

    .line 25
    .line 26
    iget-object v2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Lhj/b;

    .line 40
    .line 41
    :goto_0
    sget-object v0, Lhj/c$d;->n:Lfj/c;

    .line 42
    .line 43
    invoke-virtual {v1, v0, p2}, Lhj/b;->m(Lfj/c;Ljava/lang/Object;)Lhj/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    invoke-static {}, Lnet/time4j/g0;->l0()Lfj/h0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2}, Lfj/x;->s()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lfj/s;

    .line 70
    .line 71
    iget-object v2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 72
    .line 73
    invoke-interface {v1, v2, v0}, Lfj/s;->a(Ljava/util/Locale;Lfj/d;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Lfj/p;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-interface {v2}, Lfj/p;->b()C

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/16 v4, 0x62

    .line 100
    .line 101
    if-ne v3, v4, :cond_4

    .line 102
    .line 103
    invoke-direct {p0, v2}, Lhj/c$d;->S(Lfj/p;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    invoke-static {v2}, Lhj/c;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Lgj/t;

    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_4
    if-nez p1, :cond_3

    .line 117
    .line 118
    invoke-interface {v2}, Lfj/p;->b()C

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/16 v4, 0x42

    .line 123
    .line 124
    if-ne v3, v4, :cond_3

    .line 125
    .line 126
    invoke-direct {p0, v2}, Lhj/c$d;->S(Lfj/p;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    invoke-static {v2}, Lhj/c;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lgj/t;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    new-instance p2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v0, "Day periods are not supported: "

    .line 147
    .line 148
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lhj/c$d;->P()Lfj/x;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Lfj/x;->q()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private static Q(Lhj/b;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Lhj/b;->g()I

    move-result p0

    return p0
.end method

.method private static R(Lfj/x;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    :cond_0
    invoke-virtual {p0}, Lfj/x;->q()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lnet/time4j/base/f;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_1
    invoke-virtual {p0}, Lfj/x;->d()Lfj/x;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private S(Lfj/p;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "_DAY_PERIOD"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object v0, p0, Lhj/c$d;->b:Lfj/x;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lfj/x;->y(Lfj/p;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0}, Lfj/x;->d()Lfj/x;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lfj/x;->y(Lfj/p;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    return v1

    .line 44
    :cond_3
    return v2
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private static T(C)Z
    .locals 1

    const/16 v0, 0x41

    if-lt p0, v0, :cond_0

    const/16 v0, 0x5a

    if-le p0, v0, :cond_1

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_2

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private V()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhj/c$d;->h:I

    return-void
.end method

.method static synthetic a(Lhj/c$d;Lhj/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lhj/c$d;->w(Lhj/h;)V

    return-void
.end method

.method static synthetic b(Lhj/c$d;)Lfj/x;
    .locals 0

    iget-object p0, p0, Lhj/c$d;->a:Lfj/x;

    return-object p0
.end method

.method static synthetic c(Lfj/x;)Z
    .locals 0

    invoke-static {p0}, Lhj/c$d;->R(Lfj/x;)Z

    move-result p0

    return p0
.end method

.method private o(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lhj/c$d;->n(Ljava/lang/String;)Lhj/c$d;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method private s(Lfj/p;ZIILhj/x;)Lhj/c$d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;ZII",
            "Lhj/x;",
            ")",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lhj/c$d;->t(Lfj/p;ZIILhj/x;Z)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method private t(Lfj/p;ZIILhj/x;Z)Lhj/c$d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;ZII",
            "Lhj/x;",
            "Z)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lhj/c$d;->J(Lfj/p;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lhj/c$d;->H(Lfj/p;)Lhj/i;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v8, Lhj/r;

    .line 9
    .line 10
    move-object v1, v8

    .line 11
    move-object v2, p1

    .line 12
    move v3, p2

    .line 13
    move v4, p3

    .line 14
    move v5, p4

    .line 15
    move-object v6, p5

    .line 16
    move v7, p6

    .line 17
    invoke-direct/range {v1 .. v7}, Lhj/r;-><init>(Lfj/p;ZIILhj/x;Z)V

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget p1, p0, Lhj/c$d;->g:I

    .line 23
    .line 24
    const/4 p2, -0x1

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    invoke-direct {p0, v8}, Lhj/c$d;->w(Lhj/h;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object p2, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Lhj/i;

    .line 38
    .line 39
    invoke-direct {p0, v8}, Lhj/c$d;->w(Lhj/h;)V

    .line 40
    .line 41
    .line 42
    iget-object p4, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result p5

    .line 48
    add-int/lit8 p5, p5, -0x1

    .line 49
    .line 50
    invoke-interface {p4, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    check-cast p4, Lhj/i;

    .line 55
    .line 56
    invoke-virtual {p2}, Lhj/i;->f()I

    .line 57
    .line 58
    .line 59
    move-result p5

    .line 60
    invoke-virtual {p4}, Lhj/i;->f()I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    if-ne p5, p4, :cond_4

    .line 65
    .line 66
    iput p1, p0, Lhj/c$d;->g:I

    .line 67
    .line 68
    iget-object p4, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {p2, p3}, Lhj/i;->t(I)Lhj/i;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {p4, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0}, Lhj/i;->j()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, Lhj/i;->i()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string p2, "Numerical element with variable width can\'t be inserted after another numerical element. Consider \"addFixedXXX()\" instead."

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_3
    :goto_0
    invoke-direct {p0, v8}, Lhj/c$d;->w(Lhj/h;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    add-int/lit8 p1, p1, -0x1

    .line 111
    .line 112
    iput p1, p0, Lhj/c$d;->g:I

    .line 113
    .line 114
    :cond_4
    :goto_1
    return-object p0
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
.end method

.method private w(Lhj/h;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/h<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lhj/c$d;->g:I

    .line 3
    .line 4
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lhj/b;

    .line 20
    .line 21
    invoke-virtual {v0}, Lhj/b;->g()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v0}, Lhj/b;->i()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    move v2, v1

    .line 32
    move v3, v2

    .line 33
    :goto_0
    new-instance v4, Lhj/i;

    .line 34
    .line 35
    invoke-direct {v4, p1, v2, v3, v0}, Lhj/i;-><init>(Lhj/h;IILhj/b;)V

    .line 36
    .line 37
    .line 38
    iget p1, p0, Lhj/c$d;->h:I

    .line 39
    .line 40
    if-lez p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v4, p1, v1}, Lhj/i;->n(II)Lhj/i;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iput v1, p0, Lhj/c$d;->h:I

    .line 47
    .line 48
    :cond_1
    iget-object p1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public A(Lgj/t;)Lhj/c$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/t<",
            "*>;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lhj/c$d;->J(Lfj/p;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lhj/a0;->a(Lgj/t;)Lhj/a0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1}, Lhj/c$d;->w(Lhj/h;)V

    .line 9
    .line 10
    .line 11
    return-object p0
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

.method public B()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    .line 2
    .line 3
    invoke-static {v0}, Lhj/c$d;->R(Lfj/x;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lhj/c0;->k:Lhj/c0;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "Only unix timestamps can have a timezone id."

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
    .line 23
    .line 24
.end method

.method public C(Lgj/e;ZLjava/util/List;)Lhj/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/e;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhj/e0;

    invoke-direct {v0, p1, p2, p3}, Lhj/e0;-><init>(Lgj/e;ZLjava/util/List;)V

    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    return-object p0
.end method

.method public D(Lfj/p;)Lhj/c$d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lhj/c$d;->J(Lfj/p;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lhj/c$d;->H(Lfj/p;)Lhj/i;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lhj/f0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lhj/f0;-><init>(Lfj/p;)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Lhj/c$d;->g:I

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/lit8 p1, p1, -0x1

    .line 27
    .line 28
    iput p1, p0, Lhj/c$d;->g:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lhj/i;

    .line 38
    .line 39
    sget-object v2, Lgj/a;->f:Lfj/c;

    .line 40
    .line 41
    sget-object v3, Lgj/g;->k:Lgj/g;

    .line 42
    .line 43
    invoke-virtual {p0, v2, v3}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lhj/i;

    .line 65
    .line 66
    invoke-virtual {v1}, Lhj/i;->f()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v0}, Lhj/i;->f()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-ne v2, v0, :cond_1

    .line 75
    .line 76
    iput p1, p0, Lhj/c$d;->g:I

    .line 77
    .line 78
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 79
    .line 80
    const/4 v2, 0x2

    .line 81
    invoke-virtual {v1, v2}, Lhj/i;->t(I)Lhj/i;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_1
    :goto_0
    return-object p0
    .line 89
    .line 90
.end method

.method E(Lfj/p;IZ)Lhj/c$d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;IZ)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lhj/i;

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Lhj/i;->i()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Lhj/i;->j()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    if-eq p2, v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v3, 0x1

    .line 44
    const/4 v4, 0x4

    .line 45
    const/4 v5, 0x4

    .line 46
    sget-object v6, Lhj/x;->k:Lhj/x;

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    move-object v2, p1

    .line 50
    move v7, p3

    .line 51
    invoke-direct/range {v1 .. v7}, Lhj/c$d;->t(Lfj/p;ZIILhj/x;Z)Lhj/c$d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_2
    :goto_1
    const/4 v2, 0x0

    .line 57
    const/16 v4, 0xa

    .line 58
    .line 59
    sget-object v5, Lhj/x;->l:Lhj/x;

    .line 60
    .line 61
    move-object v0, p0

    .line 62
    move-object v1, p1

    .line 63
    move v3, p2

    .line 64
    move v6, p3

    .line 65
    invoke-direct/range {v0 .. v6}, Lhj/c$d;->t(Lfj/p;ZIILhj/x;Z)Lhj/c$d;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method public F()Lhj/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lgj/a;->f()Lgj/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhj/c$d;->G(Lgj/a;)Lhj/c;

    move-result-object v0

    return-object v0
.end method

.method public G(Lgj/a;)Lhj/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/a;",
            ")",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v9, 0x0

    .line 11
    move v2, v1

    .line 12
    move-object v3, v9

    .line 13
    :goto_0
    if-ge v2, v0, :cond_5

    .line 14
    .line 15
    iget-object v4, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lhj/i;

    .line 22
    .line 23
    invoke-virtual {v4}, Lhj/i;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_4

    .line 28
    .line 29
    invoke-virtual {v4}, Lhj/i;->f()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    add-int/lit8 v6, v0, -0x1

    .line 34
    .line 35
    :goto_1
    if-le v6, v2, :cond_2

    .line 36
    .line 37
    iget-object v7, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Lhj/i;

    .line 44
    .line 45
    invoke-virtual {v7}, Lhj/i;->f()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-ne v7, v5, :cond_1

    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    new-instance v3, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v4, v6}, Lhj/i;->m(I)Lhj/i;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    add-int/lit8 v6, v6, -0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v4, v1

    .line 75
    :goto_2
    if-eqz v4, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "Missing format processor after or-operator."

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    if-eqz v3, :cond_6

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/lang/Integer;

    .line 110
    .line 111
    iget-object v2, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {v2, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    new-instance v10, Lhj/c;

    .line 126
    .line 127
    iget-object v1, p0, Lhj/c$d;->a:Lfj/x;

    .line 128
    .line 129
    iget-object v2, p0, Lhj/c$d;->b:Lfj/x;

    .line 130
    .line 131
    iget-object v3, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 132
    .line 133
    iget-object v4, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 134
    .line 135
    iget-object v5, p0, Lhj/c$d;->k:Ljava/util/Map;

    .line 136
    .line 137
    iget-object v7, p0, Lhj/c$d;->l:Lfj/x;

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    move-object v0, v10

    .line 141
    move-object v6, p1

    .line 142
    invoke-direct/range {v0 .. v8}, Lhj/c;-><init>(Lfj/x;Lfj/x;Ljava/util/Locale;Ljava/util/List;Ljava/util/Map;Lgj/a;Lfj/x;Lhj/c$a;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lhj/c$d;->i:Ljava/lang/String;

    .line 146
    .line 147
    if-nez v0, :cond_7

    .line 148
    .line 149
    const-string v0, ""

    .line 150
    .line 151
    :cond_7
    iget-object v1, p0, Lhj/c$d;->j:Lnet/time4j/k;

    .line 152
    .line 153
    if-nez v1, :cond_8

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_b

    .line 160
    .line 161
    :cond_8
    invoke-static {v10}, Lhj/c;->e(Lhj/c;)Lhj/b;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_9

    .line 170
    .line 171
    sget-object v2, Lgj/a;->x:Lfj/c;

    .line 172
    .line 173
    invoke-virtual {v1, v2, v0}, Lhj/b;->m(Lfj/c;Ljava/lang/Object;)Lhj/b;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    :cond_9
    iget-object v0, p0, Lhj/c$d;->j:Lnet/time4j/k;

    .line 178
    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    sget-object v2, Lhj/c$d;->n:Lfj/c;

    .line 182
    .line 183
    invoke-virtual {v1, v2, v0}, Lhj/b;->m(Lfj/c;Ljava/lang/Object;)Lhj/b;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :cond_a
    new-instance v0, Lhj/c;

    .line 188
    .line 189
    invoke-direct {v0, v10, v1, v9}, Lhj/c;-><init>(Lhj/c;Lhj/b;Lhj/c$a;)V

    .line 190
    .line 191
    .line 192
    move-object v10, v0

    .line 193
    :cond_b
    return-object v10

    .line 194
    :cond_c
    new-instance v0, Ljava/lang/NullPointerException;

    .line 195
    .line 196
    const-string v1, "Missing format attributes."

    .line 197
    .line 198
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public L()Lhj/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lhj/c$d;->V()V

    .line 7
    .line 8
    .line 9
    return-object p0
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

.method public P()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lhj/c$d;->b:Lfj/x;

    if-nez v0, :cond_0

    iget-object v0, p0, Lhj/c$d;->a:Lfj/x;

    :cond_0
    return-object v0
.end method

.method public U()Lhj/c$d;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lhj/b;

    .line 16
    .line 17
    invoke-virtual {v0}, Lhj/b;->i()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, -0x1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    iget-object v3, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lhj/i;

    .line 47
    .line 48
    invoke-virtual {v3}, Lhj/i;->f()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v3, 0x0

    .line 54
    move v1, v2

    .line 55
    move v4, v1

    .line 56
    :goto_1
    if-ne v0, v4, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v3}, Lhj/i;->v()Lhj/i;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lhj/c$d;->V()V

    .line 68
    .line 69
    .line 70
    iput v2, p0, Lhj/c$d;->g:I

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v1, "Cannot start or-block without any previous step in current section."

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public W(Lfj/n;I)Lhj/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/n<",
            "Ljava/lang/Character;",
            ">;I)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhj/y;

    invoke-direct {v0, p1, p2}, Lhj/y;-><init>(Lfj/n;I)V

    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    return-object p0
.end method

.method public X()Lhj/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhj/c$d;->Y(Lfj/n;)Lhj/c$d;

    move-result-object v0

    return-object v0
.end method

.method public Y(Lfj/n;)Lhj/c$d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/n<",
            "Lfj/o;",
            ">;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lhj/c$d;->V()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lgj/a$b;

    .line 5
    .line 6
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lhj/b;

    .line 24
    .line 25
    invoke-virtual {v1}, Lhj/b;->e()Lgj/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lhj/b;->f()Lfj/n;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    move-object v2, v1

    .line 39
    :goto_0
    invoke-static {v1}, Lhj/c$d;->Q(Lhj/b;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/lit8 v6, v1, 0x1

    .line 44
    .line 45
    iget v1, p0, Lhj/c$d;->f:I

    .line 46
    .line 47
    add-int/lit8 v7, v1, 0x1

    .line 48
    .line 49
    iput v7, p0, Lhj/c$d;->f:I

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    move-object v8, p1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance v1, Lhj/c$d$a;

    .line 58
    .line 59
    invoke-direct {v1, p0, v2, p1}, Lhj/c$d$a;-><init>(Lhj/c$d;Lfj/n;Lfj/n;)V

    .line 60
    .line 61
    .line 62
    move-object v8, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object v8, v2

    .line 65
    :goto_1
    new-instance p1, Lhj/b;

    .line 66
    .line 67
    invoke-virtual {v0}, Lgj/a$b;->a()Lgj/a;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object v5, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 72
    .line 73
    move-object v3, p1

    .line 74
    invoke-direct/range {v3 .. v8}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;IILfj/n;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p0
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public Z(Lfj/c;C)Lhj/c$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "Ljava/lang/Character;",
            ">;C)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhj/c$d;->I(Lfj/c;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lhj/c$d;->V()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lgj/a$b;

    .line 16
    .line 17
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lhj/b;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lgj/a$b;->a()Lgj/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lhj/b;

    .line 43
    .line 44
    new-instance v1, Lgj/a$b;

    .line 45
    .line 46
    invoke-direct {v1}, Lgj/a$b;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lhj/b;->e()Lgj/a;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1, p2}, Lgj/a$b;->b(Lfj/c;C)Lgj/a$b;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lgj/a$b;->a()Lgj/a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Lhj/b;->l(Lgj/a;)Lhj/b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    iget-object p1, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object p0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public a0(Lfj/c;I)Lhj/c$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhj/c$d;->I(Lfj/c;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lhj/c$d;->V()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lgj/a$b;

    .line 16
    .line 17
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lhj/b;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lgj/a$b;->c(Lfj/c;I)Lgj/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lgj/a$b;->a()Lgj/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lhj/b;

    .line 43
    .line 44
    new-instance v1, Lgj/a$b;

    .line 45
    .line 46
    invoke-direct {v1}, Lgj/a$b;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lhj/b;->e()Lgj/a;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1, p2}, Lgj/a$b;->c(Lfj/c;I)Lgj/a$b;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lgj/a$b;->a()Lgj/a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Lhj/b;->l(Lgj/a;)Lhj/b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    iget-object p1, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object p0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Enum<",
            "TA;>;>(",
            "Lfj/c<",
            "TA;>;TA;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lhj/c$d;->I(Lfj/c;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lhj/c$d;->V()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lgj/a$b;

    .line 16
    .line 17
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lhj/b;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lgj/a$b;->a()Lgj/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2}, Lhj/b;-><init>(Lgj/a;Ljava/util/Locale;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lhj/b;

    .line 43
    .line 44
    new-instance v1, Lgj/a$b;

    .line 45
    .line 46
    invoke-direct {v1}, Lgj/a$b;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lhj/b;->e()Lgj/a;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1, p2}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lgj/a$b;->a()Lgj/a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Lhj/b;->l(Lgj/a;)Lhj/b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    iget-object p1, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object p0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public d(Lfj/p;Lhj/e;Lhj/d;)Lhj/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;",
            "Lhj/e<",
            "TV;>;",
            "Lhj/d<",
            "TV;>;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lhj/c$d;->J(Lfj/p;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhj/f;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3}, Lhj/f;-><init>(Lfj/p;Lhj/e;Lhj/d;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 10
    .line 11
    .line 12
    return-object p0
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method public e()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lhj/c$d;->O(ZLnet/time4j/k;)Lgj/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public f()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lhj/c$d;->O(ZLnet/time4j/k;)Lgj/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lhj/c$d;->A(Lgj/t;)Lhj/c$d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public g(Lfj/p;I)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x1

    sget-object v5, Lhj/x;->k:Lhj/x;

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lhj/c$d;->s(Lfj/p;ZIILhj/x;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public h(Lfj/p;I)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Enum<",
            "TV;>;>(",
            "Lfj/p<",
            "TV;>;I)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x1

    sget-object v5, Lhj/x;->k:Lhj/x;

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lhj/c$d;->s(Lfj/p;ZIILhj/x;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public i(Lfj/p;IIZ)Lhj/c$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;IIZ)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lhj/c$d;->J(Lfj/p;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    if-ne p2, p3, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-direct {p0, v1, p4}, Lhj/c$d;->N(ZZ)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lhj/j;

    .line 16
    .line 17
    invoke-direct {v2, p1, p2, p3, p4}, Lhj/j;-><init>(Lfj/p;IIZ)V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lhj/c$d;->g:I

    .line 21
    .line 22
    const/4 p3, -0x1

    .line 23
    if-eq p1, p3, :cond_1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object p3, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Lhj/i;

    .line 34
    .line 35
    invoke-direct {p0, v2}, Lhj/c$d;->w(Lhj/h;)V

    .line 36
    .line 37
    .line 38
    iget-object p4, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    sub-int/2addr v1, v0

    .line 45
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    check-cast p4, Lhj/i;

    .line 50
    .line 51
    invoke-virtual {p3}, Lhj/i;->f()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p4}, Lhj/i;->f()I

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    if-ne v0, p4, :cond_2

    .line 60
    .line 61
    iput p1, p0, Lhj/c$d;->g:I

    .line 62
    .line 63
    iget-object p4, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {p3, p2}, Lhj/i;->t(I)Lhj/i;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p4, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-direct {p0, v2}, Lhj/c$d;->w(Lhj/h;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    return-object p0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public j(Lfj/p;II)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;II)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x0

    sget-object v5, Lhj/x;->k:Lhj/x;

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lhj/c$d;->s(Lfj/p;ZIILhj/x;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public k(Lfj/p;IILhj/x;)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;II",
            "Lhj/x;",
            ")",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhj/c$d;->s(Lfj/p;ZIILhj/x;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public l(C)Lhj/c$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj/c$d;->n(Ljava/lang/String;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public m(CC)Lhj/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(CC)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhj/m;

    invoke-direct {v0, p1, p2}, Lhj/m;-><init>(CC)V

    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lhj/c$d;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhj/m;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lhj/m;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lhj/m;->b()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-lez p1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lhj/i;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Lhj/i;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Lhj/i;->i()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "Numerical literal can\'t be inserted after an element with decimal digits."

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    :goto_1
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iget v1, p0, Lhj/c$d;->g:I

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    if-ne v1, v2, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iget-object v2, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lhj/i;

    .line 74
    .line 75
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lhj/i;->f()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v3, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    add-int/lit8 v4, v4, -0x1

    .line 89
    .line 90
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Lhj/i;

    .line 95
    .line 96
    invoke-virtual {v3}, Lhj/i;->f()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-ne v0, v3, :cond_5

    .line 101
    .line 102
    iput v1, p0, Lhj/c$d;->g:I

    .line 103
    .line 104
    iget-object v0, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {v2, p1}, Lhj/i;->t(I)Lhj/i;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    :goto_2
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_3
    return-object p0
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public p()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhj/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhj/n;-><init>(Z)V

    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    return-object p0
.end method

.method public q(Lfj/p;IILhj/x;)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Long;",
            ">;II",
            "Lhj/x;",
            ")",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhj/c$d;->s(Lfj/p;ZIILhj/x;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public r()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lhj/c$d;->K()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhj/d0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lhj/d0;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 11
    .line 12
    .line 13
    return-object p0
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

.method public u(Lfj/p;II)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Enum<",
            "TV;>;>(",
            "Lfj/p<",
            "TV;>;II)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x0

    sget-object v5, Lhj/x;->k:Lhj/x;

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lhj/c$d;->s(Lfj/p;ZIILhj/x;)Lhj/c$d;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/String;Lhj/w;)Lhj/c$d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhj/w;",
            ")",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_12

    .line 2
    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lhj/c$d;->c:Ljava/util/Locale;

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v4, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lhj/c$d;->e:Ljava/util/LinkedList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lhj/b;

    .line 33
    .line 34
    invoke-virtual {v2}, Lhj/b;->h()Ljava/util/Locale;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_0
    const/4 v4, 0x0

    .line 39
    move v5, v4

    .line 40
    :goto_0
    if-ge v5, v1, :cond_e

    .line 41
    .line 42
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-static {v6}, Lhj/c$d;->T(C)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_4

    .line 51
    .line 52
    invoke-direct {p0, v3}, Lhj/c$d;->o(Ljava/lang/StringBuilder;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v7, v5, 0x1

    .line 56
    .line 57
    :goto_1
    if-ge v7, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-ne v8, v6, :cond_1

    .line 64
    .line 65
    add-int/lit8 v7, v7, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    sub-int v5, v7, v5

    .line 69
    .line 70
    invoke-virtual {p2, p0, v2, v6, v5}, Lhj/w;->A(Lhj/c$d;Ljava/util/Locale;CI)Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_3

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_2

    .line 85
    .line 86
    move-object v0, v5

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance v6, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-direct {v6, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v6, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 94
    .line 95
    .line 96
    move-object v0, v6

    .line 97
    :cond_3
    :goto_2
    add-int/lit8 v5, v7, -0x1

    .line 98
    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_4
    const-string v7, "\'"

    .line 102
    .line 103
    const/16 v8, 0x27

    .line 104
    .line 105
    if-ne v6, v8, :cond_9

    .line 106
    .line 107
    invoke-direct {p0, v3}, Lhj/c$d;->o(Ljava/lang/StringBuilder;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    move v6, v5

    .line 113
    :goto_3
    if-ge v6, v1, :cond_6

    .line 114
    .line 115
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-ne v9, v8, :cond_5

    .line 120
    .line 121
    add-int/lit8 v9, v6, 0x1

    .line 122
    .line 123
    if-ge v9, v1, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1, v9}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-ne v10, v8, :cond_6

    .line 130
    .line 131
    move v6, v9

    .line 132
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    if-ge v6, v1, :cond_8

    .line 136
    .line 137
    if-ne v5, v6, :cond_7

    .line 138
    .line 139
    invoke-virtual {p0, v8}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    invoke-virtual {p1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const-string v8, "\'\'"

    .line 148
    .line 149
    invoke-virtual {v5, v8, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {p0, v5}, Lhj/c$d;->n(Ljava/lang/String;)Lhj/c$d;

    .line 154
    .line 155
    .line 156
    :goto_4
    move v5, v6

    .line 157
    goto :goto_5

    .line 158
    :cond_8
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v1, "String literal in pattern not closed: "

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p2

    .line 181
    :cond_9
    const/16 v8, 0x5b

    .line 182
    .line 183
    if-ne v6, v8, :cond_a

    .line 184
    .line 185
    invoke-direct {p0, v3}, Lhj/c$d;->o(Ljava/lang/StringBuilder;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lhj/c$d;->X()Lhj/c$d;

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    const/16 v8, 0x5d

    .line 193
    .line 194
    if-ne v6, v8, :cond_b

    .line 195
    .line 196
    invoke-direct {p0, v3}, Lhj/c$d;->o(Ljava/lang/StringBuilder;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_b
    const/16 v8, 0x7c

    .line 204
    .line 205
    if-ne v6, v8, :cond_c

    .line 206
    .line 207
    :try_start_0
    invoke-direct {p0, v3}, Lhj/c$d;->o(Ljava/lang/StringBuilder;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Lhj/c$d;->U()Lhj/c$d;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :catch_0
    move-exception p1

    .line 215
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 216
    .line 217
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    throw p2

    .line 221
    :cond_c
    const/16 v8, 0x23

    .line 222
    .line 223
    if-eq v6, v8, :cond_d

    .line 224
    .line 225
    const/16 v8, 0x7b

    .line 226
    .line 227
    if-eq v6, v8, :cond_d

    .line 228
    .line 229
    const/16 v8, 0x7d

    .line 230
    .line 231
    if-eq v6, v8, :cond_d

    .line 232
    .line 233
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 241
    .line 242
    new-instance p2, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v0, "Pattern contains reserved character: \'"

    .line 248
    .line 249
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :cond_e
    invoke-direct {p0, v3}, Lhj/c$d;->o(Ljava/lang/StringBuilder;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-nez p2, :cond_10

    .line 274
    .line 275
    iget-object p2, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    :goto_6
    if-ge v4, p2, :cond_10

    .line 282
    .line 283
    iget-object v1, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 284
    .line 285
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Lhj/i;

    .line 290
    .line 291
    invoke-virtual {v1}, Lhj/i;->d()Lhj/h;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-interface {v2}, Lhj/h;->c()Lfj/p;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_f

    .line 304
    .line 305
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    check-cast v2, Lfj/p;

    .line 310
    .line 311
    iget-object v3, p0, Lhj/c$d;->d:Ljava/util/List;

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Lhj/i;->x(Lfj/p;)Lhj/i;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-interface {v3, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_10
    iget-object p2, p0, Lhj/c$d;->i:Ljava/lang/String;

    .line 324
    .line 325
    if-nez p2, :cond_11

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_11
    const-string p1, ""

    .line 329
    .line 330
    :goto_7
    iput-object p1, p0, Lhj/c$d;->i:Ljava/lang/String;

    .line 331
    .line 332
    return-object p0

    .line 333
    :cond_12
    new-instance p1, Ljava/lang/NullPointerException;

    .line 334
    .line 335
    const-string p2, "Missing pattern type."

    .line 336
    .line 337
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw p1
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
.end method

.method public x()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhj/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lhj/n;-><init>(Z)V

    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    return-object p0
.end method

.method public y()Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lhj/c$d;->K()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhj/d0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lhj/d0;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lhj/c$d;->w(Lhj/h;)V

    .line 11
    .line 12
    .line 13
    return-object p0
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

.method public z(Lfj/p;)Lhj/c$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Enum<",
            "TV;>;>(",
            "Lfj/p<",
            "TV;>;)",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lhj/c$d;->J(Lfj/p;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lgj/t;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-class v0, Lgj/t;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lgj/t;

    .line 15
    .line 16
    invoke-static {p1}, Lhj/a0;->a(Lgj/t;)Lhj/a0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lhj/c$d;->w(Lhj/h;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, [Ljava/lang/Enum;

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_0
    if-ge v3, v2, :cond_1

    .line 42
    .line 43
    aget-object v4, v1, v3

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v1, Lhj/o;

    .line 56
    .line 57
    invoke-direct {v1, p1, v0}, Lhj/o;-><init>(Lfj/p;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v1}, Lhj/c$d;->w(Lhj/h;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    return-object p0
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
